// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadMcubeRsaKeyResponseBody} extends {@link TeaModel}
 *
 * <p>UploadMcubeRsaKeyResponseBody</p>
 */
public class UploadMcubeRsaKeyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResultCode")
    private String resultCode;

    @NameInMap("ResultMessage")
    private String resultMessage;

    @NameInMap("UploadRsaResult")
    private UploadRsaResult uploadRsaResult;

    private UploadMcubeRsaKeyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
        this.uploadRsaResult = builder.uploadRsaResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadMcubeRsaKeyResponseBody create() {
        return builder().build();
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

    /**
     * @return uploadRsaResult
     */
    public UploadRsaResult getUploadRsaResult() {
        return this.uploadRsaResult;
    }

    public static final class Builder {
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 
        private UploadRsaResult uploadRsaResult; 

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

        /**
         * UploadRsaResult.
         */
        public Builder uploadRsaResult(UploadRsaResult uploadRsaResult) {
            this.uploadRsaResult = uploadRsaResult;
            return this;
        }

        public UploadMcubeRsaKeyResponseBody build() {
            return new UploadMcubeRsaKeyResponseBody(this);
        } 

    } 

    public static class UploadRsaResult extends TeaModel {
        @NameInMap("Data")
        private String data;

        @NameInMap("ResultMsg")
        private String resultMsg;

        @NameInMap("Success")
        private Boolean success;

        private UploadRsaResult(Builder builder) {
            this.data = builder.data;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UploadRsaResult create() {
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

            public UploadRsaResult build() {
                return new UploadRsaResult(this);
            } 

        } 

    }
}
