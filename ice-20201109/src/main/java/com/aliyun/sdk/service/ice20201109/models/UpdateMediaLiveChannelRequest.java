// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link UpdateMediaLiveChannelRequest} extends {@link RequestModel}
 *
 * <p>UpdateMediaLiveChannelRequest</p>
 */
public class UpdateMediaLiveChannelRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AudioSettings")
    private java.util.List<AudioSettings> audioSettings;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InputAttachments")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<InputAttachments> inputAttachments;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OutputGroups")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<OutputGroups> outputGroups;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VideoSettings")
    private java.util.List<VideoSettings> videoSettings;

    private UpdateMediaLiveChannelRequest(Builder builder) {
        super(builder);
        this.audioSettings = builder.audioSettings;
        this.channelId = builder.channelId;
        this.inputAttachments = builder.inputAttachments;
        this.name = builder.name;
        this.outputGroups = builder.outputGroups;
        this.videoSettings = builder.videoSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMediaLiveChannelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return audioSettings
     */
    public java.util.List<AudioSettings> getAudioSettings() {
        return this.audioSettings;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return inputAttachments
     */
    public java.util.List<InputAttachments> getInputAttachments() {
        return this.inputAttachments;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return outputGroups
     */
    public java.util.List<OutputGroups> getOutputGroups() {
        return this.outputGroups;
    }

    /**
     * @return videoSettings
     */
    public java.util.List<VideoSettings> getVideoSettings() {
        return this.videoSettings;
    }

    public static final class Builder extends Request.Builder<UpdateMediaLiveChannelRequest, Builder> {
        private java.util.List<AudioSettings> audioSettings; 
        private String channelId; 
        private java.util.List<InputAttachments> inputAttachments; 
        private String name; 
        private java.util.List<OutputGroups> outputGroups; 
        private java.util.List<VideoSettings> videoSettings; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMediaLiveChannelRequest request) {
            super(request);
            this.audioSettings = request.audioSettings;
            this.channelId = request.channelId;
            this.inputAttachments = request.inputAttachments;
            this.name = request.name;
            this.outputGroups = request.outputGroups;
            this.videoSettings = request.videoSettings;
        } 

        /**
         * <p>The audio settings.</p>
         */
        public Builder audioSettings(java.util.List<AudioSettings> audioSettings) {
            String audioSettingsShrink = shrink(audioSettings, "AudioSettings", "json");
            this.putBodyParameter("AudioSettings", audioSettingsShrink);
            this.audioSettings = audioSettings;
            return this;
        }

        /**
         * <p>The channel ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SEGK5KA6KYKAWQQH</p>
         */
        public Builder channelId(String channelId) {
            this.putBodyParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>The input attachment settings.</p>
         * <p>This parameter is required.</p>
         */
        public Builder inputAttachments(java.util.List<InputAttachments> inputAttachments) {
            String inputAttachmentsShrink = shrink(inputAttachments, "InputAttachments", "json");
            this.putBodyParameter("InputAttachments", inputAttachmentsShrink);
            this.inputAttachments = inputAttachments;
            return this;
        }

        /**
         * <p>The channel name. The name can contain letters, digits, hyphens (-), and underscores (_). The name can be up to 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mych</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The output group configuration.</p>
         * <p>This parameter is required.</p>
         */
        public Builder outputGroups(java.util.List<OutputGroups> outputGroups) {
            String outputGroupsShrink = shrink(outputGroups, "OutputGroups", "json");
            this.putBodyParameter("OutputGroups", outputGroupsShrink);
            this.outputGroups = outputGroups;
            return this;
        }

        /**
         * <p>The video settings.</p>
         */
        public Builder videoSettings(java.util.List<VideoSettings> videoSettings) {
            String videoSettingsShrink = shrink(videoSettings, "VideoSettings", "json");
            this.putBodyParameter("VideoSettings", videoSettingsShrink);
            this.videoSettings = videoSettings;
            return this;
        }

        @Override
        public UpdateMediaLiveChannelRequest build() {
            return new UpdateMediaLiveChannelRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateMediaLiveChannelRequest} extends {@link TeaModel}
     *
     * <p>UpdateMediaLiveChannelRequest</p>
     */
    public static class AudioCodecSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private Integer bitrate;

        @com.aliyun.core.annotation.NameInMap("Profile")
        private String profile;

        @com.aliyun.core.annotation.NameInMap("SampleRate")
        private Integer sampleRate;

        private AudioCodecSetting(Builder builder) {
            this.bitrate = builder.bitrate;
            this.profile = builder.profile;
            this.sampleRate = builder.sampleRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioCodecSetting create() {
            return builder().build();
        }

        /**
         * @return bitrate
         */
        public Integer getBitrate() {
            return this.bitrate;
        }

        /**
         * @return profile
         */
        public String getProfile() {
            return this.profile;
        }

        /**
         * @return sampleRate
         */
        public Integer getSampleRate() {
            return this.sampleRate;
        }

        public static final class Builder {
            private Integer bitrate; 
            private String profile; 
            private Integer sampleRate; 

            private Builder() {
            } 

            private Builder(AudioCodecSetting model) {
                this.bitrate = model.bitrate;
                this.profile = model.profile;
                this.sampleRate = model.sampleRate;
            } 

            /**
             * <p>The audio bitrate. Unit: bit/s. Valid values: 8000 to 1000000. The value must be divisible by 1000.</p>
             * 
             * <strong>example:</strong>
             * <p>200000</p>
             */
            public Builder bitrate(Integer bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The audio codec profile.
             * When the codec is aac, valid values are AAC-LOW and AAC-MAIN.
             * When the codec is libfdk_aac, valid values are AAC-LOW, AAC-HE, and AAC-HEV2.</p>
             * 
             * <strong>example:</strong>
             * <p>AAC-LOW</p>
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * <p>The audio sample rate. Unit: Hz. Valid values: 22050, 32000, 44100, 48000, and 96000.</p>
             * 
             * <strong>example:</strong>
             * <p>44100</p>
             */
            public Builder sampleRate(Integer sampleRate) {
                this.sampleRate = sampleRate;
                return this;
            }

            public AudioCodecSetting build() {
                return new AudioCodecSetting(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMediaLiveChannelRequest} extends {@link TeaModel}
     *
     * <p>UpdateMediaLiveChannelRequest</p>
     */
    public static class AudioSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioCodec")
        private String audioCodec;

        @com.aliyun.core.annotation.NameInMap("AudioCodecSetting")
        private AudioCodecSetting audioCodecSetting;

        @com.aliyun.core.annotation.NameInMap("AudioSelectorName")
        private String audioSelectorName;

        @com.aliyun.core.annotation.NameInMap("LanguageCode")
        private String languageCode;

        @com.aliyun.core.annotation.NameInMap("LanguageName")
        private String languageName;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        private AudioSettings(Builder builder) {
            this.audioCodec = builder.audioCodec;
            this.audioCodecSetting = builder.audioCodecSetting;
            this.audioSelectorName = builder.audioSelectorName;
            this.languageCode = builder.languageCode;
            this.languageName = builder.languageName;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioSettings create() {
            return builder().build();
        }

        /**
         * @return audioCodec
         */
        public String getAudioCodec() {
            return this.audioCodec;
        }

        /**
         * @return audioCodecSetting
         */
        public AudioCodecSetting getAudioCodecSetting() {
            return this.audioCodecSetting;
        }

        /**
         * @return audioSelectorName
         */
        public String getAudioSelectorName() {
            return this.audioSelectorName;
        }

        /**
         * @return languageCode
         */
        public String getLanguageCode() {
            return this.languageCode;
        }

        /**
         * @return languageName
         */
        public String getLanguageName() {
            return this.languageName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String audioCodec; 
            private AudioCodecSetting audioCodecSetting; 
            private String audioSelectorName; 
            private String languageCode; 
            private String languageName; 
            private String name; 

            private Builder() {
            } 

            private Builder(AudioSettings model) {
                this.audioCodec = model.audioCodec;
                this.audioCodecSetting = model.audioCodecSetting;
                this.audioSelectorName = model.audioSelectorName;
                this.languageCode = model.languageCode;
                this.languageName = model.languageName;
                this.name = model.name;
            } 

            /**
             * <p>The audio codec type. If this parameter is left empty, the value is copy, which means the source codec is used.
             * Valid values: aac and libfdk_aac.</p>
             * 
             * <strong>example:</strong>
             * <p>libfdk_aac</p>
             */
            public Builder audioCodec(String audioCodec) {
                this.audioCodec = audioCodec;
                return this;
            }

            /**
             * <p>The audio codec settings.</p>
             */
            public Builder audioCodecSetting(AudioCodecSetting audioCodecSetting) {
                this.audioCodecSetting = audioCodecSetting;
                return this;
            }

            /**
             * <p>The audio selector name.</p>
             * 
             * <strong>example:</strong>
             * <p>a1</p>
             */
            public Builder audioSelectorName(String audioSelectorName) {
                this.audioSelectorName = audioSelectorName;
                return this;
            }

            /**
             * <p>The ISO 639-2 language code. The code is 3 characters in length.
             * If the output corresponding to the audio track selected by the selector has a language code, the language code of the selector takes precedence. If the audio track selected by the selector does not have a language code or no audio track matches the selector, this language code is used.</p>
             * 
             * <strong>example:</strong>
             * <p>eng</p>
             */
            public Builder languageCode(String languageCode) {
                this.languageCode = languageCode;
                return this;
            }

            /**
             * <p>The language name. This parameter is valid only for RTMP inputs and specifies the Name tag used by the output.
             * The value can be up to 32 characters in length and supports the following character types:</p>
             * <ul>
             * <li>Unicode letters of various languages: including Latin letters (such as English and French), Chinese, Arabic, and letters of other languages.</li>
             * <li>Digits: 0 to 9. </li>
             * <li>Underscores (_) </li>
             * <li>Hyphens (-)</li>
             * <li>Spaces: spaces can appear in the middle of the value, but not at the beginning or end.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>English</p>
             */
            public Builder languageName(String languageName) {
                this.languageName = languageName;
                return this;
            }

            /**
             * <p>The audio setting name. The name can contain letters, digits, hyphens (-), and underscores (_). The name can be up to 64 characters in length.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>audio1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public AudioSettings build() {
                return new AudioSettings(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMediaLiveChannelRequest} extends {@link TeaModel}
     *
     * <p>UpdateMediaLiveChannelRequest</p>
     */
    public static class AudioLanguageSelection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LanguageCode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String languageCode;

        private AudioLanguageSelection(Builder builder) {
            this.languageCode = builder.languageCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioLanguageSelection create() {
            return builder().build();
        }

        /**
         * @return languageCode
         */
        public String getLanguageCode() {
            return this.languageCode;
        }

        public static final class Builder {
            private String languageCode; 

            private Builder() {
            } 

            private Builder(AudioLanguageSelection model) {
                this.languageCode = model.languageCode;
            } 

            /**
             * <p>The ISO 639-2 language code. The code is 3 characters in length.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>eng</p>
             */
            public Builder languageCode(String languageCode) {
                this.languageCode = languageCode;
                return this;
            }

            public AudioLanguageSelection build() {
                return new AudioLanguageSelection(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMediaLiveChannelRequest} extends {@link TeaModel}
     *
     * <p>UpdateMediaLiveChannelRequest</p>
     */
    public static class AudioPidSelection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Pid")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long pid;

        private AudioPidSelection(Builder builder) {
            this.pid = builder.pid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioPidSelection create() {
            return builder().build();
        }

        /**
         * @return pid
         */
        public Long getPid() {
            return this.pid;
        }

        public static final class Builder {
            private Long pid; 

            private Builder() {
            } 

            private Builder(AudioPidSelection model) {
                this.pid = model.pid;
            } 

            /**
             * <p>The PID of the input source stream.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder pid(Long pid) {
                this.pid = pid;
                return this;
            }

            public AudioPidSelection build() {
                return new AudioPidSelection(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMediaLiveChannelRequest} extends {@link TeaModel}
     *
     * <p>UpdateMediaLiveChannelRequest</p>
     */
    public static class AudioTrackSelection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TrackId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long trackId;

        private AudioTrackSelection(Builder builder) {
            this.trackId = builder.trackId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioTrackSelection create() {
            return builder().build();
        }

        /**
         * @return trackId
         */
        public Long getTrackId() {
            return this.trackId;
        }

        public static final class Builder {
            private Long trackId; 

            private Builder() {
            } 

            private Builder(AudioTrackSelection model) {
                this.trackId = model.trackId;
            } 

            /**
             * <p>The track ID of the input source stream. The value starts from 1.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder trackId(Long trackId) {
                this.trackId = trackId;
                return this;
            }

            public AudioTrackSelection build() {
                return new AudioTrackSelection(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMediaLiveChannelRequest} extends {@link TeaModel}
     *
     * <p>UpdateMediaLiveChannelRequest</p>
     */
    public static class AudioSelectors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioLanguageSelection")
        private AudioLanguageSelection audioLanguageSelection;

        @com.aliyun.core.annotation.NameInMap("AudioPidSelection")
        private AudioPidSelection audioPidSelection;

        @com.aliyun.core.annotation.NameInMap("AudioTrackSelection")
        private java.util.List<AudioTrackSelection> audioTrackSelection;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        private AudioSelectors(Builder builder) {
            this.audioLanguageSelection = builder.audioLanguageSelection;
            this.audioPidSelection = builder.audioPidSelection;
            this.audioTrackSelection = builder.audioTrackSelection;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioSelectors create() {
            return builder().build();
        }

        /**
         * @return audioLanguageSelection
         */
        public AudioLanguageSelection getAudioLanguageSelection() {
            return this.audioLanguageSelection;
        }

        /**
         * @return audioPidSelection
         */
        public AudioPidSelection getAudioPidSelection() {
            return this.audioPidSelection;
        }

        /**
         * @return audioTrackSelection
         */
        public java.util.List<AudioTrackSelection> getAudioTrackSelection() {
            return this.audioTrackSelection;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private AudioLanguageSelection audioLanguageSelection; 
            private AudioPidSelection audioPidSelection; 
            private java.util.List<AudioTrackSelection> audioTrackSelection; 
            private String name; 

            private Builder() {
            } 

            private Builder(AudioSelectors model) {
                this.audioLanguageSelection = model.audioLanguageSelection;
                this.audioPidSelection = model.audioPidSelection;
                this.audioTrackSelection = model.audioTrackSelection;
                this.name = model.name;
            } 

            /**
             * <p>The language selector.</p>
             */
            public Builder audioLanguageSelection(AudioLanguageSelection audioLanguageSelection) {
                this.audioLanguageSelection = audioLanguageSelection;
                return this;
            }

            /**
             * <p>The PID selector.</p>
             */
            public Builder audioPidSelection(AudioPidSelection audioPidSelection) {
                this.audioPidSelection = audioPidSelection;
                return this;
            }

            /**
             * <p>The track selector.</p>
             */
            public Builder audioTrackSelection(java.util.List<AudioTrackSelection> audioTrackSelection) {
                this.audioTrackSelection = audioTrackSelection;
                return this;
            }

            /**
             * <p>The audio selector name. The name can contain letters, digits, hyphens (-), and underscores (_). The name can be up to 64 characters in length.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>myselector</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public AudioSelectors build() {
                return new AudioSelectors(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMediaLiveChannelRequest} extends {@link TeaModel}
     *
     * <p>UpdateMediaLiveChannelRequest</p>
     */
    public static class InputAttachments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioSelectors")
        private java.util.List<AudioSelectors> audioSelectors;

        @com.aliyun.core.annotation.NameInMap("InputId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String inputId;

        @com.aliyun.core.annotation.NameInMap("LanguageName")
        private String languageName;

        private InputAttachments(Builder builder) {
            this.audioSelectors = builder.audioSelectors;
            this.inputId = builder.inputId;
            this.languageName = builder.languageName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputAttachments create() {
            return builder().build();
        }

        /**
         * @return audioSelectors
         */
        public java.util.List<AudioSelectors> getAudioSelectors() {
            return this.audioSelectors;
        }

        /**
         * @return inputId
         */
        public String getInputId() {
            return this.inputId;
        }

        /**
         * @return languageName
         */
        public String getLanguageName() {
            return this.languageName;
        }

        public static final class Builder {
            private java.util.List<AudioSelectors> audioSelectors; 
            private String inputId; 
            private String languageName; 

            private Builder() {
            } 

            private Builder(InputAttachments model) {
                this.audioSelectors = model.audioSelectors;
                this.inputId = model.inputId;
                this.languageName = model.languageName;
            } 

            /**
             * <p>The audio selector list.</p>
             */
            public Builder audioSelectors(java.util.List<AudioSelectors> audioSelectors) {
                this.audioSelectors = audioSelectors;
                return this;
            }

            /**
             * <p>The ID of the attached input.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>myinput</p>
             */
            public Builder inputId(String inputId) {
                this.inputId = inputId;
                return this;
            }

            /**
             * <p>The language name. This parameter is valid only for RTMP inputs and specifies the Name tag used by the output.
             * The value can be up to 32 characters in length and supports the following character types:</p>
             * <ul>
             * <li>Unicode letters of various languages: including Latin letters (such as English and French), Chinese, Arabic, and letters of other languages.</li>
             * <li>Digits: 0 to 9. </li>
             * <li>Underscores (_) </li>
             * <li>Hyphens (-)</li>
             * <li>Spaces: spaces can appear in the middle of the value, but not at the beginning or end.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>English</p>
             */
            public Builder languageName(String languageName) {
                this.languageName = languageName;
                return this;
            }

            public InputAttachments build() {
                return new InputAttachments(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMediaLiveChannelRequest} extends {@link TeaModel}
     *
     * <p>UpdateMediaLiveChannelRequest</p>
     */
    public static class MediaPackageGroupSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String channelName;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String groupName;

        private MediaPackageGroupSetting(Builder builder) {
            this.channelName = builder.channelName;
            this.groupName = builder.groupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaPackageGroupSetting create() {
            return builder().build();
        }

        /**
         * @return channelName
         */
        public String getChannelName() {
            return this.channelName;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        public static final class Builder {
            private String channelName; 
            private String groupName; 

            private Builder() {
            } 

            private Builder(MediaPackageGroupSetting model) {
                this.channelName = model.channelName;
                this.groupName = model.groupName;
            } 

            /**
             * <p>The ChannelName of the referenced MediaPackage.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>myPackageChannel</p>
             */
            public Builder channelName(String channelName) {
                this.channelName = channelName;
                return this;
            }

            /**
             * <p>The GroupName of the referenced MediaPackage.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>myPackageGroup</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            public MediaPackageGroupSetting build() {
                return new MediaPackageGroupSetting(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMediaLiveChannelRequest} extends {@link TeaModel}
     *
     * <p>UpdateMediaLiveChannelRequest</p>
     */
    public static class MediaPackageOutputSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioGroupId")
        private String audioGroupId;

        @com.aliyun.core.annotation.NameInMap("NameModifier")
        private String nameModifier;

        private MediaPackageOutputSetting(Builder builder) {
            this.audioGroupId = builder.audioGroupId;
            this.nameModifier = builder.nameModifier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaPackageOutputSetting create() {
            return builder().build();
        }

        /**
         * @return audioGroupId
         */
        public String getAudioGroupId() {
            return this.audioGroupId;
        }

        /**
         * @return nameModifier
         */
        public String getNameModifier() {
            return this.nameModifier;
        }

        public static final class Builder {
            private String audioGroupId; 
            private String nameModifier; 

            private Builder() {
            } 

            private Builder(MediaPackageOutputSetting model) {
                this.audioGroupId = model.audioGroupId;
                this.nameModifier = model.nameModifier;
            } 

            /**
             * <p>The manifest audio group ID settings. By specifying AudioGroupId, you can group multiple audio tracks into the same group to facilitate track selection during playback. The ID can contain letters, digits, hyphens (-), and underscores (_). The ID can be up to 40 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>audiogroup</p>
             */
            public Builder audioGroupId(String audioGroupId) {
                this.audioGroupId = audioGroupId;
                return this;
            }

            /**
             * <p>The manifest suffix, which is generally used for naming child m3u8 files. The suffix can contain letters, digits, hyphens (-), and underscores (_). The suffix can be up to 40 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>480p</p>
             */
            public Builder nameModifier(String nameModifier) {
                this.nameModifier = nameModifier;
                return this;
            }

            public MediaPackageOutputSetting build() {
                return new MediaPackageOutputSetting(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMediaLiveChannelRequest} extends {@link TeaModel}
     *
     * <p>UpdateMediaLiveChannelRequest</p>
     */
    public static class Outputs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioSettingNames")
        private java.util.List<String> audioSettingNames;

        @com.aliyun.core.annotation.NameInMap("MediaPackageOutputSetting")
        private MediaPackageOutputSetting mediaPackageOutputSetting;

        @com.aliyun.core.annotation.NameInMap("MediaType")
        private Integer mediaType;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("VideoSettingName")
        private String videoSettingName;

        private Outputs(Builder builder) {
            this.audioSettingNames = builder.audioSettingNames;
            this.mediaPackageOutputSetting = builder.mediaPackageOutputSetting;
            this.mediaType = builder.mediaType;
            this.name = builder.name;
            this.videoSettingName = builder.videoSettingName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Outputs create() {
            return builder().build();
        }

        /**
         * @return audioSettingNames
         */
        public java.util.List<String> getAudioSettingNames() {
            return this.audioSettingNames;
        }

        /**
         * @return mediaPackageOutputSetting
         */
        public MediaPackageOutputSetting getMediaPackageOutputSetting() {
            return this.mediaPackageOutputSetting;
        }

        /**
         * @return mediaType
         */
        public Integer getMediaType() {
            return this.mediaType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return videoSettingName
         */
        public String getVideoSettingName() {
            return this.videoSettingName;
        }

        public static final class Builder {
            private java.util.List<String> audioSettingNames; 
            private MediaPackageOutputSetting mediaPackageOutputSetting; 
            private Integer mediaType; 
            private String name; 
            private String videoSettingName; 

            private Builder() {
            } 

            private Builder(Outputs model) {
                this.audioSettingNames = model.audioSettingNames;
                this.mediaPackageOutputSetting = model.mediaPackageOutputSetting;
                this.mediaType = model.mediaType;
                this.name = model.name;
                this.videoSettingName = model.videoSettingName;
            } 

            /**
             * <p>The list of referenced audio setting names.</p>
             */
            public Builder audioSettingNames(java.util.List<String> audioSettingNames) {
                this.audioSettingNames = audioSettingNames;
                return this;
            }

            /**
             * <p>The output settings when the output group type is MediaPackage.</p>
             */
            public Builder mediaPackageOutputSetting(MediaPackageOutputSetting mediaPackageOutputSetting) {
                this.mediaPackageOutputSetting = mediaPackageOutputSetting;
                return this;
            }

            /**
             * <p>The media type of the output. Valid values:</p>
             * <ul>
             * <li>0: audio and video.</li>
             * <li>1: audio only. If this value is set, you cannot reference video settings.</li>
             * <li>2: video only. If this value is set, you cannot reference audio settings.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder mediaType(Integer mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * <p>The output name. The name can contain letters, digits, hyphens (-), and underscores (_). The name can be up to 64 characters in length.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>output1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The name of the referenced video setting.</p>
             * 
             * <strong>example:</strong>
             * <p>myVideo1</p>
             */
            public Builder videoSettingName(String videoSettingName) {
                this.videoSettingName = videoSettingName;
                return this;
            }

            public Outputs build() {
                return new Outputs(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMediaLiveChannelRequest} extends {@link TeaModel}
     *
     * <p>UpdateMediaLiveChannelRequest</p>
     */
    public static class OutputGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MediaPackageGroupSetting")
        private MediaPackageGroupSetting mediaPackageGroupSetting;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Outputs")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Outputs> outputs;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private OutputGroups(Builder builder) {
            this.mediaPackageGroupSetting = builder.mediaPackageGroupSetting;
            this.name = builder.name;
            this.outputs = builder.outputs;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputGroups create() {
            return builder().build();
        }

        /**
         * @return mediaPackageGroupSetting
         */
        public MediaPackageGroupSetting getMediaPackageGroupSetting() {
            return this.mediaPackageGroupSetting;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outputs
         */
        public java.util.List<Outputs> getOutputs() {
            return this.outputs;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private MediaPackageGroupSetting mediaPackageGroupSetting; 
            private String name; 
            private java.util.List<Outputs> outputs; 
            private String type; 

            private Builder() {
            } 

            private Builder(OutputGroups model) {
                this.mediaPackageGroupSetting = model.mediaPackageGroupSetting;
                this.name = model.name;
                this.outputs = model.outputs;
                this.type = model.type;
            } 

            /**
             * <p>The output group settings when the output group type is MediaPackage.</p>
             */
            public Builder mediaPackageGroupSetting(MediaPackageGroupSetting mediaPackageGroupSetting) {
                this.mediaPackageGroupSetting = mediaPackageGroupSetting;
                return this;
            }

            /**
             * <p>The output group name. The name can contain letters, digits, hyphens (-), and underscores (_). The name can be up to 64 characters in length.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>group1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The output list settings.</p>
             * <p>This parameter is required.</p>
             */
            public Builder outputs(java.util.List<Outputs> outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * <p>The output group type. Currently, only MediaPackage is supported.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>MediaPackage</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public OutputGroups build() {
                return new OutputGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMediaLiveChannelRequest} extends {@link TeaModel}
     *
     * <p>UpdateMediaLiveChannelRequest</p>
     */
    public static class CodecDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Profile")
        private String profile;

        private CodecDetail(Builder builder) {
            this.level = builder.level;
            this.profile = builder.profile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CodecDetail create() {
            return builder().build();
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return profile
         */
        public String getProfile() {
            return this.profile;
        }

        public static final class Builder {
            private String level; 
            private String profile; 

            private Builder() {
            } 

            private Builder(CodecDetail model) {
                this.level = model.level;
                this.profile = model.profile;
            } 

            /**
             * <p>The video encoding level. This parameter is not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>H264_LEVEL_AUTO</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The H.264 encoding profile. Valid values: BASELINE, HIGH, and MAIN. Default value: MAIN. This parameter takes effect only when the H.264 encoder is used.</p>
             * 
             * <strong>example:</strong>
             * <p>MAIN</p>
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            public CodecDetail build() {
                return new CodecDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMediaLiveChannelRequest} extends {@link TeaModel}
     *
     * <p>UpdateMediaLiveChannelRequest</p>
     */
    public static class Framerate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FramerateControl")
        private String framerateControl;

        @com.aliyun.core.annotation.NameInMap("FramerateDenominator")
        private Integer framerateDenominator;

        @com.aliyun.core.annotation.NameInMap("FramerateNumerator")
        private Integer framerateNumerator;

        private Framerate(Builder builder) {
            this.framerateControl = builder.framerateControl;
            this.framerateDenominator = builder.framerateDenominator;
            this.framerateNumerator = builder.framerateNumerator;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Framerate create() {
            return builder().build();
        }

        /**
         * @return framerateControl
         */
        public String getFramerateControl() {
            return this.framerateControl;
        }

        /**
         * @return framerateDenominator
         */
        public Integer getFramerateDenominator() {
            return this.framerateDenominator;
        }

        /**
         * @return framerateNumerator
         */
        public Integer getFramerateNumerator() {
            return this.framerateNumerator;
        }

        public static final class Builder {
            private String framerateControl; 
            private Integer framerateDenominator; 
            private Integer framerateNumerator; 

            private Builder() {
            } 

            private Builder(Framerate model) {
                this.framerateControl = model.framerateControl;
                this.framerateDenominator = model.framerateDenominator;
                this.framerateNumerator = model.framerateNumerator;
            } 

            /**
             * <p>The frame rate setting mode. Valid values: SPECIFIED (fixed frame rate) and FROM_SOURCE (same as the source video).</p>
             * 
             * <strong>example:</strong>
             * <p>SPECIFIED</p>
             */
            public Builder framerateControl(String framerateControl) {
                this.framerateControl = framerateControl;
                return this;
            }

            /**
             * <p>The denominator of the fixed frame rate. This parameter is required when the frame rate setting mode is set to SPECIFIED. Valid values: 1 to 60. The value must be divisible by the numerator.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder framerateDenominator(Integer framerateDenominator) {
                this.framerateDenominator = framerateDenominator;
                return this;
            }

            /**
             * <p>The numerator of the fixed frame rate. This parameter is required when the frame rate setting mode is set to SPECIFIED. Valid values: 1 to 60. The denominator must be divisible by the numerator.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder framerateNumerator(Integer framerateNumerator) {
                this.framerateNumerator = framerateNumerator;
                return this;
            }

            public Framerate build() {
                return new Framerate(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMediaLiveChannelRequest} extends {@link TeaModel}
     *
     * <p>UpdateMediaLiveChannelRequest</p>
     */
    public static class Gop extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BframesNum")
        private Integer bframesNum;

        @com.aliyun.core.annotation.NameInMap("GopSize")
        private Integer gopSize;

        @com.aliyun.core.annotation.NameInMap("GopSizeUnits")
        private String gopSizeUnits;

        private Gop(Builder builder) {
            this.bframesNum = builder.bframesNum;
            this.gopSize = builder.gopSize;
            this.gopSizeUnits = builder.gopSizeUnits;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Gop create() {
            return builder().build();
        }

        /**
         * @return bframesNum
         */
        public Integer getBframesNum() {
            return this.bframesNum;
        }

        /**
         * @return gopSize
         */
        public Integer getGopSize() {
            return this.gopSize;
        }

        /**
         * @return gopSizeUnits
         */
        public String getGopSizeUnits() {
            return this.gopSizeUnits;
        }

        public static final class Builder {
            private Integer bframesNum; 
            private Integer gopSize; 
            private String gopSizeUnits; 

            private Builder() {
            } 

            private Builder(Gop model) {
                this.bframesNum = model.bframesNum;
                this.gopSize = model.gopSize;
                this.gopSizeUnits = model.gopSizeUnits;
            } 

            /**
             * <p>The number of B-frames. Valid values: 1 to 3.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder bframesNum(Integer bframesNum) {
                this.bframesNum = bframesNum;
                return this;
            }

            /**
             * <p>The size of the video GOP. If the length unit is SECONDS, valid values are 1 to 20. If the length unit is FRAMES, valid values are 1 to 3000.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder gopSize(Integer gopSize) {
                this.gopSize = gopSize;
                return this;
            }

            /**
             * <p>The unit of the video GOP length. Valid values: FRAMES (frames) and SECONDS (seconds).</p>
             * 
             * <strong>example:</strong>
             * <p>FRAMES</p>
             */
            public Builder gopSizeUnits(String gopSizeUnits) {
                this.gopSizeUnits = gopSizeUnits;
                return this;
            }

            public Gop build() {
                return new Gop(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMediaLiveChannelRequest} extends {@link TeaModel}
     *
     * <p>UpdateMediaLiveChannelRequest</p>
     */
    public static class Rate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private Integer bitrate;

        @com.aliyun.core.annotation.NameInMap("BufferSize")
        private Integer bufferSize;

        @com.aliyun.core.annotation.NameInMap("MaxBitrate")
        private Integer maxBitrate;

        @com.aliyun.core.annotation.NameInMap("RateControlMode")
        private String rateControlMode;

        private Rate(Builder builder) {
            this.bitrate = builder.bitrate;
            this.bufferSize = builder.bufferSize;
            this.maxBitrate = builder.maxBitrate;
            this.rateControlMode = builder.rateControlMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rate create() {
            return builder().build();
        }

        /**
         * @return bitrate
         */
        public Integer getBitrate() {
            return this.bitrate;
        }

        /**
         * @return bufferSize
         */
        public Integer getBufferSize() {
            return this.bufferSize;
        }

        /**
         * @return maxBitrate
         */
        public Integer getMaxBitrate() {
            return this.maxBitrate;
        }

        /**
         * @return rateControlMode
         */
        public String getRateControlMode() {
            return this.rateControlMode;
        }

        public static final class Builder {
            private Integer bitrate; 
            private Integer bufferSize; 
            private Integer maxBitrate; 
            private String rateControlMode; 

            private Builder() {
            } 

            private Builder(Rate model) {
                this.bitrate = model.bitrate;
                this.bufferSize = model.bufferSize;
                this.maxBitrate = model.maxBitrate;
                this.rateControlMode = model.rateControlMode;
            } 

            /**
             * <p>The video bitrate. Unit: bit/s. If you do not specify this parameter or set it to 0, the bitrate of the source video is used. Valid values: 50000 to 6000000. The value must be a multiple of 1000.</p>
             * 
             * <strong>example:</strong>
             * <p>2500000</p>
             */
            public Builder bitrate(Integer bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The buffer size for video encoding. Unit: bit/s. Valid values: 100000 to 6000000. The value must be a multiple of 1000.</p>
             * 
             * <strong>example:</strong>
             * <p>6000000</p>
             */
            public Builder bufferSize(Integer bufferSize) {
                this.bufferSize = bufferSize;
                return this;
            }

            /**
             * <p>The maximum bitrate for video encoding. Unit: bit/s. Valid values: 100000 to 6000000. The value must be a multiple of 1000.</p>
             * 
             * <strong>example:</strong>
             * <p>6000000</p>
             */
            public Builder maxBitrate(Integer maxBitrate) {
                this.maxBitrate = maxBitrate;
                return this;
            }

            /**
             * <p>The rate control mode for video encoding. Valid values: CBR, ABR, and VBR.</p>
             * 
             * <strong>example:</strong>
             * <p>ABR</p>
             */
            public Builder rateControlMode(String rateControlMode) {
                this.rateControlMode = rateControlMode;
                return this;
            }

            public Rate build() {
                return new Rate(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMediaLiveChannelRequest} extends {@link TeaModel}
     *
     * <p>UpdateMediaLiveChannelRequest</p>
     */
    public static class VideoCodecSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CodecDetail")
        private CodecDetail codecDetail;

        @com.aliyun.core.annotation.NameInMap("Framerate")
        private Framerate framerate;

        @com.aliyun.core.annotation.NameInMap("Gop")
        private Gop gop;

        @com.aliyun.core.annotation.NameInMap("Rate")
        private Rate rate;

        private VideoCodecSetting(Builder builder) {
            this.codecDetail = builder.codecDetail;
            this.framerate = builder.framerate;
            this.gop = builder.gop;
            this.rate = builder.rate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoCodecSetting create() {
            return builder().build();
        }

        /**
         * @return codecDetail
         */
        public CodecDetail getCodecDetail() {
            return this.codecDetail;
        }

        /**
         * @return framerate
         */
        public Framerate getFramerate() {
            return this.framerate;
        }

        /**
         * @return gop
         */
        public Gop getGop() {
            return this.gop;
        }

        /**
         * @return rate
         */
        public Rate getRate() {
            return this.rate;
        }

        public static final class Builder {
            private CodecDetail codecDetail; 
            private Framerate framerate; 
            private Gop gop; 
            private Rate rate; 

            private Builder() {
            } 

            private Builder(VideoCodecSetting model) {
                this.codecDetail = model.codecDetail;
                this.framerate = model.framerate;
                this.gop = model.gop;
                this.rate = model.rate;
            } 

            /**
             * <p>The video codec detail settings.</p>
             */
            public Builder codecDetail(CodecDetail codecDetail) {
                this.codecDetail = codecDetail;
                return this;
            }

            /**
             * <p>The video frame rate settings. If you do not specify this parameter, the frame rate settings of the source video are used.</p>
             */
            public Builder framerate(Framerate framerate) {
                this.framerate = framerate;
                return this;
            }

            /**
             * <p>The video group of pictures (GOP) settings. If you do not specify this parameter, the GOP settings of the source video are used.</p>
             */
            public Builder gop(Gop gop) {
                this.gop = gop;
                return this;
            }

            /**
             * <p>The video encoding rate settings. If you do not specify this parameter, the rate settings of the source video are used.</p>
             */
            public Builder rate(Rate rate) {
                this.rate = rate;
                return this;
            }

            public VideoCodecSetting build() {
                return new VideoCodecSetting(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMediaLiveChannelRequest} extends {@link TeaModel}
     *
     * <p>UpdateMediaLiveChannelRequest</p>
     */
    public static class VideoSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("VideoCodec")
        private String videoCodec;

        @com.aliyun.core.annotation.NameInMap("VideoCodecSetting")
        private VideoCodecSetting videoCodecSetting;

        @com.aliyun.core.annotation.NameInMap("VideoCodecType")
        private String videoCodecType;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Integer width;

        private VideoSettings(Builder builder) {
            this.height = builder.height;
            this.name = builder.name;
            this.videoCodec = builder.videoCodec;
            this.videoCodecSetting = builder.videoCodecSetting;
            this.videoCodecType = builder.videoCodecType;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoSettings create() {
            return builder().build();
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return videoCodec
         */
        public String getVideoCodec() {
            return this.videoCodec;
        }

        /**
         * @return videoCodecSetting
         */
        public VideoCodecSetting getVideoCodecSetting() {
            return this.videoCodecSetting;
        }

        /**
         * @return videoCodecType
         */
        public String getVideoCodecType() {
            return this.videoCodecType;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer height; 
            private String name; 
            private String videoCodec; 
            private VideoCodecSetting videoCodecSetting; 
            private String videoCodecType; 
            private Integer width; 

            private Builder() {
            } 

            private Builder(VideoSettings model) {
                this.height = model.height;
                this.name = model.name;
                this.videoCodec = model.videoCodec;
                this.videoCodecSetting = model.videoCodecSetting;
                this.videoCodecType = model.videoCodecType;
                this.width = model.width;
            } 

            /**
             * <p>The height of the video resolution. If you do not specify this parameter or set it to 0, the height is automatically scaled based on the width.
             * Valid values:</p>
             * <ul>
             * <li>For standard transcoding: max(Width, Height) &lt; 3840 and min(Width, Height) &lt; 2160.</li>
             * <li>For Narrowband HD transcoding: max(Width, Height) &lt; 1920 and min(Width, Height) &lt; 1080.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>720</p>
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The name of the video setting. The name can contain letters, digits, hyphens (-), and underscores (_). It can be up to 64 characters in length.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>video1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The video codec. Valid values: H264 and H265.</p>
             * 
             * <strong>example:</strong>
             * <p>H264</p>
             */
            public Builder videoCodec(String videoCodec) {
                this.videoCodec = videoCodec;
                return this;
            }

            /**
             * <p>The video codec settings.</p>
             */
            public Builder videoCodecSetting(VideoCodecSetting videoCodecSetting) {
                this.videoCodecSetting = videoCodecSetting;
                return this;
            }

            /**
             * <p>The video transcoding method. Valid values:</p>
             * <ul>
             * <li>NORMAL: standard transcoding.</li>
             * <li>NBHD: Narrowband HD transcoding.
             * Default value: NORMAL.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder videoCodecType(String videoCodecType) {
                this.videoCodecType = videoCodecType;
                return this;
            }

            /**
             * <p>The width of the video resolution. If you do not specify this parameter or set it to 0, the width is automatically scaled based on the height.
             * Valid values:</p>
             * <ul>
             * <li>For standard transcoding: max(Width, Height) &lt; 3840 and min(Width, Height) &lt; 2160.</li>
             * <li>For Narrowband HD transcoding: max(Width, Height) &lt; 1920 and min(Width, Height) &lt; 1080.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1280</p>
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public VideoSettings build() {
                return new VideoSettings(this);
            } 

        } 

    }
}
