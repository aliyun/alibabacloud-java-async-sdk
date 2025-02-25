// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGroupAuthorizationRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListGroupAuthorizationRulesResponseBody</p>
 */
public class ListGroupAuthorizationRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GroupAuthorizationRules")
    private java.util.List < GroupAuthorizationRules> groupAuthorizationRules;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private String maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

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
    public String getMaxResults() {
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
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < GroupAuthorizationRules> groupAuthorizationRules; 
        private String maxResults; 
        private String nextToken; 
        private String requestId; 
        private String totalCount; 

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
        public Builder maxResults(String maxResults) {
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
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListGroupAuthorizationRulesResponseBody build() {
            return new ListGroupAuthorizationRulesResponseBody(this);
        } 

    } 

    public static class GroupAuthorizationRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizationRuleId")
        private String authorizationRuleId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Destination")
        private String destination;

        @com.aliyun.core.annotation.NameInMap("DestinationPort")
        private String destinationPort;

        @com.aliyun.core.annotation.NameInMap("DestinationType")
        private String destinationType;

        @com.aliyun.core.annotation.NameInMap("Dns")
        private Boolean dns;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("SourceCidr")
        private String sourceCidr;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private GroupAuthorizationRules(Builder builder) {
            this.authorizationRuleId = builder.authorizationRuleId;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.destination = builder.destination;
            this.destinationPort = builder.destinationPort;
            this.destinationType = builder.destinationType;
            this.dns = builder.dns;
            this.name = builder.name;
            this.policy = builder.policy;
            this.protocol = builder.protocol;
            this.sourceCidr = builder.sourceCidr;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupAuthorizationRules create() {
            return builder().build();
        }

        /**
         * @return authorizationRuleId
         */
        public String getAuthorizationRuleId() {
            return this.authorizationRuleId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return destination
         */
        public String getDestination() {
            return this.destination;
        }

        /**
         * @return destinationPort
         */
        public String getDestinationPort() {
            return this.destinationPort;
        }

        /**
         * @return destinationType
         */
        public String getDestinationType() {
            return this.destinationType;
        }

        /**
         * @return dns
         */
        public Boolean getDns() {
            return this.dns;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return sourceCidr
         */
        public String getSourceCidr() {
            return this.sourceCidr;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String authorizationRuleId; 
            private String createTime; 
            private String description; 
            private String destination; 
            private String destinationPort; 
            private String destinationType; 
            private Boolean dns; 
            private String name; 
            private String policy; 
            private String protocol; 
            private String sourceCidr; 
            private String status; 
            private String type; 

            /**
             * 代表资源一级ID的资源属性字段
             */
            public Builder authorizationRuleId(String authorizationRuleId) {
                this.authorizationRuleId = authorizationRuleId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * DestinationPort.
             */
            public Builder destinationPort(String destinationPort) {
                this.destinationPort = destinationPort;
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
             * Dns.
             */
            public Builder dns(Boolean dns) {
                this.dns = dns;
                return this;
            }

            /**
             * 代表创建时间的资源属性字段
             */
            public Builder name(String name) {
                this.name = name;
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
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * SourceCidr.
             */
            public Builder sourceCidr(String sourceCidr) {
                this.sourceCidr = sourceCidr;
                return this;
            }

            /**
             * 代表资源名称的资源属性字段
             */
            public Builder status(String status) {
                this.status = status;
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
