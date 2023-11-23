// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypls20170830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRingToneRequest} extends {@link RequestModel}
 *
 * <p>CreateRingToneRequest</p>
 */
public class CreateRingToneRequest extends Request {
    @Query
    @NameInMap("BillId")
    private String billId;

    @Query
    @NameInMap("FileKey")
    @Validation(required = true)
    private String fileKey;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PlayType")
    private String playType;

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
    @NameInMap("RingName")
    private String ringName;

    @Query
    @NameInMap("Tts")
    private String tts;

    private CreateRingToneRequest(Builder builder) {
        super(builder);
        this.billId = builder.billId;
        this.fileKey = builder.fileKey;
        this.ownerId = builder.ownerId;
        this.playType = builder.playType;
        this.prodCode = builder.prodCode;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ringName = builder.ringName;
        this.tts = builder.tts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRingToneRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billId
     */
    public String getBillId() {
        return this.billId;
    }

    /**
     * @return fileKey
     */
    public String getFileKey() {
        return this.fileKey;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return playType
     */
    public String getPlayType() {
        return this.playType;
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
     * @return ringName
     */
    public String getRingName() {
        return this.ringName;
    }

    /**
     * @return tts
     */
    public String getTts() {
        return this.tts;
    }

    public static final class Builder extends Request.Builder<CreateRingToneRequest, Builder> {
        private String billId; 
        private String fileKey; 
        private Long ownerId; 
        private String playType; 
        private String prodCode; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String ringName; 
        private String tts; 

        private Builder() {
            super();
        } 

        private Builder(CreateRingToneRequest request) {
            super(request);
            this.billId = request.billId;
            this.fileKey = request.fileKey;
            this.ownerId = request.ownerId;
            this.playType = request.playType;
            this.prodCode = request.prodCode;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.ringName = request.ringName;
            this.tts = request.tts;
        } 

        /**
         * BillId.
         */
        public Builder billId(String billId) {
            this.putQueryParameter("BillId", billId);
            this.billId = billId;
            return this;
        }

        /**
         * FileKey.
         */
        public Builder fileKey(String fileKey) {
            this.putQueryParameter("FileKey", fileKey);
            this.fileKey = fileKey;
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
         * PlayType.
         */
        public Builder playType(String playType) {
            this.putQueryParameter("PlayType", playType);
            this.playType = playType;
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
         * RingName.
         */
        public Builder ringName(String ringName) {
            this.putQueryParameter("RingName", ringName);
            this.ringName = ringName;
            return this;
        }

        /**
         * Tts.
         */
        public Builder tts(String tts) {
            this.putQueryParameter("Tts", tts);
            this.tts = tts;
            return this;
        }

        @Override
        public CreateRingToneRequest build() {
            return new CreateRingToneRequest(this);
        } 

    } 

}
