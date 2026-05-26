// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link CreateTokenVaultRequest} extends {@link RequestModel}
 *
 * <p>CreateTokenVaultRequest</p>
 */
public class CreateTokenVaultRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EncryptionConfig")
    private EncryptionConfig encryptionConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleArn")
    private String roleArn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TokenVaultName")
    private String tokenVaultName;

    private CreateTokenVaultRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.encryptionConfig = builder.encryptionConfig;
        this.roleArn = builder.roleArn;
        this.tokenVaultName = builder.tokenVaultName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTokenVaultRequest create() {
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
     * @return encryptionConfig
     */
    public EncryptionConfig getEncryptionConfig() {
        return this.encryptionConfig;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return tokenVaultName
     */
    public String getTokenVaultName() {
        return this.tokenVaultName;
    }

    public static final class Builder extends Request.Builder<CreateTokenVaultRequest, Builder> {
        private String description; 
        private EncryptionConfig encryptionConfig; 
        private String roleArn; 
        private String tokenVaultName; 

        private Builder() {
            super();
        } 

        private Builder(CreateTokenVaultRequest request) {
            super(request);
            this.description = request.description;
            this.encryptionConfig = request.encryptionConfig;
            this.roleArn = request.roleArn;
            this.tokenVaultName = request.tokenVaultName;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EncryptionConfig.
         */
        public Builder encryptionConfig(EncryptionConfig encryptionConfig) {
            String encryptionConfigShrink = shrink(encryptionConfig, "EncryptionConfig", "json");
            this.putBodyParameter("EncryptionConfig", encryptionConfigShrink);
            this.encryptionConfig = encryptionConfig;
            return this;
        }

        /**
         * RoleArn.
         */
        public Builder roleArn(String roleArn) {
            this.putBodyParameter("RoleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        /**
         * TokenVaultName.
         */
        public Builder tokenVaultName(String tokenVaultName) {
            this.putBodyParameter("TokenVaultName", tokenVaultName);
            this.tokenVaultName = tokenVaultName;
            return this;
        }

        @Override
        public CreateTokenVaultRequest build() {
            return new CreateTokenVaultRequest(this);
        } 

    } 

}
