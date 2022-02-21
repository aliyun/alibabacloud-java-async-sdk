// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveAsrConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveAsrConfigResponseBody</p>
 */
public class DescribeLiveAsrConfigResponseBody extends TeaModel {
    @NameInMap("LiveAsrConfig")
    private LiveAsrConfig liveAsrConfig;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLiveAsrConfigResponseBody(Builder builder) {
        this.liveAsrConfig = builder.liveAsrConfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveAsrConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return liveAsrConfig
     */
    public LiveAsrConfig getLiveAsrConfig() {
        return this.liveAsrConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LiveAsrConfig liveAsrConfig; 
        private String requestId; 

        /**
         * LiveAsrConfig.
         */
        public Builder liveAsrConfig(LiveAsrConfig liveAsrConfig) {
            this.liveAsrConfig = liveAsrConfig;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveAsrConfigResponseBody build() {
            return new DescribeLiveAsrConfigResponseBody(this);
        } 

    } 

    public static class LiveAsrConfigList extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("DomainName")
        private Integer domainName;

        @NameInMap("HttpCallbackURL")
        private String httpCallbackURL;

        @NameInMap("MnsRegion")
        private String mnsRegion;

        @NameInMap("MnsTopic")
        private String mnsTopic;

        @NameInMap("Period")
        private Integer period;

        @NameInMap("StreamName")
        private String streamName;

        private LiveAsrConfigList(Builder builder) {
            this.appName = builder.appName;
            this.domainName = builder.domainName;
            this.httpCallbackURL = builder.httpCallbackURL;
            this.mnsRegion = builder.mnsRegion;
            this.mnsTopic = builder.mnsTopic;
            this.period = builder.period;
            this.streamName = builder.streamName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveAsrConfigList create() {
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
        public Integer getDomainName() {
            return this.domainName;
        }

        /**
         * @return httpCallbackURL
         */
        public String getHttpCallbackURL() {
            return this.httpCallbackURL;
        }

        /**
         * @return mnsRegion
         */
        public String getMnsRegion() {
            return this.mnsRegion;
        }

        /**
         * @return mnsTopic
         */
        public String getMnsTopic() {
            return this.mnsTopic;
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        /**
         * @return streamName
         */
        public String getStreamName() {
            return this.streamName;
        }

        public static final class Builder {
            private String appName; 
            private Integer domainName; 
            private String httpCallbackURL; 
            private String mnsRegion; 
            private String mnsTopic; 
            private Integer period; 
            private String streamName; 

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
            public Builder domainName(Integer domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * HttpCallbackURL.
             */
            public Builder httpCallbackURL(String httpCallbackURL) {
                this.httpCallbackURL = httpCallbackURL;
                return this;
            }

            /**
             * MnsRegion.
             */
            public Builder mnsRegion(String mnsRegion) {
                this.mnsRegion = mnsRegion;
                return this;
            }

            /**
             * MnsTopic.
             */
            public Builder mnsTopic(String mnsTopic) {
                this.mnsTopic = mnsTopic;
                return this;
            }

            /**
             * Period.
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * StreamName.
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            public LiveAsrConfigList build() {
                return new LiveAsrConfigList(this);
            } 

        } 

    }
    public static class LiveAsrConfig extends TeaModel {
        @NameInMap("LiveAsrConfigList")
        private java.util.List < LiveAsrConfigList> liveAsrConfigList;

        private LiveAsrConfig(Builder builder) {
            this.liveAsrConfigList = builder.liveAsrConfigList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveAsrConfig create() {
            return builder().build();
        }

        /**
         * @return liveAsrConfigList
         */
        public java.util.List < LiveAsrConfigList> getLiveAsrConfigList() {
            return this.liveAsrConfigList;
        }

        public static final class Builder {
            private java.util.List < LiveAsrConfigList> liveAsrConfigList; 

            /**
             * LiveAsrConfigList.
             */
            public Builder liveAsrConfigList(java.util.List < LiveAsrConfigList> liveAsrConfigList) {
                this.liveAsrConfigList = liveAsrConfigList;
                return this;
            }

            public LiveAsrConfig build() {
                return new LiveAsrConfig(this);
            } 

        } 

    }
}
