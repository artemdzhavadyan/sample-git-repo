package net.absoft.mortalwombat;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AgeCheckerClass {

    @Test
    public void testAgedUserCanPlay() {
        AgeChecker ageChecker = new AgeChecker();
        Assert.assertTrue(ageChecker.canPlayGame(19), "Aged user can't play game");
    }
    @Test
    public void tooYoungUser() {
        AgeChecker ageCheckerNew = new AgeChecker();
        Assert.assertTrue(ageCheckerNew.testThatTooYoungUsersCanNotPlay(19), "Aged user can't play game");
    }

}
