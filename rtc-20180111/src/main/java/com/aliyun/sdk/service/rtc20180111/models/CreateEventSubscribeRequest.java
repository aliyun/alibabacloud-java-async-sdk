// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEventSubscribeRequest} extends {@link RequestModel}
 *
 * <p>CreateEventSubscribeRequest</p>
 */
public class CreateEventSubscribeRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Events")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > events;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedCallbackAuth")
    private Boolean needCallbackAuth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Role")
    private Long role;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Users")
    private java.util.List < String > users;

    private CreateEventSubscribeRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.callbackUrl = builder.callbackUrl;
        this.channelId = builder.channelId;
        this.clientToken = builder.clientToken;
        this.events = builder.events;
        this.needCallbackAuth = builder.needCallbackAuth;
        this.ownerId = builder.ownerId;
        this.role = builder.role;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEventSubscribeRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return events
     */
    public java.util.List < String > getEvents() {
        return this.events;
    }

    /**
     * @return needCallbackAuth
     */
    public Boolean getNeedCallbackAuth() {
        return this.needCallbackAuth;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return role
     */
    public Long getRole() {
        return this.role;
    }

    /**
     * @return users
     */
    public java.util.List < String > getUsers() {
        return this.users;
    }

    public static final class Builder extends Request.Builder<CreateEventSubscribeRequest, Builder> {
        private String appId; 
        private String callbackUrl; 
        private String channelId; 
        private String clientToken; 
        private java.util.List < String > events; 
        private Boolean needCallbackAuth; 
        private Long ownerId; 
        private Long role; 
        private java.util.List < String > users; 

        private Builder() {
            super();
        } 

        private Builder(CreateEventSubscribeRequest request) {
            super(request);
            this.appId = request.appId;
            this.callbackUrl = request.callbackUrl;
            this.channelId = request.channelId;
            this.clientToken = request.clientToken;
            this.events = request.events;
            this.needCallbackAuth = request.needCallbackAuth;
            this.ownerId = request.ownerId;
            this.role = request.role;
            this.users = request.users;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * CallbackUrl.
         */
        public Builder callbackUrl(String callbackUrl) {
            this.putQueryParameter("CallbackUrl", callbackUrl);
            this.callbackUrl = callbackUrl;
            return this;
        }

        /**
         * ChannelId.
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Events.
         */
        public Builder events(java.util.List < String > events) {
            this.putQueryParameter("Events", events);
            this.events = events;
            return this;
        }

        /**
         * NeedCallbackAuth.
         */
        public Builder needCallbackAuth(Boolean needCallbackAuth) {
            this.putQueryParameter("NeedCallbackAuth", needCallbackAuth);
            this.needCallbackAuth = needCallbackAuth;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Role.
         */
        public Builder role(Long role) {
            this.putQueryParameter("Role", role);
            this.role = role;
            return this;
        }

        /**
         * Users.
         */
        public Builder users(java.util.List < String > users) {
            this.putQueryParameter("Users", users);
            this.users = users;
            return this;
        }

        @Override
        public CreateEventSubscribeRequest build() {
            return new CreateEventSubscribeRequest(this);
        } 

    } 

}
