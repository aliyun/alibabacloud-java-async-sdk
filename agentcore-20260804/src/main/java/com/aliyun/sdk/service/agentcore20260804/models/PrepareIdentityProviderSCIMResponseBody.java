// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link PrepareIdentityProviderSCIMResponseBody} extends {@link TeaModel}
 *
 * <p>PrepareIdentityProviderSCIMResponseBody</p>
 */
public class PrepareIdentityProviderSCIMResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private PrepareIdentityProviderSCIMResponseBody(Builder builder) {
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

    public static PrepareIdentityProviderSCIMResponseBody create() {
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

        private Builder(PrepareIdentityProviderSCIMResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business result code. If the request fails, handle the error based on the HTTP status code and the message.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The operation result. For the result structure, see the response fields of this API operation. For asynchronous write API operations, the response indicates that the request is accepted and does not guarantee that the background task is completed.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code of the current request. This code indicates the processing status of the request and is not equivalent to the final result of the background task.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The result message, which indicates that the request is accepted or contains an error message. For asynchronous tasks, check the task result by calling the corresponding query API operation.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID. It is used to associate the current call with troubleshooting. Retain this ID if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>request-example</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the current request is successful. A value of true indicates that the request is processed successfully. For asynchronous write operations, you must continue to query the task result.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public PrepareIdentityProviderSCIMResponseBody build() {
            return new PrepareIdentityProviderSCIMResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PrepareIdentityProviderSCIMResponseBody} extends {@link TeaModel}
     *
     * <p>PrepareIdentityProviderSCIMResponseBody</p>
     */
    public static class Configuration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("baseUrl")
        private String baseUrl;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Configuration(Builder builder) {
            this.baseUrl = builder.baseUrl;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configuration create() {
            return builder().build();
        }

        /**
         * @return baseUrl
         */
        public String getBaseUrl() {
            return this.baseUrl;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String baseUrl; 
            private String status; 

            private Builder() {
            } 

            private Builder(Configuration model) {
                this.baseUrl = model.baseUrl;
                this.status = model.status;
            } 

            /**
             * <p>The URL configured for the external provisioning system. The presence of a URL does not indicate that the external configuration is completed or that AC synchronization is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/scim/v2">https://example.com/scim/v2</a></p>
             */
            public Builder baseUrl(String baseUrl) {
                this.baseUrl = baseUrl;
                return this;
            }

            /**
             * <p>The AgentIdentity receiving status. Enabled indicates that SCIM receiving is enabled, and Disabled indicates that it is disabled. This status is not equivalent to the expected value of syncEnabled in AC.</p>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Configuration build() {
                return new Configuration(this);
            } 

        } 

    }
    /**
     * 
     * {@link PrepareIdentityProviderSCIMResponseBody} extends {@link TeaModel}
     *
     * <p>PrepareIdentityProviderSCIMResponseBody</p>
     */
    public static class Credential extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("credentialId")
        private String credentialId;

        @com.aliyun.core.annotation.NameInMap("expireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Credential(Builder builder) {
            this.createTime = builder.createTime;
            this.credentialId = builder.credentialId;
            this.expireTime = builder.expireTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Credential create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return credentialId
         */
        public String getCredentialId() {
            return this.credentialId;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String createTime; 
            private String credentialId; 
            private String expireTime; 
            private String status; 

            private Builder() {
            } 

            private Builder(Credential model) {
                this.createTime = model.createTime;
                this.credentialId = model.credentialId;
                this.expireTime = model.expireTime;
                this.status = model.status;
            } 

            /**
             * <p>The creation time returned by AgentIdentity.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-26T00:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The credential ID. This parameter is required and cannot be empty when you delete a credential. Use the ID returned in the credential list, not the plaintext token.</p>
             * 
             * <strong>example:</strong>
             * <p>credential-example</p>
             */
            public Builder credentialId(String credentialId) {
                this.credentialId = credentialId;
                return this;
            }

            /**
             * <p>The expiration time returned by AgentIdentity. Only credentials that are in the Enabled state and have not expired are considered available.</p>
             * 
             * <strong>example:</strong>
             * <p>2027-10-26T00:00:00Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The AgentIdentity credential status. Only credentials that are in the Enabled state and have not expired are considered available. This field is not the operationStatus of a SCIM task.</p>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Credential build() {
                return new Credential(this);
            } 

        } 

    }
    /**
     * 
     * {@link PrepareIdentityProviderSCIMResponseBody} extends {@link TeaModel}
     *
     * <p>PrepareIdentityProviderSCIMResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configuration")
        private Configuration configuration;

        @com.aliyun.core.annotation.NameInMap("credential")
        private Credential credential;

        @com.aliyun.core.annotation.NameInMap("token")
        private String token;

        private Data(Builder builder) {
            this.configuration = builder.configuration;
            this.credential = builder.credential;
            this.token = builder.token;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return configuration
         */
        public Configuration getConfiguration() {
            return this.configuration;
        }

        /**
         * @return credential
         */
        public Credential getCredential() {
            return this.credential;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        public static final class Builder {
            private Configuration configuration; 
            private Credential credential; 
            private String token; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.configuration = model.configuration;
                this.credential = model.credential;
                this.token = model.token;
            } 

            /**
             * <p>The AgentIdentity receiving configuration. The actual SAML configuration is read on demand only by calling GetIdentityProvider. SCIM query and prepare operations return the actual receiving status and URL.</p>
             */
            public Builder configuration(Configuration configuration) {
                this.configuration = configuration;
                return this;
            }

            /**
             * <p>The current credential summary, including credentialId, status, createTime, and expireTime. It does not include the repeatedly retrievable token.</p>
             */
            public Builder credential(Credential credential) {
                this.credential = credential;
                return this;
            }

            /**
             * <p>The plaintext token returned only when a new credential is created. If the prepare operation reuses a valid credential, this value is null. The token cannot be retrieved again from the list. If the response is lost, query the list first. The token is not automatically reissued. Do not write the token to logs or persistent frontend caches.</p>
             * 
             * <strong>example:</strong>
             * <p>example-scim-token</p>
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
