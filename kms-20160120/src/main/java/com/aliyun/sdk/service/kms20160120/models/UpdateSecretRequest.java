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
 * {@link UpdateSecretRequest} extends {@link RequestModel}
 *
 * <p>UpdateSecretRequest</p>
 */
public class UpdateSecretRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtendedConfig")
    private ExtendedConfig extendedConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String secretName;

    private UpdateSecretRequest(Builder builder) {
        super(builder);
        this.extendedConfig = builder.extendedConfig;
        this.description = builder.description;
        this.secretName = builder.secretName;
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
     * @return extendedConfig
     */
    public ExtendedConfig getExtendedConfig() {
        return this.extendedConfig;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return secretName
     */
    public String getSecretName() {
        return this.secretName;
    }

    public static final class Builder extends Request.Builder<UpdateSecretRequest, Builder> {
        private ExtendedConfig extendedConfig; 
        private String description; 
        private String secretName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSecretRequest request) {
            super(request);
            this.extendedConfig = request.extendedConfig;
            this.description = request.description;
            this.secretName = request.secretName;
        } 

        /**
         * ExtendedConfig.
         */
        public Builder extendedConfig(ExtendedConfig extendedConfig) {
            this.putQueryParameter("ExtendedConfig", extendedConfig);
            this.extendedConfig = extendedConfig;
            return this;
        }

        /**
         * <p>The description of the secret.</p>
         * 
         * <strong>example:</strong>
         * <p>datainfo</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the secret.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>secret001</p>
         */
        public Builder secretName(String secretName) {
            this.putQueryParameter("SecretName", secretName);
            this.secretName = secretName;
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
    public static class ExtendedConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomData")
        private java.util.Map<String, ?> customData;

        private ExtendedConfig(Builder builder) {
            this.customData = builder.customData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtendedConfig create() {
            return builder().build();
        }

        /**
         * @return customData
         */
        public java.util.Map<String, ?> getCustomData() {
            return this.customData;
        }

        public static final class Builder {
            private java.util.Map<String, ?> customData; 

            private Builder() {
            } 

            private Builder(ExtendedConfig model) {
                this.customData = model.customData;
            } 

            /**
             * <p>The custom data in the extended configuration of the secret.</p>
             * <blockquote>
             * <ul>
             * <li>If this parameter is specified, the existing extended configuration of the secret is updated.</li>
             * <li>This parameter is unavailable for generic secrets.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{&quot;DBName&quot;:&quot;app1&quot;,&quot;Port&quot;:&quot;3306&quot;}</p>
             */
            public Builder customData(java.util.Map<String, ?> customData) {
                this.customData = customData;
                return this;
            }

            public ExtendedConfig build() {
                return new ExtendedConfig(this);
            } 

        } 

    }
}
