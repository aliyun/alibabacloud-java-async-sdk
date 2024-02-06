// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
    @NameInMap("DataDisk")
    private java.util.List < DataDisk> dataDisk;

    @Query
    @NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @Query
    @NameInMap("DataDisks")
    private java.util.List < DataDisks> dataDisks;

    @Query
    @NameInMap("EnsRegionId")
    @Validation(required = true)
    private String ensRegionId;

    @Query
    @NameInMap("InstanceType")
    @Validation(required = true)
    private String instanceType;

    @Query
    @NameInMap("InternetChargeType")
    @Validation(required = true)
    private String internetChargeType;

    @Query
    @NameInMap("Period")
    @Validation(required = true, maximum = 12, minimum = 1)
    private Integer period;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("Quantity")
    @Validation(required = true)
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
    public java.util.List < DataDisk> getDataDisk() {
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
    public java.util.List < DataDisks> getDataDisks() {
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
        private java.util.List < DataDisk> dataDisk; 
        private SystemDisk systemDisk; 
        private java.util.List < DataDisks> dataDisks; 
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
        public Builder dataDisk(java.util.List < DataDisk> dataDisk) {
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
         * If you leave DataDisk.1.Size empty, the value that you specified for this parameter is used.
         */
        public Builder dataDisks(java.util.List < DataDisks> dataDisks) {
            String dataDisksShrink = shrink(dataDisks, "DataDisks", "json");
            this.putQueryParameter("DataDisks", dataDisksShrink);
            this.dataDisks = dataDisks;
            return this;
        }

        /**
         * The ID of the ENS node.
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * The type of the instance.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The bandwidth metering method of the instance. Valid values:
         * <p>
         * 
         * *   BandwidthByDay: Pay by daily peak bandwidth
         * *   95BandwidthByMonth: Pay by monthly 95th percentile bandwidth
         * *   PayByBandwidth4thMonth: Pay by monthly fourth peak bandwidth
         * *   PayByBandwidth: Pay by fixed bandwidth
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * The subscription duration of the instance.
         * <p>
         * 
         * *   If you leave the PeriodUnit parameter empty, the instance is purchased on a monthly basis. Valid values: Day and Month.
         * *   If you set PeriodUnit to Day, you can set Period only to 3.
         * *   If you set PeriodUnit to Month, you can set Period to a number from 1 to 9, or set Period to 12.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The billing cycle of the ENS instance. Valid values:
         * <p>
         * 
         * *   Month (default):
         * *   Day
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * The number of instances.
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

    public static class DataDisk extends TeaModel {
        @NameInMap("Size")
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

            /**
             * The size of the data disk. Unit: GB. If you specify this parameter, this parameter takes precedence over the Size property in DataDisks.
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
    public static class SystemDisk extends TeaModel {
        @NameInMap("Size")
        @Validation(required = true)
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

            /**
             * The size of the system disk. Unit: GB.
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
    public static class DataDisks extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("Size")
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

            /**
             * The category of the disk.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The size of the data disk. Unit: GB.
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
