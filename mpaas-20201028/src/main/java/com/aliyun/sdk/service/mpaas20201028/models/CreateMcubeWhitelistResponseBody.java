// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMcubeWhitelistResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMcubeWhitelistResponseBody</p>
 */
public class CreateMcubeWhitelistResponseBody extends TeaModel {
    @NameInMap("CreateWhitelistResult")
    private CreateWhitelistResult createWhitelistResult;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResultCode")
    private String resultCode;

    @NameInMap("ResultMessage")
    private String resultMessage;

    private CreateMcubeWhitelistResponseBody(Builder builder) {
        this.createWhitelistResult = builder.createWhitelistResult;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMcubeWhitelistResponseBody create() {
        return builder().build();
    }

    /**
     * @return createWhitelistResult
     */
    public CreateWhitelistResult getCreateWhitelistResult() {
        return this.createWhitelistResult;
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
        private CreateWhitelistResult createWhitelistResult; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 

        /**
         * CreateWhitelistResult.
         */
        public Builder createWhitelistResult(CreateWhitelistResult createWhitelistResult) {
            this.createWhitelistResult = createWhitelistResult;
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

        public CreateMcubeWhitelistResponseBody build() {
            return new CreateMcubeWhitelistResponseBody(this);
        } 

    } 

    public static class CreateWhitelistResult extends TeaModel {
        @NameInMap("ResultMsg")
        private String resultMsg;

        @NameInMap("Success")
        private Boolean success;

        @NameInMap("WhitelistId")
        private String whitelistId;

        private CreateWhitelistResult(Builder builder) {
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
            this.whitelistId = builder.whitelistId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateWhitelistResult create() {
            return builder().build();
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

        /**
         * @return whitelistId
         */
        public String getWhitelistId() {
            return this.whitelistId;
        }

        public static final class Builder {
            private String resultMsg; 
            private Boolean success; 
            private String whitelistId; 

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

            /**
             * WhitelistId.
             */
            public Builder whitelistId(String whitelistId) {
                this.whitelistId = whitelistId;
                return this;
            }

            public CreateWhitelistResult build() {
                return new CreateWhitelistResult(this);
            } 

        } 

    }
}
