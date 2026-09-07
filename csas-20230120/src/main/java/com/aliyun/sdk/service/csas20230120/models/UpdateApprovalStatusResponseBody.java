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
 * {@link UpdateApprovalStatusResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateApprovalStatusResponseBody</p>
 */
public class UpdateApprovalStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Approval")
    private java.util.List<Approval> approval;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateApprovalStatusResponseBody(Builder builder) {
        this.approval = builder.approval;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApprovalStatusResponseBody create() {
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

        private Builder(UpdateApprovalStatusResponseBody model) {
            this.approval = model.approval;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The approval instance.</p>
         */
        public Builder approval(java.util.List<Approval> approval) {
            this.approval = approval;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>58D6B23E-E5DA-5418-8F61-51A3B5A30049</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateApprovalStatusResponseBody build() {
            return new UpdateApprovalStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateApprovalStatusResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateApprovalStatusResponseBody</p>
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
             * <p>John</p>
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
     * {@link UpdateApprovalStatusResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateApprovalStatusResponseBody</p>
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
             * <li><strong>Approve</strong>: Approve.</li>
             * <li><strong>Reject</strong>: Reject.</li>
             * <li><strong>Revoke</strong>: Revoke.</li>
             * <li><strong>Comment</strong>: Comment.</li>
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
             * <p>The ID of the executor for the approval progress node.</p>
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
             * <p>The time when the action was performed on the approval progress node. The value is a UNIX timestamp in seconds.</p>
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
     * {@link UpdateApprovalStatusResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateApprovalStatusResponseBody</p>
     */
    public static class Approval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApprovalDetail")
        private String approvalDetail;

        @com.aliyun.core.annotation.NameInMap("ApprovalId")
        private String approvalId;

        @com.aliyun.core.annotation.NameInMap("ApprovalProgresses")
        private java.util.List<ApprovalProgresses> approvalProgresses;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreatorDevTag")
        private String creatorDevTag;

        @com.aliyun.core.annotation.NameInMap("CreatorUserId")
        private String creatorUserId;

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

        @com.aliyun.core.annotation.NameInMap("SchemaContent")
        private String schemaContent;

        @com.aliyun.core.annotation.NameInMap("SchemaId")
        private String schemaId;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Approval(Builder builder) {
            this.approvalDetail = builder.approvalDetail;
            this.approvalId = builder.approvalId;
            this.approvalProgresses = builder.approvalProgresses;
            this.createTime = builder.createTime;
            this.creatorDevTag = builder.creatorDevTag;
            this.creatorUserId = builder.creatorUserId;
            this.endTimestamp = builder.endTimestamp;
            this.policyType = builder.policyType;
            this.processId = builder.processId;
            this.processName = builder.processName;
            this.reason = builder.reason;
            this.schemaContent = builder.schemaContent;
            this.schemaId = builder.schemaId;
            this.schemaName = builder.schemaName;
            this.status = builder.status;
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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

        public static final class Builder {
            private String approvalDetail; 
            private String approvalId; 
            private java.util.List<ApprovalProgresses> approvalProgresses; 
            private String createTime; 
            private String creatorDevTag; 
            private String creatorUserId; 
            private Long endTimestamp; 
            private String policyType; 
            private String processId; 
            private String processName; 
            private String reason; 
            private String schemaContent; 
            private String schemaId; 
            private String schemaName; 
            private String status; 

            private Builder() {
            } 

            private Builder(Approval model) {
                this.approvalDetail = model.approvalDetail;
                this.approvalId = model.approvalId;
                this.approvalProgresses = model.approvalProgresses;
                this.createTime = model.createTime;
                this.creatorDevTag = model.creatorDevTag;
                this.creatorUserId = model.creatorUserId;
                this.endTimestamp = model.endTimestamp;
                this.policyType = model.policyType;
                this.processId = model.processId;
                this.processName = model.processName;
                this.reason = model.reason;
                this.schemaContent = model.schemaContent;
                this.schemaId = model.schemaId;
                this.schemaName = model.schemaName;
                this.status = model.status;
            } 

            /**
             * <p>The details of the approval instance.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;initiatorName&quot;:&quot;John&quot;,&quot;initiatorDept&quot;:&quot;QA Department&quot;,&quot;devType&quot;:&quot;windows&quot;,&quot;deviceType&quot;:&quot;usbStorage&quot;,&quot;deviceId&quot;:&quot;FC216E9E3****&quot;,&quot;approvalEndTimestamp&quot;:1736524799,&quot;approvalReason&quot;:&quot;This is a test&quot;}</p>
             */
            public Builder approvalDetail(String approvalDetail) {
                this.approvalDetail = approvalDetail;
                return this;
            }

            /**
             * <p>The approval instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>approval-165e6738ad9d****</p>
             */
            public Builder approvalId(String approvalId) {
                this.approvalId = approvalId;
                return this;
            }

            /**
             * <p>The list of approval progress nodes.</p>
             */
            public Builder approvalProgresses(java.util.List<ApprovalProgresses> approvalProgresses) {
                this.approvalProgresses = approvalProgresses;
                return this;
            }

            /**
             * <p>The time when the approval instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-15 22:11:55</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the terminal device from which the approval instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
             */
            public Builder creatorDevTag(String creatorDevTag) {
                this.creatorDevTag = creatorDevTag;
                return this;
            }

            /**
             * <p>The ID of the user who created the approval instance.</p>
             * 
             * <strong>example:</strong>
             * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
             */
            public Builder creatorUserId(String creatorUserId) {
                this.creatorUserId = creatorUserId;
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
             * <li><strong>AppUninstall</strong>: Terminal uninstallation.</li>
             * <li><strong>DlpSend</strong>: File outbound transfer.</li>
             * <li><strong>PeripheralBlock</strong>: Peripheral control.</li>
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
             * <p>Test</p>
             */
            public Builder processName(String processName) {
                this.processName = processName;
                return this;
            }

            /**
             * <p>The reason for creating the approval instance.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a test</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
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
             * <p>Test</p>
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * <p>The instance status of the approval. Valid values:</p>
             * <ul>
             * <li><strong>Pending</strong>: Pending approval.</li>
             * <li><strong>Approved</strong>: Approved.</li>
             * <li><strong>Rejected</strong>: Deny.</li>
             * <li><strong>Revoked</strong>: Revoked.</li>
             * <li><strong>Expired</strong>: Expired.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Pending</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Approval build() {
                return new Approval(this);
            } 

        } 

    }
}
