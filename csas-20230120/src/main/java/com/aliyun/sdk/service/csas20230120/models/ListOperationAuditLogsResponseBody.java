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
         * <p>The list of administrator operation audit logs, sorted by operation time in descending order.</p>
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
         * <p>The total number of logs that match the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
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
             * <p>The post-operation snapshot. This value is recorded as-is by the audit framework without localization. This field is empty for historical logs that are not integrated with the audit framework.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;RequestId&quot;:&quot;01A03244-5BAD-5FAA-93D6-E4F4A1A2****&quot;}</p>
             */
            public Builder afterAction(String afterAction) {
                this.afterAction = afterAction;
                return this;
            }

            /**
             * <p>The pre-operation snapshot. This value is recorded as-is by the audit framework without localization. This field is empty for historical logs that are not integrated with the audit framework.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;pa-application-ea73352b4b75****&quot;</p>
             */
            public Builder beforeAction(String beforeAction) {
                this.beforeAction = beforeAction;
                return this;
            }

            /**
             * <p>The error code when the operation failed. This field is empty when the operation succeeded.</p>
             * 
             * <strong>example:</strong>
             * <p>ResourceNotFound</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message when the operation failed. This field is empty when the operation succeeded.</p>
             * 
             * <strong>example:</strong>
             * <p>the specified resource is not found</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The event source type. Valid values:</p>
             * <ul>
             * <li><strong>console</strong>: console call.</li>
             * <li><strong>sdk</strong>: SDK call.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>console</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * <p>The operation function module. The return value is localized based on the request language.</p>
             * 
             * <strong>example:</strong>
             * <p>Office Data Protection</p>
             */
            public Builder operationFunc(String operationFunc) {
                this.operationFunc = operationFunc;
                return this;
            }

            /**
             * <p>The operation page. The return value is localized based on the request language.</p>
             * 
             * <strong>example:</strong>
             * <p>Peripheral Management</p>
             */
            public Builder operationPage(String operationPage) {
                this.operationPage = operationPage;
                return this;
            }

            /**
             * <p>The operation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-24 13:38:06</p>
             */
            public Builder operationTime(String operationTime) {
                this.operationTime = operationTime;
                return this;
            }

            /**
             * <p>The operation type. The return value is localized based on the request language.</p>
             * 
             * <strong>example:</strong>
             * <p>Modify peripheral control policy</p>
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account ID (AliUid) of the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>1234****</p>
             */
            public Builder operatorId(String operatorId) {
                this.operatorId = operatorId;
                return this;
            }

            /**
             * <p>Indicates whether the operation succeeded.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
