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
 * {@link RemoveLiveMessageGroupBandRequest} extends {@link RequestModel}
 *
 * <p>RemoveLiveMessageGroupBandRequest</p>
 */
public class RemoveLiveMessageGroupBandRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataCenter")
    private String dataCenter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnbannedUsers")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> unbannedUsers;

    private RemoveLiveMessageGroupBandRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.dataCenter = builder.dataCenter;
        this.groupId = builder.groupId;
        this.unbannedUsers = builder.unbannedUsers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveLiveMessageGroupBandRequest create() {
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
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return unbannedUsers
     */
    public java.util.List<String> getUnbannedUsers() {
        return this.unbannedUsers;
    }

    public static final class Builder extends Request.Builder<RemoveLiveMessageGroupBandRequest, Builder> {
        private String appId; 
        private String dataCenter; 
        private String groupId; 
        private java.util.List<String> unbannedUsers; 

        private Builder() {
            super();
        } 

        private Builder(RemoveLiveMessageGroupBandRequest request) {
            super(request);
            this.appId = request.appId;
            this.dataCenter = request.dataCenter;
            this.groupId = request.groupId;
            this.unbannedUsers = request.unbannedUsers;
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

        /**
         * <p>The users whom you want to unmute.</p>
         * <p>This parameter is required.</p>
         */
        public Builder unbannedUsers(java.util.List<String> unbannedUsers) {
            String unbannedUsersShrink = shrink(unbannedUsers, "UnbannedUsers", "simple");
            this.putQueryParameter("UnbannedUsers", unbannedUsersShrink);
            this.unbannedUsers = unbannedUsers;
            return this;
        }

        @Override
        public RemoveLiveMessageGroupBandRequest build() {
            return new RemoveLiveMessageGroupBandRequest(this);
        } 

    } 

}
