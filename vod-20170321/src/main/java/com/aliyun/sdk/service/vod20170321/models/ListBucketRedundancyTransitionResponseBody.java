// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link ListBucketRedundancyTransitionResponseBody} extends {@link TeaModel}
 *
 * <p>ListBucketRedundancyTransitionResponseBody</p>
 */
public class ListBucketRedundancyTransitionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RedundancyTransitionInfo")
    private RedundancyTransitionInfo redundancyTransitionInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StorageRedundancyType")
    private String storageRedundancyType;

    private ListBucketRedundancyTransitionResponseBody(Builder builder) {
        this.redundancyTransitionInfo = builder.redundancyTransitionInfo;
        this.requestId = builder.requestId;
        this.storageRedundancyType = builder.storageRedundancyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBucketRedundancyTransitionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return redundancyTransitionInfo
     */
    public RedundancyTransitionInfo getRedundancyTransitionInfo() {
        return this.redundancyTransitionInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return storageRedundancyType
     */
    public String getStorageRedundancyType() {
        return this.storageRedundancyType;
    }

    public static final class Builder {
        private RedundancyTransitionInfo redundancyTransitionInfo; 
        private String requestId; 
        private String storageRedundancyType; 

        private Builder() {
        } 

        private Builder(ListBucketRedundancyTransitionResponseBody model) {
            this.redundancyTransitionInfo = model.redundancyTransitionInfo;
            this.requestId = model.requestId;
            this.storageRedundancyType = model.storageRedundancyType;
        } 

        /**
         * RedundancyTransitionInfo.
         */
        public Builder redundancyTransitionInfo(RedundancyTransitionInfo redundancyTransitionInfo) {
            this.redundancyTransitionInfo = redundancyTransitionInfo;
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
         * StorageRedundancyType.
         */
        public Builder storageRedundancyType(String storageRedundancyType) {
            this.storageRedundancyType = storageRedundancyType;
            return this;
        }

        public ListBucketRedundancyTransitionResponseBody build() {
            return new ListBucketRedundancyTransitionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListBucketRedundancyTransitionResponseBody} extends {@link TeaModel}
     *
     * <p>ListBucketRedundancyTransitionResponseBody</p>
     */
    public static class RedundancyTransitionInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("EstimatedRemainingTime")
        private String estimatedRemainingTime;

        @com.aliyun.core.annotation.NameInMap("ProcessPercentage")
        private String processPercentage;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private RedundancyTransitionInfo(Builder builder) {
            this.createTime = builder.createTime;
            this.endTime = builder.endTime;
            this.estimatedRemainingTime = builder.estimatedRemainingTime;
            this.processPercentage = builder.processPercentage;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RedundancyTransitionInfo create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return estimatedRemainingTime
         */
        public String getEstimatedRemainingTime() {
            return this.estimatedRemainingTime;
        }

        /**
         * @return processPercentage
         */
        public String getProcessPercentage() {
            return this.processPercentage;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
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
            private String createTime; 
            private String endTime; 
            private String estimatedRemainingTime; 
            private String processPercentage; 
            private String startTime; 
            private String status; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(RedundancyTransitionInfo model) {
                this.createTime = model.createTime;
                this.endTime = model.endTime;
                this.estimatedRemainingTime = model.estimatedRemainingTime;
                this.processPercentage = model.processPercentage;
                this.startTime = model.startTime;
                this.status = model.status;
                this.taskId = model.taskId;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * EstimatedRemainingTime.
             */
            public Builder estimatedRemainingTime(String estimatedRemainingTime) {
                this.estimatedRemainingTime = estimatedRemainingTime;
                return this;
            }

            /**
             * ProcessPercentage.
             */
            public Builder processPercentage(String processPercentage) {
                this.processPercentage = processPercentage;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
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

            public RedundancyTransitionInfo build() {
                return new RedundancyTransitionInfo(this);
            } 

        } 

    }
}
