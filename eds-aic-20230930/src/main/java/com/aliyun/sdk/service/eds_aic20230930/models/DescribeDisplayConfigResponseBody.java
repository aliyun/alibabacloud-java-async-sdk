// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DescribeDisplayConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDisplayConfigResponseBody</p>
 */
public class DescribeDisplayConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DisplayConfigModel")
    private java.util.List<DisplayConfigModel> displayConfigModel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDisplayConfigResponseBody(Builder builder) {
        this.displayConfigModel = builder.displayConfigModel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDisplayConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return displayConfigModel
     */
    public java.util.List<DisplayConfigModel> getDisplayConfigModel() {
        return this.displayConfigModel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DisplayConfigModel> displayConfigModel; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDisplayConfigResponseBody model) {
            this.displayConfigModel = model.displayConfigModel;
            this.requestId = model.requestId;
        } 

        /**
         * DisplayConfigModel.
         */
        public Builder displayConfigModel(java.util.List<DisplayConfigModel> displayConfigModel) {
            this.displayConfigModel = displayConfigModel;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDisplayConfigResponseBody build() {
            return new DescribeDisplayConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDisplayConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDisplayConfigResponseBody</p>
     */
    public static class DisplayConfigModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AndroidInstanceId")
        private String androidInstanceId;

        @com.aliyun.core.annotation.NameInMap("Dpi")
        private Integer dpi;

        @com.aliyun.core.annotation.NameInMap("Fps")
        private Integer fps;

        @com.aliyun.core.annotation.NameInMap("LockResolution")
        private String lockResolution;

        @com.aliyun.core.annotation.NameInMap("ResolutionHeight")
        private Integer resolutionHeight;

        @com.aliyun.core.annotation.NameInMap("ResolutionWidth")
        private Integer resolutionWidth;

        private DisplayConfigModel(Builder builder) {
            this.androidInstanceId = builder.androidInstanceId;
            this.dpi = builder.dpi;
            this.fps = builder.fps;
            this.lockResolution = builder.lockResolution;
            this.resolutionHeight = builder.resolutionHeight;
            this.resolutionWidth = builder.resolutionWidth;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DisplayConfigModel create() {
            return builder().build();
        }

        /**
         * @return androidInstanceId
         */
        public String getAndroidInstanceId() {
            return this.androidInstanceId;
        }

        /**
         * @return dpi
         */
        public Integer getDpi() {
            return this.dpi;
        }

        /**
         * @return fps
         */
        public Integer getFps() {
            return this.fps;
        }

        /**
         * @return lockResolution
         */
        public String getLockResolution() {
            return this.lockResolution;
        }

        /**
         * @return resolutionHeight
         */
        public Integer getResolutionHeight() {
            return this.resolutionHeight;
        }

        /**
         * @return resolutionWidth
         */
        public Integer getResolutionWidth() {
            return this.resolutionWidth;
        }

        public static final class Builder {
            private String androidInstanceId; 
            private Integer dpi; 
            private Integer fps; 
            private String lockResolution; 
            private Integer resolutionHeight; 
            private Integer resolutionWidth; 

            private Builder() {
            } 

            private Builder(DisplayConfigModel model) {
                this.androidInstanceId = model.androidInstanceId;
                this.dpi = model.dpi;
                this.fps = model.fps;
                this.lockResolution = model.lockResolution;
                this.resolutionHeight = model.resolutionHeight;
                this.resolutionWidth = model.resolutionWidth;
            } 

            /**
             * AndroidInstanceId.
             */
            public Builder androidInstanceId(String androidInstanceId) {
                this.androidInstanceId = androidInstanceId;
                return this;
            }

            /**
             * Dpi.
             */
            public Builder dpi(Integer dpi) {
                this.dpi = dpi;
                return this;
            }

            /**
             * Fps.
             */
            public Builder fps(Integer fps) {
                this.fps = fps;
                return this;
            }

            /**
             * LockResolution.
             */
            public Builder lockResolution(String lockResolution) {
                this.lockResolution = lockResolution;
                return this;
            }

            /**
             * ResolutionHeight.
             */
            public Builder resolutionHeight(Integer resolutionHeight) {
                this.resolutionHeight = resolutionHeight;
                return this;
            }

            /**
             * ResolutionWidth.
             */
            public Builder resolutionWidth(Integer resolutionWidth) {
                this.resolutionWidth = resolutionWidth;
                return this;
            }

            public DisplayConfigModel build() {
                return new DisplayConfigModel(this);
            } 

        } 

    }
}
