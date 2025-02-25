// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link CreateSchedulerRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateSchedulerRuleRequest</p>
 */
public class CreateSchedulerRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Param")
    private String param;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer ruleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rules")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rules;

    private CreateSchedulerRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.param = builder.param;
        this.resourceGroupId = builder.resourceGroupId;
        this.ruleName = builder.ruleName;
        this.ruleType = builder.ruleType;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSchedulerRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return param
     */
    public String getParam() {
        return this.param;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return ruleType
     */
    public Integer getRuleType() {
        return this.ruleType;
    }

    /**
     * @return rules
     */
    public String getRules() {
        return this.rules;
    }

    public static final class Builder extends Request.Builder<CreateSchedulerRuleRequest, Builder> {
        private String regionId; 
        private String param; 
        private String resourceGroupId; 
        private String ruleName; 
        private Integer ruleType; 
        private String rules; 

        private Builder() {
            super();
        } 

        private Builder(CreateSchedulerRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.param = request.param;
            this.resourceGroupId = request.resourceGroupId;
            this.ruleName = request.ruleName;
            this.ruleType = request.ruleType;
            this.rules = request.rules;
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
         * <p>The details of the CDN interaction rule. This parameter is a JSON string. The following list describes the fields in the value of the parameter:</p>
         * <ul>
         * <li><p><strong>ParamType</strong>: the type of the scheduling rule. This field is required and must be of the string type. Set the value to <strong>cdn</strong>. This indicates that you want to modify a CDN interaction rule.</p>
         * </li>
         * <li><p><strong>ParamData</strong>: the values of parameters that you want to modify for the CDN interaction rule. This field is required and must be of the map type. ParamData contains the following parameters:</p>
         * <ul>
         * <li><strong>Domain</strong>: the accelerated domain in CDN. This parameter is required and must be of the string type.</li>
         * <li><strong>Cname</strong>: the CNAME that is assigned to the accelerated domain. This parameter is required and must be of the string type.</li>
         * <li><strong>AccessQps</strong>: the queries per second (QPS) threshold that is used to switch service traffic to Anti-DDoS Pro or Anti-DDoS Premium. This parameter is required and must be of the integer type.</li>
         * <li><strong>UpstreamQps</strong>: the QPS threshold that is used to switch service traffic to CDN. This parameter is optional and must be of the integer type.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ParamType&quot;:&quot;cdn&quot;,&quot;ParamData&quot;:{&quot;Domain&quot;:&quot;example.aliyundoc.com&quot;,&quot;Cname&quot;:&quot;demo.aliyundoc.com&quot;,&quot;AccessQps&quot;:100,&quot;UpstreamQps&quot;:100}}</p>
         */
        public Builder param(String param) {
            this.putQueryParameter("Param", param);
            this.param = param;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The name of the rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testrule</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The type of the rule. Valid values:</p>
         * <ul>
         * <li><strong>2</strong>: tiered protection</li>
         * <li><strong>3</strong>: network acceleration</li>
         * <li><strong>5</strong>: Alibaba Cloud CDN (CDN) interaction</li>
         * <li><strong>6</strong>: cloud service interaction</li>
         * <li><strong>8</strong>: secure acceleration</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder ruleType(Integer ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * <p>The details of the scheduling rule. This parameter is a JSON string. The following list describes the fields in the value of the parameter:</p>
         * <ul>
         * <li><p><strong>Type</strong>: the address type of the interaction resource that you want to use in the scheduling rule. This field is required and must be of the string type. Valid values:</p>
         * <ul>
         * <li><strong>A</strong>: IP address</li>
         * <li><strong>CNAME</strong>: domain name</li>
         * </ul>
         * </li>
         * <li><p><strong>Value</strong>: the address of the interaction resource that you want to use in the scheduling rule. This field is required and must be of the string type.</p>
         * </li>
         * <li><p><strong>Priority</strong>: the priority of the scheduling rule. This field is required and must be of the integer type. Valid values: <strong>0</strong> to <strong>100</strong>. A larger value indicates a higher priority.</p>
         * </li>
         * <li><p><strong>ValueType</strong>: the type of the interaction resource that you want to use in the scheduling rule. This field is required and must be of the integer type. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: the IP address of the Anti-DDoS Pro or Anti-DDoS Premium instance</li>
         * <li><strong>2</strong>: the IP address of the interaction resource in the tiered protection scenario</li>
         * <li><strong>3</strong>: the IP address that is used to accelerate access in the network acceleration scenario</li>
         * <li><strong>5</strong>: the domain name that is configured in Alibaba Cloud CDN (CDN) in the CDN interaction scenario</li>
         * <li><strong>6</strong> the IP address of the interaction resource in the cloud service interaction scenario</li>
         * </ul>
         * </li>
         * <li><p><strong>RegionId</strong>: the region where the interaction resource is deployed. This parameter must be specified when <strong>ValueType</strong> is set to <strong>2</strong>. The value must be of the string type.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Type&quot;:&quot;A&quot;, &quot;Value&quot;:&quot;1.1.XX.XX&quot;, &quot;Priority&quot;:80,&quot;ValueType&quot;:2, &quot;RegionId&quot;:&quot;cn-hangzhou&quot; },{&quot;Type&quot;:&quot;A&quot;, &quot;Value&quot;:&quot;203.199.XX.XX&quot;, &quot;Priority&quot;:80,&quot;ValueType&quot;:1}]</p>
         */
        public Builder rules(String rules) {
            this.putQueryParameter("Rules", rules);
            this.rules = rules;
            return this;
        }

        @Override
        public CreateSchedulerRuleRequest build() {
            return new CreateSchedulerRuleRequest(this);
        } 

    } 

}
