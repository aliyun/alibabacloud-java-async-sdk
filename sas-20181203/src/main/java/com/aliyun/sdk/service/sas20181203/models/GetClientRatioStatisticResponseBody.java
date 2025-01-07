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
    private java.util.List<Long> dates;

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
    public java.util.List<Long> getDates() {
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
        private java.util.List<Long> dates; 
        private String requestId; 

        /**
         * <p>The statistics on the client installation rate.</p>
         */
        public Builder clientInstallRatio(ClientInstallRatio clientInstallRatio) {
            this.clientInstallRatio = clientInstallRatio;
            return this;
        }

        /**
         * <p>The statistics on the client online rate.</p>
         */
        public Builder clientOnlineRatio(ClientOnlineRatio clientOnlineRatio) {
            this.clientOnlineRatio = clientOnlineRatio;
            return this;
        }

        /**
         * <p>The list of time when statistics were collected.</p>
         */
        public Builder dates(java.util.List<Long> dates) {
            this.dates = dates;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A4EB8B1C-1DEC-5E18-BCD0-D1BBB3936FA7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetClientRatioStatisticResponseBody build() {
            return new GetClientRatioStatisticResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetClientRatioStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>GetClientRatioStatisticResponseBody</p>
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
             * <p>The total number of assets.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder assetTotalCount(Integer assetTotalCount) {
                this.assetTotalCount = assetTotalCount;
                return this;
            }

            /**
             * <p>The timestamp of the calculation. Unit: milliseconds.</p>
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
     * {@link GetClientRatioStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>GetClientRatioStatisticResponseBody</p>
     */
    public static class CurrentItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<Items> items;

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
        public java.util.List<Items> getItems() {
            return this.items;
        }

        /**
         * @return vendor
         */
        public Long getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private java.util.List<Items> items; 
            private Long vendor; 

            /**
             * <p>The list of the statistics on the installation rate of the client by vendor.</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The type of the server. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: an asset provided by Alibaba Cloud</li>
             * <li><strong>1</strong>: a third-party cloud asset</li>
             * <li><strong>2</strong>: an asset in a data center</li>
             * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, and <strong>7</strong>: other cloud asset</li>
             * <li><strong>8</strong>: a lightweight asset</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
     * {@link GetClientRatioStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>GetClientRatioStatisticResponseBody</p>
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
             * <p>The total number of assets.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder assetTotalCount(Integer assetTotalCount) {
                this.assetTotalCount = assetTotalCount;
                return this;
            }

            /**
             * <p>The timestamp of the calculation. Unit: milliseconds.</p>
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
             * <p>The number of assets on which the client is installed.</p>
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
     * {@link GetClientRatioStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>GetClientRatioStatisticResponseBody</p>
     */
    public static class HistoryItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<HistoryItemsItems> items;

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
        public java.util.List<HistoryItemsItems> getItems() {
            return this.items;
        }

        /**
         * @return vendor
         */
        public Long getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private java.util.List<HistoryItemsItems> items; 
            private Long vendor; 

            /**
             * <p>The list of statistics on the client installation rate.</p>
             */
            public Builder items(java.util.List<HistoryItemsItems> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The type of the cloud asset. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: an asset provided by Alibaba Cloud</li>
             * <li><strong>1</strong>: a third-party cloud asset</li>
             * <li><strong>2</strong>: an asset in a data center</li>
             * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, and <strong>7</strong>: other cloud asset</li>
             * <li><strong>8</strong>: a simple application server</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
     * {@link GetClientRatioStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>GetClientRatioStatisticResponseBody</p>
     */
    public static class ClientInstallRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentItems")
        private java.util.List<CurrentItems> currentItems;

        @com.aliyun.core.annotation.NameInMap("HistoryItems")
        private java.util.List<HistoryItems> historyItems;

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
        public java.util.List<CurrentItems> getCurrentItems() {
            return this.currentItems;
        }

        /**
         * @return historyItems
         */
        public java.util.List<HistoryItems> getHistoryItems() {
            return this.historyItems;
        }

        public static final class Builder {
            private java.util.List<CurrentItems> currentItems; 
            private java.util.List<HistoryItems> historyItems; 

            /**
             * <p>The list of current statistics on the installation rate of the client.</p>
             */
            public Builder currentItems(java.util.List<CurrentItems> currentItems) {
                this.currentItems = currentItems;
                return this;
            }

            /**
             * <p>The list of historical statistics on the installation rate of the client.</p>
             */
            public Builder historyItems(java.util.List<HistoryItems> historyItems) {
                this.historyItems = historyItems;
                return this;
            }

            public ClientInstallRatio build() {
                return new ClientInstallRatio(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetClientRatioStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>GetClientRatioStatisticResponseBody</p>
     */
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
             * <p>The number of assets on which the client is installed.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder assetInstallCount(Integer assetInstallCount) {
                this.assetInstallCount = assetInstallCount;
                return this;
            }

            /**
             * <p>The timestamp of the calculation. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1687759630045</p>
             */
            public Builder calculateTime(Long calculateTime) {
                this.calculateTime = calculateTime;
                return this;
            }

            /**
             * <p>The number of online assets.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder onlineAssetCount(Integer onlineAssetCount) {
                this.onlineAssetCount = onlineAssetCount;
                return this;
            }

            /**
             * <p>The online rate. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>20.00</p>
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
    /**
     * 
     * {@link GetClientRatioStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>GetClientRatioStatisticResponseBody</p>
     */
    public static class ClientOnlineRatioCurrentItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<CurrentItemsItems> items;

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
        public java.util.List<CurrentItemsItems> getItems() {
            return this.items;
        }

        /**
         * @return vendor
         */
        public Long getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private java.util.List<CurrentItemsItems> items; 
            private Long vendor; 

            /**
             * <p>The list of current statistics on the online rate of the client by vendor.</p>
             */
            public Builder items(java.util.List<CurrentItemsItems> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The type of the cloud asset. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: an asset provided by Alibaba Cloud</li>
             * <li><strong>1</strong>: a third-party cloud asset</li>
             * <li><strong>2</strong>: an asset in a data center</li>
             * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, and <strong>7</strong>: other cloud asset</li>
             * <li><strong>8</strong>: a simple application server</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
    /**
     * 
     * {@link GetClientRatioStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>GetClientRatioStatisticResponseBody</p>
     */
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
             * <p>The number of assets on which the client is installed.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder assetInstallCount(Integer assetInstallCount) {
                this.assetInstallCount = assetInstallCount;
                return this;
            }

            /**
             * <p>The timestamp of the calculation. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1687759630045</p>
             */
            public Builder calculateTime(Long calculateTime) {
                this.calculateTime = calculateTime;
                return this;
            }

            /**
             * <p>The number of online assets.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder onlineAssetCount(Integer onlineAssetCount) {
                this.onlineAssetCount = onlineAssetCount;
                return this;
            }

            /**
             * <p>The online rate. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>40.00</p>
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
    /**
     * 
     * {@link GetClientRatioStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>GetClientRatioStatisticResponseBody</p>
     */
    public static class ClientOnlineRatioHistoryItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<ClientOnlineRatioHistoryItemsItems> items;

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
        public java.util.List<ClientOnlineRatioHistoryItemsItems> getItems() {
            return this.items;
        }

        /**
         * @return vendor
         */
        public Long getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private java.util.List<ClientOnlineRatioHistoryItemsItems> items; 
            private Long vendor; 

            /**
             * <p>The list of historical statistics on the online rate of the client by vendor.</p>
             */
            public Builder items(java.util.List<ClientOnlineRatioHistoryItemsItems> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The type of the server. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: an asset provided by Alibaba Cloud</li>
             * <li><strong>1</strong>: a third-party cloud asset</li>
             * <li><strong>2</strong>: an asset in a data center</li>
             * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, and <strong>7</strong>: other cloud asset</li>
             * <li><strong>8</strong>: a lightweight asset</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>7</p>
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
    /**
     * 
     * {@link GetClientRatioStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>GetClientRatioStatisticResponseBody</p>
     */
    public static class ClientOnlineRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentItems")
        private java.util.List<ClientOnlineRatioCurrentItems> currentItems;

        @com.aliyun.core.annotation.NameInMap("HistoryItems")
        private java.util.List<ClientOnlineRatioHistoryItems> historyItems;

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
        public java.util.List<ClientOnlineRatioCurrentItems> getCurrentItems() {
            return this.currentItems;
        }

        /**
         * @return historyItems
         */
        public java.util.List<ClientOnlineRatioHistoryItems> getHistoryItems() {
            return this.historyItems;
        }

        public static final class Builder {
            private java.util.List<ClientOnlineRatioCurrentItems> currentItems; 
            private java.util.List<ClientOnlineRatioHistoryItems> historyItems; 

            /**
             * <p>The list of current statistics on the online rate of the client.</p>
             */
            public Builder currentItems(java.util.List<ClientOnlineRatioCurrentItems> currentItems) {
                this.currentItems = currentItems;
                return this;
            }

            /**
             * <p>The list of historical statistics on the online rate of the client.</p>
             */
            public Builder historyItems(java.util.List<ClientOnlineRatioHistoryItems> historyItems) {
                this.historyItems = historyItems;
                return this;
            }

            public ClientOnlineRatio build() {
                return new ClientOnlineRatio(this);
            } 

        } 

    }
}
