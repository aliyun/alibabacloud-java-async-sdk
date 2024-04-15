// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNetworkPackagesRequest} extends {@link RequestModel}
 *
 * <p>DescribeNetworkPackagesRequest</p>
 */
public class DescribeNetworkPackagesRequest extends Request {
    @Query
    @NameInMap("InternetChargeType")
    private String internetChargeType;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("NetworkPackageId")
    private java.util.List < String > networkPackageId;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DescribeNetworkPackagesRequest(Builder builder) {
        super(builder);
        this.internetChargeType = builder.internetChargeType;
        this.maxResults = builder.maxResults;
        this.networkPackageId = builder.networkPackageId;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkPackagesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return networkPackageId
     */
    public java.util.List < String > getNetworkPackageId() {
        return this.networkPackageId;
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

    public static final class Builder extends Request.Builder<DescribeNetworkPackagesRequest, Builder> {
        private String internetChargeType; 
        private Integer maxResults; 
        private java.util.List < String > networkPackageId; 
        private String nextToken; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNetworkPackagesRequest request) {
            super(request);
            this.internetChargeType = request.internetChargeType;
            this.maxResults = request.maxResults;
            this.networkPackageId = request.networkPackageId;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
        } 

        /**
         * The charge type of the pay-as-you-go premium bandwidth plan.
         * <p>
         * 
         * Valid values:
         * 
         * *   PayByTraffic: charges by data transfer.
         * 
         * *   PayByBandwidth: charges by fixed bandwidth.
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * *   Maximum value: 100
         * *   Default value: 10
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The ID of the premium bandwidth plan. You can specify 1 to 100 IDs.
         */
        public Builder networkPackageId(java.util.List < String > networkPackageId) {
            this.putQueryParameter("NetworkPackageId", networkPackageId);
            this.networkPackageId = networkPackageId;
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
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeNetworkPackagesRequest build() {
            return new DescribeNetworkPackagesRequest(this);
        } 

    } 

}
