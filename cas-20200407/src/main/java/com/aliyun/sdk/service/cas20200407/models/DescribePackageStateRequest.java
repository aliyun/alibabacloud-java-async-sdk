// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
         * <p>The specifications of the certificate resource plan. Valid values:</p>
         * <ul>
         * <li><p><strong>digicert-free-1-free</strong> (default): DigiCert single-domain domain validated (DV) certificate in a three-month free trial, available only on the China site (aliyun.com).</p>
         * </li>
         * <li><p><strong>symantec-free-1-free</strong>: DigiCert single-domain DV certificate in a one-year free trial, available only on the China site (aliyun.com).</p>
         * </li>
         * <li><p><strong>symantec-dv-1-starter</strong>: DigiCert wildcard DV certificate.</p>
         * </li>
         * <li><p><strong>symantec-ov-1-personal</strong>: DigiCert single-domain organization validated (OV) certificate.</p>
         * </li>
         * <li><p><strong>symantec-ov-w-personal</strong>: DigiCert wildcard OV certificate.</p>
         * </li>
         * <li><p><strong>geotrust-dv-1-starter</strong>: GeoTrust single-domain DV certificate.</p>
         * </li>
         * <li><p><strong>geotrust-dv-w-starter</strong>: GeoTrust wildcard DV certificate.</p>
         * </li>
         * <li><p><strong>geotrust-ov-1-personal</strong>: GeoTrust single-domain OV certificate.</p>
         * </li>
         * <li><p><strong>geotrust-ov-w-personal</strong>: GeoTrust wildcard OV certificate.</p>
         * </li>
         * <li><p><strong>globalsign-dv-1-personal</strong>: GlobalSign single-domain DV certificate.</p>
         * </li>
         * <li><p><strong>globalsign-dv-w-advanced</strong>: GlobalSign wildcard DV certificate.</p>
         * </li>
         * <li><p><strong>globalsign-ov-1-personal</strong>: GlobalSign single-domain OV certificate.</p>
         * </li>
         * <li><p><strong>globalsign-ov-w-advanced</strong>: GlobalSign wildcard OV certificate.</p>
         * </li>
         * <li><p><strong>cfca-ov-1-personal</strong>: China Financial Certification Authority (CFCA) single-domain OV certificate, available only on the China site (aliyun.com).</p>
         * </li>
         * <li><p><strong>cfca-ev-w-advanced</strong>: CFCA wildcard OV certificate, available only on the China site (aliyun.com).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>digicert-free-1-free</p>
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
