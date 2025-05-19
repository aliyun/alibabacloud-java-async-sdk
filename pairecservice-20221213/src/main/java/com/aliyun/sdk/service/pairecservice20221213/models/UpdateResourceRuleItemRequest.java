// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link UpdateResourceRuleItemRequest} extends {@link RequestModel}
 *
 * <p>UpdateResourceRuleItemRequest</p>
 */
public class UpdateResourceRuleItemRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ResourceRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceRuleId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ResourceRuleItemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceRuleItemId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxValue")
    private Double maxValue;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MinValue")
    private Double minValue;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Value")
    private Double value;

    private UpdateResourceRuleItemRequest(Builder builder) {
        super(builder);
        this.resourceRuleId = builder.resourceRuleId;
        this.resourceRuleItemId = builder.resourceRuleItemId;
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.maxValue = builder.maxValue;
        this.minValue = builder.minValue;
        this.name = builder.name;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateResourceRuleItemRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceRuleId
     */
    public String getResourceRuleId() {
        return this.resourceRuleId;
    }

    /**
     * @return resourceRuleItemId
     */
    public String getResourceRuleItemId() {
        return this.resourceRuleItemId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return maxValue
     */
    public Double getMaxValue() {
        return this.maxValue;
    }

    /**
     * @return minValue
     */
    public Double getMinValue() {
        return this.minValue;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return value
     */
    public Double getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<UpdateResourceRuleItemRequest, Builder> {
        private String resourceRuleId; 
        private String resourceRuleItemId; 
        private String regionId; 
        private String description; 
        private String instanceId; 
        private Double maxValue; 
        private Double minValue; 
        private String name; 
        private Double value; 

        private Builder() {
            super();
        } 

        private Builder(UpdateResourceRuleItemRequest request) {
            super(request);
            this.resourceRuleId = request.resourceRuleId;
            this.resourceRuleItemId = request.resourceRuleItemId;
            this.regionId = request.regionId;
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.maxValue = request.maxValue;
            this.minValue = request.minValue;
            this.name = request.name;
            this.value = request.value;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder resourceRuleId(String resourceRuleId) {
            this.putPathParameter("ResourceRuleId", resourceRuleId);
            this.resourceRuleId = resourceRuleId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder resourceRuleItemId(String resourceRuleItemId) {
            this.putPathParameter("ResourceRuleItemId", resourceRuleItemId);
            this.resourceRuleItemId = resourceRuleItemId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MaxValue.
         */
        public Builder maxValue(Double maxValue) {
            this.putBodyParameter("MaxValue", maxValue);
            this.maxValue = maxValue;
            return this;
        }

        /**
         * MinValue.
         */
        public Builder minValue(Double minValue) {
            this.putBodyParameter("MinValue", minValue);
            this.minValue = minValue;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(Double value) {
            this.putBodyParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public UpdateResourceRuleItemRequest build() {
            return new UpdateResourceRuleItemRequest(this);
        } 

    } 

}
