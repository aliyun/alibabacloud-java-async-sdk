// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEventSubscribeRequest} extends {@link RequestModel}
 *
 * <p>CreateEventSubscribeRequest</p>
 */
public class CreateEventSubscribeRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("CallbackUrl")
    @Validation(required = true)
    private String callbackUrl;

    @Query
    @NameInMap("ChannelId")
    private String channelId;

    @Query
    @NameInMap("ClientToken")
    @Validation(required = true)
    private String clientToken;

    @Query
    @NameInMap("Events")
    @Validation(required = true)
    private java.util.List < String > events;

    @Query
    @NameInMap("NeedCallbackAuth")
    private Boolean needCallbackAuth;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Users")
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
        private java.util.List < String > users; 

        private Builder() {
            super();
        } 

        private Builder(CreateEventSubscribeRequest response) {
            super(response);
            this.appId = response.appId;
            this.callbackUrl = response.callbackUrl;
            this.channelId = response.channelId;
            this.clientToken = response.clientToken;
            this.events = response.events;
            this.needCallbackAuth = response.needCallbackAuth;
            this.ownerId = response.ownerId;
            this.users = response.users;
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
