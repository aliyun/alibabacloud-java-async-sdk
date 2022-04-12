// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiskReplicaPairsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDiskReplicaPairsRequest</p>
 */
public class DescribeDiskReplicaPairsRequest extends Request {
    @Query
    @NameInMap("MaxResults")
    private Long maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("PairIds")
    private String pairIds;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ReplicaGroupId")
    private String replicaGroupId;

    @Query
    @NameInMap("Site")
    private String site;

    private DescribeDiskReplicaPairsRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pairIds = builder.pairIds;
        this.regionId = builder.regionId;
        this.replicaGroupId = builder.replicaGroupId;
        this.site = builder.site;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiskReplicaPairsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pairIds
     */
    public String getPairIds() {
        return this.pairIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return replicaGroupId
     */
    public String getReplicaGroupId() {
        return this.replicaGroupId;
    }

    /**
     * @return site
     */
    public String getSite() {
        return this.site;
    }

    public static final class Builder extends Request.Builder<DescribeDiskReplicaPairsRequest, Builder> {
        private Long maxResults; 
        private String nextToken; 
        private String pairIds; 
        private String regionId; 
        private String replicaGroupId; 
        private String site; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDiskReplicaPairsRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.pairIds = request.pairIds;
            this.regionId = request.regionId;
            this.replicaGroupId = request.replicaGroupId;
            this.site = request.site;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
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
         * PairIds.
         */
        public Builder pairIds(String pairIds) {
            this.putQueryParameter("PairIds", pairIds);
            this.pairIds = pairIds;
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
         * ReplicaGroupId.
         */
        public Builder replicaGroupId(String replicaGroupId) {
            this.putQueryParameter("ReplicaGroupId", replicaGroupId);
            this.replicaGroupId = replicaGroupId;
            return this;
        }

        /**
         * production或backup，表示数据从主或备站点获取，默认为production。
         */
        public Builder site(String site) {
            this.putQueryParameter("Site", site);
            this.site = site;
            return this;
        }

        @Override
        public DescribeDiskReplicaPairsRequest build() {
            return new DescribeDiskReplicaPairsRequest(this);
        } 

    } 

}
