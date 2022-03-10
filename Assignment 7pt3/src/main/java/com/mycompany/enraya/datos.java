
package com.mycompany.enraya;

/**
 *
 * @author ASUS
 */
public enum datos {
    x('X'),o('O'),n('-');

    private char smb;

    private datos(char smb) {
        this.smb = smb;
    }

    public char obsmb() {
        return smb;
    }

}
