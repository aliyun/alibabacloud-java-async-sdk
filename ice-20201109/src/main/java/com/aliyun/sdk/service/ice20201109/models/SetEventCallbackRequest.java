// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link SetEventCallbackRequest} extends {@link RequestModel}
 *
 * <p>SetEventCallbackRequest</p>
 */
public class SetEventCallbackRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthKey")
    private String authKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthSwitch")
    private String authSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackQueueName")
    private String callbackQueueName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackType")
    private String callbackType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackURL")
    private String callbackURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventTypeList")
    private String eventTypeList;

    private SetEventCallbackRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.authKey = builder.authKey;
        this.authSwitch = builder.authSwitch;
        this.callbackQueueName = builder.callbackQueueName;
        this.callbackType = builder.callbackType;
        this.callbackURL = builder.callbackURL;
        this.eventTypeList = builder.eventTypeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetEventCallbackRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return callbackQueueName
     */
    public String getCallbackQueueName() {
        return this.callbackQueueName;
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

    public static final class Builder extends Request.Builder<SetEventCallbackRequest, Builder> {
        private String regionId; 
        private String authKey; 
        private String authSwitch; 
        private String callbackQueueName; 
        private String callbackType; 
        private String callbackURL; 
        private String eventTypeList; 

        private Builder() {
            super();
        } 

        private Builder(SetEventCallbackRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.authKey = request.authKey;
            this.authSwitch = request.authSwitch;
            this.callbackQueueName = request.callbackQueueName;
            this.callbackType = request.callbackType;
            this.callbackURL = request.callbackURL;
            this.eventTypeList = request.eventTypeList;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The authentication key. The key can be up to 32 characters in length and must contain uppercase letters, lowercase letters, and digits. This parameter takes effect only if you set CallbackType to <strong>HTTP</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey001</p>
         */
        public Builder authKey(String authKey) {
            this.putQueryParameter("AuthKey", authKey);
            this.authKey = authKey;
            return this;
        }

        /**
         * <p>Specifies whether to enable callback authentication. This parameter takes effect only if you set CallbackType to <strong>HTTP</strong>. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
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
         * <p>The name of the Simple Message Queue (SMQ) queue in the region. The name must start with ice-callback-.</p>
         * 
         * <strong>example:</strong>
         * <p>ice-callback-queue</p>
         */
        public Builder callbackQueueName(String callbackQueueName) {
            this.putQueryParameter("CallbackQueueName", callbackQueueName);
            this.callbackQueueName = callbackQueueName;
            return this;
        }

        /**
         * <p>The callback method. Valid values:</p>
         * <ul>
         * <li><strong>HTTP</strong></li>
         * <li><strong>MNS</strong></li>
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
         * <p>The callback URL. This parameter is required if you set CallbackType to <strong>HTTP</strong>. The callback URL cannot exceed 256 bytes in length. You can specify only one callback URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxx.yyy/callback">http://xxx.yyy/callback</a></p>
         */
        public Builder callbackURL(String callbackURL) {
            this.putQueryParameter("CallbackURL", callbackURL);
            this.callbackURL = callbackURL;
            return this;
        }

        /**
         * <p>The type of the callback event. You can specify multiple values separated with commas (,). ProduceMediaComplete: indicates that the editing and production task is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>ProduceMediaComplete</p>
         */
        public Builder eventTypeList(String eventTypeList) {
            this.putQueryParameter("EventTypeList", eventTypeList);
            this.eventTypeList = eventTypeList;
            return this;
        }

        @Override
        public SetEventCallbackRequest build() {
            return new SetEventCallbackRequest(this);
        } 

    } 

}
