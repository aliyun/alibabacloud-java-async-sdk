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
 * {@link CreateSecretRequest} extends {@link RequestModel}
 *
 * <p>CreateSecretRequest</p>
 */
public class CreateSecretRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gatewayType")
    private String gatewayType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("kmsConfig")
    private KMSConfig kmsConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("secretData")
    private String secretData;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("secretSource")
    private String secretSource;

    private CreateSecretRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.gatewayType = builder.gatewayType;
        this.kmsConfig = builder.kmsConfig;
        this.name = builder.name;
        this.secretData = builder.secretData;
        this.secretSource = builder.secretSource;
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return gatewayType
     */
    public String getGatewayType() {
        return this.gatewayType;
    }

    /**
     * @return kmsConfig
     */
    public KMSConfig getKmsConfig() {
        return this.kmsConfig;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return secretData
     */
    public String getSecretData() {
        return this.secretData;
    }

    /**
     * @return secretSource
     */
    public String getSecretSource() {
        return this.secretSource;
    }

    public static final class Builder extends Request.Builder<CreateSecretRequest, Builder> {
        private String description; 
        private String gatewayType; 
        private KMSConfig kmsConfig; 
        private String name; 
        private String secretData; 
        private String secretSource; 

        private Builder() {
            super();
        } 

        private Builder(CreateSecretRequest request) {
            super(request);
            this.description = request.description;
            this.gatewayType = request.gatewayType;
            this.kmsConfig = request.kmsConfig;
            this.name = request.name;
            this.secretData = request.secretData;
            this.secretSource = request.secretSource;
        } 

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * gatewayType.
         */
        public Builder gatewayType(String gatewayType) {
            this.putBodyParameter("gatewayType", gatewayType);
            this.gatewayType = gatewayType;
            return this;
        }

        /**
         * kmsConfig.
         */
        public Builder kmsConfig(KMSConfig kmsConfig) {
            this.putBodyParameter("kmsConfig", kmsConfig);
            this.kmsConfig = kmsConfig;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * secretData.
         */
        public Builder secretData(String secretData) {
            this.putBodyParameter("secretData", secretData);
            this.secretData = secretData;
            return this;
        }

        /**
         * secretSource.
         */
        public Builder secretSource(String secretSource) {
            this.putBodyParameter("secretSource", secretSource);
            this.secretSource = secretSource;
            return this;
        }

        @Override
        public CreateSecretRequest build() {
            return new CreateSecretRequest(this);
        } 

    } 

}
