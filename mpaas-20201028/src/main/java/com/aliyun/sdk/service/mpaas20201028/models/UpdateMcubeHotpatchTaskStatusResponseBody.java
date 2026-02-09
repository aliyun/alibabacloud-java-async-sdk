// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

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
 * {@link UpdateMcubeHotpatchTaskStatusResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateMcubeHotpatchTaskStatusResponseBody</p>
 */
public class UpdateMcubeHotpatchTaskStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    @com.aliyun.core.annotation.NameInMap("UpdateHotpatchTaskStatusResult")
    private UpdateHotpatchTaskStatusResult updateHotpatchTaskStatusResult;

    private UpdateMcubeHotpatchTaskStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
        this.updateHotpatchTaskStatusResult = builder.updateHotpatchTaskStatusResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMcubeHotpatchTaskStatusResponseBody create() {
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

    /**
     * @return updateHotpatchTaskStatusResult
     */
    public UpdateHotpatchTaskStatusResult getUpdateHotpatchTaskStatusResult() {
        return this.updateHotpatchTaskStatusResult;
    }

    public static final class Builder {
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 
        private UpdateHotpatchTaskStatusResult updateHotpatchTaskStatusResult; 

        private Builder() {
        } 

        private Builder(UpdateMcubeHotpatchTaskStatusResponseBody model) {
            this.requestId = model.requestId;
            this.resultCode = model.resultCode;
            this.resultMessage = model.resultMessage;
            this.updateHotpatchTaskStatusResult = model.updateHotpatchTaskStatusResult;
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

        /**
         * UpdateHotpatchTaskStatusResult.
         */
        public Builder updateHotpatchTaskStatusResult(UpdateHotpatchTaskStatusResult updateHotpatchTaskStatusResult) {
            this.updateHotpatchTaskStatusResult = updateHotpatchTaskStatusResult;
            return this;
        }

        public UpdateMcubeHotpatchTaskStatusResponseBody build() {
            return new UpdateMcubeHotpatchTaskStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateMcubeHotpatchTaskStatusResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateMcubeHotpatchTaskStatusResponseBody</p>
     */
    public static class UpdateHotpatchTaskStatusResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("ResultMsg")
        private String resultMsg;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private UpdateHotpatchTaskStatusResult(Builder builder) {
            this.errorCode = builder.errorCode;
            this.requestId = builder.requestId;
            this.result = builder.result;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateHotpatchTaskStatusResult create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
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
        public String getResult() {
            return this.result;
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
            private String errorCode; 
            private String requestId; 
            private String result; 
            private String resultMsg; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(UpdateHotpatchTaskStatusResult model) {
                this.errorCode = model.errorCode;
                this.requestId = model.requestId;
                this.result = model.result;
                this.resultMsg = model.resultMsg;
                this.success = model.success;
            } 

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>Id of the request</p>
             * 
             * <strong>example:</strong>
             * <p>DD6844B5-279D-5FFD-BD5A-2E1F9BEC39EE</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
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

            public UpdateHotpatchTaskStatusResult build() {
                return new UpdateHotpatchTaskStatusResult(this);
            } 

        } 

    }
}
