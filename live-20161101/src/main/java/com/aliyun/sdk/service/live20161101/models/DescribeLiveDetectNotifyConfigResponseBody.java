// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveDetectNotifyConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDetectNotifyConfigResponseBody</p>
 */
public class DescribeLiveDetectNotifyConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LiveDetectNotifyConfig")
    private LiveDetectNotifyConfig liveDetectNotifyConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeLiveDetectNotifyConfigResponseBody model) {
            this.liveDetectNotifyConfig = model.liveDetectNotifyConfig;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The callback configuration.</p>
         */
        public Builder liveDetectNotifyConfig(LiveDetectNotifyConfig liveDetectNotifyConfig) {
            this.liveDetectNotifyConfig = liveDetectNotifyConfig;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveDetectNotifyConfigResponseBody build() {
            return new DescribeLiveDetectNotifyConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveDetectNotifyConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDetectNotifyConfigResponseBody</p>
     */
    public static class LiveDetectNotifyConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("NotifyUrl")
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

            private Builder() {
            } 

            private Builder(LiveDetectNotifyConfig model) {
                this.domainName = model.domainName;
                this.notifyUrl = model.notifyUrl;
            } 

            /**
             * <p>The main streaming domain.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The callback URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://aliyundoc.com">http://aliyundoc.com</a></p>
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
