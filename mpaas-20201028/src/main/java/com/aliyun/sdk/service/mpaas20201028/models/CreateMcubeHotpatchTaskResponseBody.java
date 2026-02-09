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
 * {@link CreateMcubeHotpatchTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMcubeHotpatchTaskResponseBody</p>
 */
public class CreateMcubeHotpatchTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateHotpatchTaskResult")
    private CreateHotpatchTaskResult createHotpatchTaskResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    private CreateMcubeHotpatchTaskResponseBody(Builder builder) {
        this.createHotpatchTaskResult = builder.createHotpatchTaskResult;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMcubeHotpatchTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createHotpatchTaskResult
     */
    public CreateHotpatchTaskResult getCreateHotpatchTaskResult() {
        return this.createHotpatchTaskResult;
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
        private CreateHotpatchTaskResult createHotpatchTaskResult; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 

        private Builder() {
        } 

        private Builder(CreateMcubeHotpatchTaskResponseBody model) {
            this.createHotpatchTaskResult = model.createHotpatchTaskResult;
            this.requestId = model.requestId;
            this.resultCode = model.resultCode;
            this.resultMessage = model.resultMessage;
        } 

        /**
         * CreateHotpatchTaskResult.
         */
        public Builder createHotpatchTaskResult(CreateHotpatchTaskResult createHotpatchTaskResult) {
            this.createHotpatchTaskResult = createHotpatchTaskResult;
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

        public CreateMcubeHotpatchTaskResponseBody build() {
            return new CreateMcubeHotpatchTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateMcubeHotpatchTaskResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcubeHotpatchTaskResponseBody</p>
     */
    public static class CreateHotpatchTaskResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("HotpatchTaskId")
        private String hotpatchTaskId;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("ResultMsg")
        private String resultMsg;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private CreateHotpatchTaskResult(Builder builder) {
            this.errorCode = builder.errorCode;
            this.hotpatchTaskId = builder.hotpatchTaskId;
            this.requestId = builder.requestId;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateHotpatchTaskResult create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return hotpatchTaskId
         */
        public String getHotpatchTaskId() {
            return this.hotpatchTaskId;
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
            private String hotpatchTaskId; 
            private String requestId; 
            private String resultMsg; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(CreateHotpatchTaskResult model) {
                this.errorCode = model.errorCode;
                this.hotpatchTaskId = model.hotpatchTaskId;
                this.requestId = model.requestId;
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
             * HotpatchTaskId.
             */
            public Builder hotpatchTaskId(String hotpatchTaskId) {
                this.hotpatchTaskId = hotpatchTaskId;
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

            public CreateHotpatchTaskResult build() {
                return new CreateHotpatchTaskResult(this);
            } 

        } 

    }
}
