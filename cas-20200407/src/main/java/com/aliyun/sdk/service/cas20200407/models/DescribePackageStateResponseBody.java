// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The number of issued certificates of the specified specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder issuedCount(Long issuedCount) {
            this.issuedCount = issuedCount;
            return this;
        }

        /**
         * <p>The specifications of the certificate resource plan. Valid values:</p>
         * <ul>
         * <li><strong>digicert-free-1-free</strong>: DigiCert single-domain DV certificate in a three-month free trial, available only on the China site (aliyun.com).</li>
         * <li><strong>symantec-free-1-free</strong>: DigiCert single-domain DV certificate in a one-year free trial, available only on the China site (aliyun.com).</li>
         * <li><strong>symantec-dv-1-starter</strong>: DigiCert wildcard DV certificate.</li>
         * <li><strong>symantec-ov-1-personal</strong>: DigiCert single-domain OV certificate.</li>
         * <li><strong>symantec-ov-w-personal</strong>: DigiCert wildcard OV certificate.</li>
         * <li><strong>geotrust-dv-1-starter</strong>: GeoTrust single-domain DV certificate.</li>
         * <li><strong>geotrust-dv-w-starter</strong>: GeoTrust wildcard DV certificate.</li>
         * <li><strong>geotrust-ov-1-personal</strong>: GeoTrust single-domain OV certificate.</li>
         * <li><strong>geotrust-ov-w-personal</strong>: GeoTrust wildcard OV certificate.</li>
         * <li><strong>globalsign-dv-1-personal</strong>: GlobalSign single-domain DV certificate.</li>
         * <li><strong>globalsign-dv-w-advanced</strong>: GlobalSign wildcard DV certificate.</li>
         * <li><strong>globalsign-ov-1-personal</strong>: GlobalSign single-domain OV certificate.</li>
         * <li><strong>globalsign-ov-w-advanced</strong>: GlobalSign wildcard OV certificate.</li>
         * <li><strong>cfca-ov-1-personal</strong>: CFCA single-domain OV certificate, available only on the China site (aliyun.com).</li>
         * <li><strong>cfca-ev-w-advanced</strong>: CFCA wildcard OV certificate, available only on the China site (aliyun.com).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>symantec-free-1-free</p>
         */
        public Builder productCode(String productCode) {
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>10CFA380-1C58-45C7-8075-06215F3DB681</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of purchased certificate resource plans of the specified specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The number of certificate applications that you submitted for certificates of the specified specifications.</p>
         * <blockquote>
         * <p>: A successful call of the <a href="https://help.aliyun.com/document_detail/204087.html">CreateCertificateForPackageRequest</a>, <a href="https://help.aliyun.com/document_detail/164105.html">CreateCertificateRequest</a>, or <a href="https://help.aliyun.com/document_detail/178732.html">CreateCertificateWithCsrRequest</a> operation is counted as one a certificate application, regardless of whether the certificate is issued.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
