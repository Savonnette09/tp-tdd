package iut.tdd;

public class Convert {
	public static String num2text(String input) {
		if(input=="0"){
			return "zéro" ;
		}else if (input=="1"){
			return "un" ;
		}else if (input=="2"){
			return "deux" ;
		}else if (input=="3"){
			return "trois" ;
		}else if (input=="4"){
			return "quatre" ;
		}else if (input=="5"){
			return "cinq" ;
		}else if (input=="6"){
			return "six" ;
		}else if (input=="7"){
			return "sept" ;
		}else if (input=="8"){
			return "huit" ;
		}else if (input=="9"){
			return "neuf" ;
		}else if (input=="10"){
			return "dix" ;
		}else if (input=="11"){
			return "onze" ;
		}else if (input=="12"){
			return "douze" ;
		}else if (input=="13"){
			return "treize" ;
		}else if (input=="14"){
			return "quatorze" ;
		}else if (input=="15"){
			return "quinze" ;
		}
		return "seize" ;
		
		
	}
	public static String text2num(String input) {
		return null;
	}
}