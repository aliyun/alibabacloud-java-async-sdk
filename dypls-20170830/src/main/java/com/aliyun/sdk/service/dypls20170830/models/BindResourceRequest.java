// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypls20170830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindResourceRequest} extends {@link RequestModel}
 *
 * <p>BindResourceRequest</p>
 */
public class BindResourceRequest extends Request {
    @Query
    @NameInMap("AsrModelId")
    private String asrModelId;

    @Query
    @NameInMap("AsrStatus")
    private Boolean asrStatus;

    @Query
    @NameInMap("AxnExtensionB")
    private String axnExtensionB;

    @Query
    @NameInMap("BillId")
    @Validation(required = true)
    private String billId;

    @Query
    @NameInMap("ExpTime")
    private String expTime;

    @Query
    @NameInMap("IsRecord")
    private Boolean isRecord;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PhoneNoA")
    private String phoneNoA;

    @Query
    @NameInMap("PhoneNoB")
    private String phoneNoB;

    @Query
    @NameInMap("ProdCode")
    private String prodCode;

    @Query
    @NameInMap("ResType")
    private Integer resType;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SecretNo")
    private String secretNo;

    private BindResourceRequest(Builder builder) {
        super(builder);
        this.asrModelId = builder.asrModelId;
        this.asrStatus = builder.asrStatus;
        this.axnExtensionB = builder.axnExtensionB;
        this.billId = builder.billId;
        this.expTime = builder.expTime;
        this.isRecord = builder.isRecord;
        this.ownerId = builder.ownerId;
        this.phoneNoA = builder.phoneNoA;
        this.phoneNoB = builder.phoneNoB;
        this.prodCode = builder.prodCode;
        this.resType = builder.resType;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.secretNo = builder.secretNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asrModelId
     */
    public String getAsrModelId() {
        return this.asrModelId;
    }

    /**
     * @return asrStatus
     */
    public Boolean getAsrStatus() {
        return this.asrStatus;
    }

    /**
     * @return axnExtensionB
     */
    public String getAxnExtensionB() {
        return this.axnExtensionB;
    }

    /**
     * @return billId
     */
    public String getBillId() {
        return this.billId;
    }

    /**
     * @return expTime
     */
    public String getExpTime() {
        return this.expTime;
    }

    /**
     * @return isRecord
     */
    public Boolean getIsRecord() {
        return this.isRecord;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return phoneNoA
     */
    public String getPhoneNoA() {
        return this.phoneNoA;
    }

    /**
     * @return phoneNoB
     */
    public String getPhoneNoB() {
        return this.phoneNoB;
    }

    /**
     * @return prodCode
     */
    public String getProdCode() {
        return this.prodCode;
    }

    /**
     * @return resType
     */
    public Integer getResType() {
        return this.resType;
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
     * @return secretNo
     */
    public String getSecretNo() {
        return this.secretNo;
    }

    public static final class Builder extends Request.Builder<BindResourceRequest, Builder> {
        private String asrModelId; 
        private Boolean asrStatus; 
        private String axnExtensionB; 
        private String billId; 
        private String expTime; 
        private Boolean isRecord; 
        private Long ownerId; 
        private String phoneNoA; 
        private String phoneNoB; 
        private String prodCode; 
        private Integer resType; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String secretNo; 

        private Builder() {
            super();
        } 

        private Builder(BindResourceRequest request) {
            super(request);
            this.asrModelId = request.asrModelId;
            this.asrStatus = request.asrStatus;
            this.axnExtensionB = request.axnExtensionB;
            this.billId = request.billId;
            this.expTime = request.expTime;
            this.isRecord = request.isRecord;
            this.ownerId = request.ownerId;
            this.phoneNoA = request.phoneNoA;
            this.phoneNoB = request.phoneNoB;
            this.prodCode = request.prodCode;
            this.resType = request.resType;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.secretNo = request.secretNo;
        } 

        /**
         * AsrModelId.
         */
        public Builder asrModelId(String asrModelId) {
            this.putQueryParameter("AsrModelId", asrModelId);
            this.asrModelId = asrModelId;
            return this;
        }

        /**
         * AsrStatus.
         */
        public Builder asrStatus(Boolean asrStatus) {
            this.putQueryParameter("AsrStatus", asrStatus);
            this.asrStatus = asrStatus;
            return this;
        }

        /**
         * AxnExtensionB.
         */
        public Builder axnExtensionB(String axnExtensionB) {
            this.putQueryParameter("AxnExtensionB", axnExtensionB);
            this.axnExtensionB = axnExtensionB;
            return this;
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
         * ExpTime.
         */
        public Builder expTime(String expTime) {
            this.putQueryParameter("ExpTime", expTime);
            this.expTime = expTime;
            return this;
        }

        /**
         * IsRecord.
         */
        public Builder isRecord(Boolean isRecord) {
            this.putQueryParameter("IsRecord", isRecord);
            this.isRecord = isRecord;
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
         * PhoneNoA.
         */
        public Builder phoneNoA(String phoneNoA) {
            this.putQueryParameter("PhoneNoA", phoneNoA);
            this.phoneNoA = phoneNoA;
            return this;
        }

        /**
         * PhoneNoB.
         */
        public Builder phoneNoB(String phoneNoB) {
            this.putQueryParameter("PhoneNoB", phoneNoB);
            this.phoneNoB = phoneNoB;
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
         * ResType.
         */
        public Builder resType(Integer resType) {
            this.putQueryParameter("ResType", resType);
            this.resType = resType;
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
         * SecretNo.
         */
        public Builder secretNo(String secretNo) {
            this.putQueryParameter("SecretNo", secretNo);
            this.secretNo = secretNo;
            return this;
        }

        @Override
        public BindResourceRequest build() {
            return new BindResourceRequest(this);
        } 

    } 

}
