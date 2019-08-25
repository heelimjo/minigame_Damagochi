package damagochi;

import java.util.Scanner;

public class DamagochiStartDrawing extends DamagochiFunction {   //DamagochiStartDrawing class start
	   //화면넘기기 메소드
	   public static void screenClear() { //screenClear start
	      for (int i = 0; i < 50; i++)
	         System.out.println();
	   }//screenClear end
	   
	   // 제일 처음 나오는 화면
	   public static void damagochiStartDrawing() { //damagochiStartDrawing start


      System.out.print(
    		  " \n" + 
    		  "        ∧＿∧                \n" + 
    		  "      （｡･ω･｡)つ━☆・*。\n"
            + "      ⊂　 　 ノ 　　　・゜+.        　\n" + 
    		  "       しーＪ　   °。+ ¨)\n"
            + "                .· ´¸.·*´¨)   ¸.·*¨)\n" + 
    		  " 　　　               　(¸.·´       (¸.·'* ☆\n"
            + "　　　　　               　～❤   1. 불러오기       \n" + 
    		  "　　　　　                  　～❤   2. 새로만들기      \n"
            + "　　　　　　　                   ～❤   3. 캐릭터 삭제하기        \n"
            + "　　　　　　　　         　     　　　 ～❤   4. 종료하기     \n" + 
            "      (╭☞•́⍛•̀)╭☞숫자를 입력해주세요:"

            );

	   }//damagochiStartDrawing end

	   //다마고치의 상태를 나타내주는 상태바 메소드
	   public static void damagochiStatementDrawing(Damagochi d1) { //damagochiStatementDrawing start

	      int maxExp = 0; 
	      int maxLvl = 3;   

	      if (d1.getLevel() == 1) { //레벨 1일때 
	         maxExp = 10;      //맥스 경험치 10
	      }

	      else if (d1.getLevel() == 2) { //레벨 2일때 
	         maxExp = 30;         //맥스 경험치 30
	      }

	      else if (d1.getLevel() == 3) { //레벨 3일때 
	         maxExp = 50;   //맥스 경험치 50
	      }
	      
	      //다마고치의 상태바

      System.out.println("-------------------------------------------------------------------------------");
      System.out.println("|배고픔:" + d1.getHunger() + "/100" + "  피로도:" + d1.getFatigue() + "/100" + "  친밀도: "
            + d1.getIntimacy() + "/100" + "  경험치 : " + d1.getExperience() + "/" + maxExp + "  레벨 :"
            + d1.getLevel() + "/" + maxLvl + "  날짜 : " + d1.dDay + "| ");
      System.out.println("-------------------------------------------------------------------------------");

      if (d1.getExperience() >= maxExp && d1.getLevel() <= maxLvl) { // 경험치가 꽉 차고 최대레벨 3 밑이면 레벨업

          System.out.println("     ~~~~레벨업했습니다~~~");
          int level = d1.getLevel() + 1; //객체에 레벨+1을 레벨 변수에 담음
          d1.setLevel(level);      //다마고치객체에 다시 적용
          d1.setExperience(0); // 경험치 0으로 초기화
       }
    }//damagochiStatementDrawing end
    


//////////////////////////////////////////////다마고치 밥먹이기 드로잉///////////////////////////////////////////////////////////////////////
	   
//밥 먹이기 메뉴
	   public static void damagochiFeedDrawing() { // damagochiFeedDrawing start
      System.out.println("--------------------------------");
      System.out.println("|           1. 밥               |");
      System.out.println("--------------------------------");
      System.out.println("|           2. 사료              |");
      System.out.println("--------------------------------");
      System.out.println("|           3. 뒤로가기           |");
      System.out.println("--------------------------------");
      System.out.println("|           숫자를 입력하세요 ▼\t\t|");
   } // damagochiFeedDrawing end

   //다마고치 재우기 드로잉
	   public static void damagochiSleepDrawing() {   //damagochiSleepDrawing start
	  System.out.println("--------------------------------");
      System.out.println("|           1. 재우기            | ");
      System.out.println("--------------------------------");
      System.out.println("|           2. 뒤로가기           |");
      System.out.println("--------------------------------");
	   }   ////damagochiSleepDrawing end

	   public static void damagochiFuntionDrawing() { //damagochiFuntionDrawing start

      System.out.println("----------------------------------------");
      System.out.println("|           1. 밥주기                    |");
      System.out.println("----------------------------------------");
      System.out.println("|           2. 놀아주기                   |");
      System.out.println("----------------------------------------");
      System.out.println("|           3. 재우기                    |");
      System.out.println("----------------------------------------");
      System.out.println("|           4. 뒤로가기                   |");
      System.out.println("----------------------------------------");
      System.out.println("|           5. 상태업데이트                |");
      System.out.println("----------------------------------------");
      System.out.println("|           숫자를 입력하세요 ▼             |");
      System.out.println("----------------------------------------");

	   } //damagochiFuntionDrawing end


	   //미니게임 선택메뉴
	   public static void minigameStartDrawingPicture() { //minigameStartDrawingPicture start
	  System.out.println("-------------------------------");
      System.out.println("|           1. 가위바위보        | ");
      System.out.println("-------------------------------");
      System.out.println("|           2. 뒤로가기         |");
      System.out.println("-------------------------------");
	   } //minigameStartDrawingPicture end

	   //게임 끝났을때 보이는 화면
	   public static void endingDrawing() { //endingDrawing start
      System.out.println(
    		"*-*-**-*-**-*-**-*-*-**-*-**-*-**-*-*-**-*-**-*-**-*-*-**-*-**-*-**-\r\n" + 
            "*-*-**-*-**-*-**-*-*-**-*-**-*-**-*-*-**-*-**-*-**-*-*-**-*-**-*-**-\r\n" + 
            "*-*-**-*-**-*-**-*-*-**-*-**-*-**-*-*-**-*-**-*-**-*-*-**-*-**-*-**-\r\n" + 
            "*-*-**-*-**-*-**-*-*-*-**-*-*Game Over*-*-**-*-**-*-**--**-*-*-**-*\r\n" + 
            "*-*-**-*-**-*-**-*-*-**-*-**-*-**-*-*-**-*-**-*-**-*-*-**-*-**-*-**-\r\n" + 
            "*-*-**-*-**-*-**-*-*-**-*-**-*-**-*-*-**-*-**-*-**-*-*-**-*-**-*-**-\r\n" + 
            "*-*-**-*-**-*-**-*-*-**-*-**-*-**-*-*-**-*-**-*-**-*-*-**-*-**-*-**-\r\n" + 
            "*-*-**-*-**-*-**-*-*-**-*-**-*-**-*-*-**-*-**-*-**-*-*-**-*-**-*-**-");
	   }   ////endingDrawing end


	   //다마고치 메인메뉴 메소드
	   public static void damagochiRunning(Damagochi da1) { //damagochiRunning start

	      DamagochiDAO db = new DamagochiDAO();   //db 쿼리 클래스 객체화
	      DamagochiPicture damaFace = new DamagochiPicture(); //사진 클래스 객체화
	      Thread damaclock = new StartTimeStamp(da1);   //쓰레드 객체화
	      damaclock.start();      //쓰레드 시작
	      DamagochiStatementControl DSC = new DamagochiStatementControl();   //상태 컨트롤 클래스 객체화

	      Scanner sc = new Scanner(System.in);   //스캐너 객체화

	      while (true) { //while start

	    	   screenClear();
	           damagochiStatementDrawing(da1); // 상태창 출력
	           DSC.DamagochiStatementControl(da1);  //상태컨트롤 클래스에 다마고치 객체 넣음
	           if (da1.getLevel() < 4) {   //레벨 4미만
	              damaFace.damaBasicFace(da1); // 기본얼굴출력
	              damagochiFuntionDrawing(); // 기능메뉴출력
	           } else {   //레벨 3초과일시
	        	   damaclock.stop();
	              endingDrawing(); // 얼굴출력
	              System.out.println("만렙입니다 축하합니다. 이제 별나라로 펫을 보냅니다 작별인사 안녕~" + "\n5초후 처음화면으로 돌아갑니다.");
	              damagochiFuntionDrawing(); // 기능출력
	              try {
	                 Thread.sleep(5000);   //5초 대기
	              } catch (InterruptedException e) {
	                 e.printStackTrace();
	              }
	              String name = da1.getName(); //해당 다마고치객체를 name에 담음
	              db.deleteDamagochi(name); // 디비에서 삭제
	              screenClear(); // 스크린클리어
	              break;
	           }

	  ///////////////////////////////////////// 다마고치 죽으면 메인화면////////////////////////////////////////////////////

	           if ((da1.getIntimacy() <= 0 || da1.getHunger() >= 100) || da1.getFatigue() >= 100) { //친밀도 0이하 배고픔 0이하 피로도 100이상
	              //친밀도 0이하 배고픔 0이하 피로도 100이상일 경우
	              screenClear();   //화면 넘기기
	              System.out.println(
	              //죽은 그림

       

                        " ┏ⅲⅲⅲ┓\n" + 
                        "d ご¿ご b 저기요..\n" + 
                        " ┃\"ε \"┃ 그...\n" + 
                        " ┗┒  ┎┛ ..." 
                  );
            System.out.println(da1.getName()+"가 죽었습니다.");

            String name = da1.getName();
            db.deleteDamagochi(name); // 죽을애를 삭제
            System.out.println("메인화면으로 돌아갑니다.");
            damaclock.stop();

            try {
               Thread.sleep(1000);   //1초 대기
            } catch (InterruptedException e) {
               e.printStackTrace();
            }

            // DamagochiMain Damagochi = new DamagochiMain();
            // Damagochi.DamagochiMain();
            break; //메인화면
         }

////////////////////////////////////////// 다마고치 기능 실행화면//////////////////////////////////////////////////////////////

         String putFuntionNum = sc.next(); //사용자로부터 기능선택을 받음

         if (putFuntionNum.equals("1")) { //1번일 경우
            screenClear();         //화면 지우기
            damagochiFeed(da1); //밥먹이기 기능수행
            continue;
         }

         else if (putFuntionNum.equals("2")) { //2번일 경우
            screenClear();         //화면 지우기
            minigameStart(da1);      //미니게임기능수행
            continue;
         }

         else if (putFuntionNum.equals("3")) { //3번일 경우
            screenClear();               //화면지우기
            damagochiSleep(da1);         //재우기기능수행
            continue;
         }

         else if (putFuntionNum.equals("4")) {   //4번일 경우
            screenClear();               //화면 지우기
            db.saveDamagochi(da1); // 뒤로가서 메인화면가기전에 저장!
            damaclock.stop(); // 저장하면 시간 멈춤
            screenClear();         //화면지우기
            break;               //화면을 나감
         }

         else if (putFuntionNum.equals("5")) { //5번일 경우
            screenClear();         //화면지우기
            continue;         //상태 업데이트수행
         }

         else {
            System.out.println("잘못입력하셨습니다.");
            try {
               Thread.sleep(2000);   //2초대기
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
            continue;   //다시 수행

         }

      }//while end
   }////damagochiRunning end
}////DamagochiStartDrawing class end