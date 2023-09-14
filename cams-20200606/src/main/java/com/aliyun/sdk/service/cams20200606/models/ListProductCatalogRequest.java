// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductCatalogRequest} extends {@link RequestModel}
 *
 * <p>ListProductCatalogRequest</p>
 */
public class ListProductCatalogRequest extends Request {
    @Query
    @NameInMap("After")
    private String after;

    @Query
    @NameInMap("Before")
    private String before;

    @Query
    @NameInMap("BusinessId")
    @Validation(required = true)
    private Long businessId;

    @Query
    @NameInMap("CustSpaceId")
    private String custSpaceId;

    @Query
    @NameInMap("Fields")
    private String fields;

    @Query
    @NameInMap("Limit")
    private Long limit;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ListProductCatalogRequest(Builder builder) {
        super(builder);
        this.after = builder.after;
        this.before = builder.before;
        this.businessId = builder.businessId;
        this.custSpaceId = builder.custSpaceId;
        this.fields = builder.fields;
        this.limit = builder.limit;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductCatalogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return after
     */
    public String getAfter() {
        return this.after;
    }

    /**
     * @return before
     */
    public String getBefore() {
        return this.before;
    }

    /**
     * @return businessId
     */
    public Long getBusinessId() {
        return this.businessId;
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return fields
     */
    public String getFields() {
        return this.fields;
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
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

    public static final class Builder extends Request.Builder<ListProductCatalogRequest, Builder> {
        private String after; 
        private String before; 
        private Long businessId; 
        private String custSpaceId; 
        private String fields; 
        private Long limit; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ListProductCatalogRequest request) {
            super(request);
            this.after = request.after;
            this.before = request.before;
            this.businessId = request.businessId;
            this.custSpaceId = request.custSpaceId;
            this.fields = request.fields;
            this.limit = request.limit;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * After.
         */
        public Builder after(String after) {
            this.putQueryParameter("After", after);
            this.after = after;
            return this;
        }

        /**
         * Before.
         */
        public Builder before(String before) {
            this.putQueryParameter("Before", before);
            this.before = before;
            return this;
        }

        /**
         * BusinessId.
         */
        public Builder businessId(Long businessId) {
            this.putQueryParameter("BusinessId", businessId);
            this.businessId = businessId;
            return this;
        }

        /**
         * CustSpaceId.
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * Fields.
         */
        public Builder fields(String fields) {
            this.putQueryParameter("Fields", fields);
            this.fields = fields;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(Long limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
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

        @Override
        public ListProductCatalogRequest build() {
            return new ListProductCatalogRequest(this);
        } 

    } 

}
