package org.example;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class runTests {
    private algo algo;
    private Map<String, Boolean> examples;

    @BeforeAll
    public void setUp() {
        algo = new algo();
        examples = new HashMap<>();
        // Add your examples here
        examples.put("()", true);
        examples.put("()[]{}", true);
        // Add more examples
    }

    @Test
    public void testAlgoIsValid() {
        int correctCount = 0;
        createHashMap();
        for (Map.Entry<String, Boolean> entry : examples.entrySet()) {
            String example = entry.getKey();
            boolean expected = entry.getValue();
            boolean isValid = algo.isValid(example);

            String message = "Input: " + example + ", Output: " + isValid + ", Expected: " + expected;
            if(isValid != expected){
                System.out.println(message);
            }
            else {
                correctCount++;
            }
        }
        System.out.println("Tests passed: " + correctCount + " out of " + examples.size());
        assertEquals(correctCount, examples.size(), "Tests failed");
    }

    public void createHashMap() {
         examples = new HashMap<>();
            examples.put("()", true);
            examples.put("()[]{}", true);
            examples.put("(]", false);
            examples.put("([)]", false);
            examples.put("{[]}", true);
            examples.put("[[[]]]", true);
            examples.put("[[{(())}]]", true);
            examples.put("[[({})]]", true);
            examples.put("{[()]}", true);
            examples.put("{[()]", false);
            examples.put("((()))", true);
            examples.put("((((()))))", true);
            examples.put("{[({})]}", true);
            examples.put("()()()", true);
            examples.put("({[]})", true);
            examples.put("([{}])", true);
            examples.put("({[]})", true);
            examples.put("({[{()}]})", true);
            examples.put("{[(]{}]}", false);
            examples.put("(){()]", false);
            examples.put("{}{}{}", true);
            examples.put("({{{}}})", true);
            examples.put("({})[]{}", true);
            examples.put("[{()}]", true);
            examples.put("[()]", true);
            examples.put("[{()}]", true);
            examples.put("[[({})]]", true);
            examples.put("{[()]}", true);
            examples.put("([])", true);
            examples.put("[[({})]]", true);
            examples.put("((()))", true);
            examples.put("(((())))", true);
            examples.put("{}{}{}", true);
            examples.put("()()()", true);
            examples.put("(){]}()]", false);
            examples.put("()[]{}", true);
            examples.put("()}{}{[]", false);
            examples.put("{}{[](})", false);
            examples.put("{[]}()", true);
            examples.put("{()}[]", true);
            examples.put("{()[]}", true);
            examples.put("{[()]}", true);
            examples.put("{[({})]}", true);
            examples.put("{}()[]", true);
            examples.put("[](){}", true);
            examples.put("[]{}]()", false);
            examples.put("[{}()", false);
            examples.put("{[({})]}", true);
            examples.put("()())", false);
            examples.put("(){}(}[]", false);
            examples.put("()[}}{}()", false);
            examples.put("(){]}()", false);
            examples.put("{}[](()", false);
            examples.put("{[]}()", true);
            examples.put("{()}[]()", true);
            examples.put("{()[]}", true);
            examples.put("{[()]}", true);
            examples.put("{[({})]}", true);
            examples.put("{}()][()", false);
            examples.put("{}[()", false);
            examples.put("[](){)", false);
            examples.put("[]}()()", false);
            examples.put("{[()]", false);
            examples.put("((())", false);
            examples.put("((()))))", false);
            examples.put("{[(){}]}", true);
            examples.put("(){)}", false);
            examples.put("{}{}}", false);
            examples.put("({{{}}}]", false);
            examples.put("({)[]{}", false);
            examples.put("[{()]", false);
            examples.put("[()", false);
            examples.put("[{(}]", false);
            examples.put("[[(})]]", false);
            examples.put("{[(]}", false);
            examples.put("(])", false);
            examples.put("(()))", false);
            examples.put("({{}}}", false);
            examples.put("[[({})]]]", false);
            examples.put("{[]})", false);
            examples.put("[[{(())}}]", false);
            examples.put("(({))", false);
            examples.put("{([}})", false);
            examples.put("{[(}))", false);
            examples.put("{[({})", false);
            examples.put("{[())]}", false);
            examples.put("()[)]", false);
            examples.put("({]}", false);
            examples.put("({})", true);
            examples.put("([{}])}", false);
            examples.put("{(})", false);
            examples.put("[(})]", false);
            examples.put("{{}})", false);
            examples.put("{([]})", false);
            examples.put("{[()]", false);
            examples.put("{[()]}", false);
            examples.put("{[({})]}", false);
            examples.put("{[(})", false);
            examples.put("{[}]", false);
            examples.put("[[({})]]]", false);
            examples.put("((()))]", false);
            examples.put("((((()))))]", false);
            examples.put("{[(){}]}", true);
            examples.put("(){()}", true);
            examples.put("{}{}{}]", false);
            examples.put("({{{}}})]", false);
            examples.put("()", true);
            examples.put("[]", true);
            examples.put("{}", true);
            examples.put("(())", true);
            examples.put("[[]]", true);
            examples.put("{{}}", true);
            examples.put("{()}", true);
            examples.put("[{}]", true);
            examples.put("{[]}", true);
            examples.put("({})", true);
            examples.put("()()()", true);
            examples.put("[]{}()", true);
            examples.put("()[]{}", true);
            examples.put("{}[]()", true);
            examples.put("{[()]}", true);
            examples.put("({[]})", true);
            examples.put("[{()}]", true);
            examples.put("{[({})]}", true);
            examples.put("((()))", true);
            examples.put("{{{{}}}}", true);
    }
}