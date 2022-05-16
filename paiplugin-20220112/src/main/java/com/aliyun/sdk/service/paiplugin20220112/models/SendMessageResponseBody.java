// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendMessageResponseBody} extends {@link TeaModel}
 *
 * <p>SendMessageResponseBody</p>
 */
public class SendMessageResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private Integer errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    private SendMessageResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendMessageResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private Integer errorCode; 
        private String errorMessage; 
        private String requestId; 

        /**
         * 返回数据。
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 错误码。
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * 错误信息。
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SendMessageResponseBody build() {
            return new SendMessageResponseBody(this);
        } 

    } 

    public static class Messages extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("PhoneNumber")
        private String phoneNumber;

        private Messages(Builder builder) {
            this.id = builder.id;
            this.phoneNumber = builder.phoneNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public static final class Builder {
            private String id; 
            private String phoneNumber; 

            /**
             * 短信Id，可使用ListMessages查询短信状态。
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * 手机号码。
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Messages")
        private java.util.List < Messages> messages;

        @NameInMap("RequestId")
        private String requestId;

        private Data(Builder builder) {
            this.messages = builder.messages;
            this.requestId = builder.requestId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return messages
         */
        public java.util.List < Messages> getMessages() {
            return this.messages;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        public static final class Builder {
            private java.util.List < Messages> messages; 
            private String requestId; 

            /**
             * 短信结果列表，列表中手机号的顺序与输入请求手机号顺序一一对应。
             */
            public Builder messages(java.util.List < Messages> messages) {
                this.messages = messages;
                return this;
            }

            /**
             * 短信批处理Id，可使用ListMessages查询短信状态。
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
