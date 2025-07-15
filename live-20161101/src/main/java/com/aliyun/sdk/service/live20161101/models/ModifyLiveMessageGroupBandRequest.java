// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link ModifyLiveMessageGroupBandRequest} extends {@link RequestModel}
 *
 * <p>ModifyLiveMessageGroupBandRequest</p>
 */
public class ModifyLiveMessageGroupBandRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BannedAll")
    private Boolean bannedAll;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BannnedUsers")
    private java.util.List<String> bannnedUsers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataCenter")
    private String dataCenter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExceptUsers")
    private java.util.List<String> exceptUsers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    private ModifyLiveMessageGroupBandRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.bannedAll = builder.bannedAll;
        this.bannnedUsers = builder.bannnedUsers;
        this.dataCenter = builder.dataCenter;
        this.exceptUsers = builder.exceptUsers;
        this.groupId = builder.groupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLiveMessageGroupBandRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return bannedAll
     */
    public Boolean getBannedAll() {
        return this.bannedAll;
    }

    /**
     * @return bannnedUsers
     */
    public java.util.List<String> getBannnedUsers() {
        return this.bannnedUsers;
    }

    /**
     * @return dataCenter
     */
    public String getDataCenter() {
        return this.dataCenter;
    }

    /**
     * @return exceptUsers
     */
    public java.util.List<String> getExceptUsers() {
        return this.exceptUsers;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    public static final class Builder extends Request.Builder<ModifyLiveMessageGroupBandRequest, Builder> {
        private String appId; 
        private Boolean bannedAll; 
        private java.util.List<String> bannnedUsers; 
        private String dataCenter; 
        private java.util.List<String> exceptUsers; 
        private String groupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyLiveMessageGroupBandRequest request) {
            super(request);
            this.appId = request.appId;
            this.bannedAll = request.bannedAll;
            this.bannnedUsers = request.bannnedUsers;
            this.dataCenter = request.dataCenter;
            this.exceptUsers = request.exceptUsers;
            this.groupId = request.groupId;
        } 

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>Specifies whether to mute all users.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder bannedAll(Boolean bannedAll) {
            this.putQueryParameter("BannedAll", bannedAll);
            this.bannedAll = bannedAll;
            return this;
        }

        /**
         * <p>The ID of the user whom you want to mute. Separate multiple user IDs with commas (,). You can specify up to 30 users IDs.</p>
         */
        public Builder bannnedUsers(java.util.List<String> bannnedUsers) {
            String bannnedUsersShrink = shrink(bannnedUsers, "BannnedUsers", "simple");
            this.putQueryParameter("BannnedUsers", bannnedUsersShrink);
            this.bannnedUsers = bannnedUsers;
            return this;
        }

        /**
         * <p>The data center. It must be the same as the data center that was specified when you called the <a href="https://help.aliyun.com/document_detail/2848162.html">CreateLiveMessageApp</a> operation to create the interactive messaging application. Valid values: cn-shanghai and ap-southeast-1 (Singapore).</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder dataCenter(String dataCenter) {
            this.putQueryParameter("DataCenter", dataCenter);
            this.dataCenter = dataCenter;
            return this;
        }

        /**
         * <p>The ID of the user whom you do not want to mute when you set the BannedAll parameter to true. Separate multiple user IDs with commas (,). You can specify up to 30 users IDs.</p>
         */
        public Builder exceptUsers(java.util.List<String> exceptUsers) {
            String exceptUsersShrink = shrink(exceptUsers, "ExceptUsers", "simple");
            this.putQueryParameter("ExceptUsers", exceptUsersShrink);
            this.exceptUsers = exceptUsers;
            return this;
        }

        /**
         * <p>The group ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>grouptest</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        @Override
        public ModifyLiveMessageGroupBandRequest build() {
            return new ModifyLiveMessageGroupBandRequest(this);
        } 

    } 

}
