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
 * {@link PublicCreateImageScanTaskResponseBody} extends {@link TeaModel}
 *
 * <p>PublicCreateImageScanTaskResponseBody</p>
 */
public class PublicCreateImageScanTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private PublicCreateImageScanTaskResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublicCreateImageScanTaskResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(PublicCreateImageScanTaskResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned when the operation is successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID. Alibaba Cloud generates a unique identifier for each request. You can use the request ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>F9353221-40F4-5F98-B73C-2803DC804033</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PublicCreateImageScanTaskResponseBody build() {
            return new PublicCreateImageScanTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PublicCreateImageScanTaskResponseBody} extends {@link TeaModel}
     *
     * <p>PublicCreateImageScanTaskResponseBody</p>
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
             * <p>Indicates whether more scan tasks can be created. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: More scan tasks can be created.</li>
             * <li><strong>false</strong>: No more scan tasks can be created.</li>
             * </ul>
             * <blockquote>
             * <p>By default, up to 10 scan tasks can exist at the same time. If the number of scan tasks exceeds 10, creating a scan task by calling this operation fails. Wait until an existing scan task is completed before creating a new scan task.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canCreate(Boolean canCreate) {
                this.canCreate = canCreate;
                return this;
            }

            /**
             * <p>The timestamp when image information was collected, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1644286364150</p>
             */
            public Builder collectTime(Long collectTime) {
                this.collectTime = collectTime;
                return this;
            }

            /**
             * <p>The timestamp when the scan task started running, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1644286364150</p>
             */
            public Builder execTime(Long execTime) {
                this.execTime = execTime;
                return this;
            }

            /**
             * <p>The number of images that have been scanned.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder finishCount(Integer finishCount) {
                this.finishCount = finishCount;
                return this;
            }

            /**
             * <p>The progress percentage of the scan task.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The execution result of the scan task. Valid values:</p>
             * <ul>
             * <li><strong>SUCCESS</strong>: The scan task succeeded.</li>
             * <li><strong>TASK_NOT_SUPPORT_REGION</strong>: The image is in a region that does not support scanning.</li>
             * </ul>
             * <blockquote>
             * <p>For the regions that support image security scanning, see the table of supported regions after the response parameters table in this topic.</p>
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
             * <li><strong>INIT</strong>: Initializing.</li>
             * <li><strong>PRE_ANALYZER</strong>: Pre-analyzing.</li>
             * <li><strong>SUCCESS</strong>: Succeeded.</li>
             * <li><strong>FAIL</strong>: Failed.</li>
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
             * <p>a410bb3e68c217a3368bc0238c66886d</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The total number of images to scan.</p>
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
