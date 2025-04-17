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
 * {@link SaveAvatarProjectRequest} extends {@link RequestModel}
 *
 * <p>SaveAvatarProjectRequest</p>
 */
public class SaveAvatarProjectRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agentId")
    private String agentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("bitRate")
    private String bitRate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("frameRate")
    private String frameRate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("frames")
    private java.util.List<Frames> frames;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operateType")
    private String operateType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("projectId")
    private String projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("projectName")
    private String projectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resSpecType")
    private String resSpecType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resolution")
    private String resolution;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scaleType")
    private String scaleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scriptModelTag")
    private String scriptModelTag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("synchronizedDisplay")
    private String synchronizedDisplay;

    private SaveAvatarProjectRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.bitRate = builder.bitRate;
        this.frameRate = builder.frameRate;
        this.frames = builder.frames;
        this.operateType = builder.operateType;
        this.projectId = builder.projectId;
        this.projectName = builder.projectName;
        this.resSpecType = builder.resSpecType;
        this.resolution = builder.resolution;
        this.scaleType = builder.scaleType;
        this.scriptModelTag = builder.scriptModelTag;
        this.synchronizedDisplay = builder.synchronizedDisplay;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveAvatarProjectRequest create() {
        return builder().build();
    }

@Override
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
     * @return bitRate
     */
    public String getBitRate() {
        return this.bitRate;
    }

    /**
     * @return frameRate
     */
    public String getFrameRate() {
        return this.frameRate;
    }

    /**
     * @return frames
     */
    public java.util.List<Frames> getFrames() {
        return this.frames;
    }

    /**
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return resSpecType
     */
    public String getResSpecType() {
        return this.resSpecType;
    }

    /**
     * @return resolution
     */
    public String getResolution() {
        return this.resolution;
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
     * @return synchronizedDisplay
     */
    public String getSynchronizedDisplay() {
        return this.synchronizedDisplay;
    }

    public static final class Builder extends Request.Builder<SaveAvatarProjectRequest, Builder> {
        private String agentId; 
        private String bitRate; 
        private String frameRate; 
        private java.util.List<Frames> frames; 
        private String operateType; 
        private String projectId; 
        private String projectName; 
        private String resSpecType; 
        private String resolution; 
        private String scaleType; 
        private String scriptModelTag; 
        private String synchronizedDisplay; 

        private Builder() {
            super();
        } 

        private Builder(SaveAvatarProjectRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.bitRate = request.bitRate;
            this.frameRate = request.frameRate;
            this.frames = request.frames;
            this.operateType = request.operateType;
            this.projectId = request.projectId;
            this.projectName = request.projectName;
            this.resSpecType = request.resSpecType;
            this.resolution = request.resolution;
            this.scaleType = request.scaleType;
            this.scriptModelTag = request.scriptModelTag;
            this.synchronizedDisplay = request.synchronizedDisplay;
        } 

        /**
         * agentId.
         */
        public Builder agentId(String agentId) {
            this.putBodyParameter("agentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * bitRate.
         */
        public Builder bitRate(String bitRate) {
            this.putBodyParameter("bitRate", bitRate);
            this.bitRate = bitRate;
            return this;
        }

        /**
         * frameRate.
         */
        public Builder frameRate(String frameRate) {
            this.putBodyParameter("frameRate", frameRate);
            this.frameRate = frameRate;
            return this;
        }

        /**
         * frames.
         */
        public Builder frames(java.util.List<Frames> frames) {
            this.putBodyParameter("frames", frames);
            this.frames = frames;
            return this;
        }

        /**
         * operateType.
         */
        public Builder operateType(String operateType) {
            this.putBodyParameter("operateType", operateType);
            this.operateType = operateType;
            return this;
        }

        /**
         * projectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("projectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * projectName.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("projectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * resSpecType.
         */
        public Builder resSpecType(String resSpecType) {
            this.putBodyParameter("resSpecType", resSpecType);
            this.resSpecType = resSpecType;
            return this;
        }

        /**
         * resolution.
         */
        public Builder resolution(String resolution) {
            this.putBodyParameter("resolution", resolution);
            this.resolution = resolution;
            return this;
        }

        /**
         * scaleType.
         */
        public Builder scaleType(String scaleType) {
            this.putBodyParameter("scaleType", scaleType);
            this.scaleType = scaleType;
            return this;
        }

        /**
         * scriptModelTag.
         */
        public Builder scriptModelTag(String scriptModelTag) {
            this.putBodyParameter("scriptModelTag", scriptModelTag);
            this.scriptModelTag = scriptModelTag;
            return this;
        }

        /**
         * synchronizedDisplay.
         */
        public Builder synchronizedDisplay(String synchronizedDisplay) {
            this.putBodyParameter("synchronizedDisplay", synchronizedDisplay);
            this.synchronizedDisplay = synchronizedDisplay;
            return this;
        }

        @Override
        public SaveAvatarProjectRequest build() {
            return new SaveAvatarProjectRequest(this);
        } 

    } 

    /**
     * 
     * {@link SaveAvatarProjectRequest} extends {@link TeaModel}
     *
     * <p>SaveAvatarProjectRequest</p>
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
     * {@link SaveAvatarProjectRequest} extends {@link TeaModel}
     *
     * <p>SaveAvatarProjectRequest</p>
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
     * {@link SaveAvatarProjectRequest} extends {@link TeaModel}
     *
     * <p>SaveAvatarProjectRequest</p>
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
        private String volume;

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
        public String getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private String emotion; 
            private String pitchRate; 
            private String speedRate; 
            private String textContent; 
            private String voiceLanguage; 
            private String voiceTemplateId; 
            private String volume; 

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
            public Builder volume(String volume) {
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
     * {@link SaveAvatarProjectRequest} extends {@link TeaModel}
     *
     * <p>SaveAvatarProjectRequest</p>
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
