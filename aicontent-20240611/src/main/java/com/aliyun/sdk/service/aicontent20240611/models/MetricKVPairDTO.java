// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link MetricKVPairDTO} extends {@link TeaModel}
 *
 * <p>MetricKVPairDTO</p>
 */
public class MetricKVPairDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("value")
    private Float value;

    private MetricKVPairDTO(Builder builder) {
        this.key = builder.key;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MetricKVPairDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return value
     */
    public Float getValue() {
        return this.value;
    }

    public static final class Builder {
        private String key; 
        private Float value; 

        private Builder() {
        } 

        private Builder(MetricKVPairDTO model) {
            this.key = model.key;
            this.value = model.value;
        } 

        /**
         * <p>Metric Name.  </p>
         * <p><strong>Chat</strong>  </p>
         * <ul>
         * <li><code>total_calls</code>: Number Of Calls, integer, Count  </li>
         * <li><code>input_tokens</code>: Total input tokens, integer  </li>
         * <li><code>output_tokens</code>: Total output tokens, integer  </li>
         * <li><code>reasoning_tokens</code>: Reasoning tokens, integer  </li>
         * <li><code>cached_tokens</code>: Cached input tokens (hit), integer</li>
         * </ul>
         * <p><strong>Vision</strong>  </p>
         * <ul>
         * <li><code>total_calls</code>: Number Of Calls, integer, Count  </li>
         * <li><code>image_count</code>: Number of generated images, integer  </li>
         * <li><code>video_duration</code>: Generated video duration, rounded to 3 decimal places, seconds</li>
         * </ul>
         * <p><strong>Embedding</strong>  </p>
         * <ul>
         * <li><code>total_calls</code>: Number Of Calls, integer, Count  </li>
         * <li><code>embedding_output_tokens</code>: Embedding output tokens, integer  </li>
         * <li><code>billing_tokens</code>: Total billing tokens, integer  </li>
         * <li><code>image_tokens</code>: Image tokens (multimodal embedding), integer</li>
         * </ul>
         * <p><strong>Omni-modal (ChatFullmodal / ChatMultimodal)</strong>  </p>
         * <ul>
         * <li><code>total_calls</code>: Number Of Calls, integer, Count  </li>
         * <li><code>input_text_tokens</code>: Input text tokens, integer  </li>
         * <li><code>input_audio_tokens</code>: Input audio tokens, integer  </li>
         * <li><code>input_image_tokens</code>: Input image tokens, integer  </li>
         * <li><code>input_video_tokens</code>: Input video tokens, integer  </li>
         * <li><code>output_text_tokens</code>: Output text tokens, integer  </li>
         * <li><code>output_audio_tokens</code>: Output audio tokens, integer</li>
         * </ul>
         * <p><strong>Speech (TTS / ASR)</strong>  </p>
         * <ul>
         * <li><code>total_calls</code>: Number Of Calls, integer, Count  </li>
         * <li><code>characters</code>: Characters converted to speech, integer  </li>
         * <li><code>asr_duration</code>: Speech recognition duration, rounded to 3 decimal places, seconds</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>total_calls</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>Metric value</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder value(Float value) {
            this.value = value;
            return this;
        }

        public MetricKVPairDTO build() {
            return new MetricKVPairDTO(this);
        } 

    } 

}
