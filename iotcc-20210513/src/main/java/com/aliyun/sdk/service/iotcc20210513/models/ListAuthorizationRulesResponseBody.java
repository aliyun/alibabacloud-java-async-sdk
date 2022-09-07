// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAuthorizationRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAuthorizationRulesResponseBody</p>
 */
public class ListAuthorizationRulesResponseBody extends TeaModel {
    @NameInMap("AuthorizationRules")
    private java.util.List < AuthorizationRules> authorizationRules;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListAuthorizationRulesResponseBody(Builder builder) {
        this.authorizationRules = builder.authorizationRules;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthorizationRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return authorizationRules
     */
    public java.util.List < AuthorizationRules> getAuthorizationRules() {
        return this.authorizationRules;
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
        private java.util.List < AuthorizationRules> authorizationRules; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * AuthorizationRules.
         */
        public Builder authorizationRules(java.util.List < AuthorizationRules> authorizationRules) {
            this.authorizationRules = authorizationRules;
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

        public ListAuthorizationRulesResponseBody build() {
            return new ListAuthorizationRulesResponseBody(this);
        } 

    } 

    public static class AuthorizationRules extends TeaModel {
        @NameInMap("AuthorizationRuleDescription")
        private String authorizationRuleDescription;

        @NameInMap("AuthorizationRuleId")
        private String authorizationRuleId;

        @NameInMap("AuthorizationRuleName")
        private String authorizationRuleName;

        @NameInMap("AuthorizationRuleStatus")
        private String authorizationRuleStatus;

        @NameInMap("AuthorizationRuleType")
        private String authorizationRuleType;

        @NameInMap("Destination")
        private String destination;

        @NameInMap("DestinationPort")
        private String destinationPort;

        @NameInMap("DestinationType")
        private String destinationType;

        @NameInMap("IoTCloudConnectorId")
        private String ioTCloudConnectorId;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("SourceCidrs")
        private java.util.List < String > sourceCidrs;

        private AuthorizationRules(Builder builder) {
            this.authorizationRuleDescription = builder.authorizationRuleDescription;
            this.authorizationRuleId = builder.authorizationRuleId;
            this.authorizationRuleName = builder.authorizationRuleName;
            this.authorizationRuleStatus = builder.authorizationRuleStatus;
            this.authorizationRuleType = builder.authorizationRuleType;
            this.destination = builder.destination;
            this.destinationPort = builder.destinationPort;
            this.destinationType = builder.destinationType;
            this.ioTCloudConnectorId = builder.ioTCloudConnectorId;
            this.policy = builder.policy;
            this.protocol = builder.protocol;
            this.sourceCidrs = builder.sourceCidrs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorizationRules create() {
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
         * @return authorizationRuleType
         */
        public String getAuthorizationRuleType() {
            return this.authorizationRuleType;
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
         * @return ioTCloudConnectorId
         */
        public String getIoTCloudConnectorId() {
            return this.ioTCloudConnectorId;
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
         * @return sourceCidrs
         */
        public java.util.List < String > getSourceCidrs() {
            return this.sourceCidrs;
        }

        public static final class Builder {
            private String authorizationRuleDescription; 
            private String authorizationRuleId; 
            private String authorizationRuleName; 
            private String authorizationRuleStatus; 
            private String authorizationRuleType; 
            private String destination; 
            private String destinationPort; 
            private String destinationType; 
            private String ioTCloudConnectorId; 
            private String policy; 
            private String protocol; 
            private java.util.List < String > sourceCidrs; 

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
             * AuthorizationRuleType.
             */
            public Builder authorizationRuleType(String authorizationRuleType) {
                this.authorizationRuleType = authorizationRuleType;
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
             * IoTCloudConnectorId.
             */
            public Builder ioTCloudConnectorId(String ioTCloudConnectorId) {
                this.ioTCloudConnectorId = ioTCloudConnectorId;
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
             * SourceCidrs.
             */
            public Builder sourceCidrs(java.util.List < String > sourceCidrs) {
                this.sourceCidrs = sourceCidrs;
                return this;
            }

            public AuthorizationRules build() {
                return new AuthorizationRules(this);
            } 

        } 

    }
}
