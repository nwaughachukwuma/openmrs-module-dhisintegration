//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.25 at 12:24:27 AM IST 
//


package org.openmrs.module.dhisintegration.api.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="categories" type="{http://dhis2.org/schema/dxf/2.0}CategoriesType" minOccurs="0"/>
 *         &lt;element name="categoryOptionCombos" type="{http://dhis2.org/schema/dxf/2.0}CategoryCombosType" minOccurs="0"/>
 *         &lt;element name="organisationUnits" type="{http://dhis2.org/schema/dxf/2.0}OrgUnitType" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "categories",
    "categoryOptionCombos",
    "organisationUnits"
})
@XmlRootElement(name = "metaData")
public class MetaData
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    protected CategoriesType categories;
    protected CategoryCombosType categoryOptionCombos;
    protected OrgUnitType organisationUnits;

    /**
     * Gets the value of the categories property.
     * 
     * @return
     *     possible object is
     *     {@link CategoriesType }
     *     
     */
    public CategoriesType getCategories() {
        return categories;
    }

    /**
     * Sets the value of the categories property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoriesType }
     *     
     */
    public void setCategories(CategoriesType value) {
        this.categories = value;
    }

    /**
     * Gets the value of the categoryOptionCombos property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryCombosType }
     *     
     */
    public CategoryCombosType getCategoryOptionCombos() {
        return categoryOptionCombos;
    }

    /**
     * Sets the value of the categoryOptionCombos property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryCombosType }
     *     
     */
    public void setCategoryOptionCombos(CategoryCombosType value) {
        this.categoryOptionCombos = value;
    }

    /**
     * Gets the value of the organisationUnits property.
     * 
     * @return
     *     possible object is
     *     {@link OrgUnitType }
     *     
     */
    public OrgUnitType getOrganisationUnits() {
        return organisationUnits;
    }

    /**
     * Sets the value of the organisationUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgUnitType }
     *     
     */
    public void setOrganisationUnits(OrgUnitType value) {
        this.organisationUnits = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            CategoriesType theCategories;
            theCategories = this.getCategories();
            strategy.appendField(locator, this, "categories", buffer, theCategories);
        }
        {
            CategoryCombosType theCategoryOptionCombos;
            theCategoryOptionCombos = this.getCategoryOptionCombos();
            strategy.appendField(locator, this, "categoryOptionCombos", buffer, theCategoryOptionCombos);
        }
        {
            OrgUnitType theOrganisationUnits;
            theOrganisationUnits = this.getOrganisationUnits();
            strategy.appendField(locator, this, "organisationUnits", buffer, theOrganisationUnits);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MetaData)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MetaData that = ((MetaData) object);
        {
            CategoriesType lhsCategories;
            lhsCategories = this.getCategories();
            CategoriesType rhsCategories;
            rhsCategories = that.getCategories();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "categories", lhsCategories), LocatorUtils.property(thatLocator, "categories", rhsCategories), lhsCategories, rhsCategories)) {
                return false;
            }
        }
        {
            CategoryCombosType lhsCategoryOptionCombos;
            lhsCategoryOptionCombos = this.getCategoryOptionCombos();
            CategoryCombosType rhsCategoryOptionCombos;
            rhsCategoryOptionCombos = that.getCategoryOptionCombos();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "categoryOptionCombos", lhsCategoryOptionCombos), LocatorUtils.property(thatLocator, "categoryOptionCombos", rhsCategoryOptionCombos), lhsCategoryOptionCombos, rhsCategoryOptionCombos)) {
                return false;
            }
        }
        {
            OrgUnitType lhsOrganisationUnits;
            lhsOrganisationUnits = this.getOrganisationUnits();
            OrgUnitType rhsOrganisationUnits;
            rhsOrganisationUnits = that.getOrganisationUnits();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "organisationUnits", lhsOrganisationUnits), LocatorUtils.property(thatLocator, "organisationUnits", rhsOrganisationUnits), lhsOrganisationUnits, rhsOrganisationUnits)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            CategoriesType theCategories;
            theCategories = this.getCategories();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "categories", theCategories), currentHashCode, theCategories);
        }
        {
            CategoryCombosType theCategoryOptionCombos;
            theCategoryOptionCombos = this.getCategoryOptionCombos();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "categoryOptionCombos", theCategoryOptionCombos), currentHashCode, theCategoryOptionCombos);
        }
        {
            OrgUnitType theOrganisationUnits;
            theOrganisationUnits = this.getOrganisationUnits();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "organisationUnits", theOrganisationUnits), currentHashCode, theOrganisationUnits);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof MetaData) {
            final MetaData copy = ((MetaData) draftCopy);
            if (this.categories!= null) {
                CategoriesType sourceCategories;
                sourceCategories = this.getCategories();
                CategoriesType copyCategories = ((CategoriesType) strategy.copy(LocatorUtils.property(locator, "categories", sourceCategories), sourceCategories));
                copy.setCategories(copyCategories);
            } else {
                copy.categories = null;
            }
            if (this.categoryOptionCombos!= null) {
                CategoryCombosType sourceCategoryOptionCombos;
                sourceCategoryOptionCombos = this.getCategoryOptionCombos();
                CategoryCombosType copyCategoryOptionCombos = ((CategoryCombosType) strategy.copy(LocatorUtils.property(locator, "categoryOptionCombos", sourceCategoryOptionCombos), sourceCategoryOptionCombos));
                copy.setCategoryOptionCombos(copyCategoryOptionCombos);
            } else {
                copy.categoryOptionCombos = null;
            }
            if (this.organisationUnits!= null) {
                OrgUnitType sourceOrganisationUnits;
                sourceOrganisationUnits = this.getOrganisationUnits();
                OrgUnitType copyOrganisationUnits = ((OrgUnitType) strategy.copy(LocatorUtils.property(locator, "organisationUnits", sourceOrganisationUnits), sourceOrganisationUnits));
                copy.setOrganisationUnits(copyOrganisationUnits);
            } else {
                copy.organisationUnits = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MetaData();
    }

}
