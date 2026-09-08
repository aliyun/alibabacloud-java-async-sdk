// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link DescribeGrantRulesToCenRequest} extends {@link RequestModel}
 *
 * <p>DescribeGrantRulesToCenRequest</p>
 */
public class DescribeGrantRulesToCenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cenId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChildInstanceId")
    private String childInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChildInstanceOwnerId")
    private Long childInstanceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnabledIpv6")
    private Boolean enabledIpv6;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private DescribeGrantRulesToCenRequest(Builder builder) {
        super(builder);
        this.cenId = builder.cenId;
        this.childInstanceId = builder.childInstanceId;
        this.childInstanceOwnerId = builder.childInstanceOwnerId;
        this.enabledIpv6 = builder.enabledIpv6;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.productType = builder.productType;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGrantRulesToCenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return childInstanceId
     */
    public String getChildInstanceId() {
        return this.childInstanceId;
    }

    /**
     * @return childInstanceOwnerId
     */
    public Long getChildInstanceOwnerId() {
        return this.childInstanceOwnerId;
    }

    /**
     * @return enabledIpv6
     */
    public Boolean getEnabledIpv6() {
        return this.enabledIpv6;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<DescribeGrantRulesToCenRequest, Builder> {
        private String cenId; 
        private String childInstanceId; 
        private Long childInstanceOwnerId; 
        private Boolean enabledIpv6; 
        private Long maxResults; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String productType; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGrantRulesToCenRequest request) {
            super(request);
            this.cenId = request.cenId;
            this.childInstanceId = request.childInstanceId;
            this.childInstanceOwnerId = request.childInstanceOwnerId;
            this.enabledIpv6 = request.enabledIpv6;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.productType = request.productType;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The instance ID of the CEN instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-nye53d7p3hzyu4****</p>
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * <p>The instance ID of the network instance to query.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-rj9gt5nll27onu7****</p>
         */
        public Builder childInstanceId(String childInstanceId) {
            this.putQueryParameter("ChildInstanceId", childInstanceId);
            this.childInstanceId = childInstanceId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account to which the network instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1250123456123456</p>
         */
        public Builder childInstanceOwnerId(Long childInstanceOwnerId) {
            this.putQueryParameter("ChildInstanceOwnerId", childInstanceOwnerId);
            this.childInstanceOwnerId = childInstanceOwnerId;
            return this;
        }

        /**
         * <p>Specifies whether IPv6 is enabled:</p>
         * <ol>
         * <li>This parameter takes effect only when ProductType is set to &quot;VPC&quot;.</li>
         * <li>A value of true indicates that IPv6 is enabled. A value of false indicates that IPv6 is not enabled. If this parameter is left empty, results are not filtered by this parameter.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabledIpv6(Boolean enabledIpv6) {
            this.putQueryParameter("EnabledIpv6", enabledIpv6);
            this.enabledIpv6 = enabledIpv6;
            return this;
        }

        /**
         * <ul>
         * <li>If you do not specify the <strong>MaxResults</strong> parameter, pagination is not required. The <strong>MaxResults</strong> value in the response indicates the total number of entries.</li>
         * <li>If you specify the <strong>MaxResults</strong> parameter, pagination is required. The <strong>MaxResults</strong> value specifies the number of entries to return per page. Valid values: <strong>1</strong> to <strong>100</strong>. The <strong>MaxResults</strong> value in the response indicates the number of entries in the current page. We recommend that you set <strong>MaxResults</strong> to <strong>20</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. Valid values:</p>
         * <ul>
         * <li>You do not need to specify this parameter for the first request or if no subsequent query exists.</li>
         * <li>If a subsequent query exists, set this parameter to the <strong>NextToken</strong> value returned by the previous API call.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The type of the network instance. Valid values:</p>
         * <ul>
         * <li><p><strong>VPC</strong>: virtual private cloud (VPC).</p>
         * </li>
         * <li><p><strong>VBR</strong>: virtual border router (VBR).</p>
         * </li>
         * <li><p><strong>CCN</strong>: Cloud Connect Network (CCN).</p>
         * </li>
         * <li><p><strong>VPN</strong>: IPsec connection.</p>
         * </li>
         * <li><p><strong>ECR</strong>: Express Connect Router (ECR).</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The region ID of the network instance.                   </p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query region IDs.</p>
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
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public DescribeGrantRulesToCenRequest build() {
            return new DescribeGrantRulesToCenRequest(this);
        } 

    } 

}
