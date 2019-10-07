package dev.galasa.simbank.manager;

import dev.galasa.framework.spi.ConfigurationPropertyStoreException;
import dev.galasa.zos3270.FieldNotFoundException;
import dev.galasa.zos3270.ITerminal;
import dev.galasa.zos3270.KeyboardLockedException;
import dev.galasa.zos3270.TextNotFoundException;
import dev.galasa.zos3270.TimeoutException;
import dev.galasa.zos3270.spi.DatastreamException;
import dev.galasa.zos3270.spi.NetworkException;

public interface ISimBankTerminal extends ITerminal {

	void gotoMainMenu() throws TimeoutException, KeyboardLockedException, DatastreamException, NetworkException,
			FieldNotFoundException, TextNotFoundException, ConfigurationPropertyStoreException, SimBankManagerException;

}