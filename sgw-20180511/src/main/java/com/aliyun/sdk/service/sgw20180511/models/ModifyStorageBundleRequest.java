// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyStorageBundleRequest} extends {@link RequestModel}
 *
 * <p>ModifyStorageBundleRequest</p>
 */
public class ModifyStorageBundleRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("StorageBundleId")
    @Validation(required = true)
    private String storageBundleId;

    private ModifyStorageBundleRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.name = builder.name;
        this.securityToken = builder.securityToken;
        this.storageBundleId = builder.storageBundleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyStorageBundleRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return storageBundleId
     */
    public String getStorageBundleId() {
        return this.storageBundleId;
    }

    public static final class Builder extends Request.Builder<ModifyStorageBundleRequest, Builder> {
        private String description; 
        private String name; 
        private String securityToken; 
        private String storageBundleId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyStorageBundleRequest request) {
            super(request);
            this.description = request.description;
            this.name = request.name;
            this.securityToken = request.securityToken;
            this.storageBundleId = request.storageBundleId;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * StorageBundleId.
         */
        public Builder storageBundleId(String storageBundleId) {
            this.putQueryParameter("StorageBundleId", storageBundleId);
            this.storageBundleId = storageBundleId;
            return this;
        }

        @Override
        public ModifyStorageBundleRequest build() {
            return new ModifyStorageBundleRequest(this);
        } 

    } 

}
