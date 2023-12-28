// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEmptyNumberResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEmptyNumberResponseBody</p>
 */
public class DescribeEmptyNumberResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeEmptyNumberResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEmptyNumberResponseBody create() {
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * The HTTP status code. Valid values:
         * <p>
         * 
         * *   **OK**: The request is successful.
         * *   **InvalidPhoneNumber.Check**: The phone number is invalid.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The response parameters.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * The unique request ID. It is a common parameter and can be used to troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEmptyNumberResponseBody build() {
            return new DescribeEmptyNumberResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Number")
        private String number;

        @NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.number = builder.number;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return number
         */
        public String getNumber() {
            return this.number;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String number; 
            private String status; 

            /**
             * The specified phone number.
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * The returned status for the queried phone number. Valid values:
             * <p>
             * 
             * *   **EMPTY**: The queried phone number is a nonexistent number.
             * *   **NORMAL**: The queried phone number is valid.
             * *   **SUSPECT_EMPTY**: The queried phone number is suspected to be a nonexistent number.
             * *   **UNKNOWN**: The queried phone number is unknown.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
