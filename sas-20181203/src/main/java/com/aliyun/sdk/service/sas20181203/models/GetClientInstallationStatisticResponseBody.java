// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClientInstallationStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>GetClientInstallationStatisticResponseBody</p>
 */
public class GetClientInstallationStatisticResponseBody extends TeaModel {
    @NameInMap("ClientInstallRatio")
    private ClientInstallRatio clientInstallRatio;

    @NameInMap("RequestId")
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
         * The statistics on the client installation rate.
         */
        public Builder clientInstallRatio(ClientInstallRatio clientInstallRatio) {
            this.clientInstallRatio = clientInstallRatio;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetClientInstallationStatisticResponseBody build() {
            return new GetClientInstallationStatisticResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("AssetTotalCount")
        private Integer assetTotalCount;

        @NameInMap("CalculateTime")
        private Long calculateTime;

        @NameInMap("InstallRatio")
        private Double installRatio;

        @NameInMap("InstalledAssetCount")
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
             * The total number of cloud assets.
             */
            public Builder assetTotalCount(Integer assetTotalCount) {
                this.assetTotalCount = assetTotalCount;
                return this;
            }

            /**
             * The timestamp of the calculation. Unit: millisecond.
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
        @NameInMap("Items")
        private java.util.List < Items> items;

        @NameInMap("Vendor")
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
             * The current statistics on the installation rate of the client.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            /**
             * The type of the cloud asset. Valid values:
             * <p>
             * 
             * *   **0**: a cloud asset provided by Alibaba Cloud.
             * *   **1**: a third-party cloud asset
             * *   **2**: an asset in a data center
             * *   **3**, **4**, **5**, and **7**: other cloud asset
             * *   **8**: a lightweight cloud asset
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
        @NameInMap("AssetTotalCount")
        private Integer assetTotalCount;

        @NameInMap("CalculateTime")
        private Long calculateTime;

        @NameInMap("InstallRatio")
        private Double installRatio;

        @NameInMap("InstalledAssetCount")
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
             * The total number of cloud assets.
             */
            public Builder assetTotalCount(Integer assetTotalCount) {
                this.assetTotalCount = assetTotalCount;
                return this;
            }

            /**
             * The timestamp of the calculation. Unit: millisecond.
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
             * The number of cloud assets on which the client is installed.
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
        @NameInMap("Items")
        private java.util.List < HistoryItemsItems> items;

        @NameInMap("Vendor")
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
             * The statistics on the client installation rate.
             */
            public Builder items(java.util.List < HistoryItemsItems> items) {
                this.items = items;
                return this;
            }

            /**
             * The type of the cloud asset. Valid values:
             * <p>
             * 
             * *   **0**: a cloud asset provided by Alibaba Cloud.
             * *   **1**: a third-party cloud asset
             * *   **2**: an asset in a data center
             * *   **3**, **4**, **5**, and **7**: other cloud asset
             * *   **8**: a lightweight cloud asset
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
        @NameInMap("CurrentItems")
        private java.util.List < CurrentItems> currentItems;

        @NameInMap("Dates")
        private java.util.List < Long > dates;

        @NameInMap("HistoryItems")
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
             * The current statistics on the installation rate of the client.
             */
            public Builder currentItems(java.util.List < CurrentItems> currentItems) {
                this.currentItems = currentItems;
                return this;
            }

            /**
             * The time when statistics were collected.
             */
            public Builder dates(java.util.List < Long > dates) {
                this.dates = dates;
                return this;
            }

            /**
             * The historical statistics on the installation rate of the agent.
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
