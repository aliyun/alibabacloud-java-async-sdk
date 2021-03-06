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
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

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
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
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
        private Integer pageNumber; 
        private Integer pageSize; 
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
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.pairIds = request.pairIds;
            this.regionId = request.regionId;
            this.replicaGroupId = request.replicaGroupId;
            this.site = request.site;
        } 

        /**
         * ?????????????????????????????????????????????????????????1~500
         * <p>
         * 
         * ????????????10
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * ???????????????Token????????????????????????????????????????????????NextToken????????????????????????????????????????????????????????????????????????NextToken??????????????????PageSize???PageNumber?????????????????????????????????TotalCount?????????
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * ???????????????????????????
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * ???????????????????????????????????????
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ??????????????????ID?????????????????????????????????????????????????????????ID???????????????????????????pair-cn-dsa****,pair-cn-asd****???
         * <p>
         * 
         * ???????????????????????????????????????????????????????????????????????????
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
         * ???????????????id???
         */
        public Builder replicaGroupId(String replicaGroupId) {
            this.putQueryParameter("ReplicaGroupId", replicaGroupId);
            this.replicaGroupId = replicaGroupId;
            return this;
        }

        /**
         * production???backup?????????????????????????????????????????????????????????????????????????????????production???
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
