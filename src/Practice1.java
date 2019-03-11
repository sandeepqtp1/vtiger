import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice1 {

	public static void main(String[] args) {
//		strscenario1();
		new Practice1().strScenario2();
	}

	public void strscenario1() {

		String x="**sandeepk*****jmf*add******jkl***";
		String z="";
		String x1="";
		String x2="";
		
		 int pos=0;
		 int lnth=x.length();
		for(int i=1;i<=lnth;i++) {
			if (x.trim().equalsIgnoreCase("*")) {
				x1="";
				x2="";
			}else {
			pos=x.indexOf("*");
			
			if (pos!=-1) {
				if(pos==0) {
					x1="";
				
				}else {
					x1=x.substring(0, pos-1);
				}
				
				String c=x.substring(pos,x.length());
				if(pos==0) {
					x2=x.substring(pos, x.length());
				
				}else if(x.substring(pos+1,pos+2).contains("*")) {
					x2=x.substring(pos+1, x.length());
				}else {
					x2=x.substring(pos+2, x.length());
				}
										
				z=z+"#"+x1;
				x=" "+x2;
				
			}else {
				break;
			}						
		}
		}
		z=z+x2;
		z=z.replaceAll("#", "").replaceAll(" ", "");
		System.out.println(z);
	}
	
	public void strScenario2() {
		String strVal="SaSndeep KumaRR Yadav";
		String strPattern="[A-Z]*";
		Pattern p=Pattern.compile(strPattern);
		Matcher m=p.matcher(strVal);
		int gi=m.groupCount();
		
		System.out.println(m.group(0).length());
		
		
	}

}
