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
 * {@link CreateEventSubRequest} extends {@link RequestModel}
 *
 * <p>CreateEventSubRequest</p>
 */
public class CreateEventSubRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callbackUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Events")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> events;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Users")
    private java.util.List<String> users;

    private CreateEventSubRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.callbackUrl = builder.callbackUrl;
        this.channelId = builder.channelId;
        this.events = builder.events;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEventSubRequest create() {
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
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return events
     */
    public java.util.List<String> getEvents() {
        return this.events;
    }

    /**
     * @return users
     */
    public java.util.List<String> getUsers() {
        return this.users;
    }

    public static final class Builder extends Request.Builder<CreateEventSubRequest, Builder> {
        private String appId; 
        private String callbackUrl; 
        private String channelId; 
        private java.util.List<String> events; 
        private java.util.List<String> users; 

        private Builder() {
            super();
        } 

        private Builder(CreateEventSubRequest request) {
            super(request);
            this.appId = request.appId;
            this.callbackUrl = request.callbackUrl;
            this.channelId = request.channelId;
            this.events = request.events;
            this.users = request.users;
        } 

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9qb1****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The callback URL. For more information about the content of the messages that are sent to the callback URL, see the Callback section in this topic.</p>
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
         * <p>The channel ID. You can call the <a href="https://help.aliyun.com/document_detail/2628135.html">ListEventSub</a> operation to query the channel ID.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter is required if you specify the Users.N parameter.</p>
         * </li>
         * <li><p>If you set this parameter to * or do not specify this parameter, all channels are subscribed to.</p>
         * </li>
         * <li><p>Each application ID allows only one all-channel subscription.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>123333</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>Subscribe to events.</p>
         * <p>This parameter is required.</p>
         */
        public Builder events(java.util.List<String> events) {
            this.putQueryParameter("Events", events);
            this.events = events;
            return this;
        }

        /**
         * <p>The user whose events you want to subscribe to. If you leave this parameter empty, the events of all users in the channel are subscribed to, including the events of the streamer and viewers. Specify this parameter in the following format:</p>
         * <pre><code>Users.1=****
         * Users.2=****
         * ......
         * </code></pre>
         */
        public Builder users(java.util.List<String> users) {
            this.putQueryParameter("Users", users);
            this.users = users;
            return this;
        }

        @Override
        public CreateEventSubRequest build() {
            return new CreateEventSubRequest(this);
        } 

    } 

}
