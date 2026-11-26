// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link GetMyAgenticNotificationChannelAuthorizeUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetMyAgenticNotificationChannelAuthorizeUrlResponseBody</p>
 */
public class GetMyAgenticNotificationChannelAuthorizeUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetMyAgenticNotificationChannelAuthorizeUrlResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMyAgenticNotificationChannelAuthorizeUrlResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public String getErrorCode() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetMyAgenticNotificationChannelAuthorizeUrlResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The authorization URL information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned when the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>INVALID_PARAMETER</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned when the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>channel must be FEISHU</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0C1CB646-1DE4-4AD0-B4A4-7D47DD52E931</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li>true: The request is successful.</li>
         * <li>false: The request fails.</li>
         * </ul>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetMyAgenticNotificationChannelAuthorizeUrlResponseBody build() {
            return new GetMyAgenticNotificationChannelAuthorizeUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMyAgenticNotificationChannelAuthorizeUrlResponseBody} extends {@link TeaModel}
     *
     * <p>GetMyAgenticNotificationChannelAuthorizeUrlResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizeUrl")
        private String authorizeUrl;

        @com.aliyun.core.annotation.NameInMap("RedirectUri")
        private String redirectUri;

        private Data(Builder builder) {
            this.authorizeUrl = builder.authorizeUrl;
            this.redirectUri = builder.redirectUri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return authorizeUrl
         */
        public String getAuthorizeUrl() {
            return this.authorizeUrl;
        }

        /**
         * @return redirectUri
         */
        public String getRedirectUri() {
            return this.redirectUri;
        }

        public static final class Builder {
            private String authorizeUrl; 
            private String redirectUri; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.authorizeUrl = model.authorizeUrl;
                this.redirectUri = model.redirectUri;
            } 

            /**
             * <p>The URL of the Lark OAuth authorization page. After the user opens the URL in a browser and completes the authorization, the system binds the Lark account as the notification identity for the current user, and the channel switch remains unchanged. The state parameter in the URL is valid for 180 seconds and can be used only once.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://open.feishu.cn/open-apis/authen/v1/authorize?app_id=cli_a5f8e2d9c3b1****&redirect_uri=https%3A%2F%2Faig-dms-cn-hangzhou.aliyuncs.com%2Foauth%2Fmobile%2Ffeishu%2Fbind&state=eyJhbGciOiJIUzI1NiJ9">https://open.feishu.cn/open-apis/authen/v1/authorize?app_id=cli_a5f8e2d9c3b1****&amp;redirect_uri=https%3A%2F%2Faig-dms-cn-hangzhou.aliyuncs.com%2Foauth%2Fmobile%2Ffeishu%2Fbind&amp;state=eyJhbGciOiJIUzI1NiJ9</a>****</p>
             */
            public Builder authorizeUrl(String authorizeUrl) {
                this.authorizeUrl = authorizeUrl;
                return this;
            }

            /**
             * <p>The callback URL after the authorization is completed. You must add this URL to the redirect URL whitelist of the tenant&quot;s Lark application. Otherwise, the authorization fails.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://aig-dms-cn-hangzhou.aliyuncs.com/oauth/mobile/feishu/bind">https://aig-dms-cn-hangzhou.aliyuncs.com/oauth/mobile/feishu/bind</a></p>
             */
            public Builder redirectUri(String redirectUri) {
                this.redirectUri = redirectUri;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
