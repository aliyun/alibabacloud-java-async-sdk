// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypls20170830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchOccupySecretResRequest} extends {@link RequestModel}
 *
 * <p>BatchOccupySecretResRequest</p>
 */
public class BatchOccupySecretResRequest extends Request {
    @Query
    @NameInMap("BatchOccupyList")
    private java.util.List < BatchOccupyList> batchOccupyList;

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

    private BatchOccupySecretResRequest(Builder builder) {
        super(builder);
        this.batchOccupyList = builder.batchOccupyList;
        this.ownerId = builder.ownerId;
        this.prodCode = builder.prodCode;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchOccupySecretResRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchOccupyList
     */
    public java.util.List < BatchOccupyList> getBatchOccupyList() {
        return this.batchOccupyList;
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

    public static final class Builder extends Request.Builder<BatchOccupySecretResRequest, Builder> {
        private java.util.List < BatchOccupyList> batchOccupyList; 
        private Long ownerId; 
        private String prodCode; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(BatchOccupySecretResRequest request) {
            super(request);
            this.batchOccupyList = request.batchOccupyList;
            this.ownerId = request.ownerId;
            this.prodCode = request.prodCode;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * BatchOccupyList.
         */
        public Builder batchOccupyList(java.util.List < BatchOccupyList> batchOccupyList) {
            String batchOccupyListShrink = shrink(batchOccupyList, "BatchOccupyList", "json");
            this.putQueryParameter("BatchOccupyList", batchOccupyListShrink);
            this.batchOccupyList = batchOccupyList;
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

        @Override
        public BatchOccupySecretResRequest build() {
            return new BatchOccupySecretResRequest(this);
        } 

    } 

    public static class BatchOccupyList extends TeaModel {
        @NameInMap("Count")
        @Validation(required = true)
        private Integer count;

        @NameInMap("OrderDetailId")
        @Validation(required = true)
        private Long orderDetailId;

        @NameInMap("OrderId")
        @Validation(required = true)
        private Long orderId;

        @NameInMap("PartnerKey")
        @Validation(required = true)
        private String partnerKey;

        @NameInMap("ResType")
        @Validation(required = true)
        private Long resType;

        @NameInMap("SecretNoType")
        @Validation(required = true)
        private Long secretNoType;

        private BatchOccupyList(Builder builder) {
            this.count = builder.count;
            this.orderDetailId = builder.orderDetailId;
            this.orderId = builder.orderId;
            this.partnerKey = builder.partnerKey;
            this.resType = builder.resType;
            this.secretNoType = builder.secretNoType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BatchOccupyList create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return orderDetailId
         */
        public Long getOrderDetailId() {
            return this.orderDetailId;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
        }

        /**
         * @return partnerKey
         */
        public String getPartnerKey() {
            return this.partnerKey;
        }

        /**
         * @return resType
         */
        public Long getResType() {
            return this.resType;
        }

        /**
         * @return secretNoType
         */
        public Long getSecretNoType() {
            return this.secretNoType;
        }

        public static final class Builder {
            private Integer count; 
            private Long orderDetailId; 
            private Long orderId; 
            private String partnerKey; 
            private Long resType; 
            private Long secretNoType; 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * OrderDetailId.
             */
            public Builder orderDetailId(Long orderDetailId) {
                this.orderDetailId = orderDetailId;
                return this;
            }

            /**
             * OrderId.
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * PartnerKey.
             */
            public Builder partnerKey(String partnerKey) {
                this.partnerKey = partnerKey;
                return this;
            }

            /**
             * ResType.
             */
            public Builder resType(Long resType) {
                this.resType = resType;
                return this;
            }

            /**
             * SecretNoType.
             */
            public Builder secretNoType(Long secretNoType) {
                this.secretNoType = secretNoType;
                return this;
            }

            public BatchOccupyList build() {
                return new BatchOccupyList(this);
            } 

        } 

    }
}
