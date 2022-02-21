// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveStreamsNotifyUrlConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamsNotifyUrlConfigResponseBody</p>
 */
public class DescribeLiveStreamsNotifyUrlConfigResponseBody extends TeaModel {
    @NameInMap("LiveStreamsNotifyConfig")
    private LiveStreamsNotifyConfig liveStreamsNotifyConfig;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLiveStreamsNotifyUrlConfigResponseBody(Builder builder) {
        this.liveStreamsNotifyConfig = builder.liveStreamsNotifyConfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamsNotifyUrlConfigResponseBody create() {
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

        public DescribeLiveStreamsNotifyUrlConfigResponseBody build() {
            return new DescribeLiveStreamsNotifyUrlConfigResponseBody(this);
        } 

    } 

    public static class LiveStreamsNotifyConfig extends TeaModel {
        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("NotifyAuthKey")
        private String notifyAuthKey;

        @NameInMap("NotifyReqAuth")
        private String notifyReqAuth;

        @NameInMap("NotifyUrl")
        private String notifyUrl;

        private LiveStreamsNotifyConfig(Builder builder) {
            this.domainName = builder.domainName;
            this.notifyAuthKey = builder.notifyAuthKey;
            this.notifyReqAuth = builder.notifyReqAuth;
            this.notifyUrl = builder.notifyUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveStreamsNotifyConfig create() {
            return builder().build();
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return notifyAuthKey
         */
        public String getNotifyAuthKey() {
            return this.notifyAuthKey;
        }

        /**
         * @return notifyReqAuth
         */
        public String getNotifyReqAuth() {
            return this.notifyReqAuth;
        }

        /**
         * @return notifyUrl
         */
        public String getNotifyUrl() {
            return this.notifyUrl;
        }

        public static final class Builder {
            private String domainName; 
            private String notifyAuthKey; 
            private String notifyReqAuth; 
            private String notifyUrl; 

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * NotifyAuthKey.
             */
            public Builder notifyAuthKey(String notifyAuthKey) {
                this.notifyAuthKey = notifyAuthKey;
                return this;
            }

            /**
             * NotifyReqAuth.
             */
            public Builder notifyReqAuth(String notifyReqAuth) {
                this.notifyReqAuth = notifyReqAuth;
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
