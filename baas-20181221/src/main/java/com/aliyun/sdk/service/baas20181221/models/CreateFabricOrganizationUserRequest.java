// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFabricOrganizationUserRequest} extends {@link RequestModel}
 *
 * <p>CreateFabricOrganizationUserRequest</p>
 */
public class CreateFabricOrganizationUserRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Attrs")
    private String attrs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrganizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Password")
    @com.aliyun.core.annotation.Validation(required = true)
    private String password;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Username")
    @com.aliyun.core.annotation.Validation(required = true)
    private String username;

    private CreateFabricOrganizationUserRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.attrs = builder.attrs;
        this.organizationId = builder.organizationId;
        this.password = builder.password;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFabricOrganizationUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return attrs
     */
    public String getAttrs() {
        return this.attrs;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<CreateFabricOrganizationUserRequest, Builder> {
        private String regionId; 
        private String attrs; 
        private String organizationId; 
        private String password; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(CreateFabricOrganizationUserRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.attrs = request.attrs;
            this.organizationId = request.organizationId;
            this.password = request.password;
            this.username = request.username;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Attrs.
         */
        public Builder attrs(String attrs) {
            this.putBodyParameter("Attrs", attrs);
            this.attrs = attrs;
            return this;
        }

        /**
         * OrganizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putBodyParameter("OrganizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putBodyParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * Username.
         */
        public Builder username(String username) {
            this.putBodyParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public CreateFabricOrganizationUserRequest build() {
            return new CreateFabricOrganizationUserRequest(this);
        } 

    } 

}
