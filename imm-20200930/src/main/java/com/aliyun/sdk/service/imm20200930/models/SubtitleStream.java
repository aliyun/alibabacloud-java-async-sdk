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
 * {@link SubtitleStream} extends {@link TeaModel}
 *
 * <p>SubtitleStream</p>
 */
public class SubtitleStream extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Bitrate")
    private Long bitrate;

    @com.aliyun.core.annotation.NameInMap("CodecLongName")
    private String codecLongName;

    @com.aliyun.core.annotation.NameInMap("CodecName")
    private String codecName;

    @com.aliyun.core.annotation.NameInMap("CodecTag")
    private String codecTag;

    @com.aliyun.core.annotation.NameInMap("CodecTagString")
    private String codecTagString;

    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("Duration")
    private Double duration;

    @com.aliyun.core.annotation.NameInMap("Height")
    private Long height;

    @com.aliyun.core.annotation.NameInMap("Index")
    private Long index;

    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Double startTime;

    @com.aliyun.core.annotation.NameInMap("Width")
    private Long width;

    private SubtitleStream(Builder builder) {
        this.bitrate = builder.bitrate;
        this.codecLongName = builder.codecLongName;
        this.codecName = builder.codecName;
        this.codecTag = builder.codecTag;
        this.codecTagString = builder.codecTagString;
        this.content = builder.content;
        this.duration = builder.duration;
        this.height = builder.height;
        this.index = builder.index;
        this.language = builder.language;
        this.startTime = builder.startTime;
        this.width = builder.width;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubtitleStream create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bitrate
     */
    public Long getBitrate() {
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
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return duration
     */
    public Double getDuration() {
        return this.duration;
    }

    /**
     * @return height
     */
    public Long getHeight() {
        return this.height;
    }

    /**
     * @return index
     */
    public Long getIndex() {
        return this.index;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return startTime
     */
    public Double getStartTime() {
        return this.startTime;
    }

    /**
     * @return width
     */
    public Long getWidth() {
        return this.width;
    }

    public static final class Builder {
        private Long bitrate; 
        private String codecLongName; 
        private String codecName; 
        private String codecTag; 
        private String codecTagString; 
        private String content; 
        private Double duration; 
        private Long height; 
        private Long index; 
        private String language; 
        private Double startTime; 
        private Long width; 

        private Builder() {
        } 

        private Builder(SubtitleStream model) {
            this.bitrate = model.bitrate;
            this.codecLongName = model.codecLongName;
            this.codecName = model.codecName;
            this.codecTag = model.codecTag;
            this.codecTagString = model.codecTagString;
            this.content = model.content;
            this.duration = model.duration;
            this.height = model.height;
            this.index = model.index;
            this.language = model.language;
            this.startTime = model.startTime;
            this.width = model.width;
        } 

        /**
         * Bitrate.
         */
        public Builder bitrate(Long bitrate) {
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
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
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
         * Height.
         */
        public Builder height(Long height) {
            this.height = height;
            return this;
        }

        /**
         * Index.
         */
        public Builder index(Long index) {
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
         * StartTime.
         */
        public Builder startTime(Double startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * Width.
         */
        public Builder width(Long width) {
            this.width = width;
            return this;
        }

        public SubtitleStream build() {
            return new SubtitleStream(this);
        } 

    } 

}
