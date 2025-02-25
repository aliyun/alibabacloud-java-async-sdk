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
 * {@link ListTransitRouterMulticastDomainsRequest} extends {@link RequestModel}
 *
 * <p>ListTransitRouterMulticastDomainsRequest</p>
 */
public class ListTransitRouterMulticastDomainsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenId")
    private String cenId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
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
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterId")
    private String transitRouterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterMulticastDomainId")
    private String transitRouterMulticastDomainId;

    private ListTransitRouterMulticastDomainsRequest(Builder builder) {
        super(builder);
        this.cenId = builder.cenId;
        this.clientToken = builder.clientToken;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tag = builder.tag;
        this.transitRouterId = builder.transitRouterId;
        this.transitRouterMulticastDomainId = builder.transitRouterMulticastDomainId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTransitRouterMulticastDomainsRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return transitRouterId
     */
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    /**
     * @return transitRouterMulticastDomainId
     */
    public String getTransitRouterMulticastDomainId() {
        return this.transitRouterMulticastDomainId;
    }

    public static final class Builder extends Request.Builder<ListTransitRouterMulticastDomainsRequest, Builder> {
        private String cenId; 
        private String clientToken; 
        private Long maxResults; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<Tag> tag; 
        private String transitRouterId; 
        private String transitRouterMulticastDomainId; 

        private Builder() {
            super();
        } 

        private Builder(ListTransitRouterMulticastDomainsRequest request) {
            super(request);
            this.cenId = request.cenId;
            this.clientToken = request.clientToken;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tag = request.tag;
            this.transitRouterId = request.transitRouterId;
            this.transitRouterMulticastDomainId = request.transitRouterMulticastDomainId;
        } 

        /**
         * <p>The ID of the Cloud Enterprise Network (CEN) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-a7syd349kne38g****</p>
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: <strong>20</strong>.</p>
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
         * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>You do not need to specify this parameter for the first request.</li>
         * <li>If a value is returned for NextToken, specify the value in the next request to retrieve a new page of results.</li>
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
         * <p>The region ID of the transit router.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query the most recent region list.</p>
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

        /**
         * <p>The tags.</p>
         * <p>You can specify up to 20 tags in each call.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The transit router ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-p0wr9p28r92d598y6****</p>
         */
        public Builder transitRouterId(String transitRouterId) {
            this.putQueryParameter("TransitRouterId", transitRouterId);
            this.transitRouterId = transitRouterId;
            return this;
        }

        /**
         * <p>The multicast domain ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-mcast-domain-3r3bvbypxqheej****</p>
         */
        public Builder transitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
            this.putQueryParameter("TransitRouterMulticastDomainId", transitRouterMulticastDomainId);
            this.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
            return this;
        }

        @Override
        public ListTransitRouterMulticastDomainsRequest build() {
            return new ListTransitRouterMulticastDomainsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListTransitRouterMulticastDomainsRequest} extends {@link TeaModel}
     *
     * <p>ListTransitRouterMulticastDomainsRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The tag key.</p>
             * <p>The tag key cannot be an empty string. The key can be up to 64 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * <p>You can specify at most 20 tag keys in each call.</p>
             * 
             * <strong>example:</strong>
             * <p>TagKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * <p>The tag value can be an empty string. The tag value can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * <p>Each key-value pair must be unique. You can specify up to 20 tag values in each call.</p>
             * 
             * <strong>example:</strong>
             * <p>TagValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
