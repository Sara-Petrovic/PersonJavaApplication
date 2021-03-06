/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silab.sd.personapp.view.component.validator.impl;

import silab.sd.personapp.view.component.exception.ValidationException;
import silab.sd.personapp.view.component.validator.Validator;
//import java.util.regex.*;

/**
 *
 * @author Sara
 */
public class WordStringValidator implements Validator {
    //proveri da li je objekat tj. string rec
    //rec ima minimalnu duzinu 2, a svi znakovi moraju biti slova

    @Override
    public void validate(Object object) throws ValidationException {
        if (!(object instanceof String)) {
            throw new ValidationException("Object is not String!");
        }
        if ((object.toString().trim().length()<2 )|| !(object.toString().matches("^[a-zA-Z]*$"))) {
            throw new ValidationException("String is not a word!");
        }
    }
}
