// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribePairDrillsRequest} extends {@link RequestModel}
 *
 * <p>DescribePairDrillsRequest</p>
 */
public class DescribePairDrillsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrillId")
    private String drillId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PairId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pairId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DescribePairDrillsRequest(Builder builder) {
        super(builder);
        this.drillId = builder.drillId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.pairId = builder.pairId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePairDrillsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return drillId
     */
    public String getDrillId() {
        return this.drillId;
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
     * @return pairId
     */
    public String getPairId() {
        return this.pairId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribePairDrillsRequest, Builder> {
        private String drillId; 
        private Long maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String pairId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePairDrillsRequest request) {
            super(request);
            this.drillId = request.drillId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.pairId = request.pairId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the drill.</p>
         * 
         * <strong>example:</strong>
         * <p>drill-xxxx</p>
         */
        public Builder drillId(String drillId) {
            this.putQueryParameter("DrillId", drillId);
            this.drillId = drillId;
            return this;
        }

        /**
         * <p>The maximum number of entries to be returned. You can use this parameter together with NextToken.</p>
         * <p>Valid values: 1 to 500.</p>
         * <p>Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. Set the value to the NextToken value returned in the previous call to the DescribeDiskReplicaPairs operation. Leave this parameter empty the first time you call this operation. When you specify NextToken, the PageSize and PageNumber request parameters do not take effect and the TotalCount response parameter is invalid.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the replication pair. You can call the <a href="https://help.aliyun.com/document_detail/354206.html">DescribeDiskReplicaPairs</a> operation to query a list of asynchronous replication pairs, including replication pair IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pair-xxxx</p>
         */
        public Builder pairId(String pairId) {
            this.putQueryParameter("PairId", pairId);
            this.pairId = pairId;
            return this;
        }

        /**
         * <p>The region ID of the primary or secondary disk in the async replication pair. You can call the <a href="https://help.aliyun.com/document_detail/354276.html">DescribeRegions</a> operation to query the most recent list of regions in which async replication is supported.</p>
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
        public DescribePairDrillsRequest build() {
            return new DescribePairDrillsRequest(this);
        } 

    } 

}
