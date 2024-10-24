// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
    @com.aliyun.core.annotation.NameInMap("frames")
    private java.util.List < Frames> frames;

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
    @com.aliyun.core.annotation.NameInMap("scaleType")
    private String scaleType;

    private SaveAvatarProjectRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.frames = builder.frames;
        this.operateType = builder.operateType;
        this.projectId = builder.projectId;
        this.projectName = builder.projectName;
        this.resSpecType = builder.resSpecType;
        this.scaleType = builder.scaleType;
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
     * @return frames
     */
    public java.util.List < Frames> getFrames() {
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
     * @return scaleType
     */
    public String getScaleType() {
        return this.scaleType;
    }

    public static final class Builder extends Request.Builder<SaveAvatarProjectRequest, Builder> {
        private String agentId; 
        private java.util.List < Frames> frames; 
        private String operateType; 
        private String projectId; 
        private String projectName; 
        private String resSpecType; 
        private String scaleType; 

        private Builder() {
            super();
        } 

        private Builder(SaveAvatarProjectRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.frames = request.frames;
            this.operateType = request.operateType;
            this.projectId = request.projectId;
            this.projectName = request.projectName;
            this.resSpecType = request.resSpecType;
            this.scaleType = request.scaleType;
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
         * frames.
         */
        public Builder frames(java.util.List < Frames> frames) {
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
         * scaleType.
         */
        public Builder scaleType(String scaleType) {
            this.putBodyParameter("scaleType", scaleType);
            this.scaleType = scaleType;
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
            private Material material; 
            private Integer positionX; 
            private Integer positionY; 
            private String type; 
            private Integer width; 

            /**
             * height.
             */
            public Builder height(Integer height) {
                this.height = height;
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
        @com.aliyun.core.annotation.NameInMap("speedRate")
        private String speedRate;

        @com.aliyun.core.annotation.NameInMap("voiceTemplateId")
        private String voiceTemplateId;

        @com.aliyun.core.annotation.NameInMap("volume")
        private String volume;

        private VideoScript(Builder builder) {
            this.speedRate = builder.speedRate;
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
         * @return speedRate
         */
        public String getSpeedRate() {
            return this.speedRate;
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
            private String speedRate; 
            private String voiceTemplateId; 
            private String volume; 

            /**
             * speedRate.
             */
            public Builder speedRate(String speedRate) {
                this.speedRate = speedRate;
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
        @com.aliyun.core.annotation.NameInMap("layers")
        private java.util.List < Layers> layers;

        @com.aliyun.core.annotation.NameInMap("videoScript")
        private VideoScript videoScript;

        private Frames(Builder builder) {
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
         * @return layers
         */
        public java.util.List < Layers> getLayers() {
            return this.layers;
        }

        /**
         * @return videoScript
         */
        public VideoScript getVideoScript() {
            return this.videoScript;
        }

        public static final class Builder {
            private java.util.List < Layers> layers; 
            private VideoScript videoScript; 

            /**
             * layers.
             */
            public Builder layers(java.util.List < Layers> layers) {
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
