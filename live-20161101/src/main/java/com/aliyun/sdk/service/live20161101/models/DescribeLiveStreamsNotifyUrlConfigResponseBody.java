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
 * {@link DescribeLiveStreamsNotifyUrlConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamsNotifyUrlConfigResponseBody</p>
 */
public class DescribeLiveStreamsNotifyUrlConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LiveStreamsNotifyConfig")
    private LiveStreamsNotifyConfig liveStreamsNotifyConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeLiveStreamsNotifyUrlConfigResponseBody model) {
            this.liveStreamsNotifyConfig = model.liveStreamsNotifyConfig;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The callback configuration.</p>
         */
        public Builder liveStreamsNotifyConfig(LiveStreamsNotifyConfig liveStreamsNotifyConfig) {
            this.liveStreamsNotifyConfig = liveStreamsNotifyConfig;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40A4F36D-A7CC-473A-88E7-154F92242566</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveStreamsNotifyUrlConfigResponseBody build() {
            return new DescribeLiveStreamsNotifyUrlConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveStreamsNotifyUrlConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamsNotifyUrlConfigResponseBody</p>
     */
    public static class LiveStreamsNotifyConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("ExceptionNotifyUrl")
        private String exceptionNotifyUrl;

        @com.aliyun.core.annotation.NameInMap("NotifyAuthKey")
        private String notifyAuthKey;

        @com.aliyun.core.annotation.NameInMap("NotifyReqAuth")
        private String notifyReqAuth;

        @com.aliyun.core.annotation.NameInMap("NotifyUrl")
        private String notifyUrl;

        private LiveStreamsNotifyConfig(Builder builder) {
            this.domainName = builder.domainName;
            this.exceptionNotifyUrl = builder.exceptionNotifyUrl;
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
         * @return exceptionNotifyUrl
         */
        public String getExceptionNotifyUrl() {
            return this.exceptionNotifyUrl;
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
            private String exceptionNotifyUrl; 
            private String notifyAuthKey; 
            private String notifyReqAuth; 
            private String notifyUrl; 

            private Builder() {
            } 

            private Builder(LiveStreamsNotifyConfig model) {
                this.domainName = model.domainName;
                this.exceptionNotifyUrl = model.exceptionNotifyUrl;
                this.notifyAuthKey = model.notifyAuthKey;
                this.notifyReqAuth = model.notifyReqAuth;
                this.notifyUrl = model.notifyUrl;
            } 

            /**
             * <p>The ingest domain.</p>
             * 
             * <strong>example:</strong>
             * <p>demo.aliyundoc.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>Exception event callback URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://4a7e5f08.r37.cpolar.top/live/Record/call-back/streamException">https://4a7e5f08.r37.cpolar.top/live/Record/call-back/streamException</a></p>
             */
            public Builder exceptionNotifyUrl(String exceptionNotifyUrl) {
                this.exceptionNotifyUrl = exceptionNotifyUrl;
                return this;
            }

            /**
             * <p>The authentication key.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder notifyAuthKey(String notifyAuthKey) {
                this.notifyAuthKey = notifyAuthKey;
                return this;
            }

            /**
             * <p>Indicates whether callback authentication is enabled. Valid values:</p>
             * <ul>
             * <li>yes</li>
             * <li>no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>yes</p>
             */
            public Builder notifyReqAuth(String notifyReqAuth) {
                this.notifyReqAuth = notifyReqAuth;
                return this;
            }

            /**
             * <p>The callback URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://guide.aliyundoc.com/notify">http://guide.aliyundoc.com/notify</a></p>
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
