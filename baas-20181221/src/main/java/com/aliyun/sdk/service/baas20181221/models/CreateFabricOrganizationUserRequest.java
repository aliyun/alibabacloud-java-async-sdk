// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFabricOrganizationUserRequest} extends {@link RequestModel}
 *
 * <p>CreateFabricOrganizationUserRequest</p>
 */
public class CreateFabricOrganizationUserRequest extends Request {
    @Body
    @NameInMap("Attrs")
    private String attrs;

    @Body
    @NameInMap("OrganizationId")
    @Validation(required = true)
    private String organizationId;

    @Body
    @NameInMap("Password")
    @Validation(required = true)
    private String password;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Username")
    @Validation(required = true)
    private String username;

    private CreateFabricOrganizationUserRequest(Builder builder) {
        super(builder);
        this.attrs = builder.attrs;
        this.organizationId = builder.organizationId;
        this.password = builder.password;
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<CreateFabricOrganizationUserRequest, Builder> {
        private String attrs; 
        private String organizationId; 
        private String password; 
        private String regionId; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(CreateFabricOrganizationUserRequest response) {
            super(response);
            this.attrs = response.attrs;
            this.organizationId = response.organizationId;
            this.password = response.password;
            this.regionId = response.regionId;
            this.username = response.username;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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
