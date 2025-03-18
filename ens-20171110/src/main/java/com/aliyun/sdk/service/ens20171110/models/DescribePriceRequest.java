// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
    @com.aliyun.core.annotation.NameInMap("DataDisk")
    private java.util.List<DataDisk> dataDisk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataDisks")
    private java.util.List<DataDisks> dataDisks;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetChargeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String internetChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 12, minimum = 1)
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Quantity")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer quantity;

    private DescribePriceRequest(Builder builder) {
        super(builder);
        this.dataDisk = builder.dataDisk;
        this.systemDisk = builder.systemDisk;
        this.dataDisks = builder.dataDisks;
        this.ensRegionId = builder.ensRegionId;
        this.instanceType = builder.instanceType;
        this.internetChargeType = builder.internetChargeType;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.quantity = builder.quantity;
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
     * @return dataDisk
     */
    public java.util.List<DataDisk> getDataDisk() {
        return this.dataDisk;
    }

    /**
     * @return systemDisk
     */
    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    /**
     * @return dataDisks
     */
    public java.util.List<DataDisks> getDataDisks() {
        return this.dataDisks;
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
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
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return quantity
     */
    public Integer getQuantity() {
        return this.quantity;
    }

    public static final class Builder extends Request.Builder<DescribePriceRequest, Builder> {
        private java.util.List<DataDisk> dataDisk; 
        private SystemDisk systemDisk; 
        private java.util.List<DataDisks> dataDisks; 
        private String ensRegionId; 
        private String instanceType; 
        private String internetChargeType; 
        private Integer period; 
        private String periodUnit; 
        private Integer quantity; 

        private Builder() {
            super();
        } 

        private Builder(DescribePriceRequest request) {
            super(request);
            this.dataDisk = request.dataDisk;
            this.systemDisk = request.systemDisk;
            this.dataDisks = request.dataDisks;
            this.ensRegionId = request.ensRegionId;
            this.instanceType = request.instanceType;
            this.internetChargeType = request.internetChargeType;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.quantity = request.quantity;
        } 

        /**
         * DataDisk.
         */
        public Builder dataDisk(java.util.List<DataDisk> dataDisk) {
            this.putQueryParameter("DataDisk", dataDisk);
            this.dataDisk = dataDisk;
            return this;
        }

        /**
         * SystemDisk.
         */
        public Builder systemDisk(SystemDisk systemDisk) {
            this.putQueryParameter("SystemDisk", systemDisk);
            this.systemDisk = systemDisk;
            return this;
        }

        /**
         * <p>If you leave DataDisk.1.Size empty, the value that you specified for this parameter is used.</p>
         */
        public Builder dataDisks(java.util.List<DataDisks> dataDisks) {
            String dataDisksShrink = shrink(dataDisks, "DataDisks", "json");
            this.putQueryParameter("DataDisks", dataDisksShrink);
            this.dataDisks = dataDisks;
            return this;
        }

        /**
         * <p>The ID of the ENS node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-unicom</p>
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * <p>The specifications of instances.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ens.sn1.tiny</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The bandwidth metering method of the instance. Valid values:</p>
         * <ul>
         * <li>BandwidthByDay: Pay by daily peak bandwidth</li>
         * <li>95BandwidthByMonth: Pay by monthly 95th percentile bandwidth</li>
         * <li>PayByBandwidth4thMonth: Pay by monthly fourth peak bandwidth</li>
         * <li>PayByBandwidth: Pay by fixed bandwidth</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>95BandwidthByMonth</p>
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * <p>The subscription duration of the instance.</p>
         * <ul>
         * <li>If you leave the PeriodUnit parameter empty, the instance is purchased on a monthly basis. Valid values: Day and Month.</li>
         * <li>If you set PeriodUnit to Day, you can set Period only to 3.</li>
         * <li>If you set PeriodUnit to Month, you can set Period to a number from 1 to 9, or set Period to 12.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The billing cycle of the ENS instance. Valid values:</p>
         * <ul>
         * <li>Month (default):</li>
         * <li>Day</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>The number of instances.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder quantity(Integer quantity) {
            this.putQueryParameter("Quantity", quantity);
            this.quantity = quantity;
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
    public static class DataDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        private DataDisk(Builder builder) {
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisk create() {
            return builder().build();
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        public static final class Builder {
            private Integer size; 

            private Builder() {
            } 

            private Builder(DataDisk model) {
                this.size = model.size;
            } 

            /**
             * <p>The size of the data disk. Unit: GB. If you specify this parameter, this parameter takes precedence over the Size property in DataDisks.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            public DataDisk build() {
                return new DataDisk(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePriceRequest} extends {@link TeaModel}
     *
     * <p>DescribePriceRequest</p>
     */
    public static class SystemDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Size")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer size;

        private SystemDisk(Builder builder) {
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDisk create() {
            return builder().build();
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        public static final class Builder {
            private Integer size; 

            private Builder() {
            } 

            private Builder(SystemDisk model) {
                this.size = model.size;
            } 

            /**
             * <p>The size of the system disk. Unit: GB.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            public SystemDisk build() {
                return new SystemDisk(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePriceRequest} extends {@link TeaModel}
     *
     * <p>DescribePriceRequest</p>
     */
    public static class DataDisks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        private DataDisks(Builder builder) {
            this.category = builder.category;
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
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        public static final class Builder {
            private String category; 
            private Long size; 

            private Builder() {
            } 

            private Builder(DataDisks model) {
                this.category = model.category;
                this.size = model.size;
            } 

            /**
             * <p>The category of the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_efficiency</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The size of the data disk. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            public DataDisks build() {
                return new DataDisks(this);
            } 

        } 

    }
}
