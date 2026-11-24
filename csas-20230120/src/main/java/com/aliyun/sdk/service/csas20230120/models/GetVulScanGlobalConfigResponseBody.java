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
 * {@link GetVulScanGlobalConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetVulScanGlobalConfigResponseBody</p>
 */
public class GetVulScanGlobalConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxDownloadSpeed")
    private Integer maxDownloadSpeed;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WuyingVulFixConfig")
    private WuyingVulFixConfig wuyingVulFixConfig;

    private GetVulScanGlobalConfigResponseBody(Builder builder) {
        this.maxDownloadSpeed = builder.maxDownloadSpeed;
        this.requestId = builder.requestId;
        this.wuyingVulFixConfig = builder.wuyingVulFixConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVulScanGlobalConfigResponseBody create() {
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

        private Builder(GetVulScanGlobalConfigResponseBody model) {
            this.maxDownloadSpeed = model.maxDownloadSpeed;
            this.requestId = model.requestId;
            this.wuyingVulFixConfig = model.wuyingVulFixConfig;
        } 

        /**
         * <p>The maximum download rate of vulnerability patches for a single user terminal device. Unit: Byte/s. A value of 0 indicates no rate limit.</p>
         * 
         * <strong>example:</strong>
         * <p>1048576</p>
         */
        public Builder maxDownloadSpeed(Integer maxDownloadSpeed) {
            this.maxDownloadSpeed = maxDownloadSpeed;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3D7EC0AF-DB2A-5D9C-90EC-F090A6BAAEA7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The vulnerability fix configuration for WUYING Cloud Desktop. This configuration takes effect only for user terminal devices of the WUYING Cloud Desktop type.</p>
         */
        public Builder wuyingVulFixConfig(WuyingVulFixConfig wuyingVulFixConfig) {
            this.wuyingVulFixConfig = wuyingVulFixConfig;
            return this;
        }

        public GetVulScanGlobalConfigResponseBody build() {
            return new GetVulScanGlobalConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVulScanGlobalConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetVulScanGlobalConfigResponseBody</p>
     */
    public static class WuyingVulFixConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AntiShutdownSwitch")
        private Boolean antiShutdownSwitch;

        @com.aliyun.core.annotation.NameInMap("SnapshotSwitch")
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
             * <p>Specifies whether to prohibit shutdown during the fix process to prevent system exceptions caused by shutdown during patch installation. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Shutdown is prohibited.</li>
             * <li><strong>false</strong>: Shutdown is not prohibited.</li>
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
             * <p>Specifies whether to create a snapshot for the Cloud Desktop before the fix process to allow rollback if the fix fails. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: A snapshot is created.</li>
             * <li><strong>false</strong>: No snapshot is created.</li>
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
