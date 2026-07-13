// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentteams20260605.models;

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
 * {@link GetIdentityProviderResponseBody} extends {@link TeaModel}
 *
 * <p>GetIdentityProviderResponseBody</p>
 */
public class GetIdentityProviderResponseBody extends TeaModel {
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

    private GetIdentityProviderResponseBody(Builder builder) {
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

    public static GetIdentityProviderResponseBody create() {
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

        private Builder() {
        } 

        private Builder(GetIdentityProviderResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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

        public GetIdentityProviderResponseBody build() {
            return new GetIdentityProviderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventSubscriptionCallbackUrl")
        private String eventSubscriptionCallbackUrl;

        @com.aliyun.core.annotation.NameInMap("IdentityProviderType")
        private String identityProviderType;

        @com.aliyun.core.annotation.NameInMap("IdpMetadata")
        private java.util.Map<String, String> idpMetadata;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LoginCallbackUrl")
        private String loginCallbackUrl;

        @com.aliyun.core.annotation.NameInMap("LoginEnabled")
        private Boolean loginEnabled;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SyncEnabled")
        private Boolean syncEnabled;

        private Data(Builder builder) {
            this.eventSubscriptionCallbackUrl = builder.eventSubscriptionCallbackUrl;
            this.identityProviderType = builder.identityProviderType;
            this.idpMetadata = builder.idpMetadata;
            this.instanceId = builder.instanceId;
            this.loginCallbackUrl = builder.loginCallbackUrl;
            this.loginEnabled = builder.loginEnabled;
            this.status = builder.status;
            this.syncEnabled = builder.syncEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return eventSubscriptionCallbackUrl
         */
        public String getEventSubscriptionCallbackUrl() {
            return this.eventSubscriptionCallbackUrl;
        }

        /**
         * @return identityProviderType
         */
        public String getIdentityProviderType() {
            return this.identityProviderType;
        }

        /**
         * @return idpMetadata
         */
        public java.util.Map<String, String> getIdpMetadata() {
            return this.idpMetadata;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return loginCallbackUrl
         */
        public String getLoginCallbackUrl() {
            return this.loginCallbackUrl;
        }

        /**
         * @return loginEnabled
         */
        public Boolean getLoginEnabled() {
            return this.loginEnabled;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return syncEnabled
         */
        public Boolean getSyncEnabled() {
            return this.syncEnabled;
        }

        public static final class Builder {
            private String eventSubscriptionCallbackUrl; 
            private String identityProviderType; 
            private java.util.Map<String, String> idpMetadata; 
            private String instanceId; 
            private String loginCallbackUrl; 
            private Boolean loginEnabled; 
            private String status; 
            private Boolean syncEnabled; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.eventSubscriptionCallbackUrl = model.eventSubscriptionCallbackUrl;
                this.identityProviderType = model.identityProviderType;
                this.idpMetadata = model.idpMetadata;
                this.instanceId = model.instanceId;
                this.loginCallbackUrl = model.loginCallbackUrl;
                this.loginEnabled = model.loginEnabled;
                this.status = model.status;
                this.syncEnabled = model.syncEnabled;
            } 

            /**
             * EventSubscriptionCallbackUrl.
             */
            public Builder eventSubscriptionCallbackUrl(String eventSubscriptionCallbackUrl) {
                this.eventSubscriptionCallbackUrl = eventSubscriptionCallbackUrl;
                return this;
            }

            /**
             * IdentityProviderType.
             */
            public Builder identityProviderType(String identityProviderType) {
                this.identityProviderType = identityProviderType;
                return this;
            }

            /**
             * IdpMetadata.
             */
            public Builder idpMetadata(java.util.Map<String, String> idpMetadata) {
                this.idpMetadata = idpMetadata;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * LoginCallbackUrl.
             */
            public Builder loginCallbackUrl(String loginCallbackUrl) {
                this.loginCallbackUrl = loginCallbackUrl;
                return this;
            }

            /**
             * LoginEnabled.
             */
            public Builder loginEnabled(Boolean loginEnabled) {
                this.loginEnabled = loginEnabled;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SyncEnabled.
             */
            public Builder syncEnabled(Boolean syncEnabled) {
                this.syncEnabled = syncEnabled;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
