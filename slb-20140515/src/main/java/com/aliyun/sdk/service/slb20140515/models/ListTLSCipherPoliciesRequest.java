// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

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
 * {@link ListTLSCipherPoliciesRequest} extends {@link RequestModel}
 *
 * <p>ListTLSCipherPoliciesRequest</p>
 */
public class ListTLSCipherPoliciesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeListener")
    private Boolean includeListener;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxItems")
    private Integer maxItems;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

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
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TLSCipherPolicyId")
    private String TLSCipherPolicyId;

    private ListTLSCipherPoliciesRequest(Builder builder) {
        super(builder);
        this.includeListener = builder.includeListener;
        this.maxItems = builder.maxItems;
        this.name = builder.name;
        this.nextToken = builder.nextToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.TLSCipherPolicyId = builder.TLSCipherPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTLSCipherPoliciesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return includeListener
     */
    public Boolean getIncludeListener() {
        return this.includeListener;
    }

    /**
     * @return maxItems
     */
    public Integer getMaxItems() {
        return this.maxItems;
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
     * @return TLSCipherPolicyId
     */
    public String getTLSCipherPolicyId() {
        return this.TLSCipherPolicyId;
    }

    public static final class Builder extends Request.Builder<ListTLSCipherPoliciesRequest, Builder> {
        private Boolean includeListener; 
        private Integer maxItems; 
        private String name; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String TLSCipherPolicyId; 

        private Builder() {
            super();
        } 

        private Builder(ListTLSCipherPoliciesRequest request) {
            super(request);
            this.includeListener = request.includeListener;
            this.maxItems = request.maxItems;
            this.name = request.name;
            this.nextToken = request.nextToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.TLSCipherPolicyId = request.TLSCipherPolicyId;
        } 

        /**
         * <p>Specifies whether to return the information about the associated listeners. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: returns the information about the associated listeners.</li>
         * <li><strong>false</strong> (default): does not return the information about the associated listeners.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder includeListener(Boolean includeListener) {
            this.putQueryParameter("IncludeListener", includeListener);
            this.includeListener = includeListener;
            return this;
        }

        /**
         * <p>The maximum number of TLS policies to be queried in this call. Valid values: <strong>1</strong> to <strong>100</strong>. If you do not set this parameter, the default value <strong>20</strong> is used.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxItems(Integer maxItems) {
            this.putQueryParameter("MaxItems", maxItems);
            this.maxItems = maxItems;
            return this;
        }

        /**
         * <p>The name of the TLS policy. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>TLSPolicy-test****</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The token that is used for the next query. Valid values:</p>
         * <ul>
         * <li>If this is your first query or no next query is to be sent, ignore this parameter.</li>
         * <li>If a next query is to be sent, set the value to the value of NextToken that is returned from the last call.</li>
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
         * <p>The ID of the region where the Classic Load Balancer (CLB) instance is deployed.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The ID of the TLS policy.</p>
         * 
         * <strong>example:</strong>
         * <p>tls-bp17elso1h323r****</p>
         */
        public Builder TLSCipherPolicyId(String TLSCipherPolicyId) {
            this.putQueryParameter("TLSCipherPolicyId", TLSCipherPolicyId);
            this.TLSCipherPolicyId = TLSCipherPolicyId;
            return this;
        }

        @Override
        public ListTLSCipherPoliciesRequest build() {
            return new ListTLSCipherPoliciesRequest(this);
        } 

    } 

}
