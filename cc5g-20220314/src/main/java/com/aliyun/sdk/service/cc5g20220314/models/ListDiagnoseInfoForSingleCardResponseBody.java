// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDiagnoseInfoForSingleCardResponseBody} extends {@link TeaModel}
 *
 * <p>ListDiagnoseInfoForSingleCardResponseBody</p>
 */
public class ListDiagnoseInfoForSingleCardResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DiagnoseInfo")
    private java.util.List < DiagnoseInfo> diagnoseInfo;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListDiagnoseInfoForSingleCardResponseBody(Builder builder) {
        this.diagnoseInfo = builder.diagnoseInfo;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDiagnoseInfoForSingleCardResponseBody create() {
        return builder().build();
    }

    /**
     * @return diagnoseInfo
     */
    public java.util.List < DiagnoseInfo> getDiagnoseInfo() {
        return this.diagnoseInfo;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < DiagnoseInfo> diagnoseInfo; 
        private Long maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        /**
         * DiagnoseInfo.
         */
        public Builder diagnoseInfo(java.util.List < DiagnoseInfo> diagnoseInfo) {
            this.diagnoseInfo = diagnoseInfo;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
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
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDiagnoseInfoForSingleCardResponseBody build() {
            return new ListDiagnoseInfoForSingleCardResponseBody(this);
        } 

    } 

    public static class DiagnoseInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private Long beginTime;

        @com.aliyun.core.annotation.NameInMap("CardIp")
        private String cardIp;

        @com.aliyun.core.annotation.NameInMap("Destination")
        private String destination;

        @com.aliyun.core.annotation.NameInMap("DestinationType")
        private String destinationType;

        @com.aliyun.core.annotation.NameInMap("DiagnoseTaskId")
        private String diagnoseTaskId;

        @com.aliyun.core.annotation.NameInMap("DiagnoseTime")
        private Long diagnoseTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("IccId")
        private String iccId;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("WirelessCloudConnectorId")
        private String wirelessCloudConnectorId;

        private DiagnoseInfo(Builder builder) {
            this.beginTime = builder.beginTime;
            this.cardIp = builder.cardIp;
            this.destination = builder.destination;
            this.destinationType = builder.destinationType;
            this.diagnoseTaskId = builder.diagnoseTaskId;
            this.diagnoseTime = builder.diagnoseTime;
            this.endTime = builder.endTime;
            this.iccId = builder.iccId;
            this.source = builder.source;
            this.sourceType = builder.sourceType;
            this.status = builder.status;
            this.wirelessCloudConnectorId = builder.wirelessCloudConnectorId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiagnoseInfo create() {
            return builder().build();
        }

        /**
         * @return beginTime
         */
        public Long getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return cardIp
         */
        public String getCardIp() {
            return this.cardIp;
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
         * @return diagnoseTaskId
         */
        public String getDiagnoseTaskId() {
            return this.diagnoseTaskId;
        }

        /**
         * @return diagnoseTime
         */
        public Long getDiagnoseTime() {
            return this.diagnoseTime;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return iccId
         */
        public String getIccId() {
            return this.iccId;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return wirelessCloudConnectorId
         */
        public String getWirelessCloudConnectorId() {
            return this.wirelessCloudConnectorId;
        }

        public static final class Builder {
            private Long beginTime; 
            private String cardIp; 
            private String destination; 
            private String destinationType; 
            private String diagnoseTaskId; 
            private Long diagnoseTime; 
            private Long endTime; 
            private String iccId; 
            private String source; 
            private String sourceType; 
            private String status; 
            private String wirelessCloudConnectorId; 

            /**
             * BeginTime.
             */
            public Builder beginTime(Long beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * CardIp.
             */
            public Builder cardIp(String cardIp) {
                this.cardIp = cardIp;
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
             * DiagnoseTaskId.
             */
            public Builder diagnoseTaskId(String diagnoseTaskId) {
                this.diagnoseTaskId = diagnoseTaskId;
                return this;
            }

            /**
             * DiagnoseTime.
             */
            public Builder diagnoseTime(Long diagnoseTime) {
                this.diagnoseTime = diagnoseTime;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * IccId.
             */
            public Builder iccId(String iccId) {
                this.iccId = iccId;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * WirelessCloudConnectorId.
             */
            public Builder wirelessCloudConnectorId(String wirelessCloudConnectorId) {
                this.wirelessCloudConnectorId = wirelessCloudConnectorId;
                return this;
            }

            public DiagnoseInfo build() {
                return new DiagnoseInfo(this);
            } 

        } 

    }
}
