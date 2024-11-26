// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ActivateLicenseRequest} extends {@link RequestModel}
 *
 * <p>ActivateLicenseRequest</p>
 */
public class ActivateLicenseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Identification")
    private String identification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LicenseCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String licenseCode;

    private ActivateLicenseRequest(Builder builder) {
        super(builder);
        this.identification = builder.identification;
        this.licenseCode = builder.licenseCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ActivateLicenseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return identification
     */
    public String getIdentification() {
        return this.identification;
    }

    /**
     * @return licenseCode
     */
    public String getLicenseCode() {
        return this.licenseCode;
    }

    public static final class Builder extends Request.Builder<ActivateLicenseRequest, Builder> {
        private String identification; 
        private String licenseCode; 

        private Builder() {
            super();
        } 

        private Builder(ActivateLicenseRequest request) {
            super(request);
            this.identification = request.identification;
            this.licenseCode = request.licenseCode;
        } 

        /**
         * Identification.
         */
        public Builder identification(String identification) {
            this.putQueryParameter("Identification", identification);
            this.identification = identification;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>APSEDH8TA5CSGK-********_6CNTACBH9EQPOATFXJQL4B2COE7M43VVQ7GUGKAA</p>
         */
        public Builder licenseCode(String licenseCode) {
            this.putQueryParameter("LicenseCode", licenseCode);
            this.licenseCode = licenseCode;
            return this;
        }

        @Override
        public ActivateLicenseRequest build() {
            return new ActivateLicenseRequest(this);
        } 

    } 

}
