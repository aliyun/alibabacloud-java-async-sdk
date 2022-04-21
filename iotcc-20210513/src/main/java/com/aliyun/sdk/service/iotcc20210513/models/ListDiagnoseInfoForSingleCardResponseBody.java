// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDiagnoseInfoForSingleCardResponseBody} extends {@link TeaModel}
 *
 * <p>ListDiagnoseInfoForSingleCardResponseBody</p>
 */
public class ListDiagnoseInfoForSingleCardResponseBody extends TeaModel {
    @NameInMap("DiagnoseInfo")
    private java.util.List < DiagnoseInfo> diagnoseInfo;

    @NameInMap("MaxResults")
    private Long maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
        @NameInMap("BeginTime")
        private Long beginTime;

        @NameInMap("CardIp")
        private String cardIp;

        @NameInMap("Destination")
        private String destination;

        @NameInMap("DestinationType")
        private String destinationType;

        @NameInMap("DiagnoseTime")
        private Long diagnoseTime;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("IccId")
        private String iccId;

        @NameInMap("IoTCloudConnectorId")
        private String ioTCloudConnectorId;

        @NameInMap("Source")
        private String source;

        @NameInMap("SourceType")
        private String sourceType;

        @NameInMap("Status")
        private String status;

        @NameInMap("TaskId")
        private String taskId;

        private DiagnoseInfo(Builder builder) {
            this.beginTime = builder.beginTime;
            this.cardIp = builder.cardIp;
            this.destination = builder.destination;
            this.destinationType = builder.destinationType;
            this.diagnoseTime = builder.diagnoseTime;
            this.endTime = builder.endTime;
            this.iccId = builder.iccId;
            this.ioTCloudConnectorId = builder.ioTCloudConnectorId;
            this.source = builder.source;
            this.sourceType = builder.sourceType;
            this.status = builder.status;
            this.taskId = builder.taskId;
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
         * @return ioTCloudConnectorId
         */
        public String getIoTCloudConnectorId() {
            return this.ioTCloudConnectorId;
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
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private Long beginTime; 
            private String cardIp; 
            private String destination; 
            private String destinationType; 
            private Long diagnoseTime; 
            private Long endTime; 
            private String iccId; 
            private String ioTCloudConnectorId; 
            private String source; 
            private String sourceType; 
            private String status; 
            private String taskId; 

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
             * IoTCloudConnectorId.
             */
            public Builder ioTCloudConnectorId(String ioTCloudConnectorId) {
                this.ioTCloudConnectorId = ioTCloudConnectorId;
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
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public DiagnoseInfo build() {
                return new DiagnoseInfo(this);
            } 

        } 

    }
}
