// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link DescribePriceRequest} extends {@link RequestModel}
 *
 * <p>DescribePriceRequest</p>
 */
public class DescribePriceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Commodities")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Commodities> commodities;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PriceUnit")
    @com.aliyun.core.annotation.Validation(required = true)
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
    public java.util.List<Commodities> getCommodities() {
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
        private java.util.List<Commodities> commodities; 
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
         * <p>The billing method of the ECS instances. Valid values:</p>
         * <ul>
         * <li>PostPaid: pay-as-you-go</li>
         * <li>PrePaid: subscription</li>
         * </ul>
         * <p>Default value: PostPaid.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The information about the service.</p>
         * <p>This parameter is required.</p>
         */
        public Builder commodities(java.util.List<Commodities> commodities) {
            this.putQueryParameter("Commodities", commodities);
            this.commodities = commodities;
            return this;
        }

        /**
         * <p>The type of the order. The order can be set only as a purchase order. Valid value: INSTANCE-BUY.</p>
         * 
         * <strong>example:</strong>
         * <p>INSTANCE-BUY</p>
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * <p>The billing cycle of the Elastic Compute Service (ECS) instances. This parameter takes effect only when the ChargeType parameter is set to PrePaid. Valid values:</p>
         * <ul>
         * <li>Month: pay-by-month</li>
         * <li>Year: pay-by-year</li>
         * <li>Hour: pay-by-hour</li>
         * </ul>
         * <p>Default value: Hour.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Hour</p>
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

    /**
     * 
     * {@link DescribePriceRequest} extends {@link TeaModel}
     *
     * <p>DescribePriceRequest</p>
     */
    public static class DataDisks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("deleteWithInstance")
        private Boolean deleteWithInstance;

        @com.aliyun.core.annotation.NameInMap("encrypted")
        private Boolean encrypted;

        @com.aliyun.core.annotation.NameInMap("performanceLevel")
        private String performanceLevel;

        @com.aliyun.core.annotation.NameInMap("size")
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

            private Builder() {
            } 

            private Builder(DataDisks model) {
                this.category = model.category;
                this.deleteWithInstance = model.deleteWithInstance;
                this.encrypted = model.encrypted;
                this.performanceLevel = model.performanceLevel;
                this.size = model.size;
            } 

            /**
             * <p>The type of the data disk. Valid values:</p>
             * <ul>
             * <li>cloud_efficiency: ultra disk</li>
             * <li>cloud_ssd: standard SSD</li>
             * <li>cloud_essd: ESSD</li>
             * <li>cloud: basic disk</li>
             * </ul>
             * <p>Default value: cloud_efficiency.</p>
             * <p>Valid values of N: 0 to 4.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_efficiency</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>Specifies whether the data disk is released when the node is released. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * <p>Default value: true.</p>
             * <p>Valid values of N: 0 to 4.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder deleteWithInstance(Boolean deleteWithInstance) {
                this.deleteWithInstance = deleteWithInstance;
                return this;
            }

            /**
             * <p>Specifies whether to encrypt the data disk. Valid values:</p>
             * <ul>
             * <li>true: encrypts the data disk.</li>
             * <li>false: does not encrypt the data disk.</li>
             * </ul>
             * <p>Default value: false.</p>
             * <p>Valid values of N: 0 to 4.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder encrypted(Boolean encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * <p>The performance level of the ESSD used as the data disk. This parameter takes effect only when the Commodities.N.DataDisks.N.category parameter is set to cloud_essd. Valid values:</p>
             * <ul>
             * <li>PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</li>
             * <li>PL1: A single ESSD can deliver up to 50,000 IOPS of random read/write.</li>
             * <li>PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</li>
             * <li>PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</li>
             * </ul>
             * <p>Default value: PL1.</p>
             * <p>Valid values of N: 0 to 4.</p>
             * 
             * <strong>example:</strong>
             * <p>PL1</p>
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * <p>The size of the data disk. Unit: GB.</p>
             * <p>Valid values: 40 to 500.</p>
             * <p>Default value: 40.</p>
             * <p>Valid values of N: 0 to 4.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
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
    /**
     * 
     * {@link DescribePriceRequest} extends {@link TeaModel}
     *
     * <p>DescribePriceRequest</p>
     */
    public static class Commodities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer amount;

        @com.aliyun.core.annotation.NameInMap("DataDisks")
        private java.util.List<DataDisks> dataDisks;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("InternetChargeType")
        private String internetChargeType;

        @com.aliyun.core.annotation.NameInMap("InternetMaxBandWidthOut")
        private Integer internetMaxBandWidthOut;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("Period")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer period;

        @com.aliyun.core.annotation.NameInMap("SystemDiskCategory")
        private String systemDiskCategory;

        @com.aliyun.core.annotation.NameInMap("SystemDiskPerformanceLevel")
        private String systemDiskPerformanceLevel;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
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
        public java.util.List<DataDisks> getDataDisks() {
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
            private java.util.List<DataDisks> dataDisks; 
            private String instanceType; 
            private String internetChargeType; 
            private Integer internetMaxBandWidthOut; 
            private String networkType; 
            private String nodeType; 
            private Integer period; 
            private String systemDiskCategory; 
            private String systemDiskPerformanceLevel; 
            private Integer systemDiskSize; 

            private Builder() {
            } 

            private Builder(Commodities model) {
                this.amount = model.amount;
                this.dataDisks = model.dataDisks;
                this.instanceType = model.instanceType;
                this.internetChargeType = model.internetChargeType;
                this.internetMaxBandWidthOut = model.internetMaxBandWidthOut;
                this.networkType = model.networkType;
                this.nodeType = model.nodeType;
                this.period = model.period;
                this.systemDiskCategory = model.systemDiskCategory;
                this.systemDiskPerformanceLevel = model.systemDiskPerformanceLevel;
                this.systemDiskSize = model.systemDiskSize;
            } 

            /**
             * <p>The node quantity of the type. Valid values: 1 to 1000.</p>
             * <p>Default value: 1.</p>
             * <p>Valid values of N: 1 to 10</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The list of data disks.</p>
             */
            public Builder dataDisks(java.util.List<DataDisks> dataDisks) {
                this.dataDisks = dataDisks;
                return this;
            }

            /**
             * <p>The instance type of the node.</p>
             * <p>Valid values of N: 1 to 10.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.n1.tiny</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The EIP billing method of the node. Valid values:</p>
             * <ul>
             * <li>PayByBandwidth: pay-by-bandwidth</li>
             * <li>PayByTraffic: pay-by-traffic</li>
             * </ul>
             * <p>Valid values of N: 1 to 10.</p>
             * 
             * <strong>example:</strong>
             * <p>PayByBandwidth</p>
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * <p>The maximum outbound public bandwidth of the node. Unit: Mbit/s.</p>
             * <p>Valid values: 0 to 100.</p>
             * <p>Default value: 0.</p>
             * <p>Valid values of N: 1 to 10.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder internetMaxBandWidthOut(Integer internetMaxBandWidthOut) {
                this.internetMaxBandWidthOut = internetMaxBandWidthOut;
                return this;
            }

            /**
             * <p>The network type of the node. Valid value: VPC.</p>
             * <p>Valid values of N: 1 to 10.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The type of the node. Valid values:</p>
             * <ul>
             * <li>Compute: compute node</li>
             * <li>Manager: management node</li>
             * <li>Login: logon node</li>
             * </ul>
             * <p>Valid values of N: 1 to 10.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Compute</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The subscription duration of the node. Valid values:</p>
             * <ul>
             * <li>If PriceUnit is set to Year, the valid values of the Period parameter are 1, 2, and 3.</li>
             * <li>If PriceUnit is set to Month, the valid values of the Period parameter are 1, 2, 3, 4, 5, 6, 7, 8, and 9.</li>
             * <li>If PriceUnit is set to Hour, the valid value of the Period parameter is 1.</li>
             * </ul>
             * <p>Default value: 1.</p>
             * <p>Valid values of N: 1 to 10.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The system disk type of the node. Valid values:</p>
             * <ul>
             * <li>cloud_efficiency: ultra disk</li>
             * <li>cloud_ssd: standard SSD</li>
             * <li>cloud_essd: ESSD</li>
             * <li>cloud: basic disk</li>
             * </ul>
             * <p>Default value: cloud_efficiency</p>
             * <p>Valid values of N: 1 to 10.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * <p>The performance level of the ESSD used as the system disk. This parameter takes effect only when the Commodities.N.SystemDiskCategory parameter is set to cloud_essd. Valid values:</p>
             * <ul>
             * <li>PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</li>
             * <li>PL1: A single ESSD can deliver up to 50,000 IOPS of random read/write.</li>
             * <li>PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</li>
             * <li>PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</li>
             * </ul>
             * <p>Default value: PL1.</p>
             * <p>Valid values of N: 1 to 10</p>
             * 
             * <strong>example:</strong>
             * <p>PL1</p>
             */
            public Builder systemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
                this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
                return this;
            }

            /**
             * <p>The system disk size of the node. Unit: GB.</p>
             * <p>Valid values: 40 to 500.</p>
             * <p>Default value: 40.</p>
             * <p>Valid values of N: 1 to 10.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
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
