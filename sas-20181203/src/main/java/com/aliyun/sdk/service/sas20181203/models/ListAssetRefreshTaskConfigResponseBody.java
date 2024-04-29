// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAssetRefreshTaskConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ListAssetRefreshTaskConfigResponseBody</p>
 */
public class ListAssetRefreshTaskConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssetRefreshConfig")
    private java.util.List < AssetRefreshConfig> assetRefreshConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAssetRefreshTaskConfigResponseBody(Builder builder) {
        this.assetRefreshConfig = builder.assetRefreshConfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAssetRefreshTaskConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return assetRefreshConfig
     */
    public java.util.List < AssetRefreshConfig> getAssetRefreshConfig() {
        return this.assetRefreshConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AssetRefreshConfig> assetRefreshConfig; 
        private String requestId; 

        /**
         * The asset synchronization configuration.
         */
        public Builder assetRefreshConfig(java.util.List < AssetRefreshConfig> assetRefreshConfig) {
            this.assetRefreshConfig = assetRefreshConfig;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAssetRefreshTaskConfigResponseBody build() {
            return new ListAssetRefreshTaskConfigResponseBody(this);
        } 

    } 

    public static class AssetRefreshConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RefreshConfigType")
        private Integer refreshConfigType;

        @com.aliyun.core.annotation.NameInMap("SchedulePeriod")
        private Integer schedulePeriod;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private Integer vendor;

        private AssetRefreshConfig(Builder builder) {
            this.refreshConfigType = builder.refreshConfigType;
            this.schedulePeriod = builder.schedulePeriod;
            this.status = builder.status;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssetRefreshConfig create() {
            return builder().build();
        }

        /**
         * @return refreshConfigType
         */
        public Integer getRefreshConfigType() {
            return this.refreshConfigType;
        }

        /**
         * @return schedulePeriod
         */
        public Integer getSchedulePeriod() {
            return this.schedulePeriod;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return vendor
         */
        public Integer getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private Integer refreshConfigType; 
            private Integer schedulePeriod; 
            private Integer status; 
            private Integer vendor; 

            /**
             * The type of the configuration. Valid values:
             * <p>
             * 
             * *   **0**: server synchronization task
             * *   **1**: cloud service synchronization task
             * *   **2**: scheduled AccessKey pair verification task
             */
            public Builder refreshConfigType(Integer refreshConfigType) {
                this.refreshConfigType = refreshConfigType;
                return this;
            }

            /**
             * The synchronization cycle. Valid values:
             * <p>
             * 
             * *   **60**: 60 minutes
             * *   **180**: 3 hours
             * *   **360**: 6 hours
             * *   **720**: 12 hours
             * *   **1440**: 1 day
             * *   **10080**: 7 days
             */
            public Builder schedulePeriod(Integer schedulePeriod) {
                this.schedulePeriod = schedulePeriod;
                return this;
            }

            /**
             * The status of the configuration. Valid values:
             * <p>
             * 
             * *   **1**: enabled
             * *   **0**: disabled
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The service provider of the cloud asset. Valid values:
             * <p>
             * 
             * *   **3**: Tencent Cloud
             * *   **4**: Huawei Cloud
             * *   **7**: Amazon Web Services (AWS) Cloud
             */
            public Builder vendor(Integer vendor) {
                this.vendor = vendor;
                return this;
            }

            public AssetRefreshConfig build() {
                return new AssetRefreshConfig(this);
            } 

        } 

    }
}
