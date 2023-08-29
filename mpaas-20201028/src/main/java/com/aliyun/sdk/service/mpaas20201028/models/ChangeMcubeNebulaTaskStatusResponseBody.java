// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeMcubeNebulaTaskStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ChangeMcubeNebulaTaskStatusResponseBody</p>
 */
public class ChangeMcubeNebulaTaskStatusResponseBody extends TeaModel {
    @NameInMap("ChangeMcubeNebulaTaskStatusResult")
    private ChangeMcubeNebulaTaskStatusResult changeMcubeNebulaTaskStatusResult;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResultCode")
    private String resultCode;

    @NameInMap("ResultMessage")
    private String resultMessage;

    private ChangeMcubeNebulaTaskStatusResponseBody(Builder builder) {
        this.changeMcubeNebulaTaskStatusResult = builder.changeMcubeNebulaTaskStatusResult;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeMcubeNebulaTaskStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return changeMcubeNebulaTaskStatusResult
     */
    public ChangeMcubeNebulaTaskStatusResult getChangeMcubeNebulaTaskStatusResult() {
        return this.changeMcubeNebulaTaskStatusResult;
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
        private ChangeMcubeNebulaTaskStatusResult changeMcubeNebulaTaskStatusResult; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 

        /**
         * ChangeMcubeNebulaTaskStatusResult.
         */
        public Builder changeMcubeNebulaTaskStatusResult(ChangeMcubeNebulaTaskStatusResult changeMcubeNebulaTaskStatusResult) {
            this.changeMcubeNebulaTaskStatusResult = changeMcubeNebulaTaskStatusResult;
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

        public ChangeMcubeNebulaTaskStatusResponseBody build() {
            return new ChangeMcubeNebulaTaskStatusResponseBody(this);
        } 

    } 

    public static class ChangeMcubeNebulaTaskStatusResult extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("RequestId")
        private String requestId;

        @NameInMap("ResultMsg")
        private String resultMsg;

        @NameInMap("Success")
        private Boolean success;

        private ChangeMcubeNebulaTaskStatusResult(Builder builder) {
            this.errorCode = builder.errorCode;
            this.requestId = builder.requestId;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeMcubeNebulaTaskStatusResult create() {
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
            private String resultMsg; 
            private Boolean success; 

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
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

            public ChangeMcubeNebulaTaskStatusResult build() {
                return new ChangeMcubeNebulaTaskStatusResult(this);
            } 

        } 

    }
}
