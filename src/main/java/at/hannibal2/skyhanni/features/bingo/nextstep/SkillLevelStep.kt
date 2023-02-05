package at.hannibal2.skyhanni.features.bingo.nextstep

import at.hannibal2.skyhanni.data.SkillExperience

class SkillLevelStep(
    val skillName: String,
    val skillLevelNeeded: Int,
    skillExpNeeded: Long = SkillExperience.getExpForLevel(skillLevelNeeded)
) :
    ProgressionStep("$skillName $skillLevelNeeded", skillExpNeeded)