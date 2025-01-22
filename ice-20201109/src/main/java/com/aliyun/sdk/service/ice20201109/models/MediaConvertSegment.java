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
 * {@link MediaConvertSegment} extends {@link TeaModel}
 *
 * <p>MediaConvertSegment</p>
 */
public class MediaConvertSegment extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Duration")
    private Integer duration;

    @com.aliyun.core.annotation.NameInMap("ForceSegTime")
    private String forceSegTime;

    private MediaConvertSegment(Builder builder) {
        this.duration = builder.duration;
        this.forceSegTime = builder.forceSegTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MediaConvertSegment create() {
        return builder().build();
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return forceSegTime
     */
    public String getForceSegTime() {
        return this.forceSegTime;
    }

    public static final class Builder {
        private Integer duration; 
        private String forceSegTime; 

        /**
         * Duration.
         */
        public Builder duration(Integer duration) {
            this.duration = duration;
            return this;
        }

        /**
         * ForceSegTime.
         */
        public Builder forceSegTime(String forceSegTime) {
            this.forceSegTime = forceSegTime;
            return this;
        }

        public MediaConvertSegment build() {
            return new MediaConvertSegment(this);
        } 

    } 

}
