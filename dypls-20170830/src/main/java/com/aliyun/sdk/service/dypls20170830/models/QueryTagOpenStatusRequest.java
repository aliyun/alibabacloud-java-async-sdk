// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypls20170830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTagOpenStatusRequest} extends {@link RequestModel}
 *
 * <p>QueryTagOpenStatusRequest</p>
 */
public class QueryTagOpenStatusRequest extends Request {
    @Query
    @NameInMap("AttributeKey")
    private String attributeKey;

    @Query
    @NameInMap("BizType")
    private Integer bizType;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SubAttributeKey")
    private String subAttributeKey;

    private QueryTagOpenStatusRequest(Builder builder) {
        super(builder);
        this.attributeKey = builder.attributeKey;
        this.bizType = builder.bizType;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.subAttributeKey = builder.subAttributeKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTagOpenStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attributeKey
     */
    public String getAttributeKey() {
        return this.attributeKey;
    }

    /**
     * @return bizType
     */
    public Integer getBizType() {
        return this.bizType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return subAttributeKey
     */
    public String getSubAttributeKey() {
        return this.subAttributeKey;
    }

    public static final class Builder extends Request.Builder<QueryTagOpenStatusRequest, Builder> {
        private String attributeKey; 
        private Integer bizType; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String subAttributeKey; 

        private Builder() {
            super();
        } 

        private Builder(QueryTagOpenStatusRequest request) {
            super(request);
            this.attributeKey = request.attributeKey;
            this.bizType = request.bizType;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.subAttributeKey = request.subAttributeKey;
        } 

        /**
         * AttributeKey.
         */
        public Builder attributeKey(String attributeKey) {
            this.putQueryParameter("AttributeKey", attributeKey);
            this.attributeKey = attributeKey;
            return this;
        }

        /**
         * BizType.
         */
        public Builder bizType(Integer bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
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
         * SubAttributeKey.
         */
        public Builder subAttributeKey(String subAttributeKey) {
            this.putQueryParameter("SubAttributeKey", subAttributeKey);
            this.subAttributeKey = subAttributeKey;
            return this;
        }

        @Override
        public QueryTagOpenStatusRequest build() {
            return new QueryTagOpenStatusRequest(this);
        } 

    } 

}
