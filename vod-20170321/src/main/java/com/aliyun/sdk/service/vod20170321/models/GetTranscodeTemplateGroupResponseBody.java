// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTranscodeTemplateGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetTranscodeTemplateGroupResponseBody</p>
 */
public class GetTranscodeTemplateGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TranscodeTemplateGroup")
    private TranscodeTemplateGroup transcodeTemplateGroup;

    private GetTranscodeTemplateGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.transcodeTemplateGroup = builder.transcodeTemplateGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTranscodeTemplateGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return transcodeTemplateGroup
     */
    public TranscodeTemplateGroup getTranscodeTemplateGroup() {
        return this.transcodeTemplateGroup;
    }

    public static final class Builder {
        private String requestId; 
        private TranscodeTemplateGroup transcodeTemplateGroup; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TranscodeTemplateGroup.
         */
        public Builder transcodeTemplateGroup(TranscodeTemplateGroup transcodeTemplateGroup) {
            this.transcodeTemplateGroup = transcodeTemplateGroup;
            return this;
        }

        public GetTranscodeTemplateGroupResponseBody build() {
            return new GetTranscodeTemplateGroupResponseBody(this);
        } 

    } 

    public static class TranscodeTemplateList extends TeaModel {
        @NameInMap("Audio")
        private String audio;

        @NameInMap("Clip")
        private String clip;

        @NameInMap("Container")
        private String container;

        @NameInMap("Definition")
        private String definition;

        @NameInMap("EncryptSetting")
        private String encryptSetting;

        @NameInMap("MuxConfig")
        private String muxConfig;

        @NameInMap("PackageSetting")
        private String packageSetting;

        @NameInMap("Rotate")
        private String rotate;

        @NameInMap("SubtitleList")
        private String subtitleList;

        @NameInMap("TemplateName")
        private String templateName;

        @NameInMap("TransConfig")
        private String transConfig;

        @NameInMap("TranscodeFileRegular")
        private String transcodeFileRegular;

        @NameInMap("TranscodeTemplateId")
        private String transcodeTemplateId;

        @NameInMap("Type")
        private String type;

        @NameInMap("Video")
        private String video;

        @NameInMap("WatermarkIds")
        private java.util.List < String > watermarkIds;

        private TranscodeTemplateList(Builder builder) {
            this.audio = builder.audio;
            this.clip = builder.clip;
            this.container = builder.container;
            this.definition = builder.definition;
            this.encryptSetting = builder.encryptSetting;
            this.muxConfig = builder.muxConfig;
            this.packageSetting = builder.packageSetting;
            this.rotate = builder.rotate;
            this.subtitleList = builder.subtitleList;
            this.templateName = builder.templateName;
            this.transConfig = builder.transConfig;
            this.transcodeFileRegular = builder.transcodeFileRegular;
            this.transcodeTemplateId = builder.transcodeTemplateId;
            this.type = builder.type;
            this.video = builder.video;
            this.watermarkIds = builder.watermarkIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeTemplateList create() {
            return builder().build();
        }

        /**
         * @return audio
         */
        public String getAudio() {
            return this.audio;
        }

        /**
         * @return clip
         */
        public String getClip() {
            return this.clip;
        }

        /**
         * @return container
         */
        public String getContainer() {
            return this.container;
        }

        /**
         * @return definition
         */
        public String getDefinition() {
            return this.definition;
        }

        /**
         * @return encryptSetting
         */
        public String getEncryptSetting() {
            return this.encryptSetting;
        }

        /**
         * @return muxConfig
         */
        public String getMuxConfig() {
            return this.muxConfig;
        }

        /**
         * @return packageSetting
         */
        public String getPackageSetting() {
            return this.packageSetting;
        }

        /**
         * @return rotate
         */
        public String getRotate() {
            return this.rotate;
        }

        /**
         * @return subtitleList
         */
        public String getSubtitleList() {
            return this.subtitleList;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return transConfig
         */
        public String getTransConfig() {
            return this.transConfig;
        }

        /**
         * @return transcodeFileRegular
         */
        public String getTranscodeFileRegular() {
            return this.transcodeFileRegular;
        }

        /**
         * @return transcodeTemplateId
         */
        public String getTranscodeTemplateId() {
            return this.transcodeTemplateId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return video
         */
        public String getVideo() {
            return this.video;
        }

        /**
         * @return watermarkIds
         */
        public java.util.List < String > getWatermarkIds() {
            return this.watermarkIds;
        }

        public static final class Builder {
            private String audio; 
            private String clip; 
            private String container; 
            private String definition; 
            private String encryptSetting; 
            private String muxConfig; 
            private String packageSetting; 
            private String rotate; 
            private String subtitleList; 
            private String templateName; 
            private String transConfig; 
            private String transcodeFileRegular; 
            private String transcodeTemplateId; 
            private String type; 
            private String video; 
            private java.util.List < String > watermarkIds; 

            /**
             * Audio.
             */
            public Builder audio(String audio) {
                this.audio = audio;
                return this;
            }

            /**
             * Clip.
             */
            public Builder clip(String clip) {
                this.clip = clip;
                return this;
            }

            /**
             * Container.
             */
            public Builder container(String container) {
                this.container = container;
                return this;
            }

            /**
             * Definition.
             */
            public Builder definition(String definition) {
                this.definition = definition;
                return this;
            }

            /**
             * EncryptSetting.
             */
            public Builder encryptSetting(String encryptSetting) {
                this.encryptSetting = encryptSetting;
                return this;
            }

            /**
             * MuxConfig.
             */
            public Builder muxConfig(String muxConfig) {
                this.muxConfig = muxConfig;
                return this;
            }

            /**
             * PackageSetting.
             */
            public Builder packageSetting(String packageSetting) {
                this.packageSetting = packageSetting;
                return this;
            }

            /**
             * Rotate.
             */
            public Builder rotate(String rotate) {
                this.rotate = rotate;
                return this;
            }

            /**
             * SubtitleList.
             */
            public Builder subtitleList(String subtitleList) {
                this.subtitleList = subtitleList;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * TransConfig.
             */
            public Builder transConfig(String transConfig) {
                this.transConfig = transConfig;
                return this;
            }

            /**
             * TranscodeFileRegular.
             */
            public Builder transcodeFileRegular(String transcodeFileRegular) {
                this.transcodeFileRegular = transcodeFileRegular;
                return this;
            }

            /**
             * TranscodeTemplateId.
             */
            public Builder transcodeTemplateId(String transcodeTemplateId) {
                this.transcodeTemplateId = transcodeTemplateId;
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
             * Video.
             */
            public Builder video(String video) {
                this.video = video;
                return this;
            }

            /**
             * WatermarkIds.
             */
            public Builder watermarkIds(java.util.List < String > watermarkIds) {
                this.watermarkIds = watermarkIds;
                return this;
            }

            public TranscodeTemplateList build() {
                return new TranscodeTemplateList(this);
            } 

        } 

    }
    public static class TranscodeTemplateGroup extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("IsDefault")
        private String isDefault;

        @NameInMap("Locked")
        private String locked;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("TranscodeTemplateGroupId")
        private String transcodeTemplateGroupId;

        @NameInMap("TranscodeTemplateList")
        private java.util.List < TranscodeTemplateList> transcodeTemplateList;

        private TranscodeTemplateGroup(Builder builder) {
            this.appId = builder.appId;
            this.creationTime = builder.creationTime;
            this.isDefault = builder.isDefault;
            this.locked = builder.locked;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.transcodeTemplateGroupId = builder.transcodeTemplateGroupId;
            this.transcodeTemplateList = builder.transcodeTemplateList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeTemplateGroup create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return isDefault
         */
        public String getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return locked
         */
        public String getLocked() {
            return this.locked;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return transcodeTemplateGroupId
         */
        public String getTranscodeTemplateGroupId() {
            return this.transcodeTemplateGroupId;
        }

        /**
         * @return transcodeTemplateList
         */
        public java.util.List < TranscodeTemplateList> getTranscodeTemplateList() {
            return this.transcodeTemplateList;
        }

        public static final class Builder {
            private String appId; 
            private String creationTime; 
            private String isDefault; 
            private String locked; 
            private String modifyTime; 
            private String name; 
            private String transcodeTemplateGroupId; 
            private java.util.List < TranscodeTemplateList> transcodeTemplateList; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * IsDefault.
             */
            public Builder isDefault(String isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * Locked.
             */
            public Builder locked(String locked) {
                this.locked = locked;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * TranscodeTemplateGroupId.
             */
            public Builder transcodeTemplateGroupId(String transcodeTemplateGroupId) {
                this.transcodeTemplateGroupId = transcodeTemplateGroupId;
                return this;
            }

            /**
             * TranscodeTemplateList.
             */
            public Builder transcodeTemplateList(java.util.List < TranscodeTemplateList> transcodeTemplateList) {
                this.transcodeTemplateList = transcodeTemplateList;
                return this;
            }

            public TranscodeTemplateGroup build() {
                return new TranscodeTemplateGroup(this);
            } 

        } 

    }
}
