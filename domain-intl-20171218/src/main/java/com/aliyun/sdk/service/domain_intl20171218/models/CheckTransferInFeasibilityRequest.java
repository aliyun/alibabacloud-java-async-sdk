// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckTransferInFeasibilityRequest} extends {@link RequestModel}
 *
 * <p>CheckTransferInFeasibilityRequest</p>
 */
public class CheckTransferInFeasibilityRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransferAuthorizationCode")
    private String transferAuthorizationCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private CheckTransferInFeasibilityRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.lang = builder.lang;
        this.transferAuthorizationCode = builder.transferAuthorizationCode;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckTransferInFeasibilityRequest create() {
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

    public static final class Builder extends Request.Builder<CheckTransferInFeasibilityRequest, Builder> {
        private String domainName; 
        private String lang; 
        private String transferAuthorizationCode; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(CheckTransferInFeasibilityRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.lang = request.lang;
            this.transferAuthorizationCode = request.transferAuthorizationCode;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * DomainName.
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
         * TransferAuthorizationCode.
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
        public CheckTransferInFeasibilityRequest build() {
            return new CheckTransferInFeasibilityRequest(this);
        } 

    } 

}
