// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePolicyRequest} extends {@link RequestModel}
 *
 * <p>CreatePolicyRequest</p>
 */
public class CreatePolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessControlRules")
    private String accessControlRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KmsInstance")
    private String kmsInstance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Permissions")
    @com.aliyun.core.annotation.Validation(required = true)
    private String permissions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resources")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resources;

    private CreatePolicyRequest(Builder builder) {
        super(builder);
        this.accessControlRules = builder.accessControlRules;
        this.description = builder.description;
        this.kmsInstance = builder.kmsInstance;
        this.name = builder.name;
        this.permissions = builder.permissions;
        this.resources = builder.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePolicyRequest create() {
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
     * @return kmsInstance
     */
    public String getKmsInstance() {
        return this.kmsInstance;
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

    public static final class Builder extends Request.Builder<CreatePolicyRequest, Builder> {
        private String accessControlRules; 
        private String description; 
        private String kmsInstance; 
        private String name; 
        private String permissions; 
        private String resources; 

        private Builder() {
            super();
        } 

        private Builder(CreatePolicyRequest request) {
            super(request);
            this.accessControlRules = request.accessControlRules;
            this.description = request.description;
            this.kmsInstance = request.kmsInstance;
            this.name = request.name;
            this.permissions = request.permissions;
            this.resources = request.resources;
        } 

        /**
         * The name of the access control rule.
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
         * The scope of the permission policy. You need to specify the KMS instance that you want to access.
         */
        public Builder kmsInstance(String kmsInstance) {
            this.putQueryParameter("KmsInstance", kmsInstance);
            this.kmsInstance = kmsInstance;
            return this;
        }

        /**
         * The name of the permission policy.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The operations that can be performed. Valid values:
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
         * The key and secret that are allowed to access.
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
        public CreatePolicyRequest build() {
            return new CreatePolicyRequest(this);
        } 

    } 

}
