/*
 *  SoapUI, copyright (C) 2004-2014 smartbear.com
 *
 *  SoapUI is free software; you can redistribute it and/or modify it under the
 *  terms of version 2.1 of the GNU Lesser General Public License as published by 
 *  the Free Software Foundation.
 *
 *  SoapUI is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 *  even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
 *  See the GNU Lesser General Public License for more details at gnu.org.
 */
package com.eviware.soapui.impl.actions;

import com.eviware.soapui.model.workspace.Workspace;

import java.util.List;

public class InternalBrowserDiscoveryFactory implements DiscoveryMethodFactory {
    @Override
    public DiscoveryMethod createNewDiscoveryMethod() {
        return new InternalBrowserDiscoveryMethod();
    }

    private class InternalBrowserDiscoveryMethod implements DiscoveryMethod {
        @Override
        public boolean isSynchronous() {
            return false;
        }

        @Override
        public void discoverResources(Workspace workspace) {
            System.out.println("Discover it");
        }

        @Override
        public List<Object> discoverResourcesSynchronously(Workspace workspace) {
            throw new UnsupportedOperationException("Internal browser discovery is not synchronous");
        }

        @Override
        public String toString() {
            return "Discover REST resources";
        }
    }
}