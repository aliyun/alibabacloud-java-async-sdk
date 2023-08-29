// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMcubeVhostResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMcubeVhostResponseBody</p>
 */
public class CreateMcubeVhostResponseBody extends TeaModel {
    @NameInMap("CreateVhostResult")
    private CreateVhostResult createVhostResult;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResultCode")
    private String resultCode;

    @NameInMap("ResultMessage")
    private String resultMessage;

    private CreateMcubeVhostResponseBody(Builder builder) {
        this.createVhostResult = builder.createVhostResult;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMcubeVhostResponseBody create() {
        return builder().build();
    }

    /**
     * @return createVhostResult
     */
    public CreateVhostResult getCreateVhostResult() {
        return this.createVhostResult;
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
        private CreateVhostResult createVhostResult; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 

        /**
         * CreateVhostResult.
         */
        public Builder createVhostResult(CreateVhostResult createVhostResult) {
            this.createVhostResult = createVhostResult;
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

        public CreateMcubeVhostResponseBody build() {
            return new CreateMcubeVhostResponseBody(this);
        } 

    } 

    public static class CreateVhostResult extends TeaModel {
        @NameInMap("Data")
        private String data;

        @NameInMap("ResultMsg")
        private String resultMsg;

        @NameInMap("Success")
        private Boolean success;

        private CreateVhostResult(Builder builder) {
            this.data = builder.data;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateVhostResult create() {
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

            public CreateVhostResult build() {
                return new CreateVhostResult(this);
            } 

        } 

    }
}
