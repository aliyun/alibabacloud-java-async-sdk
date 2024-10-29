// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcipam20230228.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListIpamPoolAllocationsRequest} extends {@link RequestModel}
 *
 * <p>ListIpamPoolAllocationsRequest</p>
 */
public class ListIpamPoolAllocationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cidr")
    private String cidr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpamPoolAllocationIds")
    private java.util.List < String > ipamPoolAllocationIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpamPoolAllocationName")
    private String ipamPoolAllocationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpamPoolId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipamPoolId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ListIpamPoolAllocationsRequest(Builder builder) {
        super(builder);
        this.cidr = builder.cidr;
        this.ipamPoolAllocationIds = builder.ipamPoolAllocationIds;
        this.ipamPoolAllocationName = builder.ipamPoolAllocationName;
        this.ipamPoolId = builder.ipamPoolId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIpamPoolAllocationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cidr
     */
    public String getCidr() {
        return this.cidr;
    }

    /**
     * @return ipamPoolAllocationIds
     */
    public java.util.List < String > getIpamPoolAllocationIds() {
        return this.ipamPoolAllocationIds;
    }

    /**
     * @return ipamPoolAllocationName
     */
    public String getIpamPoolAllocationName() {
        return this.ipamPoolAllocationName;
    }

    /**
     * @return ipamPoolId
     */
    public String getIpamPoolId() {
        return this.ipamPoolId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListIpamPoolAllocationsRequest, Builder> {
        private String cidr; 
        private java.util.List < String > ipamPoolAllocationIds; 
        private String ipamPoolAllocationName; 
        private String ipamPoolId; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListIpamPoolAllocationsRequest request) {
            super(request);
            this.cidr = request.cidr;
            this.ipamPoolAllocationIds = request.ipamPoolAllocationIds;
            this.ipamPoolAllocationName = request.ipamPoolAllocationName;
            this.ipamPoolId = request.ipamPoolId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
        } 

        /**
         * Cidr.
         */
        public Builder cidr(String cidr) {
            this.putQueryParameter("Cidr", cidr);
            this.cidr = cidr;
            return this;
        }

        /**
         * IpamPoolAllocationIds.
         */
        public Builder ipamPoolAllocationIds(java.util.List < String > ipamPoolAllocationIds) {
            this.putQueryParameter("IpamPoolAllocationIds", ipamPoolAllocationIds);
            this.ipamPoolAllocationIds = ipamPoolAllocationIds;
            return this;
        }

        /**
         * IpamPoolAllocationName.
         */
        public Builder ipamPoolAllocationName(String ipamPoolAllocationName) {
            this.putQueryParameter("IpamPoolAllocationName", ipamPoolAllocationName);
            this.ipamPoolAllocationName = ipamPoolAllocationName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-pool-6rcq3tobayc20t****</p>
         */
        public Builder ipamPoolId(String ipamPoolId) {
            this.putQueryParameter("IpamPoolId", ipamPoolId);
            this.ipamPoolId = ipamPoolId;
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
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
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

        @Override
        public ListIpamPoolAllocationsRequest build() {
            return new ListIpamPoolAllocationsRequest(this);
        } 

    } 

}
