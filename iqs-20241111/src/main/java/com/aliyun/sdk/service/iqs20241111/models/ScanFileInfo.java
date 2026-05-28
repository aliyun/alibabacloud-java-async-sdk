// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

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
 * {@link ScanFileInfo} extends {@link TeaModel}
 *
 * <p>ScanFileInfo</p>
 */
public class ScanFileInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("angle")
    private Integer angle;

    @com.aliyun.core.annotation.NameInMap("height")
    private Integer height;

    @com.aliyun.core.annotation.NameInMap("imageBase64")
    private byte[] imageBase64;

    @com.aliyun.core.annotation.NameInMap("width")
    private Integer width;

    private ScanFileInfo(Builder builder) {
        this.angle = builder.angle;
        this.height = builder.height;
        this.imageBase64 = builder.imageBase64;
        this.width = builder.width;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScanFileInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return angle
     */
    public Integer getAngle() {
        return this.angle;
    }

    /**
     * @return height
     */
    public Integer getHeight() {
        return this.height;
    }

    /**
     * @return imageBase64
     */
    public byte[] getImageBase64() {
        return this.imageBase64;
    }

    /**
     * @return width
     */
    public Integer getWidth() {
        return this.width;
    }

    public static final class Builder {
        private Integer angle; 
        private Integer height; 
        private byte[] imageBase64; 
        private Integer width; 

        private Builder() {
        } 

        private Builder(ScanFileInfo model) {
            this.angle = model.angle;
            this.height = model.height;
            this.imageBase64 = model.imageBase64;
            this.width = model.width;
        } 

        /**
         * angle.
         */
        public Builder angle(Integer angle) {
            this.angle = angle;
            return this;
        }

        /**
         * height.
         */
        public Builder height(Integer height) {
            this.height = height;
            return this;
        }

        /**
         * imageBase64.
         */
        public Builder imageBase64(byte[] imageBase64) {
            this.imageBase64 = imageBase64;
            return this;
        }

        /**
         * width.
         */
        public Builder width(Integer width) {
            this.width = width;
            return this;
        }

        public ScanFileInfo build() {
            return new ScanFileInfo(this);
        } 

    } 

}
