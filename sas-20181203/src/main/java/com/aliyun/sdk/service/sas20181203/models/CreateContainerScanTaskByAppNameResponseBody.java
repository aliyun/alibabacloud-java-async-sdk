// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateContainerScanTaskByAppNameResponseBody} extends {@link TeaModel}
 *
 * <p>CreateContainerScanTaskByAppNameResponseBody</p>
 */
public class CreateContainerScanTaskByAppNameResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateContainerScanTaskByAppNameResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateContainerScanTaskByAppNameResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private Integer httpStatusCode; 
        private String requestId; 

        /**
         * The data returned if the request was successful.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateContainerScanTaskByAppNameResponseBody build() {
            return new CreateContainerScanTaskByAppNameResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanCreate")
        private Boolean canCreate;

        @com.aliyun.core.annotation.NameInMap("CollectTime")
        private Long collectTime;

        @com.aliyun.core.annotation.NameInMap("ExecTime")
        private Long execTime;

        @com.aliyun.core.annotation.NameInMap("FinishCount")
        private Integer finishCount;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
             * Indicates whether you can create more scan tasks. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder canCreate(Boolean canCreate) {
                this.canCreate = canCreate;
                return this;
            }

            /**
             * The timestamp generated when the image information was collected. Unit: milliseconds.
             */
            public Builder collectTime(Long collectTime) {
                this.collectTime = collectTime;
                return this;
            }

            /**
             * The timestamp generated when the scan task started. Unit: milliseconds.
             */
            public Builder execTime(Long execTime) {
                this.execTime = execTime;
                return this;
            }

            /**
             * The number of container applications that are scanned.
             */
            public Builder finishCount(Integer finishCount) {
                this.finishCount = finishCount;
                return this;
            }

            /**
             * The progress of the scan task in percentage.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The result of the scan task. Valid values:
             * <p>
             * 
             * *   **SUCCESS**: The task is successful.
             * *   **TASK_NOT_SUPPORT_REGION**: The task is not supported in the region where the image is deployed.
             * 
             * >
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * The status of the scan task. Valid values:
             * <p>
             * 
             * *   **INIT**: The task is being initialized.
             * *   **PRE_ANALYZER**: The task is being pre-processed.
             * *   **SUCCESS**: The task succeeds.
             * *   **FAIL**: The task fails.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the scan task.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The total number of container applications that you want to scan.
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
