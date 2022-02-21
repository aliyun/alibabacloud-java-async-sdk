// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCasterScenesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCasterScenesResponseBody</p>
 */
public class DescribeCasterScenesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SceneList")
    private SceneList sceneList;

    @NameInMap("Total")
    private Integer total;

    private DescribeCasterScenesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sceneList = builder.sceneList;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCasterScenesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sceneList
     */
    public SceneList getSceneList() {
        return this.sceneList;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String requestId; 
        private SceneList sceneList; 
        private Integer total; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SceneList.
         */
        public Builder sceneList(SceneList sceneList) {
            this.sceneList = sceneList;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeCasterScenesResponseBody build() {
            return new DescribeCasterScenesResponseBody(this);
        } 

    } 

    public static class ComponentIds extends TeaModel {
        @NameInMap("componentId")
        private java.util.List < String > componentId;

        private ComponentIds(Builder builder) {
            this.componentId = builder.componentId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentIds create() {
            return builder().build();
        }

        /**
         * @return componentId
         */
        public java.util.List < String > getComponentId() {
            return this.componentId;
        }

        public static final class Builder {
            private java.util.List < String > componentId; 

            /**
             * componentId.
             */
            public Builder componentId(java.util.List < String > componentId) {
                this.componentId = componentId;
                return this;
            }

            public ComponentIds build() {
                return new ComponentIds(this);
            } 

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
    public static class Scene extends TeaModel {
        @NameInMap("ComponentIds")
        private ComponentIds componentIds;

        @NameInMap("LayoutId")
        private String layoutId;

        @NameInMap("OutputType")
        private String outputType;

        @NameInMap("SceneId")
        private String sceneId;

        @NameInMap("SceneName")
        private String sceneName;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("StreamInfos")
        private StreamInfos streamInfos;

        @NameInMap("StreamUrl")
        private String streamUrl;

        private Scene(Builder builder) {
            this.componentIds = builder.componentIds;
            this.layoutId = builder.layoutId;
            this.outputType = builder.outputType;
            this.sceneId = builder.sceneId;
            this.sceneName = builder.sceneName;
            this.status = builder.status;
            this.streamInfos = builder.streamInfos;
            this.streamUrl = builder.streamUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scene create() {
            return builder().build();
        }

        /**
         * @return componentIds
         */
        public ComponentIds getComponentIds() {
            return this.componentIds;
        }

        /**
         * @return layoutId
         */
        public String getLayoutId() {
            return this.layoutId;
        }

        /**
         * @return outputType
         */
        public String getOutputType() {
            return this.outputType;
        }

        /**
         * @return sceneId
         */
        public String getSceneId() {
            return this.sceneId;
        }

        /**
         * @return sceneName
         */
        public String getSceneName() {
            return this.sceneName;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
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
            private ComponentIds componentIds; 
            private String layoutId; 
            private String outputType; 
            private String sceneId; 
            private String sceneName; 
            private Integer status; 
            private StreamInfos streamInfos; 
            private String streamUrl; 

            /**
             * ComponentIds.
             */
            public Builder componentIds(ComponentIds componentIds) {
                this.componentIds = componentIds;
                return this;
            }

            /**
             * LayoutId.
             */
            public Builder layoutId(String layoutId) {
                this.layoutId = layoutId;
                return this;
            }

            /**
             * OutputType.
             */
            public Builder outputType(String outputType) {
                this.outputType = outputType;
                return this;
            }

            /**
             * SceneId.
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * SceneName.
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
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

            public Scene build() {
                return new Scene(this);
            } 

        } 

    }
    public static class SceneList extends TeaModel {
        @NameInMap("Scene")
        private java.util.List < Scene> scene;

        private SceneList(Builder builder) {
            this.scene = builder.scene;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SceneList create() {
            return builder().build();
        }

        /**
         * @return scene
         */
        public java.util.List < Scene> getScene() {
            return this.scene;
        }

        public static final class Builder {
            private java.util.List < Scene> scene; 

            /**
             * Scene.
             */
            public Builder scene(java.util.List < Scene> scene) {
                this.scene = scene;
                return this;
            }

            public SceneList build() {
                return new SceneList(this);
            } 

        } 

    }
}
