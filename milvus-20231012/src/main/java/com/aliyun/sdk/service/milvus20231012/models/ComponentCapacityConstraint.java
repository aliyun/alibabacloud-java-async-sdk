// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.milvus20231012.models;

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
 * {@link ComponentCapacityConstraint} extends {@link TeaModel}
 *
 * <p>ComponentCapacityConstraint</p>
 */
public class ComponentCapacityConstraint extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("componentType")
    private String componentType;

    @com.aliyun.core.annotation.NameInMap("maxCapacity")
    private Integer maxCapacity;

    @com.aliyun.core.annotation.NameInMap("minCapacity")
    private Integer minCapacity;

    private ComponentCapacityConstraint(Builder builder) {
        this.componentType = builder.componentType;
        this.maxCapacity = builder.maxCapacity;
        this.minCapacity = builder.minCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ComponentCapacityConstraint create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return componentType
     */
    public String getComponentType() {
        return this.componentType;
    }

    /**
     * @return maxCapacity
     */
    public Integer getMaxCapacity() {
        return this.maxCapacity;
    }

    /**
     * @return minCapacity
     */
    public Integer getMinCapacity() {
        return this.minCapacity;
    }

    public static final class Builder {
        private String componentType; 
        private Integer maxCapacity; 
        private Integer minCapacity; 

        private Builder() {
        } 

        private Builder(ComponentCapacityConstraint model) {
            this.componentType = model.componentType;
            this.maxCapacity = model.maxCapacity;
            this.minCapacity = model.minCapacity;
        } 

        /**
         * componentType.
         */
        public Builder componentType(String componentType) {
            this.componentType = componentType;
            return this;
        }

        /**
         * maxCapacity.
         */
        public Builder maxCapacity(Integer maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }

        /**
         * minCapacity.
         */
        public Builder minCapacity(Integer minCapacity) {
            this.minCapacity = minCapacity;
            return this;
        }

        public ComponentCapacityConstraint build() {
            return new ComponentCapacityConstraint(this);
        } 

    } 

}
