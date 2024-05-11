// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetectMediaMetaResponseBody} extends {@link TeaModel}
 *
 * <p>DetectMediaMetaResponseBody</p>
 */
public class DetectMediaMetaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Addresses")
    private java.util.List < Address > addresses;

    @com.aliyun.core.annotation.NameInMap("Album")
    private String album;

    @com.aliyun.core.annotation.NameInMap("AlbumArtist")
    private String albumArtist;

    @com.aliyun.core.annotation.NameInMap("Artist")
    private String artist;

    @com.aliyun.core.annotation.NameInMap("AudioStreams")
    private java.util.List < AudioStream > audioStreams;

    @com.aliyun.core.annotation.NameInMap("Bitrate")
    private Long bitrate;

    @com.aliyun.core.annotation.NameInMap("Composer")
    private String composer;

    @com.aliyun.core.annotation.NameInMap("Duration")
    private Double duration;

    @com.aliyun.core.annotation.NameInMap("FormatLongName")
    private String formatLongName;

    @com.aliyun.core.annotation.NameInMap("FormatName")
    private String formatName;

    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.NameInMap("LatLong")
    private String latLong;

    @com.aliyun.core.annotation.NameInMap("Performer")
    private String performer;

    @com.aliyun.core.annotation.NameInMap("ProduceTime")
    private String produceTime;

    @com.aliyun.core.annotation.NameInMap("ProgramCount")
    private Long programCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Size")
    private Long size;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Double startTime;

    @com.aliyun.core.annotation.NameInMap("StreamCount")
    private Long streamCount;

    @com.aliyun.core.annotation.NameInMap("Subtitles")
    private java.util.List < SubtitleStream > subtitles;

    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("VideoHeight")
    private Long videoHeight;

    @com.aliyun.core.annotation.NameInMap("VideoStreams")
    private java.util.List < VideoStream > videoStreams;

    @com.aliyun.core.annotation.NameInMap("VideoWidth")
    private Long videoWidth;

    private DetectMediaMetaResponseBody(Builder builder) {
        this.addresses = builder.addresses;
        this.album = builder.album;
        this.albumArtist = builder.albumArtist;
        this.artist = builder.artist;
        this.audioStreams = builder.audioStreams;
        this.bitrate = builder.bitrate;
        this.composer = builder.composer;
        this.duration = builder.duration;
        this.formatLongName = builder.formatLongName;
        this.formatName = builder.formatName;
        this.language = builder.language;
        this.latLong = builder.latLong;
        this.performer = builder.performer;
        this.produceTime = builder.produceTime;
        this.programCount = builder.programCount;
        this.requestId = builder.requestId;
        this.size = builder.size;
        this.startTime = builder.startTime;
        this.streamCount = builder.streamCount;
        this.subtitles = builder.subtitles;
        this.title = builder.title;
        this.videoHeight = builder.videoHeight;
        this.videoStreams = builder.videoStreams;
        this.videoWidth = builder.videoWidth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectMediaMetaResponseBody create() {
        return builder().build();
    }

    /**
     * @return addresses
     */
    public java.util.List < Address > getAddresses() {
        return this.addresses;
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
     * @return audioStreams
     */
    public java.util.List < AudioStream > getAudioStreams() {
        return this.audioStreams;
    }

    /**
     * @return bitrate
     */
    public Long getBitrate() {
        return this.bitrate;
    }

    /**
     * @return composer
     */
    public String getComposer() {
        return this.composer;
    }

    /**
     * @return duration
     */
    public Double getDuration() {
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
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return latLong
     */
    public String getLatLong() {
        return this.latLong;
    }

    /**
     * @return performer
     */
    public String getPerformer() {
        return this.performer;
    }

    /**
     * @return produceTime
     */
    public String getProduceTime() {
        return this.produceTime;
    }

    /**
     * @return programCount
     */
    public Long getProgramCount() {
        return this.programCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * @return startTime
     */
    public Double getStartTime() {
        return this.startTime;
    }

    /**
     * @return streamCount
     */
    public Long getStreamCount() {
        return this.streamCount;
    }

    /**
     * @return subtitles
     */
    public java.util.List < SubtitleStream > getSubtitles() {
        return this.subtitles;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return videoHeight
     */
    public Long getVideoHeight() {
        return this.videoHeight;
    }

    /**
     * @return videoStreams
     */
    public java.util.List < VideoStream > getVideoStreams() {
        return this.videoStreams;
    }

    /**
     * @return videoWidth
     */
    public Long getVideoWidth() {
        return this.videoWidth;
    }

    public static final class Builder {
        private java.util.List < Address > addresses; 
        private String album; 
        private String albumArtist; 
        private String artist; 
        private java.util.List < AudioStream > audioStreams; 
        private Long bitrate; 
        private String composer; 
        private Double duration; 
        private String formatLongName; 
        private String formatName; 
        private String language; 
        private String latLong; 
        private String performer; 
        private String produceTime; 
        private Long programCount; 
        private String requestId; 
        private Long size; 
        private Double startTime; 
        private Long streamCount; 
        private java.util.List < SubtitleStream > subtitles; 
        private String title; 
        private Long videoHeight; 
        private java.util.List < VideoStream > videoStreams; 
        private Long videoWidth; 

        /**
         * Addresses.
         */
        public Builder addresses(java.util.List < Address > addresses) {
            this.addresses = addresses;
            return this;
        }

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
         * AudioStreams.
         */
        public Builder audioStreams(java.util.List < AudioStream > audioStreams) {
            this.audioStreams = audioStreams;
            return this;
        }

        /**
         * Bitrate.
         */
        public Builder bitrate(Long bitrate) {
            this.bitrate = bitrate;
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
         * Duration.
         */
        public Builder duration(Double duration) {
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
         * Language.
         */
        public Builder language(String language) {
            this.language = language;
            return this;
        }

        /**
         * LatLong.
         */
        public Builder latLong(String latLong) {
            this.latLong = latLong;
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
         * ProduceTime.
         */
        public Builder produceTime(String produceTime) {
            this.produceTime = produceTime;
            return this;
        }

        /**
         * ProgramCount.
         */
        public Builder programCount(Long programCount) {
            this.programCount = programCount;
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
         * Size.
         */
        public Builder size(Long size) {
            this.size = size;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Double startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * StreamCount.
         */
        public Builder streamCount(Long streamCount) {
            this.streamCount = streamCount;
            return this;
        }

        /**
         * Subtitles.
         */
        public Builder subtitles(java.util.List < SubtitleStream > subtitles) {
            this.subtitles = subtitles;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * VideoHeight.
         */
        public Builder videoHeight(Long videoHeight) {
            this.videoHeight = videoHeight;
            return this;
        }

        /**
         * VideoStreams.
         */
        public Builder videoStreams(java.util.List < VideoStream > videoStreams) {
            this.videoStreams = videoStreams;
            return this;
        }

        /**
         * VideoWidth.
         */
        public Builder videoWidth(Long videoWidth) {
            this.videoWidth = videoWidth;
            return this;
        }

        public DetectMediaMetaResponseBody build() {
            return new DetectMediaMetaResponseBody(this);
        } 

    } 

}
