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
 * {@link ModifyLiveMessageUserInfoRequest} extends {@link RequestModel}
 *
 * <p>ModifyLiveMessageUserInfoRequest</p>
 */
public class ModifyLiveMessageUserInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataCenter")
    private String dataCenter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserMetaInfo")
    private String userMetaInfo;

    private ModifyLiveMessageUserInfoRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.dataCenter = builder.dataCenter;
        this.userId = builder.userId;
        this.userMetaInfo = builder.userMetaInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLiveMessageUserInfoRequest create() {
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
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userMetaInfo
     */
    public String getUserMetaInfo() {
        return this.userMetaInfo;
    }

    public static final class Builder extends Request.Builder<ModifyLiveMessageUserInfoRequest, Builder> {
        private String appId; 
        private String dataCenter; 
        private String userId; 
        private String userMetaInfo; 

        private Builder() {
            super();
        } 

        private Builder(ModifyLiveMessageUserInfoRequest request) {
            super(request);
            this.appId = request.appId;
            this.dataCenter = request.dataCenter;
            this.userId = request.userId;
            this.userMetaInfo = request.userMetaInfo;
        } 

        /**
         * <p>The ID of the interactive messaging application whose user information you want to modify.</p>
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
         * <p>The data center. It must be the same as the data center that was specified when you called the <a href="https://help.aliyun.com/document_detail/2593195.html">CreateLiveMessageApp</a> operation to create the interactive messaging application. Valid values: cn-shanghai and ap-southeast-1 (Singapore).</p>
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
         * <p>The ID of the user whose information you want to modify.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>uid2</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * <p>The additional information about the user after the modification. The value can be up to 512 bytes in length.</p>
         * 
         * <strong>example:</strong>
         * <p>uid2meta2</p>
         */
        public Builder userMetaInfo(String userMetaInfo) {
            this.putQueryParameter("UserMetaInfo", userMetaInfo);
            this.userMetaInfo = userMetaInfo;
            return this;
        }

        @Override
        public ModifyLiveMessageUserInfoRequest build() {
            return new ModifyLiveMessageUserInfoRequest(this);
        } 

    } 

}
