import java.util.*;
class ElevatorTest{
	public static void main(String [] args) throws Exception {
		int story;
		Scanner s = new Scanner(System.in);
		Elevator e = new Elevator();
		
		
		while(true){//탈출 ctrl+c
			System.out.print("몇층으로 갈까요? ");
			story=s.nextInt();
			if(story==0){
				System.out.println("0층은 없습니다.");
				continue;
			}
			else if(story==e.getStory()){
				System.out.printf("현재 %d층입니다.\n",story);
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
		System.out.println("문이 닫힙니다.");
		if(story>0){
			System.out.printf("%d층으로 이동합니다.\n",story);
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
			System.out.printf("%d층 입니다.\n",story);
		}
		else if(story<0){
			System.out.printf("지하%d층으로 이동합니다.\n",Math.abs(story));
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
			System.out.printf("지하%d층 입니다.\n",Math.abs(story));
		}
		System.out.println("문이 열립니다.");
		this.story=story;
	}
}