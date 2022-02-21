// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDedicatedBlockStorageClustersRequest} extends {@link RequestModel}
 *
 * <p>DescribeDedicatedBlockStorageClustersRequest</p>
 */
public class DescribeDedicatedBlockStorageClustersRequest extends Request {
    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("DedicatedBlockStorageClusterId")
    private java.util.List < String > dedicatedBlockStorageClusterId;

    @Query
    @NameInMap("Status")
    private java.util.List < String > status;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Category")
    private String category;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    private DescribeDedicatedBlockStorageClustersRequest(Builder builder) {
        super(builder);
        this.resourceOwnerId = builder.resourceOwnerId;
        this.dedicatedBlockStorageClusterId = builder.dedicatedBlockStorageClusterId;
        this.status = builder.status;
        this.regionId = builder.regionId;
        this.category = builder.category;
        this.nextToken = builder.nextToken;
        this.maxResults = builder.maxResults;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDedicatedBlockStorageClustersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return dedicatedBlockStorageClusterId
     */
    public java.util.List < String > getDedicatedBlockStorageClusterId() {
        return this.dedicatedBlockStorageClusterId;
    }

    /**
     * @return status
     */
    public java.util.List < String > getStatus() {
        return this.status;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
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
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<DescribeDedicatedBlockStorageClustersRequest, Builder> {
        private Long resourceOwnerId; 
        private java.util.List < String > dedicatedBlockStorageClusterId; 
        private java.util.List < String > status; 
        private String regionId; 
        private String category; 
        private String nextToken; 
        private Integer maxResults; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDedicatedBlockStorageClustersRequest response) {
            super(response);
            this.resourceOwnerId = response.resourceOwnerId;
            this.dedicatedBlockStorageClusterId = response.dedicatedBlockStorageClusterId;
            this.status = response.status;
            this.regionId = response.regionId;
            this.category = response.category;
            this.nextToken = response.nextToken;
            this.maxResults = response.maxResults;
            this.zoneId = response.zoneId;
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
         * DedicatedBlockStorageClusterId.
         */
        public Builder dedicatedBlockStorageClusterId(java.util.List < String > dedicatedBlockStorageClusterId) {
            this.putQueryParameter("DedicatedBlockStorageClusterId", dedicatedBlockStorageClusterId);
            this.dedicatedBlockStorageClusterId = dedicatedBlockStorageClusterId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(java.util.List < String > status) {
            this.putQueryParameter("Status", status);
            this.status = status;
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
         * The type of cloud disk that can be created in the exclusive block storage cluster.
         * <p>
         * 
         * The value can only be cloud_essd, that is, ESSD.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * Query the credential (Token). The value of this parameter is the NextToken value returned by the last call to the API. You do not need to set this parameter when you call the API for the first time.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The maximum number of entries to return on each page. Maximum Value: 500
         * <p>
         * 
         * Default value: 10
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * Available area ID, you can call the [DescribeZones](~~ 25610 ~~) get available area list.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DescribeDedicatedBlockStorageClustersRequest build() {
            return new DescribeDedicatedBlockStorageClustersRequest(this);
        } 

    } 

}
