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
 * {@link DescribeEnsSaleControlAvailableResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEnsSaleControlAvailableResourceResponseBody</p>
 */
public class DescribeEnsSaleControlAvailableResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SaleControlAvailableResource")
    private java.util.List<SaleControlAvailableResource> saleControlAvailableResource;

    private DescribeEnsSaleControlAvailableResourceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.saleControlAvailableResource = builder.saleControlAvailableResource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnsSaleControlAvailableResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return saleControlAvailableResource
     */
    public java.util.List<SaleControlAvailableResource> getSaleControlAvailableResource() {
        return this.saleControlAvailableResource;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SaleControlAvailableResource> saleControlAvailableResource; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SaleControlAvailableResource.
         */
        public Builder saleControlAvailableResource(java.util.List<SaleControlAvailableResource> saleControlAvailableResource) {
            this.saleControlAvailableResource = saleControlAvailableResource;
            return this;
        }

        public DescribeEnsSaleControlAvailableResourceResponseBody build() {
            return new DescribeEnsSaleControlAvailableResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEnsSaleControlAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnsSaleControlAvailableResourceResponseBody</p>
     */
    public static class AvailableDiskType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiskName")
        private String diskName;

        @com.aliyun.core.annotation.NameInMap("DiskType")
        private String diskType;

        private AvailableDiskType(Builder builder) {
            this.diskName = builder.diskName;
            this.diskType = builder.diskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableDiskType create() {
            return builder().build();
        }

        /**
         * @return diskName
         */
        public String getDiskName() {
            return this.diskName;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        public static final class Builder {
            private String diskName; 
            private String diskType; 

            /**
             * DiskName.
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * DiskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            public AvailableDiskType build() {
                return new AvailableDiskType(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEnsSaleControlAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnsSaleControlAvailableResourceResponseBody</p>
     */
    public static class AvailableRegion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Area")
        private String area;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("Country")
        private String country;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("EnsRegionName")
        private String ensRegionName;

        @com.aliyun.core.annotation.NameInMap("Isp")
        private String isp;

        @com.aliyun.core.annotation.NameInMap("Province")
        private String province;

        private AvailableRegion(Builder builder) {
            this.area = builder.area;
            this.city = builder.city;
            this.country = builder.country;
            this.ensRegionId = builder.ensRegionId;
            this.ensRegionName = builder.ensRegionName;
            this.isp = builder.isp;
            this.province = builder.province;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableRegion create() {
            return builder().build();
        }

        /**
         * @return area
         */
        public String getArea() {
            return this.area;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return country
         */
        public String getCountry() {
            return this.country;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return ensRegionName
         */
        public String getEnsRegionName() {
            return this.ensRegionName;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        public static final class Builder {
            private String area; 
            private String city; 
            private String country; 
            private String ensRegionId; 
            private String ensRegionName; 
            private String isp; 
            private String province; 

            /**
             * Area.
             */
            public Builder area(String area) {
                this.area = area;
                return this;
            }

            /**
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * Country.
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * EnsRegionId.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * EnsRegionName.
             */
            public Builder ensRegionName(String ensRegionName) {
                this.ensRegionName = ensRegionName;
                return this;
            }

            /**
             * Isp.
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * Province.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            public AvailableRegion build() {
                return new AvailableRegion(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEnsSaleControlAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnsSaleControlAvailableResourceResponseBody</p>
     */
    public static class AvailableSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cores")
        private String cores;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private String memory;

        @com.aliyun.core.annotation.NameInMap("SpecName")
        private String specName;

        @com.aliyun.core.annotation.NameInMap("SpecValue")
        private String specValue;

        private AvailableSpec(Builder builder) {
            this.cores = builder.cores;
            this.memory = builder.memory;
            this.specName = builder.specName;
            this.specValue = builder.specValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableSpec create() {
            return builder().build();
        }

        /**
         * @return cores
         */
        public String getCores() {
            return this.cores;
        }

        /**
         * @return memory
         */
        public String getMemory() {
            return this.memory;
        }

        /**
         * @return specName
         */
        public String getSpecName() {
            return this.specName;
        }

        /**
         * @return specValue
         */
        public String getSpecValue() {
            return this.specValue;
        }

        public static final class Builder {
            private String cores; 
            private String memory; 
            private String specName; 
            private String specValue; 

            /**
             * Cores.
             */
            public Builder cores(String cores) {
                this.cores = cores;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * SpecName.
             */
            public Builder specName(String specName) {
                this.specName = specName;
                return this;
            }

            /**
             * SpecValue.
             */
            public Builder specValue(String specValue) {
                this.specValue = specValue;
                return this;
            }

            public AvailableSpec build() {
                return new AvailableSpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEnsSaleControlAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnsSaleControlAvailableResourceResponseBody</p>
     */
    public static class AvailableDefaultStorageType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StorageName")
        private String storageName;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        private AvailableDefaultStorageType(Builder builder) {
            this.storageName = builder.storageName;
            this.storageType = builder.storageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableDefaultStorageType create() {
            return builder().build();
        }

        /**
         * @return storageName
         */
        public String getStorageName() {
            return this.storageName;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        public static final class Builder {
            private String storageName; 
            private String storageType; 

            /**
             * StorageName.
             */
            public Builder storageName(String storageName) {
                this.storageName = storageName;
                return this;
            }

            /**
             * StorageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            public AvailableDefaultStorageType build() {
                return new AvailableDefaultStorageType(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEnsSaleControlAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnsSaleControlAvailableResourceResponseBody</p>
     */
    public static class AvailableSpecialStorageType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("StorageName")
        private String storageName;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        private AvailableSpecialStorageType(Builder builder) {
            this.storageType = builder.storageType;
            this.storageName = builder.storageName;
            this.ensRegionId = builder.ensRegionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableSpecialStorageType create() {
            return builder().build();
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return storageName
         */
        public String getStorageName() {
            return this.storageName;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public static final class Builder {
            private String storageType; 
            private String storageName; 
            private String ensRegionId; 

            /**
             * StorageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * StorageName.
             */
            public Builder storageName(String storageName) {
                this.storageName = storageName;
                return this;
            }

            /**
             * EnsRegionId.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            public AvailableSpecialStorageType build() {
                return new AvailableSpecialStorageType(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEnsSaleControlAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnsSaleControlAvailableResourceResponseBody</p>
     */
    public static class AvailableStorageType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableDefaultStorageType")
        private java.util.List<AvailableDefaultStorageType> availableDefaultStorageType;

        @com.aliyun.core.annotation.NameInMap("AvailableSpecialStorageType")
        private java.util.List<java.util.List<AvailableSpecialStorageType>> availableSpecialStorageType;

        private AvailableStorageType(Builder builder) {
            this.availableDefaultStorageType = builder.availableDefaultStorageType;
            this.availableSpecialStorageType = builder.availableSpecialStorageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableStorageType create() {
            return builder().build();
        }

        /**
         * @return availableDefaultStorageType
         */
        public java.util.List<AvailableDefaultStorageType> getAvailableDefaultStorageType() {
            return this.availableDefaultStorageType;
        }

        /**
         * @return availableSpecialStorageType
         */
        public java.util.List<java.util.List<AvailableSpecialStorageType>> getAvailableSpecialStorageType() {
            return this.availableSpecialStorageType;
        }

        public static final class Builder {
            private java.util.List<AvailableDefaultStorageType> availableDefaultStorageType; 
            private java.util.List<java.util.List<AvailableSpecialStorageType>> availableSpecialStorageType; 

            /**
             * AvailableDefaultStorageType.
             */
            public Builder availableDefaultStorageType(java.util.List<AvailableDefaultStorageType> availableDefaultStorageType) {
                this.availableDefaultStorageType = availableDefaultStorageType;
                return this;
            }

            /**
             * AvailableSpecialStorageType.
             */
            public Builder availableSpecialStorageType(java.util.List<java.util.List<AvailableSpecialStorageType>> availableSpecialStorageType) {
                this.availableSpecialStorageType = availableSpecialStorageType;
                return this;
            }

            public AvailableStorageType build() {
                return new AvailableStorageType(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEnsSaleControlAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnsSaleControlAvailableResourceResponseBody</p>
     */
    public static class SaleControlAvailableResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableDiskType")
        private java.util.List<AvailableDiskType> availableDiskType;

        @com.aliyun.core.annotation.NameInMap("AvailableRegion")
        private java.util.List<AvailableRegion> availableRegion;

        @com.aliyun.core.annotation.NameInMap("AvailableSpec")
        private java.util.List<AvailableSpec> availableSpec;

        @com.aliyun.core.annotation.NameInMap("AvailableStorageType")
        private AvailableStorageType availableStorageType;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("OrderType")
        private String orderType;

        private SaleControlAvailableResource(Builder builder) {
            this.availableDiskType = builder.availableDiskType;
            this.availableRegion = builder.availableRegion;
            this.availableSpec = builder.availableSpec;
            this.availableStorageType = builder.availableStorageType;
            this.commodityCode = builder.commodityCode;
            this.orderType = builder.orderType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SaleControlAvailableResource create() {
            return builder().build();
        }

        /**
         * @return availableDiskType
         */
        public java.util.List<AvailableDiskType> getAvailableDiskType() {
            return this.availableDiskType;
        }

        /**
         * @return availableRegion
         */
        public java.util.List<AvailableRegion> getAvailableRegion() {
            return this.availableRegion;
        }

        /**
         * @return availableSpec
         */
        public java.util.List<AvailableSpec> getAvailableSpec() {
            return this.availableSpec;
        }

        /**
         * @return availableStorageType
         */
        public AvailableStorageType getAvailableStorageType() {
            return this.availableStorageType;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return orderType
         */
        public String getOrderType() {
            return this.orderType;
        }

        public static final class Builder {
            private java.util.List<AvailableDiskType> availableDiskType; 
            private java.util.List<AvailableRegion> availableRegion; 
            private java.util.List<AvailableSpec> availableSpec; 
            private AvailableStorageType availableStorageType; 
            private String commodityCode; 
            private String orderType; 

            /**
             * AvailableDiskType.
             */
            public Builder availableDiskType(java.util.List<AvailableDiskType> availableDiskType) {
                this.availableDiskType = availableDiskType;
                return this;
            }

            /**
             * AvailableRegion.
             */
            public Builder availableRegion(java.util.List<AvailableRegion> availableRegion) {
                this.availableRegion = availableRegion;
                return this;
            }

            /**
             * AvailableSpec.
             */
            public Builder availableSpec(java.util.List<AvailableSpec> availableSpec) {
                this.availableSpec = availableSpec;
                return this;
            }

            /**
             * AvailableStorageType.
             */
            public Builder availableStorageType(AvailableStorageType availableStorageType) {
                this.availableStorageType = availableStorageType;
                return this;
            }

            /**
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * OrderType.
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            public SaleControlAvailableResource build() {
                return new SaleControlAvailableResource(this);
            } 

        } 

    }
}
