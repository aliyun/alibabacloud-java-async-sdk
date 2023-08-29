// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMcubeMiniTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMcubeMiniTaskResponseBody</p>
 */
public class CreateMcubeMiniTaskResponseBody extends TeaModel {
    @NameInMap("CreateMiniTaskResult")
    private CreateMiniTaskResult createMiniTaskResult;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResultCode")
    private String resultCode;

    @NameInMap("ResultMessage")
    private String resultMessage;

    private CreateMcubeMiniTaskResponseBody(Builder builder) {
        this.createMiniTaskResult = builder.createMiniTaskResult;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMcubeMiniTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return createMiniTaskResult
     */
    public CreateMiniTaskResult getCreateMiniTaskResult() {
        return this.createMiniTaskResult;
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
        private CreateMiniTaskResult createMiniTaskResult; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 

        /**
         * CreateMiniTaskResult.
         */
        public Builder createMiniTaskResult(CreateMiniTaskResult createMiniTaskResult) {
            this.createMiniTaskResult = createMiniTaskResult;
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

        public CreateMcubeMiniTaskResponseBody build() {
            return new CreateMcubeMiniTaskResponseBody(this);
        } 

    } 

    public static class CreateMiniTaskResult extends TeaModel {
        @NameInMap("MiniTaskId")
        private String miniTaskId;

        @NameInMap("ResultMsg")
        private String resultMsg;

        @NameInMap("Success")
        private Boolean success;

        private CreateMiniTaskResult(Builder builder) {
            this.miniTaskId = builder.miniTaskId;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateMiniTaskResult create() {
            return builder().build();
        }

        /**
         * @return miniTaskId
         */
        public String getMiniTaskId() {
            return this.miniTaskId;
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
            private String miniTaskId; 
            private String resultMsg; 
            private Boolean success; 

            /**
             * MiniTaskId.
             */
            public Builder miniTaskId(String miniTaskId) {
                this.miniTaskId = miniTaskId;
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

            public CreateMiniTaskResult build() {
                return new CreateMiniTaskResult(this);
            } 

        } 

    }
}
