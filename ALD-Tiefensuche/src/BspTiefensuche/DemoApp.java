package BspTiefensuche;

public class DemoApp {

	public static void main(String[] args) {

		Tiefensuche tf = new Tiefensuche();
		
		tf.add(new Film("The Jungle Book", 150));
		tf.add(new Film("The First Avenger: Civil War", 123));
		tf.add(new Film("How to Be Single", 114));
		tf.add(new Film("Zoomania - Ganz schön ausgefuchst!", 91));
		tf.add(new Film("Ein Hologramm für den König", 85));
		tf.add(new Film("The Boss - Dick im Geschäft ", 116));
		tf.add(new Film("The Huntsman & the Ice Queen", 121));
		tf.add(new Film("Gods of Egypt", 102));
		tf.add(new Film("Bad Neighbors 2", 87));
		tf.add(new Film("Wild", 111));
				
		tf.printTree();
		
		System.out.println("-------------------------");
		System.out.println("-------------getNodesInOrder------------");
		System.out.println("-------------------------");
		
		for (String title : tf.getNodesInOrder(tf.getRoot()))
		{
			System.out.println(title);
		}
		
				
		System.out.println("-------------------------");
		System.out.println("-----------getMinMaxPreOrder-------------");
		System.out.println("-------------------------");
		
		for (String title : tf.getMinMaxPreOrder(90, 120))
		{
			System.out.println(title);
		}

	}

}
