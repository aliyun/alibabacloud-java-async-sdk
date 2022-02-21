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
    @NameInMap("CpuCount")
    private Integer cpuCount;

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
        this.cpuCount = builder.cpuCount;
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
     * @return cpuCount
     */
    public Integer getCpuCount() {
        return this.cpuCount;
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
        private Integer cpuCount; 
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

        private Builder(DescribeDesktopTypesRequest response) {
            super(response);
            this.cpuCount = response.cpuCount;
            this.desktopIdForModify = response.desktopIdForModify;
            this.desktopTypeId = response.desktopTypeId;
            this.gpuCount = response.gpuCount;
            this.instanceTypeFamily = response.instanceTypeFamily;
            this.memorySize = response.memorySize;
            this.orderType = response.orderType;
            this.regionId = response.regionId;
        } 

        /**
         * CpuCount.
         */
        public Builder cpuCount(Integer cpuCount) {
            this.putQueryParameter("CpuCount", cpuCount);
            this.cpuCount = cpuCount;
            return this;
        }

        /**
         * DesktopIdForModify.
         */
        public Builder desktopIdForModify(String desktopIdForModify) {
            this.putQueryParameter("DesktopIdForModify", desktopIdForModify);
            this.desktopIdForModify = desktopIdForModify;
            return this;
        }

        /**
         * DesktopTypeId.
         */
        public Builder desktopTypeId(String desktopTypeId) {
            this.putQueryParameter("DesktopTypeId", desktopTypeId);
            this.desktopTypeId = desktopTypeId;
            return this;
        }

        /**
         * GpuCount.
         */
        public Builder gpuCount(Float gpuCount) {
            this.putQueryParameter("GpuCount", gpuCount);
            this.gpuCount = gpuCount;
            return this;
        }

        /**
         * InstanceTypeFamily.
         */
        public Builder instanceTypeFamily(String instanceTypeFamily) {
            this.putQueryParameter("InstanceTypeFamily", instanceTypeFamily);
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }

        /**
         * MemorySize.
         */
        public Builder memorySize(Integer memorySize) {
            this.putQueryParameter("MemorySize", memorySize);
            this.memorySize = memorySize;
            return this;
        }

        /**
         * OrderType.
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * RegionId.
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
