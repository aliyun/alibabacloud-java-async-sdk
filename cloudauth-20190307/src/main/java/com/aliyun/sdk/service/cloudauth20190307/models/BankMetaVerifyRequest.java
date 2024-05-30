// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BankMetaVerifyRequest} extends {@link RequestModel}
 *
 * <p>BankMetaVerifyRequest</p>
 */
public class BankMetaVerifyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BankCard")
    private String bankCard;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentifyNum")
    private String identifyNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mobile")
    private String mobile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParamType")
    private String paramType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VerifyMode")
    private String verifyMode;

    private BankMetaVerifyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bankCard = builder.bankCard;
        this.identifyNum = builder.identifyNum;
        this.mobile = builder.mobile;
        this.paramType = builder.paramType;
        this.productType = builder.productType;
        this.userName = builder.userName;
        this.verifyMode = builder.verifyMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BankMetaVerifyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return bankCard
     */
    public String getBankCard() {
        return this.bankCard;
    }

    /**
     * @return identifyNum
     */
    public String getIdentifyNum() {
        return this.identifyNum;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * @return paramType
     */
    public String getParamType() {
        return this.paramType;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return verifyMode
     */
    public String getVerifyMode() {
        return this.verifyMode;
    }

    public static final class Builder extends Request.Builder<BankMetaVerifyRequest, Builder> {
        private String regionId; 
        private String bankCard; 
        private String identifyNum; 
        private String mobile; 
        private String paramType; 
        private String productType; 
        private String userName; 
        private String verifyMode; 

        private Builder() {
            super();
        } 

        private Builder(BankMetaVerifyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bankCard = request.bankCard;
            this.identifyNum = request.identifyNum;
            this.mobile = request.mobile;
            this.paramType = request.paramType;
            this.productType = request.productType;
            this.userName = request.userName;
            this.verifyMode = request.verifyMode;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * BankCard.
         */
        public Builder bankCard(String bankCard) {
            this.putQueryParameter("BankCard", bankCard);
            this.bankCard = bankCard;
            return this;
        }

        /**
         * IdentifyNum.
         */
        public Builder identifyNum(String identifyNum) {
            this.putQueryParameter("IdentifyNum", identifyNum);
            this.identifyNum = identifyNum;
            return this;
        }

        /**
         * Mobile.
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * ParamType.
         */
        public Builder paramType(String paramType) {
            this.putQueryParameter("ParamType", paramType);
            this.paramType = paramType;
            return this;
        }

        /**
         * ProductType.
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * VerifyMode.
         */
        public Builder verifyMode(String verifyMode) {
            this.putQueryParameter("VerifyMode", verifyMode);
            this.verifyMode = verifyMode;
            return this;
        }

        @Override
        public BankMetaVerifyRequest build() {
            return new BankMetaVerifyRequest(this);
        } 

    } 

}
