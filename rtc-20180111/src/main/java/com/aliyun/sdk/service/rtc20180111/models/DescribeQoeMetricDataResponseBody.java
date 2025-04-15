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
         * AudioData.
         */
        public Builder audioData(java.util.List<AudioData> audioData) {
            this.audioData = audioData;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VideoData.
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
             * X.
             */
            public Builder x(String x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
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
             * Nodes.
             */
            public Builder nodes(java.util.List<Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UserId.
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
             * X.
             */
            public Builder x(String x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
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
             * Nodes.
             */
            public Builder nodes(java.util.List<VideoDataNodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UserId.
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
