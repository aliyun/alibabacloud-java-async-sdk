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
 * {@link ListOperationAuditLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListOperationAuditLogsResponseBody</p>
 */
public class ListOperationAuditLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Logs")
    private java.util.List<Logs> logs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Long totalNum;

    private ListOperationAuditLogsResponseBody(Builder builder) {
        this.logs = builder.logs;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOperationAuditLogsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logs
     */
    public java.util.List<Logs> getLogs() {
        return this.logs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalNum
     */
    public Long getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private java.util.List<Logs> logs; 
        private String requestId; 
        private Long totalNum; 

        private Builder() {
        } 

        private Builder(ListOperationAuditLogsResponseBody model) {
            this.logs = model.logs;
            this.requestId = model.requestId;
            this.totalNum = model.totalNum;
        } 

        /**
         * Logs.
         */
        public Builder logs(java.util.List<Logs> logs) {
            this.logs = logs;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>E9D4B681-0E79-57B7-AF0D-4A675D40141C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalNum.
         */
        public Builder totalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public ListOperationAuditLogsResponseBody build() {
            return new ListOperationAuditLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOperationAuditLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListOperationAuditLogsResponseBody</p>
     */
    public static class Logs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AfterAction")
        private String afterAction;

        @com.aliyun.core.annotation.NameInMap("BeforeAction")
        private String beforeAction;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("OperationFunc")
        private String operationFunc;

        @com.aliyun.core.annotation.NameInMap("OperationPage")
        private String operationPage;

        @com.aliyun.core.annotation.NameInMap("OperationTime")
        private String operationTime;

        @com.aliyun.core.annotation.NameInMap("OperationType")
        private String operationType;

        @com.aliyun.core.annotation.NameInMap("OperatorId")
        private String operatorId;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private Logs(Builder builder) {
            this.afterAction = builder.afterAction;
            this.beforeAction = builder.beforeAction;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.eventType = builder.eventType;
            this.operationFunc = builder.operationFunc;
            this.operationPage = builder.operationPage;
            this.operationTime = builder.operationTime;
            this.operationType = builder.operationType;
            this.operatorId = builder.operatorId;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logs create() {
            return builder().build();
        }

        /**
         * @return afterAction
         */
        public String getAfterAction() {
            return this.afterAction;
        }

        /**
         * @return beforeAction
         */
        public String getBeforeAction() {
            return this.beforeAction;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return operationFunc
         */
        public String getOperationFunc() {
            return this.operationFunc;
        }

        /**
         * @return operationPage
         */
        public String getOperationPage() {
            return this.operationPage;
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
         * @return operatorId
         */
        public String getOperatorId() {
            return this.operatorId;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String afterAction; 
            private String beforeAction; 
            private String errorCode; 
            private String errorMessage; 
            private String eventType; 
            private String operationFunc; 
            private String operationPage; 
            private String operationTime; 
            private String operationType; 
            private String operatorId; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(Logs model) {
                this.afterAction = model.afterAction;
                this.beforeAction = model.beforeAction;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.eventType = model.eventType;
                this.operationFunc = model.operationFunc;
                this.operationPage = model.operationPage;
                this.operationTime = model.operationTime;
                this.operationType = model.operationType;
                this.operatorId = model.operatorId;
                this.success = model.success;
            } 

            /**
             * AfterAction.
             */
            public Builder afterAction(String afterAction) {
                this.afterAction = afterAction;
                return this;
            }

            /**
             * BeforeAction.
             */
            public Builder beforeAction(String beforeAction) {
                this.beforeAction = beforeAction;
                return this;
            }

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * EventType.
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * OperationFunc.
             */
            public Builder operationFunc(String operationFunc) {
                this.operationFunc = operationFunc;
                return this;
            }

            /**
             * OperationPage.
             */
            public Builder operationPage(String operationPage) {
                this.operationPage = operationPage;
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
             * OperatorId.
             */
            public Builder operatorId(String operatorId) {
                this.operatorId = operatorId;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Logs build() {
                return new Logs(this);
            } 

        } 

    }
}
