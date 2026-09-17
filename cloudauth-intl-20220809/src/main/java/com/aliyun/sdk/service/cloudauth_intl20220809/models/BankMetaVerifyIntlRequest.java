// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

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
 * {@link BankMetaVerifyIntlRequest} extends {@link RequestModel}
 *
 * <p>BankMetaVerifyIntlRequest</p>
 */
public class BankMetaVerifyIntlRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BankCard")
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.Validation(required = true)
    private String paramType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VerifyMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String verifyMode;

    private BankMetaVerifyIntlRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bankCard = builder.bankCard;
        this.identifyNum = builder.identifyNum;
        this.identityType = builder.identityType;
        this.mobile = builder.mobile;
        this.paramType = builder.paramType;
        this.productCode = builder.productCode;
        this.productType = builder.productType;
        this.userName = builder.userName;
        this.verifyMode = builder.verifyMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BankMetaVerifyIntlRequest create() {
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
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
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

    public static final class Builder extends Request.Builder<BankMetaVerifyIntlRequest, Builder> {
        private String regionId; 
        private String bankCard; 
        private String identifyNum; 
        private String identityType; 
        private String mobile; 
        private String paramType; 
        private String productCode; 
        private String productType; 
        private String userName; 
        private String verifyMode; 

        private Builder() {
            super();
        } 

        private Builder(BankMetaVerifyIntlRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bankCard = request.bankCard;
            this.identifyNum = request.identifyNum;
            this.identityType = request.identityType;
            this.mobile = request.mobile;
            this.paramType = request.paramType;
            this.productCode = request.productCode;
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
         * <p>The bank card number.</p>
         * <ul>
         * <li>If paramType is set to normal, enter the bank card number in plaintext.</li>
         * <li>If paramType is set to md5, provide the plaintext of all digits except the last 6 digits + the MD5 value (32-character lowercase) of the last 6 digits.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>● 明文：12345678******
         * ● 密文：
         * 12345678f8ee21920e37807b43e7e912ab829b6e</p>
         */
        public Builder bankCard(String bankCard) {
            this.putQueryParameter("BankCard", bankCard);
            this.bankCard = bankCard;
            return this;
        }

        /**
         * <p>The ID document number.</p>
         * <ul>
         * <li>If paramType is set to normal, enter the ID document number in plaintext.</li>
         * <li>If paramType is set to md5:<ul>
         * <li>For ID cards: the first 6 digits (plaintext) + date of birth (ciphertext) + the last 4 digits (plaintext).</li>
         * <li>For other documents: the last 2 characters are MD5-encrypted.</li>
         * </ul>
         * </li>
         * </ul>
         * <p>Important:
         * This parameter is required when ProductType is set to one of the following values:</p>
         * <ul>
         * <li>BANK_CARD_3_META</li>
         * <li>BANK_CARD_4_META.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>● 明文：429001********8211
         * ● 密文：
         * 42900132fa7bcd874161bea8ec8fd98f390ec98211</p>
         */
        public Builder identifyNum(String identifyNum) {
            this.putQueryParameter("IdentifyNum", identifyNum);
            this.identifyNum = identifyNum;
            return this;
        }

        /**
         * <p>The ID document type. If left empty, the default value is ID card. For other document types, refer to the table below.</p>
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
         * <p>The phone number.</p>
         * <ul>
         * <li>If paramType is set to normal, enter the phone number in plaintext.</li>
         * <li>If paramType is set to md5, enter the phone number in ciphertext.</li>
         * </ul>
         * <p>Important:</p>
         * <ul>
         * <li>This parameter is required when ProductType is set to BANK_CARD_4_META.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>● 明文：186****2055
         * ● 密文：
         * 849169cd3b20621c1c78bd61a11a4fc2</p>
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * <p>The encryption method. Valid values:</p>
         * <ul>
         * <li>normal: no encryption</li>
         * <li>md5: MD5 encryption</li>
         * </ul>
         * <p>Important:</p>
         * <ul>
         * <li>All encrypted parameter values must be 32-character lowercase MD5 strings.</li>
         * <li>Different MD5 tools may produce different ciphertext. If the API call succeeds before encryption but fails after encryption, try a different MD5 tool.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>Fixed value: BANK_CARD_N_META.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BANK_CARD_N_META</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The product type to call. Valid values:</p>
         * <ul>
         * <li>BANK_CARD_2_META: Bank card number + name verification.</li>
         * <li>BANK_CARD_3_META: Bank card number + name + ID card number verification.</li>
         * <li>BANK_CARD_4_META: Bank card number + name + ID card number + phone number verification.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BANK_CARD_4_META</p>
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The name.</p>
         * <ul>
         * <li>If paramType is set to normal, enter the name in plaintext.</li>
         * <li>If paramType is set to md5, provide the MD5-encrypted first character of the name (32-character lowercase MD5) + the plaintext of the remaining characters.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>VERIFY_BANK_CARD: bank card authentication mode. Indicates whether the provided bank card number matches the user\&quot;s real name, ID card number, and phone number.</p>
         * <p>This parameter is required.</p>
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
        public BankMetaVerifyIntlRequest build() {
            return new BankMetaVerifyIntlRequest(this);
        } 

    } 

}
