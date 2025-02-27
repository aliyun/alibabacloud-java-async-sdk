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

        /**
         * Channels.
         */
        public Builder channels(java.util.List<Channels> channels) {
            this.channels = channels;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
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

            /**
             * Bitrate.
             */
            public Builder bitrate(Integer bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * Profile.
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * SampleRate.
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

            /**
             * AudioCodec.
             */
            public Builder audioCodec(String audioCodec) {
                this.audioCodec = audioCodec;
                return this;
            }

            /**
             * AudioCodecSetting.
             */
            public Builder audioCodecSetting(AudioCodecSetting audioCodecSetting) {
                this.audioCodecSetting = audioCodecSetting;
                return this;
            }

            /**
             * AudioSelectorName.
             */
            public Builder audioSelectorName(String audioSelectorName) {
                this.audioSelectorName = audioSelectorName;
                return this;
            }

            /**
             * LanguageCode.
             */
            public Builder languageCode(String languageCode) {
                this.languageCode = languageCode;
                return this;
            }

            /**
             * LanguageName.
             */
            public Builder languageName(String languageName) {
                this.languageName = languageName;
                return this;
            }

            /**
             * Name.
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

            /**
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

            /**
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

            /**
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

            /**
             * AudioLanguageSelection.
             */
            public Builder audioLanguageSelection(AudioLanguageSelection audioLanguageSelection) {
                this.audioLanguageSelection = audioLanguageSelection;
                return this;
            }

            /**
             * AudioPidSelection.
             */
            public Builder audioPidSelection(AudioPidSelection audioPidSelection) {
                this.audioPidSelection = audioPidSelection;
                return this;
            }

            /**
             * AudioTrackSelection.
             */
            public Builder audioTrackSelection(java.util.List<AudioTrackSelection> audioTrackSelection) {
                this.audioTrackSelection = audioTrackSelection;
                return this;
            }

            /**
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

            /**
             * AudioSelectors.
             */
            public Builder audioSelectors(java.util.List<AudioSelectors> audioSelectors) {
                this.audioSelectors = audioSelectors;
                return this;
            }

            /**
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
             * InputName.
             */
            public Builder inputName(String inputName) {
                this.inputName = inputName;
                return this;
            }

            /**
             * LanguageName.
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

            /**
             * ChannelName.
             */
            public Builder channelName(String channelName) {
                this.channelName = channelName;
                return this;
            }

            /**
             * GroupName.
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

            /**
             * AudioGroupId.
             */
            public Builder audioGroupId(String audioGroupId) {
                this.audioGroupId = audioGroupId;
                return this;
            }

            /**
             * NameModifier.
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

            /**
             * AudioSettingNames.
             */
            public Builder audioSettingNames(java.util.List<String> audioSettingNames) {
                this.audioSettingNames = audioSettingNames;
                return this;
            }

            /**
             * MediaPackageOutputSetting.
             */
            public Builder mediaPackageOutputSetting(MediaPackageOutputSetting mediaPackageOutputSetting) {
                this.mediaPackageOutputSetting = mediaPackageOutputSetting;
                return this;
            }

            /**
             * MediaType.
             */
            public Builder mediaType(Integer mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>myselector</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * VideoSettingName.
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

            /**
             * MediaPackageGroupSetting.
             */
            public Builder mediaPackageGroupSetting(MediaPackageGroupSetting mediaPackageGroupSetting) {
                this.mediaPackageGroupSetting = mediaPackageGroupSetting;
                return this;
            }

            /**
             * MonitorUrl.
             */
            public Builder monitorUrl(String monitorUrl) {
                this.monitorUrl = monitorUrl;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>myselector</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Outputs.
             */
            public Builder outputs(java.util.List<Outputs> outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * Type.
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

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * Profile.
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

            /**
             * FramerateControl.
             */
            public Builder framerateControl(String framerateControl) {
                this.framerateControl = framerateControl;
                return this;
            }

            /**
             * FramerateDenominator.
             */
            public Builder framerateDenominator(Integer framerateDenominator) {
                this.framerateDenominator = framerateDenominator;
                return this;
            }

            /**
             * FramerateNumerator.
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

            /**
             * BframesNum.
             */
            public Builder bframesNum(Integer bframesNum) {
                this.bframesNum = bframesNum;
                return this;
            }

            /**
             * GopSize.
             */
            public Builder gopSize(Integer gopSize) {
                this.gopSize = gopSize;
                return this;
            }

            /**
             * GopSizeUnits.
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

            /**
             * Bitrate.
             */
            public Builder bitrate(Integer bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * BufferSize.
             */
            public Builder bufferSize(Integer bufferSize) {
                this.bufferSize = bufferSize;
                return this;
            }

            /**
             * MaxBitrate.
             */
            public Builder maxBitrate(Integer maxBitrate) {
                this.maxBitrate = maxBitrate;
                return this;
            }

            /**
             * RateControlMode.
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

            /**
             * CodecDetail.
             */
            public Builder codecDetail(CodecDetail codecDetail) {
                this.codecDetail = codecDetail;
                return this;
            }

            /**
             * Framerate.
             */
            public Builder framerate(Framerate framerate) {
                this.framerate = framerate;
                return this;
            }

            /**
             * Gop.
             */
            public Builder gop(Gop gop) {
                this.gop = gop;
                return this;
            }

            /**
             * Rate.
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

        @com.aliyun.core.annotation.NameInMap("Width")
        private Integer width;

        private VideoSettings(Builder builder) {
            this.height = builder.height;
            this.name = builder.name;
            this.videoCodec = builder.videoCodec;
            this.videoCodecSetting = builder.videoCodecSetting;
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
            private Integer width; 

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>myselector</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * VideoCodec.
             */
            public Builder videoCodec(String videoCodec) {
                this.videoCodec = videoCodec;
                return this;
            }

            /**
             * VideoCodecSetting.
             */
            public Builder videoCodecSetting(VideoCodecSetting videoCodecSetting) {
                this.videoCodecSetting = videoCodecSetting;
                return this;
            }

            /**
             * Width.
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

            /**
             * AudioSettings.
             */
            public Builder audioSettings(java.util.List<AudioSettings> audioSettings) {
                this.audioSettings = audioSettings;
                return this;
            }

            /**
             * ChannelId.
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * InputAttachments.
             */
            public Builder inputAttachments(java.util.List<InputAttachments> inputAttachments) {
                this.inputAttachments = inputAttachments;
                return this;
            }

            /**
             * LastStartTime.
             */
            public Builder lastStartTime(String lastStartTime) {
                this.lastStartTime = lastStartTime;
                return this;
            }

            /**
             * LastStopTime.
             */
            public Builder lastStopTime(String lastStopTime) {
                this.lastStopTime = lastStopTime;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>myselector</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OutputGroups.
             */
            public Builder outputGroups(java.util.List<OutputGroups> outputGroups) {
                this.outputGroups = outputGroups;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * VideoSettings.
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
