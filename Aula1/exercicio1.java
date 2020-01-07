/* *****************************************************************************

#include <stdio.h>

int main()
{
	const int MAX = 3;
    float altura_1, altura_2, altura_3;
    float media;
    
    altura_1=1.58;
    altura_2=2.07;
    altura_3=0.55;
    
    media = (altura_1+altura_2+altura_3)/MAX;
    
    printf("Media = %.3f", media);


    return 0;
}


****************************************************************************** */

package aula1;

import java.text.DecimalFormat;

public class Media {

	public static void main(String[] args) {

		final int MAX = 3;
		float altura_1, altura_2, altura_3;
	    float media;
	    DecimalFormat mascara = new DecimalFormat("0.000");
	    
	    altura_1=1.58F;
	    altura_2=2.07F;
	    altura_3=0.55F;
	    
	    media = (altura_1+altura_2+altura_3)/MAX;
	    
	    System.out.println("Media = " + mascara.format(media));
	    

	}

}
