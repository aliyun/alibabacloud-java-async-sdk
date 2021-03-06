// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserRequest</p>
 */
public class UpdateUserRequest extends Request {
    @Query
    @NameInMap("MaxExecuteCount")
    private Long maxExecuteCount;

    @Query
    @NameInMap("MaxResultCount")
    private Long maxResultCount;

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
    private Long uid;

    @Query
    @NameInMap("UserNick")
    private String userNick;

    private UpdateUserRequest(Builder builder) {
        super(builder);
        this.maxExecuteCount = builder.maxExecuteCount;
        this.maxResultCount = builder.maxResultCount;
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

    public static UpdateUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxExecuteCount
     */
    public Long getMaxExecuteCount() {
        return this.maxExecuteCount;
    }

    /**
     * @return maxResultCount
     */
    public Long getMaxResultCount() {
        return this.maxResultCount;
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
    public Long getUid() {
        return this.uid;
    }

    /**
     * @return userNick
     */
    public String getUserNick() {
        return this.userNick;
    }

    public static final class Builder extends Request.Builder<UpdateUserRequest, Builder> {
        private Long maxExecuteCount; 
        private Long maxResultCount; 
        private String mobile; 
        private String regionId; 
        private String roleNames; 
        private Long tid; 
        private Long uid; 
        private String userNick; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserRequest response) {
            super(response);
            this.maxExecuteCount = response.maxExecuteCount;
            this.maxResultCount = response.maxResultCount;
            this.mobile = response.mobile;
            this.regionId = response.regionId;
            this.roleNames = response.roleNames;
            this.tid = response.tid;
            this.uid = response.uid;
            this.userNick = response.userNick;
        } 

        /**
         * MaxExecuteCount.
         */
        public Builder maxExecuteCount(Long maxExecuteCount) {
            this.putQueryParameter("MaxExecuteCount", maxExecuteCount);
            this.maxExecuteCount = maxExecuteCount;
            return this;
        }

        /**
         * MaxResultCount.
         */
        public Builder maxResultCount(Long maxResultCount) {
            this.putQueryParameter("MaxResultCount", maxResultCount);
            this.maxResultCount = maxResultCount;
            return this;
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
        public Builder uid(Long uid) {
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
        public UpdateUserRequest build() {
            return new UpdateUserRequest(this);
        } 

    } 

}
