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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the transcoding template group.
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

        @NameInMap("CopyrightMark")
        private String copyrightMark;

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

        @NameInMap("TraceMark")
        private String traceMark;

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
            this.copyrightMark = builder.copyrightMark;
            this.definition = builder.definition;
            this.encryptSetting = builder.encryptSetting;
            this.muxConfig = builder.muxConfig;
            this.packageSetting = builder.packageSetting;
            this.rotate = builder.rotate;
            this.subtitleList = builder.subtitleList;
            this.templateName = builder.templateName;
            this.traceMark = builder.traceMark;
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
         * @return copyrightMark
         */
        public String getCopyrightMark() {
            return this.copyrightMark;
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
         * @return traceMark
         */
        public String getTraceMark() {
            return this.traceMark;
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
            private String copyrightMark; 
            private String definition; 
            private String encryptSetting; 
            private String muxConfig; 
            private String packageSetting; 
            private String rotate; 
            private String subtitleList; 
            private String templateName; 
            private String traceMark; 
            private String transConfig; 
            private String transcodeFileRegular; 
            private String transcodeTemplateId; 
            private String type; 
            private String video; 
            private java.util.List < String > watermarkIds; 

            /**
             * The transcoding configurations of the audio stream. The value is a JSON string.
             */
            public Builder audio(String audio) {
                this.audio = audio;
                return this;
            }

            /**
             * The clipping configurations of the video. The value is a JSON string. For example, this parameter is returned if you extract 5 seconds of content from a video to generate a new video.
             */
            public Builder clip(String clip) {
                this.clip = clip;
                return this;
            }

            /**
             * The format of the container used to encapsulate audio and video streams. The value is a JSON string.
             */
            public Builder container(String container) {
                this.container = container;
                return this;
            }

            /**
             * The content of the copyright watermark.
             */
            public Builder copyrightMark(String copyrightMark) {
                this.copyrightMark = copyrightMark;
                return this;
            }

            /**
             * Valid values for the definition of a common transcoding template:
             * <p>
             * 
             * *   **LD**: low definition.
             * *   **SD**: standard definition.
             * *   **HD**: high definition.
             * *   **FHD**: ultra high definition.
             * *   **OD**: original quality.
             * *   **2K**
             * *   **4K**
             * *   **SQ**: standard sound quality.
             * *   **HQ**: high sound quality.
             * 
             * Valid values for the definition of a Narrowband HD™ 1.0 transcoding template:
             * 
             * *   **LD-NBV1**: low definition.
             * *   **SD-NBV1**: standard definition.
             * *   **HD-NBV1**: high definition.
             * *   **FHD-NBV1**: ultra high definition.
             * *   **2K-NBV1**
             * *   **4K-NBV1**
             * 
             * > *   You cannot change the definition of a transcoding template.
             * >*   You cannot modify the system parameters, such as the video resolution, audio resolution, and bitrate, of Narrowband HD™ 1.0 transcoding templates.
             * >*   You can create only Narrowband HD™ 1.0 transcoding templates that support the FLV, M3U8 (HLS), and MP4 output formats.
             */
            public Builder definition(String definition) {
                this.definition = definition;
                return this;
            }

            /**
             * The encryption configuration for transcoding.
             */
            public Builder encryptSetting(String encryptSetting) {
                this.encryptSetting = encryptSetting;
                return this;
            }

            /**
             * The transcoding segment configurations. This parameter must be returned if HTTP-Live-Streaming (HLS) encryption is used. The value is a JSON string.
             */
            public Builder muxConfig(String muxConfig) {
                this.muxConfig = muxConfig;
                return this;
            }

            /**
             * The packaging configuration. Only HLS packaging and DASH packaging are supported. The value is a JSON string.
             */
            public Builder packageSetting(String packageSetting) {
                this.packageSetting = packageSetting;
                return this;
            }

            /**
             * The video rotation identifier. It is used to control the image rotation angle. For example, if you set this parameter to 180, the video image is turned upside down. Valid values: `[0,360]`.
             */
            public Builder rotate(String rotate) {
                this.rotate = rotate;
                return this;
            }

            /**
             * The subtitle configurations. The value is a JSON string.
             */
            public Builder subtitleList(String subtitleList) {
                this.subtitleList = subtitleList;
                return this;
            }

            /**
             * The name of the transcoding template.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * The content of the tracing watermark.
             */
            public Builder traceMark(String traceMark) {
                this.traceMark = traceMark;
                return this;
            }

            /**
             * The conditional transcoding configurations. This parameter can be used if you want to determine the basic logic based on the bitrate and resolution of the source file before the video is transcoded. The value is a JSON-formatted string.
             */
            public Builder transConfig(String transConfig) {
                this.transConfig = transConfig;
                return this;
            }

            /**
             * The custom path used to store the output files.
             */
            public Builder transcodeFileRegular(String transcodeFileRegular) {
                this.transcodeFileRegular = transcodeFileRegular;
                return this;
            }

            /**
             * The transcoding template ID.
             */
            public Builder transcodeTemplateId(String transcodeTemplateId) {
                this.transcodeTemplateId = transcodeTemplateId;
                return this;
            }

            /**
             * The type of the transcoding template. Valid values:
             * <p>
             * 
             * *   **Normal** (default): a common transcoding template. The PackageSetting parameter cannot be set for this type of template.
             * *   **VideoPackage**: a video stream package template. If this type of template is used, ApsaraVideo VOD transcodes a video into video streams in different bitrates and packages these video streams with a file. The PackageSetting parameter must be set for this type of template.
             * *   **SubtitlePackage**: a subtitle package template. If this type of template is used, ApsaraVideo VOD adds the subtitle information to the output file generated by packaging the multi-bitrate video streams of the corresponding video without transcoding. You must set the PackageSetting parameter for a subtitle package template and associate the subtitle package template with a video stream package template. A template group can contain only one subtitle package template.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The transcoding configurations of the video stream. The value is a JSON string.
             */
            public Builder video(String video) {
                this.video = video;
                return this;
            }

            /**
             * The IDs of the associated watermarks.
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
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The time when the transcoding template group was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*hh:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Indicates whether the template group is the default one. Valid values:
             * <p>
             * 
             * *   **Default**
             * *   **NotDefault**
             */
            public Builder isDefault(String isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * Indicates whether the transcoding template group is locked. Valid values:
             * <p>
             * 
             * *   **Disabled**: The template group is not locked.
             * *   **Enabled**: The template group is locked.
             */
            public Builder locked(String locked) {
                this.locked = locked;
                return this;
            }

            /**
             * The time when the transcoding template group was last modified. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*hh:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * The name of the transcoding template group.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the transcoding template group.
             */
            public Builder transcodeTemplateGroupId(String transcodeTemplateGroupId) {
                this.transcodeTemplateGroupId = transcodeTemplateGroupId;
                return this;
            }

            /**
             * The information about the transcoding templates.
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
