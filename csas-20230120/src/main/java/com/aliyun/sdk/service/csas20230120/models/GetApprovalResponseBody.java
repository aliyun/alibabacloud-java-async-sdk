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
         * <p>The approval details list, which typically contains one record.</p>
         */
        public Builder approval(java.util.List<Approval> approval) {
            this.approval = approval;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D6707286-A50E-57B1-B2CF-EFAC59E8****</p>
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
             * <p>The ID of the operator for the approval progress node.</p>
             * 
             * <strong>example:</strong>
             * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
             */
            public Builder saseUserId(String saseUserId) {
                this.saseUserId = saseUserId;
                return this;
            }

            /**
             * <p>The username of the operator for the approval progress node.</p>
             * 
             * <strong>example:</strong>
             * <p>user***</p>
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
             * <p>The action performed on the approval progress node. Valid values:</p>
             * <ul>
             * <li><strong>Approve</strong>: Approved.</li>
             * <li><strong>Reject</strong>: Rejected.</li>
             * <li><strong>Revoke</strong>: Revoked.</li>
             * <li><strong>Comment</strong>: Commented.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Approve</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The comment on the approval progress node.</p>
             * 
             * <strong>example:</strong>
             * <p>Approved</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The executor ID of the approval progress node.</p>
             * 
             * <strong>example:</strong>
             * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
             */
            public Builder executor(String executor) {
                this.executor = executor;
                return this;
            }

            /**
             * <p>The list of operators for the approval progress node.</p>
             */
            public Builder operators(java.util.List<Operators> operators) {
                this.operators = operators;
                return this;
            }

            /**
             * <p>The status of the approval progress node. Valid values:</p>
             * <ul>
             * <li><strong>Pending</strong>: Pending approval.</li>
             * <li><strong>Approved</strong>: Approved.</li>
             * <li><strong>Rejected</strong>: Rejected.</li>
             * <li><strong>Revoked</strong>: Revoked.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Approved</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The execution time of the approval progress node. The value is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1736752000</p>
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
             * <p>The SASE user ID of the actual effective user.</p>
             * 
             * <strong>example:</strong>
             * <p>su_70a1ed06a900d337527984de27568352fdfed1b19442a886d2a697c0327f****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The username of the actual effective user.</p>
             * 
             * <strong>example:</strong>
             * <p>user***</p>
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
             * <p>The associated policy name.</p>
             * 
             * <strong>example:</strong>
             * <p>Private access***</p>
             */
            public Builder associatedPolicyName(String associatedPolicyName) {
                this.associatedPolicyName = associatedPolicyName;
                return this;
            }

            /**
             * <p>The associated policy type, which is the same as PolicyType.</p>
             * 
             * <strong>example:</strong>
             * <p>PrivateAccessBlock</p>
             */
            public Builder associatedPolicyType(String associatedPolicyType) {
                this.associatedPolicyType = associatedPolicyType;
                return this;
            }

            /**
             * <p>The remark for the backend report, which is the same as the report reason.</p>
             * 
             * <strong>example:</strong>
             * <p>Temporary access for a project</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The report object. The fields vary based on PolicyType. Fields within the object use camelCase naming.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;applicationId&quot;:&quot;pa-application-eb75f0c80c28****&quot;,&quot;applicationName&quot;:&quot;App***&quot;}</p>
             */
            public Builder reportObject(Object reportObject) {
                this.reportObject = reportObject;
                return this;
            }

            /**
             * <p>The actual effective user of the backend report.</p>
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
             * <p>The details of the approval instance.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;applicationId&quot;:&quot;pa-application-eb75f0c80c28****&quot;,&quot;applicationName&quot;:&quot;App***&quot;,&quot;associatedPolicyName&quot;:&quot;Private access***&quot;}</p>
             */
            public Builder approvalDetail(String approvalDetail) {
                this.approvalDetail = approvalDetail;
                return this;
            }

            /**
             * <p>The approval instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>approval-3564b140642f****</p>
             */
            public Builder approvalId(String approvalId) {
                this.approvalId = approvalId;
                return this;
            }

            /**
             * <p>The approval progress list. For backend reports without approval nodes, an empty array is returned.</p>
             */
            public Builder approvalProgresses(java.util.List<ApprovalProgresses> approvalProgresses) {
                this.approvalProgresses = approvalProgresses;
                return this;
            }

            /**
             * <p>The approval type. Valid values:</p>
             * <ul>
             * <li>0: built-in approval.</li>
             * <li>1: DingTalk approval.</li>
             * <li>2: WeCom approval.</li>
             * <li>3: Lark approval.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder approvalType(Integer approvalType) {
                this.approvalType = approvalType;
                return this;
            }

            /**
             * <p>The backend report details. This value is returned only when ReportType is set to BackendReport.</p>
             */
            public Builder backendReportDetail(BackendReportDetail backendReportDetail) {
                this.backendReportDetail = backendReportDetail;
                return this;
            }

            /**
             * <p>The creation time in the yyyy-MM-dd HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-18 17:48:44</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The creation time as a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1787046524</p>
             */
            public Builder createTimeUnix(Long createTimeUnix) {
                this.createTimeUnix = createTimeUnix;
                return this;
            }

            /**
             * <p>The department path of the report initiator.</p>
             * 
             * <strong>example:</strong>
             * <p>CN=cn***,OU=ou***</p>
             */
            public Builder creatorDepartment(String creatorDepartment) {
                this.creatorDepartment = creatorDepartment;
                return this;
            }

            /**
             * <p>The device ID of the terminal that created the approval instance.</p>
             * 
             * <strong>example:</strong>
             * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
             */
            public Builder creatorDevTag(String creatorDevTag) {
                this.creatorDevTag = creatorDevTag;
                return this;
            }

            /**
             * <p>The ID of the user who created the approval instance. For backend reports, this is the actual effective user, not the administrator.</p>
             * 
             * <strong>example:</strong>
             * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
             */
            public Builder creatorUserId(String creatorUserId) {
                this.creatorUserId = creatorUserId;
                return this;
            }

            /**
             * <p>The username of the user who created the approval instance.</p>
             * 
             * <strong>example:</strong>
             * <p>user***</p>
             */
            public Builder creatorUsername(String creatorUsername) {
                this.creatorUsername = creatorUsername;
                return this;
            }

            /**
             * <p>The effective status of the report. This value is an empty string when the approval status is not Approved. Valid values:</p>
             * <ul>
             * <li>Enabled: valid.</li>
             * <li>Expired: expired.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder effectStatus(String effectStatus) {
                this.effectStatus = effectStatus;
                return this;
            }

            /**
             * <p>The expiration time of the approval instance. The value is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1757952000</p>
             */
            public Builder endTimestamp(Long endTimestamp) {
                this.endTimestamp = endTimestamp;
                return this;
            }

            /**
             * <p>The policy type associated with the approval instance. Valid values:</p>
             * <ul>
             * <li><strong>DomainBlacklist</strong>: Domain name blacklist.</li>
             * <li><strong>DomainWhitelist</strong>: Domain name whitelist.</li>
             * <li><strong>SoftwareBlock</strong>: Software blocking.</li>
             * <li><strong>DeviceRegistration</strong>: Excess registration.</li>
             * <li><strong>AppUninstall</strong>: Client uninstallation.</li>
             * <li><strong>DlpSend</strong>: File outbound transfer.</li>
             * <li><strong>PeripheralBlock</strong>: Peripheral control.</li>
             * <li><strong>EndpointHardening</strong>: Endpoint hardening.</li>
             * <li><strong>oftwareHardening</strong>: Software hardening.</li>
             * <li><strong>AiAgentBlock</strong>: AI Agent control.</li>
             * <li><strong>PrivateAccessBlock</strong>: Private access.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DlpSend</p>
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * <p>The ID of the process associated with the approval instance.</p>
             * 
             * <strong>example:</strong>
             * <p>approval-process-fcc351b8a95b****</p>
             */
            public Builder processId(String processId) {
                this.processId = processId;
                return this;
            }

            /**
             * <p>The name of the process associated with the approval instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Approval***</p>
             */
            public Builder processName(String processName) {
                this.processName = processName;
                return this;
            }

            /**
             * <p>The reason for creating the approval instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Temporary access for a project</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The report type. Valid values:</p>
             * <ul>
             * <li>ApprovalReport: approval report.</li>
             * <li>BackendReport: backend report.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BackendReport</p>
             */
            public Builder reportType(String reportType) {
                this.reportType = reportType;
                return this;
            }

            /**
             * <p>The content of the template associated with the approval instance.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;form&quot;: {&quot;labelCol&quot;: 6,&quot;wrapperCol&quot;: 12}}</p>
             */
            public Builder schemaContent(String schemaContent) {
                this.schemaContent = schemaContent;
                return this;
            }

            /**
             * <p>The ID of the template associated with the approval instance.</p>
             * 
             * <strong>example:</strong>
             * <p>approval-schema-090134f1ebff****</p>
             */
            public Builder schemaId(String schemaId) {
                this.schemaId = schemaId;
                return this;
            }

            /**
             * <p>The name of the template associated with the approval instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Template***</p>
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * <p>The instance status. Valid values:</p>
             * <ul>
             * <li><strong>Pending</strong>: Pending approval.</li>
             * <li><strong>Approved</strong>: Approved.</li>
             * <li><strong>Rejected</strong>: Denied.</li>
             * <li><strong>Revoked</strong>: Revoked.</li>
             * <li><strong>Expired</strong>: Expired.</li>
             * <li><strong>Deleted</strong>: Deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Pending</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The validity duration type. Valid values:</p>
             * <ul>
             * <li><strong>FixedTime</strong>: Expires at a specified time.</li>
             * <li><strong>Permanent</strong>: Permanently valid.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Permanent</p>
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
