// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLicenseRequest} extends {@link RequestModel}
 *
 * <p>DescribeLicenseRequest</p>
 */
public class DescribeLicenseRequest extends Request {
    @Query
    @NameInMap("LicenseCode")
    @Validation(required = true)
    private String licenseCode;

    private DescribeLicenseRequest(Builder builder) {
        super(builder);
        this.licenseCode = builder.licenseCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLicenseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return licenseCode
     */
    public String getLicenseCode() {
        return this.licenseCode;
    }

    public static final class Builder extends Request.Builder<DescribeLicenseRequest, Builder> {
        private String licenseCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLicenseRequest request) {
            super(request);
            this.licenseCode = request.licenseCode;
        } 

        /**
         * LicenseCode.
         */
        public Builder licenseCode(String licenseCode) {
            this.putQueryParameter("LicenseCode", licenseCode);
            this.licenseCode = licenseCode;
            return this;
        }

        @Override
        public DescribeLicenseRequest build() {
            return new DescribeLicenseRequest(this);
        } 

    } 

}
