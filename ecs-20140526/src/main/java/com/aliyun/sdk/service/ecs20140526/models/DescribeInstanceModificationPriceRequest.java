// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceModificationPriceRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceModificationPriceRequest</p>
 */
public class DescribeInstanceModificationPriceRequest extends Request {
    @Query
    @NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("DataDisk")
    private java.util.List < DataDisk> dataDisk;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private DescribeInstanceModificationPriceRequest(Builder builder) {
        super(builder);
        this.systemDisk = builder.systemDisk;
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.dataDisk = builder.dataDisk;
        this.regionId = builder.regionId;
        this.instanceType = builder.instanceType;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceModificationPriceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return systemDisk
     */
    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return dataDisk
     */
    public java.util.List < DataDisk> getDataDisk() {
        return this.dataDisk;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DescribeInstanceModificationPriceRequest, Builder> {
        private SystemDisk systemDisk; 
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private java.util.List < DataDisk> dataDisk; 
        private String regionId; 
        private String instanceType; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceModificationPriceRequest request) {
            super(request);
            this.systemDisk = request.systemDisk;
            this.sourceRegionId = request.sourceRegionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.dataDisk = request.dataDisk;
            this.regionId = request.regionId;
            this.instanceType = request.instanceType;
            this.instanceId = request.instanceId;
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
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
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
         * The ID of the region. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The specification of the target instance. We recommend that you call [DescribeResourcesModification](~~ 66187 ~~) to query the instance types that can be upgraded in a specified zone.
         * <p>
         * 
         * > you must specify at least one of the instance type parameters ("InstanceType") and data disk parameters ("DataDisk.N.* ").
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The ID of the instance for which you want to query the upgrade price.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DescribeInstanceModificationPriceRequest build() {
            return new DescribeInstanceModificationPriceRequest(this);
        } 

    } 

    public static class SystemDisk extends TeaModel {
        @NameInMap("Category")
        private String category;

        private SystemDisk(Builder builder) {
            this.category = builder.category;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDisk create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        public static final class Builder {
            private String category; 

            /**
             * The system disk type. Parameter values are required only when the instance type is upgraded from a phased-out instance type to an on-sale instance type and the non-I/O optimized instance type is upgraded to an I/O optimized instance type. For more information about instance types, see [instance type families](~~ 25378 ~~) and [phased-out instance types](~~ 55263 ~~).
             * <p>
             * 
             * Valid values:
             * 
             * -cloud_efficiency: Ultra disk
             * -cloud_ssd:SSD cloud disk
             * 
             * Default value: None
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            public SystemDisk build() {
                return new SystemDisk(this);
            } 

        } 

    }
    public static class DataDisk extends TeaModel {
        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("Category")
        private String category;

        private DataDisk(Builder builder) {
            this.performanceLevel = builder.performanceLevel;
            this.size = builder.size;
            this.category = builder.category;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisk create() {
            return builder().build();
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

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        public static final class Builder {
            private String performanceLevel; 
            private Integer size; 
            private String category; 

            /**
             * 当数据盘类型为ESSD云盘时，设置云盘的性能等级。N的取值必须和`DataDisk.N.Category=cloud_essd`中的N保持一致。取值范围：
             * <p>
             * 
             * - PL0：单盘最高随机读写IOPS 1万
             * - PL1：单盘最高随机读写IOPS 5万
             * - PL2：单盘最高随机读写IOPS 10万
             * - PL3：单盘最高随机读写IOPS 100万
             * 
             * 默认值：PL1
             * 
             * 有关如何选择ESSD性能等级，请参见[ESSD云盘](~~122389~~)。
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * 数据盘的容量大小。N的取值范围：1~16，内存单位为GiB。取值范围：
             * <p>
             * 
             * - cloud_efficiency：20~32768
             * - cloud_ssd：20~32768
             * - cloud_essd：20~32768
             * - cloud：5~2000
             * 
             * 默认值：指定数据盘类型相应的容量大小的最小值。
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * 数据盘类型。当您需要查询ECS实例挂载的新包年包月数据盘的价格时，可以传入该参数值。N的取值范围：1~16。取值范围：
             * <p>
             * 
             * - cloud_efficiency：高效云盘
             * - cloud_ssd：SSD云盘
             * - cloud_essd：ESSD云盘
             * - cloud：普通云盘。
             * 
             * 默认值：无
             * 
             * > 查询时，实例规格参数（`InstanceType`）和数据盘参数（`DataDisk.N.*`）不得同时为空，必须至少指定一个。
             * 
             * 
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            public DataDisk build() {
                return new DataDisk(this);
            } 

        } 

    }
}
