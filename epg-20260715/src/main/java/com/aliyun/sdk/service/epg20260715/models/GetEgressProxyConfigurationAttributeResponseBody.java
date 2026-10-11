// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.epg20260715.models;

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
 * {@link GetEgressProxyConfigurationAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetEgressProxyConfigurationAttributeResponseBody</p>
 */
public class GetEgressProxyConfigurationAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DefaultRulePhaseActions")
    private DefaultRulePhaseActions defaultRulePhaseActions;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EgressProxyConfigurationId")
    private String egressProxyConfigurationId;

    @com.aliyun.core.annotation.NameInMap("EgressProxyConfigurationName")
    private String egressProxyConfigurationName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("RuleGroups")
    private java.util.List<RuleGroups> ruleGroups;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    private GetEgressProxyConfigurationAttributeResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.defaultRulePhaseActions = builder.defaultRulePhaseActions;
        this.description = builder.description;
        this.egressProxyConfigurationId = builder.egressProxyConfigurationId;
        this.egressProxyConfigurationName = builder.egressProxyConfigurationName;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.ruleGroups = builder.ruleGroups;
        this.status = builder.status;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEgressProxyConfigurationAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return defaultRulePhaseActions
     */
    public DefaultRulePhaseActions getDefaultRulePhaseActions() {
        return this.defaultRulePhaseActions;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return egressProxyConfigurationId
     */
    public String getEgressProxyConfigurationId() {
        return this.egressProxyConfigurationId;
    }

    /**
     * @return egressProxyConfigurationName
     */
    public String getEgressProxyConfigurationName() {
        return this.egressProxyConfigurationName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return ruleGroups
     */
    public java.util.List<RuleGroups> getRuleGroups() {
        return this.ruleGroups;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder {
        private String createTime; 
        private DefaultRulePhaseActions defaultRulePhaseActions; 
        private String description; 
        private String egressProxyConfigurationId; 
        private String egressProxyConfigurationName; 
        private String requestId; 
        private String resourceGroupId; 
        private java.util.List<RuleGroups> ruleGroups; 
        private String status; 
        private java.util.List<Tags> tags; 

        private Builder() {
        } 

        private Builder(GetEgressProxyConfigurationAttributeResponseBody model) {
            this.createTime = model.createTime;
            this.defaultRulePhaseActions = model.defaultRulePhaseActions;
            this.description = model.description;
            this.egressProxyConfigurationId = model.egressProxyConfigurationId;
            this.egressProxyConfigurationName = model.egressProxyConfigurationName;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.ruleGroups = model.ruleGroups;
            this.status = model.status;
            this.tags = model.tags;
        } 

        /**
         * <p>The creation time of the egress proxy configuration. The time is displayed in UTC in the yyyy-MM-ddTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-02-02T02:20:24Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The default actions executed in each effective phase (PreDns, PreRequest, and PostResponse) when traffic does not match any rules.</p>
         */
        public Builder defaultRulePhaseActions(DefaultRulePhaseActions defaultRulePhaseActions) {
            this.defaultRulePhaseActions = defaultRulePhaseActions;
            return this;
        }

        /**
         * <p>The description of the egress proxy configuration. The description must be 2 to 256 characters in length and can contain Chinese characters, letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>testEpg</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the egress proxy configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>epc-uf609a6a8fdf9f4d****</p>
         */
        public Builder egressProxyConfigurationId(String egressProxyConfigurationId) {
            this.egressProxyConfigurationId = egressProxyConfigurationId;
            return this;
        }

        /**
         * <p>The name of the egress proxy configuration. The name must be 2 to 128 characters in length and must start with a letter or a Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>testEpg</p>
         */
        public Builder egressProxyConfigurationName(String egressProxyConfigurationName) {
            this.egressProxyConfigurationName = egressProxyConfigurationName;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C79118A9-CA6D-5359-B53E-111BE8A03DCF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzorljcazp****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The list of egress rule group references associated with the egress proxy configuration.</p>
         */
        public Builder ruleGroups(java.util.List<RuleGroups> ruleGroups) {
            this.ruleGroups = ruleGroups;
            return this;
        }

        /**
         * <p>The status of the egress proxy configuration. Valid values:</p>
         * <ul>
         * <li><p><strong>Provisioning</strong>: The configuration is being created.</p>
         * </li>
         * <li><p><strong>Available</strong>: The configuration is available.</p>
         * </li>
         * <li><p><strong>Configuring</strong>: The configuration is being modified.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The list of tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        public GetEgressProxyConfigurationAttributeResponseBody build() {
            return new GetEgressProxyConfigurationAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEgressProxyConfigurationAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetEgressProxyConfigurationAttributeResponseBody</p>
     */
    public static class DefaultRulePhaseActions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PostResponse")
        private String postResponse;

        @com.aliyun.core.annotation.NameInMap("PreDns")
        private String preDns;

        @com.aliyun.core.annotation.NameInMap("PreRequest")
        private String preRequest;

        private DefaultRulePhaseActions(Builder builder) {
            this.postResponse = builder.postResponse;
            this.preDns = builder.preDns;
            this.preRequest = builder.preRequest;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultRulePhaseActions create() {
            return builder().build();
        }

        /**
         * @return postResponse
         */
        public String getPostResponse() {
            return this.postResponse;
        }

        /**
         * @return preDns
         */
        public String getPreDns() {
            return this.preDns;
        }

        /**
         * @return preRequest
         */
        public String getPreRequest() {
            return this.preRequest;
        }

        public static final class Builder {
            private String postResponse; 
            private String preDns; 
            private String preRequest; 

            private Builder() {
            } 

            private Builder(DefaultRulePhaseActions model) {
                this.postResponse = model.postResponse;
                this.preDns = model.preDns;
                this.preRequest = model.preRequest;
            } 

            /**
             * <p>The default action executed in the PostResponse phase (after a response is returned) when traffic does not match any rules. This phase only supports the value <strong>Allow</strong> (default), which indicates that the traffic is allowed.</p>
             * 
             * <strong>example:</strong>
             * <p>Allow</p>
             */
            public Builder postResponse(String postResponse) {
                this.postResponse = postResponse;
                return this;
            }

            /**
             * <p>The default action executed in the PreDns phase (before DNS resolution) when traffic does not match any rules. Valid values:</p>
             * <ul>
             * <li><p><strong>Allow</strong> (default): allows the traffic.</p>
             * </li>
             * <li><p><strong>Deny</strong>: denies the traffic.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Allow</p>
             */
            public Builder preDns(String preDns) {
                this.preDns = preDns;
                return this;
            }

            /**
             * <p>The default action executed in the PreRequest phase (before a request is forwarded) when traffic does not match any rules. Valid values:</p>
             * <ul>
             * <li><p><strong>Allow</strong> (default): allows the traffic.</p>
             * </li>
             * <li><p><strong>Deny</strong>: denies the traffic.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Allow</p>
             */
            public Builder preRequest(String preRequest) {
                this.preRequest = preRequest;
                return this;
            }

            public DefaultRulePhaseActions build() {
                return new DefaultRulePhaseActions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEgressProxyConfigurationAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetEgressProxyConfigurationAttributeResponseBody</p>
     */
    public static class RuleGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EgressProxyRuleGroupId")
        private String egressProxyRuleGroupId;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        private RuleGroups(Builder builder) {
            this.egressProxyRuleGroupId = builder.egressProxyRuleGroupId;
            this.priority = builder.priority;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleGroups create() {
            return builder().build();
        }

        /**
         * @return egressProxyRuleGroupId
         */
        public String getEgressProxyRuleGroupId() {
            return this.egressProxyRuleGroupId;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        public static final class Builder {
            private String egressProxyRuleGroupId; 
            private Integer priority; 

            private Builder() {
            } 

            private Builder(RuleGroups model) {
                this.egressProxyRuleGroupId = model.egressProxyRuleGroupId;
                this.priority = model.priority;
            } 

            /**
             * <p>The ID of the egress rule group.</p>
             * 
             * <strong>example:</strong>
             * <p>eprg-uf60966a9633667c****</p>
             */
            public Builder egressProxyRuleGroupId(String egressProxyRuleGroupId) {
                this.egressProxyRuleGroupId = egressProxyRuleGroupId;
                return this;
            }

            /**
             * <p>The priority of the egress rule group in the egress proxy configuration. Valid values: 1 to 1000. A smaller value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            public RuleGroups build() {
                return new RuleGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEgressProxyConfigurationAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetEgressProxyConfigurationAttributeResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key. The key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>testKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. The value can be up to 256 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>testValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
