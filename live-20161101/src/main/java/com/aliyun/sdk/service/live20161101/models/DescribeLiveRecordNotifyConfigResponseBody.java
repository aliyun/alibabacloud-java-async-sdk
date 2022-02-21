// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveRecordNotifyConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveRecordNotifyConfigResponseBody</p>
 */
public class DescribeLiveRecordNotifyConfigResponseBody extends TeaModel {
    @NameInMap("LiveRecordNotifyConfig")
    private LiveRecordNotifyConfig liveRecordNotifyConfig;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLiveRecordNotifyConfigResponseBody(Builder builder) {
        this.liveRecordNotifyConfig = builder.liveRecordNotifyConfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveRecordNotifyConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return liveRecordNotifyConfig
     */
    public LiveRecordNotifyConfig getLiveRecordNotifyConfig() {
        return this.liveRecordNotifyConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LiveRecordNotifyConfig liveRecordNotifyConfig; 
        private String requestId; 

        /**
         * LiveRecordNotifyConfig.
         */
        public Builder liveRecordNotifyConfig(LiveRecordNotifyConfig liveRecordNotifyConfig) {
            this.liveRecordNotifyConfig = liveRecordNotifyConfig;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveRecordNotifyConfigResponseBody build() {
            return new DescribeLiveRecordNotifyConfigResponseBody(this);
        } 

    } 

    public static class LiveRecordNotifyConfig extends TeaModel {
        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("NeedStatusNotify")
        private Boolean needStatusNotify;

        @NameInMap("NotifyUrl")
        private String notifyUrl;

        @NameInMap("OnDemandUrl")
        private String onDemandUrl;

        private LiveRecordNotifyConfig(Builder builder) {
            this.domainName = builder.domainName;
            this.needStatusNotify = builder.needStatusNotify;
            this.notifyUrl = builder.notifyUrl;
            this.onDemandUrl = builder.onDemandUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveRecordNotifyConfig create() {
            return builder().build();
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return needStatusNotify
         */
        public Boolean getNeedStatusNotify() {
            return this.needStatusNotify;
        }

        /**
         * @return notifyUrl
         */
        public String getNotifyUrl() {
            return this.notifyUrl;
        }

        /**
         * @return onDemandUrl
         */
        public String getOnDemandUrl() {
            return this.onDemandUrl;
        }

        public static final class Builder {
            private String domainName; 
            private Boolean needStatusNotify; 
            private String notifyUrl; 
            private String onDemandUrl; 

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * NeedStatusNotify.
             */
            public Builder needStatusNotify(Boolean needStatusNotify) {
                this.needStatusNotify = needStatusNotify;
                return this;
            }

            /**
             * NotifyUrl.
             */
            public Builder notifyUrl(String notifyUrl) {
                this.notifyUrl = notifyUrl;
                return this;
            }

            /**
             * OnDemandUrl.
             */
            public Builder onDemandUrl(String onDemandUrl) {
                this.onDemandUrl = onDemandUrl;
                return this;
            }

            public LiveRecordNotifyConfig build() {
                return new LiveRecordNotifyConfig(this);
            } 

        } 

    }
}
