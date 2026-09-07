// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link UpdateVulScanGlobalConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateVulScanGlobalConfigRequest</p>
 */
public class UpdateVulScanGlobalConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxDownloadSpeed")
    private Integer maxDownloadSpeed;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WuyingVulFixConfig")
    @Deprecated
    private WuyingVulFixConfig wuyingVulFixConfig;

    private UpdateVulScanGlobalConfigRequest(Builder builder) {
        super(builder);
        this.maxDownloadSpeed = builder.maxDownloadSpeed;
        this.wuyingVulFixConfig = builder.wuyingVulFixConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVulScanGlobalConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxDownloadSpeed
     */
    public Integer getMaxDownloadSpeed() {
        return this.maxDownloadSpeed;
    }

    /**
     * @return wuyingVulFixConfig
     */
    public WuyingVulFixConfig getWuyingVulFixConfig() {
        return this.wuyingVulFixConfig;
    }

    public static final class Builder extends Request.Builder<UpdateVulScanGlobalConfigRequest, Builder> {
        private Integer maxDownloadSpeed; 
        private WuyingVulFixConfig wuyingVulFixConfig; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVulScanGlobalConfigRequest request) {
            super(request);
            this.maxDownloadSpeed = request.maxDownloadSpeed;
            this.wuyingVulFixConfig = request.wuyingVulFixConfig;
        } 

        /**
         * <p>The maximum download rate for vulnerability patches on a single user terminal device. Unit: Byte/s. A value of 0 indicates no speed limit.</p>
         * 
         * <strong>example:</strong>
         * <p>1048576</p>
         */
        public Builder maxDownloadSpeed(Integer maxDownloadSpeed) {
            this.putBodyParameter("MaxDownloadSpeed", maxDownloadSpeed);
            this.maxDownloadSpeed = maxDownloadSpeed;
            return this;
        }

        /**
         * <p>The vulnerability fix configuration for WUYING Workspace. This configuration applies only to user terminal devices of the Cloud Desktop type.</p>
         */
        public Builder wuyingVulFixConfig(WuyingVulFixConfig wuyingVulFixConfig) {
            String wuyingVulFixConfigShrink = shrink(wuyingVulFixConfig, "WuyingVulFixConfig", "json");
            this.putBodyParameter("WuyingVulFixConfig", wuyingVulFixConfigShrink);
            this.wuyingVulFixConfig = wuyingVulFixConfig;
            return this;
        }

        @Override
        public UpdateVulScanGlobalConfigRequest build() {
            return new UpdateVulScanGlobalConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateVulScanGlobalConfigRequest} extends {@link TeaModel}
     *
     * <p>UpdateVulScanGlobalConfigRequest</p>
     */
    public static class WuyingVulFixConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AntiShutdownSwitch")
        @Deprecated
        private Boolean antiShutdownSwitch;

        @com.aliyun.core.annotation.NameInMap("SnapshotSwitch")
        @Deprecated
        private Boolean snapshotSwitch;

        private WuyingVulFixConfig(Builder builder) {
            this.antiShutdownSwitch = builder.antiShutdownSwitch;
            this.snapshotSwitch = builder.snapshotSwitch;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WuyingVulFixConfig create() {
            return builder().build();
        }

        /**
         * @return antiShutdownSwitch
         */
        public Boolean getAntiShutdownSwitch() {
            return this.antiShutdownSwitch;
        }

        /**
         * @return snapshotSwitch
         */
        public Boolean getSnapshotSwitch() {
            return this.snapshotSwitch;
        }

        public static final class Builder {
            private Boolean antiShutdownSwitch; 
            private Boolean snapshotSwitch; 

            private Builder() {
            } 

            private Builder(WuyingVulFixConfig model) {
                this.antiShutdownSwitch = model.antiShutdownSwitch;
                this.snapshotSwitch = model.snapshotSwitch;
            } 

            /**
             * <p>Specifies whether to prohibit shutdown during the fix process to prevent system exceptions caused by shutting down during patch installation. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Prohibit shutdown.</li>
             * <li><strong>false</strong>: Do not prohibit shutdown.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder antiShutdownSwitch(Boolean antiShutdownSwitch) {
                this.antiShutdownSwitch = antiShutdownSwitch;
                return this;
            }

            /**
             * <p>Specifies whether to create a snapshot for the cloud desktop before the fix for rollback in case of fix failure. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Create a snapshot.</li>
             * <li><strong>false</strong>: Do not create a snapshot.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder snapshotSwitch(Boolean snapshotSwitch) {
                this.snapshotSwitch = snapshotSwitch;
                return this;
            }

            public WuyingVulFixConfig build() {
                return new WuyingVulFixConfig(this);
            } 

        } 

    }
}
