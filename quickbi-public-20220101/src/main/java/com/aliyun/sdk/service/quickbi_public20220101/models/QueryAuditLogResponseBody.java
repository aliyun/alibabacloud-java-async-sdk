// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link QueryAuditLogResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAuditLogResponseBody</p>
 */
public class QueryAuditLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryAuditLogResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAuditLogResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryAuditLogResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>78C1AA2D-9201-599E-A0BA-6FC462E57A95</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Array of logs.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Possible values: </p>
         * <ul>
         * <li>true: The request succeeded </li>
         * <li>false: The request failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryAuditLogResponseBody build() {
            return new QueryAuditLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAuditLogResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAuditLogResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("OperatorAccountName")
        private String operatorAccountName;

        @com.aliyun.core.annotation.NameInMap("OperatorName")
        private String operatorName;

        @com.aliyun.core.annotation.NameInMap("OperatorType")
        private String operatorType;

        @com.aliyun.core.annotation.NameInMap("TargetId")
        private String targetId;

        @com.aliyun.core.annotation.NameInMap("TargetName")
        private String targetName;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private Result(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.operatorAccountName = builder.operatorAccountName;
            this.operatorName = builder.operatorName;
            this.operatorType = builder.operatorType;
            this.targetId = builder.targetId;
            this.targetName = builder.targetName;
            this.targetType = builder.targetType;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return operatorAccountName
         */
        public String getOperatorAccountName() {
            return this.operatorAccountName;
        }

        /**
         * @return operatorName
         */
        public String getOperatorName() {
            return this.operatorName;
        }

        /**
         * @return operatorType
         */
        public String getOperatorType() {
            return this.operatorType;
        }

        /**
         * @return targetId
         */
        public String getTargetId() {
            return this.targetId;
        }

        /**
         * @return targetName
         */
        public String getTargetName() {
            return this.targetName;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String gmtCreate; 
            private String operatorAccountName; 
            private String operatorName; 
            private String operatorType; 
            private String targetId; 
            private String targetName; 
            private String targetType; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.gmtCreate = model.gmtCreate;
                this.operatorAccountName = model.operatorAccountName;
                this.operatorName = model.operatorName;
                this.operatorType = model.operatorType;
                this.targetId = model.targetId;
                this.targetName = model.targetName;
                this.targetType = model.targetType;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>Log time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-04-16 13:17:39</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>Operator account.</p>
             * 
             * <strong>example:</strong>
             * <p>wukaibis</p>
             */
            public Builder operatorAccountName(String operatorAccountName) {
                this.operatorAccountName = operatorAccountName;
                return this;
            }

            /**
             * <p>Operator&quot;s nickname.</p>
             * 
             * <strong>example:</strong>
             * <p>buc_344078</p>
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * <p>Operation type.</p>
             * 
             * <strong>example:</strong>
             * <p>CREATE</p>
             */
            public Builder operatorType(String operatorType) {
                this.operatorType = operatorType;
                return this;
            }

            /**
             * <p>Target ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1113***************8500</p>
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * <p>Target name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * <p>Target type.</p>
             * 
             * <strong>example:</strong>
             * <p>USER</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * <p>Workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>87c6b145-090c-43e1-9426-8f93be23****</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
