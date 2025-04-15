// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link DescribeRtcChannelMetricResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRtcChannelMetricResponseBody</p>
 */
public class DescribeRtcChannelMetricResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChannelMetricInfo")
    private ChannelMetricInfo channelMetricInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRtcChannelMetricResponseBody(Builder builder) {
        this.channelMetricInfo = builder.channelMetricInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRtcChannelMetricResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelMetricInfo
     */
    public ChannelMetricInfo getChannelMetricInfo() {
        return this.channelMetricInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ChannelMetricInfo channelMetricInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeRtcChannelMetricResponseBody model) {
            this.channelMetricInfo = model.channelMetricInfo;
            this.requestId = model.requestId;
        } 

        /**
         * ChannelMetricInfo.
         */
        public Builder channelMetricInfo(ChannelMetricInfo channelMetricInfo) {
            this.channelMetricInfo = channelMetricInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRtcChannelMetricResponseBody build() {
            return new DescribeRtcChannelMetricResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRtcChannelMetricResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRtcChannelMetricResponseBody</p>
     */
    public static class ChannelMetric extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("PubUserCount")
        private Integer pubUserCount;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("SubUserCount")
        private Integer subUserCount;

        @com.aliyun.core.annotation.NameInMap("UserCount")
        private Integer userCount;

        private ChannelMetric(Builder builder) {
            this.channelId = builder.channelId;
            this.endTime = builder.endTime;
            this.pubUserCount = builder.pubUserCount;
            this.startTime = builder.startTime;
            this.subUserCount = builder.subUserCount;
            this.userCount = builder.userCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChannelMetric create() {
            return builder().build();
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return pubUserCount
         */
        public Integer getPubUserCount() {
            return this.pubUserCount;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return subUserCount
         */
        public Integer getSubUserCount() {
            return this.subUserCount;
        }

        /**
         * @return userCount
         */
        public Integer getUserCount() {
            return this.userCount;
        }

        public static final class Builder {
            private String channelId; 
            private String endTime; 
            private Integer pubUserCount; 
            private String startTime; 
            private Integer subUserCount; 
            private Integer userCount; 

            private Builder() {
            } 

            private Builder(ChannelMetric model) {
                this.channelId = model.channelId;
                this.endTime = model.endTime;
                this.pubUserCount = model.pubUserCount;
                this.startTime = model.startTime;
                this.subUserCount = model.subUserCount;
                this.userCount = model.userCount;
            } 

            /**
             * ChannelId.
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * PubUserCount.
             */
            public Builder pubUserCount(Integer pubUserCount) {
                this.pubUserCount = pubUserCount;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * SubUserCount.
             */
            public Builder subUserCount(Integer subUserCount) {
                this.subUserCount = subUserCount;
                return this;
            }

            /**
             * UserCount.
             */
            public Builder userCount(Integer userCount) {
                this.userCount = userCount;
                return this;
            }

            public ChannelMetric build() {
                return new ChannelMetric(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRtcChannelMetricResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRtcChannelMetricResponseBody</p>
     */
    public static class PubDuration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Audio")
        private Integer audio;

        @com.aliyun.core.annotation.NameInMap("Content")
        private Integer content;

        @com.aliyun.core.annotation.NameInMap("Video1080")
        private Integer video1080;

        @com.aliyun.core.annotation.NameInMap("Video360")
        private Integer video360;

        @com.aliyun.core.annotation.NameInMap("Video720")
        private Integer video720;

        private PubDuration(Builder builder) {
            this.audio = builder.audio;
            this.content = builder.content;
            this.video1080 = builder.video1080;
            this.video360 = builder.video360;
            this.video720 = builder.video720;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PubDuration create() {
            return builder().build();
        }

        /**
         * @return audio
         */
        public Integer getAudio() {
            return this.audio;
        }

        /**
         * @return content
         */
        public Integer getContent() {
            return this.content;
        }

        /**
         * @return video1080
         */
        public Integer getVideo1080() {
            return this.video1080;
        }

        /**
         * @return video360
         */
        public Integer getVideo360() {
            return this.video360;
        }

        /**
         * @return video720
         */
        public Integer getVideo720() {
            return this.video720;
        }

        public static final class Builder {
            private Integer audio; 
            private Integer content; 
            private Integer video1080; 
            private Integer video360; 
            private Integer video720; 

            private Builder() {
            } 

            private Builder(PubDuration model) {
                this.audio = model.audio;
                this.content = model.content;
                this.video1080 = model.video1080;
                this.video360 = model.video360;
                this.video720 = model.video720;
            } 

            /**
             * Audio.
             */
            public Builder audio(Integer audio) {
                this.audio = audio;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(Integer content) {
                this.content = content;
                return this;
            }

            /**
             * Video1080.
             */
            public Builder video1080(Integer video1080) {
                this.video1080 = video1080;
                return this;
            }

            /**
             * Video360.
             */
            public Builder video360(Integer video360) {
                this.video360 = video360;
                return this;
            }

            /**
             * Video720.
             */
            public Builder video720(Integer video720) {
                this.video720 = video720;
                return this;
            }

            public PubDuration build() {
                return new PubDuration(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRtcChannelMetricResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRtcChannelMetricResponseBody</p>
     */
    public static class SubDuration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Audio")
        private Integer audio;

        @com.aliyun.core.annotation.NameInMap("Content")
        private Integer content;

        @com.aliyun.core.annotation.NameInMap("Video1080")
        private Integer video1080;

        @com.aliyun.core.annotation.NameInMap("Video360")
        private Integer video360;

        @com.aliyun.core.annotation.NameInMap("Video720")
        private Integer video720;

        private SubDuration(Builder builder) {
            this.audio = builder.audio;
            this.content = builder.content;
            this.video1080 = builder.video1080;
            this.video360 = builder.video360;
            this.video720 = builder.video720;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubDuration create() {
            return builder().build();
        }

        /**
         * @return audio
         */
        public Integer getAudio() {
            return this.audio;
        }

        /**
         * @return content
         */
        public Integer getContent() {
            return this.content;
        }

        /**
         * @return video1080
         */
        public Integer getVideo1080() {
            return this.video1080;
        }

        /**
         * @return video360
         */
        public Integer getVideo360() {
            return this.video360;
        }

        /**
         * @return video720
         */
        public Integer getVideo720() {
            return this.video720;
        }

        public static final class Builder {
            private Integer audio; 
            private Integer content; 
            private Integer video1080; 
            private Integer video360; 
            private Integer video720; 

            private Builder() {
            } 

            private Builder(SubDuration model) {
                this.audio = model.audio;
                this.content = model.content;
                this.video1080 = model.video1080;
                this.video360 = model.video360;
                this.video720 = model.video720;
            } 

            /**
             * Audio.
             */
            public Builder audio(Integer audio) {
                this.audio = audio;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(Integer content) {
                this.content = content;
                return this;
            }

            /**
             * Video1080.
             */
            public Builder video1080(Integer video1080) {
                this.video1080 = video1080;
                return this;
            }

            /**
             * Video360.
             */
            public Builder video360(Integer video360) {
                this.video360 = video360;
                return this;
            }

            /**
             * Video720.
             */
            public Builder video720(Integer video720) {
                this.video720 = video720;
                return this;
            }

            public SubDuration build() {
                return new SubDuration(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRtcChannelMetricResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRtcChannelMetricResponseBody</p>
     */
    public static class Duration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PubDuration")
        private PubDuration pubDuration;

        @com.aliyun.core.annotation.NameInMap("SubDuration")
        private SubDuration subDuration;

        private Duration(Builder builder) {
            this.pubDuration = builder.pubDuration;
            this.subDuration = builder.subDuration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Duration create() {
            return builder().build();
        }

        /**
         * @return pubDuration
         */
        public PubDuration getPubDuration() {
            return this.pubDuration;
        }

        /**
         * @return subDuration
         */
        public SubDuration getSubDuration() {
            return this.subDuration;
        }

        public static final class Builder {
            private PubDuration pubDuration; 
            private SubDuration subDuration; 

            private Builder() {
            } 

            private Builder(Duration model) {
                this.pubDuration = model.pubDuration;
                this.subDuration = model.subDuration;
            } 

            /**
             * PubDuration.
             */
            public Builder pubDuration(PubDuration pubDuration) {
                this.pubDuration = pubDuration;
                return this;
            }

            /**
             * SubDuration.
             */
            public Builder subDuration(SubDuration subDuration) {
                this.subDuration = subDuration;
                return this;
            }

            public Duration build() {
                return new Duration(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRtcChannelMetricResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRtcChannelMetricResponseBody</p>
     */
    public static class ChannelMetricInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelMetric")
        private ChannelMetric channelMetric;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Duration duration;

        private ChannelMetricInfo(Builder builder) {
            this.channelMetric = builder.channelMetric;
            this.duration = builder.duration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChannelMetricInfo create() {
            return builder().build();
        }

        /**
         * @return channelMetric
         */
        public ChannelMetric getChannelMetric() {
            return this.channelMetric;
        }

        /**
         * @return duration
         */
        public Duration getDuration() {
            return this.duration;
        }

        public static final class Builder {
            private ChannelMetric channelMetric; 
            private Duration duration; 

            private Builder() {
            } 

            private Builder(ChannelMetricInfo model) {
                this.channelMetric = model.channelMetric;
                this.duration = model.duration;
            } 

            /**
             * ChannelMetric.
             */
            public Builder channelMetric(ChannelMetric channelMetric) {
                this.channelMetric = channelMetric;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Duration duration) {
                this.duration = duration;
                return this;
            }

            public ChannelMetricInfo build() {
                return new ChannelMetricInfo(this);
            } 

        } 

    }
}
