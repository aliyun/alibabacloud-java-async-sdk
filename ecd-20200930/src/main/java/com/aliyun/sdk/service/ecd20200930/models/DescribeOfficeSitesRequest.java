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

    private DescribeOfficeSitesRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.officeSiteId = builder.officeSiteId;
        this.officeSiteType = builder.officeSiteType;
        this.regionId = builder.regionId;
        this.securityProtection = builder.securityProtection;
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

    public static final class Builder extends Request.Builder<DescribeOfficeSitesRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<String> officeSiteId; 
        private String officeSiteType; 
        private String regionId; 
        private String securityProtection; 
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
            this.securityProtection = request.securityProtection;
            this.status = request.status;
        } 

        /**
         * <p>The number of entries to return on each page.</p>
         * <ul>
         * <li>Maximum value: 100.</li>
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
         * <p>The token that determines the start point of the next query.</p>
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
         * <p>The office network IDs. You can specify the IDs of 1 to 100 office networks.</p>
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
         * <p>The account type of the office network.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>SIMPLE: convenience account</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>AD_CONNECTOR: enterprise Active Directory (AD) account</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
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

        /**
         * <p>The security protection setting of the office network.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>SASE: SASE is configured.</li>
         * <li>OFF: No security protection setting is configured.</li>
         * </ul>
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
         * <p>Valid values:</p>
         * <ul>
         * <li><p>REGISTERING: The office network is being registered.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>DEREGISTERING: The office network is being deregistered.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>REGISTERED: The office network is registered.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>NEEDCONFIGTRUST: A trust relationship is required for the office network.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>CONFIGTRUSTFAILED: A trust relationship fails to be configured for the office network.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>DEREGISTERED: The office network is deregistered.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>ERROR: One or more configurations of the office network are invalid.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>CONFIGTRUSTING: A trust relationship is being configured for the office network.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>NEEDCONFIGUSER: Users are required for the office network.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>REGISTERED</p>
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
