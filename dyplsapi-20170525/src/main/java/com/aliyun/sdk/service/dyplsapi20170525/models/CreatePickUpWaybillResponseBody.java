// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePickUpWaybillResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePickUpWaybillResponseBody</p>
 */
public class CreatePickUpWaybillResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreatePickUpWaybillResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePickUpWaybillResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePickUpWaybillResponseBody build() {
            return new CreatePickUpWaybillResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CpCode")
        private String cpCode;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("GotCode")
        private String gotCode;

        @com.aliyun.core.annotation.NameInMap("MailNo")
        private String mailNo;

        @com.aliyun.core.annotation.NameInMap("Success")
        private String success;

        private Data(Builder builder) {
            this.cpCode = builder.cpCode;
            this.errorCode = builder.errorCode;
            this.errorMsg = builder.errorMsg;
            this.gotCode = builder.gotCode;
            this.mailNo = builder.mailNo;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cpCode
         */
        public String getCpCode() {
            return this.cpCode;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return gotCode
         */
        public String getGotCode() {
            return this.gotCode;
        }

        /**
         * @return mailNo
         */
        public String getMailNo() {
            return this.mailNo;
        }

        /**
         * @return success
         */
        public String getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String cpCode; 
            private String errorCode; 
            private String errorMsg; 
            private String gotCode; 
            private String mailNo; 
            private String success; 

            /**
             * The code of the courier company.
             */
            public Builder cpCode(String cpCode) {
                this.cpCode = cpCode;
                return this;
            }

            /**
             * The error code.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The error message.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * The pickup code.
             */
            public Builder gotCode(String gotCode) {
                this.gotCode = gotCode;
                return this;
            }

            /**
             * The order ID.
             */
            public Builder mailNo(String mailNo) {
                this.mailNo = mailNo;
                return this;
            }

            /**
             * Indicates whether the request was successful.
             */
            public Builder success(String success) {
                this.success = success;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
