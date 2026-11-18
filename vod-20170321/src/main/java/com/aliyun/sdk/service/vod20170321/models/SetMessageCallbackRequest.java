// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link SetMessageCallbackRequest} extends {@link RequestModel}
 *
 * <p>SetMessageCallbackRequest</p>
 */
public class SetMessageCallbackRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthKey")
    private String authKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthSwitch")
    private String authSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackType")
    private String callbackType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackURL")
    private String callbackURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventTypeList")
    private String eventTypeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MnsEndpoint")
    private String mnsEndpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MnsQueueName")
    private String mnsQueueName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
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
         * <p>The application ID. If you do not specify this parameter, the ID of the default application is used, which is fixed at <strong>app-1000000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>app-1000000</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The authentication key. The key can be up to 32 characters in length and must contain both uppercase and lowercase letters and digits. You can set this parameter when the callback method is set to <strong>HTTP</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Dsf346dvet</p>
         */
        public Builder authKey(String authKey) {
            this.putQueryParameter("AuthKey", authKey);
            this.authKey = authKey;
            return this;
        }

        /**
         * <p>Specifies whether to enable authentication for HTTP callbacks. This parameter takes effect only when the callback method is set to <strong>HTTP</strong>. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: Enabled.</li>
         * <li><strong>off</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder authSwitch(String authSwitch) {
            this.putQueryParameter("AuthSwitch", authSwitch);
            this.authSwitch = authSwitch;
            return this;
        }

        /**
         * <p>The callback method. Valid values:</p>
         * <ul>
         * <li><strong>HTTP</strong></li>
         * <li><strong>Simple MSMQ (formerly MNS)</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        public Builder callbackType(String callbackType) {
            this.putQueryParameter("CallbackType", callbackType);
            this.callbackType = callbackType;
            return this;
        }

        /**
         * <p>The callback URL. This parameter is required when the callback method is set to <strong>HTTP</strong>.
         * The callback URL cannot exceed 256 bytes in length. You cannot specify multiple callback URLs.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://developer.aliyundoc.com">http://developer.aliyundoc.com</a></p>
         */
        public Builder callbackURL(String callbackURL) {
            this.putQueryParameter("CallbackURL", callbackURL);
            this.callbackURL = callbackURL;
            return this;
        }

        /**
         * <p>The callback event types. If this parameter is left empty, all message notifications are disabled. If this parameter is set to <strong>ALL</strong>, all message notifications are enabled. You can also specify specific event types to enable. Separate multiple event types with commas (,). For more information about the valid values, see <a href="https://help.aliyun.com/document_detail/55627.html">Event types</a>.</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <blockquote>
         * <p>All AI-related events, such as AIMediaAuditComplete and AIMediaDNAComplete, use the value <strong>AIComplete</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>FileUploadComplete</p>
         */
        public Builder eventTypeList(String eventTypeList) {
            this.putQueryParameter("EventTypeList", eventTypeList);
            this.eventTypeList = eventTypeList;
            return this;
        }

        /**
         * <p>The public endpoint of the MSMQ. Settings for this parameter are required when the callback method is set to <strong>Simple MSMQ (formerly MNS)</strong>. You can logon to the <a href="https://account.aliyun.com/login/login.html">Message Service console</a> and click the <strong>Get Endpoint</strong> button in the upper-right corner to obtain the endpoint. For more information, see <a href="https://help.aliyun.com/document_detail/27480.html">Endpoints</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>http://****.mns.cn-shanghai.aliyuncs.com/</p>
         */
        public Builder mnsEndpoint(String mnsEndpoint) {
            this.putQueryParameter("MnsEndpoint", mnsEndpoint);
            this.mnsEndpoint = mnsEndpoint;
            return this;
        }

        /**
         * <p>The name of the MSMQ. You can logon to the <a href="https://account.aliyun.com/login/login.html">Message Service console</a> and view the name in the <strong>Queue List</strong>. Settings for this parameter are required when the callback method is set to <strong>Simple MSMQ (formerly MNS)</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>quene_name</p>
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
