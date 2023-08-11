// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantUserPermissionsRequest} extends {@link RequestModel}
 *
 * <p>GrantUserPermissionsRequest</p>
 */
public class GrantUserPermissionsRequest extends Request {
    @Body
    @NameInMap("Permissions")
    private String permissions;

    @Body
    @NameInMap("SubAccountUserId")
    @Validation(required = true)
    private String subAccountUserId;

    @Body
    @NameInMap("SubAccountUserIds")
    private java.util.List < String > subAccountUserIds;

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
    public java.util.List < String > getSubAccountUserIds() {
        return this.subAccountUserIds;
    }

    public static final class Builder extends Request.Builder<GrantUserPermissionsRequest, Builder> {
        private String permissions; 
        private String subAccountUserId; 
        private java.util.List < String > subAccountUserIds; 

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
         * The permissions that are granted to an entity. The content is a string that consists of JSON arrays. You must specify all permissions that you want to grant to an entity. You can add or remove permissions by modifying the content. Field definition of the sample code:
         * <p>
         * 
         * *   `IsCustom`: a parameter that is required by the system. Set the value to `true`.
         * *   `Cluster`: the ID of the Alibaba Cloud Service Mesh (ASM) instance.
         * *   `RoleName`: the name of the permissions. Valid values: `istio-admin`, `istio-ops`, and `istio-readonly`. A value of istio-admin indicates the permissions of ASM administrators. A value of istio-ops indicates the permissions of ASM restricted users. A value of istio-readonly indicates the read-only permissions.
         * *   `IsRamRole`: the entity to which you want to grant the permissions. To grant the permissions to a RAM role, set the value to `true`. Otherwise, set the value to `false`.
         */
        public Builder permissions(String permissions) {
            this.putBodyParameter("Permissions", permissions);
            this.permissions = permissions;
            return this;
        }

        /**
         * The ID of the RAM user or RAM role.
         */
        public Builder subAccountUserId(String subAccountUserId) {
            this.putBodyParameter("SubAccountUserId", subAccountUserId);
            this.subAccountUserId = subAccountUserId;
            return this;
        }

        /**
         * The ID list of the RAM user or RAM role.
         */
        public Builder subAccountUserIds(java.util.List < String > subAccountUserIds) {
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
