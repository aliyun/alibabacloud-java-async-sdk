// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDisasterRecoveryCheckpointsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDisasterRecoveryCheckpointsResponseBody</p>
 */
public class ListDisasterRecoveryCheckpointsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("dynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("dynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ListDisasterRecoveryCheckpointsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDisasterRecoveryCheckpointsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListDisasterRecoveryCheckpointsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Error code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Response Data</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Dynamic error code</p>
         * 
         * <strong>example:</strong>
         * <p>InstanceId</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic error message.</p>
         * 
         * <strong>example:</strong>
         * <p>instanceId</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>HTTP status code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Error message</p>
         * 
         * <strong>example:</strong>
         * <p>The instance cannot be found.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>AF9A8B10-C426-530F-A0DD-96320B39****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Whether the operation was successful</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDisasterRecoveryCheckpointsResponseBody build() {
            return new ListDisasterRecoveryCheckpointsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDisasterRecoveryCheckpointsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDisasterRecoveryCheckpointsResponseBody</p>
     */
    public static class ProgressData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("consumeTimestamp")
        private Long consumeTimestamp;

        private ProgressData(Builder builder) {
            this.consumeTimestamp = builder.consumeTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProgressData create() {
            return builder().build();
        }

        /**
         * @return consumeTimestamp
         */
        public Long getConsumeTimestamp() {
            return this.consumeTimestamp;
        }

        public static final class Builder {
            private Long consumeTimestamp; 

            private Builder() {
            } 

            private Builder(ProgressData model) {
                this.consumeTimestamp = model.consumeTimestamp;
            } 

            /**
             * <p>Latest consumption time</p>
             * 
             * <strong>example:</strong>
             * <p>1740724080343</p>
             */
            public Builder consumeTimestamp(Long consumeTimestamp) {
                this.consumeTimestamp = consumeTimestamp;
                return this;
            }

            public ProgressData build() {
                return new ProgressData(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDisasterRecoveryCheckpointsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDisasterRecoveryCheckpointsResponseBody</p>
     */
    public static class SourceProgress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("consumerGroupId")
        private String consumerGroupId;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("instanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("lastFetchTime")
        private Long lastFetchTime;

        @com.aliyun.core.annotation.NameInMap("progressData")
        private ProgressData progressData;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("topicName")
        private String topicName;

        private SourceProgress(Builder builder) {
            this.consumerGroupId = builder.consumerGroupId;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.lastFetchTime = builder.lastFetchTime;
            this.progressData = builder.progressData;
            this.regionId = builder.regionId;
            this.topicName = builder.topicName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceProgress create() {
            return builder().build();
        }

        /**
         * @return consumerGroupId
         */
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return lastFetchTime
         */
        public Long getLastFetchTime() {
            return this.lastFetchTime;
        }

        /**
         * @return progressData
         */
        public ProgressData getProgressData() {
            return this.progressData;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return topicName
         */
        public String getTopicName() {
            return this.topicName;
        }

        public static final class Builder {
            private String consumerGroupId; 
            private String instanceId; 
            private String instanceType; 
            private Long lastFetchTime; 
            private ProgressData progressData; 
            private String regionId; 
            private String topicName; 

            private Builder() {
            } 

            private Builder(SourceProgress model) {
                this.consumerGroupId = model.consumerGroupId;
                this.instanceId = model.instanceId;
                this.instanceType = model.instanceType;
                this.lastFetchTime = model.lastFetchTime;
                this.progressData = model.progressData;
                this.regionId = model.regionId;
                this.topicName = model.topicName;
            } 

            /**
             * <p>Consumer Group ID</p>
             * 
             * <strong>example:</strong>
             * <p>GID_TEST</p>
             */
            public Builder consumerGroupId(String consumerGroupId) {
                this.consumerGroupId = consumerGroupId;
                return this;
            }

            /**
             * <p>Instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>rmq-cn-3mp3vblzxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Instance type</p>
             * <ul>
             * <li>ALIYUN_ROCKETMQ: Alibaba Cloud instance</li>
             * <li>EXTERNAL_ROCKETMQ: External instance, open-source instance, open-source cluster</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN_ROCKETMQ</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>Last fetch time</p>
             * 
             * <strong>example:</strong>
             * <p>1740724080343</p>
             */
            public Builder lastFetchTime(Long lastFetchTime) {
                this.lastFetchTime = lastFetchTime;
                return this;
            }

            /**
             * <p>Consumption progress data</p>
             */
            public Builder progressData(ProgressData progressData) {
                this.progressData = progressData;
                return this;
            }

            /**
             * <p>Region ID</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The topic name.</p>
             * 
             * <strong>example:</strong>
             * <p>TOPIC_TEST</p>
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            public SourceProgress build() {
                return new SourceProgress(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDisasterRecoveryCheckpointsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDisasterRecoveryCheckpointsResponseBody</p>
     */
    public static class TargetProgressProgressData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("consumeTimestamp")
        private Long consumeTimestamp;

        private TargetProgressProgressData(Builder builder) {
            this.consumeTimestamp = builder.consumeTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetProgressProgressData create() {
            return builder().build();
        }

        /**
         * @return consumeTimestamp
         */
        public Long getConsumeTimestamp() {
            return this.consumeTimestamp;
        }

        public static final class Builder {
            private Long consumeTimestamp; 

            private Builder() {
            } 

            private Builder(TargetProgressProgressData model) {
                this.consumeTimestamp = model.consumeTimestamp;
            } 

            /**
             * <p>Latest consumption time</p>
             * 
             * <strong>example:</strong>
             * <p>1740724080343</p>
             */
            public Builder consumeTimestamp(Long consumeTimestamp) {
                this.consumeTimestamp = consumeTimestamp;
                return this;
            }

            public TargetProgressProgressData build() {
                return new TargetProgressProgressData(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDisasterRecoveryCheckpointsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDisasterRecoveryCheckpointsResponseBody</p>
     */
    public static class TargetProgress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("consumerGroupId")
        private String consumerGroupId;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("instanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("lastFetchTime")
        private Long lastFetchTime;

        @com.aliyun.core.annotation.NameInMap("progressData")
        private TargetProgressProgressData progressData;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("topicName")
        private String topicName;

        private TargetProgress(Builder builder) {
            this.consumerGroupId = builder.consumerGroupId;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.lastFetchTime = builder.lastFetchTime;
            this.progressData = builder.progressData;
            this.regionId = builder.regionId;
            this.topicName = builder.topicName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetProgress create() {
            return builder().build();
        }

        /**
         * @return consumerGroupId
         */
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return lastFetchTime
         */
        public Long getLastFetchTime() {
            return this.lastFetchTime;
        }

        /**
         * @return progressData
         */
        public TargetProgressProgressData getProgressData() {
            return this.progressData;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return topicName
         */
        public String getTopicName() {
            return this.topicName;
        }

        public static final class Builder {
            private String consumerGroupId; 
            private String instanceId; 
            private String instanceType; 
            private Long lastFetchTime; 
            private TargetProgressProgressData progressData; 
            private String regionId; 
            private String topicName; 

            private Builder() {
            } 

            private Builder(TargetProgress model) {
                this.consumerGroupId = model.consumerGroupId;
                this.instanceId = model.instanceId;
                this.instanceType = model.instanceType;
                this.lastFetchTime = model.lastFetchTime;
                this.progressData = model.progressData;
                this.regionId = model.regionId;
                this.topicName = model.topicName;
            } 

            /**
             * <p>Consumer group ID</p>
             * 
             * <strong>example:</strong>
             * <p>GID_TEST</p>
             */
            public Builder consumerGroupId(String consumerGroupId) {
                this.consumerGroupId = consumerGroupId;
                return this;
            }

            /**
             * <p>Instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>rmq-cn-nwy3i065xxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Instance type</p>
             * <ul>
             * <li>ALIYUN_ROCKETMQ: Alibaba Cloud instance</li>
             * <li>EXTERNAL_ROCKETMQ: External instance, open-source instance, open-source cluster</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN_ROCKETMQ</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>Latest fetch time</p>
             * 
             * <strong>example:</strong>
             * <p>1740724080343</p>
             */
            public Builder lastFetchTime(Long lastFetchTime) {
                this.lastFetchTime = lastFetchTime;
                return this;
            }

            /**
             * <p>Consumption progress data</p>
             */
            public Builder progressData(TargetProgressProgressData progressData) {
                this.progressData = progressData;
                return this;
            }

            /**
             * <p>Region ID</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Topic name</p>
             * 
             * <strong>example:</strong>
             * <p>TOPIC_TEST</p>
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            public TargetProgress build() {
                return new TargetProgress(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDisasterRecoveryCheckpointsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDisasterRecoveryCheckpointsResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("checkpointId")
        private Long checkpointId;

        @com.aliyun.core.annotation.NameInMap("itemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("lastSyncTime")
        private Long lastSyncTime;

        @com.aliyun.core.annotation.NameInMap("planId")
        private Long planId;

        @com.aliyun.core.annotation.NameInMap("sourceProgress")
        private SourceProgress sourceProgress;

        @com.aliyun.core.annotation.NameInMap("targetProgress")
        private TargetProgress targetProgress;

        private List(Builder builder) {
            this.checkpointId = builder.checkpointId;
            this.itemId = builder.itemId;
            this.lastSyncTime = builder.lastSyncTime;
            this.planId = builder.planId;
            this.sourceProgress = builder.sourceProgress;
            this.targetProgress = builder.targetProgress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return checkpointId
         */
        public Long getCheckpointId() {
            return this.checkpointId;
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return lastSyncTime
         */
        public Long getLastSyncTime() {
            return this.lastSyncTime;
        }

        /**
         * @return planId
         */
        public Long getPlanId() {
            return this.planId;
        }

        /**
         * @return sourceProgress
         */
        public SourceProgress getSourceProgress() {
            return this.sourceProgress;
        }

        /**
         * @return targetProgress
         */
        public TargetProgress getTargetProgress() {
            return this.targetProgress;
        }

        public static final class Builder {
            private Long checkpointId; 
            private Long itemId; 
            private Long lastSyncTime; 
            private Long planId; 
            private SourceProgress sourceProgress; 
            private TargetProgress targetProgress; 

            private Builder() {
            } 

            private Builder(List model) {
                this.checkpointId = model.checkpointId;
                this.itemId = model.itemId;
                this.lastSyncTime = model.lastSyncTime;
                this.planId = model.planId;
                this.sourceProgress = model.sourceProgress;
                this.targetProgress = model.targetProgress;
            } 

            /**
             * <p>Consumption Progress ID</p>
             * 
             * <strong>example:</strong>
             * <p>10000000xx</p>
             */
            public Builder checkpointId(Long checkpointId) {
                this.checkpointId = checkpointId;
                return this;
            }

            /**
             * <p>Backup Mapping ID</p>
             * 
             * <strong>example:</strong>
             * <p>10000000xx</p>
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * <p>Last synchronization time</p>
             * 
             * <strong>example:</strong>
             * <p>1740724080343</p>
             */
            public Builder lastSyncTime(Long lastSyncTime) {
                this.lastSyncTime = lastSyncTime;
                return this;
            }

            /**
             * <p>Backup Plan ID</p>
             * 
             * <strong>example:</strong>
             * <p>13000000xx</p>
             */
            public Builder planId(Long planId) {
                this.planId = planId;
                return this;
            }

            /**
             * <p>Source consumption progress</p>
             */
            public Builder sourceProgress(SourceProgress sourceProgress) {
                this.sourceProgress = sourceProgress;
                return this;
            }

            /**
             * <p>Target consumption progress</p>
             */
            public Builder targetProgress(TargetProgress targetProgress) {
                this.targetProgress = targetProgress;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDisasterRecoveryCheckpointsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDisasterRecoveryCheckpointsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("list")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("pageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>Paged data</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>Current page number</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>Page size</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Total number of records</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
