// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * AuthKey.
         */
        public Builder authKey(String authKey) {
            this.putQueryParameter("AuthKey", authKey);
            this.authKey = authKey;
            return this;
        }

        /**
         * AuthSwitch.
         */
        public Builder authSwitch(String authSwitch) {
            this.putQueryParameter("AuthSwitch", authSwitch);
            this.authSwitch = authSwitch;
            return this;
        }

        /**
         * CallbackQueueName.
         */
        public Builder callbackQueueName(String callbackQueueName) {
            this.putQueryParameter("CallbackQueueName", callbackQueueName);
            this.callbackQueueName = callbackQueueName;
            return this;
        }

        /**
         * CallbackType.
         */
        public Builder callbackType(String callbackType) {
            this.putQueryParameter("CallbackType", callbackType);
            this.callbackType = callbackType;
            return this;
        }

        /**
         * CallbackURL.
         */
        public Builder callbackURL(String callbackURL) {
            this.putQueryParameter("CallbackURL", callbackURL);
            this.callbackURL = callbackURL;
            return this;
        }

        /**
         * EventTypeList.
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
