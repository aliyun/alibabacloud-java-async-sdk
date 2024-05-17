// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMcubeNebulaResourceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMcubeNebulaResourceResponseBody</p>
 */
public class CreateMcubeNebulaResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateMcubeNebulaResourceReslult")
    private CreateMcubeNebulaResourceReslult createMcubeNebulaResourceReslult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    private CreateMcubeNebulaResourceResponseBody(Builder builder) {
        this.createMcubeNebulaResourceReslult = builder.createMcubeNebulaResourceReslult;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMcubeNebulaResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return createMcubeNebulaResourceReslult
     */
    public CreateMcubeNebulaResourceReslult getCreateMcubeNebulaResourceReslult() {
        return this.createMcubeNebulaResourceReslult;
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
        private CreateMcubeNebulaResourceReslult createMcubeNebulaResourceReslult; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 

        /**
         * CreateMcubeNebulaResourceReslult.
         */
        public Builder createMcubeNebulaResourceReslult(CreateMcubeNebulaResourceReslult createMcubeNebulaResourceReslult) {
            this.createMcubeNebulaResourceReslult = createMcubeNebulaResourceReslult;
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

        public CreateMcubeNebulaResourceResponseBody build() {
            return new CreateMcubeNebulaResourceResponseBody(this);
        } 

    } 

    public static class CreateMcubeNebulaResourceReslult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("NebulaResourceId")
        private String nebulaResourceId;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("ResultMsg")
        private String resultMsg;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private CreateMcubeNebulaResourceReslult(Builder builder) {
            this.errorCode = builder.errorCode;
            this.nebulaResourceId = builder.nebulaResourceId;
            this.requestId = builder.requestId;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateMcubeNebulaResourceReslult create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return nebulaResourceId
         */
        public String getNebulaResourceId() {
            return this.nebulaResourceId;
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
            private String nebulaResourceId; 
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
             * NebulaResourceId.
             */
            public Builder nebulaResourceId(String nebulaResourceId) {
                this.nebulaResourceId = nebulaResourceId;
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

            public CreateMcubeNebulaResourceReslult build() {
                return new CreateMcubeNebulaResourceReslult(this);
            } 

        } 

    }
}
