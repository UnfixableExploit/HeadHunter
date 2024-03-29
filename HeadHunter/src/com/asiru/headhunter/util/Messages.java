package com.asiru.headhunter.util;

public class Messages {
	public static final String	NO_ARGS = 				"�6/hunter help",
								NO_PERMS = 				"�cYou don't have permission!",
								PLAYERS_ONLY = 			"�cThis command is for players only!",
								WORLD_ADDED = 			"�aHeadHunter world added!",
								WORLD_REMOVED = 		"�aHeadHunter world removed!",
								SIGN_CREATE =			"�aHeadHunter sign created!",
								SIGN_BREAK =			"�aHeadHunter sign removed!",
								SIGN_UPDATE =			"�6Sign updated.",
								WORLD_EXISTS = 			"�cThat world is already a HeadHunter world!",
								WORLD_INVALID = 		"�cThat world is not a HeadHunter world!",
								HEAD_INVALID = 			"�cThis skull is invalid!",
								NO_HEADS = 				"�cYou are not holding player heads!",
								NO_SKULLS = 			"�cYou are not holding any heads!",
								NO_BOUNTIES =			"�cThere are no bounties!",
								BOUNTY_INVALID = 		"�cThat bounty does not exist!",
								BOUNTY_DISABLED = 		"�cBounties are disabled!",
								BOUNTIES_INVISIBLE =	"�cBounties cannot be displayed in a list!",
								AMOUNT_INVALID = 		"�cThat is an invalid amount!",
								SELF_TARGET = 			"�cYou cannot target yourself!",
								HOARD_MODE =			"�cYou cannot do that in Hoarder Mode!",
								CMD_ADD = 				"�6Usage: /hunter addworld <world>",
								CMD_REMOVE = 			"�6Usage: /hunter removeworld <world>",
								CMD_BOUNTY = 			"�6Usage: /hunter bounty <add | remove | check | list>",
								CMD_BOUNTY_CHECK = 		"�6Usage: /hunter bounty check <target>",
								CMD_BOUNTY_REMOVE = 	"�6Usage: /hunter bounty remove <target> [amount]",
								CMD_BOUNTY_ADD = 		"�6Usage: /hunter bounty add <target> <amount>",
								CMD_RELOAD_ERR =		"�6You cannot reload that file!";
	
	public static final String[] 	HELP_NORMAL = { "&6---=< &eHeadHunter Help &6>=---", 
													"&6/hunter help", 
													"   &eOpen this help message", 
													"&6/hunter sellhead", 
													"   &eSell one head from your inventory", 
													"&6/hunter bounty <add | remove | check | list>", 
													"   &eSet a bounty on a player's head" },
													
									HELP_ADMIN	= {	"&6/hunter addworld <world>", 
													"   &eAdd a HeadHunter world", 
													"&6/hunter removeworld <world>", 
													"   &eRemove a HeadHunter world", 
													"&6/hunter reload", 
													"   &eReload the HeadHunter files" };
	
}