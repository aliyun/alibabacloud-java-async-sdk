// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20200618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendSmsResponseBody} extends {@link TeaModel}
 *
 * <p>SendSmsResponseBody</p>
 */
public class SendSmsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResultObject")
    private ResultObject resultObject;

    private SendSmsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendSmsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private ResultObject resultObject; 

        /**
         * Code.
         */
        public Builder code(String code) {
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

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultObject.
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public SendSmsResponseBody build() {
            return new SendSmsResponseBody(this);
        } 

    } 

    public static class ResultObject extends TeaModel {
        @NameInMap("BizId")
        private String bizId;

        private ResultObject(Builder builder) {
            this.bizId = builder.bizId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        public static final class Builder {
            private String bizId; 

            /**
             * BizId.
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
