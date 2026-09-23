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
 * {@link GetPhysicalNodeOperationLogResponseBody} extends {@link TeaModel}
 *
 * <p>GetPhysicalNodeOperationLogResponseBody</p>
 */
public class GetPhysicalNodeOperationLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("OperationLogList")
    private java.util.List<OperationLogList> operationLogList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetPhysicalNodeOperationLogResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.operationLogList = builder.operationLogList;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPhysicalNodeOperationLogResponseBody create() {
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
     * @return operationLogList
     */
    public java.util.List<OperationLogList> getOperationLogList() {
        return this.operationLogList;
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
        private java.util.List<OperationLogList> operationLogList; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetPhysicalNodeOperationLogResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.operationLogList = model.operationLogList;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code. A value of OK indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The node operation logs.</p>
         */
        public Builder operationLogList(java.util.List<OperationLogList> operationLogList) {
            this.operationLogList = operationLogList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetPhysicalNodeOperationLogResponseBody build() {
            return new GetPhysicalNodeOperationLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPhysicalNodeOperationLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetPhysicalNodeOperationLogResponseBody</p>
     */
    public static class OperationLogList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Context")
        private String context;

        @com.aliyun.core.annotation.NameInMap("OperationTime")
        private String operationTime;

        @com.aliyun.core.annotation.NameInMap("OperationType")
        private String operationType;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("OperatorName")
        private String operatorName;

        private OperationLogList(Builder builder) {
            this.context = builder.context;
            this.operationTime = builder.operationTime;
            this.operationType = builder.operationType;
            this.operator = builder.operator;
            this.operatorName = builder.operatorName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationLogList create() {
            return builder().build();
        }

        /**
         * @return context
         */
        public String getContext() {
            return this.context;
        }

        /**
         * @return operationTime
         */
        public String getOperationTime() {
            return this.operationTime;
        }

        /**
         * @return operationType
         */
        public String getOperationType() {
            return this.operationType;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return operatorName
         */
        public String getOperatorName() {
            return this.operatorName;
        }

        public static final class Builder {
            private String context; 
            private String operationTime; 
            private String operationType; 
            private String operator; 
            private String operatorName; 

            private Builder() {
            } 

            private Builder(OperationLogList model) {
                this.context = model.context;
                this.operationTime = model.operationTime;
                this.operationType = model.operationType;
                this.operator = model.operator;
                this.operatorName = model.operatorName;
            } 

            /**
             * <p>The log details.</p>
             * 
             * <strong>example:</strong>
             * <p>xx</p>
             */
            public Builder context(String context) {
                this.context = context;
                return this;
            }

            /**
             * <p>The operation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-05-30 16:47:13</p>
             */
            public Builder operationTime(String operationTime) {
                this.operationTime = operationTime;
                return this;
            }

            /**
             * <p>The operation type. Valid values:</p>
             * <ul>
             * <li>TASK_UPDATE_PRIORITY: updates the node priority.</li>
             * <li>PAUSE_TASK: pauses scheduling.</li>
             * <li>RESUME_TASK: resumes scheduling.</li>
             * <li>CREATE_NODE: creates a node.</li>
             * <li>FORCE_DELETE_NODE: force deletes a node.</li>
             * <li>UPDATE_NODE: updates a node.</li>
             * <li>DELETE_NODE: deletes a node.</li>
             * <li>CHANGE_NODE_OWNER: changes the node owner.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PAUSE_TASK</p>
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * <p>The operator ID.</p>
             * 
             * <strong>example:</strong>
             * <p>132222</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The operator name.</p>
             * 
             * <strong>example:</strong>
             * <p>xx测试</p>
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            public OperationLogList build() {
                return new OperationLogList(this);
            } 

        } 

    }
}
