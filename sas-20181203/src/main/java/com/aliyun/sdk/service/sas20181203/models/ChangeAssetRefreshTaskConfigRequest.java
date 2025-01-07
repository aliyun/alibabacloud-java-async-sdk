// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ChangeAssetRefreshTaskConfigRequest} extends {@link RequestModel}
 *
 * <p>ChangeAssetRefreshTaskConfigRequest</p>
 */
public class ChangeAssetRefreshTaskConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetRefreshConfigs")
    private java.util.List<AssetRefreshConfigs> assetRefreshConfigs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
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
    public java.util.List<AssetRefreshConfigs> getAssetRefreshConfigs() {
        return this.assetRefreshConfigs;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ChangeAssetRefreshTaskConfigRequest, Builder> {
        private java.util.List<AssetRefreshConfigs> assetRefreshConfigs; 
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
         * <p>The asset synchronization configuration.</p>
         */
        public Builder assetRefreshConfigs(java.util.List<AssetRefreshConfigs> assetRefreshConfigs) {
            this.putQueryParameter("AssetRefreshConfigs", assetRefreshConfigs);
            this.assetRefreshConfigs = assetRefreshConfigs;
            return this;
        }

        /**
         * <p>The region in which your Security Center service resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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

    /**
     * 
     * {@link ChangeAssetRefreshTaskConfigRequest} extends {@link TeaModel}
     *
     * <p>ChangeAssetRefreshTaskConfigRequest</p>
     */
    public static class AssetRefreshConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RefreshConfigType")
        private Integer refreshConfigType;

        @com.aliyun.core.annotation.NameInMap("SchedulePeriod")
        private Integer schedulePeriod;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TargetId")
        private Long targetId;

        @com.aliyun.core.annotation.NameInMap("Vendor")
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
             * <p>The type of the configuration. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: server synchronization task</li>
             * <li><strong>1</strong>: cloud service synchronization task</li>
             * <li><strong>2</strong>: scheduled AccessKey pair verification task</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder refreshConfigType(Integer refreshConfigType) {
                this.refreshConfigType = refreshConfigType;
                return this;
            }

            /**
             * <p>The synchronization cycle. Valid values:</p>
             * <ul>
             * <li><strong>60</strong>: 60 minutes</li>
             * <li><strong>180</strong>: 3 hours</li>
             * <li><strong>360</strong>: 6 hours</li>
             * <li><strong>720</strong>: 12 hours</li>
             * <li><strong>1440</strong>: 1 day</li>
             * <li><strong>10080</strong>: 7 days</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>360</p>
             */
            public Builder schedulePeriod(Integer schedulePeriod) {
                this.schedulePeriod = schedulePeriod;
                return this;
            }

            /**
             * <p>The status of the configuration. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: enabled</li>
             * <li><strong>0</strong>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the data entry containing the AccessKey pair that you specify when you configure the scheduled AccessKey pair verification task.</p>
             * 
             * <strong>example:</strong>
             * <p>2308</p>
             */
            public Builder targetId(Long targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * <p>The service provider of the cloud asset. Valid values:</p>
             * <ul>
             * <li><strong>3</strong>: Tencent Cloud</li>
             * <li><strong>4</strong>: Huawei Cloud</li>
             * <li><strong>7</strong>: Amazon Web Services (AWS) Cloud</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
