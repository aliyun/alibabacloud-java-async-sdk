// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link IdpLoginConfig} extends {@link TeaModel}
 *
 * <p>IdpLoginConfig</p>
 */
public class IdpLoginConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MobileLoginType")
    private String mobileLoginType;

    @com.aliyun.core.annotation.NameInMap("MobileMfaTypes")
    private String mobileMfaTypes;

    @com.aliyun.core.annotation.NameInMap("PcLoginType")
    private String pcLoginType;

    @com.aliyun.core.annotation.NameInMap("PcMfaTypes")
    private String pcMfaTypes;

    @com.aliyun.core.annotation.NameInMap("TotpCorpVerifyAesKey")
    private String totpCorpVerifyAesKey;

    @com.aliyun.core.annotation.NameInMap("TotpCorpVerifyToken")
    private String totpCorpVerifyToken;

    @com.aliyun.core.annotation.NameInMap("TotpCorpVerifyUrl")
    private String totpCorpVerifyUrl;

    private IdpLoginConfig(Builder builder) {
        this.mobileLoginType = builder.mobileLoginType;
        this.mobileMfaTypes = builder.mobileMfaTypes;
        this.pcLoginType = builder.pcLoginType;
        this.pcMfaTypes = builder.pcMfaTypes;
        this.totpCorpVerifyAesKey = builder.totpCorpVerifyAesKey;
        this.totpCorpVerifyToken = builder.totpCorpVerifyToken;
        this.totpCorpVerifyUrl = builder.totpCorpVerifyUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IdpLoginConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mobileLoginType
     */
    public String getMobileLoginType() {
        return this.mobileLoginType;
    }

    /**
     * @return mobileMfaTypes
     */
    public String getMobileMfaTypes() {
        return this.mobileMfaTypes;
    }

    /**
     * @return pcLoginType
     */
    public String getPcLoginType() {
        return this.pcLoginType;
    }

    /**
     * @return pcMfaTypes
     */
    public String getPcMfaTypes() {
        return this.pcMfaTypes;
    }

    /**
     * @return totpCorpVerifyAesKey
     */
    public String getTotpCorpVerifyAesKey() {
        return this.totpCorpVerifyAesKey;
    }

    /**
     * @return totpCorpVerifyToken
     */
    public String getTotpCorpVerifyToken() {
        return this.totpCorpVerifyToken;
    }

    /**
     * @return totpCorpVerifyUrl
     */
    public String getTotpCorpVerifyUrl() {
        return this.totpCorpVerifyUrl;
    }

    public static final class Builder {
        private String mobileLoginType; 
        private String mobileMfaTypes; 
        private String pcLoginType; 
        private String pcMfaTypes; 
        private String totpCorpVerifyAesKey; 
        private String totpCorpVerifyToken; 
        private String totpCorpVerifyUrl; 

        private Builder() {
        } 

        private Builder(IdpLoginConfig model) {
            this.mobileLoginType = model.mobileLoginType;
            this.mobileMfaTypes = model.mobileMfaTypes;
            this.pcLoginType = model.pcLoginType;
            this.pcMfaTypes = model.pcMfaTypes;
            this.totpCorpVerifyAesKey = model.totpCorpVerifyAesKey;
            this.totpCorpVerifyToken = model.totpCorpVerifyToken;
            this.totpCorpVerifyUrl = model.totpCorpVerifyUrl;
        } 

        /**
         * MobileLoginType.
         */
        public Builder mobileLoginType(String mobileLoginType) {
            this.mobileLoginType = mobileLoginType;
            return this;
        }

        /**
         * MobileMfaTypes.
         */
        public Builder mobileMfaTypes(String mobileMfaTypes) {
            this.mobileMfaTypes = mobileMfaTypes;
            return this;
        }

        /**
         * PcLoginType.
         */
        public Builder pcLoginType(String pcLoginType) {
            this.pcLoginType = pcLoginType;
            return this;
        }

        /**
         * PcMfaTypes.
         */
        public Builder pcMfaTypes(String pcMfaTypes) {
            this.pcMfaTypes = pcMfaTypes;
            return this;
        }

        /**
         * TotpCorpVerifyAesKey.
         */
        public Builder totpCorpVerifyAesKey(String totpCorpVerifyAesKey) {
            this.totpCorpVerifyAesKey = totpCorpVerifyAesKey;
            return this;
        }

        /**
         * TotpCorpVerifyToken.
         */
        public Builder totpCorpVerifyToken(String totpCorpVerifyToken) {
            this.totpCorpVerifyToken = totpCorpVerifyToken;
            return this;
        }

        /**
         * TotpCorpVerifyUrl.
         */
        public Builder totpCorpVerifyUrl(String totpCorpVerifyUrl) {
            this.totpCorpVerifyUrl = totpCorpVerifyUrl;
            return this;
        }

        public IdpLoginConfig build() {
            return new IdpLoginConfig(this);
        } 

    } 

}
