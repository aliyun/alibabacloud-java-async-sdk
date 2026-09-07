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
 * {@link DescribeOfficeSitesRequest} extends {@link RequestModel}
 *
 * <p>DescribeOfficeSitesRequest</p>
 */
public class DescribeOfficeSitesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountType")
    private String accountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 500)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    private java.util.List<String> officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteType")
    private String officeSiteType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityProtection")
    private String securityProtection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private DescribeOfficeSitesRequest(Builder builder) {
        super(builder);
        this.accountType = builder.accountType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.officeSiteId = builder.officeSiteId;
        this.officeSiteType = builder.officeSiteType;
        this.regionId = builder.regionId;
        this.securityProtection = builder.securityProtection;
        this.status = builder.status;
        this.vpcId = builder.vpcId;
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
     * @return accountType
     */
    public String getAccountType() {
        return this.accountType;
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
    public java.util.List<String> getOfficeSiteId() {
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
     * @return securityProtection
     */
    public String getSecurityProtection() {
        return this.securityProtection;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<DescribeOfficeSitesRequest, Builder> {
        private String accountType; 
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<String> officeSiteId; 
        private String officeSiteType; 
        private String regionId; 
        private String securityProtection; 
        private String status; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOfficeSitesRequest request) {
            super(request);
            this.accountType = request.accountType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.officeSiteId = request.officeSiteId;
            this.officeSiteType = request.officeSiteType;
            this.regionId = request.regionId;
            this.securityProtection = request.securityProtection;
            this.status = request.status;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>The account type.</p>
         * 
         * <strong>example:</strong>
         * <p>SIMPLE</p>
         */
        public Builder accountType(String accountType) {
            this.putQueryParameter("AccountType", accountType);
            this.accountType = accountType;
            return this;
        }

        /**
         * <p>The number of entries per page for a paginated query.    </p>
         * <ul>
         * <li>Maximum value: 100.    </li>
         * <li>Default value: 10.</li>
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
         * <p>The token for the next query.</p>
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
         * <p>The office network ID. You can specify 1 to 100 IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-363353****</p>
         */
        public Builder officeSiteId(java.util.List<String> officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * <p>The account system type of the office network.</p>
         * 
         * <strong>example:</strong>
         * <p>SIMPLE</p>
         */
        public Builder officeSiteType(String officeSiteType) {
            this.putQueryParameter("OfficeSiteType", officeSiteType);
            this.officeSiteType = officeSiteType;
            return this;
        }

        /**
         * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
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

        /**
         * <p>The security protection configuration of the office network.</p>
         * 
         * <strong>example:</strong>
         * <p>SASE</p>
         */
        public Builder securityProtection(String securityProtection) {
            this.putQueryParameter("SecurityProtection", securityProtection);
            this.securityProtection = securityProtection;
            return this;
        }

        /**
         * <p>The office network status.</p>
         * 
         * <strong>example:</strong>
         * <p>REGISTERED</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The VPC ID of the office network for shared cloud computers.</p>
         * <blockquote>
         * <p>This parameter is not yet available for use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6w8u60n8xbkg5el****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public DescribeOfficeSitesRequest build() {
            return new DescribeOfficeSitesRequest(this);
        } 

    } 

}
