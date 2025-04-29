// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

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
 * {@link DescribeEmptyNumberResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEmptyNumberResponseBody</p>
 */
public class DescribeEmptyNumberResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeEmptyNumberResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The HTTP status code. Valid values:</p>
         * <ul>
         * <li><strong>OK</strong>: The request is successful.</li>
         * <li><strong>InvalidPhoneNumber.Check</strong>: The phone number is invalid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique request ID. It is a common parameter and can be used to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>CC3BB6D2-2FDF-4321-9DCE-B38165CE4C47</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEmptyNumberResponseBody build() {
            return new DescribeEmptyNumberResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEmptyNumberResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEmptyNumberResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Number")
        private String number;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.number = model.number;
                this.status = model.status;
            } 

            /**
             * <p>The specified phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>189****1234</p>
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * <p>The returned status for the queried phone number. Valid values:</p>
             * <ul>
             * <li><strong>EMPTY</strong>: The queried phone number is a nonexistent number.</li>
             * <li><strong>NORMAL</strong>: The queried phone number is valid.</li>
             * <li><strong>SUSPECT_EMPTY</strong>: The queried phone number is suspected to be a nonexistent number.</li>
             * <li><strong>UNKNOWN</strong>: The queried phone number is unknown.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EMPTY</p>
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
