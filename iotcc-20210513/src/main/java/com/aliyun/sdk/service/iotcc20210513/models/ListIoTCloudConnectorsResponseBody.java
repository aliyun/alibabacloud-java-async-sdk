// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIoTCloudConnectorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIoTCloudConnectorsResponseBody</p>
 */
public class ListIoTCloudConnectorsResponseBody extends TeaModel {
    @NameInMap("IoTCloudConnectors")
    private java.util.List < IoTCloudConnectors> ioTCloudConnectors;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListIoTCloudConnectorsResponseBody(Builder builder) {
        this.ioTCloudConnectors = builder.ioTCloudConnectors;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIoTCloudConnectorsResponseBody create() {
        return builder().build();
    }

    /**
     * @return ioTCloudConnectors
     */
    public java.util.List < IoTCloudConnectors> getIoTCloudConnectors() {
        return this.ioTCloudConnectors;
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
        private java.util.List < IoTCloudConnectors> ioTCloudConnectors; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * IoTCloudConnectors.
         */
        public Builder ioTCloudConnectors(java.util.List < IoTCloudConnectors> ioTCloudConnectors) {
            this.ioTCloudConnectors = ioTCloudConnectors;
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

        public ListIoTCloudConnectorsResponseBody build() {
            return new ListIoTCloudConnectorsResponseBody(this);
        } 

    } 

    public static class IoTCloudConnectors extends TeaModel {
        @NameInMap("APN")
        private String APN;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("ISP")
        private String ISP;

        @NameInMap("IoTCloudConnectorBusinessStatus")
        private String ioTCloudConnectorBusinessStatus;

        @NameInMap("IoTCloudConnectorDescription")
        private String ioTCloudConnectorDescription;

        @NameInMap("IoTCloudConnectorGroupId")
        private String ioTCloudConnectorGroupId;

        @NameInMap("IoTCloudConnectorId")
        private String ioTCloudConnectorId;

        @NameInMap("IoTCloudConnectorName")
        private String ioTCloudConnectorName;

        @NameInMap("IoTCloudConnectorStatus")
        private String ioTCloudConnectorStatus;

        @NameInMap("ModifyTime")
        private Long modifyTime;

        @NameInMap("RateLimit")
        private Long rateLimit;

        @NameInMap("VSwitchList")
        private java.util.List < String > vSwitchList;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("WildcardDomainEnabled")
        private Boolean wildcardDomainEnabled;

        private IoTCloudConnectors(Builder builder) {
            this.APN = builder.APN;
            this.createTime = builder.createTime;
            this.ISP = builder.ISP;
            this.ioTCloudConnectorBusinessStatus = builder.ioTCloudConnectorBusinessStatus;
            this.ioTCloudConnectorDescription = builder.ioTCloudConnectorDescription;
            this.ioTCloudConnectorGroupId = builder.ioTCloudConnectorGroupId;
            this.ioTCloudConnectorId = builder.ioTCloudConnectorId;
            this.ioTCloudConnectorName = builder.ioTCloudConnectorName;
            this.ioTCloudConnectorStatus = builder.ioTCloudConnectorStatus;
            this.modifyTime = builder.modifyTime;
            this.rateLimit = builder.rateLimit;
            this.vSwitchList = builder.vSwitchList;
            this.vpcId = builder.vpcId;
            this.wildcardDomainEnabled = builder.wildcardDomainEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IoTCloudConnectors create() {
            return builder().build();
        }

        /**
         * @return APN
         */
        public String getAPN() {
            return this.APN;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return ISP
         */
        public String getISP() {
            return this.ISP;
        }

        /**
         * @return ioTCloudConnectorBusinessStatus
         */
        public String getIoTCloudConnectorBusinessStatus() {
            return this.ioTCloudConnectorBusinessStatus;
        }

        /**
         * @return ioTCloudConnectorDescription
         */
        public String getIoTCloudConnectorDescription() {
            return this.ioTCloudConnectorDescription;
        }

        /**
         * @return ioTCloudConnectorGroupId
         */
        public String getIoTCloudConnectorGroupId() {
            return this.ioTCloudConnectorGroupId;
        }

        /**
         * @return ioTCloudConnectorId
         */
        public String getIoTCloudConnectorId() {
            return this.ioTCloudConnectorId;
        }

        /**
         * @return ioTCloudConnectorName
         */
        public String getIoTCloudConnectorName() {
            return this.ioTCloudConnectorName;
        }

        /**
         * @return ioTCloudConnectorStatus
         */
        public String getIoTCloudConnectorStatus() {
            return this.ioTCloudConnectorStatus;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return rateLimit
         */
        public Long getRateLimit() {
            return this.rateLimit;
        }

        /**
         * @return vSwitchList
         */
        public java.util.List < String > getVSwitchList() {
            return this.vSwitchList;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return wildcardDomainEnabled
         */
        public Boolean getWildcardDomainEnabled() {
            return this.wildcardDomainEnabled;
        }

        public static final class Builder {
            private String APN; 
            private Long createTime; 
            private String ISP; 
            private String ioTCloudConnectorBusinessStatus; 
            private String ioTCloudConnectorDescription; 
            private String ioTCloudConnectorGroupId; 
            private String ioTCloudConnectorId; 
            private String ioTCloudConnectorName; 
            private String ioTCloudConnectorStatus; 
            private Long modifyTime; 
            private Long rateLimit; 
            private java.util.List < String > vSwitchList; 
            private String vpcId; 
            private Boolean wildcardDomainEnabled; 

            /**
             * APN.
             */
            public Builder APN(String APN) {
                this.APN = APN;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ISP.
             */
            public Builder ISP(String ISP) {
                this.ISP = ISP;
                return this;
            }

            /**
             * IoTCloudConnectorBusinessStatus.
             */
            public Builder ioTCloudConnectorBusinessStatus(String ioTCloudConnectorBusinessStatus) {
                this.ioTCloudConnectorBusinessStatus = ioTCloudConnectorBusinessStatus;
                return this;
            }

            /**
             * IoTCloudConnectorDescription.
             */
            public Builder ioTCloudConnectorDescription(String ioTCloudConnectorDescription) {
                this.ioTCloudConnectorDescription = ioTCloudConnectorDescription;
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
             * IoTCloudConnectorId.
             */
            public Builder ioTCloudConnectorId(String ioTCloudConnectorId) {
                this.ioTCloudConnectorId = ioTCloudConnectorId;
                return this;
            }

            /**
             * IoTCloudConnectorName.
             */
            public Builder ioTCloudConnectorName(String ioTCloudConnectorName) {
                this.ioTCloudConnectorName = ioTCloudConnectorName;
                return this;
            }

            /**
             * IoTCloudConnectorStatus.
             */
            public Builder ioTCloudConnectorStatus(String ioTCloudConnectorStatus) {
                this.ioTCloudConnectorStatus = ioTCloudConnectorStatus;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * RateLimit.
             */
            public Builder rateLimit(Long rateLimit) {
                this.rateLimit = rateLimit;
                return this;
            }

            /**
             * VSwitchList.
             */
            public Builder vSwitchList(java.util.List < String > vSwitchList) {
                this.vSwitchList = vSwitchList;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * WildcardDomainEnabled.
             */
            public Builder wildcardDomainEnabled(Boolean wildcardDomainEnabled) {
                this.wildcardDomainEnabled = wildcardDomainEnabled;
                return this;
            }

            public IoTCloudConnectors build() {
                return new IoTCloudConnectors(this);
            } 

        } 

    }
}
