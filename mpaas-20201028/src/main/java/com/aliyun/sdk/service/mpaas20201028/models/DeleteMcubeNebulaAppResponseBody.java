// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMcubeNebulaAppResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteMcubeNebulaAppResponseBody</p>
 */
public class DeleteMcubeNebulaAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeleteMcubeNebulaAppResult")
    private DeleteMcubeNebulaAppResult deleteMcubeNebulaAppResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    private DeleteMcubeNebulaAppResponseBody(Builder builder) {
        this.deleteMcubeNebulaAppResult = builder.deleteMcubeNebulaAppResult;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMcubeNebulaAppResponseBody create() {
        return builder().build();
    }

    /**
     * @return deleteMcubeNebulaAppResult
     */
    public DeleteMcubeNebulaAppResult getDeleteMcubeNebulaAppResult() {
        return this.deleteMcubeNebulaAppResult;
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
        private DeleteMcubeNebulaAppResult deleteMcubeNebulaAppResult; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 

        /**
         * DeleteMcubeNebulaAppResult.
         */
        public Builder deleteMcubeNebulaAppResult(DeleteMcubeNebulaAppResult deleteMcubeNebulaAppResult) {
            this.deleteMcubeNebulaAppResult = deleteMcubeNebulaAppResult;
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

        public DeleteMcubeNebulaAppResponseBody build() {
            return new DeleteMcubeNebulaAppResponseBody(this);
        } 

    } 

    public static class DeleteMcubeNebulaAppResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("ResultMsg")
        private String resultMsg;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private DeleteMcubeNebulaAppResult(Builder builder) {
            this.errorCode = builder.errorCode;
            this.requestId = builder.requestId;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeleteMcubeNebulaAppResult create() {
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

            public DeleteMcubeNebulaAppResult build() {
                return new DeleteMcubeNebulaAppResult(this);
            } 

        } 

    }
}
