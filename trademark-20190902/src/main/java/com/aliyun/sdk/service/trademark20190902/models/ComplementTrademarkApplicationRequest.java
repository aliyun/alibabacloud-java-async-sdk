// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ComplementTrademarkApplicationRequest} extends {@link RequestModel}
 *
 * <p>ComplementTrademarkApplicationRequest</p>
 */
public class ComplementTrademarkApplicationRequest extends Request {
    @Query
    @NameInMap("AgreementId")
    private String agreementId;

    @Query
    @NameInMap("AuthorizationOssKey")
    private String authorizationOssKey;

    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Query
    @NameInMap("IsBlackIcon")
    private Boolean isBlackIcon;

    @Query
    @NameInMap("MaterialId")
    private String materialId;

    @Query
    @NameInMap("OrderData")
    private String orderData;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("TrademarkComment")
    @Validation(required = true)
    private String trademarkComment;

    @Query
    @NameInMap("TrademarkIconOssKey")
    @Validation(required = true)
    private String trademarkIconOssKey;

    @Query
    @NameInMap("TrademarkName")
    private String trademarkName;

    @Query
    @NameInMap("TrademarkNameType")
    private String trademarkNameType;

    @Query
    @NameInMap("TrademarkType")
    @Validation(maximum = 100, minimum = 1)
    private Integer trademarkType;

    private ComplementTrademarkApplicationRequest(Builder builder) {
        super(builder);
        this.agreementId = builder.agreementId;
        this.authorizationOssKey = builder.authorizationOssKey;
        this.bizId = builder.bizId;
        this.isBlackIcon = builder.isBlackIcon;
        this.materialId = builder.materialId;
        this.orderData = builder.orderData;
        this.source = builder.source;
        this.trademarkComment = builder.trademarkComment;
        this.trademarkIconOssKey = builder.trademarkIconOssKey;
        this.trademarkName = builder.trademarkName;
        this.trademarkNameType = builder.trademarkNameType;
        this.trademarkType = builder.trademarkType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ComplementTrademarkApplicationRequest create() {
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
     * @return authorizationOssKey
     */
    public String getAuthorizationOssKey() {
        return this.authorizationOssKey;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return isBlackIcon
     */
    public Boolean getIsBlackIcon() {
        return this.isBlackIcon;
    }

    /**
     * @return materialId
     */
    public String getMaterialId() {
        return this.materialId;
    }

    /**
     * @return orderData
     */
    public String getOrderData() {
        return this.orderData;
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
     * @return trademarkIconOssKey
     */
    public String getTrademarkIconOssKey() {
        return this.trademarkIconOssKey;
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

    /**
     * @return trademarkType
     */
    public Integer getTrademarkType() {
        return this.trademarkType;
    }

    public static final class Builder extends Request.Builder<ComplementTrademarkApplicationRequest, Builder> {
        private String agreementId; 
        private String authorizationOssKey; 
        private String bizId; 
        private Boolean isBlackIcon; 
        private String materialId; 
        private String orderData; 
        private String source; 
        private String trademarkComment; 
        private String trademarkIconOssKey; 
        private String trademarkName; 
        private String trademarkNameType; 
        private Integer trademarkType; 

        private Builder() {
            super();
        } 

        private Builder(ComplementTrademarkApplicationRequest request) {
            super(request);
            this.agreementId = request.agreementId;
            this.authorizationOssKey = request.authorizationOssKey;
            this.bizId = request.bizId;
            this.isBlackIcon = request.isBlackIcon;
            this.materialId = request.materialId;
            this.orderData = request.orderData;
            this.source = request.source;
            this.trademarkComment = request.trademarkComment;
            this.trademarkIconOssKey = request.trademarkIconOssKey;
            this.trademarkName = request.trademarkName;
            this.trademarkNameType = request.trademarkNameType;
            this.trademarkType = request.trademarkType;
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
         * AuthorizationOssKey.
         */
        public Builder authorizationOssKey(String authorizationOssKey) {
            this.putQueryParameter("AuthorizationOssKey", authorizationOssKey);
            this.authorizationOssKey = authorizationOssKey;
            return this;
        }

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * IsBlackIcon.
         */
        public Builder isBlackIcon(Boolean isBlackIcon) {
            this.putQueryParameter("IsBlackIcon", isBlackIcon);
            this.isBlackIcon = isBlackIcon;
            return this;
        }

        /**
         * MaterialId.
         */
        public Builder materialId(String materialId) {
            this.putQueryParameter("MaterialId", materialId);
            this.materialId = materialId;
            return this;
        }

        /**
         * OrderData.
         */
        public Builder orderData(String orderData) {
            this.putQueryParameter("OrderData", orderData);
            this.orderData = orderData;
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
         * TrademarkIconOssKey.
         */
        public Builder trademarkIconOssKey(String trademarkIconOssKey) {
            this.putQueryParameter("TrademarkIconOssKey", trademarkIconOssKey);
            this.trademarkIconOssKey = trademarkIconOssKey;
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

        /**
         * TrademarkType.
         */
        public Builder trademarkType(Integer trademarkType) {
            this.putQueryParameter("TrademarkType", trademarkType);
            this.trademarkType = trademarkType;
            return this;
        }

        @Override
        public ComplementTrademarkApplicationRequest build() {
            return new ComplementTrademarkApplicationRequest(this);
        } 

    } 

}
