// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The asset synchronization configuration.</p>
         */
        public Builder assetRefreshConfig(java.util.List < AssetRefreshConfig> assetRefreshConfig) {
            this.assetRefreshConfig = assetRefreshConfig;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>D65AADFC-1D20-5A6A-8F6A-9FA53C0DC1F8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAssetRefreshTaskConfigResponseBody build() {
            return new ListAssetRefreshTaskConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAssetRefreshTaskConfigResponseBody} extends {@link TeaModel}
     *
     * <p>ListAssetRefreshTaskConfigResponseBody</p>
     */
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
             * <p>The type of the configuration. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: server synchronization task</li>
             * <li><strong>1</strong>: cloud service synchronization task</li>
             * <li><strong>2</strong>: scheduled AccessKey pair verification task</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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

            public AssetRefreshConfig build() {
                return new AssetRefreshConfig(this);
            } 

        } 

    }
}
