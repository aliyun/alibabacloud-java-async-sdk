// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20180807.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MachineTranslateGeneralResponseBody} extends {@link TeaModel}
 *
 * <p>MachineTranslateGeneralResponseBody</p>
 */
public class MachineTranslateGeneralResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private ResultCode resultCode;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TranslateText")
    private String translateText;

    private MachineTranslateGeneralResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.success = builder.success;
        this.translateText = builder.translateText;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MachineTranslateGeneralResponseBody create() {
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
    public ResultCode getResultCode() {
        return this.resultCode;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return translateText
     */
    public String getTranslateText() {
        return this.translateText;
    }

    public static final class Builder {
        private String requestId; 
        private ResultCode resultCode; 
        private Boolean success; 
        private String translateText; 

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
        public Builder resultCode(ResultCode resultCode) {
            this.resultCode = resultCode;
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
         * TranslateText.
         */
        public Builder translateText(String translateText) {
            this.translateText = translateText;
            return this;
        }

        public MachineTranslateGeneralResponseBody build() {
            return new MachineTranslateGeneralResponseBody(this);
        } 

    } 

    public static class ResultCode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        private ResultCode(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultCode create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private Integer code; 
            private String message; 

            /**
             * Code.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public ResultCode build() {
                return new ResultCode(this);
            } 

        } 

    }
}
