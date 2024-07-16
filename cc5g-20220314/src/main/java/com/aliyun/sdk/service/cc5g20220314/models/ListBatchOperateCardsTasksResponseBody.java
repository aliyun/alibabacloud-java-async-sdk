// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBatchOperateCardsTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListBatchOperateCardsTasksResponseBody</p>
 */
public class ListBatchOperateCardsTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BatchOperateCardsTasks")
    private java.util.List < BatchOperateCardsTasks> batchOperateCardsTasks;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private String maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListBatchOperateCardsTasksResponseBody(Builder builder) {
        this.batchOperateCardsTasks = builder.batchOperateCardsTasks;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBatchOperateCardsTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return batchOperateCardsTasks
     */
    public java.util.List < BatchOperateCardsTasks> getBatchOperateCardsTasks() {
        return this.batchOperateCardsTasks;
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
        private java.util.List < BatchOperateCardsTasks> batchOperateCardsTasks; 
        private String maxResults; 
        private String nextToken; 
        private String requestId; 
        private String totalCount; 

        /**
         * BatchOperateCardsTasks.
         */
        public Builder batchOperateCardsTasks(java.util.List < BatchOperateCardsTasks> batchOperateCardsTasks) {
            this.batchOperateCardsTasks = batchOperateCardsTasks;
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

        public ListBatchOperateCardsTasksResponseBody build() {
            return new ListBatchOperateCardsTasksResponseBody(this);
        } 

    } 

    public static class WirelessCloudConnectors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("WirelessCloudConnectorId")
        private String wirelessCloudConnectorId;

        private WirelessCloudConnectors(Builder builder) {
            this.status = builder.status;
            this.wirelessCloudConnectorId = builder.wirelessCloudConnectorId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WirelessCloudConnectors create() {
            return builder().build();
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
            private String status; 
            private String wirelessCloudConnectorId; 

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

            public WirelessCloudConnectors build() {
                return new WirelessCloudConnectors(this);
            } 

        } 

    }
    public static class BatchOperateCardsTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BatchOperateCardsTaskId")
        private String batchOperateCardsTaskId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EffectType")
        private String effectType;

        @com.aliyun.core.annotation.NameInMap("IccidsOssFilePath")
        private String iccidsOssFilePath;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OperateResultOssFilePath")
        private String operateResultOssFilePath;

        @com.aliyun.core.annotation.NameInMap("OperateType")
        private String operateType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        @com.aliyun.core.annotation.NameInMap("WirelessCloudConnectors")
        private java.util.List < WirelessCloudConnectors> wirelessCloudConnectors;

        private BatchOperateCardsTasks(Builder builder) {
            this.batchOperateCardsTaskId = builder.batchOperateCardsTaskId;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.effectType = builder.effectType;
            this.iccidsOssFilePath = builder.iccidsOssFilePath;
            this.name = builder.name;
            this.operateResultOssFilePath = builder.operateResultOssFilePath;
            this.operateType = builder.operateType;
            this.status = builder.status;
            this.threshold = builder.threshold;
            this.wirelessCloudConnectors = builder.wirelessCloudConnectors;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BatchOperateCardsTasks create() {
            return builder().build();
        }

        /**
         * @return batchOperateCardsTaskId
         */
        public String getBatchOperateCardsTaskId() {
            return this.batchOperateCardsTaskId;
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
         * @return effectType
         */
        public String getEffectType() {
            return this.effectType;
        }

        /**
         * @return iccidsOssFilePath
         */
        public String getIccidsOssFilePath() {
            return this.iccidsOssFilePath;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return operateResultOssFilePath
         */
        public String getOperateResultOssFilePath() {
            return this.operateResultOssFilePath;
        }

        /**
         * @return operateType
         */
        public String getOperateType() {
            return this.operateType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return threshold
         */
        public String getThreshold() {
            return this.threshold;
        }

        /**
         * @return wirelessCloudConnectors
         */
        public java.util.List < WirelessCloudConnectors> getWirelessCloudConnectors() {
            return this.wirelessCloudConnectors;
        }

        public static final class Builder {
            private String batchOperateCardsTaskId; 
            private String createTime; 
            private String description; 
            private String effectType; 
            private String iccidsOssFilePath; 
            private String name; 
            private String operateResultOssFilePath; 
            private String operateType; 
            private String status; 
            private String threshold; 
            private java.util.List < WirelessCloudConnectors> wirelessCloudConnectors; 

            /**
             * 代表资源一级ID的资源属性字段
             */
            public Builder batchOperateCardsTaskId(String batchOperateCardsTaskId) {
                this.batchOperateCardsTaskId = batchOperateCardsTaskId;
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
             * EffectType.
             */
            public Builder effectType(String effectType) {
                this.effectType = effectType;
                return this;
            }

            /**
             * IccidsOssFilePath.
             */
            public Builder iccidsOssFilePath(String iccidsOssFilePath) {
                this.iccidsOssFilePath = iccidsOssFilePath;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OperateResultOssFilePath.
             */
            public Builder operateResultOssFilePath(String operateResultOssFilePath) {
                this.operateResultOssFilePath = operateResultOssFilePath;
                return this;
            }

            /**
             * 代表创建时间的资源属性字段
             */
            public Builder operateType(String operateType) {
                this.operateType = operateType;
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
             * Threshold.
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * WirelessCloudConnectors.
             */
            public Builder wirelessCloudConnectors(java.util.List < WirelessCloudConnectors> wirelessCloudConnectors) {
                this.wirelessCloudConnectors = wirelessCloudConnectors;
                return this;
            }

            public BatchOperateCardsTasks build() {
                return new BatchOperateCardsTasks(this);
            } 

        } 

    }
}
