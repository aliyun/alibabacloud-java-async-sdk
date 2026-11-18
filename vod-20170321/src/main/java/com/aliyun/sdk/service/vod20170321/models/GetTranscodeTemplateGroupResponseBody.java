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
 * {@link GetTranscodeTemplateGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetTranscodeTemplateGroupResponseBody</p>
 */
public class GetTranscodeTemplateGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TranscodeTemplateGroup")
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

        private Builder(GetTranscodeTemplateGroupResponseBody model) {
            this.requestId = model.requestId;
            this.transcodeTemplateGroup = model.transcodeTemplateGroup;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6730AC93-7B12-4B*****7F-49EE1FE8BC49</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The data of the transcoding template group.</p>
         */
        public Builder transcodeTemplateGroup(TranscodeTemplateGroup transcodeTemplateGroup) {
            this.transcodeTemplateGroup = transcodeTemplateGroup;
            return this;
        }

        public GetTranscodeTemplateGroupResponseBody build() {
            return new GetTranscodeTemplateGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTranscodeTemplateGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeTemplateGroupResponseBody</p>
     */
    public static class TranscodeTemplateList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Audio")
        private String audio;

        @com.aliyun.core.annotation.NameInMap("Clip")
        private String clip;

        @com.aliyun.core.annotation.NameInMap("Container")
        private String container;

        @com.aliyun.core.annotation.NameInMap("CopyrightMark")
        private String copyrightMark;

        @com.aliyun.core.annotation.NameInMap("Definition")
        private String definition;

        @com.aliyun.core.annotation.NameInMap("EncryptSetting")
        private String encryptSetting;

        @com.aliyun.core.annotation.NameInMap("MuxConfig")
        private String muxConfig;

        @com.aliyun.core.annotation.NameInMap("PackageSetting")
        private String packageSetting;

        @com.aliyun.core.annotation.NameInMap("Rotate")
        private String rotate;

        @com.aliyun.core.annotation.NameInMap("SubtitleList")
        private String subtitleList;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("TraceMark")
        private String traceMark;

        @com.aliyun.core.annotation.NameInMap("TransConfig")
        private String transConfig;

        @com.aliyun.core.annotation.NameInMap("TranscodeFileRegular")
        private String transcodeFileRegular;

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
        public java.util.List<String> getWatermarkIds() {
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
            private java.util.List<String> watermarkIds; 

            private Builder() {
            } 

            private Builder(TranscodeTemplateList model) {
                this.audio = model.audio;
                this.clip = model.clip;
                this.container = model.container;
                this.copyrightMark = model.copyrightMark;
                this.definition = model.definition;
                this.encryptSetting = model.encryptSetting;
                this.muxConfig = model.muxConfig;
                this.packageSetting = model.packageSetting;
                this.rotate = model.rotate;
                this.subtitleList = model.subtitleList;
                this.templateName = model.templateName;
                this.traceMark = model.traceMark;
                this.transConfig = model.transConfig;
                this.transcodeFileRegular = model.transcodeFileRegular;
                this.transcodeTemplateId = model.transcodeTemplateId;
                this.type = model.type;
                this.video = model.video;
                this.watermarkIds = model.watermarkIds;
            } 

            /**
             * <p>The transcoding configuration parameters for the audio stream. The value is a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Codec&quot;:&quot;AAC&quot;,&quot;Remove&quot;:&quot;false&quot;,&quot;Bitrate&quot;:&quot;44&quot;,&quot;Samplerate&quot;:&quot;32000&quot;,&quot;Channels&quot;:&quot;2&quot;,&quot;Profile&quot;:&quot;aac_low&quot;}</p>
             */
            public Builder audio(String audio) {
                this.audio = audio;
                return this;
            }

            /**
             * <p>The video clipping configuration. The value is a JSON string. For example, if you need to extract 5 seconds of content from a video to generate a new video, you can set this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;TimeSpan&quot;:{&quot;Seek&quot;:&quot;1&quot;,&quot;Duration&quot;:&quot;5&quot;}</p>
             */
            public Builder clip(String clip) {
                this.clip = clip;
                return this;
            }

            /**
             * <p>The container format that encapsulates the audio and video streams. The value is a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;Format&quot;:&quot;m3u8&quot;</p>
             */
            public Builder container(String container) {
                this.container = container;
                return this;
            }

            /**
             * <p>The copyright watermark information.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;Content&quot;: &quot;Test copyright watermark text&quot;
             * }</p>
             */
            public Builder copyrightMark(String copyrightMark) {
                this.copyrightMark = copyrightMark;
                return this;
            }

            /**
             * <p>The definition tags for standard transcoding templates:</p>
             * <ul>
             * <li><strong>LD</strong> (Smooth)</li>
             * <li><strong>SD</strong> (Standard definition)</li>
             * <li><strong>HD</strong> (High definition)</li>
             * <li><strong>FHD</strong> (Full high definition)</li>
             * <li><strong>OD</strong> (Original definition, which means container format conversion)</li>
             * <li><strong>2K</strong></li>
             * <li><strong>4K</strong></li>
             * <li><strong>SQ</strong> (Standard sound quality)</li>
             * <li><strong>HQ</strong> (High sound quality)</li>
             * </ul>
             * <p>The definition tags for built-in Narrowband HD™ 1.0 transcoding templates:</p>
             * <ul>
             * <li><strong>LD-NBV1</strong> (Smooth)</li>
             * <li><strong>SD-NBV1</strong> (Standard definition)</li>
             * <li><strong>HD-NBV1</strong> (High definition)</li>
             * <li><strong>FHD-NBV1</strong> (Full high definition)</li>
             * <li><strong>2K-NBV1</strong></li>
             * <li><strong>4K-NBV1</strong></li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>You cannot modify the definition tags of transcoding templates.</li>
             * <li>The audio and video resolutions, bitrates, and other parameters of Narrowband HD™ 1.0 transcoding templates are built-in and cannot be modified.</li>
             * <li>Narrowband HD™ 1.0 transcoding templates support only the FLV, M3U8 (HLS), and MP4 formats.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>SD</p>
             */
            public Builder definition(String definition) {
                this.definition = definition;
                return this;
            }

            /**
             * <p>The encryption configuration information for transcoding.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;EncryptType&quot;:&quot;Private&quot;</p>
             */
            public Builder encryptSetting(String encryptSetting) {
                this.encryptSetting = encryptSetting;
                return this;
            }

            /**
             * <p>The segment settings for transcoding. This parameter is required for HLS. The value is a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;Segment&quot;: { &quot;Duration&quot;:&quot;6&quot; }</p>
             */
            public Builder muxConfig(String muxConfig) {
                this.muxConfig = muxConfig;
                return this;
            }

            /**
             * <p>The packaging configuration. Only HLS adaptive bitrate streaming packaging and DASH packaging are supported. The value is a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;PackageType&quot;:&quot;HLSPackage&quot;,&quot;PackageConfig&quot;:{   &quot;BandWidth&quot;:&quot;900000&quot;  }</p>
             */
            public Builder packageSetting(String packageSetting) {
                this.packageSetting = packageSetting;
                return this;
            }

            /**
             * <p>The video rotation parameter. This parameter controls the rotation angle of the video image. For example, if you set this parameter to 180, the video image is upside down. Valid values: <code>[0,360]</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder rotate(String rotate) {
                this.rotate = rotate;
                return this;
            }

            /**
             * <p>The subtitle configuration. The value is a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;SubtitleUrl&quot;:&quot;<a href="http://outin-test.oss-cn-shanghai.aliyuncs.com/subtitles/c737fece-14f1-4364-b107-d5f7f8edde0e.ass%22,%22CharEncode%22:%22utf-8%22%7D%5D">http://outin-test.oss-cn-shanghai.aliyuncs.com/subtitles/c737fece-14f1-4364-b107-d5f7f8edde0e.ass&quot;,&quot;CharEncode&quot;:&quot;utf-8&quot;}]</a></p>
             */
            public Builder subtitleList(String subtitleList) {
                this.subtitleList = subtitleList;
                return this;
            }

            /**
             * <p>The name of the transcoding template.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The tracing watermark information.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;Enable&quot;: true
             * }</p>
             */
            public Builder traceMark(String traceMark) {
                this.traceMark = traceMark;
                return this;
            }

            /**
             * <p>The conditional transcoding parameters. If you need to make basic logical judgments based on the bitrate and resolution of the source video before outputting the transcoded video, you can set this parameter. The value is a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;IsCheckReso&quot;:&quot;true&quot;,&quot;IsCheckResoFail&quot;:&quot;false&quot;,&quot;IsCheckVideoBitrate&quot;:&quot;false&quot;,&quot;IsCheckVideoBitrateFail&quot;:&quot;false&quot;,&quot;IsCheckAudioBitrate&quot;:&quot;false&quot;,&quot;IsCheckAudioBitrateFail&quot;:&quot;false&quot;}</p>
             */
            public Builder transConfig(String transConfig) {
                this.transConfig = transConfig;
                return this;
            }

            /**
             * <p>The custom output path for transcoding.</p>
             * 
             * <strong>example:</strong>
             * <p>{MediaId}/transcoce_1</p>
             */
            public Builder transcodeFileRegular(String transcodeFileRegular) {
                this.transcodeFileRegular = transcodeFileRegular;
                return this;
            }

            /**
             * <p>The ID of the transcoding template.</p>
             * 
             * <strong>example:</strong>
             * <p>696d29a11erc057*****a3acc398d02f4</p>
             */
            public Builder transcodeTemplateId(String transcodeTemplateId) {
                this.transcodeTemplateId = transcodeTemplateId;
                return this;
            }

            /**
             * <p>The templatetype. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong> (default): A standard transcoding template. You cannot configure the Settings for the PackageSetting parameter for this type of template.</li>
             * <li><strong>VideoPackage</strong>: A video stream packaging template. This type of template transcodes the video stream first and then builds an adaptive bitrate stream. You must configure the Settings for the PackageSetting parameter.</li>
             * <li><strong>SubtitlePackage</strong>: A subtitle packaging template. This type of template does not transcode the video stream. It only builds the corresponding subtitle information into the adaptive bitrate output file. You must configure the Settings for the PackageSetting parameter. This type of template cannot exist independently in a template group and must be configured together with a VideoPackage template. You can configure only one SubtitlePackage template in a template group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The transcoding configuration parameters for the video stream. The value is a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Codec&quot;:&quot;H.264&quot;,&quot;Bitrate&quot;:&quot;900&quot;,&quot;Width&quot;:&quot;960&quot;,&quot;Remove&quot;:&quot;false&quot;,&quot;Fps&quot;:&quot;30&quot;}</p>
             */
            public Builder video(String video) {
                this.video = video;
                return this;
            }

            /**
             * <p>The IDs of the associated image and text watermark templates.</p>
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
     * {@link GetTranscodeTemplateGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscodeTemplateGroupResponseBody</p>
     */
    public static class TranscodeTemplateGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private String isDefault;

        @com.aliyun.core.annotation.NameInMap("Locked")
        private String locked;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("TranscodeTemplateGroupId")
        private String transcodeTemplateGroupId;

        @com.aliyun.core.annotation.NameInMap("TranscodeTemplateList")
        private java.util.List<TranscodeTemplateList> transcodeTemplateList;

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
        public java.util.List<TranscodeTemplateList> getTranscodeTemplateList() {
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
            private java.util.List<TranscodeTemplateList> transcodeTemplateList; 

            private Builder() {
            } 

            private Builder(TranscodeTemplateGroup model) {
                this.appId = model.appId;
                this.creationTime = model.creationTime;
                this.isDefault = model.isDefault;
                this.locked = model.locked;
                this.modifyTime = model.modifyTime;
                this.name = model.name;
                this.transcodeTemplateGroupId = model.transcodeTemplateGroupId;
                this.transcodeTemplateList = model.transcodeTemplateList;
            } 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>app-****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The time when the template group was created. The time follows the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-12-12T10:20:51Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>Specifies whether the template group is the default template group. Valid values:</p>
             * <ul>
             * <li><strong>Default</strong>: The default template group.</li>
             * <li><strong>NotDefault</strong>: A non-default template group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NotDefault</p>
             */
            public Builder isDefault(String isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>Specifies whether the template group is locked. Valid values:</p>
             * <ul>
             * <li><strong>Disabled</strong>: Not locked.</li>
             * <li><strong>Enabled</strong>: Locked.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder locked(String locked) {
                this.locked = locked;
                return this;
            }

            /**
             * <p>The time when the template group was modified. The time follows the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-12-12T11:20:51Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The name of the template group.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the transcoding template group.</p>
             * 
             * <strong>example:</strong>
             * <p>a59b11f697c716*****6ae1502142d0</p>
             */
            public Builder transcodeTemplateGroupId(String transcodeTemplateGroupId) {
                this.transcodeTemplateGroupId = transcodeTemplateGroupId;
                return this;
            }

            /**
             * <p>The list of transcoding template configuration information.</p>
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
