// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link RevealServiceCredentialResponseBody} extends {@link TeaModel}
 *
 * <p>RevealServiceCredentialResponseBody</p>
 */
public class RevealServiceCredentialResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private RevealServiceCredentialResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevealServiceCredentialResponseBody create() {
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

        private Builder(RevealServiceCredentialResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response code. A value of Ok indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The currently active credential data.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;serviceId&quot;:&quot;svc-xxxxxxxx&quot;,&quot;provider&quot;:&quot;qwen&quot;,&quot;credentialType&quot;:&quot;apiKey&quot;,&quot;configRevision&quot;:&quot;1&quot;,&quot;credential&quot;:{&quot;apiKeyGenerateMode&quot;:&quot;Custom&quot;,&quot;apiKeys&quot;:[&quot;sk-xxxxxxxx&quot;]}}</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message. A value of success indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RevealServiceCredentialResponseBody build() {
            return new RevealServiceCredentialResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RevealServiceCredentialResponseBody} extends {@link TeaModel}
     *
     * <p>RevealServiceCredentialResponseBody</p>
     */
    public static class Credential extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiKeyGenerateMode")
        private String apiKeyGenerateMode;

        @com.aliyun.core.annotation.NameInMap("apiKeyReferences")
        private java.util.List<String> apiKeyReferences;

        @com.aliyun.core.annotation.NameInMap("apiKeys")
        private java.util.List<String> apiKeys;

        @com.aliyun.core.annotation.NameInMap("awsAccessKey")
        private String awsAccessKey;

        @com.aliyun.core.annotation.NameInMap("awsRegion")
        private String awsRegion;

        @com.aliyun.core.annotation.NameInMap("awsSecretKey")
        private String awsSecretKey;

        @com.aliyun.core.annotation.NameInMap("credentialSource")
        private String credentialSource;

        @com.aliyun.core.annotation.NameInMap("endpointMode")
        private String endpointMode;

        @com.aliyun.core.annotation.NameInMap("klingAccessKey")
        private String klingAccessKey;

        @com.aliyun.core.annotation.NameInMap("klingSecretKey")
        private String klingSecretKey;

        @com.aliyun.core.annotation.NameInMap("vertexAuthKey")
        private String vertexAuthKey;

        @com.aliyun.core.annotation.NameInMap("vertexProjectId")
        private String vertexProjectId;

        @com.aliyun.core.annotation.NameInMap("vertexRegion")
        private String vertexRegion;

        private Credential(Builder builder) {
            this.apiKeyGenerateMode = builder.apiKeyGenerateMode;
            this.apiKeyReferences = builder.apiKeyReferences;
            this.apiKeys = builder.apiKeys;
            this.awsAccessKey = builder.awsAccessKey;
            this.awsRegion = builder.awsRegion;
            this.awsSecretKey = builder.awsSecretKey;
            this.credentialSource = builder.credentialSource;
            this.endpointMode = builder.endpointMode;
            this.klingAccessKey = builder.klingAccessKey;
            this.klingSecretKey = builder.klingSecretKey;
            this.vertexAuthKey = builder.vertexAuthKey;
            this.vertexProjectId = builder.vertexProjectId;
            this.vertexRegion = builder.vertexRegion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Credential create() {
            return builder().build();
        }

        /**
         * @return apiKeyGenerateMode
         */
        public String getApiKeyGenerateMode() {
            return this.apiKeyGenerateMode;
        }

        /**
         * @return apiKeyReferences
         */
        public java.util.List<String> getApiKeyReferences() {
            return this.apiKeyReferences;
        }

        /**
         * @return apiKeys
         */
        public java.util.List<String> getApiKeys() {
            return this.apiKeys;
        }

        /**
         * @return awsAccessKey
         */
        public String getAwsAccessKey() {
            return this.awsAccessKey;
        }

        /**
         * @return awsRegion
         */
        public String getAwsRegion() {
            return this.awsRegion;
        }

        /**
         * @return awsSecretKey
         */
        public String getAwsSecretKey() {
            return this.awsSecretKey;
        }

        /**
         * @return credentialSource
         */
        public String getCredentialSource() {
            return this.credentialSource;
        }

        /**
         * @return endpointMode
         */
        public String getEndpointMode() {
            return this.endpointMode;
        }

        /**
         * @return klingAccessKey
         */
        public String getKlingAccessKey() {
            return this.klingAccessKey;
        }

        /**
         * @return klingSecretKey
         */
        public String getKlingSecretKey() {
            return this.klingSecretKey;
        }

        /**
         * @return vertexAuthKey
         */
        public String getVertexAuthKey() {
            return this.vertexAuthKey;
        }

        /**
         * @return vertexProjectId
         */
        public String getVertexProjectId() {
            return this.vertexProjectId;
        }

        /**
         * @return vertexRegion
         */
        public String getVertexRegion() {
            return this.vertexRegion;
        }

        public static final class Builder {
            private String apiKeyGenerateMode; 
            private java.util.List<String> apiKeyReferences; 
            private java.util.List<String> apiKeys; 
            private String awsAccessKey; 
            private String awsRegion; 
            private String awsSecretKey; 
            private String credentialSource; 
            private String endpointMode; 
            private String klingAccessKey; 
            private String klingSecretKey; 
            private String vertexAuthKey; 
            private String vertexProjectId; 
            private String vertexRegion; 

            private Builder() {
            } 

            private Builder(Credential model) {
                this.apiKeyGenerateMode = model.apiKeyGenerateMode;
                this.apiKeyReferences = model.apiKeyReferences;
                this.apiKeys = model.apiKeys;
                this.awsAccessKey = model.awsAccessKey;
                this.awsRegion = model.awsRegion;
                this.awsSecretKey = model.awsSecretKey;
                this.credentialSource = model.credentialSource;
                this.endpointMode = model.endpointMode;
                this.klingAccessKey = model.klingAccessKey;
                this.klingSecretKey = model.klingSecretKey;
                this.vertexAuthKey = model.vertexAuthKey;
                this.vertexProjectId = model.vertexProjectId;
                this.vertexRegion = model.vertexRegion;
            } 

            /**
             * <p>The API key generation mode. Valid values: Custom and Reference. Historical null values are treated as Custom.</p>
             * 
             * <strong>example:</strong>
             * <p>Custom</p>
             */
            public Builder apiKeyGenerateMode(String apiKeyGenerateMode) {
                this.apiKeyGenerateMode = apiKeyGenerateMode;
                return this;
            }

            /**
             * <p>The list of Key Management Service (KMS) reference names. This field is returned only in Reference mode. Reference values are not returned.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;my-kms-ref&quot;]</p>
             */
            public Builder apiKeyReferences(java.util.List<String> apiKeyReferences) {
                this.apiKeyReferences = apiKeyReferences;
                return this;
            }

            /**
             * <p>The list of custom API keys. This field is returned only when apiKeyGenerateMode is set to Custom. The keys are returned in their original order without deduplication.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;sk-xxxxxxxx&quot;,&quot;sk-yyyyyyyy&quot;]</p>
             */
            public Builder apiKeys(java.util.List<String> apiKeys) {
                this.apiKeys = apiKeys;
                return this;
            }

            /**
             * <p>Bedrock AWS Access Key</p>
             * 
             * <strong>example:</strong>
             * <p>AKIAxxxxxxxx</p>
             */
            public Builder awsAccessKey(String awsAccessKey) {
                this.awsAccessKey = awsAccessKey;
                return this;
            }

            /**
             * <p>Bedrock AWS Region</p>
             * 
             * <strong>example:</strong>
             * <p>us-east-1</p>
             */
            public Builder awsRegion(String awsRegion) {
                this.awsRegion = awsRegion;
                return this;
            }

            /**
             * <p>Bedrock AWS Secret Key</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder awsSecretKey(String awsSecretKey) {
                this.awsSecretKey = awsSecretKey;
                return this;
            }

            /**
             * <p>The source of the credential. When backfilled by the PAI-EAS system, the value is pai-eas.</p>
             * 
             * <strong>example:</strong>
             * <p>pai-eas</p>
             */
            public Builder credentialSource(String credentialSource) {
                this.credentialSource = credentialSource;
                return this;
            }

            /**
             * <p>The Bedrock endpoint mode. A value of runtime is returned for historical null values.</p>
             * 
             * <strong>example:</strong>
             * <p>runtime</p>
             */
            public Builder endpointMode(String endpointMode) {
                this.endpointMode = endpointMode;
                return this;
            }

            /**
             * <p>Kling Access Key</p>
             * 
             * <strong>example:</strong>
             * <p>AKxxxxxxxx</p>
             */
            public Builder klingAccessKey(String klingAccessKey) {
                this.klingAccessKey = klingAccessKey;
                return this;
            }

            /**
             * <p>Kling Secret Key</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder klingSecretKey(String klingSecretKey) {
                this.klingSecretKey = klingSecretKey;
                return this;
            }

            /**
             * <p>The original JSON text of the Vertex service account. The text is neither parsed nor reordered.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;:&quot;service_account&quot;,&quot;private_key&quot;:&quot;********&quot;}</p>
             */
            public Builder vertexAuthKey(String vertexAuthKey) {
                this.vertexAuthKey = vertexAuthKey;
                return this;
            }

            /**
             * <p>Vertex Project ID</p>
             * 
             * <strong>example:</strong>
             * <p>my-gcp-project</p>
             */
            public Builder vertexProjectId(String vertexProjectId) {
                this.vertexProjectId = vertexProjectId;
                return this;
            }

            /**
             * <p>Vertex Region</p>
             * 
             * <strong>example:</strong>
             * <p>us-central1</p>
             */
            public Builder vertexRegion(String vertexRegion) {
                this.vertexRegion = vertexRegion;
                return this;
            }

            public Credential build() {
                return new Credential(this);
            } 

        } 

    }
    /**
     * 
     * {@link RevealServiceCredentialResponseBody} extends {@link TeaModel}
     *
     * <p>RevealServiceCredentialResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configRevision")
        private String configRevision;

        @com.aliyun.core.annotation.NameInMap("credential")
        private Credential credential;

        @com.aliyun.core.annotation.NameInMap("credentialType")
        private String credentialType;

        @com.aliyun.core.annotation.NameInMap("provider")
        private String provider;

        @com.aliyun.core.annotation.NameInMap("serviceId")
        private String serviceId;

        private Data(Builder builder) {
            this.configRevision = builder.configRevision;
            this.credential = builder.credential;
            this.credentialType = builder.credentialType;
            this.provider = builder.provider;
            this.serviceId = builder.serviceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return configRevision
         */
        public String getConfigRevision() {
            return this.configRevision;
        }

        /**
         * @return credential
         */
        public Credential getCredential() {
            return this.credential;
        }

        /**
         * @return credentialType
         */
        public String getCredentialType() {
            return this.credentialType;
        }

        /**
         * @return provider
         */
        public String getProvider() {
            return this.provider;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        public static final class Builder {
            private String configRevision; 
            private Credential credential; 
            private String credentialType; 
            private String provider; 
            private String serviceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.configRevision = model.configRevision;
                this.credential = model.credential;
                this.credentialType = model.credentialType;
                this.provider = model.provider;
                this.serviceId = model.serviceId;
            } 

            /**
             * <p>The current configuration revision. For legacy objects, the value is legacy.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder configRevision(String configRevision) {
                this.configRevision = configRevision;
                return this;
            }

            /**
             * <p>The credential object for the currently active type. Only the fields corresponding to the credentialType are populated.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;apiKeyGenerateMode&quot;:&quot;Custom&quot;,&quot;apiKeys&quot;:[&quot;sk-xxxxxxxx&quot;]}</p>
             */
            public Builder credential(Credential credential) {
                this.credential = credential;
                return this;
            }

            /**
             * <p>The currently active credential type. Valid values: apiKey, bedrock, vertex, and kling.</p>
             * 
             * <strong>example:</strong>
             * <p>apiKey</p>
             */
            public Builder credentialType(String credentialType) {
                this.credentialType = credentialType;
                return this;
            }

            /**
             * <p>The name of the provider, such as qwen, openai, bedrock, vertex, kling, or pai-eas.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen</p>
             */
            public Builder provider(String provider) {
                this.provider = provider;
                return this;
            }

            /**
             * <p>The unique ID of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>svc-xxxxxxxx</p>
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
