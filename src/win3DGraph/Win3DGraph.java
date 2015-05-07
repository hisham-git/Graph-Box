package win3DGraph;

public class Win3DGraph {
	float x1, y1, x2, y2, r1, maxx, maxy;
	double deg;
	char ch;

	void interface()
	{		
	   maxx = getmaxx();
	   maxy = getmaxy();

	   setcolor(8);
	   rectangle(0,0,maxx,maxy); //border
	   setfillstyle(1,7);
	   floodfill(1,1,8);
	   setcolor(15);
	   line(1,1,maxx-1,1);
	   line(1,1,1,maxy-1);

	   setcolor(3);
	   rectangle(2,2,maxx-2,maxy-460); //Title Bar
	   setfillstyle(1,9);
	   floodfill(4,4,3);

	   setcolor(8);
	   bar3d(6,28,maxx-155,maxy-105,7,2); 	//graph box
	   setfillstyle(7,1);
	   floodfill(8,30,8);		//surface
	   setfillstyle(9,1);
	   floodfill(10,27,8);   	//up
	   floodfill(maxx-154,29,8);	//right

	   setcolor(8);
	   bar3d(maxx-143,28,maxx-10,(maxy-160)/2,7,2);  //object box
	   setfillstyle(1,5);
	   floodfill(maxx-142,29,8);    //surface
	   setfillstyle(9,5);
	   floodfill(maxx-136,24,8);     //up
	   floodfill(maxx-9,29,8);      //right

	   bar3d(maxx-143,(maxy-140)/2,maxx-10,maxy-155,7,2); //operation box
	   setfillstyle(1,6);
	   floodfill(maxx-142,((maxy-140)/2)+1,8);   //surface
	   setfillstyle(9,6);
	   floodfill(maxx-136,((maxy-140)/2)-4,8);   //up
	   floodfill(maxx-5,((maxy-140)/2),8);     //right

	   bar3d(maxx-143,maxy-145,maxx-10,maxy-70,7,2); //exit box
	   setfillstyle(1,3);
	   floodfill(maxx-142,(maxy-145)+1,8);   //surface
	   setfillstyle(9,3);
	   floodfill(maxx-136,(maxy-145)-1,8);   //up
	   floodfill(maxx-5,(maxy-145)+1,8);     //right

	   bar3d(maxx-143,maxy-60,maxx-10,maxy-6,7,2); //info box
	   setfillstyle(1,1);
	   floodfill(maxx-142,maxy-59,8);   //surface
	   setfillstyle(9,1);
	   floodfill(maxx-140,maxy-61,8);   //up
	   floodfill(maxx-5,maxy-11,8);     //right


	   rectangle(6,maxy-100,maxx-150,maxy-6); //input box
	   rectangle(7,maxy-99,maxx-151,maxy-7);
	   setfillstyle(1,0);
	   floodfill(8,maxy-98,8);

	   setcolor(15);
	   settextstyle(11,HORIZ_DIR,5);
	   outtextxy(10,7,"Graph Box");

	   setcolor(15);
	   settextstyle(11,HORIZ_DIR,10);
	   outtextxy((maxx-130),35,"OBJECT:");
	   outtextxy((maxx-130),45,"******");
	   outtextxy((maxx-130),180,"OPERATIONS:");
	   outtextxy((maxx-130),190,"**********");
	   setcolor(4);
	   outtextxy((maxx-130),350,"9.REFRESH");
	   outtextxy((maxx-130),370,"0.EXIT");

	   setcolor(15);
	   settextstyle(11,HORIZ_DIR,5);
	   outtextxy((maxx-130),60,"1.Point");
	   outtextxy((maxx-130),80,"2.Line");
	   outtextxy((maxx-130),100,"3.Rectangle");
	   outtextxy((maxx-130),120,"4.Circle");

	   settextstyle(2,HORIZ_DIR,4);
	   outtextxy((maxx-130),200,"5.Translation");
	   outtextxy((maxx-130),220,"6.Rotation");
	   outtextxy((maxx-130),240,"7.Scaling");
	   outtextxy((maxx-130),260,"8.Mirror Reflection");

	   setcolor(12);
	   settextstyle(11,HORIZ_DIR,10);               //to print the axis name
	   outtextxy(10,((maxy-150)/2)+20,"X'");
	   outtextxy(maxx-165,((maxy-150)/2)+20,"X");
	   outtextxy((maxx-150)/2-12,30,"Y");
	   outtextxy((maxx-150)/2+10,maxy-115,"Y'");

	   setcolor(14);
	   line(10,(maxy-78)/2,maxx-160,(maxy-78)/2); //horizontal line
	   line((maxx-150)/2,30,(maxx-150)/2,maxy-110); //vertical line

	   outtextxy(475,197,"\20");   // to print arrows
	   outtextxy(8,197,"\21");
	   outtextxy(241,367,"\37");
	   outtextxy(241,29,"\36");

	   for(int i=((maxx-182)/2); i>=5; i-=16)
	   {
		line(i,((maxy-78)/2)-3,i,((maxy-78)/2)+3); //horizontal division left
	   }
	   settextstyle(2,HORIZ_DIR,3);
	   outtextxy(223,205,"-1");
	   outtextxy(207,205,"-2");
	   outtextxy(191,205,"-3");     //left numbering
	   outtextxy(175,205,"-4");
	   outtextxy(159,205,"-5");
	   outtextxy(143,205,"-6");
	   outtextxy(127,205,"-7");
	   outtextxy(111,205,"-8");
	   outtextxy(95,205,"-9");
	   outtextxy(78,205,"-10");
	   outtextxy(62,205,"-11");
	   outtextxy(46,205,"-12");
	   outtextxy(30,205,"-13");
	   outtextxy(14,205,"-14");


	   for(int j=((maxx-150)/2); j<=maxx-156; j+=16)
	   {
		line(j,((maxy-78)/2)-3,j,((maxy-78)/2)+3); //horizontal division right
	   }
	   setcolor(12);
	   settextstyle(11,HORIZ_DIR,4);
	   outtextxy(235,203,"0");
	   setcolor(14);
	   settextstyle(2,HORIZ_DIR,3);
	   outtextxy(259,205,"1");
	   outtextxy(275,205,"2");
	   outtextxy(291,205,"3");
	   outtextxy(307,205,"4");    //right numbering
	   outtextxy(323,205,"5");
	   outtextxy(339,205,"6");
	   outtextxy(355,205,"7");
	   outtextxy(371,205,"8");
	   outtextxy(387,205,"9");
	   outtextxy(402,205,"10");
	   outtextxy(418,205,"11");
	   outtextxy(434,205,"12");
	   outtextxy(450,205,"13");
	   outtextxy(466,205,"14");

	   for(int k=((maxy-78)/2); k>=26; k-=16)
	   {
		line(((maxx-150)/2)-3,k,((maxx-150)/2)+3,k); //verticalal division up
	   }
	   settextstyle(2,HORIZ_DIR,3);
	   outtextxy(250,180,"1");
	   outtextxy(250,164,"2");
	   outtextxy(250,148,"3");  //up numbering
	   outtextxy(250,132,"4");
	   outtextxy(250,116,"5");
	   outtextxy(250,100,"6");
	   outtextxy(250,84,"7");
	   outtextxy(250,68,"8");
	   outtextxy(250,52,"9");
	   outtextxy(250,36,"10");

	   for(int l=((maxy-46)/2); l<=maxy-116; l+=16)
	   {
		line(((maxx-150)/2)-3,l,((maxx-150)/2)+3,l); //vertical division down
	   }
	   settextstyle(2,HORIZ_DIR,3);
	   outtextxy(232,212,"-1");
	   outtextxy(232,228,"-2");
	   outtextxy(232,244,"-3");
	   outtextxy(232,260,"-4");  //down numbering
	   outtextxy(232,276,"-5");
	   outtextxy(232,292,"-6");
	   outtextxy(232,308,"-7");
	   outtextxy(232,324,"-8");
	   outtextxy(232,340,"-9");
	   outtextxy(230,356,"-10");

	   setcolor(7);
	   settextstyle(2,HORIZ_DIR,4);
	   circle((maxx-132),432,5);
	   outtextxy((maxx-140),425," c ABDULLAH AL HISHAM");
	   outtextxy((maxx-130),437," ID No: 043-15-322");
	   outtextxy((maxx-110),447,"Program: CSE");
	   settextstyle(2,HORIZ_DIR,2);
	   outtextxy((maxx-135),460,"Daffodil International University");

	}
	void point()
	{
		ClearScreen();

		gotoxy(5,25);
		printf("Enter X coordinate: ");
		scanf("%f", &x1);
		gotoxy(5,26);
		printf("Enter Y coordinate: ");
		scanf("%f", &y1);

		putpixel((maxx-150)/2+(x1)*16,(maxy-78)/2-(y1)*16,15);
		setcolor(10);
		settextstyle(2,HORIZ_DIR,2);
		outtextxy((maxx-150)/2+(x1)*16,(maxy-78)/2-(y1)*16,"P(x,y)");

		gotoxy(5,28);
		printf("Do you want any operation?(y/n)");
		ch=getch();

		while(ch=='y')
		{
			do
			{
				ClearScreen();
				gotoxy(5,25);
				printf("Enter your choice of operation: ");
				ch=getch();
				switch(ch)
				{
					case '5':
						float tx,ty,tx1,ty1;                            //for point translation
						ClearScreen();

						gotoxy(5,25);
						printf("Enter X displacement: ");
						scanf("%f", &tx);
						gotoxy(5,26);
						printf("Enter Y displacement: ");
						scanf("%f", &ty);

						tx1=x1+tx;
						ty1=y1+ty;

						putpixel((maxx-150)/2+(tx1)*16,(maxy-78)/2-(ty1)*16,15);
						setcolor(10);
						settextstyle(2,HORIZ_DIR,2);
						outtextxy((maxx-150)/2+(tx1)*16,(maxy-78)/2-(ty1)*16,"P'(x',y')");
						break;

					case '6':
						ClearScreen();             //for point rotation
						float rx1,ry1;

						gotoxy(5,25);
						printf("Enter degree of rotation: ");
						scanf("%lf", &deg);

						deg=((deg*3.141592654)/180);
						rx1=(x1*cos(deg)) - (y1*sin(deg));
						ry1=(x1*sin(deg)) + (y1*cos(deg));

						putpixel((maxx-150)/2+(rx1)*16,(maxy-78)/2-(ry1)*16,15);
						setcolor(10);
						settextstyle(2,HORIZ_DIR,2);
						outtextxy((maxx-150)/2+(rx1)*16,(maxy-78)/2-(ry1)*16,"P'(x',y')");
						break;

					case '7':
						ClearScreen();
						sound(400);
						delay(200);
						nosound();
						settextstyle(11,HORIZ_DIR,5);
						setcolor(4);
						outtextxy(15,385,"You can't do any scaling on point!!!");
						delay(2000);
					/*
						int sx,sy;             //for point scaling
						ClearScreen();
						gotoxy(5,24);
						printf("Enter X displacement: ");
						scanf("%f", &sx);
						x1=x1*sx;
						gotoxy(5,25);
						printf("Enter Y displacement: ");
						scanf("%f", &sy);
						y1=y1*sy;
						putpixel((maxx-150)/2+(x1)*20,(maxy-150)/2-(y1)*20,11);
						settextstyle(2,HORIZ_DIR,4);
						outtextxy((maxx-150)/2+(x1)*20,(maxy-150)/2-(y1)*20,"P'(x',y')"); */
						break;

					case '8':
						float mx,my;
						int choice;         //for point mirror reflection
						ClearScreen();

						gotoxy(5,25);
						printf("Enter 1 or 2 for");
						gotoxy(5,26);
						printf("Mirror Reflection about x or y axis:");
						scanf("%d", &choice);

						if(choice==1)
						{
							mx=-x1;
							my=y1;

							putpixel((maxx-150)/2+(mx)*16,(maxy-78)/2-(my)*16,15);
							setcolor(10);
							settextstyle(2,HORIZ_DIR,2);
							outtextxy((maxx-150)/2+(mx)*16,(maxy-78)/2-(my)*16,"P'(x',y')");
						}

						if(choice==2)
						{
							mx=x1;
							my=-y1;

							putpixel((maxx-150)/2+(mx)*16,(maxy-78)/2-(my)*16,15);
							setcolor(10);
							settextstyle(2,HORIZ_DIR,2);
							outtextxy((maxx-150)/2+(mx)*16,(maxy-78)/2-(my)*16,"P'(x',y')");
						}
						break;

					default:
						ClearScreen();
						setcolor(4);
						settextstyle(11,HORIZ_DIR,5);
						outtextxy(15,385,"You typed wrong key!!!");
						sleep(1);
						outtextxy(15,395,"Press any key to continue");
						getch();

				}
			ClearScreen();
			gotoxy(5,28);
			printf("Operation Again?(y/n) ");
			ch=getch();
			}while(ch=='y');
		}
	}

	void line()
	{
		ClearScreen();

		gotoxy(5,25);
		printf("Enter X1:");
		scanf("%f",&x1);
		gotoxy(5,26);
		printf("Enter Y1:");
		scanf("%f",&y1);
		gotoxy(5,27);
		printf("Enter X2:");
		scanf("%f",&x2);
		gotoxy(5,28);
		printf("Enter Y2:");
		scanf("%f",&y2);

		setcolor(15);
		line((maxx-150)/2+(x1)*16,(maxy-78)/2-(y1)*16,(maxx-150)/2+(x2)*16,(maxy-78)/2-(y2)*16);
		setcolor(10);
		settextstyle(2,HORIZ_DIR,2);
		outtextxy((maxx-150)/2+(x1)*16,(maxy-78)/2-(y1)*16,"P1(x1,y1)");
		outtextxy((maxx-150)/2+(x2)*16,(maxy-78)/2-(y2)*16,"P2(x2,y2)");

		gotoxy(5,29);
		printf("Do you want any operation?(y/n)");
		ch=getch();

		while(ch=='y')
		{
			do
			{
				ClearScreen();
				gotoxy(5,25);
				printf("Enter your choice of operation: ");
				ch=getch();
				switch(ch)
				{
					case '5':
						float tx1,ty1,tx2,ty2,Tx1,Ty1,Tx2,Ty2;     //for line transformation
						ClearScreen();

						gotoxy(5,25);
						printf("Enter X1 displacement: ");
						scanf("%f", &tx1);
						gotoxy(5,26);
						printf("Enter Y1 displacement: ");
						scanf("%f", &ty1);
						gotoxy(5,27);
						printf("Enter X2 displacement: ");
						scanf("%f", &tx2);
						gotoxy(5,28);
						printf("Enter Y2 displacement: ");
						scanf("%f", &ty2);

						Tx1=x1+tx1;
						Ty1=y1+ty1;
						Tx2=x2+tx2;
						Ty2=y2+ty2;

						setcolor(15);
						line((maxx-150)/2+(Tx1)*16,(maxy-78)/2-(Ty1)*16,(maxx-150)/2+(Tx2)*16,(maxy-78)/2-(Ty2)*16);
						setcolor(10);
						settextstyle(2,HORIZ_DIR,2);
						outtextxy((maxx-150)/2+(Tx1)*16,(maxy-78)/2-(Ty1)*16,"P1'(x1',y1')");
						outtextxy((maxx-150)/2+(Tx2)*16,(maxy-78)/2-(Ty2)*16,"P2'(x2',y2')");
						break;

					case '6':
						ClearScreen();        //for line rotation
						float rx1,ry1,rx2,ry2;

						gotoxy(5,25);
						printf("Enter degree of rotation: ");
						scanf("%lf", &deg);

						deg=(deg*3.141592654/180);
						rx1=(x1*cos(deg)) - (y1*sin(deg));
						ry1=(x1*sin(deg)) + (y1*cos(deg));
						rx2=(x2*cos(deg)) - (y2*sin(deg));
						ry2=(x2*sin(deg)) + (y2*cos(deg));

						setcolor(15);
						line((maxx-150)/2+(rx1)*16,(maxy-78)/2-(ry1)*16,(maxx-150)/2+(rx2)*16,(maxy-78)/2-(ry2)*16);
						setcolor(10);
						settextstyle(2,HORIZ_DIR,2);
						outtextxy((maxx-150)/2+(rx1)*16,(maxy-78)/2-(ry1)*16,"P1'(x1',y1')");
						outtextxy((maxx-150)/2+(rx2)*16,(maxy-78)/2-(ry2)*16,"P2'(x2',y2')");
						break;

					case '7':
						float sx1,sy1,sx2,sy2,Sx1,Sy1,Sx2,Sy2;    //for line scaling
						ClearScreen();

						gotoxy(5,25);
						printf("Enter X axis scaling: ");
						scanf("%f", &sx2);
					   /*	gotoxy(5,26);
						printf("Enter Y1 scaling: ");
						scanf("%f", &sy1);
						gotoxy(5,27);
						printf("Enter X2 scaling: ");
						scanf("%f", &sx2);
						gotoxy(5,28);
						printf("Enter Y2 scaling: ");
						scanf("%f", &sy2); */

					    /*	Sx1=x1*sx1;
						Sy1=y1*sy1;
						Sx2=x2*sx2;
						Sy2=y2*sy2;*/

						Sx1=x1;
						Sy1=y1;
						Sx2=x2*sx2;
						Sy2=y2*sx2;

						cleardevice();
						interface();
						setcolor(15);
						line((maxx-150)/2+(Sx1)*16,(maxy-78)/2-(Sy1)*16,(maxx-150)/2+(Sx2)*16,(maxy-78)/2-(Sy2)*16);
						setcolor(10);
						settextstyle(2,HORIZ_DIR,2);
						outtextxy((maxx-150)/2+(Sx1)*16,(maxy-78)/2-(Sy1)*16,"P1'(x1',y1')");
						outtextxy((maxx-150)/2+(Sx2)*16,(maxy-78)/2-(Sy2)*16,"P2'(x2',y2')");
						break;

					case '8':
						float mx1,my1,mx2,my2;
						int choice;     //for line mirror reflection
						ClearScreen();

						gotoxy(5,25);
						printf("Enter 1 or 2 for");
						gotoxy(5,26);
						printf("Mirror Reflection about x or y axis:");
						scanf("%d", &choice);

						if(choice==1)
						{
							mx1=-x1;
							my1=y1;
							mx2=-x2;
							my2=y2;

							setcolor(15);
							line((maxx-150)/2+(mx1)*16,(maxy-78)/2-(my1)*16,(maxx-150)/2+(mx2)*16,(maxy-78)/2-(my2)*16);
							setcolor(10);
							settextstyle(2,HORIZ_DIR,2);
							outtextxy((maxx-150)/2+(mx1)*16,(maxy-78)/2-(my1)*16,"P1'(x1',y1')");
							outtextxy((maxx-150)/2+(mx2)*16,(maxy-78)/2-(my2)*16,"P2'(x2',y2')");

						}

						if(choice==2)
						{
							mx1=x1;
							my1=-y1;
							mx2=x2;
							my2=-y2;

							setcolor(15);
							line((maxx-150)/2+(mx1)*16,(maxy-78)/2-(my1)*16,(maxx-150)/2+(mx2)*16,(maxy-78)/2-(my2)*16);
							setcolor(10);
							settextstyle(2,HORIZ_DIR,2);
							outtextxy((maxx-150)/2+(mx1)*16,(maxy-78)/2-(my1)*16,"P1'(x1',y1')");
							outtextxy((maxx-150)/2+(mx2)*16,(maxy-78)/2-(my2)*16,"P2'(x2',y2')");
						}
						break;


					default:
						ClearScreen();
						setcolor(4);
						settextstyle(11,HORIZ_DIR,5);
						outtextxy(15,385,"You typed wrong key!!!");
						sleep(1);
						outtextxy(15,395,"Press any key to continue");
				}
			ClearScreen();
			gotoxy(5,28);
			printf("Operation Again?(y/n) ");
			ch=getch();
			}while(ch=='y');
		}
	}

	void rectangle()
	{
		ClearScreen();

		gotoxy(5,25);
		printf("Enter X1:");
		scanf("%f", &x1);
		gotoxy(5,26);
		printf("Enter Y1:");
		scanf("%f", &y1);
		gotoxy(5,27);
		printf("Enter X2:");
		scanf("%f", &x2);
		gotoxy(5,28);
		printf("Enter Y2:");
		scanf("%f", &y2);

		setcolor(15);
		rectangle(((maxx-150)/2+(x1)*16),((maxy-78)/2-(y1)*16),((maxx-150)/2+(x2)*16),((maxy-78)/2-(y2)*16));
		setcolor(10);
		settextstyle(2,HORIZ_DIR,2);
		outtextxy((maxx-150)/2+(x1)*16,(maxy-78)/2-(y2)*16,"P1(x1,y1)");
		outtextxy((maxx-150)/2+(x1)*16,(maxy-78)/2-(y1)*16,"P2(x2,y2)");
		outtextxy((maxx-150)/2+(x2)*16,(maxy-78)/2-(y1)*16,"P3(x3,y3)");
		outtextxy((maxx-150)/2+(x2)*16,(maxy-78)/2-(y2)*16,"P4(x4,y4)");

		gotoxy(5,29);
		printf("Do you want any operation?(y/n)");
		ch=getch();

		while(ch=='y')
		{
			do
			{
				ClearScreen();
				gotoxy(5,25);
				printf("Enter your choice of operation:");
				ch=getch();
				switch(ch)
				{
					case '5':
						float tx1,ty1,tx2,ty2,Tx1,Ty1,Tx2,Ty2;  //for rectangle transformation
						ClearScreen();
						gotoxy(5,25);
						printf("Enter X1 displacement: ");
						scanf("%f", &tx1);
						gotoxy(5,26);
						printf("Enter Y1 displacement: ");
						scanf("%f", &ty1);
						gotoxy(5,27);
						printf("Enter X2 displacement: ");
						scanf("%f", &tx2);
						gotoxy(5,28);
						printf("Enter Y2 displacement: ");
						scanf("%f", &ty2);

						Tx1=x1+tx1;
						Ty1=y1+ty1;
						Tx2=x2+tx2;
						Ty2=y2+ty2;

						setcolor(15);
						rectangle((maxx-150)/2+(Tx1)*16,(maxy-78)/2-(Ty1)*16,(maxx-150)/2+(Tx2)*16,(maxy-78)/2-(Ty2)*16);
						setcolor(10);
						settextstyle(2,HORIZ_DIR,2);
						outtextxy((maxx-150)/2+(Tx1)*16,(maxy-78)/2-(Ty2)*16,"P1'(x1',y1')");
						outtextxy((maxx-150)/2+(Tx1)*16,(maxy-78)/2-(Ty1)*16,"P2'(x2',y2')");
						outtextxy((maxx-150)/2+(Tx2)*16,(maxy-78)/2-(Ty1)*16,"P3'(x3',y3')");
						outtextxy((maxx-150)/2+(Tx2)*16,(maxy-78)/2-(Ty2)*16,"P4'(x4',y4')");
						break;

					case '6':
						ClearScreen();      //for rectangle rotation
						float rx1, ry1, rx2, ry2;

						gotoxy(5,25);
						printf("Enter degree of rotation: ");
						scanf("%lf", &deg);

						deg=(deg*3.141592654/180);
						rx1=(x1*cos(deg)) - (y1*sin(deg));
						ry1=(x1*sin(deg)) + (y1*cos(deg));
						rx2=(x2*cos(deg)) - (y2*sin(deg));
						ry2=(x2*sin(deg)) + (y2*cos(deg));

						setcolor(15);
						rectangle((maxx-150)/2+(rx1)*16,(maxy-78)/2-(ry1)*16,(maxx-150)/2+(rx2)*16,(maxy-78)/2-(ry2)*16);
						setcolor(10);
						settextstyle(2,HORIZ_DIR,2);
						outtextxy((maxx-150)/2+(rx1)*16,(maxy-78)/2-(ry2)*16,"P1'(x1',y1')");
						outtextxy((maxx-150)/2+(rx1)*16,(maxy-78)/2-(ry1)*16,"P2'(x2',y2')");
						outtextxy((maxx-150)/2+(rx2)*16,(maxy-78)/2-(ry1)*16,"P3'(x3',y3')");
						outtextxy((maxx-150)/2+(rx2)*16,(maxy-78)/2-(ry2)*16,"P4'(x4',y4')");
						break;

					case '7':
						float sx2,sy2,Sx1,Sy1,Sx2,Sy2;       //for rectangle scaling
						ClearScreen();
						gotoxy(5,25);
						printf("Enter X-axis scaling: ");
						scanf("%f", &sx2);
						gotoxy(5,26);
						printf("Enter Y-axis scaling: ");
						scanf("%f", &sy2);

					/*	Sx1=x1*sx1;
						Sy1=y1*sy1;
						Sx2=x2*sx2;
						Sy2=y2*sy2;   */

						Sx1=x1;
						Sy1=y1;
						Sx2=x2*sx2;
						Sy2=y2*sy2;

						setcolor(15);
						rectangle((maxx-150)/2+(Sx1)*16,(maxy-78)/2-(Sy1)*16,(maxx-150)/2+(Sx2)*16,(maxy-78)/2-(Sy2)*16);
						setcolor(10);
						settextstyle(2,HORIZ_DIR,2);
						outtextxy((maxx-150)/2+(Sx1)*16,(maxy-78)/2-(Sy2)*16,"P1'(x1',y1')");
						outtextxy((maxx-150)/2+(Sx1)*16,(maxy-78)/2-(Sy1)*16,"P2'(x2',y2')");
						outtextxy((maxx-150)/2+(Sx2)*16,(maxy-78)/2-(Sy1)*16,"P3'(x3',y3')");
						outtextxy((maxx-150)/2+(Sx2)*16,(maxy-78)/2-(Sy2)*16,"P4'(x4',y4')");
						break;

					case '8':
						float mx1,my1,mx2,my2;
						int choice;   //for rectangle mirror reflection
						ClearScreen();

						gotoxy(5,25);
						printf("Enter 1 or 2 for");
						gotoxy(5,26);
						printf("Mirror Reflection about x or y axis:");
						scanf("%d", &choice);

						if(choice==1)
						{
							mx1=-x1;
							my1=y1;
							mx2=-x2;
							my2=y2;

							setcolor(15);
							rectangle((maxx-150)/2+(mx1)*16,(maxy-78)/2-(my1)*16,(maxx-150)/2+(mx2)*16,(maxy-78)/2-(my2)*16);
							setcolor(10);
							settextstyle(2,HORIZ_DIR,2);
							outtextxy((maxx-150)/2+(mx1)*16,(maxy-78)/2-(my2)*16,"P1'(x1',y1')");
							outtextxy((maxx-150)/2+(mx1)*16,(maxy-78)/2-(my1)*16,"P2'(x2',y2')");
							outtextxy((maxx-150)/2+(mx2)*16,(maxy-78)/2-(my1)*16,"P3'(x3',y3')");
							outtextxy((maxx-150)/2+(mx2)*16,(maxy-78)/2-(my2)*16,"P4'(x4',y4')");

						}

						if(choice==2)
						{
							mx1=x1;
							my1=-y1;
							mx2=x2;
							my2=-y2;

							setcolor(15);
							rectangle((maxx-150)/2+(mx1)*16,(maxy-78)/2-(my1)*16,(maxx-150)/2+(mx2)*16,(maxy-78)/2-(my2)*16);
							setcolor(10);
							settextstyle(2,HORIZ_DIR,2);
							outtextxy((maxx-150)/2+(mx1)*16,(maxy-78)/2-(my2)*16,"P1'(x1',y1')");
							outtextxy((maxx-150)/2+(mx1)*16,(maxy-78)/2-(my1)*16,"P2'(x2',y2')");
							outtextxy((maxx-150)/2+(mx2)*16,(maxy-78)/2-(my1)*16,"P3'(x3',y3')");
							outtextxy((maxx-150)/2+(mx2)*16,(maxy-78)/2-(my2)*16,"P4'(x4',y4')");

						}
						break;

					default:
						ClearScreen();
						setcolor(4);
						settextstyle(11,HORIZ_DIR,5);
						outtextxy(15,385,"You typed wrong key!!!");
						sleep(1);
						outtextxy(15,395,"Press any key to continue");
						getch();
				}
			ClearScreen();
			gotoxy(5,28);
			printf("Operation Again?(y/n) ");
			ch=getch();
			}while(ch=='y');
		}
	}

	void circle()
	{
		ClearScreen();

		gotoxy(5,25);
		printf("Enter X1:");
		scanf("%f", &x1);
		gotoxy(5,26);
		printf("Enter Y1:");
		scanf("%f", &y1);
		gotoxy(5,27);
		printf("Enter Radius:");
		scanf("%f", &r1);

		putpixel((maxx-150)/2+(x1)*16,(maxy-78)/2-(y1)*16,14);
		setcolor(15);
		circle((maxx-150)/2+(x1)*16,(maxy-78)/2-(y1)*16,r1*16);
		setcolor(10);
		settextstyle(2,HORIZ_DIR,2);
		outtextxy((maxx-150)/2+(x1)*16,(maxy-78)/2-(y1)*16,"P(x,y)");

		gotoxy(5,28);
		printf("Do you want any operation?(y/n)");
		ch=getch();

		while(ch=='y')
		{
			do
			{
				ClearScreen();
				gotoxy(5,25);
				printf("Enter your choice of operation");
				ch=getch();
				switch(ch)
				{
					case '5':
						float tx,ty,tx1,ty1;       //for circle transformation
						ClearScreen();

						gotoxy(5,25);
						printf("Enter X displacement: ");
						scanf("%f", &tx);
						gotoxy(5,26);
						printf("Enter Y displacement: ");
						scanf("%f", &ty);

						tx1=x1+tx;
						ty1=y1+ty;

						putpixel((maxx-150)/2+(tx1)*16,(maxy-78)/2-(ty1)*16,14);
						setcolor(15);
						circle((maxx-150)/2+(tx1)*16,(maxy-78)/2-(ty1)*16,r1*16);
						setcolor(10);
						settextstyle(2,HORIZ_DIR,2);
						outtextxy((maxx-150)/2+(tx1)*16,(maxy-78)/2-(ty1)*16,"P'(x',y')");
						break;

					case '6':                //for circle rotation
						ClearScreen();
						float rx1,ry1;

						gotoxy(5,25);
						printf("Enter degree of rotation: ");
						scanf("%lf", &deg);

						deg=(deg*3.141592654/180);
						rx1=(x1*cos(deg)) - (y1*sin(deg));
						ry1=(x1*sin(deg)) + (y1*cos(deg));

						putpixel((maxx-150)/2+(rx1)*16,(maxy-78)/2-(ry1)*16,14);
						setcolor(15);
						circle((maxx-150)/2+(rx1)*16,(maxy-78)/2-(ry1)*16,r1*16);
						setcolor(10);
						settextstyle(2,HORIZ_DIR,2);
						outtextxy((maxx-150)/2+(rx1)*16,(maxy-78)/2-(ry1)*16,"P'(x',y')");
						break;

					case '7':
						float r,r2;           //for circle scaling
						ClearScreen();

						gotoxy(5,25);
						printf("Enter radius scaling: ");
						scanf("%f", &r2);

						r=r1*r2;

						putpixel((maxx-150)/2+(x1)*16,(maxy-78)/2-(y1)*16,14);
						setcolor(15);
						circle((maxx-150)/2+(x1)*16,(maxy-78)/2-(y1)*16,r*16);
						setcolor(10);
						settextstyle(2,HORIZ_DIR,2);
						outtextxy((maxx-150)/2+(x1)*16,(maxy-78)/2-(y1)*16,"P'(x',y')");
						break;

					case '8':
						float mx,my;
						int choice;      //for circle mirror reflection
						ClearScreen();

						gotoxy(5,25);
						printf("Enter 1 or 2 for");
						gotoxy(5,26);
						printf("Mirror Reflection about x or y axis:");
						scanf("%d", &choice);

						if(choice==1)
						{
							mx=-x1;
							my=y1;

							putpixel((maxx-150)/2+(mx)*16,(maxy-78)/2-(my)*16,14);
							setcolor(15);
							circle((maxx-150)/2+(mx)*16,(maxy-78)/2-(my)*16,r1*16);
							setcolor(10);
							settextstyle(2,HORIZ_DIR,2);
							outtextxy((maxx-150)/2+(mx)*16,(maxy-78)/2-(my)*16,"P'(x',y')");
						}

						if(choice==2)
						{
							mx=x1;
							my=-y1;

							putpixel((maxx-150)/2+(mx)*16,(maxy-78)/2-(my)*16,14);
							setcolor(15);
							circle((maxx-150)/2+(mx)*16,(maxy-78)/2-(my)*16,r1*16);
							setcolor(10);
							settextstyle(2,HORIZ_DIR,2);
							outtextxy((maxx-150)/2+(mx)*16,(maxy-78)/2-(my)*16,"P'(x',y')");
						}
						break;


					default:
						ClearScreen();
						setcolor(4);
						settextstyle(11,HORIZ_DIR,5);
						outtextxy(15,385,"You typed wrong key!!!");
						sleep(1);
						outtextxy(15,395,"Press any key to continue");
						getch();
				}
			ClearScreen();
			gotoxy(5,28);
			printf("Operation Again?(y/n) ");
			ch=getch();
			}while(ch=='y');
		}
	}

	void ClearScreen()
	{
		for(int i=25;i<30;i++)
		{
			gotoxy(2,i);
			printf("\t\t\t\t\t\t\t");
		}
	}

	public static void main(String[] args) {
			interface();
			while(1)
			{
		 //		interface();
				ClearScreen();
				setcolor(15);
				settextstyle(11,HORIZ_DIR,5);
				outtextxy(15,385,"Enter your choice:");
				ch = getch();
				switch(ch)
				{
					case '1':
						point();
						break;

					case '2':
						line();
						break;

					case '3':
						rectangle();
						break;

					case '4':
						circle();
						break;

					case '5':
						ClearScreen();
						setcolor(4);
						outtextxy(15,385,"You can't do any operation now!!!");
						outtextxy(15,395,"Press any key to continue");
						sound(400);
						delay(200);
						nosound();
						getch();
						break;

					case '6':
						ClearScreen();
						setcolor(4);
						outtextxy(15,385,"You can't do any operation now!!!");
						outtextxy(15,395,"Press any key to continue");
						sound(400);
						delay(200);
						nosound();
						getch();
						break;

					case '7':
						ClearScreen();
						setcolor(4);
						outtextxy(15,385,"You can't do any operation now!!!");
						outtextxy(15,395,"Press any key to continue");
						sound(400);
						delay(200);
						nosound();
						getch();
						break;

					case '8':
						ClearScreen();
						setcolor(4);
						outtextxy(15,385,"You can't do any operation now!!!");
						outtextxy(15,395,"Press any key to continue");
						sound(400);
						delay(200);
						nosound();
						getch();
						break;

					case '9':
						closegraph();
						interface();
						break;

					case '0':
						outtextxy(15,450,"Please Wait");
						for(int i=110; i<=160; i+=10)
						{
							delay(200);
							outtextxy(i,450,".");
						}
						closegraph();
						return(0);

					default:
						ClearScreen();
						sound(400);
						delay(200);
						nosound();
						setcolor(4);
						outtextxy(15,385,"You typed wrong key!!!");
						sleep(1);
						outtextxy(15,395,"Press any key to continue");
						getch();
				}
			}	
}