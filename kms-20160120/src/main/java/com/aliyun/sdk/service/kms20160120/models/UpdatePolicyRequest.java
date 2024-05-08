// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePolicyRequest} extends {@link RequestModel}
 *
 * <p>UpdatePolicyRequest</p>
 */
public class UpdatePolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessControlRules")
    private String accessControlRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Permissions")
    private String permissions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resources")
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
         * The access control rule.
         * <p>
         * 
         * > For more information about how to query created access control rules, see [ListNetworkRules](~~2539433~~).
         */
        public Builder accessControlRules(String accessControlRules) {
            this.putQueryParameter("AccessControlRules", accessControlRules);
            this.accessControlRules = accessControlRules;
            return this;
        }

        /**
         * The description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the permission policy that you want to update.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The operations that are supported by the updated policy. Valid values:
         * <p>
         * 
         * *   RbacPermission/Template/CryptoServiceKeyUser: allows you to perform cryptographic operations.
         * *   RbacPermission/Template/CryptoServiceSecretUser: allows you to perform secret-related operations.
         * 
         * You can select both.
         */
        public Builder permissions(String permissions) {
            this.putQueryParameter("Permissions", permissions);
            this.permissions = permissions;
            return this;
        }

        /**
         * The key and secret that are allowed to access after the update.
         * <p>
         * 
         * *   Key: Enter a key in the `key/${KeyId}` format. To allow access to all keys of a KMS instance, enter key/\*.
         * *   Secret: Enter a secret in the `secret/${SecretName}` format. To allow access to all secrets of a KMS instance, enter secret/\*.
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
