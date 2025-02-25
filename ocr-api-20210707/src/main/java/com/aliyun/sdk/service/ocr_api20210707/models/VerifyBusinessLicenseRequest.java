// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link VerifyBusinessLicenseRequest} extends {@link RequestModel}
 *
 * <p>VerifyBusinessLicenseRequest</p>
 */
public class VerifyBusinessLicenseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompanyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String companyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreditCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String creditCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LegalPerson")
    @com.aliyun.core.annotation.Validation(required = true)
    private String legalPerson;

    private VerifyBusinessLicenseRequest(Builder builder) {
        super(builder);
        this.companyName = builder.companyName;
        this.creditCode = builder.creditCode;
        this.legalPerson = builder.legalPerson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyBusinessLicenseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return companyName
     */
    public String getCompanyName() {
        return this.companyName;
    }

    /**
     * @return creditCode
     */
    public String getCreditCode() {
        return this.creditCode;
    }

    /**
     * @return legalPerson
     */
    public String getLegalPerson() {
        return this.legalPerson;
    }

    public static final class Builder extends Request.Builder<VerifyBusinessLicenseRequest, Builder> {
        private String companyName; 
        private String creditCode; 
        private String legalPerson; 

        private Builder() {
            super();
        } 

        private Builder(VerifyBusinessLicenseRequest request) {
            super(request);
            this.companyName = request.companyName;
            this.creditCode = request.creditCode;
            this.legalPerson = request.legalPerson;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder companyName(String companyName) {
            this.putQueryParameter("CompanyName", companyName);
            this.companyName = companyName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder creditCode(String creditCode) {
            this.putQueryParameter("CreditCode", creditCode);
            this.creditCode = creditCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder legalPerson(String legalPerson) {
            this.putQueryParameter("LegalPerson", legalPerson);
            this.legalPerson = legalPerson;
            return this;
        }

        @Override
        public VerifyBusinessLicenseRequest build() {
            return new VerifyBusinessLicenseRequest(this);
        } 

    } 

}
