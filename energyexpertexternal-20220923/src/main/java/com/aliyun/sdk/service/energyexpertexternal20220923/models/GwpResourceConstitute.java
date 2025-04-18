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
 * {@link GwpResourceConstitute} extends {@link TeaModel}
 *
 * <p>GwpResourceConstitute</p>
 */
public class GwpResourceConstitute extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("carbonEmission")
    private Double carbonEmission;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("percent")
    private String percent;

    @com.aliyun.core.annotation.NameInMap("resourceType")
    private Integer resourceType;

    @com.aliyun.core.annotation.NameInMap("unit")
    private String unit;

    private GwpResourceConstitute(Builder builder) {
        this.carbonEmission = builder.carbonEmission;
        this.name = builder.name;
        this.percent = builder.percent;
        this.resourceType = builder.resourceType;
        this.unit = builder.unit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GwpResourceConstitute create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return carbonEmission
     */
    public Double getCarbonEmission() {
        return this.carbonEmission;
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
    public String getPercent() {
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
        private Double carbonEmission; 
        private String name; 
        private String percent; 
        private Integer resourceType; 
        private String unit; 

        private Builder() {
        } 

        private Builder(GwpResourceConstitute model) {
            this.carbonEmission = model.carbonEmission;
            this.name = model.name;
            this.percent = model.percent;
            this.resourceType = model.resourceType;
            this.unit = model.unit;
        } 

        /**
         * carbonEmission.
         */
        public Builder carbonEmission(Double carbonEmission) {
            this.carbonEmission = carbonEmission;
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
        public Builder percent(String percent) {
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

        public GwpResourceConstitute build() {
            return new GwpResourceConstitute(this);
        } 

    } 

}
