����   B o  BaiTap/Buoi8  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LBaiTap/Buoi8; max (III)I a I b c StackMapTable isEven (I)Z n sum 
arithmetic (FFI)F	    java/lang/System    out Ljava/io/PrintStream; " (Không tồn tại phương thức này!
 $ & % java/io/PrintStream ' ( println (Ljava/lang/String;)V F operator main ([Ljava/lang/String;)V . java/util/Scanner	  0 1 2 in Ljava/io/InputStream;
 - 4  5 (Ljava/io/InputStream;)V 7 Nhập 3 số a, b, c: 
 - 9 : ; nextInt ()I
  =     ? @ A makeConcatWithConstants (I)Ljava/lang/String;
  C   E Số a là số chẵn G Số a là số lẻ
  I    ? L IMời nhập phương thức (1 để cộng, 2 trừ, 3 nhân, 4 chia): 
  N    P @ Q (F)Ljava/lang/String;
 - S T  close args [Ljava/lang/String; sc Ljava/util/Scanner; V 
SourceFile 
Buoi8.java BootstrapMethods
 ^ ` _ $java/lang/invoke/StringConcatFactory @ a �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; ] d :Số lớn nhất trong 3 số a, b, c vừa nhập là:  f Tổng 3 số a, b, c là:  h :Kết quả theo phương thức bạn vừa nhập là:  InnerClasses k %java/lang/invoke/MethodHandles$Lookup m java/lang/invoke/MethodHandles Lookup !               /     *� �    
                    	       {     >� >� >�    
       	  
   	         *                              � 	 	       E     
p� ��    
                   
          	       D     ``�    
                                 	       �     .� "#b�� "#f�� "#j�� "#n�� !� #�    
   * 
   "  # 	 %  &  (  )  +   , $ / , 0         .  )     .  )    . *       	 	 + ,    1     �� -Y� /� 3L� 6� #+� 8=+� 8>+� 86� � <� >  � #� B� � D� #� � F� #� � H� J  � #� K� #+� 86� ��� M� O  � #+� R�    
   :    5  7  8 # ; 5 > < ? D @ G B O F a I i J o K � M � N    >    � U V    } W X   p     k    # e    o  *       � G  Y -    Z    [ \     b  c b  e b  g i   
  j l n 