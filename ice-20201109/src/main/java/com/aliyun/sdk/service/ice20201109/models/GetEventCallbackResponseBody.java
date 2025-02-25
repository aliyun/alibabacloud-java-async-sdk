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
         * <p>The authentication key. This parameter is returned only for HTTP callbacks.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey001</p>
         */
        public Builder authKey(String authKey) {
            this.authKey = authKey;
            return this;
        }

        /**
         * <p>Specifies whether callback authentication is enabled. This parameter is returned only for <strong>HTTP</strong> callbacks. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder authSwitch(String authSwitch) {
            this.authSwitch = authSwitch;
            return this;
        }

        /**
         * <p>The name of the Simple Message Queue (SMQ) queue to which callback messages are sent.</p>
         * 
         * <strong>example:</strong>
         * <p>ice-callback-queue</p>
         */
        public Builder callbackQueueName(String callbackQueueName) {
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
            this.callbackType = callbackType;
            return this;
        }

        /**
         * <p>The callback URL to which event notifications are sent.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxx.yyy/callback">http://xxx.yyy/callback</a></p>
         */
        public Builder callbackURL(String callbackURL) {
            this.callbackURL = callbackURL;
            return this;
        }

        /**
         * <p>The type of the callback event. Multiple values are separated with commas (,). For more information about callback event types, see <a href="https://help.aliyun.com/document_detail/610204.html">Event notification content</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ProduceMediaComplete,TranscodeComplete</p>
         */
        public Builder eventTypeList(String eventTypeList) {
            this.eventTypeList = eventTypeList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
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
