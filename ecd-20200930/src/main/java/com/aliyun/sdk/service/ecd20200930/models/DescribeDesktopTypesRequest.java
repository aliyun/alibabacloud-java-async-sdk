// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDesktopTypesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDesktopTypesRequest</p>
 */
public class DescribeDesktopTypesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppliedScope")
    private String appliedScope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuCount")
    private Integer cpuCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopGroupIdForModify")
    private String desktopGroupIdForModify;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopIdForModify")
    private String desktopIdForModify;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopTypeId")
    private String desktopTypeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GpuCount")
    private Float gpuCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceTypeFamily")
    private String instanceTypeFamily;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemorySize")
    private Integer memorySize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DescribeDesktopTypesRequest(Builder builder) {
        super(builder);
        this.appliedScope = builder.appliedScope;
        this.cpuCount = builder.cpuCount;
        this.desktopGroupIdForModify = builder.desktopGroupIdForModify;
        this.desktopIdForModify = builder.desktopIdForModify;
        this.desktopTypeId = builder.desktopTypeId;
        this.gpuCount = builder.gpuCount;
        this.instanceTypeFamily = builder.instanceTypeFamily;
        this.memorySize = builder.memorySize;
        this.orderType = builder.orderType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDesktopTypesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appliedScope
     */
    public String getAppliedScope() {
        return this.appliedScope;
    }

    /**
     * @return cpuCount
     */
    public Integer getCpuCount() {
        return this.cpuCount;
    }

    /**
     * @return desktopGroupIdForModify
     */
    public String getDesktopGroupIdForModify() {
        return this.desktopGroupIdForModify;
    }

    /**
     * @return desktopIdForModify
     */
    public String getDesktopIdForModify() {
        return this.desktopIdForModify;
    }

    /**
     * @return desktopTypeId
     */
    public String getDesktopTypeId() {
        return this.desktopTypeId;
    }

    /**
     * @return gpuCount
     */
    public Float getGpuCount() {
        return this.gpuCount;
    }

    /**
     * @return instanceTypeFamily
     */
    public String getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

    /**
     * @return memorySize
     */
    public Integer getMemorySize() {
        return this.memorySize;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeDesktopTypesRequest, Builder> {
        private String appliedScope; 
        private Integer cpuCount; 
        private String desktopGroupIdForModify; 
        private String desktopIdForModify; 
        private String desktopTypeId; 
        private Float gpuCount; 
        private String instanceTypeFamily; 
        private Integer memorySize; 
        private String orderType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDesktopTypesRequest request) {
            super(request);
            this.appliedScope = request.appliedScope;
            this.cpuCount = request.cpuCount;
            this.desktopGroupIdForModify = request.desktopGroupIdForModify;
            this.desktopIdForModify = request.desktopIdForModify;
            this.desktopTypeId = request.desktopTypeId;
            this.gpuCount = request.gpuCount;
            this.instanceTypeFamily = request.instanceTypeFamily;
            this.memorySize = request.memorySize;
            this.orderType = request.orderType;
            this.regionId = request.regionId;
        } 

        /**
         * Applicable Scope of specifications. Default value: `Public`
         */
        public Builder appliedScope(String appliedScope) {
            this.putQueryParameter("AppliedScope", appliedScope);
            this.appliedScope = appliedScope;
            return this;
        }

        /**
         * The number of vCPUs.
         */
        public Builder cpuCount(Integer cpuCount) {
            this.putQueryParameter("CpuCount", cpuCount);
            this.cpuCount = cpuCount;
            return this;
        }

        /**
         * The ID of the cloud computer pool when you change instance types of cloud computers. If you specify this parameter, the information about whether the instance type is compatible with the cloud computer pool is included in the response.
         */
        public Builder desktopGroupIdForModify(String desktopGroupIdForModify) {
            this.putQueryParameter("DesktopGroupIdForModify", desktopGroupIdForModify);
            this.desktopGroupIdForModify = desktopGroupIdForModify;
            return this;
        }

        /**
         * The ID of the cloud computer when you change instance types of cloud computers. If you specify this parameter, the information about whether the instance type is compatible with the cloud computer is included in the response.
         */
        public Builder desktopIdForModify(String desktopIdForModify) {
            this.putQueryParameter("DesktopIdForModify", desktopIdForModify);
            this.desktopIdForModify = desktopIdForModify;
            return this;
        }

        /**
         * The IDs of the instance types of cloud computers.
         * <p>
         * 
         * >  If the values of the `InstanceTypeFamily` and `DesktopTypeId` parameters are empty, all instance types of cloud computers are queried.
         * 
         * Valid values:
         * 
         * *   eds.hf.4c8g
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   ecd.basic.large
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   ecd.advanced.large
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   ecd.basic.small
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   ecd.graphics.2xlarge
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   eds.hf.8c16g
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   eds.hf.12c24g
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   eds.general.8c16g
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   eds.general.16c32g
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   ecd.advanced.xlarge
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   eds.graphics.16c1t4
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   ecd.graphics.xlarge
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   ecd.performance.2xlarge
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   eds.general.8c32g
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   eds.general.2c2g
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   eds.general.2c4g
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   eds.graphics.24c1t4
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   eds.general.4c8g
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   eds.general.4c16g
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   eds.general.2c8g
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder desktopTypeId(String desktopTypeId) {
            this.putQueryParameter("DesktopTypeId", desktopTypeId);
            this.desktopTypeId = desktopTypeId;
            return this;
        }

        /**
         * The number of GPUs.
         */
        public Builder gpuCount(Float gpuCount) {
            this.putQueryParameter("GpuCount", gpuCount);
            this.gpuCount = gpuCount;
            return this;
        }

        /**
         * The name of the instance family.
         * <p>
         * 
         * >  If the values of the `InstanceTypeFamily` and `DesktopTypeId` parameters are empty, all instance families of cloud computers are queried.
         * 
         * Valid values:
         * 
         * *   ecd.advanced
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   eds.graphics
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   ecd.basic
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   eds.hf
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   ecd.graphics
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   eds.general
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   ecd.performance
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder instanceTypeFamily(String instanceTypeFamily) {
            this.putQueryParameter("InstanceTypeFamily", instanceTypeFamily);
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }

        /**
         * The memory size. Unit: MiB.
         */
        public Builder memorySize(Integer memorySize) {
            this.putQueryParameter("MemorySize", memorySize);
            this.memorySize = memorySize;
            return this;
        }

        /**
         * The order type.
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeDesktopTypesRequest build() {
            return new DescribeDesktopTypesRequest(this);
        } 

    } 

}
