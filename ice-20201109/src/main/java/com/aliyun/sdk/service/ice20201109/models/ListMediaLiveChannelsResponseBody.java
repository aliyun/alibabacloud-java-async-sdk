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
 * {@link ListMediaLiveChannelsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMediaLiveChannelsResponseBody</p>
 */
public class ListMediaLiveChannelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Channels")
    private java.util.List<Channels> channels;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListMediaLiveChannelsResponseBody(Builder builder) {
        this.channels = builder.channels;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMediaLiveChannelsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channels
     */
    public java.util.List<Channels> getChannels() {
        return this.channels;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Channels> channels; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListMediaLiveChannelsResponseBody model) {
            this.channels = model.channels;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The channels.</p>
         */
        public Builder channels(java.util.List<Channels> channels) {
            this.channels = channels;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListMediaLiveChannelsResponseBody build() {
            return new ListMediaLiveChannelsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMediaLiveChannelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMediaLiveChannelsResponseBody</p>
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
             * <p>The audio bitrate. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>200000</p>
             */
            public Builder bitrate(Integer bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The audio codec profile.</p>
             * 
             * <strong>example:</strong>
             * <p>AAC-LOW</p>
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * <p>The audio sample rate. Unit: Hz.</p>
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
     * {@link ListMediaLiveChannelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMediaLiveChannelsResponseBody</p>
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
             * <p>The audio codec.</p>
             * 
             * <strong>example:</strong>
             * <p>aac</p>
             */
            public Builder audioCodec(String audioCodec) {
                this.audioCodec = audioCodec;
                return this;
            }

            /**
             * <p>The audio encoding settings.</p>
             */
            public Builder audioCodecSetting(AudioCodecSetting audioCodecSetting) {
                this.audioCodecSetting = audioCodecSetting;
                return this;
            }

            /**
             * <p>The name of the audio selector.</p>
             * 
             * <strong>example:</strong>
             * <p>myselector</p>
             */
            public Builder audioSelectorName(String audioSelectorName) {
                this.audioSelectorName = audioSelectorName;
                return this;
            }

            /**
             * <p>A three-letter ISO 639-2 language code.</p>
             * 
             * <strong>example:</strong>
             * <p>eng</p>
             */
            public Builder languageCode(String languageCode) {
                this.languageCode = languageCode;
                return this;
            }

            /**
             * <p>The name of the language.</p>
             * 
             * <strong>example:</strong>
             * <p>English</p>
             */
            public Builder languageName(String languageName) {
                this.languageName = languageName;
                return this;
            }

            /**
             * <p>The name of the audio settings.</p>
             * 
             * <strong>example:</strong>
             * <p>zhuanfengzhuang</p>
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
     * {@link ListMediaLiveChannelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMediaLiveChannelsResponseBody</p>
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
             * <p>A three-letter ISO 639-2 language code from within an audio source.</p>
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
     * {@link ListMediaLiveChannelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMediaLiveChannelsResponseBody</p>
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
             * <p>A PID from within a source.</p>
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
     * {@link ListMediaLiveChannelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMediaLiveChannelsResponseBody</p>
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
             * <p>The track ID from within a source.</p>
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
     * {@link ListMediaLiveChannelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMediaLiveChannelsResponseBody</p>
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
             * <p>The audio language selection.</p>
             */
            public Builder audioLanguageSelection(AudioLanguageSelection audioLanguageSelection) {
                this.audioLanguageSelection = audioLanguageSelection;
                return this;
            }

            /**
             * <p>The audio PID selection.</p>
             */
            public Builder audioPidSelection(AudioPidSelection audioPidSelection) {
                this.audioPidSelection = audioPidSelection;
                return this;
            }

            /**
             * <p>The audio track selection.</p>
             */
            public Builder audioTrackSelection(java.util.List<AudioTrackSelection> audioTrackSelection) {
                this.audioTrackSelection = audioTrackSelection;
                return this;
            }

            /**
             * <p>The name of the audio selector.</p>
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
     * {@link ListMediaLiveChannelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMediaLiveChannelsResponseBody</p>
     */
    public static class InputAttachments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioSelectors")
        private java.util.List<AudioSelectors> audioSelectors;

        @com.aliyun.core.annotation.NameInMap("InputId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String inputId;

        @com.aliyun.core.annotation.NameInMap("InputName")
        private String inputName;

        @com.aliyun.core.annotation.NameInMap("LanguageName")
        private String languageName;

        private InputAttachments(Builder builder) {
            this.audioSelectors = builder.audioSelectors;
            this.inputId = builder.inputId;
            this.inputName = builder.inputName;
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
         * @return inputName
         */
        public String getInputName() {
            return this.inputName;
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
            private String inputName; 
            private String languageName; 

            private Builder() {
            } 

            private Builder(InputAttachments model) {
                this.audioSelectors = model.audioSelectors;
                this.inputId = model.inputId;
                this.inputName = model.inputName;
                this.languageName = model.languageName;
            } 

            /**
             * <p>The audio selectors.</p>
             */
            public Builder audioSelectors(java.util.List<AudioSelectors> audioSelectors) {
                this.audioSelectors = audioSelectors;
                return this;
            }

            /**
             * <p>The ID of the input.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>SEGK5KA6KYKAWQQH</p>
             */
            public Builder inputId(String inputId) {
                this.inputId = inputId;
                return this;
            }

            /**
             * <p>The name of the input.</p>
             * 
             * <strong>example:</strong>
             * <p>myinput</p>
             */
            public Builder inputName(String inputName) {
                this.inputName = inputName;
                return this;
            }

            /**
             * <p>The name of the language.</p>
             * 
             * <strong>example:</strong>
             * <p>eng</p>
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
     * {@link ListMediaLiveChannelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMediaLiveChannelsResponseBody</p>
     */
    public static class MediaPackageGroupSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelName")
        private String channelName;

        @com.aliyun.core.annotation.NameInMap("GroupName")
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
             * <p>ChannelName in MediaPackage.</p>
             * 
             * <strong>example:</strong>
             * <p>myPackageChannel</p>
             */
            public Builder channelName(String channelName) {
                this.channelName = channelName;
                return this;
            }

            /**
             * <p>GroupName in MediaPackage.</p>
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
     * {@link ListMediaLiveChannelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMediaLiveChannelsResponseBody</p>
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
             * <p>The manifest audio group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>audiogroup</p>
             */
            public Builder audioGroupId(String audioGroupId) {
                this.audioGroupId = audioGroupId;
                return this;
            }

            /**
             * <p>The manifest name modifier. The child manifests include this modifier in their M3U8 file names.</p>
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
     * {@link ListMediaLiveChannelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMediaLiveChannelsResponseBody</p>
     */
    public static class Outputs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioSettingNames")
        private java.util.List<String> audioSettingNames;

        @com.aliyun.core.annotation.NameInMap("MediaPackageOutputSetting")
        private MediaPackageOutputSetting mediaPackageOutputSetting;

        @com.aliyun.core.annotation.NameInMap("MediaType")
        private Integer mediaType;

        @com.aliyun.core.annotation.NameInMap("Name")
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
             * <p>The referenced AudioSettings.</p>
             */
            public Builder audioSettingNames(java.util.List<String> audioSettingNames) {
                this.audioSettingNames = audioSettingNames;
                return this;
            }

            /**
             * <p>The settings of the output delivered to MediaPackage.</p>
             */
            public Builder mediaPackageOutputSetting(MediaPackageOutputSetting mediaPackageOutputSetting) {
                this.mediaPackageOutputSetting = mediaPackageOutputSetting;
                return this;
            }

            /**
             * <p>The media type of the output.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder mediaType(Integer mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * <p>The name of the output.</p>
             * 
             * <strong>example:</strong>
             * <p>output1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The name of the referenced VideoSettings.</p>
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
     * {@link ListMediaLiveChannelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMediaLiveChannelsResponseBody</p>
     */
    public static class OutputGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MediaPackageGroupSetting")
        private MediaPackageGroupSetting mediaPackageGroupSetting;

        @com.aliyun.core.annotation.NameInMap("MonitorUrl")
        private String monitorUrl;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Outputs")
        private java.util.List<Outputs> outputs;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private OutputGroups(Builder builder) {
            this.mediaPackageGroupSetting = builder.mediaPackageGroupSetting;
            this.monitorUrl = builder.monitorUrl;
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
         * @return monitorUrl
         */
        public String getMonitorUrl() {
            return this.monitorUrl;
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
            private String monitorUrl; 
            private String name; 
            private java.util.List<Outputs> outputs; 
            private String type; 

            private Builder() {
            } 

            private Builder(OutputGroups model) {
                this.mediaPackageGroupSetting = model.mediaPackageGroupSetting;
                this.monitorUrl = model.monitorUrl;
                this.name = model.name;
                this.outputs = model.outputs;
                this.type = model.type;
            } 

            /**
             * <p>The MediaPackage destination.</p>
             */
            public Builder mediaPackageGroupSetting(MediaPackageGroupSetting mediaPackageGroupSetting) {
                this.mediaPackageGroupSetting = mediaPackageGroupSetting;
                return this;
            }

            /**
             * <p>The URL for monitoring the output group. The parameter is returned only when the output gourp type is MediaPackage.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://xxx</p>
             */
            public Builder monitorUrl(String monitorUrl) {
                this.monitorUrl = monitorUrl;
                return this;
            }

            /**
             * <p>The name of the output group.</p>
             * 
             * <strong>example:</strong>
             * <p>group1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The outputs in the output group.</p>
             */
            public Builder outputs(java.util.List<Outputs> outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * <p>The output group type.</p>
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
     * {@link ListMediaLiveChannelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMediaLiveChannelsResponseBody</p>
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
             * <p>The video encoding level. It is not supported yet.</p>
             * 
             * <strong>example:</strong>
             * <p>H264_LEVEL_AUTO</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The H.264 profile.</p>
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
     * {@link ListMediaLiveChannelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMediaLiveChannelsResponseBody</p>
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
             * <p>The frame rate mode.</p>
             * 
             * <strong>example:</strong>
             * <p>SPECIFIED</p>
             */
            public Builder framerateControl(String framerateControl) {
                this.framerateControl = framerateControl;
                return this;
            }

            /**
             * <p>The denominator of the fixed frame rate.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder framerateDenominator(Integer framerateDenominator) {
                this.framerateDenominator = framerateDenominator;
                return this;
            }

            /**
             * <p>The numerator of the fixed frame rate.</p>
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
     * {@link ListMediaLiveChannelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMediaLiveChannelsResponseBody</p>
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
             * <p>The number of B frames.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder bframesNum(Integer bframesNum) {
                this.bframesNum = bframesNum;
                return this;
            }

            /**
             * <p>The GOP size.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder gopSize(Integer gopSize) {
                this.gopSize = gopSize;
                return this;
            }

            /**
             * <p>The GOP size unit.</p>
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
     * {@link ListMediaLiveChannelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMediaLiveChannelsResponseBody</p>
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
             * <p>The video bitrate. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>2500000</p>
             */
            public Builder bitrate(Integer bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The video buffer size. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>6000000</p>
             */
            public Builder bufferSize(Integer bufferSize) {
                this.bufferSize = bufferSize;
                return this;
            }

            /**
             * <p>The maximum bitrate. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>6000000</p>
             */
            public Builder maxBitrate(Integer maxBitrate) {
                this.maxBitrate = maxBitrate;
                return this;
            }

            /**
             * <p>The bitrate control mode.</p>
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
     * {@link ListMediaLiveChannelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMediaLiveChannelsResponseBody</p>
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
             * <p>The video encoding settings.</p>
             */
            public Builder codecDetail(CodecDetail codecDetail) {
                this.codecDetail = codecDetail;
                return this;
            }

            /**
             * <p>The frame rate.</p>
             */
            public Builder framerate(Framerate framerate) {
                this.framerate = framerate;
                return this;
            }

            /**
             * <p>The GOP setting.</p>
             */
            public Builder gop(Gop gop) {
                this.gop = gop;
                return this;
            }

            /**
             * <p>The video encoding rate.</p>
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
     * {@link ListMediaLiveChannelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMediaLiveChannelsResponseBody</p>
     */
    public static class VideoSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("Name")
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
             * <p>The height of the video in pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>720</p>
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The name of the video settings.</p>
             * 
             * <strong>example:</strong>
             * <p>video1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The video codec.</p>
             * 
             * <strong>example:</strong>
             * <p>H264</p>
             */
            public Builder videoCodec(String videoCodec) {
                this.videoCodec = videoCodec;
                return this;
            }

            /**
             * <p>The video encoding settings.</p>
             */
            public Builder videoCodecSetting(VideoCodecSetting videoCodecSetting) {
                this.videoCodecSetting = videoCodecSetting;
                return this;
            }

            /**
             * <p>视频转码方式（普通转码、窄带高清转码等）</p>
             */
            public Builder videoCodecType(String videoCodecType) {
                this.videoCodecType = videoCodecType;
                return this;
            }

            /**
             * <p>The width of the video in pixels.</p>
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
    /**
     * 
     * {@link ListMediaLiveChannelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMediaLiveChannelsResponseBody</p>
     */
    public static class Channels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioSettings")
        private java.util.List<AudioSettings> audioSettings;

        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("InputAttachments")
        private java.util.List<InputAttachments> inputAttachments;

        @com.aliyun.core.annotation.NameInMap("LastStartTime")
        private String lastStartTime;

        @com.aliyun.core.annotation.NameInMap("LastStopTime")
        private String lastStopTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OutputGroups")
        private java.util.List<OutputGroups> outputGroups;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("VideoSettings")
        private java.util.List<VideoSettings> videoSettings;

        private Channels(Builder builder) {
            this.audioSettings = builder.audioSettings;
            this.channelId = builder.channelId;
            this.createTime = builder.createTime;
            this.inputAttachments = builder.inputAttachments;
            this.lastStartTime = builder.lastStartTime;
            this.lastStopTime = builder.lastStopTime;
            this.name = builder.name;
            this.outputGroups = builder.outputGroups;
            this.state = builder.state;
            this.videoSettings = builder.videoSettings;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Channels create() {
            return builder().build();
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return inputAttachments
         */
        public java.util.List<InputAttachments> getInputAttachments() {
            return this.inputAttachments;
        }

        /**
         * @return lastStartTime
         */
        public String getLastStartTime() {
            return this.lastStartTime;
        }

        /**
         * @return lastStopTime
         */
        public String getLastStopTime() {
            return this.lastStopTime;
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
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return videoSettings
         */
        public java.util.List<VideoSettings> getVideoSettings() {
            return this.videoSettings;
        }

        public static final class Builder {
            private java.util.List<AudioSettings> audioSettings; 
            private String channelId; 
            private String createTime; 
            private java.util.List<InputAttachments> inputAttachments; 
            private String lastStartTime; 
            private String lastStopTime; 
            private String name; 
            private java.util.List<OutputGroups> outputGroups; 
            private String state; 
            private java.util.List<VideoSettings> videoSettings; 

            private Builder() {
            } 

            private Builder(Channels model) {
                this.audioSettings = model.audioSettings;
                this.channelId = model.channelId;
                this.createTime = model.createTime;
                this.inputAttachments = model.inputAttachments;
                this.lastStartTime = model.lastStartTime;
                this.lastStopTime = model.lastStopTime;
                this.name = model.name;
                this.outputGroups = model.outputGroups;
                this.state = model.state;
                this.videoSettings = model.videoSettings;
            } 

            /**
             * <p>The audio settings.</p>
             */
            public Builder audioSettings(java.util.List<AudioSettings> audioSettings) {
                this.audioSettings = audioSettings;
                return this;
            }

            /**
             * <p>The ID of the channel.</p>
             * 
             * <strong>example:</strong>
             * <p>SEGK5KA6KYKAWQQH</p>
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * <p>The time when the channel was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-03T06:56:42Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The inputs associated with the channel.</p>
             */
            public Builder inputAttachments(java.util.List<InputAttachments> inputAttachments) {
                this.inputAttachments = inputAttachments;
                return this;
            }

            /**
             * <p>The time when the channel was last started. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC. If the channel has never been started since it was created, an empty string is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-03T06:56:42Z</p>
             */
            public Builder lastStartTime(String lastStartTime) {
                this.lastStartTime = lastStartTime;
                return this;
            }

            /**
             * <p>The time when the channel was last stopped. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC. If the channel has never stopped since it was created, an empty string is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-03T06:56:42Z</p>
             */
            public Builder lastStopTime(String lastStopTime) {
                this.lastStopTime = lastStopTime;
                return this;
            }

            /**
             * <p>The name of the channel.</p>
             * 
             * <strong>example:</strong>
             * <p>mych</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The output groups.</p>
             */
            public Builder outputGroups(java.util.List<OutputGroups> outputGroups) {
                this.outputGroups = outputGroups;
                return this;
            }

            /**
             * <p>The state of the channel. Valid values: IDLE, STARTING, RUNNING, RECOVERING, and STOPPING.</p>
             * 
             * <strong>example:</strong>
             * <p>IDLE</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The video settings.</p>
             */
            public Builder videoSettings(java.util.List<VideoSettings> videoSettings) {
                this.videoSettings = videoSettings;
                return this;
            }

            public Channels build() {
                return new Channels(this);
            } 

        } 

    }
}
