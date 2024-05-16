// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyDomainOwnerRequest} extends {@link RequestModel}
 *
 * <p>VerifyDomainOwnerRequest</p>
 */
public class VerifyDomainOwnerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VerifyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String verifyType;

    private VerifyDomainOwnerRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.verifyType = builder.verifyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyDomainOwnerRequest create() {
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
     * @return verifyType
     */
    public String getVerifyType() {
        return this.verifyType;
    }

    public static final class Builder extends Request.Builder<VerifyDomainOwnerRequest, Builder> {
        private String domainName; 
        private String verifyType; 

        private Builder() {
            super();
        } 

        private Builder(VerifyDomainOwnerRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.verifyType = request.verifyType;
        } 

        /**
         * The domain name of which you want to verify the ownership. You can specify only one domain name.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The verification method. Valid values:
         * <p>
         * 
         * *   **dnsCheck**: by DNS record
         * *   **fileCheck**: by verification file
         */
        public Builder verifyType(String verifyType) {
            this.putQueryParameter("VerifyType", verifyType);
            this.verifyType = verifyType;
            return this;
        }

        @Override
        public VerifyDomainOwnerRequest build() {
            return new VerifyDomainOwnerRequest(this);
        } 

    } 

}
