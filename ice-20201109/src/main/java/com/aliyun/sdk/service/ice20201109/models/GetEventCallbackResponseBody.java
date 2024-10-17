// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetEventCallbackResponseBody} extends {@link TeaModel}
 *
 * <p>GetEventCallbackResponseBody</p>
 */
public class GetEventCallbackResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthKey")
    private String authKey;

    @com.aliyun.core.annotation.NameInMap("AuthSwitch")
    private String authSwitch;

    @com.aliyun.core.annotation.NameInMap("CallbackQueueName")
    private String callbackQueueName;

    @com.aliyun.core.annotation.NameInMap("CallbackType")
    private String callbackType;

    @com.aliyun.core.annotation.NameInMap("CallbackURL")
    private String callbackURL;

    @com.aliyun.core.annotation.NameInMap("EventTypeList")
    private String eventTypeList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetEventCallbackResponseBody(Builder builder) {
        this.authKey = builder.authKey;
        this.authSwitch = builder.authSwitch;
        this.callbackQueueName = builder.callbackQueueName;
        this.callbackType = builder.callbackType;
        this.callbackURL = builder.callbackURL;
        this.eventTypeList = builder.eventTypeList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEventCallbackResponseBody create() {
        return builder().build();
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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String authKey; 
        private String authSwitch; 
        private String callbackQueueName; 
        private String callbackType; 
        private String callbackURL; 
        private String eventTypeList; 
        private String requestId; 

        /**
         * AuthKey.
         */
        public Builder authKey(String authKey) {
            this.authKey = authKey;
            return this;
        }

        /**
         * AuthSwitch.
         */
        public Builder authSwitch(String authSwitch) {
            this.authSwitch = authSwitch;
            return this;
        }

        /**
         * CallbackQueueName.
         */
        public Builder callbackQueueName(String callbackQueueName) {
            this.callbackQueueName = callbackQueueName;
            return this;
        }

        /**
         * CallbackType.
         */
        public Builder callbackType(String callbackType) {
            this.callbackType = callbackType;
            return this;
        }

        /**
         * CallbackURL.
         */
        public Builder callbackURL(String callbackURL) {
            this.callbackURL = callbackURL;
            return this;
        }

        /**
         * EventTypeList.
         */
        public Builder eventTypeList(String eventTypeList) {
            this.eventTypeList = eventTypeList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetEventCallbackResponseBody build() {
            return new GetEventCallbackResponseBody(this);
        } 

    } 

}
