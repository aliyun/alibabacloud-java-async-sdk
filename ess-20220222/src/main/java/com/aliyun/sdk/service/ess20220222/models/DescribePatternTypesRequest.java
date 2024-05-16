// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePatternTypesRequest} extends {@link RequestModel}
 *
 * <p>DescribePatternTypesRequest</p>
 */
public class DescribePatternTypesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Architecture")
    private java.util.List < String > architecture;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BurstablePerformance")
    private String burstablePerformance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    private Long channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cores")
    private Integer cores;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoresList")
    private java.util.List < Integer > coresList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludedInstanceType")
    private java.util.List < String > excludedInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceFamilyLevel")
    private String instanceFamilyLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxPrice")
    private Float maxPrice;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Memory")
    private Float memory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemoryList")
    private java.util.List < Float > memoryList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotStrategy")
    private String spotStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private java.util.List < String > vSwitchId;

    private DescribePatternTypesRequest(Builder builder) {
        super(builder);
        this.architecture = builder.architecture;
        this.burstablePerformance = builder.burstablePerformance;
        this.channelId = builder.channelId;
        this.cores = builder.cores;
        this.coresList = builder.coresList;
        this.excludedInstanceType = builder.excludedInstanceType;
        this.instanceFamilyLevel = builder.instanceFamilyLevel;
        this.maxPrice = builder.maxPrice;
        this.memory = builder.memory;
        this.memoryList = builder.memoryList;
        this.regionId = builder.regionId;
        this.spotStrategy = builder.spotStrategy;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePatternTypesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return architecture
     */
    public java.util.List < String > getArchitecture() {
        return this.architecture;
    }

    /**
     * @return burstablePerformance
     */
    public String getBurstablePerformance() {
        return this.burstablePerformance;
    }

    /**
     * @return channelId
     */
    public Long getChannelId() {
        return this.channelId;
    }

    /**
     * @return cores
     */
    public Integer getCores() {
        return this.cores;
    }

    /**
     * @return coresList
     */
    public java.util.List < Integer > getCoresList() {
        return this.coresList;
    }

    /**
     * @return excludedInstanceType
     */
    public java.util.List < String > getExcludedInstanceType() {
        return this.excludedInstanceType;
    }

    /**
     * @return instanceFamilyLevel
     */
    public String getInstanceFamilyLevel() {
        return this.instanceFamilyLevel;
    }

    /**
     * @return maxPrice
     */
    public Float getMaxPrice() {
        return this.maxPrice;
    }

    /**
     * @return memory
     */
    public Float getMemory() {
        return this.memory;
    }

    /**
     * @return memoryList
     */
    public java.util.List < Float > getMemoryList() {
        return this.memoryList;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return spotStrategy
     */
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    /**
     * @return vSwitchId
     */
    public java.util.List < String > getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<DescribePatternTypesRequest, Builder> {
        private java.util.List < String > architecture; 
        private String burstablePerformance; 
        private Long channelId; 
        private Integer cores; 
        private java.util.List < Integer > coresList; 
        private java.util.List < String > excludedInstanceType; 
        private String instanceFamilyLevel; 
        private Float maxPrice; 
        private Float memory; 
        private java.util.List < Float > memoryList; 
        private String regionId; 
        private String spotStrategy; 
        private java.util.List < String > vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePatternTypesRequest request) {
            super(request);
            this.architecture = request.architecture;
            this.burstablePerformance = request.burstablePerformance;
            this.channelId = request.channelId;
            this.cores = request.cores;
            this.coresList = request.coresList;
            this.excludedInstanceType = request.excludedInstanceType;
            this.instanceFamilyLevel = request.instanceFamilyLevel;
            this.maxPrice = request.maxPrice;
            this.memory = request.memory;
            this.memoryList = request.memoryList;
            this.regionId = request.regionId;
            this.spotStrategy = request.spotStrategy;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * Architecture.
         */
        public Builder architecture(java.util.List < String > architecture) {
            this.putQueryParameter("Architecture", architecture);
            this.architecture = architecture;
            return this;
        }

        /**
         * BurstablePerformance.
         */
        public Builder burstablePerformance(String burstablePerformance) {
            this.putQueryParameter("BurstablePerformance", burstablePerformance);
            this.burstablePerformance = burstablePerformance;
            return this;
        }

        /**
         * ChannelId.
         */
        public Builder channelId(Long channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * Cores.
         */
        public Builder cores(Integer cores) {
            this.putQueryParameter("Cores", cores);
            this.cores = cores;
            return this;
        }

        /**
         * CoresList.
         */
        public Builder coresList(java.util.List < Integer > coresList) {
            this.putQueryParameter("CoresList", coresList);
            this.coresList = coresList;
            return this;
        }

        /**
         * ExcludedInstanceType.
         */
        public Builder excludedInstanceType(java.util.List < String > excludedInstanceType) {
            this.putQueryParameter("ExcludedInstanceType", excludedInstanceType);
            this.excludedInstanceType = excludedInstanceType;
            return this;
        }

        /**
         * InstanceFamilyLevel.
         */
        public Builder instanceFamilyLevel(String instanceFamilyLevel) {
            this.putQueryParameter("InstanceFamilyLevel", instanceFamilyLevel);
            this.instanceFamilyLevel = instanceFamilyLevel;
            return this;
        }

        /**
         * MaxPrice.
         */
        public Builder maxPrice(Float maxPrice) {
            this.putQueryParameter("MaxPrice", maxPrice);
            this.maxPrice = maxPrice;
            return this;
        }

        /**
         * Memory.
         */
        public Builder memory(Float memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * MemoryList.
         */
        public Builder memoryList(java.util.List < Float > memoryList) {
            this.putQueryParameter("MemoryList", memoryList);
            this.memoryList = memoryList;
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

        /**
         * SpotStrategy.
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(java.util.List < String > vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public DescribePatternTypesRequest build() {
            return new DescribePatternTypesRequest(this);
        } 

    } 

}
