// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIpMappingRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListIpMappingRulesResponseBody</p>
 */
public class ListIpMappingRulesResponseBody extends TeaModel {
    @NameInMap("IpMappingRules")
    private java.util.List < IpMappingRules> ipMappingRules;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListIpMappingRulesResponseBody(Builder builder) {
        this.ipMappingRules = builder.ipMappingRules;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIpMappingRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipMappingRules
     */
    public java.util.List < IpMappingRules> getIpMappingRules() {
        return this.ipMappingRules;
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
        private java.util.List < IpMappingRules> ipMappingRules; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * IpMappingRules.
         */
        public Builder ipMappingRules(java.util.List < IpMappingRules> ipMappingRules) {
            this.ipMappingRules = ipMappingRules;
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

        public ListIpMappingRulesResponseBody build() {
            return new ListIpMappingRulesResponseBody(this);
        } 

    } 

    public static class IpMappingRules extends TeaModel {
        @NameInMap("DestinationIp")
        private String destinationIp;

        @NameInMap("IoTCloudConnectorId")
        private String ioTCloudConnectorId;

        @NameInMap("IpMappingRuleDescription")
        private String ipMappingRuleDescription;

        @NameInMap("IpMappingRuleId")
        private String ipMappingRuleId;

        @NameInMap("IpMappingRuleName")
        private String ipMappingRuleName;

        @NameInMap("IpMappingRuleStatus")
        private String ipMappingRuleStatus;

        @NameInMap("MappingIp")
        private String mappingIp;

        private IpMappingRules(Builder builder) {
            this.destinationIp = builder.destinationIp;
            this.ioTCloudConnectorId = builder.ioTCloudConnectorId;
            this.ipMappingRuleDescription = builder.ipMappingRuleDescription;
            this.ipMappingRuleId = builder.ipMappingRuleId;
            this.ipMappingRuleName = builder.ipMappingRuleName;
            this.ipMappingRuleStatus = builder.ipMappingRuleStatus;
            this.mappingIp = builder.mappingIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpMappingRules create() {
            return builder().build();
        }

        /**
         * @return destinationIp
         */
        public String getDestinationIp() {
            return this.destinationIp;
        }

        /**
         * @return ioTCloudConnectorId
         */
        public String getIoTCloudConnectorId() {
            return this.ioTCloudConnectorId;
        }

        /**
         * @return ipMappingRuleDescription
         */
        public String getIpMappingRuleDescription() {
            return this.ipMappingRuleDescription;
        }

        /**
         * @return ipMappingRuleId
         */
        public String getIpMappingRuleId() {
            return this.ipMappingRuleId;
        }

        /**
         * @return ipMappingRuleName
         */
        public String getIpMappingRuleName() {
            return this.ipMappingRuleName;
        }

        /**
         * @return ipMappingRuleStatus
         */
        public String getIpMappingRuleStatus() {
            return this.ipMappingRuleStatus;
        }

        /**
         * @return mappingIp
         */
        public String getMappingIp() {
            return this.mappingIp;
        }

        public static final class Builder {
            private String destinationIp; 
            private String ioTCloudConnectorId; 
            private String ipMappingRuleDescription; 
            private String ipMappingRuleId; 
            private String ipMappingRuleName; 
            private String ipMappingRuleStatus; 
            private String mappingIp; 

            /**
             * DestinationIp.
             */
            public Builder destinationIp(String destinationIp) {
                this.destinationIp = destinationIp;
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
             * IpMappingRuleDescription.
             */
            public Builder ipMappingRuleDescription(String ipMappingRuleDescription) {
                this.ipMappingRuleDescription = ipMappingRuleDescription;
                return this;
            }

            /**
             * IpMappingRuleId.
             */
            public Builder ipMappingRuleId(String ipMappingRuleId) {
                this.ipMappingRuleId = ipMappingRuleId;
                return this;
            }

            /**
             * IpMappingRuleName.
             */
            public Builder ipMappingRuleName(String ipMappingRuleName) {
                this.ipMappingRuleName = ipMappingRuleName;
                return this;
            }

            /**
             * IpMappingRuleStatus.
             */
            public Builder ipMappingRuleStatus(String ipMappingRuleStatus) {
                this.ipMappingRuleStatus = ipMappingRuleStatus;
                return this;
            }

            /**
             * MappingIp.
             */
            public Builder mappingIp(String mappingIp) {
                this.mappingIp = mappingIp;
                return this;
            }

            public IpMappingRules build() {
                return new IpMappingRules(this);
            } 

        } 

    }
}
