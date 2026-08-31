// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ListApprovalTasksByUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListApprovalTasksByUserResponseBody</p>
 */
public class ListApprovalTasksByUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageResult")
    private PageResult pageResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListApprovalTasksByUserResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageResult = builder.pageResult;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApprovalTasksByUserResponseBody create() {
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
     * @return pageResult
     */
    public PageResult getPageResult() {
        return this.pageResult;
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
        private Integer httpStatusCode; 
        private String message; 
        private PageResult pageResult; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListApprovalTasksByUserResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageResult = model.pageResult;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageResult.
         */
        public Builder pageResult(PageResult pageResult) {
            this.pageResult = pageResult;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListApprovalTasksByUserResponseBody build() {
            return new ListApprovalTasksByUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApprovalTasksByUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListApprovalTasksByUserResponseBody</p>
     */
    public static class TaskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicantId")
        private String applicantId;

        @com.aliyun.core.annotation.NameInMap("ApplicantName")
        private String applicantName;

        @com.aliyun.core.annotation.NameInMap("ApprovalType")
        private String approvalType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("RelationType")
        private String relationType;

        @com.aliyun.core.annotation.NameInMap("SourceSystem")
        private String sourceSystem;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubmittedAt")
        private String submittedAt;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private TaskList(Builder builder) {
            this.applicantId = builder.applicantId;
            this.applicantName = builder.applicantName;
            this.approvalType = builder.approvalType;
            this.id = builder.id;
            this.relationType = builder.relationType;
            this.sourceSystem = builder.sourceSystem;
            this.status = builder.status;
            this.submittedAt = builder.submittedAt;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskList create() {
            return builder().build();
        }

        /**
         * @return applicantId
         */
        public String getApplicantId() {
            return this.applicantId;
        }

        /**
         * @return applicantName
         */
        public String getApplicantName() {
            return this.applicantName;
        }

        /**
         * @return approvalType
         */
        public String getApprovalType() {
            return this.approvalType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return relationType
         */
        public String getRelationType() {
            return this.relationType;
        }

        /**
         * @return sourceSystem
         */
        public String getSourceSystem() {
            return this.sourceSystem;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return submittedAt
         */
        public String getSubmittedAt() {
            return this.submittedAt;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String applicantId; 
            private String applicantName; 
            private String approvalType; 
            private Long id; 
            private String relationType; 
            private String sourceSystem; 
            private String status; 
            private String submittedAt; 
            private String title; 

            private Builder() {
            } 

            private Builder(TaskList model) {
                this.applicantId = model.applicantId;
                this.applicantName = model.applicantName;
                this.approvalType = model.approvalType;
                this.id = model.id;
                this.relationType = model.relationType;
                this.sourceSystem = model.sourceSystem;
                this.status = model.status;
                this.submittedAt = model.submittedAt;
                this.title = model.title;
            } 

            /**
             * ApplicantId.
             */
            public Builder applicantId(String applicantId) {
                this.applicantId = applicantId;
                return this;
            }

            /**
             * ApplicantName.
             */
            public Builder applicantName(String applicantName) {
                this.applicantName = applicantName;
                return this;
            }

            /**
             * ApprovalType.
             */
            public Builder approvalType(String approvalType) {
                this.approvalType = approvalType;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * RelationType.
             */
            public Builder relationType(String relationType) {
                this.relationType = relationType;
                return this;
            }

            /**
             * SourceSystem.
             */
            public Builder sourceSystem(String sourceSystem) {
                this.sourceSystem = sourceSystem;
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
             * SubmittedAt.
             */
            public Builder submittedAt(String submittedAt) {
                this.submittedAt = submittedAt;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public TaskList build() {
                return new TaskList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListApprovalTasksByUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListApprovalTasksByUserResponseBody</p>
     */
    public static class PageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TaskList")
        private java.util.List<TaskList> taskList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private PageResult(Builder builder) {
            this.taskList = builder.taskList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageResult create() {
            return builder().build();
        }

        /**
         * @return taskList
         */
        public java.util.List<TaskList> getTaskList() {
            return this.taskList;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<TaskList> taskList; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(PageResult model) {
                this.taskList = model.taskList;
                this.totalCount = model.totalCount;
            } 

            /**
             * TaskList.
             */
            public Builder taskList(java.util.List<TaskList> taskList) {
                this.taskList = taskList;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageResult build() {
                return new PageResult(this);
            } 

        } 

    }
}
