// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeVirtualMFADevicesRequest} extends {@link RequestModel}
 *
 * <p>DescribeVirtualMFADevicesRequest</p>
 */
public class DescribeVirtualMFADevicesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private java.util.List<String> endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 500)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DescribeVirtualMFADevicesRequest(Builder builder) {
        super(builder);
        this.endUserId = builder.endUserId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.officeSiteId = builder.officeSiteId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVirtualMFADevicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endUserId
     */
    public java.util.List<String> getEndUserId() {
        return this.endUserId;
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
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeVirtualMFADevicesRequest, Builder> {
        private java.util.List<String> endUserId; 
        private Integer maxResults; 
        private String nextToken; 
        private String officeSiteId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVirtualMFADevicesRequest request) {
            super(request);
            this.endUserId = request.endUserId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.officeSiteId = request.officeSiteId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The names of the AD users.</p>
         * 
         * <strong>example:</strong>
         * <p>testuser</p>
         */
        public Builder endUserId(java.util.List<String> endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 500. Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
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
         * <p>The ID of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-269345****</p>
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
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
        public DescribeVirtualMFADevicesRequest build() {
            return new DescribeVirtualMFADevicesRequest(this);
        } 

    } 

}
