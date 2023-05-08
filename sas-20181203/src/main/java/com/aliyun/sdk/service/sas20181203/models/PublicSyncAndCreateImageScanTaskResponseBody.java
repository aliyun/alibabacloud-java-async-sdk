// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublicSyncAndCreateImageScanTaskResponseBody} extends {@link TeaModel}
 *
 * <p>PublicSyncAndCreateImageScanTaskResponseBody</p>
 */
public class PublicSyncAndCreateImageScanTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private PublicSyncAndCreateImageScanTaskResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublicSyncAndCreateImageScanTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The total number of images to scan.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The data returned if the call is successful.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PublicSyncAndCreateImageScanTaskResponseBody build() {
            return new PublicSyncAndCreateImageScanTaskResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CanCreate")
        private Boolean canCreate;

        @NameInMap("CollectTime")
        private Long collectTime;

        @NameInMap("ExecTime")
        private Long execTime;

        @NameInMap("FinishCount")
        private Integer finishCount;

        @NameInMap("Progress")
        private Integer progress;

        @NameInMap("Result")
        private String result;

        @NameInMap("Status")
        private String status;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.canCreate = builder.canCreate;
            this.collectTime = builder.collectTime;
            this.execTime = builder.execTime;
            this.finishCount = builder.finishCount;
            this.progress = builder.progress;
            this.result = builder.result;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return canCreate
         */
        public Boolean getCanCreate() {
            return this.canCreate;
        }

        /**
         * @return collectTime
         */
        public Long getCollectTime() {
            return this.collectTime;
        }

        /**
         * @return execTime
         */
        public Long getExecTime() {
            return this.execTime;
        }

        /**
         * @return finishCount
         */
        public Integer getFinishCount() {
            return this.finishCount;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
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

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Boolean canCreate; 
            private Long collectTime; 
            private Long execTime; 
            private Integer finishCount; 
            private Integer progress; 
            private String result; 
            private String status; 
            private String taskId; 
            private Integer totalCount; 

            /**
             * CanCreate.
             */
            public Builder canCreate(Boolean canCreate) {
                this.canCreate = canCreate;
                return this;
            }

            /**
             * CollectTime.
             */
            public Builder collectTime(Long collectTime) {
                this.collectTime = collectTime;
                return this;
            }

            /**
             * ExecTime.
             */
            public Builder execTime(Long execTime) {
                this.execTime = execTime;
                return this;
            }

            /**
             * PublicSyncAndCreateImageScanTask
             */
            public Builder finishCount(Integer finishCount) {
                this.finishCount = finishCount;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
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
             * The ID of the request, which is used to locate and troubleshoot issues.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * Adds images to Security Center and creates an image scan task to scan the images.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
