// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveStreamOptimizedFeatureConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamOptimizedFeatureConfigResponseBody</p>
 */
public class DescribeLiveStreamOptimizedFeatureConfigResponseBody extends TeaModel {
    @NameInMap("LiveStreamOptimizedFeatureConfigList")
    private LiveStreamOptimizedFeatureConfigList liveStreamOptimizedFeatureConfigList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLiveStreamOptimizedFeatureConfigResponseBody(Builder builder) {
        this.liveStreamOptimizedFeatureConfigList = builder.liveStreamOptimizedFeatureConfigList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamOptimizedFeatureConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return liveStreamOptimizedFeatureConfigList
     */
    public LiveStreamOptimizedFeatureConfigList getLiveStreamOptimizedFeatureConfigList() {
        return this.liveStreamOptimizedFeatureConfigList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LiveStreamOptimizedFeatureConfigList liveStreamOptimizedFeatureConfigList; 
        private String requestId; 

        /**
         * LiveStreamOptimizedFeatureConfigList.
         */
        public Builder liveStreamOptimizedFeatureConfigList(LiveStreamOptimizedFeatureConfigList liveStreamOptimizedFeatureConfigList) {
            this.liveStreamOptimizedFeatureConfigList = liveStreamOptimizedFeatureConfigList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveStreamOptimizedFeatureConfigResponseBody build() {
            return new DescribeLiveStreamOptimizedFeatureConfigResponseBody(this);
        } 

    } 

    public static class LiveStreamOptimizedFeatureConfig extends TeaModel {
        @NameInMap("ConfigName")
        private String configName;

        @NameInMap("ConfigStatus")
        private String configStatus;

        @NameInMap("ConfigValue")
        private String configValue;

        @NameInMap("DomainName")
        private String domainName;

        private LiveStreamOptimizedFeatureConfig(Builder builder) {
            this.configName = builder.configName;
            this.configStatus = builder.configStatus;
            this.configValue = builder.configValue;
            this.domainName = builder.domainName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveStreamOptimizedFeatureConfig create() {
            return builder().build();
        }

        /**
         * @return configName
         */
        public String getConfigName() {
            return this.configName;
        }

        /**
         * @return configStatus
         */
        public String getConfigStatus() {
            return this.configStatus;
        }

        /**
         * @return configValue
         */
        public String getConfigValue() {
            return this.configValue;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        public static final class Builder {
            private String configName; 
            private String configStatus; 
            private String configValue; 
            private String domainName; 

            /**
             * ConfigName.
             */
            public Builder configName(String configName) {
                this.configName = configName;
                return this;
            }

            /**
             * ConfigStatus.
             */
            public Builder configStatus(String configStatus) {
                this.configStatus = configStatus;
                return this;
            }

            /**
             * ConfigValue.
             */
            public Builder configValue(String configValue) {
                this.configValue = configValue;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            public LiveStreamOptimizedFeatureConfig build() {
                return new LiveStreamOptimizedFeatureConfig(this);
            } 

        } 

    }
    public static class LiveStreamOptimizedFeatureConfigList extends TeaModel {
        @NameInMap("LiveStreamOptimizedFeatureConfig")
        private java.util.List < LiveStreamOptimizedFeatureConfig> liveStreamOptimizedFeatureConfig;

        private LiveStreamOptimizedFeatureConfigList(Builder builder) {
            this.liveStreamOptimizedFeatureConfig = builder.liveStreamOptimizedFeatureConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveStreamOptimizedFeatureConfigList create() {
            return builder().build();
        }

        /**
         * @return liveStreamOptimizedFeatureConfig
         */
        public java.util.List < LiveStreamOptimizedFeatureConfig> getLiveStreamOptimizedFeatureConfig() {
            return this.liveStreamOptimizedFeatureConfig;
        }

        public static final class Builder {
            private java.util.List < LiveStreamOptimizedFeatureConfig> liveStreamOptimizedFeatureConfig; 

            /**
             * LiveStreamOptimizedFeatureConfig.
             */
            public Builder liveStreamOptimizedFeatureConfig(java.util.List < LiveStreamOptimizedFeatureConfig> liveStreamOptimizedFeatureConfig) {
                this.liveStreamOptimizedFeatureConfig = liveStreamOptimizedFeatureConfig;
                return this;
            }

            public LiveStreamOptimizedFeatureConfigList build() {
                return new LiveStreamOptimizedFeatureConfigList(this);
            } 

        } 

    }
}
