// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link BatchGetSecretValueRequest} extends {@link RequestModel}
 *
 * <p>BatchGetSecretValueRequest</p>
 */
public class BatchGetSecretValueRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretsList")
    private java.util.List<SecretsList> secretsList;

    private BatchGetSecretValueRequest(Builder builder) {
        super(builder);
        this.secretsList = builder.secretsList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetSecretValueRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return secretsList
     */
    public java.util.List<SecretsList> getSecretsList() {
        return this.secretsList;
    }

    public static final class Builder extends Request.Builder<BatchGetSecretValueRequest, Builder> {
        private java.util.List<SecretsList> secretsList; 

        private Builder() {
            super();
        } 

        private Builder(BatchGetSecretValueRequest request) {
            super(request);
            this.secretsList = request.secretsList;
        } 

        /**
         * SecretsList.
         */
        public Builder secretsList(java.util.List<SecretsList> secretsList) {
            String secretsListShrink = shrink(secretsList, "SecretsList", "json");
            this.putQueryParameter("SecretsList", secretsListShrink);
            this.secretsList = secretsList;
            return this;
        }

        @Override
        public BatchGetSecretValueRequest build() {
            return new BatchGetSecretValueRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchGetSecretValueRequest} extends {@link TeaModel}
     *
     * <p>BatchGetSecretValueRequest</p>
     */
    public static class SecretsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FetchExtendedConfig")
        private String fetchExtendedConfig;

        @com.aliyun.core.annotation.NameInMap("SecretName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String secretName;

        @com.aliyun.core.annotation.NameInMap("VersionId")
        private String versionId;

        @com.aliyun.core.annotation.NameInMap("VersionStage")
        private String versionStage;

        private SecretsList(Builder builder) {
            this.fetchExtendedConfig = builder.fetchExtendedConfig;
            this.secretName = builder.secretName;
            this.versionId = builder.versionId;
            this.versionStage = builder.versionStage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecretsList create() {
            return builder().build();
        }

        /**
         * @return fetchExtendedConfig
         */
        public String getFetchExtendedConfig() {
            return this.fetchExtendedConfig;
        }

        /**
         * @return secretName
         */
        public String getSecretName() {
            return this.secretName;
        }

        /**
         * @return versionId
         */
        public String getVersionId() {
            return this.versionId;
        }

        /**
         * @return versionStage
         */
        public String getVersionStage() {
            return this.versionStage;
        }

        public static final class Builder {
            private String fetchExtendedConfig; 
            private String secretName; 
            private String versionId; 
            private String versionStage; 

            private Builder() {
            } 

            private Builder(SecretsList model) {
                this.fetchExtendedConfig = model.fetchExtendedConfig;
                this.secretName = model.secretName;
                this.versionId = model.versionId;
                this.versionStage = model.versionStage;
            } 

            /**
             * FetchExtendedConfig.
             */
            public Builder fetchExtendedConfig(String fetchExtendedConfig) {
                this.fetchExtendedConfig = fetchExtendedConfig;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>secret001</p>
             */
            public Builder secretName(String secretName) {
                this.secretName = secretName;
                return this;
            }

            /**
             * VersionId.
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            /**
             * VersionStage.
             */
            public Builder versionStage(String versionStage) {
                this.versionStage = versionStage;
                return this;
            }

            public SecretsList build() {
                return new SecretsList(this);
            } 

        } 

    }
}
