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
 * {@link DescribeCasterScenesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCasterScenesResponseBody</p>
 */
public class DescribeCasterScenesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SceneList")
    private SceneList sceneList;

    @com.aliyun.core.annotation.NameInMap("Total")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeCasterScenesResponseBody model) {
            this.requestId = model.requestId;
            this.sceneList = model.sceneList;
            this.total = model.total;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>The ID of the scene.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The scenes.</p>
         */
        public Builder sceneList(SceneList sceneList) {
            this.sceneList = sceneList;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeCasterScenesResponseBody build() {
            return new DescribeCasterScenesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCasterScenesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterScenesResponseBody</p>
     */
    public static class ComponentIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("componentId")
        private java.util.List<String> componentId;

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
        public java.util.List<String> getComponentId() {
            return this.componentId;
        }

        public static final class Builder {
            private java.util.List<String> componentId; 

            private Builder() {
            } 

            private Builder(ComponentIds model) {
                this.componentId = model.componentId;
            } 

            /**
             * componentId.
             */
            public Builder componentId(java.util.List<String> componentId) {
                this.componentId = componentId;
                return this;
            }

            public ComponentIds build() {
                return new ComponentIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCasterScenesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterScenesResponseBody</p>
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
             * <p>The streaming URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://live/caster/example.net">http://live/caster/example.net</a></p>
             */
            public Builder outputStreamUrl(String outputStreamUrl) {
                this.outputStreamUrl = outputStreamUrl;
                return this;
            }

            /**
             * <p>The transcoding configuration. Valid values:</p>
             * <ul>
             * <li><strong>sd</strong>: standard definition</li>
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
             * <li><strong>mp4</strong></li>
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
     * {@link DescribeCasterScenesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterScenesResponseBody</p>
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
     * {@link DescribeCasterScenesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterScenesResponseBody</p>
     */
    public static class Scene extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentIds")
        private ComponentIds componentIds;

        @com.aliyun.core.annotation.NameInMap("LayoutId")
        private String layoutId;

        @com.aliyun.core.annotation.NameInMap("OutputType")
        private String outputType;

        @com.aliyun.core.annotation.NameInMap("SceneId")
        private String sceneId;

        @com.aliyun.core.annotation.NameInMap("SceneName")
        private String sceneName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("StreamInfos")
        private StreamInfos streamInfos;

        @com.aliyun.core.annotation.NameInMap("StreamUrl")
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

            private Builder() {
            } 

            private Builder(Scene model) {
                this.componentIds = model.componentIds;
                this.layoutId = model.layoutId;
                this.outputType = model.outputType;
                this.sceneId = model.sceneId;
                this.sceneName = model.sceneName;
                this.status = model.status;
                this.streamInfos = model.streamInfos;
                this.streamUrl = model.streamUrl;
            } 

            /**
             * <p>The components.</p>
             */
            public Builder componentIds(ComponentIds componentIds) {
                this.componentIds = componentIds;
                return this;
            }

            /**
             * <p>The ID of the layout.</p>
             * 
             * <strong>example:</strong>
             * <p>37cb2f8b-f152-4338-b928-6704f71d****</p>
             */
            public Builder layoutId(String layoutId) {
                this.layoutId = layoutId;
                return this;
            }

            /**
             * <p>Indicates whether the output video is in PVW mode or PGM mode. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: in PVW mode.</li>
             * <li><strong>1</strong>: in PGM mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder outputType(String outputType) {
                this.outputType = outputType;
                return this;
            }

            /**
             * <p>The ID of the scene. You can use the ID as a request parameter in the API operation that is used to modify the audio configurations of the scene, query the audio configurations of the scene, start the scene, or stop the scene.</p>
             * 
             * <strong>example:</strong>
             * <p>b5f8c837-ceeb-424f-b30b-68e94e86****</p>
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * <p>The name of the scene.</p>
             * 
             * <strong>example:</strong>
             * <p>scene1</p>
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * <p>The status of the scene. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: disabled</li>
             * <li><strong>1</strong>: enabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The information about the stream.</p>
             */
            public Builder streamInfos(StreamInfos streamInfos) {
                this.streamInfos = streamInfos;
                return this;
            }

            /**
             * <p>The URL of the output stream.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://developer.aliyundoc.com/caster/4a82a3d1b7f0462ea37348366201****?auth_key=1608953344-0-0-ac8c628078541d7055a170ec59a5****</p>
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
    /**
     * 
     * {@link DescribeCasterScenesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterScenesResponseBody</p>
     */
    public static class SceneList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Scene")
        private java.util.List<Scene> scene;

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
        public java.util.List<Scene> getScene() {
            return this.scene;
        }

        public static final class Builder {
            private java.util.List<Scene> scene; 

            private Builder() {
            } 

            private Builder(SceneList model) {
                this.scene = model.scene;
            } 

            /**
             * Scene.
             */
            public Builder scene(java.util.List<Scene> scene) {
                this.scene = scene;
                return this;
            }

            public SceneList build() {
                return new SceneList(this);
            } 

        } 

    }
}
