// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
         * <p>The mobile number of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>130000000xx</p>
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * <p>The role that you want to assign to the user. Valid values:</p>
         * <ul>
         * <li><strong>USER</strong>: a regular user role</li>
         * <li><strong>DBA</strong>: a database administrator (DBA) role</li>
         * <li><strong>ADMIN</strong>: a DMS administrator role</li>
         * <li><strong>SECURITY_ADMIN</strong>: a security administrator role</li>
         * </ul>
         * <blockquote>
         * <p> If you do not specify this parameter, the regular user role is assigned to the user by default. You can assign one or more roles to the user. Separate multiple roles with commas (,).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>USER,DBA</p>
         */
        public Builder roleNames(String roleNames) {
            this.putQueryParameter("RoleNames", roleNames);
            this.roleNames = roleNames;
            return this;
        }

        /**
         * <p>The ID of the tenant.</p>
         * <blockquote>
         * <p> To query ID of the tenant, move the pointer over the profile picture in the upper-right corner of the DMS console. For more information, see the &quot;View information about the current tenant&quot; section of the <a href="https://help.aliyun.com/document_detail/181330.html">Manage DMS tenants</a> topic.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * <p>The UID of the Alibaba Cloud account of the user that you want to register.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        public Builder uid(String uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * <p>The nickname of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>dmstest</p>
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
