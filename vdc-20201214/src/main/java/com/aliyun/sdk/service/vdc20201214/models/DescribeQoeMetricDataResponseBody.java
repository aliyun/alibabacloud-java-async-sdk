// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdc20201214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeQoeMetricDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeQoeMetricDataResponseBody</p>
 */
public class DescribeQoeMetricDataResponseBody extends TeaModel {
    @NameInMap("AudioData")
    private java.util.List < AudioData> audioData;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VideoData")
    private java.util.List < VideoData> videoData;

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

    /**
     * @return audioData
     */
    public java.util.List < AudioData> getAudioData() {
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
    public java.util.List < VideoData> getVideoData() {
        return this.videoData;
    }

    public static final class Builder {
        private java.util.List < AudioData> audioData; 
        private String requestId; 
        private java.util.List < VideoData> videoData; 

        /**
         * AudioData.
         */
        public Builder audioData(java.util.List < AudioData> audioData) {
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
        public Builder videoData(java.util.List < VideoData> videoData) {
            this.videoData = videoData;
            return this;
        }

        public DescribeQoeMetricDataResponseBody build() {
            return new DescribeQoeMetricDataResponseBody(this);
        } 

    } 

    public static class Nodes extends TeaModel {
        @NameInMap("X")
        private String x;

        @NameInMap("Y")
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
    public static class AudioData extends TeaModel {
        @NameInMap("Nodes")
        private java.util.List < Nodes> nodes;

        @NameInMap("Type")
        private String type;

        @NameInMap("UserId")
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
        public java.util.List < Nodes> getNodes() {
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
            private java.util.List < Nodes> nodes; 
            private String type; 
            private String userId; 

            /**
             * Nodes.
             */
            public Builder nodes(java.util.List < Nodes> nodes) {
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
    public static class VideoDataNodes extends TeaModel {
        @NameInMap("X")
        private String x;

        @NameInMap("Y")
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
    public static class VideoData extends TeaModel {
        @NameInMap("Nodes")
        private java.util.List < VideoDataNodes> nodes;

        @NameInMap("Type")
        private String type;

        @NameInMap("UserId")
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
        public java.util.List < VideoDataNodes> getNodes() {
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
            private java.util.List < VideoDataNodes> nodes; 
            private String type; 
            private String userId; 

            /**
             * Nodes.
             */
            public Builder nodes(java.util.List < VideoDataNodes> nodes) {
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
