// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSecretRequest} extends {@link RequestModel}
 *
 * <p>CreateSecretRequest</p>
 */
public class CreateSecretRequest extends Request {
    @Query
    @NameInMap("NamespaceId")
    @Validation(required = true)
    private String namespaceId;

    @Query
    @NameInMap("SecretData")
    @Validation(required = true)
    private SecretData secretData;

    @Query
    @NameInMap("SecretName")
    @Validation(required = true)
    private String secretName;

    @Query
    @NameInMap("SecretType")
    @Validation(required = true)
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
         * NamespaceId.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * SecretData.
         */
        public Builder secretData(SecretData secretData) {
            String secretDataShrink = shrink(secretData, "SecretData", "json");
            this.putQueryParameter("SecretData", secretDataShrink);
            this.secretData = secretData;
            return this;
        }

        /**
         * SecretName.
         */
        public Builder secretName(String secretName) {
            this.putQueryParameter("SecretName", secretName);
            this.secretName = secretName;
            return this;
        }

        /**
         * SecretType.
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

    public static class SecretData extends TeaModel {
        @NameInMap("SecretData")
        @Validation(required = true)
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
             * SecretData.
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
