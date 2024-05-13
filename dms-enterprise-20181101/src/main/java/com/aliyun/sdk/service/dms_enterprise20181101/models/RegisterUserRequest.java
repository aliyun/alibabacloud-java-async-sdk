// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterUserRequest} extends {@link RequestModel}
 *
 * <p>RegisterUserRequest</p>
 */
public class RegisterUserRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mobile")
    private String mobile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleNames")
    private String roleNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    private Long tid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserNick")
    private String userNick;

    private RegisterUserRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.mobile = builder.mobile;
        this.roleNames = builder.roleNames;
        this.tid = builder.tid;
        this.uid = builder.uid;
        this.userNick = builder.userNick;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterUserRequest create() {
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
     * @return mobile
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * @return roleNames
     */
    public String getRoleNames() {
        return this.roleNames;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return userNick
     */
    public String getUserNick() {
        return this.userNick;
    }

    public static final class Builder extends Request.Builder<RegisterUserRequest, Builder> {
        private String regionId; 
        private String mobile; 
        private String roleNames; 
        private Long tid; 
        private String uid; 
        private String userNick; 

        private Builder() {
            super();
        } 

        private Builder(RegisterUserRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.mobile = request.mobile;
            this.roleNames = request.roleNames;
            this.tid = request.tid;
            this.uid = request.uid;
            this.userNick = request.userNick;
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
         * The mobile number of the user.
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * The role that you want to assign to the user. Valid values:
         * <p>
         * 
         * *   **USER**: a regular user role
         * *   **DBA**: a database administrator (DBA) role
         * *   **ADMIN**: a DMS administrator role
         * *   **SECURITY_ADMIN**: a security administrator role
         * 
         * >  If you do not specify this parameter, the regular user role is assigned to the user by default. You can assign one or more roles to the user. Separate multiple roles with commas (,).
         */
        public Builder roleNames(String roleNames) {
            this.putQueryParameter("RoleNames", roleNames);
            this.roleNames = roleNames;
            return this;
        }

        /**
         * The ID of the tenant.
         * <p>
         * 
         * >  To query ID of the tenant, move the pointer over the profile picture in the upper-right corner of the DMS console. For more information, see the "View information about the current tenant" section of the [Manage DMS tenants](~~181330~~) topic.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * The UID of the Alibaba Cloud account of the user that you want to register.
         */
        public Builder uid(String uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * The nickname of the user.
         */
        public Builder userNick(String userNick) {
            this.putQueryParameter("UserNick", userNick);
            this.userNick = userNick;
            return this;
        }

        @Override
        public RegisterUserRequest build() {
            return new RegisterUserRequest(this);
        } 

    } 

}
