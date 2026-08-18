// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link GetApprovalResponseBody} extends {@link TeaModel}
 *
 * <p>GetApprovalResponseBody</p>
 */
public class GetApprovalResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Approval")
    private java.util.List<Approval> approval;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetApprovalResponseBody(Builder builder) {
        this.approval = builder.approval;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApprovalResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return approval
     */
    public java.util.List<Approval> getApproval() {
        return this.approval;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Approval> approval; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetApprovalResponseBody model) {
            this.approval = model.approval;
            this.requestId = model.requestId;
        } 

        /**
         * Approval.
         */
        public Builder approval(java.util.List<Approval> approval) {
            this.approval = approval;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetApprovalResponseBody build() {
            return new GetApprovalResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetApprovalResponseBody} extends {@link TeaModel}
     *
     * <p>GetApprovalResponseBody</p>
     */
    public static class Operators extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SaseUserId")
        private String saseUserId;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private Operators(Builder builder) {
            this.saseUserId = builder.saseUserId;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Operators create() {
            return builder().build();
        }

        /**
         * @return saseUserId
         */
        public String getSaseUserId() {
            return this.saseUserId;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String saseUserId; 
            private String username; 

            private Builder() {
            } 

            private Builder(Operators model) {
                this.saseUserId = model.saseUserId;
                this.username = model.username;
            } 

            /**
             * SaseUserId.
             */
            public Builder saseUserId(String saseUserId) {
                this.saseUserId = saseUserId;
                return this;
            }

            /**
             * Username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public Operators build() {
                return new Operators(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApprovalResponseBody} extends {@link TeaModel}
     *
     * <p>GetApprovalResponseBody</p>
     */
    public static class ApprovalProgresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("Executor")
        private String executor;

        @com.aliyun.core.annotation.NameInMap("Operators")
        private java.util.List<Operators> operators;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        private ApprovalProgresses(Builder builder) {
            this.action = builder.action;
            this.comment = builder.comment;
            this.executor = builder.executor;
            this.operators = builder.operators;
            this.status = builder.status;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApprovalProgresses create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return executor
         */
        public String getExecutor() {
            return this.executor;
        }

        /**
         * @return operators
         */
        public java.util.List<Operators> getOperators() {
            return this.operators;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String action; 
            private String comment; 
            private String executor; 
            private java.util.List<Operators> operators; 
            private String status; 
            private Long timestamp; 

            private Builder() {
            } 

            private Builder(ApprovalProgresses model) {
                this.action = model.action;
                this.comment = model.comment;
                this.executor = model.executor;
                this.operators = model.operators;
                this.status = model.status;
                this.timestamp = model.timestamp;
            } 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * Executor.
             */
            public Builder executor(String executor) {
                this.executor = executor;
                return this;
            }

            /**
             * Operators.
             */
            public Builder operators(java.util.List<Operators> operators) {
                this.operators = operators;
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
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public ApprovalProgresses build() {
                return new ApprovalProgresses(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApprovalResponseBody} extends {@link TeaModel}
     *
     * <p>GetApprovalResponseBody</p>
     */
    public static class TargetUser extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private TargetUser(Builder builder) {
            this.userId = builder.userId;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetUser create() {
            return builder().build();
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String userId; 
            private String username; 

            private Builder() {
            } 

            private Builder(TargetUser model) {
                this.userId = model.userId;
                this.username = model.username;
            } 

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * Username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public TargetUser build() {
                return new TargetUser(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApprovalResponseBody} extends {@link TeaModel}
     *
     * <p>GetApprovalResponseBody</p>
     */
    public static class BackendReportDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociatedPolicyName")
        private String associatedPolicyName;

        @com.aliyun.core.annotation.NameInMap("AssociatedPolicyType")
        private String associatedPolicyType;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("ReportObject")
        private Object reportObject;

        @com.aliyun.core.annotation.NameInMap("TargetUser")
        private TargetUser targetUser;

        private BackendReportDetail(Builder builder) {
            this.associatedPolicyName = builder.associatedPolicyName;
            this.associatedPolicyType = builder.associatedPolicyType;
            this.remark = builder.remark;
            this.reportObject = builder.reportObject;
            this.targetUser = builder.targetUser;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackendReportDetail create() {
            return builder().build();
        }

        /**
         * @return associatedPolicyName
         */
        public String getAssociatedPolicyName() {
            return this.associatedPolicyName;
        }

        /**
         * @return associatedPolicyType
         */
        public String getAssociatedPolicyType() {
            return this.associatedPolicyType;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return reportObject
         */
        public Object getReportObject() {
            return this.reportObject;
        }

        /**
         * @return targetUser
         */
        public TargetUser getTargetUser() {
            return this.targetUser;
        }

        public static final class Builder {
            private String associatedPolicyName; 
            private String associatedPolicyType; 
            private String remark; 
            private Object reportObject; 
            private TargetUser targetUser; 

            private Builder() {
            } 

            private Builder(BackendReportDetail model) {
                this.associatedPolicyName = model.associatedPolicyName;
                this.associatedPolicyType = model.associatedPolicyType;
                this.remark = model.remark;
                this.reportObject = model.reportObject;
                this.targetUser = model.targetUser;
            } 

            /**
             * AssociatedPolicyName.
             */
            public Builder associatedPolicyName(String associatedPolicyName) {
                this.associatedPolicyName = associatedPolicyName;
                return this;
            }

            /**
             * AssociatedPolicyType.
             */
            public Builder associatedPolicyType(String associatedPolicyType) {
                this.associatedPolicyType = associatedPolicyType;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * ReportObject.
             */
            public Builder reportObject(Object reportObject) {
                this.reportObject = reportObject;
                return this;
            }

            /**
             * TargetUser.
             */
            public Builder targetUser(TargetUser targetUser) {
                this.targetUser = targetUser;
                return this;
            }

            public BackendReportDetail build() {
                return new BackendReportDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApprovalResponseBody} extends {@link TeaModel}
     *
     * <p>GetApprovalResponseBody</p>
     */
    public static class Approval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApprovalDetail")
        private String approvalDetail;

        @com.aliyun.core.annotation.NameInMap("ApprovalId")
        private String approvalId;

        @com.aliyun.core.annotation.NameInMap("ApprovalProgresses")
        private java.util.List<ApprovalProgresses> approvalProgresses;

        @com.aliyun.core.annotation.NameInMap("ApprovalType")
        private Integer approvalType;

        @com.aliyun.core.annotation.NameInMap("BackendReportDetail")
        private BackendReportDetail backendReportDetail;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateTimeUnix")
        private Long createTimeUnix;

        @com.aliyun.core.annotation.NameInMap("CreatorDepartment")
        private String creatorDepartment;

        @com.aliyun.core.annotation.NameInMap("CreatorDevTag")
        private String creatorDevTag;

        @com.aliyun.core.annotation.NameInMap("CreatorUserId")
        private String creatorUserId;

        @com.aliyun.core.annotation.NameInMap("CreatorUsername")
        private String creatorUsername;

        @com.aliyun.core.annotation.NameInMap("EffectStatus")
        private String effectStatus;

        @com.aliyun.core.annotation.NameInMap("EndTimestamp")
        private Long endTimestamp;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        @com.aliyun.core.annotation.NameInMap("ProcessId")
        private String processId;

        @com.aliyun.core.annotation.NameInMap("ProcessName")
        private String processName;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("ReportType")
        private String reportType;

        @com.aliyun.core.annotation.NameInMap("SchemaContent")
        private String schemaContent;

        @com.aliyun.core.annotation.NameInMap("SchemaId")
        private String schemaId;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("ValidityType")
        private String validityType;

        private Approval(Builder builder) {
            this.approvalDetail = builder.approvalDetail;
            this.approvalId = builder.approvalId;
            this.approvalProgresses = builder.approvalProgresses;
            this.approvalType = builder.approvalType;
            this.backendReportDetail = builder.backendReportDetail;
            this.createTime = builder.createTime;
            this.createTimeUnix = builder.createTimeUnix;
            this.creatorDepartment = builder.creatorDepartment;
            this.creatorDevTag = builder.creatorDevTag;
            this.creatorUserId = builder.creatorUserId;
            this.creatorUsername = builder.creatorUsername;
            this.effectStatus = builder.effectStatus;
            this.endTimestamp = builder.endTimestamp;
            this.policyType = builder.policyType;
            this.processId = builder.processId;
            this.processName = builder.processName;
            this.reason = builder.reason;
            this.reportType = builder.reportType;
            this.schemaContent = builder.schemaContent;
            this.schemaId = builder.schemaId;
            this.schemaName = builder.schemaName;
            this.status = builder.status;
            this.validityType = builder.validityType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Approval create() {
            return builder().build();
        }

        /**
         * @return approvalDetail
         */
        public String getApprovalDetail() {
            return this.approvalDetail;
        }

        /**
         * @return approvalId
         */
        public String getApprovalId() {
            return this.approvalId;
        }

        /**
         * @return approvalProgresses
         */
        public java.util.List<ApprovalProgresses> getApprovalProgresses() {
            return this.approvalProgresses;
        }

        /**
         * @return approvalType
         */
        public Integer getApprovalType() {
            return this.approvalType;
        }

        /**
         * @return backendReportDetail
         */
        public BackendReportDetail getBackendReportDetail() {
            return this.backendReportDetail;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createTimeUnix
         */
        public Long getCreateTimeUnix() {
            return this.createTimeUnix;
        }

        /**
         * @return creatorDepartment
         */
        public String getCreatorDepartment() {
            return this.creatorDepartment;
        }

        /**
         * @return creatorDevTag
         */
        public String getCreatorDevTag() {
            return this.creatorDevTag;
        }

        /**
         * @return creatorUserId
         */
        public String getCreatorUserId() {
            return this.creatorUserId;
        }

        /**
         * @return creatorUsername
         */
        public String getCreatorUsername() {
            return this.creatorUsername;
        }

        /**
         * @return effectStatus
         */
        public String getEffectStatus() {
            return this.effectStatus;
        }

        /**
         * @return endTimestamp
         */
        public Long getEndTimestamp() {
            return this.endTimestamp;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        /**
         * @return processId
         */
        public String getProcessId() {
            return this.processId;
        }

        /**
         * @return processName
         */
        public String getProcessName() {
            return this.processName;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return reportType
         */
        public String getReportType() {
            return this.reportType;
        }

        /**
         * @return schemaContent
         */
        public String getSchemaContent() {
            return this.schemaContent;
        }

        /**
         * @return schemaId
         */
        public String getSchemaId() {
            return this.schemaId;
        }

        /**
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return validityType
         */
        public String getValidityType() {
            return this.validityType;
        }

        public static final class Builder {
            private String approvalDetail; 
            private String approvalId; 
            private java.util.List<ApprovalProgresses> approvalProgresses; 
            private Integer approvalType; 
            private BackendReportDetail backendReportDetail; 
            private String createTime; 
            private Long createTimeUnix; 
            private String creatorDepartment; 
            private String creatorDevTag; 
            private String creatorUserId; 
            private String creatorUsername; 
            private String effectStatus; 
            private Long endTimestamp; 
            private String policyType; 
            private String processId; 
            private String processName; 
            private String reason; 
            private String reportType; 
            private String schemaContent; 
            private String schemaId; 
            private String schemaName; 
            private String status; 
            private String validityType; 

            private Builder() {
            } 

            private Builder(Approval model) {
                this.approvalDetail = model.approvalDetail;
                this.approvalId = model.approvalId;
                this.approvalProgresses = model.approvalProgresses;
                this.approvalType = model.approvalType;
                this.backendReportDetail = model.backendReportDetail;
                this.createTime = model.createTime;
                this.createTimeUnix = model.createTimeUnix;
                this.creatorDepartment = model.creatorDepartment;
                this.creatorDevTag = model.creatorDevTag;
                this.creatorUserId = model.creatorUserId;
                this.creatorUsername = model.creatorUsername;
                this.effectStatus = model.effectStatus;
                this.endTimestamp = model.endTimestamp;
                this.policyType = model.policyType;
                this.processId = model.processId;
                this.processName = model.processName;
                this.reason = model.reason;
                this.reportType = model.reportType;
                this.schemaContent = model.schemaContent;
                this.schemaId = model.schemaId;
                this.schemaName = model.schemaName;
                this.status = model.status;
                this.validityType = model.validityType;
            } 

            /**
             * ApprovalDetail.
             */
            public Builder approvalDetail(String approvalDetail) {
                this.approvalDetail = approvalDetail;
                return this;
            }

            /**
             * ApprovalId.
             */
            public Builder approvalId(String approvalId) {
                this.approvalId = approvalId;
                return this;
            }

            /**
             * ApprovalProgresses.
             */
            public Builder approvalProgresses(java.util.List<ApprovalProgresses> approvalProgresses) {
                this.approvalProgresses = approvalProgresses;
                return this;
            }

            /**
             * ApprovalType.
             */
            public Builder approvalType(Integer approvalType) {
                this.approvalType = approvalType;
                return this;
            }

            /**
             * BackendReportDetail.
             */
            public Builder backendReportDetail(BackendReportDetail backendReportDetail) {
                this.backendReportDetail = backendReportDetail;
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
             * CreateTimeUnix.
             */
            public Builder createTimeUnix(Long createTimeUnix) {
                this.createTimeUnix = createTimeUnix;
                return this;
            }

            /**
             * CreatorDepartment.
             */
            public Builder creatorDepartment(String creatorDepartment) {
                this.creatorDepartment = creatorDepartment;
                return this;
            }

            /**
             * CreatorDevTag.
             */
            public Builder creatorDevTag(String creatorDevTag) {
                this.creatorDevTag = creatorDevTag;
                return this;
            }

            /**
             * CreatorUserId.
             */
            public Builder creatorUserId(String creatorUserId) {
                this.creatorUserId = creatorUserId;
                return this;
            }

            /**
             * CreatorUsername.
             */
            public Builder creatorUsername(String creatorUsername) {
                this.creatorUsername = creatorUsername;
                return this;
            }

            /**
             * EffectStatus.
             */
            public Builder effectStatus(String effectStatus) {
                this.effectStatus = effectStatus;
                return this;
            }

            /**
             * EndTimestamp.
             */
            public Builder endTimestamp(Long endTimestamp) {
                this.endTimestamp = endTimestamp;
                return this;
            }

            /**
             * PolicyType.
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * ProcessId.
             */
            public Builder processId(String processId) {
                this.processId = processId;
                return this;
            }

            /**
             * ProcessName.
             */
            public Builder processName(String processName) {
                this.processName = processName;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * ReportType.
             */
            public Builder reportType(String reportType) {
                this.reportType = reportType;
                return this;
            }

            /**
             * SchemaContent.
             */
            public Builder schemaContent(String schemaContent) {
                this.schemaContent = schemaContent;
                return this;
            }

            /**
             * SchemaId.
             */
            public Builder schemaId(String schemaId) {
                this.schemaId = schemaId;
                return this;
            }

            /**
             * SchemaName.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
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
             * ValidityType.
             */
            public Builder validityType(String validityType) {
                this.validityType = validityType;
                return this;
            }

            public Approval build() {
                return new Approval(this);
            } 

        } 

    }
}
