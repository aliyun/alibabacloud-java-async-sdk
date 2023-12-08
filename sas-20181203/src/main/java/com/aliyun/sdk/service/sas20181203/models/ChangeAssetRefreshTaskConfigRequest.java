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
         * The asset synchronization configuration.
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
        @NameInMap("RefreshConfigType")
        private Integer refreshConfigType;

        @NameInMap("SchedulePeriod")
        private Integer schedulePeriod;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TargetId")
        private Long targetId;

        @NameInMap("Vendor")
        private Integer vendor;

        private AssetRefreshConfigs(Builder builder) {
            this.refreshConfigType = builder.refreshConfigType;
            this.schedulePeriod = builder.schedulePeriod;
            this.status = builder.status;
            this.targetId = builder.targetId;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssetRefreshConfigs create() {
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
         * @return targetId
         */
        public Long getTargetId() {
            return this.targetId;
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
            private Long targetId; 
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
             * The ID of the data entry containing the AccessKey pair that you specify when you configure the scheduled AccessKey pair verification task.
             */
            public Builder targetId(Long targetId) {
                this.targetId = targetId;
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

            public AssetRefreshConfigs build() {
                return new AssetRefreshConfigs(this);
            } 

        } 

    }
}
