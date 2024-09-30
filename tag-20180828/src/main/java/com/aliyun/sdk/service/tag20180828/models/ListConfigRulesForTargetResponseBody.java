// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListConfigRulesForTargetResponseBody} extends {@link TeaModel}
 *
 * <p>ListConfigRulesForTargetResponseBody</p>
 */
public class ListConfigRulesForTargetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListConfigRulesForTargetResponseBody(Builder builder) {
        this.data = builder.data;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConfigRulesForTargetResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String nextToken; 
        private String requestId; 

        /**
         * <p>The tag detection tasks.</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Indicates whether the next query is required.</p>
         * <ul>
         * <li>If the value of this parameter is empty (<code>&quot;NextToken&quot;: &quot;&quot;</code>), all results are returned, and the next query is not required.</li>
         * <li>If the value of this parameter is not empty, the next query is required, and the value is the token used to start the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7126AECD-D7AD-5073-8E88-DD2BD1FC139E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListConfigRulesForTargetResponseBody build() {
            return new ListConfigRulesForTargetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListConfigRulesForTargetResponseBody} extends {@link TeaModel}
     *
     * <p>ListConfigRulesForTargetResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AggregatorId")
        private String aggregatorId;

        @com.aliyun.core.annotation.NameInMap("ConfigRuleId")
        private String configRuleId;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        @com.aliyun.core.annotation.NameInMap("Remediation")
        private Boolean remediation;

        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        @com.aliyun.core.annotation.NameInMap("TargetId")
        private String targetId;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        private Data(Builder builder) {
            this.aggregatorId = builder.aggregatorId;
            this.configRuleId = builder.configRuleId;
            this.policyType = builder.policyType;
            this.remediation = builder.remediation;
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
            this.targetId = builder.targetId;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aggregatorId
         */
        public String getAggregatorId() {
            return this.aggregatorId;
        }

        /**
         * @return configRuleId
         */
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        /**
         * @return remediation
         */
        public Boolean getRemediation() {
            return this.remediation;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        /**
         * @return targetId
         */
        public String getTargetId() {
            return this.targetId;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private String aggregatorId; 
            private String configRuleId; 
            private String policyType; 
            private Boolean remediation; 
            private String tagKey; 
            private String tagValue; 
            private String targetId; 
            private String targetType; 

            /**
             * <p>The ID of the account group.</p>
             * <p>You can use the ID to query the content of the related resource non-compliance report in Cloud Config.</p>
             * <blockquote>
             * <p> This parameter is returned only if you use the Tag Policy feature in multi-account mode.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ca-efdc33dc9b37002d****</p>
             */
            public Builder aggregatorId(String aggregatorId) {
                this.aggregatorId = aggregatorId;
                return this;
            }

            /**
             * <p>The ID of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>cr-0lb4866180880069****</p>
             */
            public Builder configRuleId(String configRuleId) {
                this.configRuleId = configRuleId;
                return this;
            }

            /**
             * <p>The use scenario of the tag policy. Valid values:</p>
             * <ul>
             * <li>tags: enables tags with specified tag values to be added to resources.</li>
             * <li>rg_inherit: enables resources in a resource group to automatically inherit tags from the resource group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>tags</p>
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * <p>Indicates whether automatic remediation is enabled. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder remediation(Boolean remediation) {
                this.remediation = remediation;
                return this;
            }

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>CostCenter</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value for automatic remediation.</p>
             * 
             * <strong>example:</strong>
             * <p>Project</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            /**
             * <p>The ID of the object.</p>
             * 
             * <strong>example:</strong>
             * <p>134254031178****</p>
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * <p>The type of the object. Valid values:</p>
             * <ul>
             * <li>USER: the current logon account. This value is available if you use the Tag Policy feature in single-account mode.</li>
             * <li>ROOT: the Root folder in the resource directory. This value is available if you use the Tag Policy feature in multi-account mode.</li>
             * <li>FOLDER: a folder other than the Root folder in the resource directory. This value is available if you use the Tag Policy feature in multi-account mode.</li>
             * <li>ACCOUNT: a member in the resource directory. This value is available if you use the Tag Policy feature in multi-account mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>USER</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
