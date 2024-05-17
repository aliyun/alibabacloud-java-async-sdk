// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMcubeWhitelistForIdeResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMcubeWhitelistForIdeResponseBody</p>
 */
public class CreateMcubeWhitelistForIdeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateWhitelistForIdeResult")
    private CreateWhitelistForIdeResult createWhitelistForIdeResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    private CreateMcubeWhitelistForIdeResponseBody(Builder builder) {
        this.createWhitelistForIdeResult = builder.createWhitelistForIdeResult;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMcubeWhitelistForIdeResponseBody create() {
        return builder().build();
    }

    /**
     * @return createWhitelistForIdeResult
     */
    public CreateWhitelistForIdeResult getCreateWhitelistForIdeResult() {
        return this.createWhitelistForIdeResult;
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
        private CreateWhitelistForIdeResult createWhitelistForIdeResult; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 

        /**
         * CreateWhitelistForIdeResult.
         */
        public Builder createWhitelistForIdeResult(CreateWhitelistForIdeResult createWhitelistForIdeResult) {
            this.createWhitelistForIdeResult = createWhitelistForIdeResult;
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

        public CreateMcubeWhitelistForIdeResponseBody build() {
            return new CreateMcubeWhitelistForIdeResponseBody(this);
        } 

    } 

    public static class CreateWhitelistForIdeResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResultMsg")
        private String resultMsg;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("WhitelistId")
        private String whitelistId;

        private CreateWhitelistForIdeResult(Builder builder) {
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
            this.whitelistId = builder.whitelistId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateWhitelistForIdeResult create() {
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

            public CreateWhitelistForIdeResult build() {
                return new CreateWhitelistForIdeResult(this);
            } 

        } 

    }
}
