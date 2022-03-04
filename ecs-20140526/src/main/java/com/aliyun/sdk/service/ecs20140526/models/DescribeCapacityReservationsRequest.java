// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCapacityReservationsRequest} extends {@link RequestModel}
 *
 * <p>DescribeCapacityReservationsRequest</p>
 */
public class DescribeCapacityReservationsRequest extends Request {
    @Query
    @NameInMap("PrivatePoolOptions")
    private PrivatePoolOptions privatePoolOptions;

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("Platform")
    private String platform;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    private DescribeCapacityReservationsRequest(Builder builder) {
        super(builder);
        this.privatePoolOptions = builder.privatePoolOptions;
        this.sourceRegionId = builder.sourceRegionId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.tag = builder.tag;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.platform = builder.platform;
        this.instanceType = builder.instanceType;
        this.instanceChargeType = builder.instanceChargeType;
        this.status = builder.status;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCapacityReservationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return privatePoolOptions
     */
    public PrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<DescribeCapacityReservationsRequest, Builder> {
        private PrivatePoolOptions privatePoolOptions; 
        private String sourceRegionId; 
        private String regionId; 
        private String resourceGroupId; 
        private java.util.List < Tag> tag; 
        private Integer maxResults; 
        private String nextToken; 
        private String platform; 
        private String instanceType; 
        private String instanceChargeType; 
        private String status; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCapacityReservationsRequest request) {
            super(request);
            this.privatePoolOptions = request.privatePoolOptions;
            this.sourceRegionId = request.sourceRegionId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.tag = request.tag;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.platform = request.platform;
            this.instanceType = request.instanceType;
            this.instanceChargeType = request.instanceChargeType;
            this.status = request.status;
            this.zoneId = request.zoneId;
        } 

        /**
         * PrivatePoolOptions.
         */
        public Builder privatePoolOptions(PrivatePoolOptions privatePoolOptions) {
            this.putQueryParameter("PrivatePoolOptions", privatePoolOptions);
            this.privatePoolOptions = privatePoolOptions;
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
         * The ID of the region to which the capacity reservation service belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Tag list
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Maximum Value: 100.
         * 
         * Default value: 10.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The start flag of the capacity reservation service query. This parameter is obtained from the last request.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The operating system of the instance. Valid values:
         * <p>
         * 
         * -windows: queries only the capacity reservation service of the Windows system.
         * -linux: only check the capacity reservation service of the Linux system.
         * -all: queries all capacity reservation services.
         * 
         * Default value: all.
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * The instance type.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The billing method of the instance. Valid values:
         * <p>
         * 
         * -PostPaid: pay-as-you-go.
         * -PrePaid: subscription.
         * 
         * Default value: PostPaid.
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * The status of the subscription service. Valid values:
         * <p>
         * 
         * -All: All statuses.
         * -Pending: initialization. The scheduled capacity takes effect at the specified time will be initialized first.
         * -Preparing: Preparing. The capacity that takes effect at the specified time is scheduled to be in the preparing state during resource delivery.
         * -Prepared: to take effect. The capacity that takes effect at the specified time is scheduled to take effect before the resource delivery is completed and the service takes effect.
         * -Active: takes effect.
         * -Released: Released, including manual release and automatic release upon expiration.
         * 
         * The default value is Active.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The ID of the zone to which the capacity reservation service belongs.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DescribeCapacityReservationsRequest build() {
            return new DescribeCapacityReservationsRequest(this);
        } 

    } 

    public static class PrivatePoolOptions extends TeaModel {
        @NameInMap("Ids")
        private String ids;

        private PrivatePoolOptions(Builder builder) {
            this.ids = builder.ids;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivatePoolOptions create() {
            return builder().build();
        }

        /**
         * @return ids
         */
        public String getIds() {
            return this.ids;
        }

        public static final class Builder {
            private String ids; 

            /**
             * The ID of the subscription service. The value can be a JSON Array consisting of multiple ids. A maximum of 100 IDs can be entered. Separate IDs with commas (,).
             */
            public Builder ids(String ids) {
                this.ids = ids;
                return this;
            }

            public PrivatePoolOptions build() {
                return new PrivatePoolOptions(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * 标签键。N表示可以设置多个标签键进行过滤，N的取值范围为1~20。
             * <p>
             * 
             * 使用一个标签过滤资源，查询到该标签下的资源数量不能超过1000个；使用多个标签过滤资源，查询到同时绑定了多个标签的资源数量不能超过1000个。如果资源数量超过1000个，请使用[ListTagResources](~~110425~~)接口进行查询。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 标签值。N表示可以设置多个标签值进行过滤，N的取值范围为1~20。
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
