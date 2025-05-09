// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link StartAvatarSessionRequest} extends {@link RequestModel}
 *
 * <p>StartAvatarSessionRequest</p>
 */
public class StartAvatarSessionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("channelToken")
    private String channelToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("customPushUrl")
    private String customPushUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("customUserId")
    private String customUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("projectId")
    private String projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private StartAvatarSessionRequest(Builder builder) {
        super(builder);
        this.channelToken = builder.channelToken;
        this.customPushUrl = builder.customPushUrl;
        this.customUserId = builder.customUserId;
        this.projectId = builder.projectId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartAvatarSessionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelToken
     */
    public String getChannelToken() {
        return this.channelToken;
    }

    /**
     * @return customPushUrl
     */
    public String getCustomPushUrl() {
        return this.customPushUrl;
    }

    /**
     * @return customUserId
     */
    public String getCustomUserId() {
        return this.customUserId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder extends Request.Builder<StartAvatarSessionRequest, Builder> {
        private String channelToken; 
        private String customPushUrl; 
        private String customUserId; 
        private String projectId; 
        private String requestId; 

        private Builder() {
            super();
        } 

        private Builder(StartAvatarSessionRequest request) {
            super(request);
            this.channelToken = request.channelToken;
            this.customPushUrl = request.customPushUrl;
            this.customUserId = request.customUserId;
            this.projectId = request.projectId;
            this.requestId = request.requestId;
        } 

        /**
         * channelToken.
         */
        public Builder channelToken(String channelToken) {
            this.putBodyParameter("channelToken", channelToken);
            this.channelToken = channelToken;
            return this;
        }

        /**
         * customPushUrl.
         */
        public Builder customPushUrl(String customPushUrl) {
            this.putBodyParameter("customPushUrl", customPushUrl);
            this.customPushUrl = customPushUrl;
            return this;
        }

        /**
         * customUserId.
         */
        public Builder customUserId(String customUserId) {
            this.putBodyParameter("customUserId", customUserId);
            this.customUserId = customUserId;
            return this;
        }

        /**
         * projectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("projectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("requestId", requestId);
            this.requestId = requestId;
            return this;
        }

        @Override
        public StartAvatarSessionRequest build() {
            return new StartAvatarSessionRequest(this);
        } 

    } 

}
