// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBackendRequest} extends {@link RequestModel}
 *
 * <p>ModifyBackendRequest</p>
 */
public class ModifyBackendRequest extends Request {
    @Query
    @NameInMap("BackendId")
    @Validation(required = true)
    private String backendId;

    @Query
    @NameInMap("BackendName")
    @Validation(required = true)
    private String backendName;

    @Query
    @NameInMap("BackendType")
    @Validation(required = true)
    private String backendType;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private ModifyBackendRequest(Builder builder) {
        super(builder);
        this.backendId = builder.backendId;
        this.backendName = builder.backendName;
        this.backendType = builder.backendType;
        this.description = builder.description;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBackendRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backendId
     */
    public String getBackendId() {
        return this.backendId;
    }

    /**
     * @return backendName
     */
    public String getBackendName() {
        return this.backendName;
    }

    /**
     * @return backendType
     */
    public String getBackendType() {
        return this.backendType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<ModifyBackendRequest, Builder> {
        private String backendId; 
        private String backendName; 
        private String backendType; 
        private String description; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBackendRequest request) {
            super(request);
            this.backendId = request.backendId;
            this.backendName = request.backendName;
            this.backendType = request.backendType;
            this.description = request.description;
            this.securityToken = request.securityToken;
        } 

        /**
         * The ID of the backend service.
         */
        public Builder backendId(String backendId) {
            this.putQueryParameter("BackendId", backendId);
            this.backendId = backendId;
            return this;
        }

        /**
         * The name of the backend service.
         */
        public Builder backendName(String backendName) {
            this.putQueryParameter("BackendName", backendName);
            this.backendName = backendName;
            return this;
        }

        /**
         * The type of the backend service.
         */
        public Builder backendType(String backendType) {
            this.putQueryParameter("BackendType", backendType);
            this.backendType = backendType;
            return this;
        }

        /**
         * The description of the backend service.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
        public ModifyBackendRequest build() {
            return new ModifyBackendRequest(this);
        } 

    } 

}
