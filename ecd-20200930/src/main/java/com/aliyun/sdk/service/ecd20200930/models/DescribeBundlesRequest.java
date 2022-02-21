// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBundlesRequest} extends {@link RequestModel}
 *
 * <p>DescribeBundlesRequest</p>
 */
public class DescribeBundlesRequest extends Request {
    @Query
    @NameInMap("BundleId")
    private java.util.List < String > bundleId;

    @Query
    @NameInMap("BundleType")
    private String bundleType;

    @Query
    @NameInMap("CheckStock")
    private Boolean checkStock;

    @Query
    @NameInMap("CpuCount")
    private Integer cpuCount;

    @Query
    @NameInMap("DesktopTypeFamily")
    private String desktopTypeFamily;

    @Query
    @NameInMap("FromDesktopGroup")
    private Boolean fromDesktopGroup;

    @Query
    @NameInMap("GpuCount")
    private Float gpuCount;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 500)
    private Integer maxResults;

    @Query
    @NameInMap("MemorySize")
    private Integer memorySize;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("ProtocolType")
    private String protocolType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DescribeBundlesRequest(Builder builder) {
        super(builder);
        this.bundleId = builder.bundleId;
        this.bundleType = builder.bundleType;
        this.checkStock = builder.checkStock;
        this.cpuCount = builder.cpuCount;
        this.desktopTypeFamily = builder.desktopTypeFamily;
        this.fromDesktopGroup = builder.fromDesktopGroup;
        this.gpuCount = builder.gpuCount;
        this.maxResults = builder.maxResults;
        this.memorySize = builder.memorySize;
        this.nextToken = builder.nextToken;
        this.protocolType = builder.protocolType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBundlesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bundleId
     */
    public java.util.List < String > getBundleId() {
        return this.bundleId;
    }

    /**
     * @return bundleType
     */
    public String getBundleType() {
        return this.bundleType;
    }

    /**
     * @return checkStock
     */
    public Boolean getCheckStock() {
        return this.checkStock;
    }

    /**
     * @return cpuCount
     */
    public Integer getCpuCount() {
        return this.cpuCount;
    }

    /**
     * @return desktopTypeFamily
     */
    public String getDesktopTypeFamily() {
        return this.desktopTypeFamily;
    }

    /**
     * @return fromDesktopGroup
     */
    public Boolean getFromDesktopGroup() {
        return this.fromDesktopGroup;
    }

    /**
     * @return gpuCount
     */
    public Float getGpuCount() {
        return this.gpuCount;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return memorySize
     */
    public Integer getMemorySize() {
        return this.memorySize;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return protocolType
     */
    public String getProtocolType() {
        return this.protocolType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeBundlesRequest, Builder> {
        private java.util.List < String > bundleId; 
        private String bundleType; 
        private Boolean checkStock; 
        private Integer cpuCount; 
        private String desktopTypeFamily; 
        private Boolean fromDesktopGroup; 
        private Float gpuCount; 
        private Integer maxResults; 
        private Integer memorySize; 
        private String nextToken; 
        private String protocolType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBundlesRequest response) {
            super(response);
            this.bundleId = response.bundleId;
            this.bundleType = response.bundleType;
            this.checkStock = response.checkStock;
            this.cpuCount = response.cpuCount;
            this.desktopTypeFamily = response.desktopTypeFamily;
            this.fromDesktopGroup = response.fromDesktopGroup;
            this.gpuCount = response.gpuCount;
            this.maxResults = response.maxResults;
            this.memorySize = response.memorySize;
            this.nextToken = response.nextToken;
            this.protocolType = response.protocolType;
            this.regionId = response.regionId;
        } 

        /**
         * BundleId.
         */
        public Builder bundleId(java.util.List < String > bundleId) {
            this.putQueryParameter("BundleId", bundleId);
            this.bundleId = bundleId;
            return this;
        }

        /**
         * BundleType.
         */
        public Builder bundleType(String bundleType) {
            this.putQueryParameter("BundleType", bundleType);
            this.bundleType = bundleType;
            return this;
        }

        /**
         * CheckStock.
         */
        public Builder checkStock(Boolean checkStock) {
            this.putQueryParameter("CheckStock", checkStock);
            this.checkStock = checkStock;
            return this;
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
         * DesktopTypeFamily.
         */
        public Builder desktopTypeFamily(String desktopTypeFamily) {
            this.putQueryParameter("DesktopTypeFamily", desktopTypeFamily);
            this.desktopTypeFamily = desktopTypeFamily;
            return this;
        }

        /**
         * FromDesktopGroup.
         */
        public Builder fromDesktopGroup(Boolean fromDesktopGroup) {
            this.putQueryParameter("FromDesktopGroup", fromDesktopGroup);
            this.fromDesktopGroup = fromDesktopGroup;
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
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
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
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * ProtocolType.
         */
        public Builder protocolType(String protocolType) {
            this.putQueryParameter("ProtocolType", protocolType);
            this.protocolType = protocolType;
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
        public DescribeBundlesRequest build() {
            return new DescribeBundlesRequest(this);
        } 

    } 

}
