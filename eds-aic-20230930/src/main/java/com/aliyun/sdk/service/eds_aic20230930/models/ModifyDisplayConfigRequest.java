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
 * {@link ModifyDisplayConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyDisplayConfigRequest</p>
 */
public class ModifyDisplayConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AndroidInstanceIds")
    private java.util.List<String> androidInstanceIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisplayConfig")
    private DisplayConfig displayConfig;

    private ModifyDisplayConfigRequest(Builder builder) {
        super(builder);
        this.androidInstanceIds = builder.androidInstanceIds;
        this.displayConfig = builder.displayConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDisplayConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return androidInstanceIds
     */
    public java.util.List<String> getAndroidInstanceIds() {
        return this.androidInstanceIds;
    }

    /**
     * @return displayConfig
     */
    public DisplayConfig getDisplayConfig() {
        return this.displayConfig;
    }

    public static final class Builder extends Request.Builder<ModifyDisplayConfigRequest, Builder> {
        private java.util.List<String> androidInstanceIds; 
        private DisplayConfig displayConfig; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDisplayConfigRequest request) {
            super(request);
            this.androidInstanceIds = request.androidInstanceIds;
            this.displayConfig = request.displayConfig;
        } 

        /**
         * <p>A list of instance IDs.</p>
         */
        public Builder androidInstanceIds(java.util.List<String> androidInstanceIds) {
            this.putBodyParameter("AndroidInstanceIds", androidInstanceIds);
            this.androidInstanceIds = androidInstanceIds;
            return this;
        }

        /**
         * <p>The display settings.</p>
         */
        public Builder displayConfig(DisplayConfig displayConfig) {
            String displayConfigShrink = shrink(displayConfig, "DisplayConfig", "json");
            this.putBodyParameter("DisplayConfig", displayConfigShrink);
            this.displayConfig = displayConfig;
            return this;
        }

        @Override
        public ModifyDisplayConfigRequest build() {
            return new ModifyDisplayConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyDisplayConfigRequest} extends {@link TeaModel}
     *
     * <p>ModifyDisplayConfigRequest</p>
     */
    public static class DisplayConfig extends TeaModel {
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

        private DisplayConfig(Builder builder) {
            this.dpi = builder.dpi;
            this.fps = builder.fps;
            this.lockResolution = builder.lockResolution;
            this.resolutionHeight = builder.resolutionHeight;
            this.resolutionWidth = builder.resolutionWidth;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DisplayConfig create() {
            return builder().build();
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
            private Integer dpi; 
            private Integer fps; 
            private String lockResolution; 
            private Integer resolutionHeight; 
            private Integer resolutionWidth; 

            private Builder() {
            } 

            private Builder(DisplayConfig model) {
                this.dpi = model.dpi;
                this.fps = model.fps;
                this.lockResolution = model.lockResolution;
                this.resolutionHeight = model.resolutionHeight;
                this.resolutionWidth = model.resolutionWidth;
            } 

            /**
             * <p>The dots per inch (DPI). Valid values: 72 to 600.</p>
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
             * <p>Specifies whether to lock the resolution.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder lockResolution(String lockResolution) {
                this.lockResolution = lockResolution;
                return this;
            }

            /**
             * <p>The resolution height, in pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>1920</p>
             */
            public Builder resolutionHeight(Integer resolutionHeight) {
                this.resolutionHeight = resolutionHeight;
                return this;
            }

            /**
             * <p>The resolution width, in pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>720</p>
             */
            public Builder resolutionWidth(Integer resolutionWidth) {
                this.resolutionWidth = resolutionWidth;
                return this;
            }

            public DisplayConfig build() {
                return new DisplayConfig(this);
            } 

        } 

    }
}
