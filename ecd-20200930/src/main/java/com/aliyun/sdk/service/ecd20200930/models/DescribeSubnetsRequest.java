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
 * {@link DescribeSubnetsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSubnetsRequest</p>
 */
public class DescribeSubnetsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Eid")
    private String eid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubnetId")
    private String subnetId;

    private DescribeSubnetsRequest(Builder builder) {
        super(builder);
        this.eid = builder.eid;
        this.maxResults = builder.maxResults;
        this.name = builder.name;
        this.nextToken = builder.nextToken;
        this.officeSiteId = builder.officeSiteId;
        this.regionId = builder.regionId;
        this.subnetId = builder.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSubnetsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eid
     */
    public String getEid() {
        return this.eid;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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

    /**
     * @return subnetId
     */
    public String getSubnetId() {
        return this.subnetId;
    }

    public static final class Builder extends Request.Builder<DescribeSubnetsRequest, Builder> {
        private String eid; 
        private Integer maxResults; 
        private String name; 
        private String nextToken; 
        private String officeSiteId; 
        private String regionId; 
        private String subnetId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSubnetsRequest request) {
            super(request);
            this.eid = request.eid;
            this.maxResults = request.maxResults;
            this.name = request.name;
            this.nextToken = request.nextToken;
            this.officeSiteId = request.officeSiteId;
            this.regionId = request.regionId;
            this.subnetId = request.subnetId;
        } 

        /**
         * Eid.
         */
        public Builder eid(String eid) {
            this.putQueryParameter("Eid", eid);
            this.eid = eid;
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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SubnetId.
         */
        public Builder subnetId(String subnetId) {
            this.putQueryParameter("SubnetId", subnetId);
            this.subnetId = subnetId;
            return this;
        }

        @Override
        public DescribeSubnetsRequest build() {
            return new DescribeSubnetsRequest(this);
        } 

    } 

}
