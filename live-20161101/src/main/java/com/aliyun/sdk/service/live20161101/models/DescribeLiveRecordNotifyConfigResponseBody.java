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
 * {@link DescribeLiveRecordNotifyConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveRecordNotifyConfigResponseBody</p>
 */
public class DescribeLiveRecordNotifyConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LiveRecordNotifyConfig")
    private LiveRecordNotifyConfig liveRecordNotifyConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeLiveRecordNotifyConfigResponseBody model) {
            this.liveRecordNotifyConfig = model.liveRecordNotifyConfig;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The configuration of callbacks for live stream recording.</p>
         */
        public Builder liveRecordNotifyConfig(LiveRecordNotifyConfig liveRecordNotifyConfig) {
            this.liveRecordNotifyConfig = liveRecordNotifyConfig;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5056369B-D337-499E-B8B7-B761BD37B08A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveRecordNotifyConfigResponseBody build() {
            return new DescribeLiveRecordNotifyConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveRecordNotifyConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveRecordNotifyConfigResponseBody</p>
     */
    public static class LiveRecordNotifyConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("NeedStatusNotify")
        private Boolean needStatusNotify;

        @com.aliyun.core.annotation.NameInMap("NotifyAuthKey")
        private String notifyAuthKey;

        @com.aliyun.core.annotation.NameInMap("NotifyReqAuth")
        private Boolean notifyReqAuth;

        @com.aliyun.core.annotation.NameInMap("NotifyUrl")
        private String notifyUrl;

        @com.aliyun.core.annotation.NameInMap("OnDemandUrl")
        private String onDemandUrl;

        private LiveRecordNotifyConfig(Builder builder) {
            this.domainName = builder.domainName;
            this.needStatusNotify = builder.needStatusNotify;
            this.notifyAuthKey = builder.notifyAuthKey;
            this.notifyReqAuth = builder.notifyReqAuth;
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
         * @return notifyAuthKey
         */
        public String getNotifyAuthKey() {
            return this.notifyAuthKey;
        }

        /**
         * @return notifyReqAuth
         */
        public Boolean getNotifyReqAuth() {
            return this.notifyReqAuth;
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
            private String notifyAuthKey; 
            private Boolean notifyReqAuth; 
            private String notifyUrl; 
            private String onDemandUrl; 

            private Builder() {
            } 

            private Builder(LiveRecordNotifyConfig model) {
                this.domainName = model.domainName;
                this.needStatusNotify = model.needStatusNotify;
                this.notifyAuthKey = model.notifyAuthKey;
                this.notifyReqAuth = model.notifyReqAuth;
                this.notifyUrl = model.notifyUrl;
                this.onDemandUrl = model.onDemandUrl;
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
             * <p>Indicates whether recording status callbacks are enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong> (default)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder needStatusNotify(Boolean needStatusNotify) {
                this.needStatusNotify = needStatusNotify;
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
            public Builder notifyReqAuth(Boolean notifyReqAuth) {
                this.notifyReqAuth = notifyReqAuth;
                return this;
            }

            /**
             * <p>The recording callback URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://learn.aliyundoc.com/examplecallback.action">http://learn.aliyundoc.com/examplecallback.action</a></p>
             */
            public Builder notifyUrl(String notifyUrl) {
                this.notifyUrl = notifyUrl;
                return this;
            }

            /**
             * <p>The callback URL for on-demand recording.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://guide.aliyundoc.com/ondemandcallback.action">http://guide.aliyundoc.com/ondemandcallback.action</a></p>
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
