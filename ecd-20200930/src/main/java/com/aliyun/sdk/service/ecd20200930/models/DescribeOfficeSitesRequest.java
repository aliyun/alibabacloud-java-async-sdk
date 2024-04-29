// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOfficeSitesRequest} extends {@link RequestModel}
 *
 * <p>DescribeOfficeSitesRequest</p>
 */
public class DescribeOfficeSitesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 500)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    private java.util.List < String > officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteType")
    private String officeSiteType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeOfficeSitesRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.officeSiteId = builder.officeSiteId;
        this.officeSiteType = builder.officeSiteType;
        this.regionId = builder.regionId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOfficeSitesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return officeSiteType
     */
    public String getOfficeSiteType() {
        return this.officeSiteType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeOfficeSitesRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List < String > officeSiteId; 
        private String officeSiteType; 
        private String regionId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOfficeSitesRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.officeSiteId = request.officeSiteId;
            this.officeSiteType = request.officeSiteType;
            this.regionId = request.regionId;
            this.status = request.status;
        } 

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * *   Maximum value: 100.
         * *   Default value: 10.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that determines the start point of the next query.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The office network IDs. You can specify the IDs of 1 to 100 office networks.
         */
        public Builder officeSiteId(java.util.List < String > officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * The account type of the office network.
         * <p>
         * 
         * Valid values:
         * 
         * *   SIMPLE: convenience account
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   AD_CONNECTOR: enterprise Active Directory (AD) account
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder officeSiteType(String officeSiteType) {
            this.putQueryParameter("OfficeSiteType", officeSiteType);
            this.officeSiteType = officeSiteType;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The office network status.
         * <p>
         * 
         * Valid values:
         * 
         * *   REGISTERING: The office network is being registered.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   DEREGISTERING: The office network is being deregistered.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   REGISTERED: The office network is registered.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   NEEDCONFIGTRUST: A trust relationship is required for the office network.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   CONFIGTRUSTFAILED: A trust relationship fails to be configured for the office network.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   DEREGISTERED: The office network is deregistered.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   ERROR: One or more configurations of the office network are invalid.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   CONFIGTRUSTING: A trust relationship is being configured for the office network.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   NEEDCONFIGUSER: Users are required for the office network.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeOfficeSitesRequest build() {
            return new DescribeOfficeSitesRequest(this);
        } 

    } 

}
