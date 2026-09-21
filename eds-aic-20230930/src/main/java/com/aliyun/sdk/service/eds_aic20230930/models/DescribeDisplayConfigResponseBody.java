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
         * <p>A list of display settings.</p>
         */
        public Builder displayConfigModel(java.util.List<DisplayConfigModel> displayConfigModel) {
            this.displayConfigModel = displayConfigModel;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FFEF7EFE-1E36-56D1-B5BF-5BACE43B****</p>
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
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cpn-jewjt8xryuituz4qn-****</p>
             */
            public Builder androidInstanceId(String androidInstanceId) {
                this.androidInstanceId = androidInstanceId;
                return this;
            }

            /**
             * <p>The dots per inch (DPI). The value ranges from 72 to 600.</p>
             * 
             * <strong>example:</strong>
             * <p>240</p>
             */
            public Builder dpi(Integer dpi) {
                this.dpi = dpi;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder fps(Integer fps) {
                this.fps = fps;
                return this;
            }

            /**
             * <p>Indicates whether the resolution is locked.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder lockResolution(String lockResolution) {
                this.lockResolution = lockResolution;
                return this;
            }

            /**
             * <p>The height of the resolution. Unit: pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>1280</p>
             */
            public Builder resolutionHeight(Integer resolutionHeight) {
                this.resolutionHeight = resolutionHeight;
                return this;
            }

            /**
             * <p>The width of the resolution. Unit: pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>720</p>
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
