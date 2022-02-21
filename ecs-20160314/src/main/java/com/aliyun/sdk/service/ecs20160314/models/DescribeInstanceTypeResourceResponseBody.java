// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceTypeResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceTypeResourceResponseBody</p>
 */
public class DescribeInstanceTypeResourceResponseBody extends TeaModel {
    @NameInMap("InstanceTypeResources")
    private InstanceTypeResources instanceTypeResources;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    private Integer totalCount;

    private DescribeInstanceTypeResourceResponseBody(Builder builder) {
        this.instanceTypeResources = builder.instanceTypeResources;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceTypeResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceTypeResources
     */
    public InstanceTypeResources getInstanceTypeResources() {
        return this.instanceTypeResources;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private InstanceTypeResources instanceTypeResources; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * InstanceTypeResources.
         */
        public Builder instanceTypeResources(InstanceTypeResources instanceTypeResources) {
            this.instanceTypeResources = instanceTypeResources;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstanceTypeResourceResponseBody build() {
            return new DescribeInstanceTypeResourceResponseBody(this);
        } 

    } 

    public static class StockHealth extends TeaModel {
        @NameInMap("AdequacyScore")
        private Integer adequacyScore;

        @NameInMap("HealthScore")
        private Integer healthScore;

        @NameInMap("HotScore")
        private Integer hotScore;

        @NameInMap("SupplyScore")
        private Integer supplyScore;

        private StockHealth(Builder builder) {
            this.adequacyScore = builder.adequacyScore;
            this.healthScore = builder.healthScore;
            this.hotScore = builder.hotScore;
            this.supplyScore = builder.supplyScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StockHealth create() {
            return builder().build();
        }

        /**
         * @return adequacyScore
         */
        public Integer getAdequacyScore() {
            return this.adequacyScore;
        }

        /**
         * @return healthScore
         */
        public Integer getHealthScore() {
            return this.healthScore;
        }

        /**
         * @return hotScore
         */
        public Integer getHotScore() {
            return this.hotScore;
        }

        /**
         * @return supplyScore
         */
        public Integer getSupplyScore() {
            return this.supplyScore;
        }

        public static final class Builder {
            private Integer adequacyScore; 
            private Integer healthScore; 
            private Integer hotScore; 
            private Integer supplyScore; 

            /**
             * AdequacyScore.
             */
            public Builder adequacyScore(Integer adequacyScore) {
                this.adequacyScore = adequacyScore;
                return this;
            }

            /**
             * HealthScore.
             */
            public Builder healthScore(Integer healthScore) {
                this.healthScore = healthScore;
                return this;
            }

            /**
             * HotScore.
             */
            public Builder hotScore(Integer hotScore) {
                this.hotScore = hotScore;
                return this;
            }

            /**
             * SupplyScore.
             */
            public Builder supplyScore(Integer supplyScore) {
                this.supplyScore = supplyScore;
                return this;
            }

            public StockHealth build() {
                return new StockHealth(this);
            } 

        } 

    }
    public static class InstanceTypeResource extends TeaModel {
        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("InstanceTypeFamily")
        private String instanceTypeFamily;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SearchType")
        private String searchType;

        @NameInMap("StockHealth")
        private StockHealth stockHealth;

        @NameInMap("TotalQuota")
        private Long totalQuota;

        @NameInMap("ZoneId")
        private String zoneId;

        private InstanceTypeResource(Builder builder) {
            this.instanceType = builder.instanceType;
            this.instanceTypeFamily = builder.instanceTypeFamily;
            this.regionId = builder.regionId;
            this.searchType = builder.searchType;
            this.stockHealth = builder.stockHealth;
            this.totalQuota = builder.totalQuota;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypeResource create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return instanceTypeFamily
         */
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return searchType
         */
        public String getSearchType() {
            return this.searchType;
        }

        /**
         * @return stockHealth
         */
        public StockHealth getStockHealth() {
            return this.stockHealth;
        }

        /**
         * @return totalQuota
         */
        public Long getTotalQuota() {
            return this.totalQuota;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String instanceType; 
            private String instanceTypeFamily; 
            private String regionId; 
            private String searchType; 
            private StockHealth stockHealth; 
            private Long totalQuota; 
            private String zoneId; 

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * InstanceTypeFamily.
             */
            public Builder instanceTypeFamily(String instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * SearchType.
             */
            public Builder searchType(String searchType) {
                this.searchType = searchType;
                return this;
            }

            /**
             * StockHealth.
             */
            public Builder stockHealth(StockHealth stockHealth) {
                this.stockHealth = stockHealth;
                return this;
            }

            /**
             * TotalQuota.
             */
            public Builder totalQuota(Long totalQuota) {
                this.totalQuota = totalQuota;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public InstanceTypeResource build() {
                return new InstanceTypeResource(this);
            } 

        } 

    }
    public static class InstanceTypeResources extends TeaModel {
        @NameInMap("InstanceTypeResource")
        private java.util.List < InstanceTypeResource> instanceTypeResource;

        private InstanceTypeResources(Builder builder) {
            this.instanceTypeResource = builder.instanceTypeResource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypeResources create() {
            return builder().build();
        }

        /**
         * @return instanceTypeResource
         */
        public java.util.List < InstanceTypeResource> getInstanceTypeResource() {
            return this.instanceTypeResource;
        }

        public static final class Builder {
            private java.util.List < InstanceTypeResource> instanceTypeResource; 

            /**
             * InstanceTypeResource.
             */
            public Builder instanceTypeResource(java.util.List < InstanceTypeResource> instanceTypeResource) {
                this.instanceTypeResource = instanceTypeResource;
                return this;
            }

            public InstanceTypeResources build() {
                return new InstanceTypeResources(this);
            } 

        } 

    }
}
