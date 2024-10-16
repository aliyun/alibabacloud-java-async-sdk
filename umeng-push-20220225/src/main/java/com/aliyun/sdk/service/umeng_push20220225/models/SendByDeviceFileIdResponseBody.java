// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_push20220225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SendByDeviceFileIdResponseBody} extends {@link TeaModel}
 *
 * <p>SendByDeviceFileIdResponseBody</p>
 */
public class SendByDeviceFileIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private SendByDeviceFileIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendByDeviceFileIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SendByDeviceFileIdResponseBody build() {
            return new SendByDeviceFileIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SendByDeviceFileIdResponseBody} extends {@link TeaModel}
     *
     * <p>SendByDeviceFileIdResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MsgId")
        private String msgId;

        private Data(Builder builder) {
            this.msgId = builder.msgId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return msgId
         */
        public String getMsgId() {
            return this.msgId;
        }

        public static final class Builder {
            private String msgId; 

            /**
             * MsgId.
             */
            public Builder msgId(String msgId) {
                this.msgId = msgId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
