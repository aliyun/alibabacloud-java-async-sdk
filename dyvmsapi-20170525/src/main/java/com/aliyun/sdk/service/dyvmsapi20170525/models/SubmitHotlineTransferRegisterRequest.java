// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SubmitHotlineTransferRegisterRequest} extends {@link RequestModel}
 *
 * <p>SubmitHotlineTransferRegisterRequest</p>
 */
public class SubmitHotlineTransferRegisterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Agreement")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agreement;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HotlineNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotlineNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperatorIdentityCard")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operatorIdentityCard;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperatorMail")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operatorMail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperatorMailVerifyCode")
    private String operatorMailVerifyCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperatorMobile")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operatorMobile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperatorMobileVerifyCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operatorMobileVerifyCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperatorName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operatorName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QualificationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String qualificationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransferPhoneNumberInfos")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The authenticity of the commitment. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The commitment is authentic.</li>
         * <li><strong>false</strong>: The commitment is not authentic.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder agreement(String agreement) {
            this.putQueryParameter("Agreement", agreement);
            this.agreement = agreement;
            return this;
        }

        /**
         * <p>The China 400 number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>400****</p>
         */
        public Builder hotlineNumber(String hotlineNumber) {
            this.putQueryParameter("HotlineNumber", hotlineNumber);
            this.hotlineNumber = hotlineNumber;
            return this;
        }

        /**
         * <p>The ID card number of the handler.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5****************9</p>
         */
        public Builder operatorIdentityCard(String operatorIdentityCard) {
            this.putQueryParameter("OperatorIdentityCard", operatorIdentityCard);
            this.operatorIdentityCard = operatorIdentityCard;
            return this;
        }

        /**
         * <p>The email address of the handler.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        public Builder operatorMail(String operatorMail) {
            this.putQueryParameter("OperatorMail", operatorMail);
            this.operatorMail = operatorMail;
            return this;
        }

        /**
         * <p>The verification code that is received by the mailbox of the handler.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder operatorMailVerifyCode(String operatorMailVerifyCode) {
            this.putQueryParameter("OperatorMailVerifyCode", operatorMailVerifyCode);
            this.operatorMailVerifyCode = operatorMailVerifyCode;
            return this;
        }

        /**
         * <p>The mobile phone number of the handler.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>158****7230</p>
         */
        public Builder operatorMobile(String operatorMobile) {
            this.putQueryParameter("OperatorMobile", operatorMobile);
            this.operatorMobile = operatorMobile;
            return this;
        }

        /**
         * <p>The verification code that is received by the mobile phone of the handler.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder operatorMobileVerifyCode(String operatorMobileVerifyCode) {
            this.putQueryParameter("OperatorMobileVerifyCode", operatorMobileVerifyCode);
            this.operatorMobileVerifyCode = operatorMobileVerifyCode;
            return this;
        }

        /**
         * <p>The name of the handler.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>A***</p>
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
         * <p>The qualification ID. You can call the <a href="https://help.aliyun.com/document_detail/393548.html">GetHotlineQualificationByOrder</a> operation to obtain the qualification ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000004933****</p>
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
         * <p>The registration information about the China 400 number.</p>
         * <p>This parameter is required.</p>
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

    /**
     * 
     * {@link SubmitHotlineTransferRegisterRequest} extends {@link TeaModel}
     *
     * <p>SubmitHotlineTransferRegisterRequest</p>
     */
    public static class TransferPhoneNumberInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IdentityCard")
        @com.aliyun.core.annotation.Validation(required = true)
        private String identityCard;

        @com.aliyun.core.annotation.NameInMap("PhoneNumber")
        @com.aliyun.core.annotation.Validation(required = true)
        private String phoneNumber;

        @com.aliyun.core.annotation.NameInMap("PhoneNumberOwnerName")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The ID card number of the number owner.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>500***</p>
             */
            public Builder identityCard(String identityCard) {
                this.identityCard = identityCard;
                return this;
            }

            /**
             * <p>The China 400 number that you want to submit for registration.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1580000****</p>
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * <p>The real name or company name of the number owner.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>A***</p>
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
