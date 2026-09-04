// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link RLLogContextLine} extends {@link TeaModel}
 *
 * <p>RLLogContextLine</p>
 */
public class RLLogContextLine extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("TimestampMs")
    private Long timestampMs;

    private RLLogContextLine(Builder builder) {
        this.message = builder.message;
        this.timestampMs = builder.timestampMs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLLogContextLine create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return timestampMs
     */
    public Long getTimestampMs() {
        return this.timestampMs;
    }

    public static final class Builder {
        private String message; 
        private Long timestampMs; 

        private Builder() {
        } 

        private Builder(RLLogContextLine model) {
            this.message = model.message;
            this.timestampMs = model.timestampMs;
        } 

        /**
         * <p>日志文本（&lt;=2000，已剥 ANSI）</p>
         * 
         * <strong>example:</strong>
         * <p>CUDA out of memory. Tried to allocate 2.00 GiB</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>日志行毫秒时间戳</p>
         * 
         * <strong>example:</strong>
         * <p>1787293208012</p>
         */
        public Builder timestampMs(Long timestampMs) {
            this.timestampMs = timestampMs;
            return this;
        }

        public RLLogContextLine build() {
            return new RLLogContextLine(this);
        } 

    } 

}
