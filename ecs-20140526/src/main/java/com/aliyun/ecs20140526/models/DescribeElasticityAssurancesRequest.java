// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeElasticityAssurancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeElasticityAssurancesRequest</p>
 */
public class DescribeElasticityAssurancesRequest extends Request {
    @NameInMap("PrivatePoolOptions")
    private PrivatePoolOptions privatePoolOptions;

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("Platform")
    private String platform;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    private DescribeElasticityAssurancesRequest(Builder builder) {
        super(builder);
        this.privatePoolOptions = builder.privatePoolOptions;
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tag = builder.tag;
        this.platform = builder.platform;
        this.resourceGroupId = builder.resourceGroupId;
        this.regionId = builder.regionId;
        this.instanceType = builder.instanceType;
        this.zoneId = builder.zoneId;
        this.nextToken = builder.nextToken;
        this.maxResults = builder.maxResults;
        this.status = builder.status;
        this.instanceChargeType = builder.instanceChargeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeElasticityAssurancesRequest create() {
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public static final class Builder extends Request.Builder<DescribeElasticityAssurancesRequest, Builder> {
        private PrivatePoolOptions privatePoolOptions; 
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private java.util.List < Tag> tag; 
        private String platform; 
        private String resourceGroupId; 
        private String regionId; 
        private String instanceType; 
        private String zoneId; 
        private String nextToken; 
        private Integer maxResults; 
        private String status; 
        private String instanceChargeType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeElasticityAssurancesRequest response) {
            super(response);
            this.privatePoolOptions = response.privatePoolOptions;
            this.sourceRegionId = response.sourceRegionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.tag = response.tag;
            this.platform = response.platform;
            this.resourceGroupId = response.resourceGroupId;
            this.regionId = response.regionId;
            this.instanceType = response.instanceType;
            this.zoneId = response.zoneId;
            this.nextToken = response.nextToken;
            this.maxResults = response.maxResults;
            this.status = response.status;
            this.instanceChargeType = response.instanceChargeType;
        } 

        /**
         * PrivatePoolOptions.
         */
        public Builder privatePoolOptions(PrivatePoolOptions privatePoolOptions) {
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * Platform.
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
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
         * The ID of the region to which the elastic Protection Service belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * The ID of the zone to which the elastic Protection Service belongs.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * The start flag of the query. This parameter is obtained from the last request.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
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
         * The status of the elastic protection service. Valid values:
         * <p>
         * 
         * -All: All statuses.
         * -Preparing: Preparing.
         * -Prepared: to take effect.
         * -Active: takes effect.
         * -Released: Released.
         * 
         * The default value is Active.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The billing method of the instance. Set the value to PostPaid. Currently, only pay-as-you-go is supported.
         * <p>
         * 
         * Default value: PostPaid.
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        @Override
        public DescribeElasticityAssurancesRequest build() {
            return new DescribeElasticityAssurancesRequest(this);
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
             * The list of elastic protection service IDs. The value can be a JSON Array consisting of multiple ids. A maximum of 100 IDs can be entered. Separate IDs with commas (,).
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
             * 标签值。N表示可以设置多个标签键进行过滤，N的取值范围为1~20。
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
