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
 * {@link SceneElement} extends {@link TeaModel}
 *
 * <p>SceneElement</p>
 */
public class SceneElement extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FrameTimes")
    private java.util.List<Long> frameTimes;

    @com.aliyun.core.annotation.NameInMap("TimeRange")
    private java.util.List<Long> timeRange;

    private SceneElement(Builder builder) {
        this.frameTimes = builder.frameTimes;
        this.timeRange = builder.timeRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SceneElement create() {
        return builder().build();
    }

    /**
     * @return frameTimes
     */
    public java.util.List<Long> getFrameTimes() {
        return this.frameTimes;
    }

    /**
     * @return timeRange
     */
    public java.util.List<Long> getTimeRange() {
        return this.timeRange;
    }

    public static final class Builder {
        private java.util.List<Long> frameTimes; 
        private java.util.List<Long> timeRange; 

        /**
         * FrameTimes.
         */
        public Builder frameTimes(java.util.List<Long> frameTimes) {
            this.frameTimes = frameTimes;
            return this;
        }

        /**
         * TimeRange.
         */
        public Builder timeRange(java.util.List<Long> timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        public SceneElement build() {
            return new SceneElement(this);
        } 

    } 

}
