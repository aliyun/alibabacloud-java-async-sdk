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
 * {@link GetIdentityProviderServiceProviderResponseBody} extends {@link TeaModel}
 *
 * <p>GetIdentityProviderServiceProviderResponseBody</p>
 */
public class GetIdentityProviderServiceProviderResponseBody extends TeaModel {
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

    private GetIdentityProviderServiceProviderResponseBody(Builder builder) {
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

    public static GetIdentityProviderServiceProviderResponseBody create() {
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

        private Builder(GetIdentityProviderServiceProviderResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business result code. If the request fails, troubleshoot the issue based on the HTTP status code and the message.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The SP information. For the result structure, see the response fields of this operation. The response of an asynchronous write operation indicates that the request is accepted, but does not guarantee that the background task is complete.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The processing status of the current request. This status does not indicate the final result of the background task.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request acceptance or error message. For asynchronous task results, check them by calling the corresponding query operation.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request. You can use this ID to associate the current call with troubleshooting. Keep this ID if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>request-example</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the current request is successful. A value of true indicates that the request is processed successfully. For asynchronous write operations, you must continue to query the task results.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetIdentityProviderServiceProviderResponseBody build() {
            return new GetIdentityProviderServiceProviderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetIdentityProviderServiceProviderResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderServiceProviderResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("acsUrl")
        private String acsUrl;

        @com.aliyun.core.annotation.NameInMap("entityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("metadataXml")
        private String metadataXml;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("redirectUri")
        private String redirectUri;

        private Data(Builder builder) {
            this.acsUrl = builder.acsUrl;
            this.entityId = builder.entityId;
            this.metadataXml = builder.metadataXml;
            this.protocol = builder.protocol;
            this.redirectUri = builder.redirectUri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return acsUrl
         */
        public String getAcsUrl() {
            return this.acsUrl;
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return metadataXml
         */
        public String getMetadataXml() {
            return this.metadataXml;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return redirectUri
         */
        public String getRedirectUri() {
            return this.redirectUri;
        }

        public static final class Builder {
            private String acsUrl; 
            private String entityId; 
            private String metadataXml; 
            private String protocol; 
            private String redirectUri; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.acsUrl = model.acsUrl;
                this.entityId = model.entityId;
                this.metadataXml = model.metadataXml;
                this.protocol = model.protocol;
                this.redirectUri = model.redirectUri;
            } 

            /**
             * <p>The SAML assertion consumer URL of the local SP. Configure this value in the external IdP.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://sp.example.com/saml/acs">https://sp.example.com/saml/acs</a></p>
             */
            public Builder acsUrl(String acsUrl) {
                this.acsUrl = acsUrl;
                return this;
            }

            /**
             * <p>The entity identifier of the local SP. Configure this value in the external IdP. This is not the Entity ID of the external IdP.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://sp.example.com/entity">https://sp.example.com/entity</a></p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>The SP metadata XML of the local SP. Use this file for import in the external IdP. Do not submit this file as the IdP XML for SAML configuration.</p>
             * 
             * <strong>example:</strong>
             * <p><EntityDescriptor xmlns="urn:oasis:names:tc:SAML:2.0:metadata" entityID="https://sp.example.com/entity"><SPSSODescriptor protocolSupportEnumeration="urn:oasis:names:tc:SAML:2.0:protocol"><AssertionConsumerService Binding="urn:oasis:names:tc:SAML:2.0:bindings:HTTP-POST" Location="https://sp.example.com/saml/acs" index="0"/></SPSSODescriptor></EntityDescriptor></p>
             */
            public Builder metadataXml(String metadataXml) {
                this.metadataXml = metadataXml;
                return this;
            }

            /**
             * <p>Required. The query parameter. Only the exact value SAML is supported. The response returns SAML.</p>
             * 
             * <strong>example:</strong>
             * <p>SAML</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The valid URL returned when protocol is set to OIDC. Configure this value as the callback URL in the external IdP. This field is empty or not returned when SAML is used. The meanings of the original SAML fields remain unchanged.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://signin-cn-hangzhou.aliyunagentid.com/example-pool/sso/oidc/callback">https://signin-cn-hangzhou.aliyunagentid.com/example-pool/sso/oidc/callback</a></p>
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
