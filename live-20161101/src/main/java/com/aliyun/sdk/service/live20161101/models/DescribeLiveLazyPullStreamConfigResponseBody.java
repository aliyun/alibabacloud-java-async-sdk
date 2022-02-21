// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveLazyPullStreamConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveLazyPullStreamConfigResponseBody</p>
 */
public class DescribeLiveLazyPullStreamConfigResponseBody extends TeaModel {
    @NameInMap("LiveLazyPullConfigList")
    private LiveLazyPullConfigList liveLazyPullConfigList;

    @NameInMap("RequestId")
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

        /**
         * LiveLazyPullConfigList.
         */
        public Builder liveLazyPullConfigList(LiveLazyPullConfigList liveLazyPullConfigList) {
            this.liveLazyPullConfigList = liveLazyPullConfigList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveLazyPullStreamConfigResponseBody build() {
            return new DescribeLiveLazyPullStreamConfigResponseBody(this);
        } 

    } 

    public static class LiveLazyPullConfig extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("PullAppName")
        private String pullAppName;

        @NameInMap("PullDomainName")
        private String pullDomainName;

        @NameInMap("PullProtocol")
        private String pullProtocol;

        private LiveLazyPullConfig(Builder builder) {
            this.appName = builder.appName;
            this.domainName = builder.domainName;
            this.pullAppName = builder.pullAppName;
            this.pullDomainName = builder.pullDomainName;
            this.pullProtocol = builder.pullProtocol;
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

        public static final class Builder {
            private String appName; 
            private String domainName; 
            private String pullAppName; 
            private String pullDomainName; 
            private String pullProtocol; 

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
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
             * PullAppName.
             */
            public Builder pullAppName(String pullAppName) {
                this.pullAppName = pullAppName;
                return this;
            }

            /**
             * PullDomainName.
             */
            public Builder pullDomainName(String pullDomainName) {
                this.pullDomainName = pullDomainName;
                return this;
            }

            /**
             * PullProtocol.
             */
            public Builder pullProtocol(String pullProtocol) {
                this.pullProtocol = pullProtocol;
                return this;
            }

            public LiveLazyPullConfig build() {
                return new LiveLazyPullConfig(this);
            } 

        } 

    }
    public static class LiveLazyPullConfigList extends TeaModel {
        @NameInMap("LiveLazyPullConfig")
        private java.util.List < LiveLazyPullConfig> liveLazyPullConfig;

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
        public java.util.List < LiveLazyPullConfig> getLiveLazyPullConfig() {
            return this.liveLazyPullConfig;
        }

        public static final class Builder {
            private java.util.List < LiveLazyPullConfig> liveLazyPullConfig; 

            /**
             * LiveLazyPullConfig.
             */
            public Builder liveLazyPullConfig(java.util.List < LiveLazyPullConfig> liveLazyPullConfig) {
                this.liveLazyPullConfig = liveLazyPullConfig;
                return this;
            }

            public LiveLazyPullConfigList build() {
                return new LiveLazyPullConfigList(this);
            } 

        } 

    }
}
