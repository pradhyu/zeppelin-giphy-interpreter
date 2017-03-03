package com.github.andfanilo.giphy;

import org.apache.zeppelin.interpreter.Interpreter;
import org.apache.zeppelin.interpreter.InterpreterContext;
import org.apache.zeppelin.interpreter.InterpreterResult;
import org.apache.zeppelin.interpreter.InterpreterResult.Code;

import java.util.Properties;

/**
 * Giphy interpreter for Zeppelin
 */
public class GiphyInterpreter extends Interpreter {
    public GiphyInterpreter(Properties property) {
        super(property);
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public InterpreterResult interpret(String s, InterpreterContext interpreterContext) {
        return new InterpreterResult(
                Code.SUCCESS,
                InterpreterResult.Type.HTML,
                "<iframe src=\"//giphy.com/embed/xUA7b1XtsUC0P6aMY8\" width=\"480\" height=\"270\" frameBorder=\"0\" class=\"giphy-embed\" allowFullScreen></iframe>"
        );
    }

    @Override
    public void cancel(InterpreterContext interpreterContext) {

    }

    @Override
    public FormType getFormType() {
        return FormType.SIMPLE;
    }

    @Override
    public int getProgress(InterpreterContext interpreterContext) {
        return 0;
    }
}
