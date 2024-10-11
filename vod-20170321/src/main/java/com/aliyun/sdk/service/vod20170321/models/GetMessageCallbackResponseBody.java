// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetMessageCallbackResponseBody} extends {@link TeaModel}
 *
 * <p>GetMessageCallbackResponseBody</p>
 */
public class GetMessageCallbackResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MessageCallback")
    private MessageCallback messageCallback;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetMessageCallbackResponseBody(Builder builder) {
        this.messageCallback = builder.messageCallback;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMessageCallbackResponseBody create() {
        return builder().build();
    }

    /**
     * @return messageCallback
     */
    public MessageCallback getMessageCallback() {
        return this.messageCallback;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MessageCallback messageCallback; 
        private String requestId; 

        /**
         * <p>The configuration of the event notification.</p>
         */
        public Builder messageCallback(MessageCallback messageCallback) {
            this.messageCallback = messageCallback;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>272A222A-F7F7-4A3E-****-F531574F1234</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMessageCallbackResponseBody build() {
            return new GetMessageCallbackResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMessageCallbackResponseBody} extends {@link TeaModel}
     *
     * <p>GetMessageCallbackResponseBody</p>
     */
    public static class MessageCallback extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AuthKey")
        private String authKey;

        @com.aliyun.core.annotation.NameInMap("AuthSwitch")
        private String authSwitch;

        @com.aliyun.core.annotation.NameInMap("CallbackType")
        private String callbackType;

        @com.aliyun.core.annotation.NameInMap("CallbackURL")
        private String callbackURL;

        @com.aliyun.core.annotation.NameInMap("EventTypeList")
        private String eventTypeList;

        @com.aliyun.core.annotation.NameInMap("MnsEndpoint")
        private String mnsEndpoint;

        @com.aliyun.core.annotation.NameInMap("MnsQueueName")
        private String mnsQueueName;

        private MessageCallback(Builder builder) {
            this.appId = builder.appId;
            this.authKey = builder.authKey;
            this.authSwitch = builder.authSwitch;
            this.callbackType = builder.callbackType;
            this.callbackURL = builder.callbackURL;
            this.eventTypeList = builder.eventTypeList;
            this.mnsEndpoint = builder.mnsEndpoint;
            this.mnsQueueName = builder.mnsQueueName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MessageCallback create() {
            return builder().build();
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

        public static final class Builder {
            private String appId; 
            private String authKey; 
            private String authSwitch; 
            private String callbackType; 
            private String callbackURL; 
            private String eventTypeList; 
            private String mnsEndpoint; 
            private String mnsQueueName; 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>app-1000000</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The cryptographic key. This parameter is returned only for HTTP callbacks.</p>
             * 
             * <strong>example:</strong>
             * <p>12345678abc</p>
             */
            public Builder authKey(String authKey) {
                this.authKey = authKey;
                return this;
            }

            /**
             * <p>Indicates whether callback authentication is enabled. This parameter is returned only for HTTP callbacks. Valid values:</p>
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
             * <p>The callback URL. This parameter is returned only for HTTP callbacks.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://test.com/test">http://test.com/test</a></p>
             */
            public Builder callbackURL(String callbackURL) {
                this.callbackURL = callbackURL;
                return this;
            }

            /**
             * <p>The type of the callback event.</p>
             * 
             * <strong>example:</strong>
             * <p>FileUploadComplete,StreamTranscodeComplete,TranscodeComplete,SnapshotComplete,AIComplete,AddLiveRecordVideoComplete,CreateAuditComplete,UploadByURLComplete,ProduceMediaComplete,LiveRecordVideoComposeStart,ImageUploadComplete,VideoAnalysisComplete</p>
             */
            public Builder eventTypeList(String eventTypeList) {
                this.eventTypeList = eventTypeList;
                return this;
            }

            /**
             * <p>The public endpoint of MNS. This parameter is returned only for MNS callbacks.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://1234567.mns.cn-shanghai-internal.aliyuncs.com/">http://1234567.mns.cn-shanghai-internal.aliyuncs.com/</a></p>
             */
            public Builder mnsEndpoint(String mnsEndpoint) {
                this.mnsEndpoint = mnsEndpoint;
                return this;
            }

            /**
             * <p>The name of the Message Service (MNS) queue. This parameter is returned only for MNS callbacks.</p>
             * 
             * <strong>example:</strong>
             * <p>vodcallback</p>
             */
            public Builder mnsQueueName(String mnsQueueName) {
                this.mnsQueueName = mnsQueueName;
                return this;
            }

            public MessageCallback build() {
                return new MessageCallback(this);
            } 

        } 

    }
}
