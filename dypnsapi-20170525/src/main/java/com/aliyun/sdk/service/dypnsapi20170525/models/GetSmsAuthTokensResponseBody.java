// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSmsAuthTokensResponseBody} extends {@link TeaModel}
 *
 * <p>GetSmsAuthTokensResponseBody</p>
 */
public class GetSmsAuthTokensResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetSmsAuthTokensResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSmsAuthTokensResponseBody create() {
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
         * <p>8906582E-6722</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSmsAuthTokensResponseBody build() {
            return new GetSmsAuthTokensResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSmsAuthTokensResponseBody} extends {@link TeaModel}
     *
     * <p>GetSmsAuthTokensResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizToken")
        private String bizToken;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("StsAccessKeyId")
        private String stsAccessKeyId;

        @com.aliyun.core.annotation.NameInMap("StsAccessKeySecret")
        private String stsAccessKeySecret;

        @com.aliyun.core.annotation.NameInMap("StsToken")
        private String stsToken;

        private Data(Builder builder) {
            this.bizToken = builder.bizToken;
            this.expireTime = builder.expireTime;
            this.stsAccessKeyId = builder.stsAccessKeyId;
            this.stsAccessKeySecret = builder.stsAccessKeySecret;
            this.stsToken = builder.stsToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bizToken
         */
        public String getBizToken() {
            return this.bizToken;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return stsAccessKeyId
         */
        public String getStsAccessKeyId() {
            return this.stsAccessKeyId;
        }

        /**
         * @return stsAccessKeySecret
         */
        public String getStsAccessKeySecret() {
            return this.stsAccessKeySecret;
        }

        /**
         * @return stsToken
         */
        public String getStsToken() {
            return this.stsToken;
        }

        public static final class Builder {
            private String bizToken; 
            private Long expireTime; 
            private String stsAccessKeyId; 
            private String stsAccessKeySecret; 
            private String stsToken; 

            /**
             * <p>The business token.</p>
             * 
             * <strong>example:</strong>
             * <p>FZSMeRbLCiapIBo65NXNHvGbkGDmhs23XWTZDOtZN0g5n/kqSc2FU27Gc9YhGb6dNn9/L9ZXSYiIB6C6LMLQJjyXjRzt5v6pzZXqnjO4cSuPWYUxJvdc8l8OpucEYe8Mx17HxsHDzj0VC4D5+atcrTpJE6jQ7e2QVNjZIPMwsfxELjQS7c****</p>
             */
            public Builder bizToken(String bizToken) {
                this.bizToken = bizToken;
                return this;
            }

            /**
             * <p>The time when the token expired. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1631526326000</p>
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The AccessKey ID.</p>
             * 
             * <strong>example:</strong>
             * <p>STS.NSqC****</p>
             */
            public Builder stsAccessKeyId(String stsAccessKeyId) {
                this.stsAccessKeyId = stsAccessKeyId;
                return this;
            }

            /**
             * <p>The AccessKey secret.</p>
             * 
             * <strong>example:</strong>
             * <p>VboZ4xbZ****</p>
             */
            public Builder stsAccessKeySecret(String stsAccessKeySecret) {
                this.stsAccessKeySecret = stsAccessKeySecret;
                return this;
            }

            /**
             * <p>The security token.</p>
             * 
             * <strong>example:</strong>
             * <p>CAISiQJ1q6Ft5B2yfSjIr5DEDP/BurtW9PemMEfBrEpsOr5K17XjuDz2IHtLfXFsBusYt/U2nWpX5v4clrxIToR7SFbFY9pb6ZhazBisebDGv8HtR3TcFEjiSwapEBfe8JL4QYeQFaHwGJqEb1TDiVUAo9/TfimjWFqIKICAjYUdAP0cQgi/a0gtZr4UXHwAzvUXLnzML/2gHwf3i27LdipStxF7lHl05NbUoKTeyGKH3AGqlLVF9tite8f9NpczBvolDYfpht4RX7HazStd5yJN8KpLl6Fe8V/FxIrGXAAJv0rdbbOFq4Q1c18hOLJHAKtfsvXmlPNpsevfmpnsx****</p>
             */
            public Builder stsToken(String stsToken) {
                this.stsToken = stsToken;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
