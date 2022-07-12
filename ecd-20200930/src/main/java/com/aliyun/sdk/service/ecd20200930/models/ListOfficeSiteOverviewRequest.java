// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOfficeSiteOverviewRequest} extends {@link RequestModel}
 *
 * <p>ListOfficeSiteOverviewRequest</p>
 */
public class ListOfficeSiteOverviewRequest extends Request {
    @Query
    @NameInMap("ForceRefresh")
    private Boolean forceRefresh;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("OfficeSiteId")
    private java.util.List < String > officeSiteId;

    @Query
    @NameInMap("QueryRange")
    private Integer queryRange;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ListOfficeSiteOverviewRequest(Builder builder) {
        super(builder);
        this.forceRefresh = builder.forceRefresh;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.officeSiteId = builder.officeSiteId;
        this.queryRange = builder.queryRange;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOfficeSiteOverviewRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forceRefresh
     */
    public Boolean getForceRefresh() {
        return this.forceRefresh;
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
     * @return officeSiteId
     */
    public java.util.List < String > getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return queryRange
     */
    public Integer getQueryRange() {
        return this.queryRange;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListOfficeSiteOverviewRequest, Builder> {
        private Boolean forceRefresh; 
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List < String > officeSiteId; 
        private Integer queryRange; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListOfficeSiteOverviewRequest request) {
            super(request);
            this.forceRefresh = request.forceRefresh;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.officeSiteId = request.officeSiteId;
            this.queryRange = request.queryRange;
            this.regionId = request.regionId;
        } 

        /**
         * ForceRefresh.
         */
        public Builder forceRefresh(Boolean forceRefresh) {
            this.putQueryParameter("ForceRefresh", forceRefresh);
            this.forceRefresh = forceRefresh;
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
         * OfficeSiteId.
         */
        public Builder officeSiteId(java.util.List < String > officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * QueryRange.
         */
        public Builder queryRange(Integer queryRange) {
            this.putQueryParameter("QueryRange", queryRange);
            this.queryRange = queryRange;
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
        public ListOfficeSiteOverviewRequest build() {
            return new ListOfficeSiteOverviewRequest(this);
        } 

    } 

}
