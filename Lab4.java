PK
    �l]X��	)  )     Lab4/.classpath<?xml version="1.0" encoding="UTF-8"?>
<classpath>
	<classpathentry kind="con" path="org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-17">
		<attributes>
			<attribute name="module" value="true"/>
		</attributes>
	</classpathentry>
	<classpathentry kind="src" path="src"/>
	<classpathentry kind="con" path="org.eclipse.jdt.USER_LIBRARY/JavaFX20">
		<attributes>
			<attribute name="module" value="true"/>
		</attributes>
	</classpathentry>
	<classpathentry kind="output" path="bin"/>
</classpath>
PK
    �k]X\�K�k  k     Lab4/.project<?xml version="1.0" encoding="UTF-8"?>
<projectDescription>
	<name>Lab4</name>
	<comment></comment>
	<projects>
	</projects>
	<buildSpec>
		<buildCommand>
			<name>org.eclipse.jdt.core.javabuilder</name>
			<arguments>
			</arguments>
		</buildCommand>
	</buildSpec>
	<natures>
		<nature>org.eclipse.jdt.core.javanature</nature>
	</natures>
</projectDescription>
PK
    �k]X��M7   7   /   Lab4/.settings/org.eclipse.core.resources.prefseclipse.preferences.version=1
encoding/<project>=UTF-8
PK
    �k]X͈[I�  �  )   Lab4/.settings/org.eclipse.jdt.core.prefseclipse.preferences.version=1
org.eclipse.jdt.core.compiler.codegen.inlineJsrBytecode=enabled
org.eclipse.jdt.core.compiler.codegen.targetPlatform=17
org.eclipse.jdt.core.compiler.codegen.unusedLocal=preserve
org.eclipse.jdt.core.compiler.compliance=17
org.eclipse.jdt.core.compiler.debug.lineNumber=generate
org.eclipse.jdt.core.compiler.debug.localVariable=generate
org.eclipse.jdt.core.compiler.debug.sourceFile=generate
org.eclipse.jdt.core.compiler.problem.assertIdentifier=error
org.eclipse.jdt.core.compiler.problem.enablePreviewFeatures=disabled
org.eclipse.jdt.core.compiler.problem.enumIdentifier=error
org.eclipse.jdt.core.compiler.problem.reportPreviewFeatures=warning
org.eclipse.jdt.core.compiler.release=enabled
org.eclipse.jdt.core.compiler.source=17
PK
    �l]X�n�P�  �     Lab4/bin/BarChart.class����   = �  BarChart  java/lang/Object  java/awt/image/ImageObserver XMAX I ConstantValue  � XSTART   < YMAX [I colors [Ljava/awt/Color; data [[I barSize xStart activity count studentResult exactFrequencyCount exactMinimum key checkNewValues Z <clinit> ()V Code	  !   LineNumberTable LocalVariableTable <init>
  & $  ( java/awt/Color	 ' * + , BLUE Ljava/awt/Color;
 ' . $ / (III)V	 ' 1 2 , 	DARK_GRAY	 ' 4 5 , MAGENTA	  7  	  9  	  ;   this 
LBarChart; ([[I)V 	  A  	  C  	  E  	  G  	  I  	  K  	  M   dArray i j StackMapTable setArray setStudentResult (I)V newStudentResult setKey newKey getExactFrequencyCount ()I getExactMinimum getCheckNewValues ()Z setActivity a getActivity updateBarChart (IIILjava/awt/Graphics;)V
  c d e draw (Ljava/awt/Graphics;)V
  g h i 	drawArray (IILjava/awt/Graphics;)V
  k l i drawNewValue
  n o i drawMinimum
  q r a drawFrequency index1 index2 g Ljava/awt/Graphics;	  x  
 z | { java/awt/Graphics } ~ setColor (Ljava/awt/Color;)V   � � � makeConcatWithConstants (I)Ljava/lang/String;
 z � � � 
drawString (Ljava/lang/String;II)V
 z � � � fillRect (IIII)V  �	 ' � � , red  �  �	 ' � � , blue �  
  � � � checkCurrentNewValues (II)V � 	correctly � incorrectly  � � � (II)Ljava/lang/String;  � � � '(ILjava/lang/String;)Ljava/lang/String;  � s Ljava/lang/String; � java/lang/String
  � � � findSubMinimum (II)I  �  �	 ' � � , RED
 z � � � drawRect 	 � b minimum 
 �
  � � � findExactFrequencyCount (III)I  �  � value rowIndex colIndex searchValue currentCount imageUpdate (Ljava/awt/Image;IIIII)Z Ljava/awt/Image; 	infoflags x y width height 
SourceFile BarChart.java BootstrapMethods
 � � � $java/lang/invoke/StringConcatFactory � � �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; � � Row  �  � (Setting new array elements of row  to  � (Up to index  , the new values are set  � #Your current minimum in column :  � &Correct current minimum in column :  � Your current frequency count:  � "Correct current frequency count:  InnerClasses � %java/lang/invoke/MethodHandles$Lookup � java/lang/invoke/MethodHandles Lookup !          	    
     	                                                                         ?      �
Y �OY@OY�OYO�  �    "        #       $      x 	    :*� %*� 'Y� )SY� 'Y � �� -SY� 0SY� 3S� 6*� 8*� :�    "           "  /  4  9 ! #       : < =    $ >    E 	    �*� %*� 'Y� )SY� 'Y � �� -SY� 0SY� 3S� 6*� 8*� :*+�+2�� ?� @=� #>� *� @2+2.O�+2����+����*|*� @2�l� B*� D*� F*� H*� J*� L�    "   J    #   "  /  4  9 % G & L ( Q * ^ ( i & r - � . � / � 0 � 1 � 2 � 3 #   *    � < =     � N   I ) O   N  P   Q    � L   ?  � � 
  R >     �     ,=� #>� *� @2+2.O�+2����+���ݱ    "       7  9 
 ;  9 " 7 + > #   *    , < =     , N    ) O     P   Q    � � � 
  S T     >     *� D�    "   
    B  C #        < =      U    V T     >     *� J�    "   
    G  H #        < =      W    X Y     /     *� F�    "       L #        < =    Z Y     /     *� H�    "       Q #        < =    [ \     /     *� L�    "       V #        < =    ] T     >     *� 8�    "   
    [  \ #        < =      ^    _ Y     /     *� 8�    "       ` #        < =    ` a     �     Z*� b*� 8�    O          "   %   0   ;   F� -*� f� "*� j� *� m� *� p�    "   .    e  f , j / l 7 m : o B p E r M s P u Y x #   4    Z < =     Z      Z s     Z t     Z u v  Q    ,


  d e         �=� �*<� w+*� 62� y+�   *� w2d�  .� �>� T+*� w�  .*� @2.d*� Bd*� @2.� �+*� @2.� �  *� w�  .`� �*Y� w*� B`� w�*� @2�����*� @���p�    "   .    }    �  � + � 0 � T � q � ~ � � } � � #   *    � < =     � u v   � O   - _ P   Q    � � *� P�   h i    �     �-� �� y6� x*<� w6� \-*� w�  .*� @2.d*� Bd*� @2.� �-*� @2.� �  *� w�  .`� �*Y� w*� B`� w�*� @2��������*<� w6� W-*� w�  .*� @2.d*� Bd*� @2.� �-*� @2.� �  *� w�  .`� �*Y� w*� B`� w�����    "   B    �  �  �  �  � B � b � o �  � � � � � � � � � � � � � � � #   H    � < =     � s     � t     � u v  
 ~ O    i P   � ] P   Q    � � � X� � S  l i    a     �-� �� y�:*� �*� L� 
�:� �:-*� J� �  n� �-� �   �� �-� �� y*<� w6� V-*� @2.� �  *� w�  .`� �-*� w�  .*� @2.d*� Bd*� @2.� �*Y� w*� B`� w�����    "   B    �  �  �  �  �  � # � 5 � F � M � S � Y � v � � � � � � � #   >    � < =     � s     � t     � u v   � � �  V \ P   Q    �  �� 5� R  o i    �     �*� �6� �-� )� y-*� D� �  n� �*� H-*� H� �   �� �-� �� y*<*� Bh`� w-*� w�  .*� @2.d*� Bd*� @2.� �-*� @2.� �  *� w�  .`� �6� E*� @2.� 4-� �� y-*� w�  .*� @2.d*� Bd*� @2.� �� �����    "   F    �  �  �  � & � , � ? � F � S � w � � � � � � � � � � � � � � � #   >    � < =     � s     � t     � u v   � �   � K O   Q    � �>�   � �     �     1*� @2.>6� *� @2.� *� @2.>�����    "       � 	 �  �  � & � / � #   4    1 < =     1 s     1 t   	 ( �    # O   Q   	 �   r a    +    I� )� y*� D� �  n� �**� �� F*� F� �   �� �� �� y6� g*<� w6� K*� @2.� -*� w�  .*� @2.d*� Bd*� @2.� �*Y� w*� B`� w�*� @2��������*<*� Bh`� w*� w�  .d*� Bd� �*� @2.� �  *� w�  .`� �*<� w6� G*� @2.� **� w�  .*� @2.d*� Bd*� @2.� �*Y� w*� B`� w�����    "   ^    �  �  � % � 8 � @ � F � L � R � ` � � � � � � � � � � � � � � � �  �2? H #   R   I < =    I s    I t    I �    I u v  C m O   O X P   � M P   Q    � F� 7� � S3  � �         [66� -6� *� @2.� ��*� @2�������6� *� @2.� ������    "   2   
  	     0 9 ? L O X #   R    [ < =     [ �     [ �     [ �    X �    3 O    $ P   <  P   Q    � 	� �   � �     �     '*� L>� *� J*� @2.� *� L����    "         
" #   &% #   *    ' < =     ' s     ' t     O   Q    � 
  � �     h     �    "      ) #   H     < =      O �     �      �      �      �      �    �    � �   P  �  � �  � �  � �  � �  � �  � �  � �  � �  � �  � �  � �  � �  � �   
  � � � PK
    �}]XK�v�  �  0   Lab4/bin/TwoDimArrayPractice$ButtonHandler.class����   = [  !TwoDimArrayPractice$ButtonHandler  java/lang/Object  java/awt/event/ActionListener on Z this$0 LTwoDimArrayPractice; <init> (LTwoDimArrayPractice;)V Code	   	 

     ()V	     LineNumberTable LocalVariableTable this #LTwoDimArrayPractice$ButtonHandler; actionPerformed (Ljava/awt/event/ActionEvent;)V  TwoDimArrayPractice$PrintArrayT	     TwoDimArrayPractice ! 
 app
  #  $ -(LTwoDimArrayPractice;LTwoDimArrayPractice;)V
 & ( ' java/awt/event/ActionEvent ) * 	getSource ()Ljava/lang/Object;	  , - . 
fillValues Ljavax/swing/JButton;
  0 1  disableButtons
 3 5 4 javax/swing/JButton 6  requestFocus	  8 9 : bc 
LBarChart;
 < > = BarChart ? @ setActivity (I)V
  B C  start	  E F . 
printArray	  H I . 	setValues	  K L . findMinimum	  N O . countFrequency e Ljava/awt/event/ActionEvent; t !LTwoDimArrayPractice$PrintArrayT; StackMapTable 
SourceFile TwoDimArrayPractice.java InnerClasses ButtonHandler PrintArrayT NestHost             	 
           A     *+� *� *� �          � 	� �                   �    	� Y*� � � "M+� %*� � +� -*� � /*� � +� 2*� � 7� ;*� � /,� A� �+� %*� � D� &*� � /*� � D� 2*� � 7� ;,� A� �+� %*� � G� &*� � /*� � G� 2*� � 7� ;,� A� b+� %*� � J� &*� � /*� � J� 2*� � 7� ;,� A� 1+� %*� � M� #*� � /*� � M� 2*� � 7� ;,� A�       �    � � � $  . 9 @ D G U \ f	 q
 u x � � � � � � � � � � � � � � �!        	      	 P Q   � R S  T    � G 000-  U    V W       X    Y  Z    PK
    �}]X ��I  I  .   Lab4/bin/TwoDimArrayPractice$PrintArrayT.class����   = 7  TwoDimArrayPractice$PrintArrayT  java/lang/Thread arr [[I s1 LTwoDimArrayPractice; this$0 <init> -(LTwoDimArrayPractice;LTwoDimArrayPractice;)V Code	   	 
   
  ()V	    TwoDimArrayPractice   intArray	    	     LineNumberTable LocalVariableTable this !LTwoDimArrayPractice$PrintArrayT; s run	  " # $ bc 
LBarChart;
 & ( ' BarChart ) * getActivity ()I
  , - . startActivity (I)V
  0 1  enableButtons 
SourceFile TwoDimArrayPractice.java InnerClasses PrintArrayT NestHost                    	      
      Z     *+� *� *� � *,� �          2 1 	3 4 5                           K     *� *� � !� %� +*� � /�          8 9 ;              2    3 4   
    5  6    PK
    �}]Xǘ�F%  F%  "   Lab4/bin/TwoDimArrayPractice.class����   =�  TwoDimArrayPractice  javax/swing/JFrame 
fillValues Ljavax/swing/JButton; 
printArray 	setValues findMinimum countFrequency bh #LTwoDimArrayPractice$ButtonHandler; intArray [[I ROWS I ConstantValue    COLUMNS    current1 current2 key rowSelected columnSelected bc 
LBarChart; counter app LTwoDimArrayPractice; 	firstTime Z 	offscreen Ljava/awt/Image; <clinit> ()V Code	  '  	  )  	  +   LineNumberTable LocalVariableTable <init> 0 Choose your activity
  2 . 3 (Ljava/lang/String;)V	  5  	  7  	  9  	  ;  	  =   
  ? @ A getContentPane ()Ljava/awt/Container; C java/awt/FlowLayout
 B E . $
 G I H java/awt/Container J K 	setLayout (Ljava/awt/LayoutManager;)V M javax/swing/JButton O Fill Values
 L 2	  R  
 G T U V add *(Ljava/awt/Component;)Ljava/awt/Component; X Print Array	  Z   \ 
Set Values	  ^   ` Find Minimum	  b 	  d Count Frequency	  f 
  h !TwoDimArrayPractice$ButtonHandler
 g j . k (LTwoDimArrayPractice;)V	  m  
 L o p q addActionListener "(Ljava/awt/event/ActionListener;)V
  s t u setSize (II)V 	  x   z java/util/Random
 y E
 y } ~  nextInt (I)I � BarChart
 � � . � ([[I)V	  �  	 � � � java/lang/System � � out Ljava/io/PrintStream; � 	Row	Value
 � � � java/io/PrintStream � 3 println   � � � makeConcatWithConstants (I)Ljava/lang/String;
 � � � 3 print  �
 � � � $
  � � � 
setVisible (Z)V
  � � � getSize ()Ljava/awt/Dimension;	 � � � java/awt/Dimension �  width	 � � �  height
  � � � createImage (II)Ljava/awt/Image;	  � ! " this c Ljava/awt/Container; rand Ljava/util/Random; i j StackMapTable  �
  � � u animate row column  � value���
  � � � (III)V minimum 
countFound 	frequency startActivity (I)V
 � � � � setActivity �  
  �  $ � Array filled with new values
 � � � javax/swing/JOptionPane � � showMessageDialog )(Ljava/awt/Component;Ljava/lang/Object;)V
  �  $ � Array printed � Enter a value between 50 and 80
 � � � � showInputDialog :(Ljava/awt/Component;Ljava/lang/Object;)Ljava/lang/String;
 � � � java/lang/Integer � � parseInt (Ljava/lang/String;)I	  �   � "Enter a row number between 0 and 3
 � � � � setKey
  �  u
 � � � � getCheckNewValues ()Z � 
 correctly �  incorrectly  � � � ((IILjava/lang/String;)Ljava/lang/String; &Enter a column number between 0 and 19
  	 
 � getExactMinimum ()I	 
This is correct 
This is incorrect  �  � 9(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
  � 
 � getExactFrequencyCount s  �  � 8(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; 	 �
  $ enableButtons  java/lang/Exception act 	goodInput answer Ljava/lang/String; message a feedbackMin displayMessageMin feedbackFrequency plural displayMessageFrequency- java/lang/String getCurrent1 getCurrent2 
getCounter getArray ()[[I
 �45 getActivity
 �78 � setArray
:<; java/awt/Image=> getGraphics ()Ljava/awt/Graphics;
 @AB paint (Ljava/awt/Graphics;)V
 <
EGF java/awt/GraphicsHI 	drawImage 3(Ljava/awt/Image;IILjava/awt/image/ImageObserver;)Z       �
MON java/lang/ThreadPQ sleep (J)V      �
UWV java/lang/InterruptedExceptionXY 
getMessage ()Ljava/lang/String; 
[ �\ &(Ljava/lang/String;)Ljava/lang/String;
U^_Y toStringa +Wrong number of arguments to animate method
 �cd � exit g Ljava/awt/Graphics; e  Ljava/lang/InterruptedException;
 �jk � setStudentResult [ intermedResult
 @
 �pqB draw
 �stu updateBarChart (IIILjava/awt/Graphics;)V main ([Ljava/lang/String;)V
  E	 z  
 |} � setDefaultCloseOperation args [Ljava/lang/String; disableButtons
 L�� � 
setEnabled resetButtonSelection
 L�� � setSelected 
SourceFile TwoDimArrayPractice.java BootstrapMethods
��� $java/lang/invoke/StringConcatFactory �� �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;�� 	�  � Values in row  set to � *In column , you found a minimum value of � � You found   time� � You did not find the value � IE Exception  InnerClasses ButtonHandler� TwoDimArrayPractice$PrintArrayT PrintArrayT� %java/lang/invoke/MethodHandles$Lookup� java/lang/invoke/MethodHandles Lookup NestMembers !                      	     
         
                       
     
                         
     
            ! "     # $  %   9      � &� (� *�    ,              " -       . $  %  �    �*/� 1*� 4*� 6*� 8*� :*� <*� >L+� BY� D� F*� LYN� P� Q+*� Q� SW*� LYW� P� Y+*� Y� SW*� LY[� P� ]+*� ]� SW*� LY_� P� a+*� a� SW*� LYc� P� e+*� e� SW*� gY*� i� l*� Q*� l� n*� Y*� l� n*� ]*� l� n*� a*� l� n*� e*� l� n*�&� r� v� w� yY� {M>� +6� � w2,� |2`O�� w2����� w����*� �Y� w� �� �� ��� �>� ?� �� �  � �6� � �� w2.� �  � ��� w2���� �� ��� w����� �� �*� �***� �� �*� �� �� �� ��    ,   � -   )          #   * % + 0 - = . F / S 0 \ 1 i 2 r 3  4 � 5 � 6 � 8 � 9 � : � ; � < � = � ? � A � D � E G I G' E2 M@ PH QM SY T_ Vr T� X� Q� Z� \� ]� ^ -   H   � �    %� � �  � � � �  � 3 �   " �  J G �  \ $ �   �   $ �   G y  � � "� �    $  %   �     S� yY� {L=� @� �� �  � �>� � w2+� |2`O*� ��� w2���� �� ��� w�����    ,   * 
   g  h  j  k  m . n 4 k A p G h R r -   *    S �     K � �  
 H �    & �   �    �  y� �    $  %   �     A<� 6=� � �� w2.� �  � �*� ��� w2���޲ �� ��� w���ȱ    ,   "    �  � 
 �  � " � / � 5 � @ � -        A �     > �    ( �   �    � � �    u  %   �     !>� � w2O*� ��� w2����    ,       �  �  �  �   � -   *    ! �      ! �     ! �     �   �    �   	   %   �     /�=>�  � w2.� � w2.=*� ń� w�����    ,       �  �  �  �  � " � - � -   *    / �      / �    , �    ( �   �   	 � 	  �   %   �     ?=>� 16� � w2.� �*� ń� w2���ބ� w�����    ,   & 	   �  �  �  �  �  � $ � 2 � = � -   4    ? �      ? �    = �    9 �   
 ( �   �    � � 
�   � �  %  �    7*� �� �=�N�   $          "   /   <   �  |*� �Ը ֧�*� �޸ ֧� "� �N-� *-� � �=� 
=� :���*� �2���*� �P���� :=� "� �N-� *-� � 8=� 
=� :���*� 8���*� 8����t*� �*� � �**� �*� 8� ��:*� �� �� 
�:� �:*� 8*� �� �  � ֧.� # � �N-� *-� � :=� 
=� :���*� :���*� :���� �**� :�6�:*� ��� :� 
:*� :�  :�  :� ֧ �� "� �N-� *-� � �=� 
=� :���*� �2���*� �P���� o**� �6�:*� ��� :� 
:�:� :*� ��  :�  :� � ֧ *� �  � �*��  M g j � � �
%(���  ,  ^ W   �  � 
 �  � 0 � 4 � : � = � A � G � J � M � T � X � ` � b � e g j l � �	 � � � � � � � � � � � �  �" �# �$ �% �& �( �)+.
2356 7#:%;(>*.>ABCLDPE\FdHiJtK�L�N�P�T�U�W�X�Y�\�]�`�P�c�e�f�g�h�j�l�m�n�pqst%v2z6{ -   z   7 �     7!   
-"    *#$  � (%$ L ;&  P 7'$ t ($ � b �  � ^)$ � A*$  '+$  �   c "� 0,DD� /,� D� %,�  D� %,� ,� (,�   ,   	.  %   $      � &�    ,       -      	/  %   $      � (�    ,      � -      	0  %   $      � *�    ,      � -      	12  %   $      � w�    ,      � -       � u  %  K     �*� ��3� w*� ��3� l� &� (*� �� w�6*� ��9N*-�?*�CN-*� �*�DW*� ��3� J�L� 4R�L� +N� �-�T�Z  � �� �-�]� �� `� ��b�   ^ aU  ,   N   � � � � '� /� 4� 9� E� O� X� ^� a� b� q� {� ~� �� �� -   4    � �      � �     � �   / /ef  b gh  �    � XE�    U
  � �  %  @     �*� ��3� *� ��3� h� &� (*� ��i*� �� w�6*� ��9:*�?*�C:*� �*�DWR�L� .:� ��T�l  � �� ��]� �� `� ��b�   X [U  ,   J   � � � � &� 0� 9� ?� E� R� X� [� ]� m� x� {� �� �� -   >    � �      � �     � �     �m   9 ef  ] gh  �    � DU
 AB  %   �     :� &� 
� (� 
*� <� '*+�n*� �+�o*� �*� � &� (+�r*� <�    ,      � � � "� 4� 9� -       : �      :ef  �    # 	vw  %   D     � Y�x�y�y�{�    ,      � 
� � -       ~   � $  %   g     )*� Q��*� Y��*� ]��*� e��*� a���    ,      � � � �  � (� -       ) �     $  %   g     )*� Q��*� Y��*� ]��*� e��*� a���    ,      � � � �  � (� -       ) �    � $  %   g     )*� Q��*� Y��*� ]��*� a��*� e���    ,      & ' ( )  * (+ -       ) �    �   ��   J � �� �� �� �� �� �� �� �� �� �� �� ��     g � � � ��� �     g�PK
    �k]X��3;  ;     Lab4/src/BarChart.java/* 
* BarChart Code
*/

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.*;
import javax.swing.JFrame;
import java.awt.Color;

 public class BarChart implements ImageObserver
 {
  public static final int XMAX = 400;
  public static final int XSTART = 60;
  public static final int [] YMAX = { 220, 320, 420, 520 };

  // hard code an array of 4 colors
  private Color [] colors = { Color.BLUE, new Color( 150, 150, 0 ), 
                              Color.DARK_GRAY, Color.MAGENTA };
  private int [][] data;

  private int barSize;
  private int xStart;
  private int activity = 5;
  private int count = 0;
  private int studentResult;
  private int exactFrequencyCount;
  private int exactMinimum;
  private int key;
  private boolean checkNewValues;

  public BarChart( )
  { }

  public BarChart( int [][] dArray )
  {
   data = new int [dArray.length][dArray[0].length];
   for ( int i = 0; i < dArray.length; i++ )
   {
    for ( int j = 0; j < dArray[i].length; j++ )
    {
      data[i][j] = dArray[i][j];
    }
   }
   barSize = ( XMAX - 20 ) / data[0].length;
   studentResult = -1;
   exactFrequencyCount = -1;
   exactMinimum = -1;
   key = -1;
   checkNewValues = true;
  }

  public void setArray( int [][] dArray )
  {
   for ( int i = 0; i < dArray.length; i++ )
   {
    for ( int j = 0; j < dArray[i].length; j++ )
    {
      data[i][j] = dArray[i][j];
    }
   }
  }

 public void setStudentResult( int newStudentResult )
 {
   studentResult = newStudentResult;
 }

 public void setKey( int newKey )
 {
   key = newKey;
 }

 public int getExactFrequencyCount( )
 {
   return exactFrequencyCount;
 }

 public int getExactMinimum( )
 {
   return exactMinimum;
 }

 public boolean getCheckNewValues( )
 {
   return checkNewValues;
 }

 public void setActivity( int a )
 {
   activity = a;
 }

 public int getActivity( )
 {
   return activity;
 }

 public void updateBarChart( int key, int index1, int index2, Graphics g )
 {
   draw( g );
   switch( activity )
    {
     case( 0 ): // create new array values
                // drawNewArray( index1, index2, g );
                break;
     case( 1 ): // print out the array
                drawArray( index1, index2, g );
                break;
     case( 2 ): // set all array values of a row to a certain value
                drawNewValue( index1, index2, g );
                break;
     case( 3 ): // find the minimum  in a row
                drawMinimum( index1, index2, g );
                break;
     case( 4 ): // find the frequency of a value
          drawFrequency( index1, index2, key, g );
          break;
    }
 }

 public void draw( Graphics g )
 {
   // Draws the original array in 4 colors
   for ( int i = 0; i < data.length; i++ )
   {
     xStart = XSTART;
     g.setColor( colors[i] );

     g.drawString( "Row " + i, xStart - 50, YMAX[i] );

     for ( int j = 0; j < data[i].length; j++ )
     {
       g.fillRect( xStart, YMAX[i]-data[i][j], barSize-5, data[i][j] );
       g.drawString( "" + data[i][j], xStart, YMAX[i] + 15 );
       xStart += barSize;
     }
   }
 }

 public void drawArray( int index1, int index2, Graphics g )
 {
   // called to "print out the array"
   // index1 must be less than 4
   g.setColor( Color.red );

   for ( int i = 0; i < index1; i++ )
   {
     xStart = XSTART;
     for ( int j = 0; j < data[i].length; j++ )
     {
       g.fillRect( xStart, YMAX[i]-data[i][j], barSize-5, data[i][j] );
       g.drawString( "" + data[i][j], xStart, YMAX[i] + 15 );
       xStart += barSize;
     }
   }

   xStart = XSTART;
   for ( int j = 0; j <= index2; j++ )
   {
     g.fillRect( xStart, YMAX[index1]-data[index1][j], barSize-5, data[index1][j] );
     g.drawString( "" + data[index1][j], xStart, YMAX[index1] + 15 );
     xStart += barSize;
   }
 }

 public void drawNewValue( int index1, int index2, Graphics g )
 {
   g.setColor( Color.blue );
   String s = "";
   checkCurrentNewValues( index1, index2 );
   if ( checkNewValues )
      s = "correctly";
   else
      s = "incorrectly";
   g.drawString( "Setting new array elements of row " + index1 + " to " + key, 25, 110 );
   g.drawString( "Up to index " + index2 + " , the new values are set " + s, 25, 130 );

   // set all values of a row to a certain value
   g.setColor( Color.red );
   xStart = XSTART;
   // g.drawString( "" + data[index1][index2], xStart, YMAX[index1] + 15 );
   for ( int j = 0; j <= index2; j++ )
   {
     g.drawString( "" + data[index1][index2], xStart, YMAX[index1] + 15 );
     g.fillRect( xStart, YMAX[index1]-data[index1][j], barSize-5, data[index1][j] );
     xStart += barSize;
   }
 }

 public void drawMinimum( int index1, int index2, Graphics g )
 {
   int b = findSubMinimum( index1, index2 );
   if ( index2 != -1 )
   {
     g.setColor( Color.BLUE );
     g.drawString( "Your current minimum in column " + index2 + ": " + studentResult, 25, 110 );
     exactMinimum = b;
     g.drawString( "Correct current minimum in column " + index2 + ": " + exactMinimum, 25, 130 );

     g.setColor( Color.RED );
     xStart = XSTART + index2 * barSize;
     g.drawRect( xStart, YMAX[index1] - data[index1][index2], barSize-5, data[index1][index2] );
     g.drawString( "" + data[index1][index2], xStart, YMAX[index1] + 15 );
     for ( int i = 0; i <= index1; i++ )
     {
       if ( data[i][index2] == b )
       {
         g.setColor( Color.RED );
         g.fillRect( xStart, YMAX[i] - data[i][index2], barSize-5, data[i][index2] );
         break;
       }
     }
   }
 }

 public int findSubMinimum( int index1, int index2 )
 {
   int minimum = data[0][index2];
   for ( int i = 1; i <= index1; i++ )
   {
     if ( minimum > data[i][index2] )
        minimum = data[i][index2];
   }
   return minimum;
 }

 public void drawFrequency( int index1, int index2, int value, Graphics g )
 {
   // called to count frequency of a value
   // index1 must be less than 4
   // index2 must be less than 20

   g.setColor( Color.BLUE );
   g.drawString( "Your current frequency count: " + studentResult, 25, 110 );
   exactFrequencyCount = findExactFrequencyCount( index1, index2, value );
   g.drawString( "Correct current frequency count: " + exactFrequencyCount, 25, 130 );

   g.setColor( Color.RED );
   for ( int i = 0; i < index1; i++ )
   {
     xStart = XSTART;
     for ( int j = 0; j < data[i].length; j++ )
     {
       if ( data[i][j] == value )
          g.fillRect( xStart, YMAX[i]-data[i][j], barSize-5, data[i][j] );
       xStart += barSize;
     }
   }

   // last row (incomplete)
   xStart = XSTART + barSize * index2;
   g.drawRect( xStart, YMAX[index1]-value, barSize-5, value );
   g.drawString( "" + data[index1][index2], xStart, YMAX[index1] + 15 );
   xStart = XSTART;
   for ( int j = 0; j <= index2; j++ )
   {
     if ( data[index1][j] == value )
        g.fillRect( xStart, YMAX[index1]-data[index1][j], barSize-5, data[index1][j] );
     xStart += barSize;
   }
 }

 public int findExactFrequencyCount( int rowIndex, int colIndex, int searchValue )
 {
  int currentCount = 0;
  for ( int i = 0; i < rowIndex; i++ )
  {
   for( int j = 0; j < data[i].length; j++ )
   {
     if ( data[i][j] == searchValue )
       currentCount++;
   }
  }
  // check current row now
  for (int j = 0; j <= colIndex; j++ )
  {
   if ( data[rowIndex][j] == searchValue )
      currentCount++;
  }

  return currentCount;
 }

 public void checkCurrentNewValues( int index1, int index2 )
 {
   checkNewValues = true;
   for ( int i = 0; i <= index2; i++ )
   {
     if ( key != data[index1][i] )
        checkNewValues = false;
    }
 }

 public boolean imageUpdate( Image i, int infoflags, int x, int y, int width, int height )
 {
   return true;
 }
}
PK
    �}]X߷�|?  |?  !   Lab4/src/TwoDimArrayPractice.java/* TwoDimArrayPractice
*  Students Work with this Java file
*  On Multi-dimensional Arrays
*/

import java.awt.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.event.*;
import java.util.*;

public class TwoDimArrayPractice extends JFrame
{
   // GUI components
   private JButton fillValues;
   private JButton printArray;
   private JButton setValues;
   private JButton findMinimum;
   private JButton countFrequency;

   private ButtonHandler bh;

   private static int [][] intArray;
   private final int ROWS = 4;
   private final int COLUMNS = 20;
   private static int current1 = -1;
   private static int current2 = -1;
   private int key;
   private int rowSelected = -1;
   private int columnSelected = -1;
   private BarChart bc;
   private static int counter = 0;

   private static TwoDimArrayPractice app;
   private boolean firstTime = true;

   private Image offscreen;

   public TwoDimArrayPractice( )
   {
      super( "Choose your activity" );
      Container c = getContentPane( );
      c.setLayout( new FlowLayout( ) );

      fillValues = new JButton( "Fill Values" );
      c.add( fillValues );
      printArray = new JButton( "Print Array" );
      c.add( printArray );
      setValues = new JButton( "Set Values" );
      c.add( setValues );
      findMinimum = new JButton( "Find Minimum" );
      c.add( findMinimum );
      countFrequency = new JButton( "Count Frequency" );
      c.add( countFrequency );

      bh = new ButtonHandler( );
      fillValues.addActionListener( bh );
      printArray.addActionListener( bh );
      setValues.addActionListener( bh );
      findMinimum.addActionListener( bh );
      countFrequency.addActionListener( bh );

      setSize( 500,550 );

      intArray = new int[ROWS][COLUMNS];

      // fill with random numbers between 50 and 80
      Random rand = new Random( );
      for ( int i = 0; i < intArray.length; i++ )
      {
       for ( int j = 0; j < intArray[0].length; j++ )
       {
         intArray[i][j] =  rand.nextInt( 31 ) + 50;
       }
      }

      bc = new BarChart( intArray );

      // print the array values
      System.out.println( "Row\tValue" );
      for ( int i = 0; i < intArray.length; i++ )
      {
        System.out.print( i + "\t" );
        for ( int j = 0; j < intArray[i].length; j++ )
        {
          System.out.print( intArray[i][j] + " " );
        }
        System.out.println( );
      }
      System.out.println( );

      setVisible( true );
      offscreen = this.createImage( getSize( ).width, getSize( ).height );
   }

   // 1.  This method has been coded as an example
   /** Fills the array with random numbers between 50 and 80
   *  The instance variable named intArray is the integer array to be
   *  filled with values
   */
   public void fillValues( )
   {
    Random rand = new Random( );
    for ( int row = 0; row < intArray.length; row++ )
    {
        System.out.print( row + "\t" );
        for ( int column = 0; column < intArray[row].length; column++ )
        {
          intArray[row][column] = rand.nextInt( 31 ) + 50;
          animate( row, column );  // needed to create visual feedback
        }
        System.out.println( );
    }
   }
   // end of fillValues method

   // 2.  Student writes this method
   /** Prints array to the console, elements are separated by a space
   *    The instance variable named intArray is the integer array to be printed
   */
   public void printArray( )
   {
	    // Note:  To animate the algorithm, put this method call as the
	    // last element in your inner for loop
	    //    animate( row, column );
	    //  where row is the index of the array's current row
	    //  and column is the index of the array's current column
	    // Write your code here:
	   for (int row = 0; row < intArray.length; row++) {
		   for (int column = 0; column < intArray[row].length; column++) {
			   System.out.print(intArray[row][column] + " ");
			   
			   animate(row, column);
		   }
		   
		   System.out.println();
		   
		   }
	   }
   
 
  // end of printArray method

   // ***** 3.  Student writes this method
   /** Sets all the elements in the specified row to the specified value
   *    The instance variable named intArray is the integer array
   *  @param value  the value to assign to the element of the row
   *  @param row  the row in which to set the elements to value
   */
   public void setValues( int value, int row )
   {
    // Note:  To animate the algorithm, put this method call as the
    // last element in your for loop
    //    animate( row, column );
    //  where row is the index of the array's current row
    //  and column is the index of the array's current column
    // Write your code here:
	   for(int column = 0; column < intArray[row].length; column++) {
		   intArray[row][column] = value;
		   
		   animate(row, column);
	   }



   }
   // end of setValues method

   // 4.  Student writes this method
   /** Finds minimum value in the specified column
   *    The instance variable named intArray is the integer array
   *  @param column the column to search
   *  @return   the minimum value found in the column
   */
   public int findMinimum( int column )
   {
    // Note:  To animate the algorithm, put this method call as the
    // last element in your for loop
    //    animate( row, column, minimum );
    //  where row is the index of the array's current row,
    //        column is the index of the array's current column
    //        minimum is the local variable storing the current minimum
    // Write your code here:
	   int minimum = Integer.MAX_VALUE;
	   
	   for (int row = 0; row < intArray.length; row++) {
		   if (intArray[row][column] < minimum) {
			   minimum = intArray[row][column];
		   }
		   animate(row, column, minimum);
	   }

      return minimum; // replace this line with your return statement
   }
   // end of findMinimumn method

   // 5.  Student writes this method
   /** Finds the number of times value is found in the array
   *    The instance variable named intArray is the integer array
   *  @param value  the value to count
   *  @return   the number of times value was found
   */
   public int countFound( int value )
   {
    // Note:  To animate the algorithm, put this method call as the
    // last element in your inner for loop
    //    animate( row, column, num );
    //  where row is the index of the array's current row,
    //        column is the index of the array's current column, and
    //        num is the local variable storing the current frequency count
    // Write your code here:
	   int frequency = 0;
	   
	   for (int row = 0; row < intArray.length; row++) {
		   for (int column = 0; column < intArray[row].length; column++) {
			   
			   if (intArray[row][column] == value) {
				   
				   frequency++;
			   }
			   
			   animate(row, column, frequency);
		   }
	   }

     return frequency; // replace this line with your return statement
   }
   // end of countFound method

   public void startActivity( int act )
   {
      bc.setActivity( act );
      boolean goodInput = false;
      String answer = "";
      switch( act )
      {
       case( 0 ): fillValues( );
                  JOptionPane.showMessageDialog( null, "Array filled with new values" );
                  break;

       case( 1 ): printArray( );
                  JOptionPane.showMessageDialog( null, "Array printed" );
                  break;

       case( 2 ):
        while ( !goodInput || key < 50 || key > 80 )
        {
         try
         {
           answer = JOptionPane.showInputDialog( null, "Enter a value between 50 and 80" );
           if ( answer != null )
           {
             key = Integer.parseInt( answer );
             goodInput = true;
           }
           else
           {
             goodInput = false;
             break;
           }
        }
        catch( Exception e )
        {}
       }
       if ( goodInput )
       {
        goodInput = false;
        while ( !goodInput || rowSelected < 0 || rowSelected > 3 )
        {
         try
         {
           answer = JOptionPane.showInputDialog( null, "Enter a row number between 0 and 3" );
           if ( answer != null )
           {
              rowSelected = Integer.parseInt( answer );
              goodInput = true;
           }
           else
           {
              goodInput = false;
              break;
           }
         }
         catch( Exception e )
         {}
        }
      }
      if ( goodInput )
      {
        bc.setKey ( key );
        setValues( key, rowSelected );
        String message = "";
        if ( bc.getCheckNewValues( ) )
          message = " correctly";
        else
          message = " incorrectly";
        JOptionPane.showMessageDialog( null, "Values in row " + rowSelected + " set to " + key + message );
      }
      break;

     case( 3 ):
      while ( !goodInput || columnSelected < 0 || columnSelected > 19 )
      {
       try
       {
         answer = JOptionPane.showInputDialog( null, "Enter a column number between 0 and 19" );
         if ( answer != null )
         {
           columnSelected = Integer.parseInt( answer );
           goodInput = true;
         }
         else
         {
           goodInput = false;
           break;
         }
       }
       catch( Exception e )
       {}
      }
      if ( goodInput )
      {
       int a = findMinimum( columnSelected );
       String feedbackMin = "";
       if ( a == bc.getExactMinimum( ) )
        feedbackMin = "\nThis is correct";
       else
        feedbackMin = "\nThis is incorrect";
      
   String displayMessageMin = "In column " + columnSelected + ", you found a minimum value of ";
       displayMessageMin += a + feedbackMin;
       JOptionPane.showMessageDialog( null, displayMessageMin );
      }
      break;
     case( 4 ):
      while ( !goodInput || key < 50 || key > 80 )
      {
       try
       {
         answer = JOptionPane.showInputDialog( null, "Enter a value between 50 and 80" );
         if ( answer != null )
         {
           key = Integer.parseInt( answer );
           goodInput = true;
         }
         else
         {
           goodInput = false;
           break;
         }
       }
       catch( Exception e )
       {}
      }
      if ( goodInput )
      {
       int frequency = countFound( key );
       String feedbackFrequency = "";
       if ( frequency == bc.getExactFrequencyCount( ) )
        feedbackFrequency = "\nThis is correct";
       else
        feedbackFrequency = "\nThis is incorrect";
       
   String plural = "";
       if ( frequency != 1 )
        plural = "s";
      
   String displayMessageFrequency = "You found " + key + " " + frequency + " time" + plural;
       displayMessageFrequency+= feedbackFrequency;
   
       if ( frequency != -1 )
         JOptionPane.showMessageDialog( null, displayMessageFrequency );
       else
         JOptionPane.showMessageDialog( null, "You did not find the value " + key );
      }
     break;
     }
     enableButtons( );
   }

   public static int getCurrent1( )
   {
    return current1;
   }

   public static int getCurrent2( )
   {
    return current2;
   }

   public static int getCounter( )
   {
    return counter;
   }

   public static int [][] getArray( )
   {
    return intArray;
   }

   private void animate( int row, int column )
   {
     if ( bc.getActivity( ) >= 0 && bc.getActivity( ) <= 2 )
     {
      try
      {
       current1 = row;
       current2 = column;
       bc.setArray( intArray );

       Graphics g = offscreen.getGraphics( );
       paint( g );
       g = this.getGraphics( );
       g.drawImage( offscreen, 0, 0, this );

       if ( bc.getActivity( ) == 0 )
          Thread.sleep( 200 );
       else
          Thread.sleep( 500 );
      }
      catch ( InterruptedException e )
      {
       System.out.println( "IE Exception " + e.getMessage( ) );
       System.out.println( e.toString( ) );
      }
     }
     else
     {
      // call to animate with wrong number of arguments
      JOptionPane.showMessageDialog( null, "Wrong number of arguments to animate method" );
      System.exit( 1 );
     }
    }

    private void animate( int row, int column, int intermedResult )
    {
     if ( bc.getActivity( ) == 3 || bc.getActivity( ) == 4 )
     {
      try
      {
       current1 = row;
       current2 = column;
       bc.setStudentResult( intermedResult );
       bc.setArray( intArray );

       Graphics g = offscreen.getGraphics( );
       paint( g );
       g = this.getGraphics( );
       g.drawImage( offscreen, 0, 0, this );

       Thread.sleep( 500 );
      }
      catch ( InterruptedException e )
      {
       System.out.println( "IE Exception " + e.getMessage( ) );
       System.out.println( e.toString( ) );
      }
     }
     else
     {
      // call to animate has wrong number of arguments
      JOptionPane.showMessageDialog( null, "Wrong number of arguments to animate method" );
      System.exit( 1 );
     }
    }

    public void paint( Graphics g )
    {
      if ( ( current1 != -1 && current2 != -1 ) || firstTime )
      {
         super.paint( g );
         bc.draw( g );
         bc.updateBarChart( key, current1, current2, g );
         firstTime = false;
      }
    }

    public static void main( String [] args )
    {
      app = new TwoDimArrayPractice( );
      app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }

    public void disableButtons( )
    {
     fillValues.setEnabled( false );
     printArray.setEnabled( false );
     setValues.setEnabled( false );
     countFrequency.setEnabled( false );
     findMinimum.setEnabled( false );
    }

    public void enableButtons( )
    {
     fillValues.setEnabled( true );
     printArray.setEnabled( true );
     setValues.setEnabled( true );
     countFrequency.setEnabled( true );
     findMinimum.setEnabled( true );
    }

    private class ButtonHandler implements ActionListener
    {
     private boolean on = true;
     public void actionPerformed( ActionEvent e )
     {
       PrintArrayT t = new PrintArrayT( app );

      if ( e.getSource( ) == fillValues )
      {
        disableButtons( );
        fillValues.requestFocus( );
        bc.setActivity( 0 );
        disableButtons( );
        t.start( );
      }
      else if ( e.getSource( ) == printArray )
      {
        disableButtons( );
        printArray.requestFocus( );
        bc.setActivity( 1 );
        t.start( );
      }
      else if ( e.getSource( ) == setValues )
      {
        disableButtons( );
        setValues.requestFocus( );
        bc.setActivity( 2 );
        t.start( );
      }
      else if ( e.getSource( ) == findMinimum )
      {
        disableButtons( );
        findMinimum.requestFocus( );
        bc.setActivity( 3 );
        t.start( );
      }
      else if ( e.getSource( ) == countFrequency )
      {
        disableButtons( );
        countFrequency.requestFocus( );
        bc.setActivity( 4 );
        t.start( );
      }
    }
   }

   public void resetButtonSelection( )
   {
      fillValues.setSelected( false );
      printArray.setSelected( false );
      setValues.setSelected( false );
      findMinimum.setSelected( false );
      countFrequency.setSelected( false );
   }

   private class PrintArrayT extends Thread
   {
     int [][] arr;
     TwoDimArrayPractice s1;
     public PrintArrayT ( TwoDimArrayPractice s )
     {
       arr = TwoDimArrayPractice.intArray;
       s1 = s;
     }
     public void run( )
     {
       startActivity( bc.getActivity( ) );
       enableButtons( );
       // deselectButtons( );
     }
   }
}
PK
 
    �l]X��	)  )                   Lab4/.classpathPK
 
    �k]X\�K�k  k               V  Lab4/.projectPK
 
    �k]X��M7   7   /             �  Lab4/.settings/org.eclipse.core.resources.prefsPK
 
    �k]X͈[I�  �  )             p  Lab4/.settings/org.eclipse.jdt.core.prefsPK
 
    �l]X�n�P�  �               �  Lab4/bin/BarChart.classPK
 
    �}]XK�v�  �  0             �#  Lab4/bin/TwoDimArrayPractice$ButtonHandler.classPK
 
    �}]X ��I  I  .             }*  Lab4/bin/TwoDimArrayPractice$PrintArrayT.classPK
 
    �}]Xǘ�F%  F%  "             .  Lab4/bin/TwoDimArrayPractice.classPK
 
    �k]X��3;  ;               �S  Lab4/src/BarChart.javaPK
 
    �}]X߷�|?  |?  !             s  Lab4/src/TwoDimArrayPractice.javaPK    
 
   ²    