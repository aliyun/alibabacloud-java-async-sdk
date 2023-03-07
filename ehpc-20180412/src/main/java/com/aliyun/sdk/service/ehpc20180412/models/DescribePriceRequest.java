// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePriceRequest} extends {@link RequestModel}
 *
 * <p>DescribePriceRequest</p>
 */
public class DescribePriceRequest extends Request {
    @Query
    @NameInMap("ChargeType")
    private String chargeType;

    @Query
    @NameInMap("Commodities")
    @Validation(required = true)
    private java.util.List < Commodities> commodities;

    @Query
    @NameInMap("OrderType")
    private String orderType;

    @Query
    @NameInMap("PriceUnit")
    @Validation(required = true)
    private String priceUnit;

    private DescribePriceRequest(Builder builder) {
        super(builder);
        this.chargeType = builder.chargeType;
        this.commodities = builder.commodities;
        this.orderType = builder.orderType;
        this.priceUnit = builder.priceUnit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePriceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return commodities
     */
    public java.util.List < Commodities> getCommodities() {
        return this.commodities;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return priceUnit
     */
    public String getPriceUnit() {
        return this.priceUnit;
    }

    public static final class Builder extends Request.Builder<DescribePriceRequest, Builder> {
        private String chargeType; 
        private java.util.List < Commodities> commodities; 
        private String orderType; 
        private String priceUnit; 

        private Builder() {
            super();
        } 

        private Builder(DescribePriceRequest request) {
            super(request);
            this.chargeType = request.chargeType;
            this.commodities = request.commodities;
            this.orderType = request.orderType;
            this.priceUnit = request.priceUnit;
        } 

        /**
         * The billing method of the ECS instances. Valid values:
         * <p>
         * 
         * *   PostPaid: pay-as-you-go
         * *   PrePaid: subscription
         * 
         * Default value: PostPaid
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * Commodities.
         */
        public Builder commodities(java.util.List < Commodities> commodities) {
            this.putQueryParameter("Commodities", commodities);
            this.commodities = commodities;
            return this;
        }

        /**
         * The type of the order. The order can be set only as a purchase order. Valid value: INSTANCE-BUY.
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * The billing cycle of the Elastic Compute Service (ECS) instances. This parameter takes effect only when the ChargeType parameter is set to PrePaid. Valid values:
         * <p>
         * 
         * *   Month: pay-by-month
         * *   Year: pay-by-year
         * *   Hour: pay-by-hour
         * 
         * Default value: Hour
         */
        public Builder priceUnit(String priceUnit) {
            this.putQueryParameter("PriceUnit", priceUnit);
            this.priceUnit = priceUnit;
            return this;
        }

        @Override
        public DescribePriceRequest build() {
            return new DescribePriceRequest(this);
        } 

    } 

    public static class DataDisks extends TeaModel {
        @NameInMap("category")
        private String category;

        @NameInMap("deleteWithInstance")
        private Boolean deleteWithInstance;

        @NameInMap("encrypted")
        private Boolean encrypted;

        @NameInMap("performanceLevel")
        private String performanceLevel;

        @NameInMap("size")
        private Integer size;

        private DataDisks(Builder builder) {
            this.category = builder.category;
            this.deleteWithInstance = builder.deleteWithInstance;
            this.encrypted = builder.encrypted;
            this.performanceLevel = builder.performanceLevel;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisks create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return deleteWithInstance
         */
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        /**
         * @return encrypted
         */
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        public static final class Builder {
            private String category; 
            private Boolean deleteWithInstance; 
            private Boolean encrypted; 
            private String performanceLevel; 
            private Integer size; 

            /**
             * The type of the data disk. Valid values:
             * <p>
             * 
             * *   cloud_efficiency: ultra disk
             * *   cloud_ssd: SSD
             * *   cloud_essd: ESSD
             * *   cloud: basic disk
             * 
             * Default value: cloud_efficiency
             * 
             * Valid values of N: 0 to 4
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Specifies whether the data disk is released when the node is released. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             * 
             * Default value: true
             * 
             * Valid values of N: 0 to 4
             */
            public Builder deleteWithInstance(Boolean deleteWithInstance) {
                this.deleteWithInstance = deleteWithInstance;
                return this;
            }

            /**
             * Specifies whether to encrypt the data disk. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             * 
             * Default value: false
             * 
             * Valid values of N: 0 to 4
             */
            public Builder encrypted(Boolean encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * The performance level of the ESSD used as the data disk. This parameter takes effect only when the Commodities.N.DataDisks.N.category parameter is set to cloud_essd. Default value: PL1. Valid values:
             * <p>
             * 
             * *   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.
             * *   PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.
             * *   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.
             * *   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.
             * 
             * Default value: PL1
             * 
             * Valid values of N: 0 to 4
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * The size of the data disk. Unit: GB.
             * <p>
             * 
             * Valid values: 40 to 500
             * 
             * Default value: 40
             * 
             * Valid values of N: 0 to 4
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            public DataDisks build() {
                return new DataDisks(this);
            } 

        } 

    }
    public static class Commodities extends TeaModel {
        @NameInMap("Amount")
        @Validation(required = true)
        private Integer amount;

        @NameInMap("DataDisks")
        private java.util.List < DataDisks> dataDisks;

        @NameInMap("InstanceType")
        @Validation(required = true)
        private String instanceType;

        @NameInMap("InternetChargeType")
        private String internetChargeType;

        @NameInMap("InternetMaxBandWidthOut")
        private Integer internetMaxBandWidthOut;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("NodeType")
        @Validation(required = true)
        private String nodeType;

        @NameInMap("Period")
        @Validation(required = true)
        private Integer period;

        @NameInMap("SystemDiskCategory")
        private String systemDiskCategory;

        @NameInMap("SystemDiskPerformanceLevel")
        private String systemDiskPerformanceLevel;

        @NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        private Commodities(Builder builder) {
            this.amount = builder.amount;
            this.dataDisks = builder.dataDisks;
            this.instanceType = builder.instanceType;
            this.internetChargeType = builder.internetChargeType;
            this.internetMaxBandWidthOut = builder.internetMaxBandWidthOut;
            this.networkType = builder.networkType;
            this.nodeType = builder.nodeType;
            this.period = builder.period;
            this.systemDiskCategory = builder.systemDiskCategory;
            this.systemDiskPerformanceLevel = builder.systemDiskPerformanceLevel;
            this.systemDiskSize = builder.systemDiskSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Commodities create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Integer getAmount() {
            return this.amount;
        }

        /**
         * @return dataDisks
         */
        public java.util.List < DataDisks> getDataDisks() {
            return this.dataDisks;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return internetChargeType
         */
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        /**
         * @return internetMaxBandWidthOut
         */
        public Integer getInternetMaxBandWidthOut() {
            return this.internetMaxBandWidthOut;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        /**
         * @return systemDiskCategory
         */
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        /**
         * @return systemDiskPerformanceLevel
         */
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        /**
         * @return systemDiskSize
         */
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public static final class Builder {
            private Integer amount; 
            private java.util.List < DataDisks> dataDisks; 
            private String instanceType; 
            private String internetChargeType; 
            private Integer internetMaxBandWidthOut; 
            private String networkType; 
            private String nodeType; 
            private Integer period; 
            private String systemDiskCategory; 
            private String systemDiskPerformanceLevel; 
            private Integer systemDiskSize; 

            /**
             * The node quantity of the type. Valid values: 1 to 1000.
             * <p>
             * 
             * Default value: 1
             * 
             * Valid values of N: 1 to 10
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * DataDisks.
             */
            public Builder dataDisks(java.util.List < DataDisks> dataDisks) {
                this.dataDisks = dataDisks;
                return this;
            }

            /**
             * The instance type of the node.
             * <p>
             * 
             * Valid values of N: 1 to 10
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The EIP billing method of the node. Valid values:
             * <p>
             * 
             * *   PayByBandwidth: pay-by-bandwidth
             * *   PayByTraffic: pay-by-traffic
             * 
             * Valid values of N: 1 to 10
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * The maximum outbound public bandwidth of the node. Unit: Mbit/s.
             * <p>
             * 
             * Valid values: 0 to 100
             * 
             * Default value: 0
             * 
             * Valid values of N: 1 to 10
             */
            public Builder internetMaxBandWidthOut(Integer internetMaxBandWidthOut) {
                this.internetMaxBandWidthOut = internetMaxBandWidthOut;
                return this;
            }

            /**
             * The network type of the node. Valid value: VPC.
             * <p>
             * 
             * Valid values of N: 1 to 10
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * The type of the node. Valid values:
             * <p>
             * 
             * *   Compute: compute node
             * *   Manager: management node
             * *   Login: logon node
             * 
             * Valid values of N: 1 to 10
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * The subscription duration of the node. Valid values:
             * <p>
             * 
             * *   If PriceUnit is set to Year, the valid values of the Period parameter are 1, 2, and 3.
             * *   If PriceUnit is set to Month, the valid values of the Period parameter are 1, 2, 3, 4, 5, 6, 7, 8, and 9.
             * *   If PriceUnit is set to Hour, the valid value of the Period parameter is 1.
             * 
             * Default value: 1
             * 
             * Valid values of N: 1 to 10
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * The system disk type of the node. Valid values:
             * <p>
             * 
             * *   cloud_efficiency: ultra disk
             * *   cloud_ssd: SSD
             * *   cloud_essd: ESSD
             * *   cloud: basic disk
             * 
             * Default value: cloud_efficiency
             * 
             * Valid values of N: 1 to 10
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * The performance level of the ESSD used as the system disk. This parameter takes effect only when the Commodities.N.SystemDiskCategory parameter is set to cloud_essd. Default value: PL1. Valid values:
             * <p>
             * 
             * *   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.
             * *   PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.
             * *   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.
             * *   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.
             * 
             * Default value: PL1
             * 
             * Valid values of N: 1 to 10
             */
            public Builder systemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
                this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
                return this;
            }

            /**
             * The system disk size of the node. Unit: GB.
             * <p>
             * 
             * Valid values: 40 to 500
             * 
             * Default value: 40
             * 
             * Valid values of N: 1 to 10
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            public Commodities build() {
                return new Commodities(this);
            } 

        } 

    }
}
