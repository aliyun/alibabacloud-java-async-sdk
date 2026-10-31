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
 * {@link GetApprovalTaskDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetApprovalTaskDetailResponseBody</p>
 */
public class GetApprovalTaskDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DetailInfo")
    private DetailInfo detailInfo;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetApprovalTaskDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.detailInfo = builder.detailInfo;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApprovalTaskDetailResponseBody create() {
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
     * @return detailInfo
     */
    public DetailInfo getDetailInfo() {
        return this.detailInfo;
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
        private DetailInfo detailInfo; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetApprovalTaskDetailResponseBody model) {
            this.code = model.code;
            this.detailInfo = model.detailInfo;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The backend response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The approval task details.</p>
         */
        public Builder detailInfo(DetailInfo detailInfo) {
            this.detailInfo = detailInfo;
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
         * <p>The backend response exception details.</p>
         * 
         * <strong>example:</strong>
         * <p>internal error</p>
         */
        public Builder message(String message) {
            this.message = message;
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
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetApprovalTaskDetailResponseBody build() {
            return new GetApprovalTaskDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetApprovalTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetApprovalTaskDetailResponseBody</p>
     */
    public static class ApproveProcessSteps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApproveUserIds")
        private String approveUserIds;

        @com.aliyun.core.annotation.NameInMap("ApproveUserNames")
        private String approveUserNames;

        @com.aliyun.core.annotation.NameInMap("OperateTime")
        private String operateTime;

        @com.aliyun.core.annotation.NameInMap("OperateUserId")
        private String operateUserId;

        @com.aliyun.core.annotation.NameInMap("OperateUserName")
        private String operateUserName;

        @com.aliyun.core.annotation.NameInMap("Operation")
        private String operation;

        @com.aliyun.core.annotation.NameInMap("ProcessStepName")
        private String processStepName;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        private ApproveProcessSteps(Builder builder) {
            this.approveUserIds = builder.approveUserIds;
            this.approveUserNames = builder.approveUserNames;
            this.operateTime = builder.operateTime;
            this.operateUserId = builder.operateUserId;
            this.operateUserName = builder.operateUserName;
            this.operation = builder.operation;
            this.processStepName = builder.processStepName;
            this.reason = builder.reason;
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApproveProcessSteps create() {
            return builder().build();
        }

        /**
         * @return approveUserIds
         */
        public String getApproveUserIds() {
            return this.approveUserIds;
        }

        /**
         * @return approveUserNames
         */
        public String getApproveUserNames() {
            return this.approveUserNames;
        }

        /**
         * @return operateTime
         */
        public String getOperateTime() {
            return this.operateTime;
        }

        /**
         * @return operateUserId
         */
        public String getOperateUserId() {
            return this.operateUserId;
        }

        /**
         * @return operateUserName
         */
        public String getOperateUserName() {
            return this.operateUserName;
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        /**
         * @return processStepName
         */
        public String getProcessStepName() {
            return this.processStepName;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        public static final class Builder {
            private String approveUserIds; 
            private String approveUserNames; 
            private String operateTime; 
            private String operateUserId; 
            private String operateUserName; 
            private String operation; 
            private String processStepName; 
            private String reason; 
            private String result; 

            private Builder() {
            } 

            private Builder(ApproveProcessSteps model) {
                this.approveUserIds = model.approveUserIds;
                this.approveUserNames = model.approveUserNames;
                this.operateTime = model.operateTime;
                this.operateUserId = model.operateUserId;
                this.operateUserName = model.operateUserName;
                this.operation = model.operation;
                this.processStepName = model.processStepName;
                this.reason = model.reason;
                this.result = model.result;
            } 

            /**
             * <p>The list of candidate approver IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>user001,user002</p>
             */
            public Builder approveUserIds(String approveUserIds) {
                this.approveUserIds = approveUserIds;
                return this;
            }

            /**
             * <p>The list of candidate approver names.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhang San, Li Si</p>
             */
            public Builder approveUserNames(String approveUserNames) {
                this.approveUserNames = approveUserNames;
                return this;
            }

            /**
             * <p>The operation time. Format: yyyy-MM-dd HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-07-30 11:00:00</p>
             */
            public Builder operateTime(String operateTime) {
                this.operateTime = operateTime;
                return this;
            }

            /**
             * <p>The ID of the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>user001</p>
             */
            public Builder operateUserId(String operateUserId) {
                this.operateUserId = operateUserId;
                return this;
            }

            /**
             * <p>The name of the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhang San</p>
             */
            public Builder operateUserName(String operateUserName) {
                this.operateUserName = operateUserName;
                return this;
            }

            /**
             * <p>The operation.</p>
             * 
             * <strong>example:</strong>
             * <p>SUBMIT</p>
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * <p>The step name.</p>
             * 
             * <strong>example:</strong>
             * <p>Submit application</p>
             */
            public Builder processStepName(String processStepName) {
                this.processStepName = processStepName;
                return this;
            }

            /**
             * <p>The approval comment.</p>
             * 
             * <strong>example:</strong>
             * <p>Approved</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The approval result.</p>
             * 
             * <strong>example:</strong>
             * <p>APPROVED</p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            public ApproveProcessSteps build() {
                return new ApproveProcessSteps(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApprovalTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetApprovalTaskDetailResponseBody</p>
     */
    public static class DetailInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicantId")
        private String applicantId;

        @com.aliyun.core.annotation.NameInMap("ApplicantName")
        private String applicantName;

        @com.aliyun.core.annotation.NameInMap("ApprovalType")
        private String approvalType;

        @com.aliyun.core.annotation.NameInMap("ApproveProcessSteps")
        private java.util.List<ApproveProcessSteps> approveProcessSteps;

        @com.aliyun.core.annotation.NameInMap("BizContent")
        private String bizContent;

        @com.aliyun.core.annotation.NameInMap("FinishedAt")
        private String finishedAt;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("SourceSystem")
        private String sourceSystem;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubmittedAt")
        private String submittedAt;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private DetailInfo(Builder builder) {
            this.applicantId = builder.applicantId;
            this.applicantName = builder.applicantName;
            this.approvalType = builder.approvalType;
            this.approveProcessSteps = builder.approveProcessSteps;
            this.bizContent = builder.bizContent;
            this.finishedAt = builder.finishedAt;
            this.id = builder.id;
            this.sourceSystem = builder.sourceSystem;
            this.status = builder.status;
            this.submittedAt = builder.submittedAt;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetailInfo create() {
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
         * @return approveProcessSteps
         */
        public java.util.List<ApproveProcessSteps> getApproveProcessSteps() {
            return this.approveProcessSteps;
        }

        /**
         * @return bizContent
         */
        public String getBizContent() {
            return this.bizContent;
        }

        /**
         * @return finishedAt
         */
        public String getFinishedAt() {
            return this.finishedAt;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
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
            private java.util.List<ApproveProcessSteps> approveProcessSteps; 
            private String bizContent; 
            private String finishedAt; 
            private Long id; 
            private String sourceSystem; 
            private String status; 
            private String submittedAt; 
            private String title; 

            private Builder() {
            } 

            private Builder(DetailInfo model) {
                this.applicantId = model.applicantId;
                this.applicantName = model.applicantName;
                this.approvalType = model.approvalType;
                this.approveProcessSteps = model.approveProcessSteps;
                this.bizContent = model.bizContent;
                this.finishedAt = model.finishedAt;
                this.id = model.id;
                this.sourceSystem = model.sourceSystem;
                this.status = model.status;
                this.submittedAt = model.submittedAt;
                this.title = model.title;
            } 

            /**
             * <p>The ID of the applicant.</p>
             * 
             * <strong>example:</strong>
             * <p>user001</p>
             */
            public Builder applicantId(String applicantId) {
                this.applicantId = applicantId;
                return this;
            }

            /**
             * <p>The name of the applicant.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhang San</p>
             */
            public Builder applicantName(String applicantName) {
                this.applicantName = applicantName;
                return this;
            }

            /**
             * <p>The approval type. Valid values:</p>
             * <ul>
             * <li>APPROVE: Permission approval.</li>
             * <li>MANAGE: Management.</li>
             * <li>OTHERS: Others.</li>
             * <li>ATOMIC: Atomic metric approval.</li>
             * <li>BIZ_OBJECT: Business object approval.</li>
             * <li>BIZ_PROCESS: Business activity approval.</li>
             * <li>PUBLISH_APPROVE: Publish approval.</li>
             * <li>BASELINE_APPROVE: Baseline approval.</li>
             * <li>CODE_REVIEW: Asset approval.</li>
             * <li>OBJECT_CODE_REVIEW: Code review.</li>
             * <li>STANDARD_APPROVAL: Standard online approval.</li>
             * <li>BATCH_STANDARD_APPROVAL: Batch standard online approval.</li>
             * <li>STANDARD_OFFLINE_APPROVAL: Standard offline approval.</li>
             * <li>BATCH_STANDARD_OFFLINE_APPROVAL: Batch standard offline approval.</li>
             * <li>PRIVILEGE_TRANSFER_APPROVAL: Privilege transfer approval.</li>
             * <li>QD_FEATURE_ONLINE: Tag listing.</li>
             * <li>QD_FEATURE_OFFLINE: Tag delisting.</li>
             * <li>QD_CLUSTER_ONLINE: Group online.</li>
             * <li>QD_CLUSTER_OFFLINE: Group offline.</li>
             * <li>QD_MEMBER_ADD_APP: Member added to application.</li>
             * <li>QD_FEATURE_ADD_APP: Tag added to application.</li>
             * <li>QD_CLUSTER_ADD_APP: Group added to application.</li>
             * <li>QD_FEATURE_ADD_PROJECT: Tag added to project.</li>
             * <li>QD_CLUSTER_ADD_PROJECT: Group added to project.</li>
             * <li>TASK_DATA_DOWNLOAD: Data download.</li>
             * <li>CUSTOM_OPERATE: Custom operation.</li>
             * <li>PRIVACY_COMPUTING: Privacy-preserving computation.</li>
             * <li>MDC_TOPIC_DIR_PUBLISH: Asset topic directory publishing.</li>
             * <li>ASSET_PUBLISH: Asset listing approval.</li>
             * <li>ASSET_UN_PUBLISH: Asset delisting approval.</li>
             * <li>APPLICATION_CREATE: Application creation approval.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DATA_SOURCE</p>
             */
            public Builder approvalType(String approvalType) {
                this.approvalType = approvalType;
                return this;
            }

            /**
             * <p>The list of approval process steps.</p>
             */
            public Builder approveProcessSteps(java.util.List<ApproveProcessSteps> approveProcessSteps) {
                this.approveProcessSteps = approveProcessSteps;
                return this;
            }

            /**
             * <p>The JSON string of the task details.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder bizContent(String bizContent) {
                this.bizContent = bizContent;
                return this;
            }

            /**
             * <p>The completion time. Format: yyyy-MM-dd HH:mm:ss. This field is empty if the task is not completed.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-07-30 12:00:00</p>
             */
            public Builder finishedAt(String finishedAt) {
                this.finishedAt = finishedAt;
                return this;
            }

            /**
             * <p>The approval flow ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The source system.</p>
             * 
             * <strong>example:</strong>
             * <p>Dataphin</p>
             */
            public Builder sourceSystem(String sourceSystem) {
                this.sourceSystem = sourceSystem;
                return this;
            }

            /**
             * <p>The approval status. Valid values:</p>
             * <ul>
             * <li>APPROVING: Approving.</li>
             * <li>APPROVED: Approved.</li>
             * <li>REJECTED: Rejected.</li>
             * <li>REVOKED: Revoked.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>APPROVED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The submission time. Format: yyyy-MM-dd HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-07-30 10:00:00</p>
             */
            public Builder submittedAt(String submittedAt) {
                this.submittedAt = submittedAt;
                return this;
            }

            /**
             * <p>The task name.</p>
             * 
             * <strong>example:</strong>
             * <p>Data source application</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public DetailInfo build() {
                return new DetailInfo(this);
            } 

        } 

    }
}
