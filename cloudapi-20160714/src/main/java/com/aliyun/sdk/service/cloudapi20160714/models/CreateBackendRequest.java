// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBackendRequest} extends {@link RequestModel}
 *
 * <p>CreateBackendRequest</p>
 */
public class CreateBackendRequest extends Request {
    @Query
    @NameInMap("BackendName")
    @Validation(required = true)
    private String backendName;

    @Query
    @NameInMap("BackendType")
    @Validation(required = true)
    private String backendType;

    @Query
    @NameInMap("CreateEventBridgeServiceLinkedRole")
    private Boolean createEventBridgeServiceLinkedRole;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private CreateBackendRequest(Builder builder) {
        super(builder);
        this.backendName = builder.backendName;
        this.backendType = builder.backendType;
        this.createEventBridgeServiceLinkedRole = builder.createEventBridgeServiceLinkedRole;
        this.description = builder.description;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBackendRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return createEventBridgeServiceLinkedRole
     */
    public Boolean getCreateEventBridgeServiceLinkedRole() {
        return this.createEventBridgeServiceLinkedRole;
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

    public static final class Builder extends Request.Builder<CreateBackendRequest, Builder> {
        private String backendName; 
        private String backendType; 
        private Boolean createEventBridgeServiceLinkedRole; 
        private String description; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateBackendRequest request) {
            super(request);
            this.backendName = request.backendName;
            this.backendType = request.backendType;
            this.createEventBridgeServiceLinkedRole = request.createEventBridgeServiceLinkedRole;
            this.description = request.description;
            this.securityToken = request.securityToken;
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
         * The type of the backend service. Valid values: `HTTP, VPC, FC_EVENT, FC_HTTP, OSS, and MOCK`.
         */
        public Builder backendType(String backendType) {
            this.putQueryParameter("BackendType", backendType);
            this.backendType = backendType;
            return this;
        }

        /**
         * Specifies whether to create a role associated with EventBridge.
         */
        public Builder createEventBridgeServiceLinkedRole(Boolean createEventBridgeServiceLinkedRole) {
            this.putQueryParameter("CreateEventBridgeServiceLinkedRole", createEventBridgeServiceLinkedRole);
            this.createEventBridgeServiceLinkedRole = createEventBridgeServiceLinkedRole;
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
        public CreateBackendRequest build() {
            return new CreateBackendRequest(this);
        } 

    } 

}
