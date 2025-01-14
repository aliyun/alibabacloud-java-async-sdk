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
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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

            public Approval build() {
                return new Approval(this);
            } 

        } 

    }
}
