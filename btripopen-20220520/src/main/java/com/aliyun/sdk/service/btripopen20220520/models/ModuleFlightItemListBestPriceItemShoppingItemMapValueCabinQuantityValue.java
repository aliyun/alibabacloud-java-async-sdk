// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityValue} extends {@link TeaModel}
 *
 * <p>ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityValue</p>
 */
public class ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityValue extends TeaModel {
    @NameInMap("cabin")
    private String cabin;

    @NameInMap("cabin_class")
    private String cabinClass;

    @NameInMap("cabin_class_name")
    private String cabinClassName;

    @NameInMap("cabin_class_memo")
    private String cabinClassMemo;

    @NameInMap("specification")
    private String specification;

    @NameInMap("quantity")
    private String quantity;

    @NameInMap("link_cabins")
    private java.util.List < String > linkCabins;

    @NameInMap("reshop_change_cabin")
    private Boolean reshopChangeCabin;

    @NameInMap("child_cabin_type")
    private Integer childCabinType;

    @NameInMap("infant_basic_cabin")
    private String infantBasicCabin;

    @NameInMap("inner_cabin_class")
    private Integer innerCabinClass;

    private ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityValue(Builder builder) {
        this.cabin = builder.cabin;
        this.cabinClass = builder.cabinClass;
        this.cabinClassName = builder.cabinClassName;
        this.cabinClassMemo = builder.cabinClassMemo;
        this.specification = builder.specification;
        this.quantity = builder.quantity;
        this.linkCabins = builder.linkCabins;
        this.reshopChangeCabin = builder.reshopChangeCabin;
        this.childCabinType = builder.childCabinType;
        this.infantBasicCabin = builder.infantBasicCabin;
        this.innerCabinClass = builder.innerCabinClass;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityValue create() {
        return builder().build();
    }

    /**
     * @return cabin
     */
    public String getCabin() {
        return this.cabin;
    }

    /**
     * @return cabinClass
     */
    public String getCabinClass() {
        return this.cabinClass;
    }

    /**
     * @return cabinClassName
     */
    public String getCabinClassName() {
        return this.cabinClassName;
    }

    /**
     * @return cabinClassMemo
     */
    public String getCabinClassMemo() {
        return this.cabinClassMemo;
    }

    /**
     * @return specification
     */
    public String getSpecification() {
        return this.specification;
    }

    /**
     * @return quantity
     */
    public String getQuantity() {
        return this.quantity;
    }

    /**
     * @return linkCabins
     */
    public java.util.List < String > getLinkCabins() {
        return this.linkCabins;
    }

    /**
     * @return reshopChangeCabin
     */
    public Boolean getReshopChangeCabin() {
        return this.reshopChangeCabin;
    }

    /**
     * @return childCabinType
     */
    public Integer getChildCabinType() {
        return this.childCabinType;
    }

    /**
     * @return infantBasicCabin
     */
    public String getInfantBasicCabin() {
        return this.infantBasicCabin;
    }

    /**
     * @return innerCabinClass
     */
    public Integer getInnerCabinClass() {
        return this.innerCabinClass;
    }

    public static final class Builder {
        private String cabin; 
        private String cabinClass; 
        private String cabinClassName; 
        private String cabinClassMemo; 
        private String specification; 
        private String quantity; 
        private java.util.List < String > linkCabins; 
        private Boolean reshopChangeCabin; 
        private Integer childCabinType; 
        private String infantBasicCabin; 
        private Integer innerCabinClass; 

        /**
         * cabin.
         */
        public Builder cabin(String cabin) {
            this.cabin = cabin;
            return this;
        }

        /**
         * cabin_class.
         */
        public Builder cabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }

        /**
         * cabin_class_name.
         */
        public Builder cabinClassName(String cabinClassName) {
            this.cabinClassName = cabinClassName;
            return this;
        }

        /**
         * cabin_class_memo.
         */
        public Builder cabinClassMemo(String cabinClassMemo) {
            this.cabinClassMemo = cabinClassMemo;
            return this;
        }

        /**
         * specification.
         */
        public Builder specification(String specification) {
            this.specification = specification;
            return this;
        }

        /**
         * quantity.
         */
        public Builder quantity(String quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * link_cabins.
         */
        public Builder linkCabins(java.util.List < String > linkCabins) {
            this.linkCabins = linkCabins;
            return this;
        }

        /**
         * reshop_change_cabin.
         */
        public Builder reshopChangeCabin(Boolean reshopChangeCabin) {
            this.reshopChangeCabin = reshopChangeCabin;
            return this;
        }

        /**
         * child_cabin_type.
         */
        public Builder childCabinType(Integer childCabinType) {
            this.childCabinType = childCabinType;
            return this;
        }

        /**
         * infant_basic_cabin.
         */
        public Builder infantBasicCabin(String infantBasicCabin) {
            this.infantBasicCabin = infantBasicCabin;
            return this;
        }

        /**
         * inner_cabin_class.
         */
        public Builder innerCabinClass(Integer innerCabinClass) {
            this.innerCabinClass = innerCabinClass;
            return this;
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityValue build() {
            return new ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityValue(this);
        } 

    } 

}
