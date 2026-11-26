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
 * {@link DescribeQoeMetricDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeQoeMetricDataResponseBody</p>
 */
public class DescribeQoeMetricDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AudioData")
    private java.util.List<AudioData> audioData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VideoData")
    private java.util.List<VideoData> videoData;

    private DescribeQoeMetricDataResponseBody(Builder builder) {
        this.audioData = builder.audioData;
        this.requestId = builder.requestId;
        this.videoData = builder.videoData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeQoeMetricDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return audioData
     */
    public java.util.List<AudioData> getAudioData() {
        return this.audioData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return videoData
     */
    public java.util.List<VideoData> getVideoData() {
        return this.videoData;
    }

    public static final class Builder {
        private java.util.List<AudioData> audioData; 
        private String requestId; 
        private java.util.List<VideoData> videoData; 

        private Builder() {
        } 

        private Builder(DescribeQoeMetricDataResponseBody model) {
            this.audioData = model.audioData;
            this.requestId = model.requestId;
            this.videoData = model.videoData;
        } 

        /**
         * <p>Audio data.</p>
         */
        public Builder audioData(java.util.List<AudioData> audioData) {
            this.audioData = audioData;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>231470C1-ACFB-4C9F-844F-4CFE1E3804C5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Video data.</p>
         */
        public Builder videoData(java.util.List<VideoData> videoData) {
            this.videoData = videoData;
            return this;
        }

        public DescribeQoeMetricDataResponseBody build() {
            return new DescribeQoeMetricDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeQoeMetricDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeQoeMetricDataResponseBody</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X")
        private String x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private String y;

        private Nodes(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public String getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public String getY() {
            return this.y;
        }

        public static final class Builder {
            private String x; 
            private String y; 

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * <p>X-axis coordinate in the audio trend indicator.</p>
             * 
             * <strong>example:</strong>
             * <p>1548670256</p>
             */
            public Builder x(String x) {
                this.x = x;
                return this;
            }

            /**
             * <p>Y-axis coordinate in the audio trend indicator.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder y(String y) {
                this.y = y;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeQoeMetricDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeQoeMetricDataResponseBody</p>
     */
    public static class AudioData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Nodes")
        private java.util.List<Nodes> nodes;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private AudioData(Builder builder) {
            this.nodes = builder.nodes;
            this.type = builder.type;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioData create() {
            return builder().build();
        }

        /**
         * @return nodes
         */
        public java.util.List<Nodes> getNodes() {
            return this.nodes;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private java.util.List<Nodes> nodes; 
            private String type; 
            private String userId; 

            private Builder() {
            } 

            private Builder(AudioData model) {
                this.nodes = model.nodes;
                this.type = model.type;
                this.userId = model.userId;
            } 

            /**
             * <p>List of coordinate points for the audio trend indicator.</p>
             */
            public Builder nodes(java.util.List<Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * <p>Communication experience. Valid values:  </p>
             * <ul>
             * <li><strong>AUDIO</strong>: Audio bitrate.  </li>
             * <li><strong>AUDIO_STUCK</strong>: Audio downlink stuttering.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AUDIO</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>User ID.</p>
             * 
             * <strong>example:</strong>
             * <p>testuserid</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public AudioData build() {
                return new AudioData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeQoeMetricDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeQoeMetricDataResponseBody</p>
     */
    public static class VideoDataNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X")
        private String x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private String y;

        private VideoDataNodes(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoDataNodes create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public String getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public String getY() {
            return this.y;
        }

        public static final class Builder {
            private String x; 
            private String y; 

            private Builder() {
            } 

            private Builder(VideoDataNodes model) {
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * <p>The x-axis coordinate in the video metric trend graph.</p>
             * 
             * <strong>example:</strong>
             * <p>1548670256</p>
             */
            public Builder x(String x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The y-axis coordinate in the Video Trend Indicator.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder y(String y) {
                this.y = y;
                return this;
            }

            public VideoDataNodes build() {
                return new VideoDataNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeQoeMetricDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeQoeMetricDataResponseBody</p>
     */
    public static class VideoData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Nodes")
        private java.util.List<VideoDataNodes> nodes;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private VideoData(Builder builder) {
            this.nodes = builder.nodes;
            this.type = builder.type;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoData create() {
            return builder().build();
        }

        /**
         * @return nodes
         */
        public java.util.List<VideoDataNodes> getNodes() {
            return this.nodes;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private java.util.List<VideoDataNodes> nodes; 
            private String type; 
            private String userId; 

            private Builder() {
            } 

            private Builder(VideoData model) {
                this.nodes = model.nodes;
                this.type = model.type;
                this.userId = model.userId;
            } 

            /**
             * <p>List of coordinate points for the video metric trend graph.</p>
             */
            public Builder nodes(java.util.List<VideoDataNodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * <p>The type of metric that impacts communication experience. Valid values:</p>
             * <ul>
             * <li><strong>VIDEO_CAMERA</strong>: Camera bitrate.</li>
             * <li><strong>VIDEO_SCREEN_SHARE</strong>: Screen sharing stream bitrate.</li>
             * <li><strong>VIDEO_STUCK_CAMERA</strong>: Camera stuttering.</li>
             * <li><strong>VIDEO_STUCK_SCREEN_SHARE</strong>: Screen sharing stuttering.</li>
             * <li><strong>VIDEO_VAGUE_CAMERA</strong>: Camera blur.</li>
             * <li><strong>VIDEO_VAGUE_SCREEN_SHARE</strong>: Screen sharing blur.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VIDEO_CAMERA</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>User ID</p>
             * 
             * <strong>example:</strong>
             * <p>testuserid</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public VideoData build() {
                return new VideoData(this);
            } 

        } 

    }
}
