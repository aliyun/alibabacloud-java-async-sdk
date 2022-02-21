// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveStreamSpecificConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamSpecificConfigResponseBody</p>
 */
public class DescribeLiveStreamSpecificConfigResponseBody extends TeaModel {
    @NameInMap("LiveStreamSpecificConfigList")
    private LiveStreamSpecificConfigList liveStreamSpecificConfigList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLiveStreamSpecificConfigResponseBody(Builder builder) {
        this.liveStreamSpecificConfigList = builder.liveStreamSpecificConfigList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamSpecificConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return liveStreamSpecificConfigList
     */
    public LiveStreamSpecificConfigList getLiveStreamSpecificConfigList() {
        return this.liveStreamSpecificConfigList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LiveStreamSpecificConfigList liveStreamSpecificConfigList; 
        private String requestId; 

        /**
         * LiveStreamSpecificConfigList.
         */
        public Builder liveStreamSpecificConfigList(LiveStreamSpecificConfigList liveStreamSpecificConfigList) {
            this.liveStreamSpecificConfigList = liveStreamSpecificConfigList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveStreamSpecificConfigResponseBody build() {
            return new DescribeLiveStreamSpecificConfigResponseBody(this);
        } 

    } 

    public static class LiveStreamSpecificConfig extends TeaModel {
        @NameInMap("ConfigName")
        private String configName;

        @NameInMap("ConfigStatus")
        private String configStatus;

        @NameInMap("ConfigValue")
        private String configValue;

        @NameInMap("DomainName")
        private String domainName;

        private LiveStreamSpecificConfig(Builder builder) {
            this.configName = builder.configName;
            this.configStatus = builder.configStatus;
            this.configValue = builder.configValue;
            this.domainName = builder.domainName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveStreamSpecificConfig create() {
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

            public LiveStreamSpecificConfig build() {
                return new LiveStreamSpecificConfig(this);
            } 

        } 

    }
    public static class LiveStreamSpecificConfigList extends TeaModel {
        @NameInMap("LiveStreamSpecificConfig")
        private java.util.List < LiveStreamSpecificConfig> liveStreamSpecificConfig;

        private LiveStreamSpecificConfigList(Builder builder) {
            this.liveStreamSpecificConfig = builder.liveStreamSpecificConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveStreamSpecificConfigList create() {
            return builder().build();
        }

        /**
         * @return liveStreamSpecificConfig
         */
        public java.util.List < LiveStreamSpecificConfig> getLiveStreamSpecificConfig() {
            return this.liveStreamSpecificConfig;
        }

        public static final class Builder {
            private java.util.List < LiveStreamSpecificConfig> liveStreamSpecificConfig; 

            /**
             * LiveStreamSpecificConfig.
             */
            public Builder liveStreamSpecificConfig(java.util.List < LiveStreamSpecificConfig> liveStreamSpecificConfig) {
                this.liveStreamSpecificConfig = liveStreamSpecificConfig;
                return this;
            }

            public LiveStreamSpecificConfigList build() {
                return new LiveStreamSpecificConfigList(this);
            } 

        } 

    }
}
