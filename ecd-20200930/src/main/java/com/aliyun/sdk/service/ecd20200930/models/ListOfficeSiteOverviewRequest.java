// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListOfficeSiteOverviewRequest} extends {@link RequestModel}
 *
 * <p>ListOfficeSiteOverviewRequest</p>
 */
public class ListOfficeSiteOverviewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceRefresh")
    private Boolean forceRefresh;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 1000)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    private java.util.List < String > officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryRange")
    private Integer queryRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>Specifies whether to refresh the cache.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder forceRefresh(Boolean forceRefresh) {
            this.putQueryParameter("ForceRefresh", forceRefresh);
            this.forceRefresh = forceRefresh;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * <ul>
         * <li>Valid values: 1 to 100</li>
         * <li>Default value: 10</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that determines the start point of the next query. If this is your first query or no next query is to be sent, skip this parameter. If a next query is to be sent, set the parameter to the value of NextToken that is returned from the last call.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The office network IDs. You can specify IDs of 1 to 100 office networks.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-363353****</p>
         */
        public Builder officeSiteId(java.util.List < String > officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * <p>The query scope. Cloud computers in a cloud computer pool are pooled cloud computers.</p>
         * <p>Default values:</p>
         * <ul>
         * <li>1 (default): queries non-pooled cloud computers in the office network.</li>
         * <li>2: queries pooled cloud computers in the office network.</li>
         * <li>3: queries all cloud computers in the office network.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder queryRange(Integer queryRange) {
            this.putQueryParameter("QueryRange", queryRange);
            this.queryRange = queryRange;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
        public ListOfficeSiteOverviewRequest build() {
            return new ListOfficeSiteOverviewRequest(this);
        } 

    } 

}
