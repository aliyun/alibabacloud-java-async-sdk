// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePackageStateResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePackageStateResponseBody</p>
 */
public class DescribePackageStateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IssuedCount")
    private Long issuedCount;

    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("UsedCount")
    private Long usedCount;

    private DescribePackageStateResponseBody(Builder builder) {
        this.issuedCount = builder.issuedCount;
        this.productCode = builder.productCode;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.usedCount = builder.usedCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePackageStateResponseBody create() {
        return builder().build();
    }

    /**
     * @return issuedCount
     */
    public Long getIssuedCount() {
        return this.issuedCount;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return usedCount
     */
    public Long getUsedCount() {
        return this.usedCount;
    }

    public static final class Builder {
        private Long issuedCount; 
        private String productCode; 
        private String requestId; 
        private Long totalCount; 
        private Long usedCount; 

        /**
         * The number of issued certificates of the specified specifications.
         */
        public Builder issuedCount(Long issuedCount) {
            this.issuedCount = issuedCount;
            return this;
        }

        /**
         * The specifications of the certificate resource plan. Valid values:
         * <p>
         * 
         * *   **digicert-free-1-free**: DigiCert single-domain DV certificate in a three-month free trial, available only on the China site (aliyun.com).
         * *   **symantec-free-1-free**: DigiCert single-domain DV certificate in a one-year free trial, available only on the China site (aliyun.com).
         * *   **symantec-dv-1-starter**: DigiCert wildcard DV certificate.
         * *   **symantec-ov-1-personal**: DigiCert single-domain OV certificate.
         * *   **symantec-ov-w-personal**: DigiCert wildcard OV certificate.
         * *   **geotrust-dv-1-starter**: GeoTrust single-domain DV certificate.
         * *   **geotrust-dv-w-starter**: GeoTrust wildcard DV certificate.
         * *   **geotrust-ov-1-personal**: GeoTrust single-domain OV certificate.
         * *   **geotrust-ov-w-personal**: GeoTrust wildcard OV certificate.
         * *   **globalsign-dv-1-personal**: GlobalSign single-domain DV certificate.
         * *   **globalsign-dv-w-advanced**: GlobalSign wildcard DV certificate.
         * *   **globalsign-ov-1-personal**: GlobalSign single-domain OV certificate.
         * *   **globalsign-ov-w-advanced**: GlobalSign wildcard OV certificate.
         * *   **cfca-ov-1-personal**: CFCA single-domain OV certificate, available only on the China site (aliyun.com).
         * *   **cfca-ev-w-advanced**: CFCA wildcard OV certificate, available only on the China site (aliyun.com).
         */
        public Builder productCode(String productCode) {
            this.productCode = productCode;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of purchased certificate resource plans of the specified specifications.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The number of certificate applications that you submitted for certificates of the specified specifications.
         * <p>
         * 
         * > : A successful call of the [CreateCertificateForPackageRequest](~~204087~~), [CreateCertificateRequest](~~164105~~), or [CreateCertificateWithCsrRequest](~~178732~~) operation is counted as one a certificate application, regardless of whether the certificate is issued.
         */
        public Builder usedCount(Long usedCount) {
            this.usedCount = usedCount;
            return this;
        }

        public DescribePackageStateResponseBody build() {
            return new DescribePackageStateResponseBody(this);
        } 

    } 

}
