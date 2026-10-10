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
 * {@link TrendPointDTO} extends {@link TeaModel}
 *
 * <p>TrendPointDTO</p>
 */
public class TrendPointDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("timestamp")
    private Long timestamp;

    @com.aliyun.core.annotation.NameInMap("values")
    private String values;

    private TrendPointDTO(Builder builder) {
        this.timestamp = builder.timestamp;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TrendPointDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return timestamp
     */
    public Long getTimestamp() {
        return this.timestamp;
    }

    /**
     * @return values
     */
    public String getValues() {
        return this.values;
    }

    public static final class Builder {
        private Long timestamp; 
        private String values; 

        private Builder() {
        } 

        private Builder(TrendPointDTO model) {
            this.timestamp = model.timestamp;
            this.values = model.values;
        } 

        /**
         * <p>UNIX timestamp (Unix seconds)</p>
         * 
         * <strong>example:</strong>
         * <p>1700000000</p>
         */
        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * <p>Metric value mapping, where the key is the metric name and the value is the numeric value</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{\&quot;total_calls\&quot;:0,\&quot;video_duration\&quot;:0,\&quot;total_amount\&quot;:0,\&quot;model_count\&quot;:0,\&quot;image_count\&quot;:0}&quot;</p>
         */
        public Builder values(String values) {
            this.values = values;
            return this;
        }

        public TrendPointDTO build() {
            return new TrendPointDTO(this);
        } 

    } 

}
