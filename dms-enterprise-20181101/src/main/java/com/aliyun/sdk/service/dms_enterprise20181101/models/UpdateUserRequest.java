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
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("MaxExecuteCount")
    private Long maxExecuteCount;

    @Query
    @NameInMap("MaxResultCount")
    private Long maxResultCount;

    @Query
    @NameInMap("Mobile")
    private String mobile;

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
        this.regionId = builder.regionId;
        this.maxExecuteCount = builder.maxExecuteCount;
        this.maxResultCount = builder.maxResultCount;
        this.mobile = builder.mobile;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String regionId; 
        private Long maxExecuteCount; 
        private Long maxResultCount; 
        private String mobile; 
        private String roleNames; 
        private Long tid; 
        private Long uid; 
        private String userNick; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.maxExecuteCount = request.maxExecuteCount;
            this.maxResultCount = request.maxResultCount;
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
         * The maximum number of queries that can be performed each day.
         */
        public Builder maxExecuteCount(Long maxExecuteCount) {
            this.putQueryParameter("MaxExecuteCount", maxExecuteCount);
            this.maxExecuteCount = maxExecuteCount;
            return this;
        }

        /**
         * The maximum number of rows that can be queried each day.
         */
        public Builder maxResultCount(Long maxResultCount) {
            this.putQueryParameter("MaxResultCount", maxResultCount);
            this.maxResultCount = maxResultCount;
            return this;
        }

        /**
         * The DingTalk ID or mobile number of the user.
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * The roles that the user assumes. For more information about the valid values, see the Request parameters section in the [RegisterUser](~~141565~~) topic.
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
         * > : To view the ID of the tenant, log on to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [Manage DMS tenants](~~181330~~).
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * The Alibaba Cloud unique ID (UID) of the user to update.
         */
        public Builder uid(Long uid) {
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
        public UpdateUserRequest build() {
            return new UpdateUserRequest(this);
        } 

    } 

}
