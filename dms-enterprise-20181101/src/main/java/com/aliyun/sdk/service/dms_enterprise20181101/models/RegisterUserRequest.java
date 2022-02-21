// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterUserRequest} extends {@link RequestModel}
 *
 * <p>RegisterUserRequest</p>
 */
public class RegisterUserRequest extends Request {
    @Query
    @NameInMap("Mobile")
    private String mobile;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RoleNames")
    private String roleNames;

    @Query
    @NameInMap("Tid")
    private Long tid;

    @Query
    @NameInMap("Uid")
    @Validation(required = true)
    private String uid;

    @Query
    @NameInMap("UserNick")
    private String userNick;

    private RegisterUserRequest(Builder builder) {
        super(builder);
        this.mobile = builder.mobile;
        this.regionId = builder.regionId;
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
     * @return mobile
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String mobile; 
        private String regionId; 
        private String roleNames; 
        private Long tid; 
        private String uid; 
        private String userNick; 

        private Builder() {
            super();
        } 

        private Builder(RegisterUserRequest response) {
            super(response);
            this.mobile = response.mobile;
            this.regionId = response.regionId;
            this.roleNames = response.roleNames;
            this.tid = response.tid;
            this.uid = response.uid;
            this.userNick = response.userNick;
        } 

        /**
         * Mobile.
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
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
         * RoleNames.
         */
        public Builder roleNames(String roleNames) {
            this.putQueryParameter("RoleNames", roleNames);
            this.roleNames = roleNames;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(String uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * UserNick.
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
