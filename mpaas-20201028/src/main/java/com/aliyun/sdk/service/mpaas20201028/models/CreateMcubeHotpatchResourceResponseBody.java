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
 * {@link CreateMcubeHotpatchResourceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMcubeHotpatchResourceResponseBody</p>
 */
public class CreateMcubeHotpatchResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateHotpatchResourceResult")
    private CreateHotpatchResourceResult createHotpatchResourceResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    private CreateMcubeHotpatchResourceResponseBody(Builder builder) {
        this.createHotpatchResourceResult = builder.createHotpatchResourceResult;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMcubeHotpatchResourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createHotpatchResourceResult
     */
    public CreateHotpatchResourceResult getCreateHotpatchResourceResult() {
        return this.createHotpatchResourceResult;
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
        private CreateHotpatchResourceResult createHotpatchResourceResult; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 

        private Builder() {
        } 

        private Builder(CreateMcubeHotpatchResourceResponseBody model) {
            this.createHotpatchResourceResult = model.createHotpatchResourceResult;
            this.requestId = model.requestId;
            this.resultCode = model.resultCode;
            this.resultMessage = model.resultMessage;
        } 

        /**
         * CreateHotpatchResourceResult.
         */
        public Builder createHotpatchResourceResult(CreateHotpatchResourceResult createHotpatchResourceResult) {
            this.createHotpatchResourceResult = createHotpatchResourceResult;
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

        public CreateMcubeHotpatchResourceResponseBody build() {
            return new CreateMcubeHotpatchResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateMcubeHotpatchResourceResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMcubeHotpatchResourceResponseBody</p>
     */
    public static class CreateHotpatchResourceResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("HotpatchResourceId")
        private String hotpatchResourceId;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("ResultMsg")
        private String resultMsg;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private CreateHotpatchResourceResult(Builder builder) {
            this.errorCode = builder.errorCode;
            this.hotpatchResourceId = builder.hotpatchResourceId;
            this.requestId = builder.requestId;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateHotpatchResourceResult create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return hotpatchResourceId
         */
        public String getHotpatchResourceId() {
            return this.hotpatchResourceId;
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
            private String hotpatchResourceId; 
            private String requestId; 
            private String resultMsg; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(CreateHotpatchResourceResult model) {
                this.errorCode = model.errorCode;
                this.hotpatchResourceId = model.hotpatchResourceId;
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
             * HotpatchResourceId.
             */
            public Builder hotpatchResourceId(String hotpatchResourceId) {
                this.hotpatchResourceId = hotpatchResourceId;
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

            public CreateHotpatchResourceResult build() {
                return new CreateHotpatchResourceResult(this);
            } 

        } 

    }
}
