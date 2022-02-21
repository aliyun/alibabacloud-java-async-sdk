// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveStreamDelayConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamDelayConfigResponseBody</p>
 */
public class DescribeLiveStreamDelayConfigResponseBody extends TeaModel {
    @NameInMap("LiveStreamFlvDelayConfig")
    private LiveStreamFlvDelayConfig liveStreamFlvDelayConfig;

    @NameInMap("LiveStreamHlsDelayConfig")
    private LiveStreamHlsDelayConfig liveStreamHlsDelayConfig;

    @NameInMap("LiveStreamRtmpDelayConfig")
    private LiveStreamRtmpDelayConfig liveStreamRtmpDelayConfig;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLiveStreamDelayConfigResponseBody(Builder builder) {
        this.liveStreamFlvDelayConfig = builder.liveStreamFlvDelayConfig;
        this.liveStreamHlsDelayConfig = builder.liveStreamHlsDelayConfig;
        this.liveStreamRtmpDelayConfig = builder.liveStreamRtmpDelayConfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamDelayConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return liveStreamFlvDelayConfig
     */
    public LiveStreamFlvDelayConfig getLiveStreamFlvDelayConfig() {
        return this.liveStreamFlvDelayConfig;
    }

    /**
     * @return liveStreamHlsDelayConfig
     */
    public LiveStreamHlsDelayConfig getLiveStreamHlsDelayConfig() {
        return this.liveStreamHlsDelayConfig;
    }

    /**
     * @return liveStreamRtmpDelayConfig
     */
    public LiveStreamRtmpDelayConfig getLiveStreamRtmpDelayConfig() {
        return this.liveStreamRtmpDelayConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LiveStreamFlvDelayConfig liveStreamFlvDelayConfig; 
        private LiveStreamHlsDelayConfig liveStreamHlsDelayConfig; 
        private LiveStreamRtmpDelayConfig liveStreamRtmpDelayConfig; 
        private String requestId; 

        /**
         * LiveStreamFlvDelayConfig.
         */
        public Builder liveStreamFlvDelayConfig(LiveStreamFlvDelayConfig liveStreamFlvDelayConfig) {
            this.liveStreamFlvDelayConfig = liveStreamFlvDelayConfig;
            return this;
        }

        /**
         * LiveStreamHlsDelayConfig.
         */
        public Builder liveStreamHlsDelayConfig(LiveStreamHlsDelayConfig liveStreamHlsDelayConfig) {
            this.liveStreamHlsDelayConfig = liveStreamHlsDelayConfig;
            return this;
        }

        /**
         * LiveStreamRtmpDelayConfig.
         */
        public Builder liveStreamRtmpDelayConfig(LiveStreamRtmpDelayConfig liveStreamRtmpDelayConfig) {
            this.liveStreamRtmpDelayConfig = liveStreamRtmpDelayConfig;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveStreamDelayConfigResponseBody build() {
            return new DescribeLiveStreamDelayConfigResponseBody(this);
        } 

    } 

    public static class LiveStreamFlvDelayConfig extends TeaModel {
        @NameInMap("Delay")
        private Integer delay;

        @NameInMap("Level")
        private String level;

        private LiveStreamFlvDelayConfig(Builder builder) {
            this.delay = builder.delay;
            this.level = builder.level;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveStreamFlvDelayConfig create() {
            return builder().build();
        }

        /**
         * @return delay
         */
        public Integer getDelay() {
            return this.delay;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        public static final class Builder {
            private Integer delay; 
            private String level; 

            /**
             * Delay.
             */
            public Builder delay(Integer delay) {
                this.delay = delay;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            public LiveStreamFlvDelayConfig build() {
                return new LiveStreamFlvDelayConfig(this);
            } 

        } 

    }
    public static class LiveStreamHlsDelayConfig extends TeaModel {
        @NameInMap("Delay")
        private Integer delay;

        @NameInMap("Level")
        private String level;

        private LiveStreamHlsDelayConfig(Builder builder) {
            this.delay = builder.delay;
            this.level = builder.level;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveStreamHlsDelayConfig create() {
            return builder().build();
        }

        /**
         * @return delay
         */
        public Integer getDelay() {
            return this.delay;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        public static final class Builder {
            private Integer delay; 
            private String level; 

            /**
             * Delay.
             */
            public Builder delay(Integer delay) {
                this.delay = delay;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            public LiveStreamHlsDelayConfig build() {
                return new LiveStreamHlsDelayConfig(this);
            } 

        } 

    }
    public static class LiveStreamRtmpDelayConfig extends TeaModel {
        @NameInMap("Delay")
        private Integer delay;

        @NameInMap("Level")
        private String level;

        private LiveStreamRtmpDelayConfig(Builder builder) {
            this.delay = builder.delay;
            this.level = builder.level;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveStreamRtmpDelayConfig create() {
            return builder().build();
        }

        /**
         * @return delay
         */
        public Integer getDelay() {
            return this.delay;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        public static final class Builder {
            private Integer delay; 
            private String level; 

            /**
             * Delay.
             */
            public Builder delay(Integer delay) {
                this.delay = delay;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            public LiveStreamRtmpDelayConfig build() {
                return new LiveStreamRtmpDelayConfig(this);
            } 

        } 

    }
}
