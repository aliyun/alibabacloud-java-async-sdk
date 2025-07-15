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
 * {@link KickLiveMessageGroupUserRequest} extends {@link RequestModel}
 *
 * <p>KickLiveMessageGroupUserRequest</p>
 */
public class KickLiveMessageGroupUserRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("KickoffUser")
    @com.aliyun.core.annotation.Validation(required = true)
    private String kickoffUser;

    private KickLiveMessageGroupUserRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.dataCenter = builder.dataCenter;
        this.groupId = builder.groupId;
        this.kickoffUser = builder.kickoffUser;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KickLiveMessageGroupUserRequest create() {
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
     * @return kickoffUser
     */
    public String getKickoffUser() {
        return this.kickoffUser;
    }

    public static final class Builder extends Request.Builder<KickLiveMessageGroupUserRequest, Builder> {
        private String appId; 
        private String dataCenter; 
        private String groupId; 
        private String kickoffUser; 

        private Builder() {
            super();
        } 

        private Builder(KickLiveMessageGroupUserRequest request) {
            super(request);
            this.appId = request.appId;
            this.dataCenter = request.dataCenter;
            this.groupId = request.groupId;
            this.kickoffUser = request.kickoffUser;
        } 

        /**
         * <p>The ID of the interactive messaging application to which the interactive messaging group belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>coims-****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
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
         * <p>The ID of the interactive messaging group from which you want to remove the user.</p>
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
         * <p>The user that you want to remove.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>uid1</p>
         */
        public Builder kickoffUser(String kickoffUser) {
            this.putQueryParameter("KickoffUser", kickoffUser);
            this.kickoffUser = kickoffUser;
            return this;
        }

        @Override
        public KickLiveMessageGroupUserRequest build() {
            return new KickLiveMessageGroupUserRequest(this);
        } 

    } 

}
