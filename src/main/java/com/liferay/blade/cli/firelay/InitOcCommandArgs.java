package com.liferay.blade.cli.firelay;

import com.beust.jcommander.Parameters;
import com.liferay.blade.cli.command.InitArgs;

@Parameters(commandDescription = "Initializes a Liferay workspace using Openshift instead of a bundle.", 
			commandNames = { "init-oc" })
public class InitOcCommandArgs extends InitArgs {

}
