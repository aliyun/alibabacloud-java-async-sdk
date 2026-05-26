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
 * {@link UpdateTokenVaultRequest} extends {@link RequestModel}
 *
 * <p>UpdateTokenVaultRequest</p>
 */
public class UpdateTokenVaultRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleArn")
    private String roleArn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TokenVaultName")
    private String tokenVaultName;

    private UpdateTokenVaultRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.roleArn = builder.roleArn;
        this.tokenVaultName = builder.tokenVaultName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTokenVaultRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateTokenVaultRequest, Builder> {
        private String description; 
        private String roleArn; 
        private String tokenVaultName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTokenVaultRequest request) {
            super(request);
            this.description = request.description;
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
        public UpdateTokenVaultRequest build() {
            return new UpdateTokenVaultRequest(this);
        } 

    } 

}
