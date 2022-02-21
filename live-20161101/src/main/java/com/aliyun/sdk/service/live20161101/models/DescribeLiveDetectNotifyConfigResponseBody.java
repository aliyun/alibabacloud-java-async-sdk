// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveDetectNotifyConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDetectNotifyConfigResponseBody</p>
 */
public class DescribeLiveDetectNotifyConfigResponseBody extends TeaModel {
    @NameInMap("LiveDetectNotifyConfig")
    private LiveDetectNotifyConfig liveDetectNotifyConfig;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLiveDetectNotifyConfigResponseBody(Builder builder) {
        this.liveDetectNotifyConfig = builder.liveDetectNotifyConfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDetectNotifyConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return liveDetectNotifyConfig
     */
    public LiveDetectNotifyConfig getLiveDetectNotifyConfig() {
        return this.liveDetectNotifyConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LiveDetectNotifyConfig liveDetectNotifyConfig; 
        private String requestId; 

        /**
         * LiveDetectNotifyConfig.
         */
        public Builder liveDetectNotifyConfig(LiveDetectNotifyConfig liveDetectNotifyConfig) {
            this.liveDetectNotifyConfig = liveDetectNotifyConfig;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveDetectNotifyConfigResponseBody build() {
            return new DescribeLiveDetectNotifyConfigResponseBody(this);
        } 

    } 

    public static class LiveDetectNotifyConfig extends TeaModel {
        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("NotifyUrl")
        private String notifyUrl;

        private LiveDetectNotifyConfig(Builder builder) {
            this.domainName = builder.domainName;
            this.notifyUrl = builder.notifyUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveDetectNotifyConfig create() {
            return builder().build();
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
            private String domainName; 
            private String notifyUrl; 

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

            public LiveDetectNotifyConfig build() {
                return new LiveDetectNotifyConfig(this);
            } 

        } 

    }
}
