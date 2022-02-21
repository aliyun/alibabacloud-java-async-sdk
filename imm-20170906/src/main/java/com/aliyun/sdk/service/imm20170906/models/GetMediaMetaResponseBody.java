// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMediaMetaResponseBody} extends {@link TeaModel}
 *
 * <p>GetMediaMetaResponseBody</p>
 */
public class GetMediaMetaResponseBody extends TeaModel {
    @NameInMap("MediaMeta")
    private MediaMeta mediaMeta;

    @NameInMap("MediaUri")
    private String mediaUri;

    @NameInMap("RequestId")
    private String requestId;

    private GetMediaMetaResponseBody(Builder builder) {
        this.mediaMeta = builder.mediaMeta;
        this.mediaUri = builder.mediaUri;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMediaMetaResponseBody create() {
        return builder().build();
    }

    /**
     * @return mediaMeta
     */
    public MediaMeta getMediaMeta() {
        return this.mediaMeta;
    }

    /**
     * @return mediaUri
     */
    public String getMediaUri() {
        return this.mediaUri;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MediaMeta mediaMeta; 
        private String mediaUri; 
        private String requestId; 

        /**
         * MediaMeta.
         */
        public Builder mediaMeta(MediaMeta mediaMeta) {
            this.mediaMeta = mediaMeta;
            return this;
        }

        /**
         * MediaUri.
         */
        public Builder mediaUri(String mediaUri) {
            this.mediaUri = mediaUri;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMediaMetaResponseBody build() {
            return new GetMediaMetaResponseBody(this);
        } 

    } 

    public static class Address extends TeaModel {
        @NameInMap("AddressLine")
        private String addressLine;

        @NameInMap("City")
        private String city;

        @NameInMap("Country")
        private String country;

        @NameInMap("District")
        private String district;

        @NameInMap("Province")
        private String province;

        @NameInMap("Township")
        private String township;

        private Address(Builder builder) {
            this.addressLine = builder.addressLine;
            this.city = builder.city;
            this.country = builder.country;
            this.district = builder.district;
            this.province = builder.province;
            this.township = builder.township;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Address create() {
            return builder().build();
        }

        /**
         * @return addressLine
         */
        public String getAddressLine() {
            return this.addressLine;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return country
         */
        public String getCountry() {
            return this.country;
        }

        /**
         * @return district
         */
        public String getDistrict() {
            return this.district;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        /**
         * @return township
         */
        public String getTownship() {
            return this.township;
        }

        public static final class Builder {
            private String addressLine; 
            private String city; 
            private String country; 
            private String district; 
            private String province; 
            private String township; 

            /**
             * AddressLine.
             */
            public Builder addressLine(String addressLine) {
                this.addressLine = addressLine;
                return this;
            }

            /**
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * Country.
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * District.
             */
            public Builder district(String district) {
                this.district = district;
                return this;
            }

            /**
             * Province.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * Township.
             */
            public Builder township(String township) {
                this.township = township;
                return this;
            }

            public Address build() {
                return new Address(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("Album")
        private String album;

        @NameInMap("AlbumArtist")
        private String albumArtist;

        @NameInMap("Artist")
        private String artist;

        @NameInMap("Composer")
        private String composer;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Language")
        private String language;

        @NameInMap("Performer")
        private String performer;

        @NameInMap("Title")
        private String title;

        private Tag(Builder builder) {
            this.album = builder.album;
            this.albumArtist = builder.albumArtist;
            this.artist = builder.artist;
            this.composer = builder.composer;
            this.creationTime = builder.creationTime;
            this.language = builder.language;
            this.performer = builder.performer;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return album
         */
        public String getAlbum() {
            return this.album;
        }

        /**
         * @return albumArtist
         */
        public String getAlbumArtist() {
            return this.albumArtist;
        }

        /**
         * @return artist
         */
        public String getArtist() {
            return this.artist;
        }

        /**
         * @return composer
         */
        public String getComposer() {
            return this.composer;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return performer
         */
        public String getPerformer() {
            return this.performer;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String album; 
            private String albumArtist; 
            private String artist; 
            private String composer; 
            private String creationTime; 
            private String language; 
            private String performer; 
            private String title; 

            /**
             * Album.
             */
            public Builder album(String album) {
                this.album = album;
                return this;
            }

            /**
             * AlbumArtist.
             */
            public Builder albumArtist(String albumArtist) {
                this.albumArtist = albumArtist;
                return this;
            }

            /**
             * Artist.
             */
            public Builder artist(String artist) {
                this.artist = artist;
                return this;
            }

            /**
             * Composer.
             */
            public Builder composer(String composer) {
                this.composer = composer;
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
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * Performer.
             */
            public Builder performer(String performer) {
                this.performer = performer;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class MediaFormat extends TeaModel {
        @NameInMap("Address")
        private Address address;

        @NameInMap("Bitrate")
        private String bitrate;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Duration")
        private String duration;

        @NameInMap("FormatLongName")
        private String formatLongName;

        @NameInMap("FormatName")
        private String formatName;

        @NameInMap("Location")
        private String location;

        @NameInMap("NumberPrograms")
        private Integer numberPrograms;

        @NameInMap("NumberStreams")
        private Integer numberStreams;

        @NameInMap("Size")
        private String size;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Tag")
        private Tag tag;

        private MediaFormat(Builder builder) {
            this.address = builder.address;
            this.bitrate = builder.bitrate;
            this.creationTime = builder.creationTime;
            this.duration = builder.duration;
            this.formatLongName = builder.formatLongName;
            this.formatName = builder.formatName;
            this.location = builder.location;
            this.numberPrograms = builder.numberPrograms;
            this.numberStreams = builder.numberStreams;
            this.size = builder.size;
            this.startTime = builder.startTime;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaFormat create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public Address getAddress() {
            return this.address;
        }

        /**
         * @return bitrate
         */
        public String getBitrate() {
            return this.bitrate;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return formatLongName
         */
        public String getFormatLongName() {
            return this.formatLongName;
        }

        /**
         * @return formatName
         */
        public String getFormatName() {
            return this.formatName;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return numberPrograms
         */
        public Integer getNumberPrograms() {
            return this.numberPrograms;
        }

        /**
         * @return numberStreams
         */
        public Integer getNumberStreams() {
            return this.numberStreams;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return tag
         */
        public Tag getTag() {
            return this.tag;
        }

        public static final class Builder {
            private Address address; 
            private String bitrate; 
            private String creationTime; 
            private String duration; 
            private String formatLongName; 
            private String formatName; 
            private String location; 
            private Integer numberPrograms; 
            private Integer numberStreams; 
            private String size; 
            private String startTime; 
            private Tag tag; 

            /**
             * Address.
             */
            public Builder address(Address address) {
                this.address = address;
                return this;
            }

            /**
             * Bitrate.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
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
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * FormatLongName.
             */
            public Builder formatLongName(String formatLongName) {
                this.formatLongName = formatLongName;
                return this;
            }

            /**
             * FormatName.
             */
            public Builder formatName(String formatName) {
                this.formatName = formatName;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * NumberPrograms.
             */
            public Builder numberPrograms(Integer numberPrograms) {
                this.numberPrograms = numberPrograms;
                return this;
            }

            /**
             * NumberStreams.
             */
            public Builder numberStreams(Integer numberStreams) {
                this.numberStreams = numberStreams;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Tag.
             */
            public Builder tag(Tag tag) {
                this.tag = tag;
                return this;
            }

            public MediaFormat build() {
                return new MediaFormat(this);
            } 

        } 

    }
    public static class AudioStreams extends TeaModel {
        @NameInMap("Bitrate")
        private String bitrate;

        @NameInMap("ChannelLayout")
        private String channelLayout;

        @NameInMap("Channels")
        private Integer channels;

        @NameInMap("CodecLongName")
        private String codecLongName;

        @NameInMap("CodecName")
        private String codecName;

        @NameInMap("CodecTag")
        private String codecTag;

        @NameInMap("CodecTagString")
        private String codecTagString;

        @NameInMap("CodecTimeBase")
        private String codecTimeBase;

        @NameInMap("Duration")
        private String duration;

        @NameInMap("Frames")
        private String frames;

        @NameInMap("Index")
        private Integer index;

        @NameInMap("Language")
        private String language;

        @NameInMap("SampleFormat")
        private String sampleFormat;

        @NameInMap("SampleRate")
        private String sampleRate;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("TimeBase")
        private String timeBase;

        private AudioStreams(Builder builder) {
            this.bitrate = builder.bitrate;
            this.channelLayout = builder.channelLayout;
            this.channels = builder.channels;
            this.codecLongName = builder.codecLongName;
            this.codecName = builder.codecName;
            this.codecTag = builder.codecTag;
            this.codecTagString = builder.codecTagString;
            this.codecTimeBase = builder.codecTimeBase;
            this.duration = builder.duration;
            this.frames = builder.frames;
            this.index = builder.index;
            this.language = builder.language;
            this.sampleFormat = builder.sampleFormat;
            this.sampleRate = builder.sampleRate;
            this.startTime = builder.startTime;
            this.timeBase = builder.timeBase;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioStreams create() {
            return builder().build();
        }

        /**
         * @return bitrate
         */
        public String getBitrate() {
            return this.bitrate;
        }

        /**
         * @return channelLayout
         */
        public String getChannelLayout() {
            return this.channelLayout;
        }

        /**
         * @return channels
         */
        public Integer getChannels() {
            return this.channels;
        }

        /**
         * @return codecLongName
         */
        public String getCodecLongName() {
            return this.codecLongName;
        }

        /**
         * @return codecName
         */
        public String getCodecName() {
            return this.codecName;
        }

        /**
         * @return codecTag
         */
        public String getCodecTag() {
            return this.codecTag;
        }

        /**
         * @return codecTagString
         */
        public String getCodecTagString() {
            return this.codecTagString;
        }

        /**
         * @return codecTimeBase
         */
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return frames
         */
        public String getFrames() {
            return this.frames;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return sampleFormat
         */
        public String getSampleFormat() {
            return this.sampleFormat;
        }

        /**
         * @return sampleRate
         */
        public String getSampleRate() {
            return this.sampleRate;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return timeBase
         */
        public String getTimeBase() {
            return this.timeBase;
        }

        public static final class Builder {
            private String bitrate; 
            private String channelLayout; 
            private Integer channels; 
            private String codecLongName; 
            private String codecName; 
            private String codecTag; 
            private String codecTagString; 
            private String codecTimeBase; 
            private String duration; 
            private String frames; 
            private Integer index; 
            private String language; 
            private String sampleFormat; 
            private String sampleRate; 
            private String startTime; 
            private String timeBase; 

            /**
             * Bitrate.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * ChannelLayout.
             */
            public Builder channelLayout(String channelLayout) {
                this.channelLayout = channelLayout;
                return this;
            }

            /**
             * Channels.
             */
            public Builder channels(Integer channels) {
                this.channels = channels;
                return this;
            }

            /**
             * CodecLongName.
             */
            public Builder codecLongName(String codecLongName) {
                this.codecLongName = codecLongName;
                return this;
            }

            /**
             * CodecName.
             */
            public Builder codecName(String codecName) {
                this.codecName = codecName;
                return this;
            }

            /**
             * CodecTag.
             */
            public Builder codecTag(String codecTag) {
                this.codecTag = codecTag;
                return this;
            }

            /**
             * CodecTagString.
             */
            public Builder codecTagString(String codecTagString) {
                this.codecTagString = codecTagString;
                return this;
            }

            /**
             * CodecTimeBase.
             */
            public Builder codecTimeBase(String codecTimeBase) {
                this.codecTimeBase = codecTimeBase;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Frames.
             */
            public Builder frames(String frames) {
                this.frames = frames;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * SampleFormat.
             */
            public Builder sampleFormat(String sampleFormat) {
                this.sampleFormat = sampleFormat;
                return this;
            }

            /**
             * SampleRate.
             */
            public Builder sampleRate(String sampleRate) {
                this.sampleRate = sampleRate;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * TimeBase.
             */
            public Builder timeBase(String timeBase) {
                this.timeBase = timeBase;
                return this;
            }

            public AudioStreams build() {
                return new AudioStreams(this);
            } 

        } 

    }
    public static class SubtitleStreams extends TeaModel {
        @NameInMap("Index")
        private Integer index;

        @NameInMap("Language")
        private String language;

        private SubtitleStreams(Builder builder) {
            this.index = builder.index;
            this.language = builder.language;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubtitleStreams create() {
            return builder().build();
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        public static final class Builder {
            private Integer index; 
            private String language; 

            /**
             * Index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            public SubtitleStreams build() {
                return new SubtitleStreams(this);
            } 

        } 

    }
    public static class VideoStreams extends TeaModel {
        @NameInMap("AverageFrameRate")
        private String averageFrameRate;

        @NameInMap("Bitrate")
        private String bitrate;

        @NameInMap("CodecLongName")
        private String codecLongName;

        @NameInMap("CodecName")
        private String codecName;

        @NameInMap("CodecTag")
        private String codecTag;

        @NameInMap("CodecTagString")
        private String codecTagString;

        @NameInMap("CodecTimeBase")
        private String codecTimeBase;

        @NameInMap("DisplayAspectRatio")
        private String displayAspectRatio;

        @NameInMap("Duration")
        private String duration;

        @NameInMap("FrameRrate")
        private String frameRrate;

        @NameInMap("Frames")
        private String frames;

        @NameInMap("HasBFrames")
        private Integer hasBFrames;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("Index")
        private Integer index;

        @NameInMap("Language")
        private String language;

        @NameInMap("Level")
        private Integer level;

        @NameInMap("PixelFormat")
        private String pixelFormat;

        @NameInMap("Profile")
        private String profile;

        @NameInMap("Rotate")
        private String rotate;

        @NameInMap("SampleAspectRatio")
        private String sampleAspectRatio;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("TimeBase")
        private String timeBase;

        @NameInMap("Width")
        private Integer width;

        private VideoStreams(Builder builder) {
            this.averageFrameRate = builder.averageFrameRate;
            this.bitrate = builder.bitrate;
            this.codecLongName = builder.codecLongName;
            this.codecName = builder.codecName;
            this.codecTag = builder.codecTag;
            this.codecTagString = builder.codecTagString;
            this.codecTimeBase = builder.codecTimeBase;
            this.displayAspectRatio = builder.displayAspectRatio;
            this.duration = builder.duration;
            this.frameRrate = builder.frameRrate;
            this.frames = builder.frames;
            this.hasBFrames = builder.hasBFrames;
            this.height = builder.height;
            this.index = builder.index;
            this.language = builder.language;
            this.level = builder.level;
            this.pixelFormat = builder.pixelFormat;
            this.profile = builder.profile;
            this.rotate = builder.rotate;
            this.sampleAspectRatio = builder.sampleAspectRatio;
            this.startTime = builder.startTime;
            this.timeBase = builder.timeBase;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoStreams create() {
            return builder().build();
        }

        /**
         * @return averageFrameRate
         */
        public String getAverageFrameRate() {
            return this.averageFrameRate;
        }

        /**
         * @return bitrate
         */
        public String getBitrate() {
            return this.bitrate;
        }

        /**
         * @return codecLongName
         */
        public String getCodecLongName() {
            return this.codecLongName;
        }

        /**
         * @return codecName
         */
        public String getCodecName() {
            return this.codecName;
        }

        /**
         * @return codecTag
         */
        public String getCodecTag() {
            return this.codecTag;
        }

        /**
         * @return codecTagString
         */
        public String getCodecTagString() {
            return this.codecTagString;
        }

        /**
         * @return codecTimeBase
         */
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        /**
         * @return displayAspectRatio
         */
        public String getDisplayAspectRatio() {
            return this.displayAspectRatio;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return frameRrate
         */
        public String getFrameRrate() {
            return this.frameRrate;
        }

        /**
         * @return frames
         */
        public String getFrames() {
            return this.frames;
        }

        /**
         * @return hasBFrames
         */
        public Integer getHasBFrames() {
            return this.hasBFrames;
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
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return level
         */
        public Integer getLevel() {
            return this.level;
        }

        /**
         * @return pixelFormat
         */
        public String getPixelFormat() {
            return this.pixelFormat;
        }

        /**
         * @return profile
         */
        public String getProfile() {
            return this.profile;
        }

        /**
         * @return rotate
         */
        public String getRotate() {
            return this.rotate;
        }

        /**
         * @return sampleAspectRatio
         */
        public String getSampleAspectRatio() {
            return this.sampleAspectRatio;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return timeBase
         */
        public String getTimeBase() {
            return this.timeBase;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String averageFrameRate; 
            private String bitrate; 
            private String codecLongName; 
            private String codecName; 
            private String codecTag; 
            private String codecTagString; 
            private String codecTimeBase; 
            private String displayAspectRatio; 
            private String duration; 
            private String frameRrate; 
            private String frames; 
            private Integer hasBFrames; 
            private Integer height; 
            private Integer index; 
            private String language; 
            private Integer level; 
            private String pixelFormat; 
            private String profile; 
            private String rotate; 
            private String sampleAspectRatio; 
            private String startTime; 
            private String timeBase; 
            private Integer width; 

            /**
             * AverageFrameRate.
             */
            public Builder averageFrameRate(String averageFrameRate) {
                this.averageFrameRate = averageFrameRate;
                return this;
            }

            /**
             * Bitrate.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * CodecLongName.
             */
            public Builder codecLongName(String codecLongName) {
                this.codecLongName = codecLongName;
                return this;
            }

            /**
             * CodecName.
             */
            public Builder codecName(String codecName) {
                this.codecName = codecName;
                return this;
            }

            /**
             * CodecTag.
             */
            public Builder codecTag(String codecTag) {
                this.codecTag = codecTag;
                return this;
            }

            /**
             * CodecTagString.
             */
            public Builder codecTagString(String codecTagString) {
                this.codecTagString = codecTagString;
                return this;
            }

            /**
             * CodecTimeBase.
             */
            public Builder codecTimeBase(String codecTimeBase) {
                this.codecTimeBase = codecTimeBase;
                return this;
            }

            /**
             * DisplayAspectRatio.
             */
            public Builder displayAspectRatio(String displayAspectRatio) {
                this.displayAspectRatio = displayAspectRatio;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * FrameRrate.
             */
            public Builder frameRrate(String frameRrate) {
                this.frameRrate = frameRrate;
                return this;
            }

            /**
             * Frames.
             */
            public Builder frames(String frames) {
                this.frames = frames;
                return this;
            }

            /**
             * HasBFrames.
             */
            public Builder hasBFrames(Integer hasBFrames) {
                this.hasBFrames = hasBFrames;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(Integer level) {
                this.level = level;
                return this;
            }

            /**
             * PixelFormat.
             */
            public Builder pixelFormat(String pixelFormat) {
                this.pixelFormat = pixelFormat;
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
             * Rotate.
             */
            public Builder rotate(String rotate) {
                this.rotate = rotate;
                return this;
            }

            /**
             * SampleAspectRatio.
             */
            public Builder sampleAspectRatio(String sampleAspectRatio) {
                this.sampleAspectRatio = sampleAspectRatio;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * TimeBase.
             */
            public Builder timeBase(String timeBase) {
                this.timeBase = timeBase;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public VideoStreams build() {
                return new VideoStreams(this);
            } 

        } 

    }
    public static class MediaStreams extends TeaModel {
        @NameInMap("AudioStreams")
        private java.util.List < AudioStreams> audioStreams;

        @NameInMap("SubtitleStreams")
        private java.util.List < SubtitleStreams> subtitleStreams;

        @NameInMap("VideoStreams")
        private java.util.List < VideoStreams> videoStreams;

        private MediaStreams(Builder builder) {
            this.audioStreams = builder.audioStreams;
            this.subtitleStreams = builder.subtitleStreams;
            this.videoStreams = builder.videoStreams;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaStreams create() {
            return builder().build();
        }

        /**
         * @return audioStreams
         */
        public java.util.List < AudioStreams> getAudioStreams() {
            return this.audioStreams;
        }

        /**
         * @return subtitleStreams
         */
        public java.util.List < SubtitleStreams> getSubtitleStreams() {
            return this.subtitleStreams;
        }

        /**
         * @return videoStreams
         */
        public java.util.List < VideoStreams> getVideoStreams() {
            return this.videoStreams;
        }

        public static final class Builder {
            private java.util.List < AudioStreams> audioStreams; 
            private java.util.List < SubtitleStreams> subtitleStreams; 
            private java.util.List < VideoStreams> videoStreams; 

            /**
             * AudioStreams.
             */
            public Builder audioStreams(java.util.List < AudioStreams> audioStreams) {
                this.audioStreams = audioStreams;
                return this;
            }

            /**
             * SubtitleStreams.
             */
            public Builder subtitleStreams(java.util.List < SubtitleStreams> subtitleStreams) {
                this.subtitleStreams = subtitleStreams;
                return this;
            }

            /**
             * VideoStreams.
             */
            public Builder videoStreams(java.util.List < VideoStreams> videoStreams) {
                this.videoStreams = videoStreams;
                return this;
            }

            public MediaStreams build() {
                return new MediaStreams(this);
            } 

        } 

    }
    public static class MediaMeta extends TeaModel {
        @NameInMap("MediaFormat")
        private MediaFormat mediaFormat;

        @NameInMap("MediaStreams")
        private MediaStreams mediaStreams;

        private MediaMeta(Builder builder) {
            this.mediaFormat = builder.mediaFormat;
            this.mediaStreams = builder.mediaStreams;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaMeta create() {
            return builder().build();
        }

        /**
         * @return mediaFormat
         */
        public MediaFormat getMediaFormat() {
            return this.mediaFormat;
        }

        /**
         * @return mediaStreams
         */
        public MediaStreams getMediaStreams() {
            return this.mediaStreams;
        }

        public static final class Builder {
            private MediaFormat mediaFormat; 
            private MediaStreams mediaStreams; 

            /**
             * MediaFormat.
             */
            public Builder mediaFormat(MediaFormat mediaFormat) {
                this.mediaFormat = mediaFormat;
                return this;
            }

            /**
             * MediaStreams.
             */
            public Builder mediaStreams(MediaStreams mediaStreams) {
                this.mediaStreams = mediaStreams;
                return this;
            }

            public MediaMeta build() {
                return new MediaMeta(this);
            } 

        } 

    }
}
