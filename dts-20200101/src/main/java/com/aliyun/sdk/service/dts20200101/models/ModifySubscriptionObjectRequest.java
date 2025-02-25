// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link ModifySubscriptionObjectRequest} extends {@link RequestModel}
 *
 * <p>ModifySubscriptionObjectRequest</p>
 */
public class ModifySubscriptionObjectRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private String accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subscriptionInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionObject")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subscriptionObject;

    private ModifySubscriptionObjectRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.subscriptionInstanceId = builder.subscriptionInstanceId;
        this.subscriptionObject = builder.subscriptionObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySubscriptionObjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return subscriptionInstanceId
     */
    public String getSubscriptionInstanceId() {
        return this.subscriptionInstanceId;
    }

    /**
     * @return subscriptionObject
     */
    public String getSubscriptionObject() {
        return this.subscriptionObject;
    }

    public static final class Builder extends Request.Builder<ModifySubscriptionObjectRequest, Builder> {
        private String accountId; 
        private String ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String subscriptionInstanceId; 
        private String subscriptionObject; 

        private Builder() {
            super();
        } 

        private Builder(ModifySubscriptionObjectRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.subscriptionInstanceId = request.subscriptionInstanceId;
            this.subscriptionObject = request.subscriptionObject;
        } 

        /**
         * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter because this parameter will be removed in the future.</p>
         * 
         * <strong>example:</strong>
         * <p>12323344****</p>
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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

        /**
         * <p>Resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the change tracking instance. You can call the <a href="https://help.aliyun.com/document_detail/49442.html">DescribeSubscriptionInstances</a> operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dtsl8zl9ek6292****</p>
         */
        public Builder subscriptionInstanceId(String subscriptionInstanceId) {
            this.putQueryParameter("SubscriptionInstanceId", subscriptionInstanceId);
            this.subscriptionInstanceId = subscriptionInstanceId;
            return this;
        }

        /**
         * <p>The objects from which you want to track data changes. The value is a JSON string and can contain regular expressions. For more information, see <a href="https://help.aliyun.com/document_detail/141902.html">SubscriptionObjects</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;DBName&quot;:&quot;dtstestdata&quot;}]</p>
         */
        public Builder subscriptionObject(String subscriptionObject) {
            this.putQueryParameter("SubscriptionObject", subscriptionObject);
            this.subscriptionObject = subscriptionObject;
            return this;
        }

        @Override
        public ModifySubscriptionObjectRequest build() {
            return new ModifySubscriptionObjectRequest(this);
        } 

    } 

}
