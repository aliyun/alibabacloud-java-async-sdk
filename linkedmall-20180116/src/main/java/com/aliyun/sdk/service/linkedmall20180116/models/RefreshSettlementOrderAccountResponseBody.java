// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link RefreshSettlementOrderAccountResponseBody} extends {@link TeaModel}
 *
 * <p>RefreshSettlementOrderAccountResponseBody</p>
 */
public class RefreshSettlementOrderAccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("LogsId")
    private String logsId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private java.util.List<Model> model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubCode")
    private String subCode;

    @com.aliyun.core.annotation.NameInMap("SubMessage")
    private String subMessage;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private RefreshSettlementOrderAccountResponseBody(Builder builder) {
        this.code = builder.code;
        this.logsId = builder.logsId;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.subCode = builder.subCode;
        this.subMessage = builder.subMessage;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshSettlementOrderAccountResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return logsId
     */
    public String getLogsId() {
        return this.logsId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public java.util.List<Model> getModel() {
        return this.model;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subCode
     */
    public String getSubCode() {
        return this.subCode;
    }

    /**
     * @return subMessage
     */
    public String getSubMessage() {
        return this.subMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String logsId; 
        private String message; 
        private java.util.List<Model> model; 
        private String requestId; 
        private String subCode; 
        private String subMessage; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * LogsId.
         */
        public Builder logsId(String logsId) {
            this.logsId = logsId;
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
         * Model.
         */
        public Builder model(java.util.List<Model> model) {
            this.model = model;
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
         * SubCode.
         */
        public Builder subCode(String subCode) {
            this.subCode = subCode;
            return this;
        }

        /**
         * SubMessage.
         */
        public Builder subMessage(String subMessage) {
            this.subMessage = subMessage;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public RefreshSettlementOrderAccountResponseBody build() {
            return new RefreshSettlementOrderAccountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RefreshSettlementOrderAccountResponseBody} extends {@link TeaModel}
     *
     * <p>RefreshSettlementOrderAccountResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountNo")
        private String accountNo;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("SettleNo")
        private String settleNo;

        private Model(Builder builder) {
            this.accountNo = builder.accountNo;
            this.message = builder.message;
            this.result = builder.result;
            this.settleNo = builder.settleNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return accountNo
         */
        public String getAccountNo() {
            return this.accountNo;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return settleNo
         */
        public String getSettleNo() {
            return this.settleNo;
        }

        public static final class Builder {
            private String accountNo; 
            private String message; 
            private String result; 
            private String settleNo; 

            /**
             * AccountNo.
             */
            public Builder accountNo(String accountNo) {
                this.accountNo = accountNo;
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
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * SettleNo.
             */
            public Builder settleNo(String settleNo) {
                this.settleNo = settleNo;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
