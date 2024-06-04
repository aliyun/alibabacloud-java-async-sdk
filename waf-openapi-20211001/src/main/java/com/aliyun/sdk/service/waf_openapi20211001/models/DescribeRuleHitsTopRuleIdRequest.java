// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRuleHitsTopRuleIdRequest} extends {@link RequestModel}
 *
 * <p>DescribeRuleHitsTopRuleIdRequest</p>
 */
public class DescribeRuleHitsTopRuleIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTimestamp")
    private String endTimestamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsGroupResource")
    private String isGroupResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resource")
    private String resource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleType")
    private String ruleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTimestamp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTimestamp;

    private DescribeRuleHitsTopRuleIdRequest(Builder builder) {
        super(builder);
        this.endTimestamp = builder.endTimestamp;
        this.instanceId = builder.instanceId;
        this.isGroupResource = builder.isGroupResource;
        this.regionId = builder.regionId;
        this.resource = builder.resource;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.ruleType = builder.ruleType;
        this.startTimestamp = builder.startTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRuleHitsTopRuleIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTimestamp
     */
    public String getEndTimestamp() {
        return this.endTimestamp;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isGroupResource
     */
    public String getIsGroupResource() {
        return this.isGroupResource;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resource
     */
    public String getResource() {
        return this.resource;
    }

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    /**
     * @return ruleType
     */
    public String getRuleType() {
        return this.ruleType;
    }

    /**
     * @return startTimestamp
     */
    public String getStartTimestamp() {
        return this.startTimestamp;
    }

    public static final class Builder extends Request.Builder<DescribeRuleHitsTopRuleIdRequest, Builder> {
        private String endTimestamp; 
        private String instanceId; 
        private String isGroupResource; 
        private String regionId; 
        private String resource; 
        private String resourceManagerResourceGroupId; 
        private String ruleType; 
        private String startTimestamp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRuleHitsTopRuleIdRequest request) {
            super(request);
            this.endTimestamp = request.endTimestamp;
            this.instanceId = request.instanceId;
            this.isGroupResource = request.isGroupResource;
            this.regionId = request.regionId;
            this.resource = request.resource;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.ruleType = request.ruleType;
            this.startTimestamp = request.startTimestamp;
        } 

        /**
         * The end of the time range to query. Unit: seconds. If you do not specify this parameter, the current time is used.
         */
        public Builder endTimestamp(String endTimestamp) {
            this.putQueryParameter("EndTimestamp", endTimestamp);
            this.endTimestamp = endTimestamp;
            return this;
        }

        /**
         * The ID of the Web Application Firewall (WAF) instance.
         * <p>
         * 
         * >  You can call the [DescribeInstance](~~433756~~) operation to query the ID of the WAF instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Specifies whether protected objects that trigger protection rules are returned in the response. Valid values
         * <p>
         * 
         * - **true**: returns only the number of times each protection rule is triggered. If you set IsGroupResource to true, Resource is left empty.
         * - **false**: returns the number of times each protection rule is triggered by each protected object.
         */
        public Builder isGroupResource(String isGroupResource) {
            this.putQueryParameter("IsGroupResource", isGroupResource);
            this.isGroupResource = isGroupResource;
            return this;
        }

        /**
         * The region where the WAF instance resides. Valid values:
         * <p>
         * 
         * *   **cn-hangzhou:** the Chinese mainland.
         * *   **ap-southeast-1:** outside the Chinese mainland.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The protected object.
         */
        public Builder resource(String resource) {
            this.putQueryParameter("Resource", resource);
            this.resource = resource;
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

        /**
         * The type of rules that are triggered by the protected object. By default, this parameter is not specified and all types of rules are queried.
         * <p>
         * 
         * *   **blacklist:** IP address blacklist rules.
         * *   **custom:** custom rules.
         * *   **antiscan:** scan protection rules.
         * *   **cc_system:** HTTP flood protection rules.
         * *   **region_block:** region blacklist rules.
         */
        public Builder ruleType(String ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * The beginning of the time range to query. Unit: seconds.
         */
        public Builder startTimestamp(String startTimestamp) {
            this.putQueryParameter("StartTimestamp", startTimestamp);
            this.startTimestamp = startTimestamp;
            return this;
        }

        @Override
        public DescribeRuleHitsTopRuleIdRequest build() {
            return new DescribeRuleHitsTopRuleIdRequest(this);
        } 

    } 

}
