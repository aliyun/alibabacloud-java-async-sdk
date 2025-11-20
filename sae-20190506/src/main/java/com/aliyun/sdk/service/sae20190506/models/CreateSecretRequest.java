// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link CreateSecretRequest} extends {@link RequestModel}
 *
 * <p>CreateSecretRequest</p>
 */
public class CreateSecretRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretData")
    @com.aliyun.core.annotation.Validation(required = true)
    private SecretData secretData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String secretName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String secretType;

    private CreateSecretRequest(Builder builder) {
        super(builder);
        this.namespaceId = builder.namespaceId;
        this.secretData = builder.secretData;
        this.secretName = builder.secretName;
        this.secretType = builder.secretType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSecretRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return secretData
     */
    public SecretData getSecretData() {
        return this.secretData;
    }

    /**
     * @return secretName
     */
    public String getSecretName() {
        return this.secretName;
    }

    /**
     * @return secretType
     */
    public String getSecretType() {
        return this.secretType;
    }

    public static final class Builder extends Request.Builder<CreateSecretRequest, Builder> {
        private String namespaceId; 
        private SecretData secretData; 
        private String secretName; 
        private String secretType; 

        private Builder() {
            super();
        } 

        private Builder(CreateSecretRequest request) {
            super(request);
            this.namespaceId = request.namespaceId;
            this.secretData = request.secretData;
            this.secretName = request.secretName;
            this.secretType = request.secretType;
        } 

        /**
         * <p>The ID of the namespace where the Secret resides. If the namespace is the default namespace, you need to only enter the region ID, such as <code>cn-beijing</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing:test</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * <p>The Secret data.</p>
         * <p>This parameter is required.</p>
         */
        public Builder secretData(SecretData secretData) {
            String secretDataShrink = shrink(secretData, "SecretData", "json");
            this.putQueryParameter("SecretData", secretDataShrink);
            this.secretData = secretData;
            return this;
        }

        /**
         * <p>The Secret name. The name can contain digits, letters, and underscores (_). The name must start with a letter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-auth-acree</p>
         */
        public Builder secretName(String secretName) {
            this.putQueryParameter("SecretName", secretName);
            this.secretName = secretName;
            return this;
        }

        /**
         * <p>The supported Secret type. Valid values:</p>
         * <ul>
         * <li><strong>kubernetes.io/dockerconfigjson</strong>: the Secret for the username and password of the image repository. The Secret is used for authentication when images are pulled during application deployment.</li>
         * </ul>
         * <p>Valid values:</p>
         * <ul>
         * <li>Opaque</li>
         * <li>kubernetes.io/dockerconfigjson</li>
         * <li>kubernetes.io/tls</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kubernetes.io/dockerconfigjson</p>
         */
        public Builder secretType(String secretType) {
            this.putQueryParameter("SecretType", secretType);
            this.secretType = secretType;
            return this;
        }

        @Override
        public CreateSecretRequest build() {
            return new CreateSecretRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateSecretRequest} extends {@link TeaModel}
     *
     * <p>CreateSecretRequest</p>
     */
    public static class SecretData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecretData")
        @com.aliyun.core.annotation.Validation(required = true)
        private String secretData;

        private SecretData(Builder builder) {
            this.secretData = builder.secretData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecretData create() {
            return builder().build();
        }

        /**
         * @return secretData
         */
        public String getSecretData() {
            return this.secretData;
        }

        public static final class Builder {
            private String secretData; 

            private Builder() {
            } 

            private Builder(SecretData model) {
                this.secretData = model.secretData;
            } 

            /**
             * <p>The information about the key-value pairs of the Secret. This parameter is required. The following formats are supported:</p>
             * <p>{&quot;Data&quot;:&quot;{&quot;k1&quot;:&quot;v1&quot;, &quot;k2&quot;:&quot;v2&quot;}&quot;}</p>
             * <p>k specifies a key and v specifies a value.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;.dockerconfigjson&quot;:&quot;eyJhdXRocyI6eyJyZWdpc3RyeS12cGMuY24tYmVpamluZy5hbGl5dW5jcy5jb20iOnsidXNlcm5hbWUiOiJ1c2VybmFtZSIsInBhc3N3b3JkIjoicGFzc3dvcmQiLCJhdXRoIjoiZFhObGNtNWhiV1U2Y0dGemMzZHZjbVE9In0sInJlZ2lzdHJ5LmNuLWJlaWppbmcuYWxpeXVuY3MuY29tIjp7InVzZXJuYW1lIjoidXNlcm5hbWUiLCJwYXNzd29yZCI6InBhc3N3b3JkIiwiYXV0aCI6ImRYTmxjbTVoYldVNmNHRnpjM2R2Y21RPSJ9fX0=&quot;}</p>
             */
            public Builder secretData(String secretData) {
                this.secretData = secretData;
                return this;
            }

            public SecretData build() {
                return new SecretData(this);
            } 

        } 

    }
}
