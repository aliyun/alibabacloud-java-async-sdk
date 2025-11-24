// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link GrantUserPermissionsRequest} extends {@link RequestModel}
 *
 * <p>GrantUserPermissionsRequest</p>
 */
public class GrantUserPermissionsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Permissions")
    private String permissions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubAccountUserId")
    private String subAccountUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubAccountUserIds")
    private java.util.List<String> subAccountUserIds;

    private GrantUserPermissionsRequest(Builder builder) {
        super(builder);
        this.permissions = builder.permissions;
        this.subAccountUserId = builder.subAccountUserId;
        this.subAccountUserIds = builder.subAccountUserIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantUserPermissionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return permissions
     */
    public String getPermissions() {
        return this.permissions;
    }

    /**
     * @return subAccountUserId
     */
    public String getSubAccountUserId() {
        return this.subAccountUserId;
    }

    /**
     * @return subAccountUserIds
     */
    public java.util.List<String> getSubAccountUserIds() {
        return this.subAccountUserIds;
    }

    public static final class Builder extends Request.Builder<GrantUserPermissionsRequest, Builder> {
        private String permissions; 
        private String subAccountUserId; 
        private java.util.List<String> subAccountUserIds; 

        private Builder() {
            super();
        } 

        private Builder(GrantUserPermissionsRequest request) {
            super(request);
            this.permissions = request.permissions;
            this.subAccountUserId = request.subAccountUserId;
            this.subAccountUserIds = request.subAccountUserIds;
        } 

        /**
         * <p>The permissions that are granted to an entity. The content is a string that consists of JSON arrays. You must specify all permissions that you want to grant to an entity. You can add or remove permissions by modifying the content. Field definition of the sample code:</p>
         * <ul>
         * <li><code>IsCustom</code>: a parameter that is required by the system. Set the value to <code>true</code>.</li>
         * <li><code>Cluster</code>: the ID of the Service Mesh (ASM) instance.</li>
         * <li><code>RoleName</code>: the name of the permissions. Valid values: <code>istio-admin</code>, <code>istio-ops</code>, and <code>istio-readonly</code>. A value of istio-admin indicates the permissions of ASM administrators. A value of istio-ops indicates the permissions of ASM restricted users. A value of istio-readonly indicates the read-only permissions.</li>
         * <li><code>IsRamRole</code>: the entity to which you want to grant the permissions. To grant the permissions to a RAM role, set the value to <code>true</code>. Otherwise, set the value to <code>false</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;IsCustom&quot;:true,&quot;RoleName&quot;:&quot;istio-ops&quot;,&quot;Cluster&quot;:&quot;c57b848115458460583a4260cb713****&quot;,&quot;RoleType&quot;:&quot;custom&quot;,&quot;IsRamRole&quot;:false},{&quot;IsCustom&quot;:true,&quot;RoleName&quot;:&quot;istio-ops&quot;,&quot;Cluster&quot;:&quot;c4ec191f4e12145c09286ea3e2b8f****&quot;,&quot;RoleType&quot;:&quot;custom&quot;,&quot;IsRamRole&quot;:false}]</p>
         */
        public Builder permissions(String permissions) {
            this.putBodyParameter("Permissions", permissions);
            this.permissions = permissions;
            return this;
        }

        /**
         * <p>The ID of the RAM user or RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>27852573609480****</p>
         */
        public Builder subAccountUserId(String subAccountUserId) {
            this.putBodyParameter("SubAccountUserId", subAccountUserId);
            this.subAccountUserId = subAccountUserId;
            return this;
        }

        /**
         * <p>The IDs of RAM users or RAM roles. You can grant permissions to multiple users at a time.</p>
         */
        public Builder subAccountUserIds(java.util.List<String> subAccountUserIds) {
            String subAccountUserIdsShrink = shrink(subAccountUserIds, "SubAccountUserIds", "json");
            this.putBodyParameter("SubAccountUserIds", subAccountUserIdsShrink);
            this.subAccountUserIds = subAccountUserIds;
            return this;
        }

        @Override
        public GrantUserPermissionsRequest build() {
            return new GrantUserPermissionsRequest(this);
        } 

    } 

}
