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
         * OperationLogList.
         */
        public Builder operationLogList(java.util.List<OperationLogList> operationLogList) {
            this.operationLogList = operationLogList;
            return this;
        }

        /**
         * RequestId.
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

            /**
             * Context.
             */
            public Builder context(String context) {
                this.context = context;
                return this;
            }

            /**
             * OperationTime.
             */
            public Builder operationTime(String operationTime) {
                this.operationTime = operationTime;
                return this;
            }

            /**
             * OperationType.
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * OperatorName.
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
