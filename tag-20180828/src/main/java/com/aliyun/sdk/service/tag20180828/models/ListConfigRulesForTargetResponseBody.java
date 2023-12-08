// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConfigRulesForTargetResponseBody} extends {@link TeaModel}
 *
 * <p>ListConfigRulesForTargetResponseBody</p>
 */
public class ListConfigRulesForTargetResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
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
         * The tag detection tasks.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Indicates whether the next query is required.
         * <p>
         * 
         * *   If the value of this parameter is empty (`"NextToken": ""`), all results are returned, and the next query is not required.
         * *   If the value of this parameter is not empty, the next query is required, and the value is the token used to start the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListConfigRulesForTargetResponseBody build() {
            return new ListConfigRulesForTargetResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AggregatorId")
        private String aggregatorId;

        @NameInMap("ConfigRuleId")
        private String configRuleId;

        @NameInMap("PolicyType")
        private String policyType;

        @NameInMap("Remediation")
        private Boolean remediation;

        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        @NameInMap("TargetId")
        private String targetId;

        @NameInMap("TargetType")
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
             * The ID of the account group.
             * <p>
             * 
             * You can use the ID to query the content of the related resource non-compliance report in Cloud Config.
             * 
             * >  This parameter is returned only if you use the Tag Policy feature in multi-account mode.
             */
            public Builder aggregatorId(String aggregatorId) {
                this.aggregatorId = aggregatorId;
                return this;
            }

            /**
             * The ID of the rule.
             */
            public Builder configRuleId(String configRuleId) {
                this.configRuleId = configRuleId;
                return this;
            }

            /**
             * The use scenario of the tag policy. Valid values:
             * <p>
             * 
             * *   tags: enables tags with specified tag values to be added to resources.
             * *   rg_inherit: enables resources in a resource group to automatically inherit tags from the resource group.
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * Indicates whether automatic remediation is enabled. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder remediation(Boolean remediation) {
                this.remediation = remediation;
                return this;
            }

            /**
             * The tag key.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The tag value for automatic remediation.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            /**
             * The ID of the object.
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * The type of the object. Valid values:
             * <p>
             * 
             * *   USER: the current logon account. This value is available if you use the Tag Policy feature in single-account mode.
             * *   ROOT: the Root folder in the resource directory. This value is available if you use the Tag Policy feature in multi-account mode.
             * *   FOLDER: a folder other than the Root folder in the resource directory. This value is available if you use the Tag Policy feature in multi-account mode.
             * *   ACCOUNT: a member in the resource directory. This value is available if you use the Tag Policy feature in multi-account mode.
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
