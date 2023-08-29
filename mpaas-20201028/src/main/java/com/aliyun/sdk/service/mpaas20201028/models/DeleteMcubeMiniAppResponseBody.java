// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMcubeMiniAppResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteMcubeMiniAppResponseBody</p>
 */
public class DeleteMcubeMiniAppResponseBody extends TeaModel {
    @NameInMap("DeleteMiniResult")
    private DeleteMiniResult deleteMiniResult;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResultCode")
    private String resultCode;

    @NameInMap("ResultMessage")
    private String resultMessage;

    private DeleteMcubeMiniAppResponseBody(Builder builder) {
        this.deleteMiniResult = builder.deleteMiniResult;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMcubeMiniAppResponseBody create() {
        return builder().build();
    }

    /**
     * @return deleteMiniResult
     */
    public DeleteMiniResult getDeleteMiniResult() {
        return this.deleteMiniResult;
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
        private DeleteMiniResult deleteMiniResult; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 

        /**
         * DeleteMiniResult.
         */
        public Builder deleteMiniResult(DeleteMiniResult deleteMiniResult) {
            this.deleteMiniResult = deleteMiniResult;
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

        public DeleteMcubeMiniAppResponseBody build() {
            return new DeleteMcubeMiniAppResponseBody(this);
        } 

    } 

    public static class DeleteMiniResult extends TeaModel {
        @NameInMap("Data")
        private String data;

        @NameInMap("ResultMsg")
        private String resultMsg;

        @NameInMap("Success")
        private Boolean success;

        private DeleteMiniResult(Builder builder) {
            this.data = builder.data;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeleteMiniResult create() {
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

            public DeleteMiniResult build() {
                return new DeleteMiniResult(this);
            } 

        } 

    }
}
