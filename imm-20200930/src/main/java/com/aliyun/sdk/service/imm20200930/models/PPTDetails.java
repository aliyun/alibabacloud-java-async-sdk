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
 * {@link PPTDetails} extends {@link TeaModel}
 *
 * <p>PPTDetails</p>
 */
public class PPTDetails extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImagePath")
    private String imagePath;

    @com.aliyun.core.annotation.NameInMap("PPTShotIndex")
    private Long PPTShotIndex;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private PPTDetails(Builder builder) {
        this.imagePath = builder.imagePath;
        this.PPTShotIndex = builder.PPTShotIndex;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PPTDetails create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imagePath
     */
    public String getImagePath() {
        return this.imagePath;
    }

    /**
     * @return PPTShotIndex
     */
    public Long getPPTShotIndex() {
        return this.PPTShotIndex;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private String imagePath; 
        private Long PPTShotIndex; 
        private Long startTime; 

        private Builder() {
        } 

        private Builder(PPTDetails model) {
            this.imagePath = model.imagePath;
            this.PPTShotIndex = model.PPTShotIndex;
            this.startTime = model.startTime;
        } 

        /**
         * <p>The image path of the PPT frame capture.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;ppts/video_snapshots_0.jpg&quot;</p>
         */
        public Builder imagePath(String imagePath) {
            this.imagePath = imagePath;
            return this;
        }

        /**
         * <p>The index of the PPT frame capture.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder PPTShotIndex(Long PPTShotIndex) {
            this.PPTShotIndex = PPTShotIndex;
            return this;
        }

        /**
         * <p>The time in the video.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        public PPTDetails build() {
            return new PPTDetails(this);
        } 

    } 

}
