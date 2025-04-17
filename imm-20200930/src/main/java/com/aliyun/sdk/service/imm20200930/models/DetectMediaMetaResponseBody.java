// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link DetectMediaMetaResponseBody} extends {@link TeaModel}
 *
 * <p>DetectMediaMetaResponseBody</p>
 */
public class DetectMediaMetaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Addresses")
    private java.util.List<Address> addresses;

    @com.aliyun.core.annotation.NameInMap("Album")
    private String album;

    @com.aliyun.core.annotation.NameInMap("AlbumArtist")
    private String albumArtist;

    @com.aliyun.core.annotation.NameInMap("Artist")
    private String artist;

    @com.aliyun.core.annotation.NameInMap("AudioStreams")
    private java.util.List<AudioStream> audioStreams;

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
    private java.util.List<SubtitleStream> subtitles;

    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("VideoHeight")
    private Long videoHeight;

    @com.aliyun.core.annotation.NameInMap("VideoStreams")
    private java.util.List<VideoStream> videoStreams;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addresses
     */
    public java.util.List<Address> getAddresses() {
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
    public java.util.List<AudioStream> getAudioStreams() {
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
    public java.util.List<SubtitleStream> getSubtitles() {
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
    public java.util.List<VideoStream> getVideoStreams() {
        return this.videoStreams;
    }

    /**
     * @return videoWidth
     */
    public Long getVideoWidth() {
        return this.videoWidth;
    }

    public static final class Builder {
        private java.util.List<Address> addresses; 
        private String album; 
        private String albumArtist; 
        private String artist; 
        private java.util.List<AudioStream> audioStreams; 
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
        private java.util.List<SubtitleStream> subtitles; 
        private String title; 
        private Long videoHeight; 
        private java.util.List<VideoStream> videoStreams; 
        private Long videoWidth; 

        private Builder() {
        } 

        private Builder(DetectMediaMetaResponseBody model) {
            this.addresses = model.addresses;
            this.album = model.album;
            this.albumArtist = model.albumArtist;
            this.artist = model.artist;
            this.audioStreams = model.audioStreams;
            this.bitrate = model.bitrate;
            this.composer = model.composer;
            this.duration = model.duration;
            this.formatLongName = model.formatLongName;
            this.formatName = model.formatName;
            this.language = model.language;
            this.latLong = model.latLong;
            this.performer = model.performer;
            this.produceTime = model.produceTime;
            this.programCount = model.programCount;
            this.requestId = model.requestId;
            this.size = model.size;
            this.startTime = model.startTime;
            this.streamCount = model.streamCount;
            this.subtitles = model.subtitles;
            this.title = model.title;
            this.videoHeight = model.videoHeight;
            this.videoStreams = model.videoStreams;
            this.videoWidth = model.videoWidth;
        } 

        /**
         * <p>The addresses.</p>
         * <p>This parameter is returned only when address information is detected.</p>
         */
        public Builder addresses(java.util.List<Address> addresses) {
            this.addresses = addresses;
            return this;
        }

        /**
         * <p>The album.</p>
         * 
         * <strong>example:</strong>
         * <p>unable</p>
         */
        public Builder album(String album) {
            this.album = album;
            return this;
        }

        /**
         * <p>The album artist.</p>
         * 
         * <strong>example:</strong>
         * <p>unable</p>
         */
        public Builder albumArtist(String albumArtist) {
            this.albumArtist = albumArtist;
            return this;
        }

        /**
         * <p>The artist.</p>
         * 
         * <strong>example:</strong>
         * <p>unable</p>
         */
        public Builder artist(String artist) {
            this.artist = artist;
            return this;
        }

        /**
         * <p>The audio streams.</p>
         */
        public Builder audioStreams(java.util.List<AudioStream> audioStreams) {
            this.audioStreams = audioStreams;
            return this;
        }

        /**
         * <p>The bitrate. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>13164131</p>
         */
        public Builder bitrate(Long bitrate) {
            this.bitrate = bitrate;
            return this;
        }

        /**
         * <p>The composer.</p>
         * 
         * <strong>example:</strong>
         * <p>unable</p>
         */
        public Builder composer(String composer) {
            this.composer = composer;
            return this;
        }

        /**
         * <p>The total duration of the video. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>15.263000</p>
         */
        public Builder duration(Double duration) {
            this.duration = duration;
            return this;
        }

        /**
         * <p>The full format name.</p>
         * 
         * <strong>example:</strong>
         * <p>QuickTime / MOV</p>
         */
        public Builder formatLongName(String formatLongName) {
            this.formatLongName = formatLongName;
            return this;
        }

        /**
         * <p>The abbreviated format name.</p>
         * 
         * <strong>example:</strong>
         * <p>mov,mp4,m4a,3gp,3g2,mj2</p>
         */
        public Builder formatName(String formatName) {
            this.formatName = formatName;
            return this;
        }

        /**
         * <p>The language of the content. For more information, see the ISO 639-2 Alpha-3 codes for the representation of names of languages.</p>
         * 
         * <strong>example:</strong>
         * <p>eng</p>
         */
        public Builder language(String language) {
            this.language = language;
            return this;
        }

        /**
         * <p>The coordinate pair of the central point. The coordinate pair consists of latitude and longitude values. This parameter value must be in the &quot;latitude,longitude&quot; format. Valid values of the latitude: [-90,+90]. Valid values of the longitude: [-180,+180].</p>
         * 
         * <strong>example:</strong>
         * <p>+120.029003,+30.283095</p>
         */
        public Builder latLong(String latLong) {
            this.latLong = latLong;
            return this;
        }

        /**
         * <p>The performer.</p>
         * 
         * <strong>example:</strong>
         * <p>unable</p>
         */
        public Builder performer(String performer) {
            this.performer = performer;
            return this;
        }

        /**
         * <p>The time of recording. For more information about the time formats, see the RFC3339 Nano standard.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-24T02:39:57Z</p>
         */
        public Builder produceTime(String produceTime) {
            this.produceTime = produceTime;
            return this;
        }

        /**
         * <p>The number of programs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder programCount(Long programCount) {
            this.programCount = programCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2213B1A9-EB3D-4666-84E0-24980BC*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The size of the media object. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>25115517</p>
         */
        public Builder size(Long size) {
            this.size = size;
            return this;
        }

        /**
         * <p>The initial playback time.</p>
         * 
         * <strong>example:</strong>
         * <p>0.000000</p>
         */
        public Builder startTime(Double startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The number of media streams.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder streamCount(Long streamCount) {
            this.streamCount = streamCount;
            return this;
        }

        /**
         * <p>The subtitle streams.</p>
         */
        public Builder subtitles(java.util.List<SubtitleStream> subtitles) {
            this.subtitles = subtitles;
            return this;
        }

        /**
         * <p>The title of the media object.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * <p>The video height in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>1920</p>
         */
        public Builder videoHeight(Long videoHeight) {
            this.videoHeight = videoHeight;
            return this;
        }

        /**
         * <p>The video streams.</p>
         */
        public Builder videoStreams(java.util.List<VideoStream> videoStreams) {
            this.videoStreams = videoStreams;
            return this;
        }

        /**
         * <p>The video width in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
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
