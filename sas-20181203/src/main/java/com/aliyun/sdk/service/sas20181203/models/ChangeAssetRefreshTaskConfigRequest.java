// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeAssetRefreshTaskConfigRequest} extends {@link RequestModel}
 *
 * <p>ChangeAssetRefreshTaskConfigRequest</p>
 */
public class ChangeAssetRefreshTaskConfigRequest extends Request {
    @Query
    @NameInMap("AssetRefreshConfigs")
    private java.util.List < AssetRefreshConfigs> assetRefreshConfigs;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private ChangeAssetRefreshTaskConfigRequest(Builder builder) {
        super(builder);
        this.assetRefreshConfigs = builder.assetRefreshConfigs;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeAssetRefreshTaskConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetRefreshConfigs
     */
    public java.util.List < AssetRefreshConfigs> getAssetRefreshConfigs() {
        return this.assetRefreshConfigs;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ChangeAssetRefreshTaskConfigRequest, Builder> {
        private java.util.List < AssetRefreshConfigs> assetRefreshConfigs; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ChangeAssetRefreshTaskConfigRequest request) {
            super(request);
            this.assetRefreshConfigs = request.assetRefreshConfigs;
            this.regionId = request.regionId;
        } 

        /**
         * The asset synchronization configurations.
         */
        public Builder assetRefreshConfigs(java.util.List < AssetRefreshConfigs> assetRefreshConfigs) {
            this.putQueryParameter("AssetRefreshConfigs", assetRefreshConfigs);
            this.assetRefreshConfigs = assetRefreshConfigs;
            return this;
        }

        /**
         * The region in which your Security Center service resides.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ChangeAssetRefreshTaskConfigRequest build() {
            return new ChangeAssetRefreshTaskConfigRequest(this);
        } 

    } 

    public static class AssetRefreshConfigs extends TeaModel {
        @NameInMap("SchedulePeriod")
        private Integer schedulePeriod;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Vendor")
        private Integer vendor;

        private AssetRefreshConfigs(Builder builder) {
            this.schedulePeriod = builder.schedulePeriod;
            this.status = builder.status;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssetRefreshConfigs create() {
            return builder().build();
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
            private Integer schedulePeriod; 
            private Integer status; 
            private Integer vendor; 

            /**
             * The interval at which assets are synchronized. Unit: minutes. Valid values:
             * <p>
             * 
             * *   **60**
             * *   **180**
             * *   **360**
             * *   **720**
             * *   **1440**
             * *   **10080**
             */
            public Builder schedulePeriod(Integer schedulePeriod) {
                this.schedulePeriod = schedulePeriod;
                return this;
            }

            /**
             * The status of the asset synchronization feature. Valid values:
             * <p>
             * 
             * *   **1**: Asset synchronization is enabled.
             * *   **0**: Asset synchronization is disabled.
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
             * *   **4**: HUAWEI CLOUD
             * *   **7**: Amazon Web Services (AWS)
             */
            public Builder vendor(Integer vendor) {
                this.vendor = vendor;
                return this;
            }

            public AssetRefreshConfigs build() {
                return new AssetRefreshConfigs(this);
            } 

        } 

    }
}
