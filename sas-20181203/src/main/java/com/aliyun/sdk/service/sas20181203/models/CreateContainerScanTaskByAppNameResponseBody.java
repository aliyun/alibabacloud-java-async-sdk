// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateContainerScanTaskByAppNameResponseBody model) {
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned if the request was successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1EE7B150-D67E-53FD-A52D-3E8E669A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateContainerScanTaskByAppNameResponseBody build() {
            return new CreateContainerScanTaskByAppNameResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateContainerScanTaskByAppNameResponseBody} extends {@link TeaModel}
     *
     * <p>CreateContainerScanTaskByAppNameResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.canCreate = model.canCreate;
                this.collectTime = model.collectTime;
                this.execTime = model.execTime;
                this.finishCount = model.finishCount;
                this.progress = model.progress;
                this.result = model.result;
                this.status = model.status;
                this.taskId = model.taskId;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>Indicates whether you can create more scan tasks. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canCreate(Boolean canCreate) {
                this.canCreate = canCreate;
                return this;
            }

            /**
             * <p>The timestamp generated when the image information was collected. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1644286364150</p>
             */
            public Builder collectTime(Long collectTime) {
                this.collectTime = collectTime;
                return this;
            }

            /**
             * <p>The timestamp generated when the scan task started. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1644286364150</p>
             */
            public Builder execTime(Long execTime) {
                this.execTime = execTime;
                return this;
            }

            /**
             * <p>The number of container applications that are scanned.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder finishCount(Integer finishCount) {
                this.finishCount = finishCount;
                return this;
            }

            /**
             * <p>The progress of the scan task in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The result of the scan task. Valid values:</p>
             * <ul>
             * <li><strong>SUCCESS</strong>: The task is successful.</li>
             * <li><strong>TASK_NOT_SUPPORT_REGION</strong>: The task is not supported in the region where the image is deployed.</li>
             * </ul>
             * <blockquote>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The status of the scan task. Valid values:</p>
             * <ul>
             * <li><strong>INIT</strong>: The task is being initialized.</li>
             * <li><strong>PRE_ANALYZER</strong>: The task is being pre-processed.</li>
             * <li><strong>SUCCESS</strong>: The task succeeds.</li>
             * <li><strong>FAIL</strong>: The task fails.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the scan task.</p>
             * 
             * <strong>example:</strong>
             * <p>fc98d58eb56f699d49bf7ebbd6d7****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The total number of container applications that you want to scan.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
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
