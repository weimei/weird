/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ili.base.webbeans.commons;

import javax.inject.Inject;
import net.ili.base.SuperSpringTestCase;
import net.ili.base.entities.organization.Organization;
import net.ili.base.services.organization.OrganizationService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

/**
 *
 * @author Weir
 */
public class PrimeFacesTreeBuilderTest extends SuperSpringTestCase {

    @Inject
    OrganizationService oserv;
    Organization org;

    public PrimeFacesTreeBuilderTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testBuiderTreeNode() {
        TreeNode tree;
//        id = 97
        Long id = 97L;
        tree = PrimeFacesTreeBuilder.buildTree(oserv.getAll(), new Organization());
//        tree = PrimeFacesTreeBuilder.buildTree(oserv.getAll(), oserv.getOne(id));

//        System.out.println("tree.getChildCount() = " + tree.);
    }

}
