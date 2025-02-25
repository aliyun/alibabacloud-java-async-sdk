// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateStorageBundleRequest} extends {@link RequestModel}
 *
 * <p>CreateStorageBundleRequest</p>
 */
public class CreateStorageBundleRequest extends Request {
    @Query
    @NameInMap("BackendBucketRegionId")
    @Validation(required = true)
    private String backendBucketRegionId;

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

    private CreateStorageBundleRequest(Builder builder) {
        super(builder);
        this.backendBucketRegionId = builder.backendBucketRegionId;
        this.description = builder.description;
        this.name = builder.name;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStorageBundleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backendBucketRegionId
     */
    public String getBackendBucketRegionId() {
        return this.backendBucketRegionId;
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

    public static final class Builder extends Request.Builder<CreateStorageBundleRequest, Builder> {
        private String backendBucketRegionId; 
        private String description; 
        private String name; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateStorageBundleRequest request) {
            super(request);
            this.backendBucketRegionId = request.backendBucketRegionId;
            this.description = request.description;
            this.name = request.name;
            this.securityToken = request.securityToken;
        } 

        /**
         * BackendBucketRegionId.
         */
        public Builder backendBucketRegionId(String backendBucketRegionId) {
            this.putQueryParameter("BackendBucketRegionId", backendBucketRegionId);
            this.backendBucketRegionId = backendBucketRegionId;
            return this;
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

        @Override
        public CreateStorageBundleRequest build() {
            return new CreateStorageBundleRequest(this);
        } 

    } 

}
