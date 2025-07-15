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
 * {@link DescribeLiveStreamDelayConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamDelayConfigResponseBody</p>
 */
public class DescribeLiveStreamDelayConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LiveStreamFlvDelayConfig")
    private LiveStreamFlvDelayConfig liveStreamFlvDelayConfig;

    @com.aliyun.core.annotation.NameInMap("LiveStreamHlsDelayConfig")
    private LiveStreamHlsDelayConfig liveStreamHlsDelayConfig;

    @com.aliyun.core.annotation.NameInMap("LiveStreamRtmpDelayConfig")
    private LiveStreamRtmpDelayConfig liveStreamRtmpDelayConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeLiveStreamDelayConfigResponseBody model) {
            this.liveStreamFlvDelayConfig = model.liveStreamFlvDelayConfig;
            this.liveStreamHlsDelayConfig = model.liveStreamHlsDelayConfig;
            this.liveStreamRtmpDelayConfig = model.liveStreamRtmpDelayConfig;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The latency of FLV-based playback.</p>
         */
        public Builder liveStreamFlvDelayConfig(LiveStreamFlvDelayConfig liveStreamFlvDelayConfig) {
            this.liveStreamFlvDelayConfig = liveStreamFlvDelayConfig;
            return this;
        }

        /**
         * <p>The latency of HLS-based playback.</p>
         */
        public Builder liveStreamHlsDelayConfig(LiveStreamHlsDelayConfig liveStreamHlsDelayConfig) {
            this.liveStreamHlsDelayConfig = liveStreamHlsDelayConfig;
            return this;
        }

        /**
         * <p>The latency of RTMP-based playback.</p>
         */
        public Builder liveStreamRtmpDelayConfig(LiveStreamRtmpDelayConfig liveStreamRtmpDelayConfig) {
            this.liveStreamRtmpDelayConfig = liveStreamRtmpDelayConfig;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>785C9CB0-EB8A-4912-BBF2-966BEFD32DC3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveStreamDelayConfigResponseBody build() {
            return new DescribeLiveStreamDelayConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveStreamDelayConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamDelayConfigResponseBody</p>
     */
    public static class LiveStreamFlvDelayConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Delay")
        private Integer delay;

        @com.aliyun.core.annotation.NameInMap("Level")
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

            private Builder() {
            } 

            private Builder(LiveStreamFlvDelayConfig model) {
                this.delay = model.delay;
                this.level = model.level;
            } 

            /**
             * <p>The playback latency. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder delay(Integer delay) {
                this.delay = delay;
                return this;
            }

            /**
             * <p>The latency level. Valid values:</p>
             * <ul>
             * <li><strong>short</strong>: The latency is less than or equal to 4 seconds.</li>
             * <li><strong>medium</strong>: The latency is greater than 4 seconds, and less than or equal to 8 seconds.</li>
             * <li><strong>long</strong>: The latency is greater than 8 seconds.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>medium</p>
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
    /**
     * 
     * {@link DescribeLiveStreamDelayConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamDelayConfigResponseBody</p>
     */
    public static class LiveStreamHlsDelayConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Delay")
        private Integer delay;

        @com.aliyun.core.annotation.NameInMap("Level")
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

            private Builder() {
            } 

            private Builder(LiveStreamHlsDelayConfig model) {
                this.delay = model.delay;
                this.level = model.level;
            } 

            /**
             * <p>The playback latency. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder delay(Integer delay) {
                this.delay = delay;
                return this;
            }

            /**
             * <p>The latency level. Valid values:</p>
             * <ul>
             * <li><strong>short</strong>: The latency is less than or equal to 4 seconds.</li>
             * <li><strong>medium</strong>: The latency is greater than 4 seconds, and less than or equal to 8 seconds.</li>
             * <li><strong>long</strong>: The latency is greater than 8 seconds.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>short</p>
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
    /**
     * 
     * {@link DescribeLiveStreamDelayConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamDelayConfigResponseBody</p>
     */
    public static class LiveStreamRtmpDelayConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Delay")
        private Integer delay;

        @com.aliyun.core.annotation.NameInMap("Level")
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

            private Builder() {
            } 

            private Builder(LiveStreamRtmpDelayConfig model) {
                this.delay = model.delay;
                this.level = model.level;
            } 

            /**
             * <p>The playback latency. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder delay(Integer delay) {
                this.delay = delay;
                return this;
            }

            /**
             * <p>The latency level. Valid values:</p>
             * <ul>
             * <li><strong>short</strong>: The latency is less than or equal to 4 seconds.</li>
             * <li><strong>medium</strong>: The latency is greater than 4 seconds, and less than or equal to 8 seconds.</li>
             * <li><strong>long</strong>: The latency is greater than 8 seconds.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>short</p>
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
