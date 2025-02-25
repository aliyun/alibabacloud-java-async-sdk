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
 * {@link ImageProcess} extends {@link TeaModel}
 *
 * <p>ImageProcess</p>
 */
public class ImageProcess extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("image_thumbnail_process")
    private String imageThumbnailProcess;

    @com.aliyun.core.annotation.NameInMap("office_thumbnail_process")
    private String officeThumbnailProcess;

    @com.aliyun.core.annotation.NameInMap("video_thumbnail_process")
    private String videoThumbnailProcess;

    private ImageProcess(Builder builder) {
        this.imageThumbnailProcess = builder.imageThumbnailProcess;
        this.officeThumbnailProcess = builder.officeThumbnailProcess;
        this.videoThumbnailProcess = builder.videoThumbnailProcess;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImageProcess create() {
        return builder().build();
    }

    /**
     * @return imageThumbnailProcess
     */
    public String getImageThumbnailProcess() {
        return this.imageThumbnailProcess;
    }

    /**
     * @return officeThumbnailProcess
     */
    public String getOfficeThumbnailProcess() {
        return this.officeThumbnailProcess;
    }

    /**
     * @return videoThumbnailProcess
     */
    public String getVideoThumbnailProcess() {
        return this.videoThumbnailProcess;
    }

    public static final class Builder {
        private String imageThumbnailProcess; 
        private String officeThumbnailProcess; 
        private String videoThumbnailProcess; 

        /**
         * image_thumbnail_process.
         */
        public Builder imageThumbnailProcess(String imageThumbnailProcess) {
            this.imageThumbnailProcess = imageThumbnailProcess;
            return this;
        }

        /**
         * office_thumbnail_process.
         */
        public Builder officeThumbnailProcess(String officeThumbnailProcess) {
            this.officeThumbnailProcess = officeThumbnailProcess;
            return this;
        }

        /**
         * video_thumbnail_process.
         */
        public Builder videoThumbnailProcess(String videoThumbnailProcess) {
            this.videoThumbnailProcess = videoThumbnailProcess;
            return this;
        }

        public ImageProcess build() {
            return new ImageProcess(this);
        } 

    } 

}
