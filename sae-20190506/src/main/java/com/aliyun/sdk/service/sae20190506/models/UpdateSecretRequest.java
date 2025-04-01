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
 * {@link UpdateSecretRequest} extends {@link RequestModel}
 *
 * <p>UpdateSecretRequest</p>
 */
public class UpdateSecretRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretData")
    @com.aliyun.core.annotation.Validation(required = true)
    private SecretData secretData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretId")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 1000000000, minimum = 1)
    private Long secretId;

    private UpdateSecretRequest(Builder builder) {
        super(builder);
        this.namespaceId = builder.namespaceId;
        this.secretData = builder.secretData;
        this.secretId = builder.secretId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSecretRequest create() {
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
     * @return secretId
     */
    public Long getSecretId() {
        return this.secretId;
    }

    public static final class Builder extends Request.Builder<UpdateSecretRequest, Builder> {
        private String namespaceId; 
        private SecretData secretData; 
        private Long secretId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSecretRequest request) {
            super(request);
            this.namespaceId = request.namespaceId;
            this.secretData = request.secretData;
            this.secretId = request.secretId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder secretId(Long secretId) {
            this.putQueryParameter("SecretId", secretId);
            this.secretId = secretId;
            return this;
        }

        @Override
        public UpdateSecretRequest build() {
            return new UpdateSecretRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateSecretRequest} extends {@link TeaModel}
     *
     * <p>UpdateSecretRequest</p>
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
             * <p>k specifies a key and v specifies a value. For more information, see <a href="https://help.aliyun.com/document_detail/463383.html">Manage a Kubernetes Secret</a>.</p>
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
