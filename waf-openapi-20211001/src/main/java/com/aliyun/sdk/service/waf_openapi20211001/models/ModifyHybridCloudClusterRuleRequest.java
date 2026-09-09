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
 * {@link ModifyHybridCloudClusterRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyHybridCloudClusterRuleRequest</p>
 */
public class ModifyHybridCloudClusterRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @Deprecated
    private Long clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterRuleResourceId")
    private String clusterRuleResourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleConfig")
    private String ruleConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleStatus")
    private String ruleStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleType")
    @Deprecated
    private String ruleType;

    private ModifyHybridCloudClusterRuleRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.clusterRuleResourceId = builder.clusterRuleResourceId;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.ruleConfig = builder.ruleConfig;
        this.ruleStatus = builder.ruleStatus;
        this.ruleType = builder.ruleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyHybridCloudClusterRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public Long getClusterId() {
        return this.clusterId;
    }

    /**
     * @return clusterRuleResourceId
     */
    public String getClusterRuleResourceId() {
        return this.clusterRuleResourceId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    /**
     * @return ruleConfig
     */
    public String getRuleConfig() {
        return this.ruleConfig;
    }

    /**
     * @return ruleStatus
     */
    public String getRuleStatus() {
        return this.ruleStatus;
    }

    /**
     * @return ruleType
     */
    public String getRuleType() {
        return this.ruleType;
    }

    public static final class Builder extends Request.Builder<ModifyHybridCloudClusterRuleRequest, Builder> {
        private Long clusterId; 
        private String clusterRuleResourceId; 
        private String instanceId; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 
        private String ruleConfig; 
        private String ruleStatus; 
        private String ruleType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyHybridCloudClusterRuleRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.clusterRuleResourceId = request.clusterRuleResourceId;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.ruleConfig = request.ruleConfig;
            this.ruleStatus = request.ruleStatus;
            this.ruleType = request.ruleType;
        } 

        /**
         * <p><strong>[Deprecated]</strong> The ID of the hybrid cloud cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>10*</p>
         */
        public Builder clusterId(Long clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The resource ID of the cluster rule.</p>
         * 
         * <strong>example:</strong>
         * <p>hdbc-clusterrule-*******ym0w</p>
         */
        public Builder clusterRuleResourceId(String clusterRuleResourceId) {
            this.putQueryParameter("ClusterRuleResourceId", clusterRuleResourceId);
            this.clusterRuleResourceId = clusterRuleResourceId;
            return this;
        }

        /**
         * <p>Instance ID of the WAF instance.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/140857.html">DescribeInstanceInfo</a> operation to query instance ID of the current WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf-cn-n6w***x52m</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * <p>The ID of the Alibaba Cloud resource group.</p>
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
         * <p>The traffic redirection rule configuration.</p>
         * <p><notice>The mode cannot be modified.</notice></p>
         * <ul>
         * <li><strong>check_mode</strong>: the mode. Valid values:<ul>
         * <li><strong>all</strong>: full traffic redirection.</li>
         * <li><strong>part</strong>: partial traffic redirection.</li>
         * </ul>
         * </li>
         * <li><strong>type</strong>: the rule matching type. Valid values:<ul>
         * <li><strong>exact</strong>: exact match.</li>
         * <li><strong>regex</strong>: regular expression.</li>
         * </ul>
         * </li>
         * <li><strong>substance</strong>: the rule value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;check_mode\&quot;: \&quot;all\&quot;, \&quot;type\&quot;: \&quot;exact\&quot;, \&quot;substance\&quot;: \&quot;122\&quot;}</p>
         */
        public Builder ruleConfig(String ruleConfig) {
            this.putQueryParameter("RuleConfig", ruleConfig);
            this.ruleConfig = ruleConfig;
            return this;
        }

        /**
         * <p>The rule status. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: enabled.</li>
         * <li><strong>off</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder ruleStatus(String ruleStatus) {
            this.putQueryParameter("RuleStatus", ruleStatus);
            this.ruleStatus = ruleStatus;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> The rule type. Valid values:</p>
         * <ul>
         * <li><strong>pullin</strong>: traffic redirection configuration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pullin</p>
         */
        public Builder ruleType(String ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        @Override
        public ModifyHybridCloudClusterRuleRequest build() {
            return new ModifyHybridCloudClusterRuleRequest(this);
        } 

    } 

}
