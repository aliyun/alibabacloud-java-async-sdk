// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
         * <p>The name of the access control rule.</p>
         * <blockquote>
         * <p>For more information about how to query created access control rules, see <a href="https://help.aliyun.com/document_detail/2539433.html">ListNetworkRules</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;NetworkRules&quot;:[&quot;kst-hzz62ee817bvyyr5x****.efkd&quot;,&quot;kst-hzz62ee817bvyyr5x****.eyyp&quot;]}</p>
         */
        public Builder accessControlRules(String accessControlRules) {
            this.putQueryParameter("AccessControlRules", accessControlRules);
            this.accessControlRules = accessControlRules;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>policy  description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The scope of the permission policy. You need to specify the KMS instance that you want to access.</p>
         * 
         * <strong>example:</strong>
         * <p>kst-hzz634e67d126u9p9****</p>
         */
        public Builder kmsInstance(String kmsInstance) {
            this.putQueryParameter("KmsInstance", kmsInstance);
            this.kmsInstance = kmsInstance;
            return this;
        }

        /**
         * <p>The name of the permission policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>policy_test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The operations that can be performed. Valid values:</p>
         * <ul>
         * <li>RbacPermission/Template/CryptoServiceKeyUser: allows you to perform cryptographic operations.</li>
         * <li>RbacPermission/Template/CryptoServiceSecretUser: allows you to perform secret-related operations.</li>
         * </ul>
         * <p>You can select both.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;RbacPermission/Template/CryptoServiceKeyUser&quot;, &quot;RbacPermission/Template/CryptoServiceSecretUser&quot;]</p>
         */
        public Builder permissions(String permissions) {
            this.putQueryParameter("Permissions", permissions);
            this.permissions = permissions;
            return this;
        }

        /**
         * <p>The key and secret that are allowed to access.</p>
         * <ul>
         * <li>Key: Enter a key in the <code>key/${KeyId}</code> format. To allow access to all keys of a KMS instance, enter key/*.</li>
         * <li>Secret: Enter a secret in the <code>secret/${SecretName}</code> format. To allow access to all secrets of a KMS instance, enter secret/*.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;secret/acs/ram/user/ram-secret&quot;, &quot;secret/acs/ram/user/acr-master&quot;, &quot;key/key-hzz63d9c8d3dfv8cv****&quot;]</p>
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
