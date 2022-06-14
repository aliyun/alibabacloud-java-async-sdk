// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGroupAuthorizationRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListGroupAuthorizationRulesResponseBody</p>
 */
public class ListGroupAuthorizationRulesResponseBody extends TeaModel {
    @NameInMap("GroupAuthorizationRules")
    private java.util.List < GroupAuthorizationRules> groupAuthorizationRules;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListGroupAuthorizationRulesResponseBody(Builder builder) {
        this.groupAuthorizationRules = builder.groupAuthorizationRules;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGroupAuthorizationRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return groupAuthorizationRules
     */
    public java.util.List < GroupAuthorizationRules> getGroupAuthorizationRules() {
        return this.groupAuthorizationRules;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < GroupAuthorizationRules> groupAuthorizationRules; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * GroupAuthorizationRules.
         */
        public Builder groupAuthorizationRules(java.util.List < GroupAuthorizationRules> groupAuthorizationRules) {
            this.groupAuthorizationRules = groupAuthorizationRules;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListGroupAuthorizationRulesResponseBody build() {
            return new ListGroupAuthorizationRulesResponseBody(this);
        } 

    } 

    public static class GroupAuthorizationRules extends TeaModel {
        @NameInMap("AuthorizationRuleDescription")
        private String authorizationRuleDescription;

        @NameInMap("AuthorizationRuleId")
        private String authorizationRuleId;

        @NameInMap("AuthorizationRuleName")
        private String authorizationRuleName;

        @NameInMap("AuthorizationRuleStatus")
        private String authorizationRuleStatus;

        @NameInMap("Destination")
        private String destination;

        @NameInMap("DestinationType")
        private String destinationType;

        @NameInMap("IoTCloudConnectorGroupId")
        private String ioTCloudConnectorGroupId;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("SourceCidrs")
        private java.util.List < String > sourceCidrs;

        @NameInMap("Type")
        private String type;

        private GroupAuthorizationRules(Builder builder) {
            this.authorizationRuleDescription = builder.authorizationRuleDescription;
            this.authorizationRuleId = builder.authorizationRuleId;
            this.authorizationRuleName = builder.authorizationRuleName;
            this.authorizationRuleStatus = builder.authorizationRuleStatus;
            this.destination = builder.destination;
            this.destinationType = builder.destinationType;
            this.ioTCloudConnectorGroupId = builder.ioTCloudConnectorGroupId;
            this.policy = builder.policy;
            this.sourceCidrs = builder.sourceCidrs;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupAuthorizationRules create() {
            return builder().build();
        }

        /**
         * @return authorizationRuleDescription
         */
        public String getAuthorizationRuleDescription() {
            return this.authorizationRuleDescription;
        }

        /**
         * @return authorizationRuleId
         */
        public String getAuthorizationRuleId() {
            return this.authorizationRuleId;
        }

        /**
         * @return authorizationRuleName
         */
        public String getAuthorizationRuleName() {
            return this.authorizationRuleName;
        }

        /**
         * @return authorizationRuleStatus
         */
        public String getAuthorizationRuleStatus() {
            return this.authorizationRuleStatus;
        }

        /**
         * @return destination
         */
        public String getDestination() {
            return this.destination;
        }

        /**
         * @return destinationType
         */
        public String getDestinationType() {
            return this.destinationType;
        }

        /**
         * @return ioTCloudConnectorGroupId
         */
        public String getIoTCloudConnectorGroupId() {
            return this.ioTCloudConnectorGroupId;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return sourceCidrs
         */
        public java.util.List < String > getSourceCidrs() {
            return this.sourceCidrs;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String authorizationRuleDescription; 
            private String authorizationRuleId; 
            private String authorizationRuleName; 
            private String authorizationRuleStatus; 
            private String destination; 
            private String destinationType; 
            private String ioTCloudConnectorGroupId; 
            private String policy; 
            private java.util.List < String > sourceCidrs; 
            private String type; 

            /**
             * AuthorizationRuleDescription.
             */
            public Builder authorizationRuleDescription(String authorizationRuleDescription) {
                this.authorizationRuleDescription = authorizationRuleDescription;
                return this;
            }

            /**
             * AuthorizationRuleId.
             */
            public Builder authorizationRuleId(String authorizationRuleId) {
                this.authorizationRuleId = authorizationRuleId;
                return this;
            }

            /**
             * AuthorizationRuleName.
             */
            public Builder authorizationRuleName(String authorizationRuleName) {
                this.authorizationRuleName = authorizationRuleName;
                return this;
            }

            /**
             * AuthorizationRuleStatus.
             */
            public Builder authorizationRuleStatus(String authorizationRuleStatus) {
                this.authorizationRuleStatus = authorizationRuleStatus;
                return this;
            }

            /**
             * Destination.
             */
            public Builder destination(String destination) {
                this.destination = destination;
                return this;
            }

            /**
             * DestinationType.
             */
            public Builder destinationType(String destinationType) {
                this.destinationType = destinationType;
                return this;
            }

            /**
             * IoTCloudConnectorGroupId.
             */
            public Builder ioTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
                this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
                return this;
            }

            /**
             * Policy.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * SourceCidrs.
             */
            public Builder sourceCidrs(java.util.List < String > sourceCidrs) {
                this.sourceCidrs = sourceCidrs;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public GroupAuthorizationRules build() {
                return new GroupAuthorizationRules(this);
            } 

        } 

    }
}
