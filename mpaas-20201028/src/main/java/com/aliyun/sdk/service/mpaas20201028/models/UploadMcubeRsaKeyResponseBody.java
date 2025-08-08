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
 * {@link UploadMcubeRsaKeyResponseBody} extends {@link TeaModel}
 *
 * <p>UploadMcubeRsaKeyResponseBody</p>
 */
public class UploadMcubeRsaKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    @com.aliyun.core.annotation.NameInMap("UploadRsaResult")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(UploadMcubeRsaKeyResponseBody model) {
            this.requestId = model.requestId;
            this.resultCode = model.resultCode;
            this.resultMessage = model.resultMessage;
            this.uploadRsaResult = model.uploadRsaResult;
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

    /**
     * 
     * {@link UploadMcubeRsaKeyResponseBody} extends {@link TeaModel}
     *
     * <p>UploadMcubeRsaKeyResponseBody</p>
     */
    public static class UploadRsaResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private String data;

        @com.aliyun.core.annotation.NameInMap("ResultMsg")
        private String resultMsg;

        @com.aliyun.core.annotation.NameInMap("Success")
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

            private Builder() {
            } 

            private Builder(UploadRsaResult model) {
                this.data = model.data;
                this.resultMsg = model.resultMsg;
                this.success = model.success;
            } 

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
