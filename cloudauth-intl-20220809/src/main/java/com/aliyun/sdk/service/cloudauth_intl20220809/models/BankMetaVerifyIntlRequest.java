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
         * <p>Bank card number.</p>
         * <ul>
         * <li>When paramType is set to normal, enter the plaintext bank card number.</li>
         * <li>When paramType is set to md5, enter the plaintext part of the card number except the last 6 digits, followed by the MD5 value of the last 6 digits (32-character lowercase).</li>
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
         * <p>ID number:</p>
         * <ul>
         * <li>When paramType is normal: Enter the plaintext ID number.</li>
         * <li>When paramType is md5:<ul>
         * <li>First 6 digits of the ID number (plaintext) + date of birth (ciphertext) + last 4 digits of the ID number (plaintext).</li>
         * <li>For other IDs, encrypt the last two digits with MD5.</li>
         * </ul>
         * </li>
         * </ul>
         * <p>Important
         * This field is required when ProductType is one of the following:</p>
         * <ul>
         * <li>BANK_CARD_3_META</li>
         * <li>BANK_CARD_4_META</li>
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
         * <p>ID type (default to ID card if left empty, see the table below for other types).</p>
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
         * <p>Phone number:</p>
         * <ul>
         * <li>When paramType is normal: Enter the plaintext phone number.</li>
         * <li>When paramType is md5: Enter the ciphertext phone number.</li>
         * </ul>
         * <p>Important</p>
         * <ul>
         * <li>This field is required when ProductType = BANK_CARD_4_META.</li>
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
         * <p>Encryption method:</p>
         * <ul>
         * <li>normal: no encryption</li>
         * <li>md5: md5 encryption</li>
         * </ul>
         * <p>Important:</p>
         * <ul>
         * <li>All encrypted parameters should be in the form of a 32-character lowercase MD5 string.</li>
         * <li>The ciphertext generated by different MD5 tools may vary. If the interface works before encryption but not after, try changing the MD5 tool.</li>
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
         * <p>Fixed value: BANK_CARD_N_META</p>
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
         * <p>Product type to call:</p>
         * <ul>
         * <li>BANK_CARD_2_META: Bank card number + name verification.</li>
         * <li>BANK_CARD_3_META: Bank card number + name + ID number verification.</li>
         * <li>BANK_CARD_4_META: Bank card number + name + ID number + phone number verification.</li>
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
         * <p>Name.</p>
         * <ul>
         * <li>When paramType is set to normal, enter the plaintext name.</li>
         * <li>When paramType is set to md5, encrypt the first character of the name with MD5 (32-character lowercase MD5) and append the rest of the name in plaintext.</li>
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
         * <p>VERIFY_BANK_CARD: Bank card authentication mode. This indicates whether the provided bank card number matches the user&quot;s real name, ID number, and phone number.</p>
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
