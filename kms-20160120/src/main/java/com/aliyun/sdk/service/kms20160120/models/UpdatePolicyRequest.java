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
         * <p>The access control rule.</p>
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
         * <p>The name of the permission policy that you want to update.</p>
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
         * <p>The operations that are supported by the updated policy. Valid values:</p>
         * <ul>
         * <li>RbacPermission/Template/CryptoServiceKeyUser: allows you to perform cryptographic operations.</li>
         * <li>RbacPermission/Template/CryptoServiceSecretUser: allows you to perform secret-related operations.</li>
         * </ul>
         * <p>You can select both.</p>
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
         * <p>The key and secret that are allowed to access after the update.</p>
         * <ul>
         * <li>Key: Enter a key in the <code>key/${KeyId}</code> format. To allow access to all keys of a KMS instance, enter key/*.</li>
         * <li>Secret: Enter a secret in the <code>secret/${SecretName}</code> format. To allow access to all secrets of a KMS instance, enter secret/*.</li>
         * </ul>
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
        public UpdatePolicyRequest build() {
            return new UpdatePolicyRequest(this);
        } 

    } 

}
