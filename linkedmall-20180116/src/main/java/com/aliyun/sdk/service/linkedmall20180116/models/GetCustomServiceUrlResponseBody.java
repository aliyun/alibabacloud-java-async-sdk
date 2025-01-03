// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link GetCustomServiceUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetCustomServiceUrlResponseBody</p>
 */
public class GetCustomServiceUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UrlData")
    private UrlData urlData;

    private GetCustomServiceUrlResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.urlData = builder.urlData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomServiceUrlResponseBody create() {
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
     * @return urlData
     */
    public UrlData getUrlData() {
        return this.urlData;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private UrlData urlData; 

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
         * UrlData.
         */
        public Builder urlData(UrlData urlData) {
            this.urlData = urlData;
            return this;
        }

        public GetCustomServiceUrlResponseBody build() {
            return new GetCustomServiceUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCustomServiceUrlResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomServiceUrlResponseBody</p>
     */
    public static class UrlData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReturnUrl")
        private String returnUrl;

        private UrlData(Builder builder) {
            this.returnUrl = builder.returnUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UrlData create() {
            return builder().build();
        }

        /**
         * @return returnUrl
         */
        public String getReturnUrl() {
            return this.returnUrl;
        }

        public static final class Builder {
            private String returnUrl; 

            /**
             * ReturnUrl.
             */
            public Builder returnUrl(String returnUrl) {
                this.returnUrl = returnUrl;
                return this;
            }

            public UrlData build() {
                return new UrlData(this);
            } 

        } 

    }
}
