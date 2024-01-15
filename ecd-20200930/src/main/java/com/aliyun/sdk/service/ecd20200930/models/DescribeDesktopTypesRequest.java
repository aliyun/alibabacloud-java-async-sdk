// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDesktopTypesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDesktopTypesRequest</p>
 */
public class DescribeDesktopTypesRequest extends Request {
    @Query
    @NameInMap("AppliedScope")
    private String appliedScope;

    @Query
    @NameInMap("CpuCount")
    private Integer cpuCount;

    @Query
    @NameInMap("DesktopGroupIdForModify")
    private String desktopGroupIdForModify;

    @Query
    @NameInMap("DesktopIdForModify")
    private String desktopIdForModify;

    @Query
    @NameInMap("DesktopTypeId")
    private String desktopTypeId;

    @Query
    @NameInMap("GpuCount")
    private Float gpuCount;

    @Query
    @NameInMap("InstanceTypeFamily")
    private String instanceTypeFamily;

    @Query
    @NameInMap("MemorySize")
    private Integer memorySize;

    @Query
    @NameInMap("OrderType")
    private String orderType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
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
         * DesktopGroupIdForModify.
         */
        public Builder desktopGroupIdForModify(String desktopGroupIdForModify) {
            this.putQueryParameter("DesktopGroupIdForModify", desktopGroupIdForModify);
            this.desktopGroupIdForModify = desktopGroupIdForModify;
            return this;
        }

        /**
         * When changing the configuration, enter the desktop ID that needs to be changed. The return value will increase the compatibility between the specifications and the desktop.
         */
        public Builder desktopIdForModify(String desktopIdForModify) {
            this.putQueryParameter("DesktopIdForModify", desktopIdForModify);
            this.desktopIdForModify = desktopIdForModify;
            return this;
        }

        /**
         * The ID of the cloud desktop type. Valid values:
         * <p>
         * 
         * *   eds.graphics.16c1t4
         * *   eds.graphics.24c1t4
         * *   eds.hf.12c24g
         * *   eds.hf.8c16g
         * *   eds.hf.4c8g
         * *   eds.general.8c32g
         * *   eds.general.16c32g
         * *   eds.general.8c16g
         * *   eds.general.4c16g
         * *   eds.general.4c8g
         * *   eds.general.2c8g
         * *   eds.general.2c4g
         * *   eds.general.2c2g
         * *   ecd.graphics.xlarge
         * *   ecd.graphics.2xlarge
         * *   ecd.performance.2xlarge
         * *   ecd.advanced.xlarge
         * *   ecd.advanced.large
         * *   ecd.basic.large
         * *   ecd.basic.small
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
         * The family of the cloud desktop type. Valid values:
         * <p>
         * 
         * *   eds.graphics
         * *   eds.hf
         * *   eds.general
         * *   ecd.graphics
         * *   ecd.performance
         * *   ecd.advanced
         * *   ecd.basic
         */
        public Builder instanceTypeFamily(String instanceTypeFamily) {
            this.putQueryParameter("InstanceTypeFamily", instanceTypeFamily);
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }

        /**
         * The memory size. Unit: GiB.
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
         * The ID of the region.
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
