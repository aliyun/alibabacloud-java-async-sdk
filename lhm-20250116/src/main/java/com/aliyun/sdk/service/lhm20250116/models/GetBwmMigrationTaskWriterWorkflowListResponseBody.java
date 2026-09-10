// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link GetBwmMigrationTaskWriterWorkflowListResponseBody} extends {@link TeaModel}
 *
 * <p>GetBwmMigrationTaskWriterWorkflowListResponseBody</p>
 */
public class GetBwmMigrationTaskWriterWorkflowListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("empty")
    private Boolean empty;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("notEmpty")
    private Boolean notEmpty;

    @com.aliyun.core.annotation.NameInMap("pageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("totalPages")
    private Integer totalPages;

    private GetBwmMigrationTaskWriterWorkflowListResponseBody(Builder builder) {
        this.data = builder.data;
        this.empty = builder.empty;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.notEmpty = builder.notEmpty;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBwmMigrationTaskWriterWorkflowListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return empty
     */
    public Boolean getEmpty() {
        return this.empty;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return notEmpty
     */
    public Boolean getNotEmpty() {
        return this.notEmpty;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return totalPages
     */
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private Boolean empty; 
        private String errCode; 
        private String errMessage; 
        private Boolean notEmpty; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 
        private Integer totalPages; 

        private Builder() {
        } 

        private Builder(GetBwmMigrationTaskWriterWorkflowListResponseBody model) {
            this.data = model.data;
            this.empty = model.empty;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.notEmpty = model.notEmpty;
            this.pageIndex = model.pageIndex;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
            this.totalPages = model.totalPages;
        } 

        /**
         * <p>The response data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Indicates whether the result is empty.</p>
         */
        public Builder empty(Boolean empty) {
            this.empty = empty;
            return this;
        }

        /**
         * <p>The error code. An empty string is returned if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message. An empty string is returned if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>Indicates whether the result is not empty.</p>
         */
        public Builder notEmpty(Boolean notEmpty) {
            this.notEmpty = notEmpty;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. A value of true indicates success. A value of false indicates failure. If the call fails, check errCode and errMessage for details.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public GetBwmMigrationTaskWriterWorkflowListResponseBody build() {
            return new GetBwmMigrationTaskWriterWorkflowListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetBwmMigrationTaskWriterWorkflowListResponseBody} extends {@link TeaModel}
     *
     * <p>GetBwmMigrationTaskWriterWorkflowListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cron")
        private String cron;

        @com.aliyun.core.annotation.NameInMap("id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("submitDetail")
        private String submitDetail;

        @com.aliyun.core.annotation.NameInMap("submitStatus")
        private String submitStatus;

        @com.aliyun.core.annotation.NameInMap("targetWorkflowId")
        private String targetWorkflowId;

        @com.aliyun.core.annotation.NameInMap("targetWorkflowName")
        private String targetWorkflowName;

        @com.aliyun.core.annotation.NameInMap("taskNodeCount")
        private Integer taskNodeCount;

        @com.aliyun.core.annotation.NameInMap("workflowId")
        private String workflowId;

        @com.aliyun.core.annotation.NameInMap("workflowName")
        private String workflowName;

        private Data(Builder builder) {
            this.cron = builder.cron;
            this.id = builder.id;
            this.submitDetail = builder.submitDetail;
            this.submitStatus = builder.submitStatus;
            this.targetWorkflowId = builder.targetWorkflowId;
            this.targetWorkflowName = builder.targetWorkflowName;
            this.taskNodeCount = builder.taskNodeCount;
            this.workflowId = builder.workflowId;
            this.workflowName = builder.workflowName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cron
         */
        public String getCron() {
            return this.cron;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return submitDetail
         */
        public String getSubmitDetail() {
            return this.submitDetail;
        }

        /**
         * @return submitStatus
         */
        public String getSubmitStatus() {
            return this.submitStatus;
        }

        /**
         * @return targetWorkflowId
         */
        public String getTargetWorkflowId() {
            return this.targetWorkflowId;
        }

        /**
         * @return targetWorkflowName
         */
        public String getTargetWorkflowName() {
            return this.targetWorkflowName;
        }

        /**
         * @return taskNodeCount
         */
        public Integer getTaskNodeCount() {
            return this.taskNodeCount;
        }

        /**
         * @return workflowId
         */
        public String getWorkflowId() {
            return this.workflowId;
        }

        /**
         * @return workflowName
         */
        public String getWorkflowName() {
            return this.workflowName;
        }

        public static final class Builder {
            private String cron; 
            private Integer id; 
            private String submitDetail; 
            private String submitStatus; 
            private String targetWorkflowId; 
            private String targetWorkflowName; 
            private Integer taskNodeCount; 
            private String workflowId; 
            private String workflowName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.cron = model.cron;
                this.id = model.id;
                this.submitDetail = model.submitDetail;
                this.submitStatus = model.submitStatus;
                this.targetWorkflowId = model.targetWorkflowId;
                this.targetWorkflowName = model.targetWorkflowName;
                this.taskNodeCount = model.taskNodeCount;
                this.workflowId = model.workflowId;
                this.workflowName = model.workflowName;
            } 

            /**
             * <p>The cron expression.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder cron(String cron) {
                this.cron = cron;
                return this;
            }

            /**
             * <p>The database primary key ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The submit failure error message.</p>
             * 
             * <strong>example:</strong>
             * <p>Submit failed</p>
             */
            public Builder submitDetail(String submitDetail) {
                this.submitDetail = submitDetail;
                return this;
            }

            /**
             * <p>Filter by status. Valid values:</p>
             * <ul>
             * <li>WRT_INIT: Submit not started.</li>
             * <li>WRT_RUN: Submitting.</li>
             * <li>WRT_SUCC: All submitted successfully.</li>
             * <li>WRT_FAIL: All submissions failed.</li>
             * <li>WRT_PART_FAIL: Some submissions failed.</li>
             * <li>DPY_SUCC: Published successfully.</li>
             * <li>DPY_FAIL: Publish failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>WRT_INIT</p>
             */
            public Builder submitStatus(String submitStatus) {
                this.submitStatus = submitStatus;
                return this;
            }

            /**
             * <p>The workflow ID written to the target side.</p>
             * 
             * <strong>example:</strong>
             * <p>target_wf-12345</p>
             */
            public Builder targetWorkflowId(String targetWorkflowId) {
                this.targetWorkflowId = targetWorkflowId;
                return this;
            }

            /**
             * <p>The workflow name on the target side.</p>
             * 
             * <strong>example:</strong>
             * <p>target_workflow_name</p>
             */
            public Builder targetWorkflowName(String targetWorkflowName) {
                this.targetWorkflowName = targetWorkflowName;
                return this;
            }

            /**
             * <p>The number of nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder taskNodeCount(Integer taskNodeCount) {
                this.taskNodeCount = taskNodeCount;
                return this;
            }

            /**
             * <p>The actual workflow ID.</p>
             * 
             * <strong>example:</strong>
             * <p>wf-12345</p>
             */
            public Builder workflowId(String workflowId) {
                this.workflowId = workflowId;
                return this;
            }

            /**
             * <p>The workflow name.</p>
             * 
             * <strong>example:</strong>
             * <p>workflow_name</p>
             */
            public Builder workflowName(String workflowName) {
                this.workflowName = workflowName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
