/*
 * This file is part of OpenVPN-Settings.
 *
 * Copyright © 2009-2012  Friedrich Schäuffelhut
 *
 * OpenVPN-Settings is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * OpenVPN-Settings is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with OpenVPN-Settings.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Report bugs or new features at: http://code.google.com/p/android-openvpn-settings/
 * Contact the author at:          android.openvpn@schaeuffelhut.de
 */

package de.schaeuffelhut.android.openvpn;

import de.schaeuffelhut.android.openvpn.setup.Prerequisites;
import de.schaeuffelhut.android.openvpn.setup.PrerequisitesImpl;

/**
 * Created with IntelliJ IDEA.
 * User: fries
 * Date: 4/10/12
 * Time: 9:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class IocContext
{
    static IocContext iocContext = new IocContext();

    public final static IocContext get()
    {
        return iocContext;
    }

    Prerequisites prerequisites;
    public Prerequisites getPrerequisites()
    {
        if ( prerequisites == null )
            prerequisites = new PrerequisitesImpl();
        return prerequisites;
    }
    public void setPrerequisites(Prerequisites prerequisites)
    {
        this.prerequisites = prerequisites;
    }

}
