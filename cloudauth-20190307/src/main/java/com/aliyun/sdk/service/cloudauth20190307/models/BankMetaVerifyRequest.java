// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
    @com.aliyun.core.annotation.NameInMap("IdentityType")
    private String identityType;

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
        this.identityType = builder.identityType;
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
     * @return identityType
     */
    public String getIdentityType() {
        return this.identityType;
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
        private String identityType; 
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
            this.identityType = request.identityType;
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
         * <p>Bank card number.</p>
         * <ul>
         * <li>When <code>paramType</code> is <code>normal</code>, enter the plain text bank card number.</li>
         * <li>When <code>paramType</code> is <code>md5</code>, enter the part of the card number except the last 6 digits in plain text + the last 6 digits encrypted with MD5 (32 lowercase).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>610*************1181</p>
         */
        public Builder bankCard(String bankCard) {
            this.putQueryParameter("BankCard", bankCard);
            this.bankCard = bankCard;
            return this;
        }

        /**
         * <p>ID number.</p>
         * <ul>
         * <li>When <code>ProductType</code> is <code>BANK_CARD_3_META</code>, this field is required.</li>
         * <li>When <code>paramType</code> is <code>normal</code>, enter the plain text ID number.</li>
         * <li>When <code>paramType</code> is <code>md5</code>, enter the first 6 digits of the ID number in plain text + the birth date encrypted with MD5 (32 lowercase MD5) + the last 4 digits of the ID number.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>429001********8211</p>
         */
        public Builder identifyNum(String identifyNum) {
            this.putQueryParameter("IdentifyNum", identifyNum);
            this.identifyNum = identifyNum;
            return this;
        }

        /**
         * <p>Identity type.</p>
         * 
         * <strong>example:</strong>
         * <p>01</p>
         */
        public Builder identityType(String identityType) {
            this.putQueryParameter("IdentityType", identityType);
            this.identityType = identityType;
            return this;
        }

        /**
         * <p>Mobile phone number.</p>
         * <ul>
         * <li>When <code>ProductType</code> is <code>BANK_CARD_4_META</code>, this field is required.</li>
         * <li>When <code>paramType</code> is <code>normal</code>, enter the plain text mobile phone number.</li>
         * <li>When <code>paramType</code> is <code>md5</code>, enter the mobile phone number (32 lowercase MD5).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>138******11</p>
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * <p>Parameter type:</p>
         * <ul>
         * <li>normal: Unencrypted.</li>
         * <li>md5: MD5 encrypted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder paramType(String paramType) {
            this.putQueryParameter("ParamType", paramType);
            this.paramType = paramType;
            return this;
        }

        /**
         * <p>Product type to call:</p>
         * <ul>
         * <li>BANK_CARD_2_META: Bank card number + name verification.</li>
         * <li>BANK_CARD_3_META: Bank card number + name + ID number verification.</li>
         * <li>BANK_CARD_4_META: Bank card number + name + ID number + mobile phone number verification.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BANK_CARD_2_META</p>
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>Name.</p>
         * <ul>
         * <li>When <code>paramType</code> is <code>normal</code>, enter the plain text name.</li>
         * <li>When <code>paramType</code> is <code>md5</code>, encrypt the first character of the name with MD5 (32 lowercase MD5) + the rest of the name in plain text.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>张*</p>
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * <p>VERIFY_BANK_CARD: Bank card authentication mode. It indicates whether the provided bank card number matches the user&quot;s real name, ID number, and mobile phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>VERIFY_BANK_CARD</p>
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
