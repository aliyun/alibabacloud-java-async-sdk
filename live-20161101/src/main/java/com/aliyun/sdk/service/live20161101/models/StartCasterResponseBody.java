// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartCasterResponseBody} extends {@link TeaModel}
 *
 * <p>StartCasterResponseBody</p>
 */
public class StartCasterResponseBody extends TeaModel {
    @NameInMap("PgmSceneInfos")
    private PgmSceneInfos pgmSceneInfos;

    @NameInMap("PvwSceneInfos")
    private PvwSceneInfos pvwSceneInfos;

    @NameInMap("RequestId")
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

        /**
         * PgmSceneInfos.
         */
        public Builder pgmSceneInfos(PgmSceneInfos pgmSceneInfos) {
            this.pgmSceneInfos = pgmSceneInfos;
            return this;
        }

        /**
         * PvwSceneInfos.
         */
        public Builder pvwSceneInfos(PvwSceneInfos pvwSceneInfos) {
            this.pvwSceneInfos = pvwSceneInfos;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public StartCasterResponseBody build() {
            return new StartCasterResponseBody(this);
        } 

    } 

    public static class StreamInfo extends TeaModel {
        @NameInMap("OutputStreamUrl")
        private String outputStreamUrl;

        @NameInMap("TranscodeConfig")
        private String transcodeConfig;

        @NameInMap("VideoFormat")
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

            /**
             * OutputStreamUrl.
             */
            public Builder outputStreamUrl(String outputStreamUrl) {
                this.outputStreamUrl = outputStreamUrl;
                return this;
            }

            /**
             * TranscodeConfig.
             */
            public Builder transcodeConfig(String transcodeConfig) {
                this.transcodeConfig = transcodeConfig;
                return this;
            }

            /**
             * VideoFormat.
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
    public static class StreamInfos extends TeaModel {
        @NameInMap("StreamInfo")
        private java.util.List < StreamInfo> streamInfo;

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
        public java.util.List < StreamInfo> getStreamInfo() {
            return this.streamInfo;
        }

        public static final class Builder {
            private java.util.List < StreamInfo> streamInfo; 

            /**
             * StreamInfo.
             */
            public Builder streamInfo(java.util.List < StreamInfo> streamInfo) {
                this.streamInfo = streamInfo;
                return this;
            }

            public StreamInfos build() {
                return new StreamInfos(this);
            } 

        } 

    }
    public static class SceneInfo extends TeaModel {
        @NameInMap("SceneId")
        private String sceneId;

        @NameInMap("StreamInfos")
        private StreamInfos streamInfos;

        @NameInMap("StreamUrl")
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

            /**
             * SceneId.
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * StreamInfos.
             */
            public Builder streamInfos(StreamInfos streamInfos) {
                this.streamInfos = streamInfos;
                return this;
            }

            /**
             * StreamUrl.
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
    public static class PgmSceneInfos extends TeaModel {
        @NameInMap("SceneInfo")
        private java.util.List < SceneInfo> sceneInfo;

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
        public java.util.List < SceneInfo> getSceneInfo() {
            return this.sceneInfo;
        }

        public static final class Builder {
            private java.util.List < SceneInfo> sceneInfo; 

            /**
             * SceneInfo.
             */
            public Builder sceneInfo(java.util.List < SceneInfo> sceneInfo) {
                this.sceneInfo = sceneInfo;
                return this;
            }

            public PgmSceneInfos build() {
                return new PgmSceneInfos(this);
            } 

        } 

    }
    public static class PvwSceneInfosSceneInfo extends TeaModel {
        @NameInMap("SceneId")
        private String sceneId;

        @NameInMap("StreamUrl")
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

            /**
             * SceneId.
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * StreamUrl.
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
    public static class PvwSceneInfos extends TeaModel {
        @NameInMap("SceneInfo")
        private java.util.List < PvwSceneInfosSceneInfo> sceneInfo;

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
        public java.util.List < PvwSceneInfosSceneInfo> getSceneInfo() {
            return this.sceneInfo;
        }

        public static final class Builder {
            private java.util.List < PvwSceneInfosSceneInfo> sceneInfo; 

            /**
             * SceneInfo.
             */
            public Builder sceneInfo(java.util.List < PvwSceneInfosSceneInfo> sceneInfo) {
                this.sceneInfo = sceneInfo;
                return this;
            }

            public PvwSceneInfos build() {
                return new PvwSceneInfos(this);
            } 

        } 

    }
}
