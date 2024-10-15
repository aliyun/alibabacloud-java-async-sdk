// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAvailableResourceRequest} extends {@link RequestModel}
 *
 * <p>DescribeAvailableResourceRequest</p>
 */
public class DescribeAvailableResourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationResource")
    @com.aliyun.core.annotation.Validation(required = true)
    private DestinationResource destinationResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotResource")
    private SpotResource spotResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DescribeAvailableResourceRequest(Builder builder) {
        super(builder);
        this.destinationResource = builder.destinationResource;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.spotResource = builder.spotResource;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destinationResource
     */
    public DestinationResource getDestinationResource() {
        return this.destinationResource;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return spotResource
     */
    public SpotResource getSpotResource() {
        return this.spotResource;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<DescribeAvailableResourceRequest, Builder> {
        private DestinationResource destinationResource; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private SpotResource spotResource; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAvailableResourceRequest request) {
            super(request);
            this.destinationResource = request.destinationResource;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.spotResource = request.spotResource;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The information about the resource that you want to query.</p>
         * <p>This parameter is required.</p>
         */
        public Builder destinationResource(DestinationResource destinationResource) {
            this.putQueryParameter("DestinationResource", destinationResource);
            this.destinationResource = destinationResource;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The region ID of the ECS instance families.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/146965.html">DescribeRegions</a> operation to query the most recent list of regions.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
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
         * <p>The information about the preemptible instances that you want to query.</p>
         */
        public Builder spotResource(SpotResource spotResource) {
            this.putQueryParameter("SpotResource", spotResource);
            this.spotResource = spotResource;
            return this;
        }

        /**
         * <p>The zone ID of the ECS instance families.</p>
         * <p>This parameter is empty by default, which indicates that ECS instance families available in all zones in the specified region are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-e</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DescribeAvailableResourceRequest build() {
            return new DescribeAvailableResourceRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAvailableResourceRequest} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceRequest</p>
     */
    public static class DestinationResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        @com.aliyun.core.annotation.Validation(required = true)
        private String category;

        @com.aliyun.core.annotation.NameInMap("Cores")
        private Float cores;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Float memory;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private DestinationResource(Builder builder) {
            this.category = builder.category;
            this.cores = builder.cores;
            this.memory = builder.memory;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DestinationResource create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return cores
         */
        public Float getCores() {
            return this.cores;
        }

        /**
         * @return memory
         */
        public Float getMemory() {
            return this.memory;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String category; 
            private Float cores; 
            private Float memory; 
            private String value; 

            /**
             * <p>The type of the resource. Valid values:</p>
             * <ul>
             * <li>InstanceTypeFamily: queries instance families. If you use this parameter value, you must also specify the Value parameter.</li>
             * <li>InstanceType: queries instance types. If you use this parameter value, you must also specify the Value, Cores, and Memory parameters.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>InstanceTypeFamily</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The number of vCPUs. This parameter is available only when the Category parameter is set to InstanceType.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cores(Float cores) {
                this.cores = cores;
                return this;
            }

            /**
             * <p>The size of the memory. Unit: GiB. This parameter is available only when the Category parameter is set to InstanceType.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>Instance families or instance types.</p>
             * <ul>
             * <li>If you set Category to InstanceTypeFamily, you must set this parameter to instance families such as ecs.c5.</li>
             * <li>If you set Category to InstanceType, you must set this parameter to instance types such as ecs.c5.large.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ecs.c6</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DestinationResource build() {
                return new DestinationResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAvailableResourceRequest} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceRequest</p>
     */
    public static class SpotResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SpotDuration")
        private Integer spotDuration;

        @com.aliyun.core.annotation.NameInMap("SpotPriceLimit")
        private Double spotPriceLimit;

        @com.aliyun.core.annotation.NameInMap("SpotStrategy")
        private String spotStrategy;

        private SpotResource(Builder builder) {
            this.spotDuration = builder.spotDuration;
            this.spotPriceLimit = builder.spotPriceLimit;
            this.spotStrategy = builder.spotStrategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpotResource create() {
            return builder().build();
        }

        /**
         * @return spotDuration
         */
        public Integer getSpotDuration() {
            return this.spotDuration;
        }

        /**
         * @return spotPriceLimit
         */
        public Double getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        /**
         * @return spotStrategy
         */
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public static final class Builder {
            private Integer spotDuration; 
            private Double spotPriceLimit; 
            private String spotStrategy; 

            /**
             * <p>The protection period of the preemptible instance. Unit: hours. Default value: 1. The value of 0 indicates no protection period.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder spotDuration(Integer spotDuration) {
                this.spotDuration = spotDuration;
                return this;
            }

            /**
             * <p>The maximum hourly price of the preemptible elastic container instance. The value can be accurate to three decimal places. If you set SpotStrategy to SpotWithPriceLimit, you must specify the SpotPriceLimit parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
             */
            public Builder spotPriceLimit(Double spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * <p>The bidding policy for the elastic container instance. Valid values:</p>
             * <ul>
             * <li>NoSpot: The instance is created as a regular pay-as-you-go instance.</li>
             * <li>SpotWithPriceLimit: The instance is created as a preemptible instance with a user-defined maximum hourly price.</li>
             * <li>SpotAsPriceGo: The instance is created as a preemptible instance for which the market price at the time of purchase is automatically used as the bid price.</li>
             * </ul>
             * <p>Default value: NoSpot.</p>
             * <blockquote>
             * <p>If you set this parameter to SpotWithPriceLimit or SpotAsPriceGo to query preemptible instances, you must set Category to InstanceType. You must also use the Value parameter to specify instance types, or use the Cores and Memory parameters to specify the number of vCPUs and memory size.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>SpotAsPriceGo</p>
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            public SpotResource build() {
                return new SpotResource(this);
            } 

        } 

    }
}
