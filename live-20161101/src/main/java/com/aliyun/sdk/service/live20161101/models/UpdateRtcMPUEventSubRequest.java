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
 * {@link UpdateRtcMPUEventSubRequest} extends {@link RequestModel}
 *
 * <p>UpdateRtcMPUEventSubRequest</p>
 */
public class UpdateRtcMPUEventSubRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackUrl")
    private String callbackUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelIds")
    private String channelIds;

    private UpdateRtcMPUEventSubRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.callbackUrl = builder.callbackUrl;
        this.channelIds = builder.channelIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRtcMPUEventSubRequest create() {
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
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    /**
     * @return channelIds
     */
    public String getChannelIds() {
        return this.channelIds;
    }

    public static final class Builder extends Request.Builder<UpdateRtcMPUEventSubRequest, Builder> {
        private String appId; 
        private String callbackUrl; 
        private String channelIds; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRtcMPUEventSubRequest request) {
            super(request);
            this.appId = request.appId;
            this.callbackUrl = request.callbackUrl;
            this.channelIds = request.channelIds;
        } 

        /**
         * <p>The ID of the application.</p>
         * <blockquote>
         * <p> The ID can be up to 64 characters in length and can contain letters, digits, underscores (_), and hyphens (-).</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yourAppId</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The callback URL.</p>
         * <blockquote>
         * <p> You can use headers such as HTTP and HTTPS in callback URLs. The URL can be up to 2,083 characters and contain letters, digits, and the following special characters: - _ ? % = # . / +</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>http://****.com/callback</p>
         */
        public Builder callbackUrl(String callbackUrl) {
            this.putQueryParameter("CallbackUrl", callbackUrl);
            this.callbackUrl = callbackUrl;
            return this;
        }

        /**
         * <p>The ID of the channel to which you want to send mixed-stream relay event callbacks. Separate multiple channel IDs with commas (,).</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If you leave this parameter empty, you are subscribed to all mixed-stream relay events submitted in the application.</p>
         * </li>
         * <li><p>You cannot specify duplicate channel IDs. You can specify up to 20 channel IDs in each call.</p>
         * </li>
         * <li><p>The ID can be up to 64 characters in length and contain letters, digits, underscores (_), and hyphens (-).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>yourChannelIds</p>
         */
        public Builder channelIds(String channelIds) {
            this.putQueryParameter("ChannelIds", channelIds);
            this.channelIds = channelIds;
            return this;
        }

        @Override
        public UpdateRtcMPUEventSubRequest build() {
            return new UpdateRtcMPUEventSubRequest(this);
        } 

    } 

}
