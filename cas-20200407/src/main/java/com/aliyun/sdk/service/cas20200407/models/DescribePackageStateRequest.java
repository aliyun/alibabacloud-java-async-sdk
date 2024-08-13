// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePackageStateRequest} extends {@link RequestModel}
 *
 * <p>DescribePackageStateRequest</p>
 */
public class DescribePackageStateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    private DescribePackageStateRequest(Builder builder) {
        super(builder);
        this.productCode = builder.productCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePackageStateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    public static final class Builder extends Request.Builder<DescribePackageStateRequest, Builder> {
        private String productCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribePackageStateRequest request) {
            super(request);
            this.productCode = request.productCode;
        } 

        /**
         * The specifications of the certificate resource plan. Valid values:
         * <p>
         * 
         * *   **digicert-free-1-free** (default): DigiCert single-domain domain validated (DV) certificate in a three-month free trial, available only on the China site (aliyun.com).
         * *   **symantec-free-1-free**: DigiCert single-domain DV certificate in a one-year free trial, available only on the China site (aliyun.com).
         * *   **symantec-dv-1-starter**: DigiCert wildcard DV certificate.
         * *   **symantec-ov-1-personal**: DigiCert single-domain organization validated (OV) certificate.
         * *   **symantec-ov-w-personal**: DigiCert wildcard OV certificate.
         * *   **geotrust-dv-1-starter**: GeoTrust single-domain DV certificate.
         * *   **geotrust-dv-w-starter**: GeoTrust wildcard DV certificate.
         * *   **geotrust-ov-1-personal**: GeoTrust single-domain OV certificate.
         * *   **geotrust-ov-w-personal**: GeoTrust wildcard OV certificate.
         * *   **globalsign-dv-1-personal**: GlobalSign single-domain DV certificate.
         * *   **globalsign-dv-w-advanced**: GlobalSign wildcard DV certificate.
         * *   **globalsign-ov-1-personal**: GlobalSign single-domain OV certificate.
         * *   **globalsign-ov-w-advanced**: GlobalSign wildcard OV certificate.
         * *   **cfca-ov-1-personal**: China Financial Certification Authority (CFCA) single-domain OV certificate, available only on the China site (aliyun.com).
         * *   **cfca-ev-w-advanced**: CFCA wildcard OV certificate, available only on the China site (aliyun.com).
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        @Override
        public DescribePackageStateRequest build() {
            return new DescribePackageStateRequest(this);
        } 

    } 

}
