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
 * {@link UpdateUserRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserRequest</p>
 */
public class UpdateUserRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxExecuteCount")
    private Long maxExecuteCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResultCount")
    private Long maxResultCount;

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
    private Long uid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UidString")
    private String uidString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserNick")
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
        this.uidString = builder.uidString;
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
     * @return uidString
     */
    public String getUidString() {
        return this.uidString;
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
        private String uidString; 
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
            this.uidString = request.uidString;
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
         * <p>The maximum number of queries that can be performed each day.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder maxExecuteCount(Long maxExecuteCount) {
            this.putQueryParameter("MaxExecuteCount", maxExecuteCount);
            this.maxExecuteCount = maxExecuteCount;
            return this;
        }

        /**
         * <p>The maximum number of rows that can be queried each day.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder maxResultCount(Long maxResultCount) {
            this.putQueryParameter("MaxResultCount", maxResultCount);
            this.maxResultCount = maxResultCount;
            return this;
        }

        /**
         * <p>The DingTalk ID or mobile number of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>188xxxxxxxx</p>
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * <p>The roles that the user assumes. For more information about the valid values, see the Request parameters section in the <a href="https://help.aliyun.com/document_detail/465812.html">UpdateUser</a> topic.</p>
         * 
         * <strong>example:</strong>
         * <p>ADMIN,DBA</p>
         */
        public Builder roleNames(String roleNames) {
            this.putQueryParameter("RoleNames", roleNames);
            this.roleNames = roleNames;
            return this;
        }

        /**
         * <p>The ID of the tenant.</p>
         * <blockquote>
         * <p>: To view the ID of the tenant, log on to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">Manage DMS tenants</a>.</p>
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
         * <p>The Alibaba Cloud unique ID (UID) of the user to update.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        public Builder uid(Long uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * <p>The UID of the String type. If you specify this parameter, the UID of the Long type is replaced.</p>
         * 
         * <strong>example:</strong>
         * <p>322824****:dmstest.wu@A201***</p>
         */
        public Builder uidString(String uidString) {
            this.putQueryParameter("UidString", uidString);
            this.uidString = uidString;
            return this;
        }

        /**
         * <p>The nickname of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
