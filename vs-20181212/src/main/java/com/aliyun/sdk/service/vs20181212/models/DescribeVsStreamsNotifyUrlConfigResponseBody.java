// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVsStreamsNotifyUrlConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVsStreamsNotifyUrlConfigResponseBody</p>
 */
public class DescribeVsStreamsNotifyUrlConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LiveStreamsNotifyConfig")
    private LiveStreamsNotifyConfig liveStreamsNotifyConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeVsStreamsNotifyUrlConfigResponseBody(Builder builder) {
        this.liveStreamsNotifyConfig = builder.liveStreamsNotifyConfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVsStreamsNotifyUrlConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return liveStreamsNotifyConfig
     */
    public LiveStreamsNotifyConfig getLiveStreamsNotifyConfig() {
        return this.liveStreamsNotifyConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LiveStreamsNotifyConfig liveStreamsNotifyConfig; 
        private String requestId; 

        /**
         * LiveStreamsNotifyConfig.
         */
        public Builder liveStreamsNotifyConfig(LiveStreamsNotifyConfig liveStreamsNotifyConfig) {
            this.liveStreamsNotifyConfig = liveStreamsNotifyConfig;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVsStreamsNotifyUrlConfigResponseBody build() {
            return new DescribeVsStreamsNotifyUrlConfigResponseBody(this);
        } 

    } 

    public static class LiveStreamsNotifyConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthKey")
        private String authKey;

        @com.aliyun.core.annotation.NameInMap("AuthType")
        private String authType;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("NotifyUrl")
        private String notifyUrl;

        private LiveStreamsNotifyConfig(Builder builder) {
            this.authKey = builder.authKey;
            this.authType = builder.authType;
            this.domainName = builder.domainName;
            this.notifyUrl = builder.notifyUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveStreamsNotifyConfig create() {
            return builder().build();
        }

        /**
         * @return authKey
         */
        public String getAuthKey() {
            return this.authKey;
        }

        /**
         * @return authType
         */
        public String getAuthType() {
            return this.authType;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return notifyUrl
         */
        public String getNotifyUrl() {
            return this.notifyUrl;
        }

        public static final class Builder {
            private String authKey; 
            private String authType; 
            private String domainName; 
            private String notifyUrl; 

            /**
             * AuthKey.
             */
            public Builder authKey(String authKey) {
                this.authKey = authKey;
                return this;
            }

            /**
             * AuthType.
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * NotifyUrl.
             */
            public Builder notifyUrl(String notifyUrl) {
                this.notifyUrl = notifyUrl;
                return this;
            }

            public LiveStreamsNotifyConfig build() {
                return new LiveStreamsNotifyConfig(this);
            } 

        } 

    }
}
