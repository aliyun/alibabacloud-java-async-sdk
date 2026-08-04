// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link CreateRealNameCertificationRequest} extends {@link RequestModel}
 *
 * <p>CreateRealNameCertificationRequest</p>
 */
public class CreateRealNameCertificationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountCertifyType")
    private String accountCertifyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CorporateLicenseNumber")
    private String corporateLicenseNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CorporateName")
    private String corporateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LicenseNumber")
    private String licenseNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LicenseType")
    private String licenseType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pk")
    private String pk;

    private CreateRealNameCertificationRequest(Builder builder) {
        super(builder);
        this.accountCertifyType = builder.accountCertifyType;
        this.corporateLicenseNumber = builder.corporateLicenseNumber;
        this.corporateName = builder.corporateName;
        this.licenseNumber = builder.licenseNumber;
        this.licenseType = builder.licenseType;
        this.name = builder.name;
        this.pk = builder.pk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRealNameCertificationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountCertifyType
     */
    public String getAccountCertifyType() {
        return this.accountCertifyType;
    }

    /**
     * @return corporateLicenseNumber
     */
    public String getCorporateLicenseNumber() {
        return this.corporateLicenseNumber;
    }

    /**
     * @return corporateName
     */
    public String getCorporateName() {
        return this.corporateName;
    }

    /**
     * @return licenseNumber
     */
    public String getLicenseNumber() {
        return this.licenseNumber;
    }

    /**
     * @return licenseType
     */
    public String getLicenseType() {
        return this.licenseType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pk
     */
    public String getPk() {
        return this.pk;
    }

    public static final class Builder extends Request.Builder<CreateRealNameCertificationRequest, Builder> {
        private String accountCertifyType; 
        private String corporateLicenseNumber; 
        private String corporateName; 
        private String licenseNumber; 
        private String licenseType; 
        private String name; 
        private String pk; 

        private Builder() {
            super();
        } 

        private Builder(CreateRealNameCertificationRequest request) {
            super(request);
            this.accountCertifyType = request.accountCertifyType;
            this.corporateLicenseNumber = request.corporateLicenseNumber;
            this.corporateName = request.corporateName;
            this.licenseNumber = request.licenseNumber;
            this.licenseType = request.licenseType;
            this.name = request.name;
            this.pk = request.pk;
        } 

        /**
         * AccountCertifyType.
         */
        public Builder accountCertifyType(String accountCertifyType) {
            this.putQueryParameter("AccountCertifyType", accountCertifyType);
            this.accountCertifyType = accountCertifyType;
            return this;
        }

        /**
         * CorporateLicenseNumber.
         */
        public Builder corporateLicenseNumber(String corporateLicenseNumber) {
            this.putQueryParameter("CorporateLicenseNumber", corporateLicenseNumber);
            this.corporateLicenseNumber = corporateLicenseNumber;
            return this;
        }

        /**
         * CorporateName.
         */
        public Builder corporateName(String corporateName) {
            this.putQueryParameter("CorporateName", corporateName);
            this.corporateName = corporateName;
            return this;
        }

        /**
         * LicenseNumber.
         */
        public Builder licenseNumber(String licenseNumber) {
            this.putQueryParameter("LicenseNumber", licenseNumber);
            this.licenseNumber = licenseNumber;
            return this;
        }

        /**
         * LicenseType.
         */
        public Builder licenseType(String licenseType) {
            this.putQueryParameter("LicenseType", licenseType);
            this.licenseType = licenseType;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Pk.
         */
        public Builder pk(String pk) {
            this.putQueryParameter("Pk", pk);
            this.pk = pk;
            return this;
        }

        @Override
        public CreateRealNameCertificationRequest build() {
            return new CreateRealNameCertificationRequest(this);
        } 

    } 

}
