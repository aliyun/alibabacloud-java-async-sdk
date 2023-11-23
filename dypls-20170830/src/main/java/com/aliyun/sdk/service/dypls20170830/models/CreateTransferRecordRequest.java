// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypls20170830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTransferRecordRequest} extends {@link RequestModel}
 *
 * <p>CreateTransferRecordRequest</p>
 */
public class CreateTransferRecordRequest extends Request {
    @Query
    @NameInMap("City")
    private String city;

    @Query
    @NameInMap("NumberList")
    private String numberList;

    @Query
    @NameInMap("OriginBillId")
    @Validation(required = true)
    private String originBillId;

    @Query
    @NameInMap("OriginName")
    @Validation(required = true)
    private String originName;

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
    @NameInMap("TargetBillId")
    @Validation(required = true)
    private String targetBillId;

    @Query
    @NameInMap("TargetName")
    @Validation(required = true)
    private String targetName;

    @Query
    @NameInMap("Total")
    @Validation(maximum = 500, minimum = 1)
    private Integer total;

    @Query
    @NameInMap("TransferType")
    @Validation(required = true)
    private Integer transferType;

    private CreateTransferRecordRequest(Builder builder) {
        super(builder);
        this.city = builder.city;
        this.numberList = builder.numberList;
        this.originBillId = builder.originBillId;
        this.originName = builder.originName;
        this.ownerId = builder.ownerId;
        this.prodCode = builder.prodCode;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.targetBillId = builder.targetBillId;
        this.targetName = builder.targetName;
        this.total = builder.total;
        this.transferType = builder.transferType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTransferRecordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * @return numberList
     */
    public String getNumberList() {
        return this.numberList;
    }

    /**
     * @return originBillId
     */
    public String getOriginBillId() {
        return this.originBillId;
    }

    /**
     * @return originName
     */
    public String getOriginName() {
        return this.originName;
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
     * @return targetBillId
     */
    public String getTargetBillId() {
        return this.targetBillId;
    }

    /**
     * @return targetName
     */
    public String getTargetName() {
        return this.targetName;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    /**
     * @return transferType
     */
    public Integer getTransferType() {
        return this.transferType;
    }

    public static final class Builder extends Request.Builder<CreateTransferRecordRequest, Builder> {
        private String city; 
        private String numberList; 
        private String originBillId; 
        private String originName; 
        private Long ownerId; 
        private String prodCode; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String targetBillId; 
        private String targetName; 
        private Integer total; 
        private Integer transferType; 

        private Builder() {
            super();
        } 

        private Builder(CreateTransferRecordRequest request) {
            super(request);
            this.city = request.city;
            this.numberList = request.numberList;
            this.originBillId = request.originBillId;
            this.originName = request.originName;
            this.ownerId = request.ownerId;
            this.prodCode = request.prodCode;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.targetBillId = request.targetBillId;
            this.targetName = request.targetName;
            this.total = request.total;
            this.transferType = request.transferType;
        } 

        /**
         * City.
         */
        public Builder city(String city) {
            this.putQueryParameter("City", city);
            this.city = city;
            return this;
        }

        /**
         * NumberList.
         */
        public Builder numberList(String numberList) {
            this.putQueryParameter("NumberList", numberList);
            this.numberList = numberList;
            return this;
        }

        /**
         * OriginBillId.
         */
        public Builder originBillId(String originBillId) {
            this.putQueryParameter("OriginBillId", originBillId);
            this.originBillId = originBillId;
            return this;
        }

        /**
         * OriginName.
         */
        public Builder originName(String originName) {
            this.putQueryParameter("OriginName", originName);
            this.originName = originName;
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
         * TargetBillId.
         */
        public Builder targetBillId(String targetBillId) {
            this.putQueryParameter("TargetBillId", targetBillId);
            this.targetBillId = targetBillId;
            return this;
        }

        /**
         * TargetName.
         */
        public Builder targetName(String targetName) {
            this.putQueryParameter("TargetName", targetName);
            this.targetName = targetName;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.putQueryParameter("Total", total);
            this.total = total;
            return this;
        }

        /**
         * TransferType.
         */
        public Builder transferType(Integer transferType) {
            this.putQueryParameter("TransferType", transferType);
            this.transferType = transferType;
            return this;
        }

        @Override
        public CreateTransferRecordRequest build() {
            return new CreateTransferRecordRequest(this);
        } 

    } 

}
