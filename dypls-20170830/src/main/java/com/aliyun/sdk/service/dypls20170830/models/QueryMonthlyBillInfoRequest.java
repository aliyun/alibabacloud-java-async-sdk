// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypls20170830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMonthlyBillInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryMonthlyBillInfoRequest</p>
 */
public class QueryMonthlyBillInfoRequest extends Request {
    @Query
    @NameInMap("BillCycle")
    private String billCycle;

    @Query
    @NameInMap("ItemId")
    private String itemId;

    @Query
    @NameInMap("ItemName")
    private String itemName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ProdCode")
    private String prodCode;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SubjectItemId")
    private String subjectItemId;

    private QueryMonthlyBillInfoRequest(Builder builder) {
        super(builder);
        this.billCycle = builder.billCycle;
        this.itemId = builder.itemId;
        this.itemName = builder.itemName;
        this.ownerId = builder.ownerId;
        this.prodCode = builder.prodCode;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.subjectItemId = builder.subjectItemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMonthlyBillInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billCycle
     */
    public String getBillCycle() {
        return this.billCycle;
    }

    /**
     * @return itemId
     */
    public String getItemId() {
        return this.itemId;
    }

    /**
     * @return itemName
     */
    public String getItemName() {
        return this.itemName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return prodCode
     */
    public String getProdCode() {
        return this.prodCode;
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
     * @return subjectItemId
     */
    public String getSubjectItemId() {
        return this.subjectItemId;
    }

    public static final class Builder extends Request.Builder<QueryMonthlyBillInfoRequest, Builder> {
        private String billCycle; 
        private String itemId; 
        private String itemName; 
        private Long ownerId; 
        private String prodCode; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String subjectItemId; 

        private Builder() {
            super();
        } 

        private Builder(QueryMonthlyBillInfoRequest request) {
            super(request);
            this.billCycle = request.billCycle;
            this.itemId = request.itemId;
            this.itemName = request.itemName;
            this.ownerId = request.ownerId;
            this.prodCode = request.prodCode;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.subjectItemId = request.subjectItemId;
        } 

        /**
         * BillCycle.
         */
        public Builder billCycle(String billCycle) {
            this.putQueryParameter("BillCycle", billCycle);
            this.billCycle = billCycle;
            return this;
        }

        /**
         * ItemId.
         */
        public Builder itemId(String itemId) {
            this.putQueryParameter("ItemId", itemId);
            this.itemId = itemId;
            return this;
        }

        /**
         * ItemName.
         */
        public Builder itemName(String itemName) {
            this.putQueryParameter("ItemName", itemName);
            this.itemName = itemName;
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
         * ProdCode.
         */
        public Builder prodCode(String prodCode) {
            this.putQueryParameter("ProdCode", prodCode);
            this.prodCode = prodCode;
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
         * SubjectItemId.
         */
        public Builder subjectItemId(String subjectItemId) {
            this.putQueryParameter("SubjectItemId", subjectItemId);
            this.subjectItemId = subjectItemId;
            return this;
        }

        @Override
        public QueryMonthlyBillInfoRequest build() {
            return new QueryMonthlyBillInfoRequest(this);
        } 

    } 

}
