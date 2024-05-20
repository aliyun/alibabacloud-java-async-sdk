// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * SecretId.
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
