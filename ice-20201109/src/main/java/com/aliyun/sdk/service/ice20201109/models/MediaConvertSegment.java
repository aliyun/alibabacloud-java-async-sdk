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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(MediaConvertSegment model) {
            this.duration = model.duration;
            this.forceSegTime = model.forceSegTime;
        } 

        /**
         * <p>The length of the segment.</p>
         * <ul>
         * <li>Unit: seconds.</li>
         * <li>Valid values: [1,60].</li>
         * <li>Default value: 10. A value of 10 will create segments at the 10s, 20s, 30s, and 40s marks of the video.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder duration(Integer duration) {
            this.duration = duration;
            return this;
        }

        /**
         * <p>The points in time at which the video is forcibly segmented. Separate multiple points with commas (,). You can specify up to 10 points.</p>
         * <ul>
         * <li>Format: {Point in time},{Point in time},{Point in time}.</li>
         * <li>Type: decimal. This parameter supports up to three decimal places.</li>
         * <li>Unit: seconds.</li>
         * <li>Example: 1,2,4,6,10,14,18, which specifies that the video is forcibly segmented at the 1st, 2nd, 4th, 6th, 10th, 14th, and 18th seconds.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1,2</p>
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
