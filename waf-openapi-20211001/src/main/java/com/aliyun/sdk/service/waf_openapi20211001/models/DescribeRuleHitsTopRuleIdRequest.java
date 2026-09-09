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
         * <p>The end of the time range to query. Unit: seconds. If you do not specify this parameter, the current time is used.</p>
         * 
         * <strong>example:</strong>
         * <p>1665386280</p>
         */
        public Builder endTimestamp(String endTimestamp) {
            this.putQueryParameter("EndTimestamp", endTimestamp);
            this.endTimestamp = endTimestamp;
            return this;
        }

        /**
         * <p>The ID of the WAF instance.</p>
         * <blockquote>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the current WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_cdnsdf3****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Specifies whether to aggregate rule hits by protected object.</p>
         * <ul>
         * <li><strong>true (default)</strong>: Aggregates rule hits by protected object. In this case, rule hits are counted based on individual rules only, and the Resource value in the response is empty.</li>
         * <li><strong>false</strong>: Does not aggregate rule hits by protected object. In this case, rule hits are counted based on both protected objects and rules.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isGroupResource(String isGroupResource) {
            this.putQueryParameter("IsGroupResource", isGroupResource);
            this.isGroupResource = isGroupResource;
            return this;
        }

        /**
         * <p>The region where the WAF instance is deployed. Valid values:</p>
         * <ul>
         * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
         * </li>
         * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The protected object.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
         */
        public Builder resource(String resource) {
            this.putQueryParameter("Resource", resource);
            this.resource = resource;
            return this;
        }

        /**
         * <p>The Alibaba Cloud resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm***q</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * <p>The type of rule hit by the protected object. By default, this parameter is not specified, which indicates that all rules are displayed.</p>
         * <ul>
         * <li><p><strong>blacklist</strong>: IP blacklist.</p>
         * </li>
         * <li><p><strong>custom</strong>: Custom rule.</p>
         * </li>
         * <li><p><strong>antiscan</strong>: Scan protection rule.</p>
         * </li>
         * <li><p><strong>cc_system</strong>: HTTP flood mitigation rule.</p>
         * </li>
         * <li><p><strong>region_block</strong>: Location blacklist.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>blacklist</p>
         */
        public Builder ruleType(String ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1665331200</p>
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
