// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyBusinessLicenseRequest} extends {@link RequestModel}
 *
 * <p>VerifyBusinessLicenseRequest</p>
 */
public class VerifyBusinessLicenseRequest extends Request {
    @Query
    @NameInMap("CompanyName")
    @Validation(required = true)
    private String companyName;

    @Query
    @NameInMap("CreditCode")
    @Validation(required = true)
    private String creditCode;

    @Query
    @NameInMap("LegalPerson")
    @Validation(required = true)
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
         * 企业名称
         */
        public Builder companyName(String companyName) {
            this.putQueryParameter("CompanyName", companyName);
            this.companyName = companyName;
            return this;
        }

        /**
         * 工商注册号/统一社会信用代码
         */
        public Builder creditCode(String creditCode) {
            this.putQueryParameter("CreditCode", creditCode);
            this.creditCode = creditCode;
            return this;
        }

        /**
         * 企业法人姓名
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
