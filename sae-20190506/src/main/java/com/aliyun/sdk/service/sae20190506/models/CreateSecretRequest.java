// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
         * <p>registry-auth-acree</p>
         */
        public Builder secretName(String secretName) {
            this.putQueryParameter("SecretName", secretName);
            this.secretName = secretName;
            return this;
        }

        /**
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

            /**
             * <p>This parameter is required.</p>
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
