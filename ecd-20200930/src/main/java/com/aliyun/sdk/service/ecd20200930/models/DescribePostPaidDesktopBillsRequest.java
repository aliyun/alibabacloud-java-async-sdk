// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePostPaidDesktopBillsRequest} extends {@link RequestModel}
 *
 * <p>DescribePostPaidDesktopBillsRequest</p>
 */
public class DescribePostPaidDesktopBillsRequest extends Request {
    @Query
    @NameInMap("BillEndTime")
    @Validation(required = true)
    private String billEndTime;

    @Query
    @NameInMap("BillStartTime")
    @Validation(required = true)
    private String billStartTime;

    @Query
    @NameInMap("DesktopGroupId")
    @Validation(required = true)
    private String desktopGroupId;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DescribePostPaidDesktopBillsRequest(Builder builder) {
        super(builder);
        this.billEndTime = builder.billEndTime;
        this.billStartTime = builder.billStartTime;
        this.desktopGroupId = builder.desktopGroupId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePostPaidDesktopBillsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billEndTime
     */
    public String getBillEndTime() {
        return this.billEndTime;
    }

    /**
     * @return billStartTime
     */
    public String getBillStartTime() {
        return this.billStartTime;
    }

    /**
     * @return desktopGroupId
     */
    public String getDesktopGroupId() {
        return this.desktopGroupId;
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

    public static final class Builder extends Request.Builder<DescribePostPaidDesktopBillsRequest, Builder> {
        private String billEndTime; 
        private String billStartTime; 
        private String desktopGroupId; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePostPaidDesktopBillsRequest response) {
            super(response);
            this.billEndTime = response.billEndTime;
            this.billStartTime = response.billStartTime;
            this.desktopGroupId = response.desktopGroupId;
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
            this.regionId = response.regionId;
        } 

        /**
         * BillEndTime.
         */
        public Builder billEndTime(String billEndTime) {
            this.putQueryParameter("BillEndTime", billEndTime);
            this.billEndTime = billEndTime;
            return this;
        }

        /**
         * BillStartTime.
         */
        public Builder billStartTime(String billStartTime) {
            this.putQueryParameter("BillStartTime", billStartTime);
            this.billStartTime = billStartTime;
            return this;
        }

        /**
         * DesktopGroupId.
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.putQueryParameter("DesktopGroupId", desktopGroupId);
            this.desktopGroupId = desktopGroupId;
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
        public DescribePostPaidDesktopBillsRequest build() {
            return new DescribePostPaidDesktopBillsRequest(this);
        } 

    } 

}
