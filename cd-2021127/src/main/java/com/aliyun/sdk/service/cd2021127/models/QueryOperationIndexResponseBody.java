// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cd2021127.models;

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
 * {@link QueryOperationIndexResponseBody} extends {@link TeaModel}
 *
 * <p>QueryOperationIndexResponseBody</p>
 */
public class QueryOperationIndexResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryOperationIndexResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOperationIndexResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryOperationIndexResponseBody build() {
            return new QueryOperationIndexResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryOperationIndexResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOperationIndexResponseBody</p>
     */
    public static class DeviceIndex extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CpuAverage")
        private Integer cpuAverage;

        @com.aliyun.core.annotation.NameInMap("FaultDeviceNum")
        private Integer faultDeviceNum;

        @com.aliyun.core.annotation.NameInMap("HighFreqFaultDeviceNum")
        private Integer highFreqFaultDeviceNum;

        @com.aliyun.core.annotation.NameInMap("NetworkTraffic")
        private Integer networkTraffic;

        @com.aliyun.core.annotation.NameInMap("NormalDeviceNum")
        private Integer normalDeviceNum;

        @com.aliyun.core.annotation.NameInMap("OnlineNum")
        private Integer onlineNum;

        @com.aliyun.core.annotation.NameInMap("StorageAverage")
        private Integer storageAverage;

        @com.aliyun.core.annotation.NameInMap("TotalWorkingDeviceNum")
        private Integer totalWorkingDeviceNum;

        private DeviceIndex(Builder builder) {
            this.cpuAverage = builder.cpuAverage;
            this.faultDeviceNum = builder.faultDeviceNum;
            this.highFreqFaultDeviceNum = builder.highFreqFaultDeviceNum;
            this.networkTraffic = builder.networkTraffic;
            this.normalDeviceNum = builder.normalDeviceNum;
            this.onlineNum = builder.onlineNum;
            this.storageAverage = builder.storageAverage;
            this.totalWorkingDeviceNum = builder.totalWorkingDeviceNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceIndex create() {
            return builder().build();
        }

        /**
         * @return cpuAverage
         */
        public Integer getCpuAverage() {
            return this.cpuAverage;
        }

        /**
         * @return faultDeviceNum
         */
        public Integer getFaultDeviceNum() {
            return this.faultDeviceNum;
        }

        /**
         * @return highFreqFaultDeviceNum
         */
        public Integer getHighFreqFaultDeviceNum() {
            return this.highFreqFaultDeviceNum;
        }

        /**
         * @return networkTraffic
         */
        public Integer getNetworkTraffic() {
            return this.networkTraffic;
        }

        /**
         * @return normalDeviceNum
         */
        public Integer getNormalDeviceNum() {
            return this.normalDeviceNum;
        }

        /**
         * @return onlineNum
         */
        public Integer getOnlineNum() {
            return this.onlineNum;
        }

        /**
         * @return storageAverage
         */
        public Integer getStorageAverage() {
            return this.storageAverage;
        }

        /**
         * @return totalWorkingDeviceNum
         */
        public Integer getTotalWorkingDeviceNum() {
            return this.totalWorkingDeviceNum;
        }

        public static final class Builder {
            private Integer cpuAverage; 
            private Integer faultDeviceNum; 
            private Integer highFreqFaultDeviceNum; 
            private Integer networkTraffic; 
            private Integer normalDeviceNum; 
            private Integer onlineNum; 
            private Integer storageAverage; 
            private Integer totalWorkingDeviceNum; 

            /**
             * CpuAverage.
             */
            public Builder cpuAverage(Integer cpuAverage) {
                this.cpuAverage = cpuAverage;
                return this;
            }

            /**
             * FaultDeviceNum.
             */
            public Builder faultDeviceNum(Integer faultDeviceNum) {
                this.faultDeviceNum = faultDeviceNum;
                return this;
            }

            /**
             * HighFreqFaultDeviceNum.
             */
            public Builder highFreqFaultDeviceNum(Integer highFreqFaultDeviceNum) {
                this.highFreqFaultDeviceNum = highFreqFaultDeviceNum;
                return this;
            }

            /**
             * NetworkTraffic.
             */
            public Builder networkTraffic(Integer networkTraffic) {
                this.networkTraffic = networkTraffic;
                return this;
            }

            /**
             * NormalDeviceNum.
             */
            public Builder normalDeviceNum(Integer normalDeviceNum) {
                this.normalDeviceNum = normalDeviceNum;
                return this;
            }

            /**
             * OnlineNum.
             */
            public Builder onlineNum(Integer onlineNum) {
                this.onlineNum = onlineNum;
                return this;
            }

            /**
             * StorageAverage.
             */
            public Builder storageAverage(Integer storageAverage) {
                this.storageAverage = storageAverage;
                return this;
            }

            /**
             * TotalWorkingDeviceNum.
             */
            public Builder totalWorkingDeviceNum(Integer totalWorkingDeviceNum) {
                this.totalWorkingDeviceNum = totalWorkingDeviceNum;
                return this;
            }

            public DeviceIndex build() {
                return new DeviceIndex(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryOperationIndexResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOperationIndexResponseBody</p>
     */
    public static class ShopIndex extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FaultShopNum")
        private Integer faultShopNum;

        @com.aliyun.core.annotation.NameInMap("HighFreqFaultShopNum")
        private Integer highFreqFaultShopNum;

        @com.aliyun.core.annotation.NameInMap("InstalledShopNum")
        private Integer installedShopNum;

        @com.aliyun.core.annotation.NameInMap("NetWorkShopNum")
        private Integer netWorkShopNum;

        @com.aliyun.core.annotation.NameInMap("NormalShopNum")
        private Integer normalShopNum;

        @com.aliyun.core.annotation.NameInMap("NotWorkShopNum")
        private Integer notWorkShopNum;

        @com.aliyun.core.annotation.NameInMap("ShopTotal")
        private Integer shopTotal;

        @com.aliyun.core.annotation.NameInMap("UpholdShopNum")
        private Integer upholdShopNum;

        private ShopIndex(Builder builder) {
            this.faultShopNum = builder.faultShopNum;
            this.highFreqFaultShopNum = builder.highFreqFaultShopNum;
            this.installedShopNum = builder.installedShopNum;
            this.netWorkShopNum = builder.netWorkShopNum;
            this.normalShopNum = builder.normalShopNum;
            this.notWorkShopNum = builder.notWorkShopNum;
            this.shopTotal = builder.shopTotal;
            this.upholdShopNum = builder.upholdShopNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShopIndex create() {
            return builder().build();
        }

        /**
         * @return faultShopNum
         */
        public Integer getFaultShopNum() {
            return this.faultShopNum;
        }

        /**
         * @return highFreqFaultShopNum
         */
        public Integer getHighFreqFaultShopNum() {
            return this.highFreqFaultShopNum;
        }

        /**
         * @return installedShopNum
         */
        public Integer getInstalledShopNum() {
            return this.installedShopNum;
        }

        /**
         * @return netWorkShopNum
         */
        public Integer getNetWorkShopNum() {
            return this.netWorkShopNum;
        }

        /**
         * @return normalShopNum
         */
        public Integer getNormalShopNum() {
            return this.normalShopNum;
        }

        /**
         * @return notWorkShopNum
         */
        public Integer getNotWorkShopNum() {
            return this.notWorkShopNum;
        }

        /**
         * @return shopTotal
         */
        public Integer getShopTotal() {
            return this.shopTotal;
        }

        /**
         * @return upholdShopNum
         */
        public Integer getUpholdShopNum() {
            return this.upholdShopNum;
        }

        public static final class Builder {
            private Integer faultShopNum; 
            private Integer highFreqFaultShopNum; 
            private Integer installedShopNum; 
            private Integer netWorkShopNum; 
            private Integer normalShopNum; 
            private Integer notWorkShopNum; 
            private Integer shopTotal; 
            private Integer upholdShopNum; 

            /**
             * FaultShopNum.
             */
            public Builder faultShopNum(Integer faultShopNum) {
                this.faultShopNum = faultShopNum;
                return this;
            }

            /**
             * HighFreqFaultShopNum.
             */
            public Builder highFreqFaultShopNum(Integer highFreqFaultShopNum) {
                this.highFreqFaultShopNum = highFreqFaultShopNum;
                return this;
            }

            /**
             * InstalledShopNum.
             */
            public Builder installedShopNum(Integer installedShopNum) {
                this.installedShopNum = installedShopNum;
                return this;
            }

            /**
             * NetWorkShopNum.
             */
            public Builder netWorkShopNum(Integer netWorkShopNum) {
                this.netWorkShopNum = netWorkShopNum;
                return this;
            }

            /**
             * NormalShopNum.
             */
            public Builder normalShopNum(Integer normalShopNum) {
                this.normalShopNum = normalShopNum;
                return this;
            }

            /**
             * NotWorkShopNum.
             */
            public Builder notWorkShopNum(Integer notWorkShopNum) {
                this.notWorkShopNum = notWorkShopNum;
                return this;
            }

            /**
             * ShopTotal.
             */
            public Builder shopTotal(Integer shopTotal) {
                this.shopTotal = shopTotal;
                return this;
            }

            /**
             * UpholdShopNum.
             */
            public Builder upholdShopNum(Integer upholdShopNum) {
                this.upholdShopNum = upholdShopNum;
                return this;
            }

            public ShopIndex build() {
                return new ShopIndex(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryOperationIndexResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOperationIndexResponseBody</p>
     */
    public static class TicketIndex extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoRecoverRate")
        private Double autoRecoverRate;

        @com.aliyun.core.annotation.NameInMap("AutoRecoverTicketNum")
        private Integer autoRecoverTicketNum;

        @com.aliyun.core.annotation.NameInMap("OpenTicketNum")
        private Integer openTicketNum;

        @com.aliyun.core.annotation.NameInMap("RecoverRate")
        private Double recoverRate;

        @com.aliyun.core.annotation.NameInMap("TotalTicketNum")
        private Integer totalTicketNum;

        private TicketIndex(Builder builder) {
            this.autoRecoverRate = builder.autoRecoverRate;
            this.autoRecoverTicketNum = builder.autoRecoverTicketNum;
            this.openTicketNum = builder.openTicketNum;
            this.recoverRate = builder.recoverRate;
            this.totalTicketNum = builder.totalTicketNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TicketIndex create() {
            return builder().build();
        }

        /**
         * @return autoRecoverRate
         */
        public Double getAutoRecoverRate() {
            return this.autoRecoverRate;
        }

        /**
         * @return autoRecoverTicketNum
         */
        public Integer getAutoRecoverTicketNum() {
            return this.autoRecoverTicketNum;
        }

        /**
         * @return openTicketNum
         */
        public Integer getOpenTicketNum() {
            return this.openTicketNum;
        }

        /**
         * @return recoverRate
         */
        public Double getRecoverRate() {
            return this.recoverRate;
        }

        /**
         * @return totalTicketNum
         */
        public Integer getTotalTicketNum() {
            return this.totalTicketNum;
        }

        public static final class Builder {
            private Double autoRecoverRate; 
            private Integer autoRecoverTicketNum; 
            private Integer openTicketNum; 
            private Double recoverRate; 
            private Integer totalTicketNum; 

            /**
             * AutoRecoverRate.
             */
            public Builder autoRecoverRate(Double autoRecoverRate) {
                this.autoRecoverRate = autoRecoverRate;
                return this;
            }

            /**
             * AutoRecoverTicketNum.
             */
            public Builder autoRecoverTicketNum(Integer autoRecoverTicketNum) {
                this.autoRecoverTicketNum = autoRecoverTicketNum;
                return this;
            }

            /**
             * OpenTicketNum.
             */
            public Builder openTicketNum(Integer openTicketNum) {
                this.openTicketNum = openTicketNum;
                return this;
            }

            /**
             * RecoverRate.
             */
            public Builder recoverRate(Double recoverRate) {
                this.recoverRate = recoverRate;
                return this;
            }

            /**
             * TotalTicketNum.
             */
            public Builder totalTicketNum(Integer totalTicketNum) {
                this.totalTicketNum = totalTicketNum;
                return this;
            }

            public TicketIndex build() {
                return new TicketIndex(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryOperationIndexResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOperationIndexResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceIndex")
        private DeviceIndex deviceIndex;

        @com.aliyun.core.annotation.NameInMap("ShopIndex")
        private ShopIndex shopIndex;

        @com.aliyun.core.annotation.NameInMap("TicketIndex")
        private TicketIndex ticketIndex;

        private Data(Builder builder) {
            this.deviceIndex = builder.deviceIndex;
            this.shopIndex = builder.shopIndex;
            this.ticketIndex = builder.ticketIndex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deviceIndex
         */
        public DeviceIndex getDeviceIndex() {
            return this.deviceIndex;
        }

        /**
         * @return shopIndex
         */
        public ShopIndex getShopIndex() {
            return this.shopIndex;
        }

        /**
         * @return ticketIndex
         */
        public TicketIndex getTicketIndex() {
            return this.ticketIndex;
        }

        public static final class Builder {
            private DeviceIndex deviceIndex; 
            private ShopIndex shopIndex; 
            private TicketIndex ticketIndex; 

            /**
             * DeviceIndex.
             */
            public Builder deviceIndex(DeviceIndex deviceIndex) {
                this.deviceIndex = deviceIndex;
                return this;
            }

            /**
             * ShopIndex.
             */
            public Builder shopIndex(ShopIndex shopIndex) {
                this.shopIndex = shopIndex;
                return this;
            }

            /**
             * TicketIndex.
             */
            public Builder ticketIndex(TicketIndex ticketIndex) {
                this.ticketIndex = ticketIndex;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
