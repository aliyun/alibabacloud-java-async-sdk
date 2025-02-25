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
 * {@link GwpInventoryConstitute} extends {@link TeaModel}
 *
 * <p>GwpInventoryConstitute</p>
 */
public class GwpInventoryConstitute extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("byResourceType")
    private java.util.List<GwpResourceConstitute> byResourceType;

    @com.aliyun.core.annotation.NameInMap("carbonEmission")
    private Double carbonEmission;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<GwpInventoryConstitute> items;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("percent")
    private Double percent;

    @com.aliyun.core.annotation.NameInMap("resourceType")
    private Integer resourceType;

    @com.aliyun.core.annotation.NameInMap("unit")
    private String unit;

    private GwpInventoryConstitute(Builder builder) {
        this.byResourceType = builder.byResourceType;
        this.carbonEmission = builder.carbonEmission;
        this.items = builder.items;
        this.name = builder.name;
        this.percent = builder.percent;
        this.resourceType = builder.resourceType;
        this.unit = builder.unit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GwpInventoryConstitute create() {
        return builder().build();
    }

    /**
     * @return byResourceType
     */
    public java.util.List<GwpResourceConstitute> getByResourceType() {
        return this.byResourceType;
    }

    /**
     * @return carbonEmission
     */
    public Double getCarbonEmission() {
        return this.carbonEmission;
    }

    /**
     * @return items
     */
    public java.util.List<GwpInventoryConstitute> getItems() {
        return this.items;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return percent
     */
    public Double getPercent() {
        return this.percent;
    }

    /**
     * @return resourceType
     */
    public Integer getResourceType() {
        return this.resourceType;
    }

    /**
     * @return unit
     */
    public String getUnit() {
        return this.unit;
    }

    public static final class Builder {
        private java.util.List<GwpResourceConstitute> byResourceType; 
        private Double carbonEmission; 
        private java.util.List<GwpInventoryConstitute> items; 
        private String name; 
        private Double percent; 
        private Integer resourceType; 
        private String unit; 

        /**
         * byResourceType.
         */
        public Builder byResourceType(java.util.List<GwpResourceConstitute> byResourceType) {
            this.byResourceType = byResourceType;
            return this;
        }

        /**
         * carbonEmission.
         */
        public Builder carbonEmission(Double carbonEmission) {
            this.carbonEmission = carbonEmission;
            return this;
        }

        /**
         * items.
         */
        public Builder items(java.util.List<GwpInventoryConstitute> items) {
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
         * percent.
         */
        public Builder percent(Double percent) {
            this.percent = percent;
            return this;
        }

        /**
         * resourceType.
         */
        public Builder resourceType(Integer resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * unit.
         */
        public Builder unit(String unit) {
            this.unit = unit;
            return this;
        }

        public GwpInventoryConstitute build() {
            return new GwpInventoryConstitute(this);
        } 

    } 

}
