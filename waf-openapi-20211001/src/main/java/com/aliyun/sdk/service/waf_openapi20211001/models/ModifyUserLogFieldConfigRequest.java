// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link ModifyUserLogFieldConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyUserLogFieldConfigRequest</p>
 */
public class ModifyUserLogFieldConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliveryType")
    private String deliveryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtendConfig")
    private String extendConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FieldList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fieldList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogDeliveryStrategy")
    private String logDeliveryStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    private ModifyUserLogFieldConfigRequest(Builder builder) {
        super(builder);
        this.deliveryType = builder.deliveryType;
        this.extendConfig = builder.extendConfig;
        this.fieldList = builder.fieldList;
        this.instanceId = builder.instanceId;
        this.logDeliveryStrategy = builder.logDeliveryStrategy;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyUserLogFieldConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deliveryType
     */
    public String getDeliveryType() {
        return this.deliveryType;
    }

    /**
     * @return extendConfig
     */
    public String getExtendConfig() {
        return this.extendConfig;
    }

    /**
     * @return fieldList
     */
    public String getFieldList() {
        return this.fieldList;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return logDeliveryStrategy
     */
    public String getLogDeliveryStrategy() {
        return this.logDeliveryStrategy;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public static final class Builder extends Request.Builder<ModifyUserLogFieldConfigRequest, Builder> {
        private String deliveryType; 
        private String extendConfig; 
        private String fieldList; 
        private String instanceId; 
        private String logDeliveryStrategy; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyUserLogFieldConfigRequest request) {
            super(request);
            this.deliveryType = request.deliveryType;
            this.extendConfig = request.extendConfig;
            this.fieldList = request.fieldList;
            this.instanceId = request.instanceId;
            this.logDeliveryStrategy = request.logDeliveryStrategy;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
        } 

        /**
         * DeliveryType.
         */
        public Builder deliveryType(String deliveryType) {
            this.putQueryParameter("DeliveryType", deliveryType);
            this.deliveryType = deliveryType;
            return this;
        }

        /**
         * ExtendConfig.
         */
        public Builder extendConfig(String extendConfig) {
            this.putQueryParameter("ExtendConfig", extendConfig);
            this.extendConfig = extendConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>account,acl_action,acl_rule_id,acl_rule_type,acl_test,antiscan_action,antiscan_rule_id,antiscan_rule_type,antiscan_test,body_bytes_sent,bypass_matched_ids</p>
         */
        public Builder fieldList(String fieldList) {
            this.putQueryParameter("FieldList", fieldList);
            this.fieldList = fieldList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_v2_public_cn-fou****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * LogDeliveryStrategy.
         */
        public Builder logDeliveryStrategy(String logDeliveryStrategy) {
            this.putQueryParameter("LogDeliveryStrategy", logDeliveryStrategy);
            this.logDeliveryStrategy = logDeliveryStrategy;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceManagerResourceGroupId.
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        @Override
        public ModifyUserLogFieldConfigRequest build() {
            return new ModifyUserLogFieldConfigRequest(this);
        } 

    } 

}
