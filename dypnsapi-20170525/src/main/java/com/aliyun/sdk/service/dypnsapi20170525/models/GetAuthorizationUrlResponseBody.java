// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetAuthorizationUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetAuthorizationUrlResponseBody</p>
 */
public class GetAuthorizationUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAuthorizationUrlResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuthorizationUrlResponseBody create() {
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

        public GetAuthorizationUrlResponseBody build() {
            return new GetAuthorizationUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAuthorizationUrlResponseBody} extends {@link TeaModel}
     *
     * <p>GetAuthorizationUrlResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizationUrl")
        private String authorizationUrl;

        private Data(Builder builder) {
            this.authorizationUrl = builder.authorizationUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return authorizationUrl
         */
        public String getAuthorizationUrl() {
            return this.authorizationUrl;
        }

        public static final class Builder {
            private String authorizationUrl; 

            /**
             * <p>The authorization URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://render.****.com/p/s/web-call-minapp/auth-bao?page=commauth/index&token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJiaXpUeXBlIjoiQ29tbUF1dGgiLCJiaXpJZCI6IjVmNWZjNjAzZDQzMTQ0MWZiYTZiNjYzM2QyMjIyNzU0IiwiZXhwIjoxNjA4MTkxODQxfQ.5IvBj2nKgr60APtotaIB13vtPVrdsPQ6avIfWxte1pA&_env=prod">https://render.****.com/p/s/web-call-minapp/auth-bao?page=commauth/index&amp;token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJiaXpUeXBlIjoiQ29tbUF1dGgiLCJiaXpJZCI6IjVmNWZjNjAzZDQzMTQ0MWZiYTZiNjYzM2QyMjIyNzU0IiwiZXhwIjoxNjA4MTkxODQxfQ.5IvBj2nKgr60APtotaIB13vtPVrdsPQ6avIfWxte1pA&amp;_env=prod</a></p>
             */
            public Builder authorizationUrl(String authorizationUrl) {
                this.authorizationUrl = authorizationUrl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
