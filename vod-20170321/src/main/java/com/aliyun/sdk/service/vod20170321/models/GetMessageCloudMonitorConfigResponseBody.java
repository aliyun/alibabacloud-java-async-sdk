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
 * {@link GetMessageCloudMonitorConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetMessageCloudMonitorConfigResponseBody</p>
 */
public class GetMessageCloudMonitorConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MessageCloudMonitorConfig")
    private MessageCloudMonitorConfig messageCloudMonitorConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetMessageCloudMonitorConfigResponseBody(Builder builder) {
        this.messageCloudMonitorConfig = builder.messageCloudMonitorConfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMessageCloudMonitorConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return messageCloudMonitorConfig
     */
    public MessageCloudMonitorConfig getMessageCloudMonitorConfig() {
        return this.messageCloudMonitorConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MessageCloudMonitorConfig messageCloudMonitorConfig; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetMessageCloudMonitorConfigResponseBody model) {
            this.messageCloudMonitorConfig = model.messageCloudMonitorConfig;
            this.requestId = model.requestId;
        } 

        /**
         * MessageCloudMonitorConfig.
         */
        public Builder messageCloudMonitorConfig(MessageCloudMonitorConfig messageCloudMonitorConfig) {
            this.messageCloudMonitorConfig = messageCloudMonitorConfig;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMessageCloudMonitorConfigResponseBody build() {
            return new GetMessageCloudMonitorConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMessageCloudMonitorConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetMessageCloudMonitorConfigResponseBody</p>
     */
    public static class MessageCloudMonitorConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("EventTypeList")
        private String eventTypeList;

        private MessageCloudMonitorConfig(Builder builder) {
            this.appId = builder.appId;
            this.eventTypeList = builder.eventTypeList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MessageCloudMonitorConfig create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return eventTypeList
         */
        public String getEventTypeList() {
            return this.eventTypeList;
        }

        public static final class Builder {
            private String appId; 
            private String eventTypeList; 

            private Builder() {
            } 

            private Builder(MessageCloudMonitorConfig model) {
                this.appId = model.appId;
                this.eventTypeList = model.eventTypeList;
            } 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * EventTypeList.
             */
            public Builder eventTypeList(String eventTypeList) {
                this.eventTypeList = eventTypeList;
                return this;
            }

            public MessageCloudMonitorConfig build() {
                return new MessageCloudMonitorConfig(this);
            } 

        } 

    }
}
