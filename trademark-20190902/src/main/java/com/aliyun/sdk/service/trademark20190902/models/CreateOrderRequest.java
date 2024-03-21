// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateOrderRequest</p>
 */
public class CreateOrderRequest extends Request {
    @Query
    @NameInMap("AgreementId")
    private String agreementId;

    @Query
    @NameInMap("ApplicantId")
    private String applicantId;

    @Query
    @NameInMap("ApplicationType")
    @Validation(maximum = 20, minimum = 1)
    private Integer applicationType;

    @Query
    @NameInMap("AuthorizationOssKey")
    private String authorizationOssKey;

    @Query
    @NameInMap("AutoPay")
    @Validation(required = true)
    private Boolean autoPay;

    @Query
    @NameInMap("BlackAndWhiteIcon")
    private String blackAndWhiteIcon;

    @Query
    @NameInMap("Channel")
    private String channel;

    @Query
    @NameInMap("Classifications")
    private String classifications;

    @Query
    @NameInMap("IdempotentId")
    private String idempotentId;

    @Query
    @NameInMap("LegalNoticeKey")
    private String legalNoticeKey;

    @Query
    @NameInMap("PayType")
    private String payType;

    @Query
    @NameInMap("PaymentCallback")
    private String paymentCallback;

    @Query
    @NameInMap("PrincipalName")
    @Validation(maximum = 10, minimum = 1)
    private Integer principalName;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("TrademarkComment")
    private String trademarkComment;

    @Query
    @NameInMap("TrademarkIcon")
    @Validation(required = true)
    private String trademarkIcon;

    @Query
    @NameInMap("TrademarkName")
    @Validation(required = true)
    private String trademarkName;

    @Query
    @NameInMap("TrademarkNameType")
    private String trademarkNameType;

    private CreateOrderRequest(Builder builder) {
        super(builder);
        this.agreementId = builder.agreementId;
        this.applicantId = builder.applicantId;
        this.applicationType = builder.applicationType;
        this.authorizationOssKey = builder.authorizationOssKey;
        this.autoPay = builder.autoPay;
        this.blackAndWhiteIcon = builder.blackAndWhiteIcon;
        this.channel = builder.channel;
        this.classifications = builder.classifications;
        this.idempotentId = builder.idempotentId;
        this.legalNoticeKey = builder.legalNoticeKey;
        this.payType = builder.payType;
        this.paymentCallback = builder.paymentCallback;
        this.principalName = builder.principalName;
        this.source = builder.source;
        this.trademarkComment = builder.trademarkComment;
        this.trademarkIcon = builder.trademarkIcon;
        this.trademarkName = builder.trademarkName;
        this.trademarkNameType = builder.trademarkNameType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agreementId
     */
    public String getAgreementId() {
        return this.agreementId;
    }

    /**
     * @return applicantId
     */
    public String getApplicantId() {
        return this.applicantId;
    }

    /**
     * @return applicationType
     */
    public Integer getApplicationType() {
        return this.applicationType;
    }

    /**
     * @return authorizationOssKey
     */
    public String getAuthorizationOssKey() {
        return this.authorizationOssKey;
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return blackAndWhiteIcon
     */
    public String getBlackAndWhiteIcon() {
        return this.blackAndWhiteIcon;
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return classifications
     */
    public String getClassifications() {
        return this.classifications;
    }

    /**
     * @return idempotentId
     */
    public String getIdempotentId() {
        return this.idempotentId;
    }

    /**
     * @return legalNoticeKey
     */
    public String getLegalNoticeKey() {
        return this.legalNoticeKey;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return paymentCallback
     */
    public String getPaymentCallback() {
        return this.paymentCallback;
    }

    /**
     * @return principalName
     */
    public Integer getPrincipalName() {
        return this.principalName;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return trademarkComment
     */
    public String getTrademarkComment() {
        return this.trademarkComment;
    }

    /**
     * @return trademarkIcon
     */
    public String getTrademarkIcon() {
        return this.trademarkIcon;
    }

    /**
     * @return trademarkName
     */
    public String getTrademarkName() {
        return this.trademarkName;
    }

    /**
     * @return trademarkNameType
     */
    public String getTrademarkNameType() {
        return this.trademarkNameType;
    }

    public static final class Builder extends Request.Builder<CreateOrderRequest, Builder> {
        private String agreementId; 
        private String applicantId; 
        private Integer applicationType; 
        private String authorizationOssKey; 
        private Boolean autoPay; 
        private String blackAndWhiteIcon; 
        private String channel; 
        private String classifications; 
        private String idempotentId; 
        private String legalNoticeKey; 
        private String payType; 
        private String paymentCallback; 
        private Integer principalName; 
        private String source; 
        private String trademarkComment; 
        private String trademarkIcon; 
        private String trademarkName; 
        private String trademarkNameType; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrderRequest request) {
            super(request);
            this.agreementId = request.agreementId;
            this.applicantId = request.applicantId;
            this.applicationType = request.applicationType;
            this.authorizationOssKey = request.authorizationOssKey;
            this.autoPay = request.autoPay;
            this.blackAndWhiteIcon = request.blackAndWhiteIcon;
            this.channel = request.channel;
            this.classifications = request.classifications;
            this.idempotentId = request.idempotentId;
            this.legalNoticeKey = request.legalNoticeKey;
            this.payType = request.payType;
            this.paymentCallback = request.paymentCallback;
            this.principalName = request.principalName;
            this.source = request.source;
            this.trademarkComment = request.trademarkComment;
            this.trademarkIcon = request.trademarkIcon;
            this.trademarkName = request.trademarkName;
            this.trademarkNameType = request.trademarkNameType;
        } 

        /**
         * AgreementId.
         */
        public Builder agreementId(String agreementId) {
            this.putQueryParameter("AgreementId", agreementId);
            this.agreementId = agreementId;
            return this;
        }

        /**
         * ApplicantId.
         */
        public Builder applicantId(String applicantId) {
            this.putQueryParameter("ApplicantId", applicantId);
            this.applicantId = applicantId;
            return this;
        }

        /**
         * ApplicationType.
         */
        public Builder applicationType(Integer applicationType) {
            this.putQueryParameter("ApplicationType", applicationType);
            this.applicationType = applicationType;
            return this;
        }

        /**
         * AuthorizationOssKey.
         */
        public Builder authorizationOssKey(String authorizationOssKey) {
            this.putQueryParameter("AuthorizationOssKey", authorizationOssKey);
            this.authorizationOssKey = authorizationOssKey;
            return this;
        }

        /**
         * AutoPay.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * BlackAndWhiteIcon.
         */
        public Builder blackAndWhiteIcon(String blackAndWhiteIcon) {
            this.putQueryParameter("BlackAndWhiteIcon", blackAndWhiteIcon);
            this.blackAndWhiteIcon = blackAndWhiteIcon;
            return this;
        }

        /**
         * Channel.
         */
        public Builder channel(String channel) {
            this.putQueryParameter("Channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * Classifications.
         */
        public Builder classifications(String classifications) {
            this.putQueryParameter("Classifications", classifications);
            this.classifications = classifications;
            return this;
        }

        /**
         * IdempotentId.
         */
        public Builder idempotentId(String idempotentId) {
            this.putQueryParameter("IdempotentId", idempotentId);
            this.idempotentId = idempotentId;
            return this;
        }

        /**
         * LegalNoticeKey.
         */
        public Builder legalNoticeKey(String legalNoticeKey) {
            this.putQueryParameter("LegalNoticeKey", legalNoticeKey);
            this.legalNoticeKey = legalNoticeKey;
            return this;
        }

        /**
         * PayType.
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * PaymentCallback.
         */
        public Builder paymentCallback(String paymentCallback) {
            this.putQueryParameter("PaymentCallback", paymentCallback);
            this.paymentCallback = paymentCallback;
            return this;
        }

        /**
         * PrincipalName.
         */
        public Builder principalName(Integer principalName) {
            this.putQueryParameter("PrincipalName", principalName);
            this.principalName = principalName;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * TrademarkComment.
         */
        public Builder trademarkComment(String trademarkComment) {
            this.putQueryParameter("TrademarkComment", trademarkComment);
            this.trademarkComment = trademarkComment;
            return this;
        }

        /**
         * TrademarkIcon.
         */
        public Builder trademarkIcon(String trademarkIcon) {
            this.putQueryParameter("TrademarkIcon", trademarkIcon);
            this.trademarkIcon = trademarkIcon;
            return this;
        }

        /**
         * TrademarkName.
         */
        public Builder trademarkName(String trademarkName) {
            this.putQueryParameter("TrademarkName", trademarkName);
            this.trademarkName = trademarkName;
            return this;
        }

        /**
         * TrademarkNameType.
         */
        public Builder trademarkNameType(String trademarkNameType) {
            this.putQueryParameter("TrademarkNameType", trademarkNameType);
            this.trademarkNameType = trademarkNameType;
            return this;
        }

        @Override
        public CreateOrderRequest build() {
            return new CreateOrderRequest(this);
        } 

    } 

}
