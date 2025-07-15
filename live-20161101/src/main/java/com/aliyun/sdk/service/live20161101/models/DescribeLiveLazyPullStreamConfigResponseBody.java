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
 * {@link DescribeLiveLazyPullStreamConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveLazyPullStreamConfigResponseBody</p>
 */
public class DescribeLiveLazyPullStreamConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LiveLazyPullConfigList")
    private LiveLazyPullConfigList liveLazyPullConfigList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLiveLazyPullStreamConfigResponseBody(Builder builder) {
        this.liveLazyPullConfigList = builder.liveLazyPullConfigList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveLazyPullStreamConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return liveLazyPullConfigList
     */
    public LiveLazyPullConfigList getLiveLazyPullConfigList() {
        return this.liveLazyPullConfigList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LiveLazyPullConfigList liveLazyPullConfigList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeLiveLazyPullStreamConfigResponseBody model) {
            this.liveLazyPullConfigList = model.liveLazyPullConfigList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The configurations of triggered stream pulling.</p>
         */
        public Builder liveLazyPullConfigList(LiveLazyPullConfigList liveLazyPullConfigList) {
            this.liveLazyPullConfigList = liveLazyPullConfigList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A3136B58-5876-4168-83CA-B562781981A0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveLazyPullStreamConfigResponseBody build() {
            return new DescribeLiveLazyPullStreamConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveLazyPullStreamConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveLazyPullStreamConfigResponseBody</p>
     */
    public static class LiveLazyPullConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("PullAppName")
        private String pullAppName;

        @com.aliyun.core.annotation.NameInMap("PullArgs")
        private String pullArgs;

        @com.aliyun.core.annotation.NameInMap("PullDomainName")
        private String pullDomainName;

        @com.aliyun.core.annotation.NameInMap("PullProtocol")
        private String pullProtocol;

        @com.aliyun.core.annotation.NameInMap("TranscodeLazy")
        private String transcodeLazy;

        private LiveLazyPullConfig(Builder builder) {
            this.appName = builder.appName;
            this.domainName = builder.domainName;
            this.pullAppName = builder.pullAppName;
            this.pullArgs = builder.pullArgs;
            this.pullDomainName = builder.pullDomainName;
            this.pullProtocol = builder.pullProtocol;
            this.transcodeLazy = builder.transcodeLazy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveLazyPullConfig create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return pullAppName
         */
        public String getPullAppName() {
            return this.pullAppName;
        }

        /**
         * @return pullArgs
         */
        public String getPullArgs() {
            return this.pullArgs;
        }

        /**
         * @return pullDomainName
         */
        public String getPullDomainName() {
            return this.pullDomainName;
        }

        /**
         * @return pullProtocol
         */
        public String getPullProtocol() {
            return this.pullProtocol;
        }

        /**
         * @return transcodeLazy
         */
        public String getTranscodeLazy() {
            return this.transcodeLazy;
        }

        public static final class Builder {
            private String appName; 
            private String domainName; 
            private String pullAppName; 
            private String pullArgs; 
            private String pullDomainName; 
            private String pullProtocol; 
            private String transcodeLazy; 

            private Builder() {
            } 

            private Builder(LiveLazyPullConfig model) {
                this.appName = model.appName;
                this.domainName = model.domainName;
                this.pullAppName = model.pullAppName;
                this.pullArgs = model.pullArgs;
                this.pullDomainName = model.pullDomainName;
                this.pullProtocol = model.pullProtocol;
                this.transcodeLazy = model.transcodeLazy;
            } 

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>liveApp****</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
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
             * <p>The name of the application for back-to-origin stream pulling. If the application specified in the streaming URL is used, this parameter is left empty.</p>
             * 
             * <strong>example:</strong>
             * <p>livePullApp****</p>
             */
            public Builder pullAppName(String pullAppName) {
                this.pullAppName = pullAppName;
                return this;
            }

            /**
             * <p>The parameters of back-to-origin stream pulling.</p>
             * 
             * <strong>example:</strong>
             * <p>k=v</p>
             */
            public Builder pullArgs(String pullArgs) {
                this.pullArgs = pullArgs;
                return this;
            }

            /**
             * <p>The domain name for back-to-origin stream pulling.</p>
             * 
             * <strong>example:</strong>
             * <p>guide.aliyundoc.com</p>
             */
            public Builder pullDomainName(String pullDomainName) {
                this.pullDomainName = pullDomainName;
                return this;
            }

            /**
             * <p>The protocol for back-to-origin stream pulling. Valid values:</p>
             * <ul>
             * <li><strong>rtmp</strong></li>
             * <li><strong>httpflv</strong></li>
             * <li><strong>hls</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RTMP</p>
             */
            public Builder pullProtocol(String pullProtocol) {
                this.pullProtocol = pullProtocol;
                return this;
            }

            /**
             * <p>Indicates whether stream pulling is triggered when the transcoded stream is played. Default value: <strong>no</strong>. Valid values:</p>
             * <ul>
             * <li><strong>yes</strong></li>
             * <li><strong>no</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>no</p>
             */
            public Builder transcodeLazy(String transcodeLazy) {
                this.transcodeLazy = transcodeLazy;
                return this;
            }

            public LiveLazyPullConfig build() {
                return new LiveLazyPullConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveLazyPullStreamConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveLazyPullStreamConfigResponseBody</p>
     */
    public static class LiveLazyPullConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LiveLazyPullConfig")
        private java.util.List<LiveLazyPullConfig> liveLazyPullConfig;

        private LiveLazyPullConfigList(Builder builder) {
            this.liveLazyPullConfig = builder.liveLazyPullConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveLazyPullConfigList create() {
            return builder().build();
        }

        /**
         * @return liveLazyPullConfig
         */
        public java.util.List<LiveLazyPullConfig> getLiveLazyPullConfig() {
            return this.liveLazyPullConfig;
        }

        public static final class Builder {
            private java.util.List<LiveLazyPullConfig> liveLazyPullConfig; 

            private Builder() {
            } 

            private Builder(LiveLazyPullConfigList model) {
                this.liveLazyPullConfig = model.liveLazyPullConfig;
            } 

            /**
             * LiveLazyPullConfig.
             */
            public Builder liveLazyPullConfig(java.util.List<LiveLazyPullConfig> liveLazyPullConfig) {
                this.liveLazyPullConfig = liveLazyPullConfig;
                return this;
            }

            public LiveLazyPullConfigList build() {
                return new LiveLazyPullConfigList(this);
            } 

        } 

    }
}
