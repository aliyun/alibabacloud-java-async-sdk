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
 * {@link CreateRtcMPUEventSubRequest} extends {@link RequestModel}
 *
 * <p>CreateRtcMPUEventSubRequest</p>
 */
public class CreateRtcMPUEventSubRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callbackUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelIds")
    private String channelIds;

    private CreateRtcMPUEventSubRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.callbackUrl = builder.callbackUrl;
        this.channelIds = builder.channelIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRtcMPUEventSubRequest create() {
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

    public static final class Builder extends Request.Builder<CreateRtcMPUEventSubRequest, Builder> {
        private String appId; 
        private String callbackUrl; 
        private String channelIds; 

        private Builder() {
            super();
        } 

        private Builder(CreateRtcMPUEventSubRequest request) {
            super(request);
            this.appId = request.appId;
            this.callbackUrl = request.callbackUrl;
            this.channelIds = request.channelIds;
        } 

        /**
         * <p>The ID of the application.</p>
         * <blockquote>
         * <p>The ID can be up to 64 characters in length and can contain letters, digits, underscores, and hyphens (-).</p>
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
         * <p>The callback URL can be up to 2,083 characters in length. You can use headers such as HTTP and HTTPS in callback URLs. The URL can contain letters, digits, and the following special characters: - _ ? % = # . / +</p>
         * </blockquote>
         * <p>This parameter is required.</p>
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
         * <li><p>If you leave this parameter empty, you are subscribed to mixed-stream relay events of all channels in the application.</p>
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
        public CreateRtcMPUEventSubRequest build() {
            return new CreateRtcMPUEventSubRequest(this);
        } 

    } 

}
