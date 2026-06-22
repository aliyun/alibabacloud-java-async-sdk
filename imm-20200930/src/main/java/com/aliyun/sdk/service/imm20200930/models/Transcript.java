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
 * {@link Transcript} extends {@link TeaModel}
 *
 * <p>Transcript</p>
 */
public class Transcript extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("SpeakerId")
    private String speakerId;

    @com.aliyun.core.annotation.NameInMap("TimeRange")
    private java.util.List<Long> timeRange;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private Transcript(Builder builder) {
        this.content = builder.content;
        this.speakerId = builder.speakerId;
        this.timeRange = builder.timeRange;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Transcript create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return speakerId
     */
    public String getSpeakerId() {
        return this.speakerId;
    }

    /**
     * @return timeRange
     */
    public java.util.List<Long> getTimeRange() {
        return this.timeRange;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String content; 
        private String speakerId; 
        private java.util.List<Long> timeRange; 
        private String type; 

        private Builder() {
        } 

        private Builder(Transcript model) {
            this.content = model.content;
            this.speakerId = model.speakerId;
            this.timeRange = model.timeRange;
            this.type = model.type;
        } 

        /**
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * SpeakerId.
         */
        public Builder speakerId(String speakerId) {
            this.speakerId = speakerId;
            return this;
        }

        /**
         * TimeRange.
         */
        public Builder timeRange(java.util.List<Long> timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Transcript build() {
            return new Transcript(this);
        } 

    } 

}
