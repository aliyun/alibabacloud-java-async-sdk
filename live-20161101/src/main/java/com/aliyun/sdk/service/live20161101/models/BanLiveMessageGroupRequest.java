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
 * {@link BanLiveMessageGroupRequest} extends {@link RequestModel}
 *
 * <p>BanLiveMessageGroupRequest</p>
 */
public class BanLiveMessageGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

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

    private BanLiveMessageGroupRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.dataCenter = builder.dataCenter;
        this.exceptUsers = builder.exceptUsers;
        this.groupId = builder.groupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BanLiveMessageGroupRequest create() {
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

    public static final class Builder extends Request.Builder<BanLiveMessageGroupRequest, Builder> {
        private String appId; 
        private String dataCenter; 
        private java.util.List<String> exceptUsers; 
        private String groupId; 

        private Builder() {
            super();
        } 

        private Builder(BanLiveMessageGroupRequest request) {
            super(request);
            this.appId = request.appId;
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
         * <p>The data center. It must be the same as the data center that was specified when you called the <a href="https://help.aliyun.com/document_detail/2848162.html">CreateLiveMessageApp</a> operation to create the interactive messaging application.</p>
         * <blockquote>
         * <p> Valid values: cn-shanghai and ap-southeast-1 (Singapore).</p>
         * </blockquote>
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
         * <p>The users whom you do not want to mute when the group is muted.</p>
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
        public BanLiveMessageGroupRequest build() {
            return new BanLiveMessageGroupRequest(this);
        } 

    } 

}
