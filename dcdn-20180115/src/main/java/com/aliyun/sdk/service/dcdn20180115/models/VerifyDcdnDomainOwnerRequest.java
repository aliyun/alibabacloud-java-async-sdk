// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyDcdnDomainOwnerRequest} extends {@link RequestModel}
 *
 * <p>VerifyDcdnDomainOwnerRequest</p>
 */
public class VerifyDcdnDomainOwnerRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("VerifyType")
    @Validation(required = true)
    private String verifyType;

    private VerifyDcdnDomainOwnerRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.verifyType = builder.verifyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyDcdnDomainOwnerRequest create() {
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

    public static final class Builder extends Request.Builder<VerifyDcdnDomainOwnerRequest, Builder> {
        private String domainName; 
        private String verifyType; 

        private Builder() {
            super();
        } 

        private Builder(VerifyDcdnDomainOwnerRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.verifyType = request.verifyType;
        } 

        /**
         * The domain name of which you want to verify the ownership. You can specify only one domain name in each call.
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
        public VerifyDcdnDomainOwnerRequest build() {
            return new VerifyDcdnDomainOwnerRequest(this);
        } 

    } 

}
