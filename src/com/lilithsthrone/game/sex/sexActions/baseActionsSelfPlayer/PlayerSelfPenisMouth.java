package com.lilithsthrone.game.sex.sexActions.baseActionsSelfPlayer;

import com.lilithsthrone.game.character.attributes.CorruptionLevel;
import com.lilithsthrone.game.dialogue.utils.UtilText;
import com.lilithsthrone.game.sex.ArousalIncrease;
import com.lilithsthrone.game.sex.Sex;
import com.lilithsthrone.game.sex.SexAreaOrifice;
import com.lilithsthrone.game.sex.SexAreaPenetration;
import com.lilithsthrone.game.sex.SexPace;
import com.lilithsthrone.game.sex.SexParticipantType;
import com.lilithsthrone.game.sex.sexActions.SexAction;
import com.lilithsthrone.game.sex.sexActions.SexActionLimitation;
import com.lilithsthrone.game.sex.sexActions.SexActionType;
import com.lilithsthrone.main.Main;
import com.lilithsthrone.utils.Util;
import com.lilithsthrone.utils.Util.Value;

public class PlayerSelfPenisMouth {
	
	public static final SexAction PLAYER_SELF_PENIS_MOUTH_PENETRATION = new SexAction(
			SexActionType.START_ONGOING,
			ArousalIncrease.THREE_NORMAL,
			ArousalIncrease.ONE_MINIMUM,
			CorruptionLevel.TWO_HORNY,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.PENIS, SexAreaOrifice.MOUTH)),
			SexParticipantType.SELF) {
		@Override
		public SexActionLimitation getLimitation() {
			return SexActionLimitation.PLAYER_ONLY;
		}
		
		@Override
		public String getActionTitle() {
			return "Perform blowjob (self)";
		}

		@Override
		public String getActionDescription() {
			return "Put your [pc.penis] in your mouth and start giving yourself a blowjob.";
		}

		@Override
		public String getDescription() {
			return "Putting your [pc.penis] up to your mouth, you slide the head past your [pc.lips+] before starting to lewdly suck on it.";
		}
	};
	
	public static final SexAction DOM_PLAYER_SELF_PENIS_MOUTH_GENTLE = new SexAction(
			SexActionType.ONGOING,
			ArousalIncrease.THREE_NORMAL,
			ArousalIncrease.ONE_MINIMUM,
			CorruptionLevel.ONE_VANILLA,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.PENIS, SexAreaOrifice.MOUTH)),
			SexParticipantType.SELF,
			SexPace.DOM_GENTLE) {
		@Override
		public SexActionLimitation getLimitation() {
			return SexActionLimitation.PLAYER_ONLY;
		}
		
		@Override
		public boolean isBaseRequirementsMet() {
			return Main.sex.isDom(Main.game.getPlayer());
		}
		
		@Override
		public String getActionTitle() {
			return "Gentle blowjob (self)";
		}
	
		@Override
		public String getActionDescription() {
			return "Gently suck your [pc.penis+].";
		}
	
		@Override
		public String getDescription() {
			return "Gently sucking your [pc.penis+], you find yourself letting out a series of delighted [pc.moans]."
		
	};
	
	public static final SexAction DOM_PLAYER_SELF_PENIS_MOUTH_NORMAL = new SexAction(
			SexActionType.ONGOING,
			ArousalIncrease.THREE_NORMAL,
			ArousalIncrease.ONE_MINIMUM,
			CorruptionLevel.ONE_VANILLA,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.PENIS, SexAreaOrifice.MOUTH)),
			SexParticipantType.SELF,
			SexPace.DOM_NORMAL) {
		@Override
		public SexActionLimitation getLimitation() {
			return SexActionLimitation.PLAYER_ONLY;
		}
		
		@Override
		public boolean isBaseRequirementsMet() {
			return Main.sex.isDom(Main.game.getPlayer());
		}
		
		@Override
		public String getActionTitle() {
			return "Perform blowjob (self)";
		}
	
		@Override
		public String getActionDescription() {
			return "Concentrate on sucking your [pc.penis+].";
		}
	
		@Override
		public String getDescription() {
			return "Sucking your [pc.penis+], you find yourself letting out a series of delighted [pc.moans]."
		
	};
	
	public static final SexAction DOM_PLAYER_SELF_PENIS_MOUTH_ROUGH = new SexAction(
			SexActionType.ONGOING,
			ArousalIncrease.THREE_NORMAL,
			ArousalIncrease.ONE_MINIMUM,
			CorruptionLevel.TWO_HORNY,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.PENIS, SexAreaOrifice.MOUTH)),
			SexParticipantType.SELF,
			SexPace.DOM_ROUGH) {
		@Override
		public SexActionLimitation getLimitation() {
			return SexActionLimitation.PLAYER_ONLY;
		}
		
		@Override
		public boolean isBaseRequirementsMet() {
			return Main.sex.isDom(Main.game.getPlayer());
		}
		
		@Override
		public String getActionTitle() {
			return "Rough blowjob (self)";
		}
	
		@Override
		public String getActionDescription() {
			return "Roughly suck your [pc.penis+].";
		}
	
		@Override
		public String getDescription() {
			return "Roughly sucking your [pc.penis+], you find yourself letting out a series of delighted [pc.moans]."
		}
	
	};
	
	public static final SexAction SUB_PLAYER_SELF_PENIS_MOUTH_NORMAL = new SexAction(
			SexActionType.ONGOING,
			ArousalIncrease.THREE_NORMAL,
			ArousalIncrease.ONE_MINIMUM,
			CorruptionLevel.ONE_VANILLA,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.PENIS, SexAreaOrifice.MOUTH)),
			SexParticipantType.SELF,
			SexPace.SUB_NORMAL) {
		@Override
		public SexActionLimitation getLimitation() {
			return SexActionLimitation.PLAYER_ONLY;
		}
		
		@Override
		public boolean isBaseRequirementsMet() {
			return !Main.sex.isDom(Main.game.getPlayer());
		}
		
		@Override
		public String getActionTitle() {
			return "Perform blowjob (self)";
		}
	
		@Override
		public String getActionDescription() {
			return "Concentrate on sucking your [pc.penis+].";
		}
	
		@Override
		public String getDescription() {
			return "Sucking your [pc.penis+], you find yourself letting out a series of delighted [pc.moans]."
		}
		
	};
	
	public static final SexAction SUB_PLAYER_SELF_PENIS_MOUTH_EAGER = new SexAction(
			SexActionType.ONGOING,
			ArousalIncrease.THREE_NORMAL,
			ArousalIncrease.ONE_MINIMUM,
			CorruptionLevel.ONE_VANILLA,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.PENIS, SexAreaOrifice.MOUTH)),
			SexParticipantType.SELF,
			SexPace.SUB_EAGER) {
		@Override
		public SexActionLimitation getLimitation() {
			return SexActionLimitation.PLAYER_ONLY;
		}
		
		@Override
		public boolean isBaseRequirementsMet() {
			return !Main.sex.isDom(Main.game.getPlayer());
		}
		
		@Override
		public String getActionTitle() {
			return "Eager blowjob (self)";
		}
	
		@Override
		public String getActionDescription() {
			return "Eagerly suck your [pc.penis+].";
		}
	
		@Override
		public String getDescription() {
			return "Enthusiastically sucking your [pc.penis+], you find yourself letting out a series of delighted [pc.moans]."
		}
	
	};
	
	public static final SexAction PLAYER_SELF_PENIS_MOUTH_STOP_PENETRATION = new SexAction(
			SexActionType.STOP_ONGOING,
			ArousalIncrease.ONE_MINIMUM,
			ArousalIncrease.ONE_MINIMUM,
			CorruptionLevel.ZERO_PURE,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.PENIS, SexAreaOrifice.MOUTH)),
			SexParticipantType.SELF) {
		@Override
		public SexActionLimitation getLimitation() {
			return SexActionLimitation.PLAYER_ONLY;
		}
		
		@Override
		public String getActionTitle() {
			return "Stop blowjob (self)";
		}

		@Override
		public String getActionDescription() {
			return "Pull your [pc.penis] out of your mouth and stop giving yourself a blowjob.";
		}

		@Override
		public String getDescription() {
			return "With a little sigh, you slide your saliva-coated [pc.penis] out of your mouth.";
		}
	};
}
