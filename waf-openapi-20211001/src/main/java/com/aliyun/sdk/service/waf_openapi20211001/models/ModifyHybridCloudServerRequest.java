// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHybridCloudServerRequest} extends {@link RequestModel}
 *
 * <p>ModifyHybridCloudServerRequest</p>
 */
public class ModifyHybridCloudServerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Continents")
    @com.aliyun.core.annotation.Validation(required = true)
    private String continents;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operator")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operator;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    private ModifyHybridCloudServerRequest(Builder builder) {
        super(builder);
        this.continents = builder.continents;
        this.customName = builder.customName;
        this.instanceId = builder.instanceId;
        this.mid = builder.mid;
        this.operator = builder.operator;
        this.regionCode = builder.regionCode;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyHybridCloudServerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return continents
     */
    public String getContinents() {
        return this.continents;
    }

    /**
     * @return customName
     */
    public String getCustomName() {
        return this.customName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return mid
     */
    public String getMid() {
        return this.mid;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return regionCode
     */
    public String getRegionCode() {
        return this.regionCode;
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

    public static final class Builder extends Request.Builder<ModifyHybridCloudServerRequest, Builder> {
        private String continents; 
        private String customName; 
        private String instanceId; 
        private String mid; 
        private String operator; 
        private String regionCode; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyHybridCloudServerRequest request) {
            super(request);
            this.continents = request.continents;
            this.customName = request.customName;
            this.instanceId = request.instanceId;
            this.mid = request.mid;
            this.operator = request.operator;
            this.regionCode = request.regionCode;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
        } 

        /**
         * The continent.
         */
        public Builder continents(String continents) {
            this.putQueryParameter("Continents", continents);
            this.continents = continents;
            return this;
        }

        /**
         * The name of the node.
         */
        public Builder customName(String customName) {
            this.putQueryParameter("CustomName", customName);
            this.customName = customName;
            return this;
        }

        /**
         * The ID of the WAF instance.
         * <p>
         * 
         * >  You can call the [DescribeInstanceInfo](~~140857~~) operation to query the ID of the WAF instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the node.
         */
        public Builder mid(String mid) {
            this.putQueryParameter("Mid", mid);
            this.mid = mid;
            return this;
        }

        /**
         * The cloud service provider.
         */
        public Builder operator(String operator) {
            this.putQueryParameter("Operator", operator);
            this.operator = operator;
            return this;
        }

        /**
         * The city.
         */
        public Builder regionCode(String regionCode) {
            this.putQueryParameter("RegionCode", regionCode);
            this.regionCode = regionCode;
            return this;
        }

        /**
         * The region in which the WAF instance is deployed. Valid value:
         * <p>
         * 
         * *   **cn-hangzhou**: Chinese mainland.
         * *   **ap-southeast-1**: outside the Chinese mainland.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud resource group.
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        @Override
        public ModifyHybridCloudServerRequest build() {
            return new ModifyHybridCloudServerRequest(this);
        } 

    } 

}
