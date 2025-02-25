// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetPhoneWithTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GetPhoneWithTokenResponseBody</p>
 */
public class GetPhoneWithTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetPhoneWithTokenResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPhoneWithTokenResponseBody create() {
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
         * <p>The response code.</p>
         * <ul>
         * <li>If OK is returned, the request is successful.</li>
         * <li>For more information about other error codes, see <a href="https://help.aliyun.com/document_detail/85198.html">API response codes</a>.</li>
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
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0F335F48-<strong><strong>-</strong></strong>-****-CA7914FE5D77</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPhoneWithTokenResponseBody build() {
            return new GetPhoneWithTokenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPhoneWithTokenResponseBody} extends {@link TeaModel}
     *
     * <p>GetPhoneWithTokenResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Mobile")
        private String mobile;

        private Data(Builder builder) {
            this.mobile = builder.mobile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        public static final class Builder {
            private String mobile; 

            /**
             * <p>The phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>13900001234</p>
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
