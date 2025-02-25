// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TransferInReenterTransferAuthorizationCodeRequest} extends {@link RequestModel}
 *
 * <p>TransferInReenterTransferAuthorizationCodeRequest</p>
 */
public class TransferInReenterTransferAuthorizationCodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransferAuthorizationCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transferAuthorizationCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private TransferInReenterTransferAuthorizationCodeRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.lang = builder.lang;
        this.transferAuthorizationCode = builder.transferAuthorizationCode;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransferInReenterTransferAuthorizationCodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return transferAuthorizationCode
     */
    public String getTransferAuthorizationCode() {
        return this.transferAuthorizationCode;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<TransferInReenterTransferAuthorizationCodeRequest, Builder> {
        private String domainName; 
        private String lang; 
        private String transferAuthorizationCode; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(TransferInReenterTransferAuthorizationCodeRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.lang = request.lang;
            this.transferAuthorizationCode = request.transferAuthorizationCode;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testCode</p>
         */
        public Builder transferAuthorizationCode(String transferAuthorizationCode) {
            this.putQueryParameter("TransferAuthorizationCode", transferAuthorizationCode);
            this.transferAuthorizationCode = transferAuthorizationCode;
            return this;
        }

        /**
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public TransferInReenterTransferAuthorizationCodeRequest build() {
            return new TransferInReenterTransferAuthorizationCodeRequest(this);
        } 

    } 

}
