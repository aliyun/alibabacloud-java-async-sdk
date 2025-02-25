// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EpdInventoryConstituteItem} extends {@link TeaModel}
 *
 * <p>EpdInventoryConstituteItem</p>
 */
public class EpdInventoryConstituteItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("carbonEmission")
    private Double carbonEmission;

    @com.aliyun.core.annotation.NameInMap("factor")
    private String factor;

    @com.aliyun.core.annotation.NameInMap("factorDataset")
    private String factorDataset;

    @com.aliyun.core.annotation.NameInMap("factorId")
    private String factorId;

    @com.aliyun.core.annotation.NameInMap("factorType")
    private Integer factorType;

    @com.aliyun.core.annotation.NameInMap("factorUnit")
    private String factorUnit;

    @com.aliyun.core.annotation.NameInMap("inventoryId")
    private Long inventoryId;

    @com.aliyun.core.annotation.NameInMap("inventoryUnit")
    private String inventoryUnit;

    @com.aliyun.core.annotation.NameInMap("inventoryValue")
    private Double inventoryValue;

    @com.aliyun.core.annotation.NameInMap("inventoryValuePerProduct")
    private Double inventoryValuePerProduct;

    @com.aliyun.core.annotation.NameInMap("inventoryValuePerProductUnit")
    private String inventoryValuePerProductUnit;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<EpdInventoryConstituteItem> items;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("num")
    private Long num;

    @com.aliyun.core.annotation.NameInMap("percent")
    private Double percent;

    @com.aliyun.core.annotation.NameInMap("quantity")
    private Double quantity;

    @com.aliyun.core.annotation.NameInMap("resourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("state")
    private Integer state;

    @com.aliyun.core.annotation.NameInMap("unit")
    private String unit;

    private EpdInventoryConstituteItem(Builder builder) {
        this.carbonEmission = builder.carbonEmission;
        this.factor = builder.factor;
        this.factorDataset = builder.factorDataset;
        this.factorId = builder.factorId;
        this.factorType = builder.factorType;
        this.factorUnit = builder.factorUnit;
        this.inventoryId = builder.inventoryId;
        this.inventoryUnit = builder.inventoryUnit;
        this.inventoryValue = builder.inventoryValue;
        this.inventoryValuePerProduct = builder.inventoryValuePerProduct;
        this.inventoryValuePerProductUnit = builder.inventoryValuePerProductUnit;
        this.items = builder.items;
        this.name = builder.name;
        this.num = builder.num;
        this.percent = builder.percent;
        this.quantity = builder.quantity;
        this.resourceType = builder.resourceType;
        this.state = builder.state;
        this.unit = builder.unit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EpdInventoryConstituteItem create() {
        return builder().build();
    }

    /**
     * @return carbonEmission
     */
    public Double getCarbonEmission() {
        return this.carbonEmission;
    }

    /**
     * @return factor
     */
    public String getFactor() {
        return this.factor;
    }

    /**
     * @return factorDataset
     */
    public String getFactorDataset() {
        return this.factorDataset;
    }

    /**
     * @return factorId
     */
    public String getFactorId() {
        return this.factorId;
    }

    /**
     * @return factorType
     */
    public Integer getFactorType() {
        return this.factorType;
    }

    /**
     * @return factorUnit
     */
    public String getFactorUnit() {
        return this.factorUnit;
    }

    /**
     * @return inventoryId
     */
    public Long getInventoryId() {
        return this.inventoryId;
    }

    /**
     * @return inventoryUnit
     */
    public String getInventoryUnit() {
        return this.inventoryUnit;
    }

    /**
     * @return inventoryValue
     */
    public Double getInventoryValue() {
        return this.inventoryValue;
    }

    /**
     * @return inventoryValuePerProduct
     */
    public Double getInventoryValuePerProduct() {
        return this.inventoryValuePerProduct;
    }

    /**
     * @return inventoryValuePerProductUnit
     */
    public String getInventoryValuePerProductUnit() {
        return this.inventoryValuePerProductUnit;
    }

    /**
     * @return items
     */
    public java.util.List<EpdInventoryConstituteItem> getItems() {
        return this.items;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return num
     */
    public Long getNum() {
        return this.num;
    }

    /**
     * @return percent
     */
    public Double getPercent() {
        return this.percent;
    }

    /**
     * @return quantity
     */
    public Double getQuantity() {
        return this.quantity;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return state
     */
    public Integer getState() {
        return this.state;
    }

    /**
     * @return unit
     */
    public String getUnit() {
        return this.unit;
    }

    public static final class Builder {
        private Double carbonEmission; 
        private String factor; 
        private String factorDataset; 
        private String factorId; 
        private Integer factorType; 
        private String factorUnit; 
        private Long inventoryId; 
        private String inventoryUnit; 
        private Double inventoryValue; 
        private Double inventoryValuePerProduct; 
        private String inventoryValuePerProductUnit; 
        private java.util.List<EpdInventoryConstituteItem> items; 
        private String name; 
        private Long num; 
        private Double percent; 
        private Double quantity; 
        private String resourceType; 
        private Integer state; 
        private String unit; 

        /**
         * carbonEmission.
         */
        public Builder carbonEmission(Double carbonEmission) {
            this.carbonEmission = carbonEmission;
            return this;
        }

        /**
         * factor.
         */
        public Builder factor(String factor) {
            this.factor = factor;
            return this;
        }

        /**
         * factorDataset.
         */
        public Builder factorDataset(String factorDataset) {
            this.factorDataset = factorDataset;
            return this;
        }

        /**
         * factorId.
         */
        public Builder factorId(String factorId) {
            this.factorId = factorId;
            return this;
        }

        /**
         * factorType.
         */
        public Builder factorType(Integer factorType) {
            this.factorType = factorType;
            return this;
        }

        /**
         * factorUnit.
         */
        public Builder factorUnit(String factorUnit) {
            this.factorUnit = factorUnit;
            return this;
        }

        /**
         * inventoryId.
         */
        public Builder inventoryId(Long inventoryId) {
            this.inventoryId = inventoryId;
            return this;
        }

        /**
         * inventoryUnit.
         */
        public Builder inventoryUnit(String inventoryUnit) {
            this.inventoryUnit = inventoryUnit;
            return this;
        }

        /**
         * inventoryValue.
         */
        public Builder inventoryValue(Double inventoryValue) {
            this.inventoryValue = inventoryValue;
            return this;
        }

        /**
         * inventoryValuePerProduct.
         */
        public Builder inventoryValuePerProduct(Double inventoryValuePerProduct) {
            this.inventoryValuePerProduct = inventoryValuePerProduct;
            return this;
        }

        /**
         * inventoryValuePerProductUnit.
         */
        public Builder inventoryValuePerProductUnit(String inventoryValuePerProductUnit) {
            this.inventoryValuePerProductUnit = inventoryValuePerProductUnit;
            return this;
        }

        /**
         * items.
         */
        public Builder items(java.util.List<EpdInventoryConstituteItem> items) {
            this.items = items;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * num.
         */
        public Builder num(Long num) {
            this.num = num;
            return this;
        }

        /**
         * percent.
         */
        public Builder percent(Double percent) {
            this.percent = percent;
            return this;
        }

        /**
         * quantity.
         */
        public Builder quantity(Double quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * resourceType.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * state.
         */
        public Builder state(Integer state) {
            this.state = state;
            return this;
        }

        /**
         * unit.
         */
        public Builder unit(String unit) {
            this.unit = unit;
            return this;
        }

        public EpdInventoryConstituteItem build() {
            return new EpdInventoryConstituteItem(this);
        } 

    } 

}
