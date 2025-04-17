// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link QueryAvatarProjectResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAvatarProjectResponseBody</p>
 */
public class QueryAvatarProjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentId")
    private String agentId;

    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("frames")
    private java.util.List<Frames> frames;

    @com.aliyun.core.annotation.NameInMap("projectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resSpecType")
    private String resSpecType;

    @com.aliyun.core.annotation.NameInMap("scaleType")
    private String scaleType;

    @com.aliyun.core.annotation.NameInMap("scriptModelTag")
    private String scriptModelTag;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private QueryAvatarProjectResponseBody(Builder builder) {
        this.agentId = builder.agentId;
        this.errorMsg = builder.errorMsg;
        this.frames = builder.frames;
        this.projectName = builder.projectName;
        this.requestId = builder.requestId;
        this.resSpecType = builder.resSpecType;
        this.scaleType = builder.scaleType;
        this.scriptModelTag = builder.scriptModelTag;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAvatarProjectResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return frames
     */
    public java.util.List<Frames> getFrames() {
        return this.frames;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resSpecType
     */
    public String getResSpecType() {
        return this.resSpecType;
    }

    /**
     * @return scaleType
     */
    public String getScaleType() {
        return this.scaleType;
    }

    /**
     * @return scriptModelTag
     */
    public String getScriptModelTag() {
        return this.scriptModelTag;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String agentId; 
        private String errorMsg; 
        private java.util.List<Frames> frames; 
        private String projectName; 
        private String requestId; 
        private String resSpecType; 
        private String scaleType; 
        private String scriptModelTag; 
        private String status; 

        private Builder() {
        } 

        private Builder(QueryAvatarProjectResponseBody model) {
            this.agentId = model.agentId;
            this.errorMsg = model.errorMsg;
            this.frames = model.frames;
            this.projectName = model.projectName;
            this.requestId = model.requestId;
            this.resSpecType = model.resSpecType;
            this.scaleType = model.scaleType;
            this.scriptModelTag = model.scriptModelTag;
            this.status = model.status;
        } 

        /**
         * agentId.
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            return this;
        }

        /**
         * errorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * frames.
         */
        public Builder frames(java.util.List<Frames> frames) {
            this.frames = frames;
            return this;
        }

        /**
         * projectName.
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resSpecType.
         */
        public Builder resSpecType(String resSpecType) {
            this.resSpecType = resSpecType;
            return this;
        }

        /**
         * scaleType.
         */
        public Builder scaleType(String scaleType) {
            this.scaleType = scaleType;
            return this;
        }

        /**
         * scriptModelTag.
         */
        public Builder scriptModelTag(String scriptModelTag) {
            this.scriptModelTag = scriptModelTag;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public QueryAvatarProjectResponseBody build() {
            return new QueryAvatarProjectResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAvatarProjectResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAvatarProjectResponseBody</p>
     */
    public static class Material extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private Material(Builder builder) {
            this.format = builder.format;
            this.id = builder.id;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Material create() {
            return builder().build();
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String format; 
            private String id; 
            private String url; 

            private Builder() {
            } 

            private Builder(Material model) {
                this.format = model.format;
                this.id = model.id;
                this.url = model.url;
            } 

            /**
             * format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Material build() {
                return new Material(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAvatarProjectResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAvatarProjectResponseBody</p>
     */
    public static class Layers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("material")
        private Material material;

        @com.aliyun.core.annotation.NameInMap("positionX")
        private Integer positionX;

        @com.aliyun.core.annotation.NameInMap("positionY")
        private Integer positionY;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("width")
        private Integer width;

        private Layers(Builder builder) {
            this.height = builder.height;
            this.index = builder.index;
            this.material = builder.material;
            this.positionX = builder.positionX;
            this.positionY = builder.positionY;
            this.type = builder.type;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Layers create() {
            return builder().build();
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return material
         */
        public Material getMaterial() {
            return this.material;
        }

        /**
         * @return positionX
         */
        public Integer getPositionX() {
            return this.positionX;
        }

        /**
         * @return positionY
         */
        public Integer getPositionY() {
            return this.positionY;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer height; 
            private Integer index; 
            private Material material; 
            private Integer positionX; 
            private Integer positionY; 
            private String type; 
            private Integer width; 

            private Builder() {
            } 

            private Builder(Layers model) {
                this.height = model.height;
                this.index = model.index;
                this.material = model.material;
                this.positionX = model.positionX;
                this.positionY = model.positionY;
                this.type = model.type;
                this.width = model.width;
            } 

            /**
             * height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * material.
             */
            public Builder material(Material material) {
                this.material = material;
                return this;
            }

            /**
             * positionX.
             */
            public Builder positionX(Integer positionX) {
                this.positionX = positionX;
                return this;
            }

            /**
             * positionY.
             */
            public Builder positionY(Integer positionY) {
                this.positionY = positionY;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public Layers build() {
                return new Layers(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAvatarProjectResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAvatarProjectResponseBody</p>
     */
    public static class VideoScript extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("emotion")
        private String emotion;

        @com.aliyun.core.annotation.NameInMap("pitchRate")
        private String pitchRate;

        @com.aliyun.core.annotation.NameInMap("speedRate")
        private String speedRate;

        @com.aliyun.core.annotation.NameInMap("textContent")
        private String textContent;

        @com.aliyun.core.annotation.NameInMap("voiceLanguage")
        private String voiceLanguage;

        @com.aliyun.core.annotation.NameInMap("voiceTemplateId")
        private String voiceTemplateId;

        @com.aliyun.core.annotation.NameInMap("volume")
        private Integer volume;

        private VideoScript(Builder builder) {
            this.emotion = builder.emotion;
            this.pitchRate = builder.pitchRate;
            this.speedRate = builder.speedRate;
            this.textContent = builder.textContent;
            this.voiceLanguage = builder.voiceLanguage;
            this.voiceTemplateId = builder.voiceTemplateId;
            this.volume = builder.volume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoScript create() {
            return builder().build();
        }

        /**
         * @return emotion
         */
        public String getEmotion() {
            return this.emotion;
        }

        /**
         * @return pitchRate
         */
        public String getPitchRate() {
            return this.pitchRate;
        }

        /**
         * @return speedRate
         */
        public String getSpeedRate() {
            return this.speedRate;
        }

        /**
         * @return textContent
         */
        public String getTextContent() {
            return this.textContent;
        }

        /**
         * @return voiceLanguage
         */
        public String getVoiceLanguage() {
            return this.voiceLanguage;
        }

        /**
         * @return voiceTemplateId
         */
        public String getVoiceTemplateId() {
            return this.voiceTemplateId;
        }

        /**
         * @return volume
         */
        public Integer getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private String emotion; 
            private String pitchRate; 
            private String speedRate; 
            private String textContent; 
            private String voiceLanguage; 
            private String voiceTemplateId; 
            private Integer volume; 

            private Builder() {
            } 

            private Builder(VideoScript model) {
                this.emotion = model.emotion;
                this.pitchRate = model.pitchRate;
                this.speedRate = model.speedRate;
                this.textContent = model.textContent;
                this.voiceLanguage = model.voiceLanguage;
                this.voiceTemplateId = model.voiceTemplateId;
                this.volume = model.volume;
            } 

            /**
             * emotion.
             */
            public Builder emotion(String emotion) {
                this.emotion = emotion;
                return this;
            }

            /**
             * pitchRate.
             */
            public Builder pitchRate(String pitchRate) {
                this.pitchRate = pitchRate;
                return this;
            }

            /**
             * speedRate.
             */
            public Builder speedRate(String speedRate) {
                this.speedRate = speedRate;
                return this;
            }

            /**
             * textContent.
             */
            public Builder textContent(String textContent) {
                this.textContent = textContent;
                return this;
            }

            /**
             * voiceLanguage.
             */
            public Builder voiceLanguage(String voiceLanguage) {
                this.voiceLanguage = voiceLanguage;
                return this;
            }

            /**
             * voiceTemplateId.
             */
            public Builder voiceTemplateId(String voiceTemplateId) {
                this.voiceTemplateId = voiceTemplateId;
                return this;
            }

            /**
             * volume.
             */
            public Builder volume(Integer volume) {
                this.volume = volume;
                return this;
            }

            public VideoScript build() {
                return new VideoScript(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAvatarProjectResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAvatarProjectResponseBody</p>
     */
    public static class Frames extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("layers")
        private java.util.List<Layers> layers;

        @com.aliyun.core.annotation.NameInMap("videoScript")
        private VideoScript videoScript;

        private Frames(Builder builder) {
            this.index = builder.index;
            this.layers = builder.layers;
            this.videoScript = builder.videoScript;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Frames create() {
            return builder().build();
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return layers
         */
        public java.util.List<Layers> getLayers() {
            return this.layers;
        }

        /**
         * @return videoScript
         */
        public VideoScript getVideoScript() {
            return this.videoScript;
        }

        public static final class Builder {
            private Integer index; 
            private java.util.List<Layers> layers; 
            private VideoScript videoScript; 

            private Builder() {
            } 

            private Builder(Frames model) {
                this.index = model.index;
                this.layers = model.layers;
                this.videoScript = model.videoScript;
            } 

            /**
             * index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * layers.
             */
            public Builder layers(java.util.List<Layers> layers) {
                this.layers = layers;
                return this;
            }

            /**
             * videoScript.
             */
            public Builder videoScript(VideoScript videoScript) {
                this.videoScript = videoScript;
                return this;
            }

            public Frames build() {
                return new Frames(this);
            } 

        } 

    }
}
