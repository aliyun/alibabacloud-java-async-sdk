// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGroupDNSServiceRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListGroupDNSServiceRulesResponseBody</p>
 */
public class ListGroupDNSServiceRulesResponseBody extends TeaModel {
    @NameInMap("DNSServiceRules")
    private java.util.List < DNSServiceRules> DNSServiceRules;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListGroupDNSServiceRulesResponseBody(Builder builder) {
        this.DNSServiceRules = builder.DNSServiceRules;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGroupDNSServiceRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return DNSServiceRules
     */
    public java.util.List < DNSServiceRules> getDNSServiceRules() {
        return this.DNSServiceRules;
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
        private java.util.List < DNSServiceRules> DNSServiceRules; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * DNSServiceRules.
         */
        public Builder DNSServiceRules(java.util.List < DNSServiceRules> DNSServiceRules) {
            this.DNSServiceRules = DNSServiceRules;
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

        public ListGroupDNSServiceRulesResponseBody build() {
            return new ListGroupDNSServiceRulesResponseBody(this);
        } 

    } 

    public static class DNSServiceRules extends TeaModel {
        @NameInMap("DNSServiceRuleDescription")
        private String DNSServiceRuleDescription;

        @NameInMap("DNSServiceRuleId")
        private String DNSServiceRuleId;

        @NameInMap("DNSServiceRuleName")
        private String DNSServiceRuleName;

        @NameInMap("DNSServiceRuleStatus")
        private String DNSServiceRuleStatus;

        @NameInMap("Destination")
        private String destination;

        @NameInMap("IoTCloudConnectorGroupId")
        private String ioTCloudConnectorGroupId;

        @NameInMap("ServiceType")
        private String serviceType;

        @NameInMap("Source")
        private String source;

        private DNSServiceRules(Builder builder) {
            this.DNSServiceRuleDescription = builder.DNSServiceRuleDescription;
            this.DNSServiceRuleId = builder.DNSServiceRuleId;
            this.DNSServiceRuleName = builder.DNSServiceRuleName;
            this.DNSServiceRuleStatus = builder.DNSServiceRuleStatus;
            this.destination = builder.destination;
            this.ioTCloudConnectorGroupId = builder.ioTCloudConnectorGroupId;
            this.serviceType = builder.serviceType;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DNSServiceRules create() {
            return builder().build();
        }

        /**
         * @return DNSServiceRuleDescription
         */
        public String getDNSServiceRuleDescription() {
            return this.DNSServiceRuleDescription;
        }

        /**
         * @return DNSServiceRuleId
         */
        public String getDNSServiceRuleId() {
            return this.DNSServiceRuleId;
        }

        /**
         * @return DNSServiceRuleName
         */
        public String getDNSServiceRuleName() {
            return this.DNSServiceRuleName;
        }

        /**
         * @return DNSServiceRuleStatus
         */
        public String getDNSServiceRuleStatus() {
            return this.DNSServiceRuleStatus;
        }

        /**
         * @return destination
         */
        public String getDestination() {
            return this.destination;
        }

        /**
         * @return ioTCloudConnectorGroupId
         */
        public String getIoTCloudConnectorGroupId() {
            return this.ioTCloudConnectorGroupId;
        }

        /**
         * @return serviceType
         */
        public String getServiceType() {
            return this.serviceType;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private String DNSServiceRuleDescription; 
            private String DNSServiceRuleId; 
            private String DNSServiceRuleName; 
            private String DNSServiceRuleStatus; 
            private String destination; 
            private String ioTCloudConnectorGroupId; 
            private String serviceType; 
            private String source; 

            /**
             * DNSServiceRuleDescription.
             */
            public Builder DNSServiceRuleDescription(String DNSServiceRuleDescription) {
                this.DNSServiceRuleDescription = DNSServiceRuleDescription;
                return this;
            }

            /**
             * DNSServiceRuleId.
             */
            public Builder DNSServiceRuleId(String DNSServiceRuleId) {
                this.DNSServiceRuleId = DNSServiceRuleId;
                return this;
            }

            /**
             * DNSServiceRuleName.
             */
            public Builder DNSServiceRuleName(String DNSServiceRuleName) {
                this.DNSServiceRuleName = DNSServiceRuleName;
                return this;
            }

            /**
             * DNSServiceRuleStatus.
             */
            public Builder DNSServiceRuleStatus(String DNSServiceRuleStatus) {
                this.DNSServiceRuleStatus = DNSServiceRuleStatus;
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
             * IoTCloudConnectorGroupId.
             */
            public Builder ioTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
                this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
                return this;
            }

            /**
             * ServiceType.
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public DNSServiceRules build() {
                return new DNSServiceRules(this);
            } 

        } 

    }
}
