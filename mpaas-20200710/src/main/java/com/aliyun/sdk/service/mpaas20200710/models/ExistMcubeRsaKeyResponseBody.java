// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20200710.models;

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
 * {@link ExistMcubeRsaKeyResponseBody} extends {@link TeaModel}
 *
 * <p>ExistMcubeRsaKeyResponseBody</p>
 */
public class ExistMcubeRsaKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CheckRsaKeyResult")
    private CheckRsaKeyResult checkRsaKeyResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    private ExistMcubeRsaKeyResponseBody(Builder builder) {
        this.checkRsaKeyResult = builder.checkRsaKeyResult;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExistMcubeRsaKeyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkRsaKeyResult
     */
    public CheckRsaKeyResult getCheckRsaKeyResult() {
        return this.checkRsaKeyResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultMessage
     */
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static final class Builder {
        private CheckRsaKeyResult checkRsaKeyResult; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 

        private Builder() {
        } 

        private Builder(ExistMcubeRsaKeyResponseBody model) {
            this.checkRsaKeyResult = model.checkRsaKeyResult;
            this.requestId = model.requestId;
            this.resultCode = model.resultCode;
            this.resultMessage = model.resultMessage;
        } 

        /**
         * CheckRsaKeyResult.
         */
        public Builder checkRsaKeyResult(CheckRsaKeyResult checkRsaKeyResult) {
            this.checkRsaKeyResult = checkRsaKeyResult;
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
         * ResultCode.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * ResultMessage.
         */
        public Builder resultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }

        public ExistMcubeRsaKeyResponseBody build() {
            return new ExistMcubeRsaKeyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ExistMcubeRsaKeyResponseBody} extends {@link TeaModel}
     *
     * <p>ExistMcubeRsaKeyResponseBody</p>
     */
    public static class CheckRsaKeyResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private String data;

        @com.aliyun.core.annotation.NameInMap("ResultMsg")
        private String resultMsg;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private CheckRsaKeyResult(Builder builder) {
            this.data = builder.data;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckRsaKeyResult create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public String getData() {
            return this.data;
        }

        /**
         * @return resultMsg
         */
        public String getResultMsg() {
            return this.resultMsg;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String data; 
            private String resultMsg; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(CheckRsaKeyResult model) {
                this.data = model.data;
                this.resultMsg = model.resultMsg;
                this.success = model.success;
            } 

            /**
             * Data.
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * ResultMsg.
             */
            public Builder resultMsg(String resultMsg) {
                this.resultMsg = resultMsg;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public CheckRsaKeyResult build() {
                return new CheckRsaKeyResult(this);
            } 

        } 

    }
}
