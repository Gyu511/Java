import java.util.*;
class ElevatorTest{
	public static void main(String [] args) throws Exception {
		int story;
		Scanner s = new Scanner(System.in);
		Elevator e = new Elevator();
		
		
		while(true){//Ż�� ctrl+c
			System.out.print("�������� �����? ");
			story=s.nextInt();
			if(story==0){
				System.out.println("0���� �����ϴ�.");
				continue;
			}
			else if(story==e.getStory()){
				System.out.printf("���� %d���Դϴ�.\n",story);
				continue;
			}
			else e.move(story);
		}
	}
}
class Elevator{
	private int story=1;
	
	int getStory(){
		return story;
	}
	
	void move(int story) throws Exception {
		System.out.println("���� �����ϴ�.");
		if(story>0){
			System.out.printf("%d������ �̵��մϴ�.\n",story);
			if(story>this.story){
				for(int i=this.story;i<=story;i++){
					if(i==0) continue;
					else if(i<0){
						System.out.print("B"+Math.abs(i)+" ");
						Thread.sleep(300);
					}
					else{
						System.out.print(i+" ");
						Thread.sleep(300);
					}
				}
			}
			else if(story<this.story){
				for(int i=this.story;i>=story;i--){
					if(i==0) continue;
					else if(i<0){
						System.out.print("B"+Math.abs(i));
						Thread.sleep(300);
					}
					else{
						System.out.print(i+" ");
						Thread.sleep(300);
					}
				}
			}
			System.out.println();
			System.out.printf("%d�� �Դϴ�.\n",story);
		}
		else if(story<0){
			System.out.printf("����%d������ �̵��մϴ�.\n",Math.abs(story));
			if(story>this.story){
				for(int i=this.story;i<=story;i++){
					if(i==0) continue;
					else if(i<0){
						System.out.print("B"+Math.abs(i)+" ");
						Thread.sleep(300);
					}
					else{
						System.out.print(i+" ");
						Thread.sleep(300);
					}
				}
			}
			else if(story<this.story){
				for(int i=this.story;i>=story;i--){
					if(i==0) continue;
					else if(i<0){
						System.out.print("B"+Math.abs(i)+" ");
						Thread.sleep(300);
					}
					else{
						System.out.print(i+" ");
						Thread.sleep(300);
					}
				}
			}
			System.out.println();
			System.out.printf("����%d�� �Դϴ�.\n",Math.abs(story));
		}
		System.out.println("���� �����ϴ�.");
		this.story=story;
	}
}