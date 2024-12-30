// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link VideoMediaVideoStream} extends {@link TeaModel}
 *
 * <p>VideoMediaVideoStream</p>
 */
public class VideoMediaVideoStream extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("bitrate")
    private String bitrate;

    @com.aliyun.core.annotation.NameInMap("code_name")
    private String codeName;

    @com.aliyun.core.annotation.NameInMap("duration")
    private String duration;

    @com.aliyun.core.annotation.NameInMap("frame_count")
    private String frameCount;

    private VideoMediaVideoStream(Builder builder) {
        this.bitrate = builder.bitrate;
        this.codeName = builder.codeName;
        this.duration = builder.duration;
        this.frameCount = builder.frameCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VideoMediaVideoStream create() {
        return builder().build();
    }

    /**
     * @return bitrate
     */
    public String getBitrate() {
        return this.bitrate;
    }

    /**
     * @return codeName
     */
    public String getCodeName() {
        return this.codeName;
    }

    /**
     * @return duration
     */
    public String getDuration() {
        return this.duration;
    }

    /**
     * @return frameCount
     */
    public String getFrameCount() {
        return this.frameCount;
    }

    public static final class Builder {
        private String bitrate; 
        private String codeName; 
        private String duration; 
        private String frameCount; 

        /**
         * bitrate.
         */
        public Builder bitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }

        /**
         * code_name.
         */
        public Builder codeName(String codeName) {
            this.codeName = codeName;
            return this;
        }

        /**
         * duration.
         */
        public Builder duration(String duration) {
            this.duration = duration;
            return this;
        }

        /**
         * frame_count.
         */
        public Builder frameCount(String frameCount) {
            this.frameCount = frameCount;
            return this;
        }

        public VideoMediaVideoStream build() {
            return new VideoMediaVideoStream(this);
        } 

    } 

}
