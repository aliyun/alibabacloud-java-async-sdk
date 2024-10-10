// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetClientInstallationStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>GetClientInstallationStatisticResponseBody</p>
 */
public class GetClientInstallationStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClientInstallRatio")
    private ClientInstallRatio clientInstallRatio;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetClientInstallationStatisticResponseBody(Builder builder) {
        this.clientInstallRatio = builder.clientInstallRatio;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClientInstallationStatisticResponseBody create() {
        return builder().build();
    }

    /**
     * @return clientInstallRatio
     */
    public ClientInstallRatio getClientInstallRatio() {
        return this.clientInstallRatio;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ClientInstallRatio clientInstallRatio; 
        private String requestId; 

        /**
         * <p>The statistics on the client installation rate.</p>
         */
        public Builder clientInstallRatio(ClientInstallRatio clientInstallRatio) {
            this.clientInstallRatio = clientInstallRatio;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F62DD457-2588-589A-B1F6-A1245895D2AB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetClientInstallationStatisticResponseBody build() {
            return new GetClientInstallationStatisticResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetClientInstallationStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>GetClientInstallationStatisticResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetTotalCount")
        private Integer assetTotalCount;

        @com.aliyun.core.annotation.NameInMap("CalculateTime")
        private Long calculateTime;

        @com.aliyun.core.annotation.NameInMap("InstallRatio")
        private Double installRatio;

        @com.aliyun.core.annotation.NameInMap("InstalledAssetCount")
        private Integer installedAssetCount;

        private Items(Builder builder) {
            this.assetTotalCount = builder.assetTotalCount;
            this.calculateTime = builder.calculateTime;
            this.installRatio = builder.installRatio;
            this.installedAssetCount = builder.installedAssetCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return assetTotalCount
         */
        public Integer getAssetTotalCount() {
            return this.assetTotalCount;
        }

        /**
         * @return calculateTime
         */
        public Long getCalculateTime() {
            return this.calculateTime;
        }

        /**
         * @return installRatio
         */
        public Double getInstallRatio() {
            return this.installRatio;
        }

        /**
         * @return installedAssetCount
         */
        public Integer getInstalledAssetCount() {
            return this.installedAssetCount;
        }

        public static final class Builder {
            private Integer assetTotalCount; 
            private Long calculateTime; 
            private Double installRatio; 
            private Integer installedAssetCount; 

            /**
             * <p>The total number of cloud assets.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder assetTotalCount(Integer assetTotalCount) {
                this.assetTotalCount = assetTotalCount;
                return this;
            }

            /**
             * <p>The timestamp of the calculation. Unit: millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>1687759630045</p>
             */
            public Builder calculateTime(Long calculateTime) {
                this.calculateTime = calculateTime;
                return this;
            }

            /**
             * <p>The installation rate. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>70.00</p>
             */
            public Builder installRatio(Double installRatio) {
                this.installRatio = installRatio;
                return this;
            }

            /**
             * <p>The number of assets on which the client is installed.</p>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder installedAssetCount(Integer installedAssetCount) {
                this.installedAssetCount = installedAssetCount;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetClientInstallationStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>GetClientInstallationStatisticResponseBody</p>
     */
    public static class CurrentItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List < Items> items;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private Long vendor;

        private CurrentItems(Builder builder) {
            this.items = builder.items;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CurrentItems create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List < Items> getItems() {
            return this.items;
        }

        /**
         * @return vendor
         */
        public Long getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private java.util.List < Items> items; 
            private Long vendor; 

            /**
             * <p>The current statistics on the installation rate of the client.</p>
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The type of the cloud asset. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: a cloud asset provided by Alibaba Cloud.</li>
             * <li><strong>1</strong>: a third-party cloud asset</li>
             * <li><strong>2</strong>: an asset in a data center</li>
             * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, and <strong>7</strong>: other cloud asset</li>
             * <li><strong>8</strong>: a lightweight cloud asset</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder vendor(Long vendor) {
                this.vendor = vendor;
                return this;
            }

            public CurrentItems build() {
                return new CurrentItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetClientInstallationStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>GetClientInstallationStatisticResponseBody</p>
     */
    public static class HistoryItemsItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetTotalCount")
        private Integer assetTotalCount;

        @com.aliyun.core.annotation.NameInMap("CalculateTime")
        private Long calculateTime;

        @com.aliyun.core.annotation.NameInMap("InstallRatio")
        private Double installRatio;

        @com.aliyun.core.annotation.NameInMap("InstalledAssetCount")
        private Integer installedAssetCount;

        private HistoryItemsItems(Builder builder) {
            this.assetTotalCount = builder.assetTotalCount;
            this.calculateTime = builder.calculateTime;
            this.installRatio = builder.installRatio;
            this.installedAssetCount = builder.installedAssetCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HistoryItemsItems create() {
            return builder().build();
        }

        /**
         * @return assetTotalCount
         */
        public Integer getAssetTotalCount() {
            return this.assetTotalCount;
        }

        /**
         * @return calculateTime
         */
        public Long getCalculateTime() {
            return this.calculateTime;
        }

        /**
         * @return installRatio
         */
        public Double getInstallRatio() {
            return this.installRatio;
        }

        /**
         * @return installedAssetCount
         */
        public Integer getInstalledAssetCount() {
            return this.installedAssetCount;
        }

        public static final class Builder {
            private Integer assetTotalCount; 
            private Long calculateTime; 
            private Double installRatio; 
            private Integer installedAssetCount; 

            /**
             * <p>The total number of cloud assets.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder assetTotalCount(Integer assetTotalCount) {
                this.assetTotalCount = assetTotalCount;
                return this;
            }

            /**
             * <p>The timestamp of the calculation. Unit: millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>1687759630045</p>
             */
            public Builder calculateTime(Long calculateTime) {
                this.calculateTime = calculateTime;
                return this;
            }

            /**
             * <p>The installation rate. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>80.00</p>
             */
            public Builder installRatio(Double installRatio) {
                this.installRatio = installRatio;
                return this;
            }

            /**
             * <p>The number of cloud assets on which the client is installed.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder installedAssetCount(Integer installedAssetCount) {
                this.installedAssetCount = installedAssetCount;
                return this;
            }

            public HistoryItemsItems build() {
                return new HistoryItemsItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetClientInstallationStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>GetClientInstallationStatisticResponseBody</p>
     */
    public static class HistoryItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List < HistoryItemsItems> items;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private Long vendor;

        private HistoryItems(Builder builder) {
            this.items = builder.items;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HistoryItems create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List < HistoryItemsItems> getItems() {
            return this.items;
        }

        /**
         * @return vendor
         */
        public Long getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private java.util.List < HistoryItemsItems> items; 
            private Long vendor; 

            /**
             * <p>The statistics on the client installation rate.</p>
             */
            public Builder items(java.util.List < HistoryItemsItems> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The type of the cloud asset. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: a cloud asset provided by Alibaba Cloud.</li>
             * <li><strong>1</strong>: a third-party cloud asset</li>
             * <li><strong>2</strong>: an asset in a data center</li>
             * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, and <strong>7</strong>: other cloud asset</li>
             * <li><strong>8</strong>: a lightweight cloud asset</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder vendor(Long vendor) {
                this.vendor = vendor;
                return this;
            }

            public HistoryItems build() {
                return new HistoryItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetClientInstallationStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>GetClientInstallationStatisticResponseBody</p>
     */
    public static class ClientInstallRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentItems")
        private java.util.List < CurrentItems> currentItems;

        @com.aliyun.core.annotation.NameInMap("Dates")
        private java.util.List < Long > dates;

        @com.aliyun.core.annotation.NameInMap("HistoryItems")
        private java.util.List < HistoryItems> historyItems;

        private ClientInstallRatio(Builder builder) {
            this.currentItems = builder.currentItems;
            this.dates = builder.dates;
            this.historyItems = builder.historyItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientInstallRatio create() {
            return builder().build();
        }

        /**
         * @return currentItems
         */
        public java.util.List < CurrentItems> getCurrentItems() {
            return this.currentItems;
        }

        /**
         * @return dates
         */
        public java.util.List < Long > getDates() {
            return this.dates;
        }

        /**
         * @return historyItems
         */
        public java.util.List < HistoryItems> getHistoryItems() {
            return this.historyItems;
        }

        public static final class Builder {
            private java.util.List < CurrentItems> currentItems; 
            private java.util.List < Long > dates; 
            private java.util.List < HistoryItems> historyItems; 

            /**
             * <p>The current statistics on the installation rate of the client.</p>
             */
            public Builder currentItems(java.util.List < CurrentItems> currentItems) {
                this.currentItems = currentItems;
                return this;
            }

            /**
             * <p>The time when statistics were collected.</p>
             */
            public Builder dates(java.util.List < Long > dates) {
                this.dates = dates;
                return this;
            }

            /**
             * <p>The historical statistics on the installation rate of the agent.</p>
             */
            public Builder historyItems(java.util.List < HistoryItems> historyItems) {
                this.historyItems = historyItems;
                return this;
            }

            public ClientInstallRatio build() {
                return new ClientInstallRatio(this);
            } 

        } 

    }
}
