// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClientRatioStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>GetClientRatioStatisticResponseBody</p>
 */
public class GetClientRatioStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClientInstallRatio")
    private ClientInstallRatio clientInstallRatio;

    @com.aliyun.core.annotation.NameInMap("ClientOnlineRatio")
    private ClientOnlineRatio clientOnlineRatio;

    @com.aliyun.core.annotation.NameInMap("Dates")
    private java.util.List < Long > dates;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetClientRatioStatisticResponseBody(Builder builder) {
        this.clientInstallRatio = builder.clientInstallRatio;
        this.clientOnlineRatio = builder.clientOnlineRatio;
        this.dates = builder.dates;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClientRatioStatisticResponseBody create() {
        return builder().build();
    }

    /**
     * @return clientInstallRatio
     */
    public ClientInstallRatio getClientInstallRatio() {
        return this.clientInstallRatio;
    }

    /**
     * @return clientOnlineRatio
     */
    public ClientOnlineRatio getClientOnlineRatio() {
        return this.clientOnlineRatio;
    }

    /**
     * @return dates
     */
    public java.util.List < Long > getDates() {
        return this.dates;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ClientInstallRatio clientInstallRatio; 
        private ClientOnlineRatio clientOnlineRatio; 
        private java.util.List < Long > dates; 
        private String requestId; 

        /**
         * The statistics on the client installation rate.
         */
        public Builder clientInstallRatio(ClientInstallRatio clientInstallRatio) {
            this.clientInstallRatio = clientInstallRatio;
            return this;
        }

        /**
         * The statistics on the client online rate.
         */
        public Builder clientOnlineRatio(ClientOnlineRatio clientOnlineRatio) {
            this.clientOnlineRatio = clientOnlineRatio;
            return this;
        }

        /**
         * The list of time when statistics were collected.
         */
        public Builder dates(java.util.List < Long > dates) {
            this.dates = dates;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetClientRatioStatisticResponseBody build() {
            return new GetClientRatioStatisticResponseBody(this);
        } 

    } 

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
             * The total number of assets.
             */
            public Builder assetTotalCount(Integer assetTotalCount) {
                this.assetTotalCount = assetTotalCount;
                return this;
            }

            /**
             * The timestamp of the calculation. Unit: milliseconds.
             */
            public Builder calculateTime(Long calculateTime) {
                this.calculateTime = calculateTime;
                return this;
            }

            /**
             * The installation rate. Unit: %.
             */
            public Builder installRatio(Double installRatio) {
                this.installRatio = installRatio;
                return this;
            }

            /**
             * The number of assets on which the client is installed.
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
             * The list of the statistics on the installation rate of the client by vendor.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            /**
             * The type of the server. Valid values:
             * <p>
             * 
             * *   **0**: an asset provided by Alibaba Cloud
             * *   **1**: a third-party cloud asset
             * *   **2**: an asset in a data center
             * *   **3**, **4**, **5**, and **7**: other cloud asset
             * *   **8**: a lightweight asset
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
             * The total number of assets.
             */
            public Builder assetTotalCount(Integer assetTotalCount) {
                this.assetTotalCount = assetTotalCount;
                return this;
            }

            /**
             * The timestamp of the calculation. Unit: milliseconds.
             */
            public Builder calculateTime(Long calculateTime) {
                this.calculateTime = calculateTime;
                return this;
            }

            /**
             * The installation rate. Unit: %.
             */
            public Builder installRatio(Double installRatio) {
                this.installRatio = installRatio;
                return this;
            }

            /**
             * The number of assets on which the client is installed.
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
             * The list of statistics on the client installation rate.
             */
            public Builder items(java.util.List < HistoryItemsItems> items) {
                this.items = items;
                return this;
            }

            /**
             * The type of the cloud asset. Valid values:
             * <p>
             * 
             * *   **0**: an asset provided by Alibaba Cloud
             * *   **1**: a third-party cloud asset
             * *   **2**: an asset in a data center
             * *   **3**, **4**, **5**, and **7**: other cloud asset
             * *   **8**: a simple application server
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
    public static class ClientInstallRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentItems")
        private java.util.List < CurrentItems> currentItems;

        @com.aliyun.core.annotation.NameInMap("HistoryItems")
        private java.util.List < HistoryItems> historyItems;

        private ClientInstallRatio(Builder builder) {
            this.currentItems = builder.currentItems;
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
         * @return historyItems
         */
        public java.util.List < HistoryItems> getHistoryItems() {
            return this.historyItems;
        }

        public static final class Builder {
            private java.util.List < CurrentItems> currentItems; 
            private java.util.List < HistoryItems> historyItems; 

            /**
             * The list of current statistics on the installation rate of the client.
             */
            public Builder currentItems(java.util.List < CurrentItems> currentItems) {
                this.currentItems = currentItems;
                return this;
            }

            /**
             * The list of historical statistics on the installation rate of the client.
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
    public static class CurrentItemsItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetInstallCount")
        private Integer assetInstallCount;

        @com.aliyun.core.annotation.NameInMap("CalculateTime")
        private Long calculateTime;

        @com.aliyun.core.annotation.NameInMap("OnlineAssetCount")
        private Integer onlineAssetCount;

        @com.aliyun.core.annotation.NameInMap("OnlineRatio")
        private Double onlineRatio;

        private CurrentItemsItems(Builder builder) {
            this.assetInstallCount = builder.assetInstallCount;
            this.calculateTime = builder.calculateTime;
            this.onlineAssetCount = builder.onlineAssetCount;
            this.onlineRatio = builder.onlineRatio;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CurrentItemsItems create() {
            return builder().build();
        }

        /**
         * @return assetInstallCount
         */
        public Integer getAssetInstallCount() {
            return this.assetInstallCount;
        }

        /**
         * @return calculateTime
         */
        public Long getCalculateTime() {
            return this.calculateTime;
        }

        /**
         * @return onlineAssetCount
         */
        public Integer getOnlineAssetCount() {
            return this.onlineAssetCount;
        }

        /**
         * @return onlineRatio
         */
        public Double getOnlineRatio() {
            return this.onlineRatio;
        }

        public static final class Builder {
            private Integer assetInstallCount; 
            private Long calculateTime; 
            private Integer onlineAssetCount; 
            private Double onlineRatio; 

            /**
             * The number of assets on which the client is installed.
             */
            public Builder assetInstallCount(Integer assetInstallCount) {
                this.assetInstallCount = assetInstallCount;
                return this;
            }

            /**
             * The timestamp of the calculation. Unit: milliseconds.
             */
            public Builder calculateTime(Long calculateTime) {
                this.calculateTime = calculateTime;
                return this;
            }

            /**
             * The number of online assets.
             */
            public Builder onlineAssetCount(Integer onlineAssetCount) {
                this.onlineAssetCount = onlineAssetCount;
                return this;
            }

            /**
             * The online rate. Unit: %.
             */
            public Builder onlineRatio(Double onlineRatio) {
                this.onlineRatio = onlineRatio;
                return this;
            }

            public CurrentItemsItems build() {
                return new CurrentItemsItems(this);
            } 

        } 

    }
    public static class ClientOnlineRatioCurrentItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List < CurrentItemsItems> items;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private Long vendor;

        private ClientOnlineRatioCurrentItems(Builder builder) {
            this.items = builder.items;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientOnlineRatioCurrentItems create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List < CurrentItemsItems> getItems() {
            return this.items;
        }

        /**
         * @return vendor
         */
        public Long getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private java.util.List < CurrentItemsItems> items; 
            private Long vendor; 

            /**
             * The list of current statistics on the online rate of the client by vendor.
             */
            public Builder items(java.util.List < CurrentItemsItems> items) {
                this.items = items;
                return this;
            }

            /**
             * The type of the cloud asset. Valid values:
             * <p>
             * 
             * *   **0**: an asset provided by Alibaba Cloud
             * *   **1**: a third-party cloud asset
             * *   **2**: an asset in a data center
             * *   **3**, **4**, **5**, and **7**: other cloud asset
             * *   **8**: a simple application server
             */
            public Builder vendor(Long vendor) {
                this.vendor = vendor;
                return this;
            }

            public ClientOnlineRatioCurrentItems build() {
                return new ClientOnlineRatioCurrentItems(this);
            } 

        } 

    }
    public static class ClientOnlineRatioHistoryItemsItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetInstallCount")
        private Integer assetInstallCount;

        @com.aliyun.core.annotation.NameInMap("CalculateTime")
        private Long calculateTime;

        @com.aliyun.core.annotation.NameInMap("OnlineAssetCount")
        private Integer onlineAssetCount;

        @com.aliyun.core.annotation.NameInMap("OnlineRatio")
        private Double onlineRatio;

        private ClientOnlineRatioHistoryItemsItems(Builder builder) {
            this.assetInstallCount = builder.assetInstallCount;
            this.calculateTime = builder.calculateTime;
            this.onlineAssetCount = builder.onlineAssetCount;
            this.onlineRatio = builder.onlineRatio;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientOnlineRatioHistoryItemsItems create() {
            return builder().build();
        }

        /**
         * @return assetInstallCount
         */
        public Integer getAssetInstallCount() {
            return this.assetInstallCount;
        }

        /**
         * @return calculateTime
         */
        public Long getCalculateTime() {
            return this.calculateTime;
        }

        /**
         * @return onlineAssetCount
         */
        public Integer getOnlineAssetCount() {
            return this.onlineAssetCount;
        }

        /**
         * @return onlineRatio
         */
        public Double getOnlineRatio() {
            return this.onlineRatio;
        }

        public static final class Builder {
            private Integer assetInstallCount; 
            private Long calculateTime; 
            private Integer onlineAssetCount; 
            private Double onlineRatio; 

            /**
             * The number of assets on which the client is installed.
             */
            public Builder assetInstallCount(Integer assetInstallCount) {
                this.assetInstallCount = assetInstallCount;
                return this;
            }

            /**
             * The timestamp of the calculation. Unit: milliseconds.
             */
            public Builder calculateTime(Long calculateTime) {
                this.calculateTime = calculateTime;
                return this;
            }

            /**
             * The number of online assets.
             */
            public Builder onlineAssetCount(Integer onlineAssetCount) {
                this.onlineAssetCount = onlineAssetCount;
                return this;
            }

            /**
             * The online rate. Unit: %.
             */
            public Builder onlineRatio(Double onlineRatio) {
                this.onlineRatio = onlineRatio;
                return this;
            }

            public ClientOnlineRatioHistoryItemsItems build() {
                return new ClientOnlineRatioHistoryItemsItems(this);
            } 

        } 

    }
    public static class ClientOnlineRatioHistoryItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List < ClientOnlineRatioHistoryItemsItems> items;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private Long vendor;

        private ClientOnlineRatioHistoryItems(Builder builder) {
            this.items = builder.items;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientOnlineRatioHistoryItems create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List < ClientOnlineRatioHistoryItemsItems> getItems() {
            return this.items;
        }

        /**
         * @return vendor
         */
        public Long getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private java.util.List < ClientOnlineRatioHistoryItemsItems> items; 
            private Long vendor; 

            /**
             * The list of historical statistics on the online rate of the client by vendor.
             */
            public Builder items(java.util.List < ClientOnlineRatioHistoryItemsItems> items) {
                this.items = items;
                return this;
            }

            /**
             * The type of the server. Valid values:
             * <p>
             * 
             * *   **0**: an asset provided by Alibaba Cloud
             * *   **1**: a third-party cloud asset
             * *   **2**: an asset in a data center
             * *   **3**, **4**, **5**, and **7**: other cloud asset
             * *   **8**: a lightweight asset
             */
            public Builder vendor(Long vendor) {
                this.vendor = vendor;
                return this;
            }

            public ClientOnlineRatioHistoryItems build() {
                return new ClientOnlineRatioHistoryItems(this);
            } 

        } 

    }
    public static class ClientOnlineRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentItems")
        private java.util.List < ClientOnlineRatioCurrentItems> currentItems;

        @com.aliyun.core.annotation.NameInMap("HistoryItems")
        private java.util.List < ClientOnlineRatioHistoryItems> historyItems;

        private ClientOnlineRatio(Builder builder) {
            this.currentItems = builder.currentItems;
            this.historyItems = builder.historyItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientOnlineRatio create() {
            return builder().build();
        }

        /**
         * @return currentItems
         */
        public java.util.List < ClientOnlineRatioCurrentItems> getCurrentItems() {
            return this.currentItems;
        }

        /**
         * @return historyItems
         */
        public java.util.List < ClientOnlineRatioHistoryItems> getHistoryItems() {
            return this.historyItems;
        }

        public static final class Builder {
            private java.util.List < ClientOnlineRatioCurrentItems> currentItems; 
            private java.util.List < ClientOnlineRatioHistoryItems> historyItems; 

            /**
             * The list of current statistics on the online rate of the client.
             */
            public Builder currentItems(java.util.List < ClientOnlineRatioCurrentItems> currentItems) {
                this.currentItems = currentItems;
                return this;
            }

            /**
             * The list of historical statistics on the online rate of the client.
             */
            public Builder historyItems(java.util.List < ClientOnlineRatioHistoryItems> historyItems) {
                this.historyItems = historyItems;
                return this;
            }

            public ClientOnlineRatio build() {
                return new ClientOnlineRatio(this);
            } 

        } 

    }
}
