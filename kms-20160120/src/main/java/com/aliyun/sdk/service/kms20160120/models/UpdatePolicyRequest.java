// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePolicyRequest} extends {@link RequestModel}
 *
 * <p>UpdatePolicyRequest</p>
 */
public class UpdatePolicyRequest extends Request {
    @Query
    @NameInMap("AccessControlRules")
    private String accessControlRules;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("Permissions")
    private String permissions;

    @Query
    @NameInMap("Resources")
    private String resources;

    private UpdatePolicyRequest(Builder builder) {
        super(builder);
        this.accessControlRules = builder.accessControlRules;
        this.description = builder.description;
        this.name = builder.name;
        this.permissions = builder.permissions;
        this.resources = builder.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessControlRules
     */
    public String getAccessControlRules() {
        return this.accessControlRules;
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
     * @return permissions
     */
    public String getPermissions() {
        return this.permissions;
    }

    /**
     * @return resources
     */
    public String getResources() {
        return this.resources;
    }

    public static final class Builder extends Request.Builder<UpdatePolicyRequest, Builder> {
        private String accessControlRules; 
        private String description; 
        private String name; 
        private String permissions; 
        private String resources; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePolicyRequest request) {
            super(request);
            this.accessControlRules = request.accessControlRules;
            this.description = request.description;
            this.name = request.name;
            this.permissions = request.permissions;
            this.resources = request.resources;
        } 

        /**
         * AccessControlRules.
         */
        public Builder accessControlRules(String accessControlRules) {
            this.putQueryParameter("AccessControlRules", accessControlRules);
            this.accessControlRules = accessControlRules;
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
         * Permissions.
         */
        public Builder permissions(String permissions) {
            this.putQueryParameter("Permissions", permissions);
            this.permissions = permissions;
            return this;
        }

        /**
         * Resources.
         */
        public Builder resources(String resources) {
            this.putQueryParameter("Resources", resources);
            this.resources = resources;
            return this;
        }

        @Override
        public UpdatePolicyRequest build() {
            return new UpdatePolicyRequest(this);
        } 

    } 

}
