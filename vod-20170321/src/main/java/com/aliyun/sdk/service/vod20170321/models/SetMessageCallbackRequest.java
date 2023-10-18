// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetMessageCallbackRequest} extends {@link RequestModel}
 *
 * <p>SetMessageCallbackRequest</p>
 */
public class SetMessageCallbackRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("AuthKey")
    private String authKey;

    @Query
    @NameInMap("AuthSwitch")
    private String authSwitch;

    @Query
    @NameInMap("CallbackType")
    private String callbackType;

    @Query
    @NameInMap("CallbackURL")
    private String callbackURL;

    @Query
    @NameInMap("EventTypeList")
    private String eventTypeList;

    @Query
    @NameInMap("MnsEndpoint")
    private String mnsEndpoint;

    @Query
    @NameInMap("MnsQueueName")
    private String mnsQueueName;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    private SetMessageCallbackRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.authKey = builder.authKey;
        this.authSwitch = builder.authSwitch;
        this.callbackType = builder.callbackType;
        this.callbackURL = builder.callbackURL;
        this.eventTypeList = builder.eventTypeList;
        this.mnsEndpoint = builder.mnsEndpoint;
        this.mnsQueueName = builder.mnsQueueName;
        this.ownerAccount = builder.ownerAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetMessageCallbackRequest create() {
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
     * @return authKey
     */
    public String getAuthKey() {
        return this.authKey;
    }

    /**
     * @return authSwitch
     */
    public String getAuthSwitch() {
        return this.authSwitch;
    }

    /**
     * @return callbackType
     */
    public String getCallbackType() {
        return this.callbackType;
    }

    /**
     * @return callbackURL
     */
    public String getCallbackURL() {
        return this.callbackURL;
    }

    /**
     * @return eventTypeList
     */
    public String getEventTypeList() {
        return this.eventTypeList;
    }

    /**
     * @return mnsEndpoint
     */
    public String getMnsEndpoint() {
        return this.mnsEndpoint;
    }

    /**
     * @return mnsQueueName
     */
    public String getMnsQueueName() {
        return this.mnsQueueName;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public static final class Builder extends Request.Builder<SetMessageCallbackRequest, Builder> {
        private String appId; 
        private String authKey; 
        private String authSwitch; 
        private String callbackType; 
        private String callbackURL; 
        private String eventTypeList; 
        private String mnsEndpoint; 
        private String mnsQueueName; 
        private String ownerAccount; 

        private Builder() {
            super();
        } 

        private Builder(SetMessageCallbackRequest request) {
            super(request);
            this.appId = request.appId;
            this.authKey = request.authKey;
            this.authSwitch = request.authSwitch;
            this.callbackType = request.callbackType;
            this.callbackURL = request.callbackURL;
            this.eventTypeList = request.eventTypeList;
            this.mnsEndpoint = request.mnsEndpoint;
            this.mnsQueueName = request.mnsQueueName;
            this.ownerAccount = request.ownerAccount;
        } 

        /**
         * The ID of the application. If you do not set this parameter, the default value **app-1000000** is used.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The cryptographic key. This parameter only takes effect when the CallbackType parameter is set to HTTP. The key can be up to 32 characters in length and must contain uppercase letters, lowercase letters, and digits.
         */
        public Builder authKey(String authKey) {
            this.putQueryParameter("AuthKey", authKey);
            this.authKey = authKey;
            return this;
        }

        /**
         * Specifies whether to enable callback authentication. This parameter only takes effect when the CallbackType parameter is set to HTTP. Valid values:
         * <p>
         * 
         * *   **on**: enables authentication.
         * *   **off**: disables authentication.
         */
        public Builder authSwitch(String authSwitch) {
            this.putQueryParameter("AuthSwitch", authSwitch);
            this.authSwitch = authSwitch;
            return this;
        }

        /**
         * The callback method. Valid values:
         * <p>
         * 
         * *   **HTTP**
         * *   **MNS**
         */
        public Builder callbackType(String callbackType) {
            this.putQueryParameter("CallbackType", callbackType);
            this.callbackType = callbackType;
            return this;
        }

        /**
         * The callback URL. This parameter only takes effect when the CallbackType parameter is set to HTTP.
         */
        public Builder callbackURL(String callbackURL) {
            this.putQueryParameter("CallbackURL", callbackURL);
            this.callbackURL = callbackURL;
            return this;
        }

        /**
         * The type of the callback event. If you do not set this parameter, notifications for all types of events are disabled. If you set this parameter to ALL, notifications for all types of events are enabled. You can specify the event types for which notifications are enabled. Separate multiple event types with commas (,). For more information about the valid values of this parameter, see [Event type](~~55627~~).
         */
        public Builder eventTypeList(String eventTypeList) {
            this.putQueryParameter("EventTypeList", eventTypeList);
            this.eventTypeList = eventTypeList;
            return this;
        }

        /**
         * The public endpoint of Message Service (MNS). This parameter only takes effect when the CallbackType parameter is set to MNS. For more information, see [Endpoint](~~27480#concept-2028913~~ "An endpoint is the address that you specify for a subscription to receive messages. When messages are published to a topic, Message Service (MNS) pushes the messages to the specified endpoints. You can specify the same endpoint for multiple subscriptions.").
         */
        public Builder mnsEndpoint(String mnsEndpoint) {
            this.putQueryParameter("MnsEndpoint", mnsEndpoint);
            this.mnsEndpoint = mnsEndpoint;
            return this;
        }

        /**
         * The name of the MNS queue. This parameter only takes effect when the CallbackType parameter is set to MNS.
         */
        public Builder mnsQueueName(String mnsQueueName) {
            this.putQueryParameter("MnsQueueName", mnsQueueName);
            this.mnsQueueName = mnsQueueName;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        @Override
        public SetMessageCallbackRequest build() {
            return new SetMessageCallbackRequest(this);
        } 

    } 

}
