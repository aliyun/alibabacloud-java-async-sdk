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
 * {@link UpdateVulScanGlobalConfigResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateVulScanGlobalConfigResponseBody</p>
 */
public class UpdateVulScanGlobalConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxDownloadSpeed")
    private Integer maxDownloadSpeed;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WuyingVulFixConfig")
    @Deprecated
    private WuyingVulFixConfig wuyingVulFixConfig;

    private UpdateVulScanGlobalConfigResponseBody(Builder builder) {
        this.maxDownloadSpeed = builder.maxDownloadSpeed;
        this.requestId = builder.requestId;
        this.wuyingVulFixConfig = builder.wuyingVulFixConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVulScanGlobalConfigResponseBody create() {
        return builder().build();
    }

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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return wuyingVulFixConfig
     */
    public WuyingVulFixConfig getWuyingVulFixConfig() {
        return this.wuyingVulFixConfig;
    }

    public static final class Builder {
        private Integer maxDownloadSpeed; 
        private String requestId; 
        private WuyingVulFixConfig wuyingVulFixConfig; 

        private Builder() {
        } 

        private Builder(UpdateVulScanGlobalConfigResponseBody model) {
            this.maxDownloadSpeed = model.maxDownloadSpeed;
            this.requestId = model.requestId;
            this.wuyingVulFixConfig = model.wuyingVulFixConfig;
        } 

        /**
         * MaxDownloadSpeed.
         */
        public Builder maxDownloadSpeed(Integer maxDownloadSpeed) {
            this.maxDownloadSpeed = maxDownloadSpeed;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WuyingVulFixConfig.
         */
        public Builder wuyingVulFixConfig(WuyingVulFixConfig wuyingVulFixConfig) {
            this.wuyingVulFixConfig = wuyingVulFixConfig;
            return this;
        }

        public UpdateVulScanGlobalConfigResponseBody build() {
            return new UpdateVulScanGlobalConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateVulScanGlobalConfigResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateVulScanGlobalConfigResponseBody</p>
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
             * AntiShutdownSwitch.
             */
            public Builder antiShutdownSwitch(Boolean antiShutdownSwitch) {
                this.antiShutdownSwitch = antiShutdownSwitch;
                return this;
            }

            /**
             * SnapshotSwitch.
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
