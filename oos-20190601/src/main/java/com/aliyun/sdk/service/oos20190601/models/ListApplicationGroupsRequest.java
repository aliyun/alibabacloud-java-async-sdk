// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApplicationGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListApplicationGroupsRequest</p>
 */
public class ListApplicationGroupsRequest extends Request {
    @Query
    @NameInMap("ApplicationName")
    @Validation(required = true)
    private String applicationName;

    @Query
    @NameInMap("DeployRegionId")
    private String deployRegionId;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private ListApplicationGroupsRequest(Builder builder) {
        super(builder);
        this.applicationName = builder.applicationName;
        this.deployRegionId = builder.deployRegionId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationName
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * @return deployRegionId
     */
    public String getDeployRegionId() {
        return this.deployRegionId;
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

    public static final class Builder extends Request.Builder<ListApplicationGroupsRequest, Builder> {
        private String applicationName; 
        private String deployRegionId; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListApplicationGroupsRequest response) {
            super(response);
            this.applicationName = response.applicationName;
            this.deployRegionId = response.deployRegionId;
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
            this.regionId = response.regionId;
        } 

        /**
         * ApplicationName.
         */
        public Builder applicationName(String applicationName) {
            this.putQueryParameter("ApplicationName", applicationName);
            this.applicationName = applicationName;
            return this;
        }

        /**
         * DeployRegionId.
         */
        public Builder deployRegionId(String deployRegionId) {
            this.putQueryParameter("DeployRegionId", deployRegionId);
            this.deployRegionId = deployRegionId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListApplicationGroupsRequest build() {
            return new ListApplicationGroupsRequest(this);
        } 

    } 

}
