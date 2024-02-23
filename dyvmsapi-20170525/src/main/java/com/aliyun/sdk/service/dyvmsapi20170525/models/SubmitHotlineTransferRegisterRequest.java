// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitHotlineTransferRegisterRequest} extends {@link RequestModel}
 *
 * <p>SubmitHotlineTransferRegisterRequest</p>
 */
public class SubmitHotlineTransferRegisterRequest extends Request {
    @Query
    @NameInMap("Agreement")
    @Validation(required = true)
    private String agreement;

    @Query
    @NameInMap("HotlineNumber")
    @Validation(required = true)
    private String hotlineNumber;

    @Query
    @NameInMap("OperatorIdentityCard")
    @Validation(required = true)
    private String operatorIdentityCard;

    @Query
    @NameInMap("OperatorMail")
    @Validation(required = true)
    private String operatorMail;

    @Query
    @NameInMap("OperatorMailVerifyCode")
    private String operatorMailVerifyCode;

    @Query
    @NameInMap("OperatorMobile")
    @Validation(required = true)
    private String operatorMobile;

    @Query
    @NameInMap("OperatorMobileVerifyCode")
    @Validation(required = true)
    private String operatorMobileVerifyCode;

    @Query
    @NameInMap("OperatorName")
    @Validation(required = true)
    private String operatorName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("QualificationId")
    @Validation(required = true)
    private String qualificationId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TransferPhoneNumberInfos")
    @Validation(required = true)
    private java.util.List < TransferPhoneNumberInfos> transferPhoneNumberInfos;

    private SubmitHotlineTransferRegisterRequest(Builder builder) {
        super(builder);
        this.agreement = builder.agreement;
        this.hotlineNumber = builder.hotlineNumber;
        this.operatorIdentityCard = builder.operatorIdentityCard;
        this.operatorMail = builder.operatorMail;
        this.operatorMailVerifyCode = builder.operatorMailVerifyCode;
        this.operatorMobile = builder.operatorMobile;
        this.operatorMobileVerifyCode = builder.operatorMobileVerifyCode;
        this.operatorName = builder.operatorName;
        this.ownerId = builder.ownerId;
        this.qualificationId = builder.qualificationId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.transferPhoneNumberInfos = builder.transferPhoneNumberInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitHotlineTransferRegisterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agreement
     */
    public String getAgreement() {
        return this.agreement;
    }

    /**
     * @return hotlineNumber
     */
    public String getHotlineNumber() {
        return this.hotlineNumber;
    }

    /**
     * @return operatorIdentityCard
     */
    public String getOperatorIdentityCard() {
        return this.operatorIdentityCard;
    }

    /**
     * @return operatorMail
     */
    public String getOperatorMail() {
        return this.operatorMail;
    }

    /**
     * @return operatorMailVerifyCode
     */
    public String getOperatorMailVerifyCode() {
        return this.operatorMailVerifyCode;
    }

    /**
     * @return operatorMobile
     */
    public String getOperatorMobile() {
        return this.operatorMobile;
    }

    /**
     * @return operatorMobileVerifyCode
     */
    public String getOperatorMobileVerifyCode() {
        return this.operatorMobileVerifyCode;
    }

    /**
     * @return operatorName
     */
    public String getOperatorName() {
        return this.operatorName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return qualificationId
     */
    public String getQualificationId() {
        return this.qualificationId;
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
     * @return transferPhoneNumberInfos
     */
    public java.util.List < TransferPhoneNumberInfos> getTransferPhoneNumberInfos() {
        return this.transferPhoneNumberInfos;
    }

    public static final class Builder extends Request.Builder<SubmitHotlineTransferRegisterRequest, Builder> {
        private String agreement; 
        private String hotlineNumber; 
        private String operatorIdentityCard; 
        private String operatorMail; 
        private String operatorMailVerifyCode; 
        private String operatorMobile; 
        private String operatorMobileVerifyCode; 
        private String operatorName; 
        private Long ownerId; 
        private String qualificationId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List < TransferPhoneNumberInfos> transferPhoneNumberInfos; 

        private Builder() {
            super();
        } 

        private Builder(SubmitHotlineTransferRegisterRequest request) {
            super(request);
            this.agreement = request.agreement;
            this.hotlineNumber = request.hotlineNumber;
            this.operatorIdentityCard = request.operatorIdentityCard;
            this.operatorMail = request.operatorMail;
            this.operatorMailVerifyCode = request.operatorMailVerifyCode;
            this.operatorMobile = request.operatorMobile;
            this.operatorMobileVerifyCode = request.operatorMobileVerifyCode;
            this.operatorName = request.operatorName;
            this.ownerId = request.ownerId;
            this.qualificationId = request.qualificationId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.transferPhoneNumberInfos = request.transferPhoneNumberInfos;
        } 

        /**
         * The authenticity of the commitment. Valid values:
         * <p>
         * 
         * *   **true**: The commitment is authentic.
         * *   **false**: The commitment is not authentic.
         */
        public Builder agreement(String agreement) {
            this.putQueryParameter("Agreement", agreement);
            this.agreement = agreement;
            return this;
        }

        /**
         * The China 400 number.
         */
        public Builder hotlineNumber(String hotlineNumber) {
            this.putQueryParameter("HotlineNumber", hotlineNumber);
            this.hotlineNumber = hotlineNumber;
            return this;
        }

        /**
         * The ID card number of the handler.
         */
        public Builder operatorIdentityCard(String operatorIdentityCard) {
            this.putQueryParameter("OperatorIdentityCard", operatorIdentityCard);
            this.operatorIdentityCard = operatorIdentityCard;
            return this;
        }

        /**
         * The email address of the handler.
         */
        public Builder operatorMail(String operatorMail) {
            this.putQueryParameter("OperatorMail", operatorMail);
            this.operatorMail = operatorMail;
            return this;
        }

        /**
         * The verification code that is received by the mailbox of the handler.
         */
        public Builder operatorMailVerifyCode(String operatorMailVerifyCode) {
            this.putQueryParameter("OperatorMailVerifyCode", operatorMailVerifyCode);
            this.operatorMailVerifyCode = operatorMailVerifyCode;
            return this;
        }

        /**
         * The mobile phone number of the handler.
         */
        public Builder operatorMobile(String operatorMobile) {
            this.putQueryParameter("OperatorMobile", operatorMobile);
            this.operatorMobile = operatorMobile;
            return this;
        }

        /**
         * The verification code that is received by the mobile phone of the handler.
         */
        public Builder operatorMobileVerifyCode(String operatorMobileVerifyCode) {
            this.putQueryParameter("OperatorMobileVerifyCode", operatorMobileVerifyCode);
            this.operatorMobileVerifyCode = operatorMobileVerifyCode;
            return this;
        }

        /**
         * The name of the handler.
         */
        public Builder operatorName(String operatorName) {
            this.putQueryParameter("OperatorName", operatorName);
            this.operatorName = operatorName;
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
         * The qualification ID. You can call the [GetHotlineQualificationByOrder](~~393548~~) operation to obtain the qualification ID.
         */
        public Builder qualificationId(String qualificationId) {
            this.putQueryParameter("QualificationId", qualificationId);
            this.qualificationId = qualificationId;
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
         * The registration information about the China 400 number.
         */
        public Builder transferPhoneNumberInfos(java.util.List < TransferPhoneNumberInfos> transferPhoneNumberInfos) {
            this.putQueryParameter("TransferPhoneNumberInfos", transferPhoneNumberInfos);
            this.transferPhoneNumberInfos = transferPhoneNumberInfos;
            return this;
        }

        @Override
        public SubmitHotlineTransferRegisterRequest build() {
            return new SubmitHotlineTransferRegisterRequest(this);
        } 

    } 

    public static class TransferPhoneNumberInfos extends TeaModel {
        @NameInMap("IdentityCard")
        @Validation(required = true)
        private String identityCard;

        @NameInMap("PhoneNumber")
        @Validation(required = true)
        private String phoneNumber;

        @NameInMap("PhoneNumberOwnerName")
        @Validation(required = true)
        private String phoneNumberOwnerName;

        private TransferPhoneNumberInfos(Builder builder) {
            this.identityCard = builder.identityCard;
            this.phoneNumber = builder.phoneNumber;
            this.phoneNumberOwnerName = builder.phoneNumberOwnerName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferPhoneNumberInfos create() {
            return builder().build();
        }

        /**
         * @return identityCard
         */
        public String getIdentityCard() {
            return this.identityCard;
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return phoneNumberOwnerName
         */
        public String getPhoneNumberOwnerName() {
            return this.phoneNumberOwnerName;
        }

        public static final class Builder {
            private String identityCard; 
            private String phoneNumber; 
            private String phoneNumberOwnerName; 

            /**
             * The ID card number of the number owner.
             */
            public Builder identityCard(String identityCard) {
                this.identityCard = identityCard;
                return this;
            }

            /**
             * The China 400 number that you want to submit for registration.
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * The real name or company name of the number owner.
             */
            public Builder phoneNumberOwnerName(String phoneNumberOwnerName) {
                this.phoneNumberOwnerName = phoneNumberOwnerName;
                return this;
            }

            public TransferPhoneNumberInfos build() {
                return new TransferPhoneNumberInfos(this);
            } 

        } 

    }
}
