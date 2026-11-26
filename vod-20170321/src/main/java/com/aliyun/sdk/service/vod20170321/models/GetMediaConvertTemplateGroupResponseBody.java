// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetMediaConvertTemplateGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetMediaConvertTemplateGroupResponseBody</p>
 */
public class GetMediaConvertTemplateGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TranscodeTemplateGroup")
    private TranscodeTemplateGroup transcodeTemplateGroup;

    private GetMediaConvertTemplateGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.transcodeTemplateGroup = builder.transcodeTemplateGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMediaConvertTemplateGroupResponseBody create() {
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
     * @return transcodeTemplateGroup
     */
    public TranscodeTemplateGroup getTranscodeTemplateGroup() {
        return this.transcodeTemplateGroup;
    }

    public static final class Builder {
        private String requestId; 
        private TranscodeTemplateGroup transcodeTemplateGroup; 

        private Builder() {
        } 

        private Builder(GetMediaConvertTemplateGroupResponseBody model) {
            this.requestId = model.requestId;
            this.transcodeTemplateGroup = model.transcodeTemplateGroup;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4AF6-D7393642CA58****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The transcoding template group information.</p>
         */
        public Builder transcodeTemplateGroup(TranscodeTemplateGroup transcodeTemplateGroup) {
            this.transcodeTemplateGroup = transcodeTemplateGroup;
            return this;
        }

        public GetMediaConvertTemplateGroupResponseBody build() {
            return new GetMediaConvertTemplateGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMediaConvertTemplateGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaConvertTemplateGroupResponseBody</p>
     */
    public static class TranscodeTemplateList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Audio")
        private String audio;

        @com.aliyun.core.annotation.NameInMap("Container")
        private String container;

        @com.aliyun.core.annotation.NameInMap("Definition")
        private String definition;

        @com.aliyun.core.annotation.NameInMap("EncryptSetting")
        private String encryptSetting;

        @com.aliyun.core.annotation.NameInMap("MuxConfig")
        private String muxConfig;

        @com.aliyun.core.annotation.NameInMap("PackageSetting")
        private String packageSetting;

        @com.aliyun.core.annotation.NameInMap("SubtitleList")
        private String subtitleList;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("TransConfig")
        private String transConfig;

        @com.aliyun.core.annotation.NameInMap("TranscodeTemplateId")
        private String transcodeTemplateId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Video")
        private String video;

        @com.aliyun.core.annotation.NameInMap("WatermarkIds")
        private java.util.List<String> watermarkIds;

        private TranscodeTemplateList(Builder builder) {
            this.audio = builder.audio;
            this.container = builder.container;
            this.definition = builder.definition;
            this.encryptSetting = builder.encryptSetting;
            this.muxConfig = builder.muxConfig;
            this.packageSetting = builder.packageSetting;
            this.subtitleList = builder.subtitleList;
            this.templateName = builder.templateName;
            this.transConfig = builder.transConfig;
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
        public java.util.List<String> getWatermarkIds() {
            return this.watermarkIds;
        }

        public static final class Builder {
            private String audio; 
            private String container; 
            private String definition; 
            private String encryptSetting; 
            private String muxConfig; 
            private String packageSetting; 
            private String subtitleList; 
            private String templateName; 
            private String transConfig; 
            private String transcodeTemplateId; 
            private String type; 
            private String video; 
            private java.util.List<String> watermarkIds; 

            private Builder() {
            } 

            private Builder(TranscodeTemplateList model) {
                this.audio = model.audio;
                this.container = model.container;
                this.definition = model.definition;
                this.encryptSetting = model.encryptSetting;
                this.muxConfig = model.muxConfig;
                this.packageSetting = model.packageSetting;
                this.subtitleList = model.subtitleList;
                this.templateName = model.templateName;
                this.transConfig = model.transConfig;
                this.transcodeTemplateId = model.transcodeTemplateId;
                this.type = model.type;
                this.video = model.video;
                this.watermarkIds = model.watermarkIds;
            } 

            /**
             * <p>The transcoding parameters for the audio stream. The value is a JSON string that includes Codec, Bitrate, Samplerate, and Channels. The default value of Codec is AAC.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Codec&quot;:&quot;AAC&quot;,&quot;Bitrate&quot;:&quot;128&quot;,&quot;Samplerate&quot;:&quot;44100&quot;}</p>
             */
            public Builder audio(String audio) {
                this.audio = audio;
                return this;
            }

            /**
             * <p>The container format configuration. The value is a JSON string that includes Format. Valid values for Format: mp4, m3u8, and mpd.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Format&quot;:&quot;m3u8&quot;}</p>
             */
            public Builder container(String container) {
                this.container = container;
                return this;
            }

            /**
             * <p>The definition identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>HD</p>
             */
            public Builder definition(String definition) {
                this.definition = definition;
                return this;
            }

            /**
             * <p>The encryption configuration. The value is a JSON string that includes EncryptType and EncryptConfig.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;EncryptType&quot;:&quot;Private&quot;}</p>
             */
            public Builder encryptSetting(String encryptSetting) {
                this.encryptSetting = encryptSetting;
                return this;
            }

            /**
             * <p>The muxing parameters. The value is a JSON string. When you generate an m3u8 file, you can set Segment.Duration to specify the segment duration.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Segment&quot;:{&quot;Duration&quot;:&quot;10&quot;}}</p>
             */
            public Builder muxConfig(String muxConfig) {
                this.muxConfig = muxConfig;
                return this;
            }

            /**
             * <p>The packaging configuration. The value is a JSON string that includes PackageType. This parameter is used for video and subtitle packaging templates.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;PackageType&quot;:&quot;HLSPackage&quot;}</p>
             */
            public Builder packageSetting(String packageSetting) {
                this.packageSetting = packageSetting;
                return this;
            }

            /**
             * <p>The list of subtitle configurations. The value is a JSON string array.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;Language&quot;:&quot;eng&quot;}]</p>
             */
            public Builder subtitleList(String subtitleList) {
                this.subtitleList = subtitleList;
                return this;
            }

            /**
             * <p>The name of the transcoding template.</p>
             * 
             * <strong>example:</strong>
             * <p>hd-720p</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The general transcoding configuration. The value is a JSON string that includes TransMode and other parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;TransMode&quot;:&quot;ONE&quot;}</p>
             */
            public Builder transConfig(String transConfig) {
                this.transConfig = transConfig;
                return this;
            }

            /**
             * <p>The ID of the transcoding template.</p>
             * 
             * <strong>example:</strong>
             * <p>4c71a339fe52b4fa6f4527****</p>
             */
            public Builder transcodeTemplateId(String transcodeTemplateId) {
                this.transcodeTemplateId = transcodeTemplateId;
                return this;
            }

            /**
             * <p>The templatetype. Valid values: <strong>Normal</strong>: normal transcoding template. <strong>VideoPackage</strong>: video packaging template. <strong>SubtitlePackage</strong>: subtitle packaging template.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The transcoding parameters for the video stream. The value is a JSON string that includes Codec, Bitrate, Width, Height, and Fps. The default value of Codec is H.264.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Codec&quot;:&quot;H.264&quot;,&quot;Bitrate&quot;:&quot;2000&quot;,&quot;Width&quot;:&quot;1280&quot;,&quot;Height&quot;:&quot;720&quot;}</p>
             */
            public Builder video(String video) {
                this.video = video;
                return this;
            }

            /**
             * <p>The list of watermark template IDs.</p>
             */
            public Builder watermarkIds(java.util.List<String> watermarkIds) {
                this.watermarkIds = watermarkIds;
                return this;
            }

            public TranscodeTemplateList build() {
                return new TranscodeTemplateList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMediaConvertTemplateGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaConvertTemplateGroupResponseBody</p>
     */
    public static class TranscodeTemplateGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("GroupConfig")
        private String groupConfig;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("TemplateType")
        private String templateType;

        @com.aliyun.core.annotation.NameInMap("TranscodeTemplateGroupId")
        private String transcodeTemplateGroupId;

        @com.aliyun.core.annotation.NameInMap("TranscodeTemplateList")
        private java.util.List<TranscodeTemplateList> transcodeTemplateList;

        private TranscodeTemplateGroup(Builder builder) {
            this.appId = builder.appId;
            this.creationTime = builder.creationTime;
            this.groupConfig = builder.groupConfig;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.templateType = builder.templateType;
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
         * @return groupConfig
         */
        public String getGroupConfig() {
            return this.groupConfig;
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
         * @return templateType
         */
        public String getTemplateType() {
            return this.templateType;
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
        public java.util.List<TranscodeTemplateList> getTranscodeTemplateList() {
            return this.transcodeTemplateList;
        }

        public static final class Builder {
            private String appId; 
            private String creationTime; 
            private String groupConfig; 
            private String modifyTime; 
            private String name; 
            private String templateType; 
            private String transcodeTemplateGroupId; 
            private java.util.List<TranscodeTemplateList> transcodeTemplateList; 

            private Builder() {
            } 

            private Builder(TranscodeTemplateGroup model) {
                this.appId = model.appId;
                this.creationTime = model.creationTime;
                this.groupConfig = model.groupConfig;
                this.modifyTime = model.modifyTime;
                this.name = model.name;
                this.templateType = model.templateType;
                this.transcodeTemplateGroupId = model.transcodeTemplateGroupId;
                this.transcodeTemplateList = model.transcodeTemplateList;
            } 

            /**
             * <p>The application ID. Default value: <strong>app-1000000</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Multiple applications</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>app-****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The creation time. The time is displayed in UTC in the yyyy-MM-ddTHH:mm:ssZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-10T08:00:00Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The group-level configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;AutoStreamName&quot;:&quot;{RunId}_master&quot;}</p>
             */
            public Builder groupConfig(String groupConfig) {
                this.groupConfig = groupConfig;
                return this;
            }

            /**
             * <p>The modification time. The time is displayed in UTC in the yyyy-MM-ddTHH:mm:ssZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-10T08:00:00Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The name of the transcoding template group.</p>
             * 
             * <strong>example:</strong>
             * <p>mcTemplateGroup</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the template group, which is determined by the purpose of the first template in the group. Valid values: <strong>Normal</strong>: normal transcoding template group. <strong>VideoPackage</strong>: video packaging template group.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * <p>The ID of the transcoding template group.</p>
             * 
             * <strong>example:</strong>
             * <p>4c71a339fe52b4fa6f4527****</p>
             */
            public Builder transcodeTemplateGroupId(String transcodeTemplateGroupId) {
                this.transcodeTemplateGroupId = transcodeTemplateGroupId;
                return this;
            }

            /**
             * <p>The list of transcoding template configurations.</p>
             */
            public Builder transcodeTemplateList(java.util.List<TranscodeTemplateList> transcodeTemplateList) {
                this.transcodeTemplateList = transcodeTemplateList;
                return this;
            }

            public TranscodeTemplateGroup build() {
                return new TranscodeTemplateGroup(this);
            } 

        } 

    }
}
