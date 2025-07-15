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
 * {@link StartCasterResponseBody} extends {@link TeaModel}
 *
 * <p>StartCasterResponseBody</p>
 */
public class StartCasterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PgmSceneInfos")
    private PgmSceneInfos pgmSceneInfos;

    @com.aliyun.core.annotation.NameInMap("PvwSceneInfos")
    private PvwSceneInfos pvwSceneInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private StartCasterResponseBody(Builder builder) {
        this.pgmSceneInfos = builder.pgmSceneInfos;
        this.pvwSceneInfos = builder.pvwSceneInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartCasterResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pgmSceneInfos
     */
    public PgmSceneInfos getPgmSceneInfos() {
        return this.pgmSceneInfos;
    }

    /**
     * @return pvwSceneInfos
     */
    public PvwSceneInfos getPvwSceneInfos() {
        return this.pvwSceneInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PgmSceneInfos pgmSceneInfos; 
        private PvwSceneInfos pvwSceneInfos; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(StartCasterResponseBody model) {
            this.pgmSceneInfos = model.pgmSceneInfos;
            this.pvwSceneInfos = model.pvwSceneInfos;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The PGM scenes.</p>
         */
        public Builder pgmSceneInfos(PgmSceneInfos pgmSceneInfos) {
            this.pgmSceneInfos = pgmSceneInfos;
            return this;
        }

        /**
         * <p>The PVW scenes.</p>
         */
        public Builder pvwSceneInfos(PvwSceneInfos pvwSceneInfos) {
            this.pvwSceneInfos = pvwSceneInfos;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6EBD1AC4-C34D-4AE1-963E-B688A228BE31</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public StartCasterResponseBody build() {
            return new StartCasterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link StartCasterResponseBody} extends {@link TeaModel}
     *
     * <p>StartCasterResponseBody</p>
     */
    public static class StreamInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OutputStreamUrl")
        private String outputStreamUrl;

        @com.aliyun.core.annotation.NameInMap("TranscodeConfig")
        private String transcodeConfig;

        @com.aliyun.core.annotation.NameInMap("VideoFormat")
        private String videoFormat;

        private StreamInfo(Builder builder) {
            this.outputStreamUrl = builder.outputStreamUrl;
            this.transcodeConfig = builder.transcodeConfig;
            this.videoFormat = builder.videoFormat;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamInfo create() {
            return builder().build();
        }

        /**
         * @return outputStreamUrl
         */
        public String getOutputStreamUrl() {
            return this.outputStreamUrl;
        }

        /**
         * @return transcodeConfig
         */
        public String getTranscodeConfig() {
            return this.transcodeConfig;
        }

        /**
         * @return videoFormat
         */
        public String getVideoFormat() {
            return this.videoFormat;
        }

        public static final class Builder {
            private String outputStreamUrl; 
            private String transcodeConfig; 
            private String videoFormat; 

            private Builder() {
            } 

            private Builder(StreamInfo model) {
                this.outputStreamUrl = model.outputStreamUrl;
                this.transcodeConfig = model.transcodeConfig;
                this.videoFormat = model.videoFormat;
            } 

            /**
             * <p>The URL.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://abclive/caster/example.net</p>
             */
            public Builder outputStreamUrl(String outputStreamUrl) {
                this.outputStreamUrl = outputStreamUrl;
                return this;
            }

            /**
             * <p>The transcoding configuration. Valid values:</p>
             * <ul>
             * <li><strong>lsd</strong>: standard definition</li>
             * <li><strong>lld</strong>: low definition</li>
             * <li><strong>lud</strong>: ultra-high definition</li>
             * <li><strong>lhd</strong>: high definition</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>lld</p>
             */
            public Builder transcodeConfig(String transcodeConfig) {
                this.transcodeConfig = transcodeConfig;
                return this;
            }

            /**
             * <p>The format. Valid values:</p>
             * <ul>
             * <li><strong>flv</strong></li>
             * <li><strong>rtmp</strong></li>
             * <li><strong>m3u8</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>flv</p>
             */
            public Builder videoFormat(String videoFormat) {
                this.videoFormat = videoFormat;
                return this;
            }

            public StreamInfo build() {
                return new StreamInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCasterResponseBody} extends {@link TeaModel}
     *
     * <p>StartCasterResponseBody</p>
     */
    public static class StreamInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StreamInfo")
        private java.util.List<StreamInfo> streamInfo;

        private StreamInfos(Builder builder) {
            this.streamInfo = builder.streamInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamInfos create() {
            return builder().build();
        }

        /**
         * @return streamInfo
         */
        public java.util.List<StreamInfo> getStreamInfo() {
            return this.streamInfo;
        }

        public static final class Builder {
            private java.util.List<StreamInfo> streamInfo; 

            private Builder() {
            } 

            private Builder(StreamInfos model) {
                this.streamInfo = model.streamInfo;
            } 

            /**
             * StreamInfo.
             */
            public Builder streamInfo(java.util.List<StreamInfo> streamInfo) {
                this.streamInfo = streamInfo;
                return this;
            }

            public StreamInfos build() {
                return new StreamInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCasterResponseBody} extends {@link TeaModel}
     *
     * <p>StartCasterResponseBody</p>
     */
    public static class SceneInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SceneId")
        private String sceneId;

        @com.aliyun.core.annotation.NameInMap("StreamInfos")
        private StreamInfos streamInfos;

        @com.aliyun.core.annotation.NameInMap("StreamUrl")
        private String streamUrl;

        private SceneInfo(Builder builder) {
            this.sceneId = builder.sceneId;
            this.streamInfos = builder.streamInfos;
            this.streamUrl = builder.streamUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SceneInfo create() {
            return builder().build();
        }

        /**
         * @return sceneId
         */
        public String getSceneId() {
            return this.sceneId;
        }

        /**
         * @return streamInfos
         */
        public StreamInfos getStreamInfos() {
            return this.streamInfos;
        }

        /**
         * @return streamUrl
         */
        public String getStreamUrl() {
            return this.streamUrl;
        }

        public static final class Builder {
            private String sceneId; 
            private StreamInfos streamInfos; 
            private String streamUrl; 

            private Builder() {
            } 

            private Builder(SceneInfo model) {
                this.sceneId = model.sceneId;
                this.streamInfos = model.streamInfos;
                this.streamUrl = model.streamUrl;
            } 

            /**
             * <p>The ID of the scene.</p>
             * 
             * <strong>example:</strong>
             * <p>b5f8c837-ceeb-424f-b30b-68e94e86****</p>
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * <p>The stream relay URLs.</p>
             */
            public Builder streamInfos(StreamInfos streamInfos) {
                this.streamInfos = streamInfos;
                return this;
            }

            /**
             * <p>The streaming URL of the PGM scene in the production studio. The value is not a stream relay URL.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://abclive/caster/example.edu</p>
             */
            public Builder streamUrl(String streamUrl) {
                this.streamUrl = streamUrl;
                return this;
            }

            public SceneInfo build() {
                return new SceneInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCasterResponseBody} extends {@link TeaModel}
     *
     * <p>StartCasterResponseBody</p>
     */
    public static class PgmSceneInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SceneInfo")
        private java.util.List<SceneInfo> sceneInfo;

        private PgmSceneInfos(Builder builder) {
            this.sceneInfo = builder.sceneInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PgmSceneInfos create() {
            return builder().build();
        }

        /**
         * @return sceneInfo
         */
        public java.util.List<SceneInfo> getSceneInfo() {
            return this.sceneInfo;
        }

        public static final class Builder {
            private java.util.List<SceneInfo> sceneInfo; 

            private Builder() {
            } 

            private Builder(PgmSceneInfos model) {
                this.sceneInfo = model.sceneInfo;
            } 

            /**
             * SceneInfo.
             */
            public Builder sceneInfo(java.util.List<SceneInfo> sceneInfo) {
                this.sceneInfo = sceneInfo;
                return this;
            }

            public PgmSceneInfos build() {
                return new PgmSceneInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCasterResponseBody} extends {@link TeaModel}
     *
     * <p>StartCasterResponseBody</p>
     */
    public static class PvwSceneInfosSceneInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SceneId")
        private String sceneId;

        @com.aliyun.core.annotation.NameInMap("StreamUrl")
        private String streamUrl;

        private PvwSceneInfosSceneInfo(Builder builder) {
            this.sceneId = builder.sceneId;
            this.streamUrl = builder.streamUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PvwSceneInfosSceneInfo create() {
            return builder().build();
        }

        /**
         * @return sceneId
         */
        public String getSceneId() {
            return this.sceneId;
        }

        /**
         * @return streamUrl
         */
        public String getStreamUrl() {
            return this.streamUrl;
        }

        public static final class Builder {
            private String sceneId; 
            private String streamUrl; 

            private Builder() {
            } 

            private Builder(PvwSceneInfosSceneInfo model) {
                this.sceneId = model.sceneId;
                this.streamUrl = model.streamUrl;
            } 

            /**
             * <p>The ID of the scene.</p>
             * 
             * <strong>example:</strong>
             * <p>b5f8c837-ceeb-424f-b30b-68e94e86****</p>
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * <p>The streaming URL of the PVW scene in the production studio. The value is not a stream relay URL.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://abclive/caster/example.net</p>
             */
            public Builder streamUrl(String streamUrl) {
                this.streamUrl = streamUrl;
                return this;
            }

            public PvwSceneInfosSceneInfo build() {
                return new PvwSceneInfosSceneInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCasterResponseBody} extends {@link TeaModel}
     *
     * <p>StartCasterResponseBody</p>
     */
    public static class PvwSceneInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SceneInfo")
        private java.util.List<PvwSceneInfosSceneInfo> sceneInfo;

        private PvwSceneInfos(Builder builder) {
            this.sceneInfo = builder.sceneInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PvwSceneInfos create() {
            return builder().build();
        }

        /**
         * @return sceneInfo
         */
        public java.util.List<PvwSceneInfosSceneInfo> getSceneInfo() {
            return this.sceneInfo;
        }

        public static final class Builder {
            private java.util.List<PvwSceneInfosSceneInfo> sceneInfo; 

            private Builder() {
            } 

            private Builder(PvwSceneInfos model) {
                this.sceneInfo = model.sceneInfo;
            } 

            /**
             * SceneInfo.
             */
            public Builder sceneInfo(java.util.List<PvwSceneInfosSceneInfo> sceneInfo) {
                this.sceneInfo = sceneInfo;
                return this;
            }

            public PvwSceneInfos build() {
                return new PvwSceneInfos(this);
            } 

        } 

    }
}
