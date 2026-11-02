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
 * {@link MediaConvertMuxConfig} extends {@link TeaModel}
 *
 * <p>MediaConvertMuxConfig</p>
 */
public class MediaConvertMuxConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Segment")
    private MediaConvertSegment segment;

    private MediaConvertMuxConfig(Builder builder) {
        this.segment = builder.segment;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MediaConvertMuxConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return segment
     */
    public MediaConvertSegment getSegment() {
        return this.segment;
    }

    public static final class Builder {
        private MediaConvertSegment segment; 

        private Builder() {
        } 

        private Builder(MediaConvertMuxConfig model) {
            this.segment = model.segment;
        } 

        /**
         * <p>The segment configuration field. For more information, see the Segment details.</p>
         * <p>This parameter takes effect only when Container is set to m3u8, hls-fmp4, mpd, or cmaf.</p>
         */
        public Builder segment(MediaConvertSegment segment) {
            this.segment = segment;
            return this;
        }

        public MediaConvertMuxConfig build() {
            return new MediaConvertMuxConfig(this);
        } 

    } 

}
