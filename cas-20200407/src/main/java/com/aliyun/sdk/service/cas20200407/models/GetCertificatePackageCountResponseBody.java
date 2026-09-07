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
 * {@link GetCertificatePackageCountResponseBody} extends {@link TeaModel}
 *
 * <p>GetCertificatePackageCountResponseBody</p>
 */
public class GetCertificatePackageCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NoticeCountDetail")
    private String noticeCountDetail;

    @com.aliyun.core.annotation.NameInMap("ProductCountList")
    private String productCountList;

    @com.aliyun.core.annotation.NameInMap("ProxyCountDetail")
    private String proxyCountDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCountDetail")
    private String totalCountDetail;

    @com.aliyun.core.annotation.NameInMap("TrusteeCountDetail")
    private String trusteeCountDetail;

    private GetCertificatePackageCountResponseBody(Builder builder) {
        this.noticeCountDetail = builder.noticeCountDetail;
        this.productCountList = builder.productCountList;
        this.proxyCountDetail = builder.proxyCountDetail;
        this.requestId = builder.requestId;
        this.totalCountDetail = builder.totalCountDetail;
        this.trusteeCountDetail = builder.trusteeCountDetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCertificatePackageCountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return noticeCountDetail
     */
    public String getNoticeCountDetail() {
        return this.noticeCountDetail;
    }

    /**
     * @return productCountList
     */
    public String getProductCountList() {
        return this.productCountList;
    }

    /**
     * @return proxyCountDetail
     */
    public String getProxyCountDetail() {
        return this.proxyCountDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCountDetail
     */
    public String getTotalCountDetail() {
        return this.totalCountDetail;
    }

    /**
     * @return trusteeCountDetail
     */
    public String getTrusteeCountDetail() {
        return this.trusteeCountDetail;
    }

    public static final class Builder {
        private String noticeCountDetail; 
        private String productCountList; 
        private String proxyCountDetail; 
        private String requestId; 
        private String totalCountDetail; 
        private String trusteeCountDetail; 

        private Builder() {
        } 

        private Builder(GetCertificatePackageCountResponseBody model) {
            this.noticeCountDetail = model.noticeCountDetail;
            this.productCountList = model.productCountList;
            this.proxyCountDetail = model.proxyCountDetail;
            this.requestId = model.requestId;
            this.totalCountDetail = model.totalCountDetail;
            this.trusteeCountDetail = model.trusteeCountDetail;
        } 

        /**
         * <p>The message notification quota.</p>
         * 
         * <strong>example:</strong>
         * <p>{TotalCount=189, RemainCount=94, UsedCount=95}</p>
         */
        public Builder noticeCountDetail(String noticeCountDetail) {
            this.noticeCountDetail = noticeCountDetail;
            return this;
        }

        /**
         * <p>The details of certificate brand products.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *   {
         *     &quot;BrandName&quot;: &quot;CFCA&quot;,
         *     &quot;TotalCount&quot;: 14,
         *     &quot;DomainType&quot;: &quot;ONE&quot;,
         *     &quot;RemainCount&quot;: 14,
         *     &quot;ProductCode&quot;: &quot;cfca-ev-1-advanced&quot;,
         *     &quot;CertType&quot;: &quot;EV&quot;,
         *     &quot;ProductId&quot;: 8,
         *     &quot;UsedCount&quot;: 0
         *   }
         * ]</p>
         */
        public Builder productCountList(String productCountList) {
            this.productCountList = productCountList;
            return this;
        }

        /**
         * <p>The acceleration gateway forwarding quota.</p>
         * 
         * <strong>example:</strong>
         * <p>{TotalCount=116900, RemainCount=90448, AutoPay=0, AutoPayCount=5000, UsedCount=26452}</p>
         */
        public Builder proxyCountDetail(String proxyCountDetail) {
            this.proxyCountDetail = proxyCountDetail;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>08F45EA0-66A7-4504-9B31-3589F5CE308D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of domain names bound to certificates.</p>
         * 
         * <strong>example:</strong>
         * <p>{TotalCount=573, RemainCount=243, FreeQuota=10, UsedCount=330}</p>
         */
        public Builder totalCountDetail(String totalCountDetail) {
            this.totalCountDetail = totalCountDetail;
            return this;
        }

        /**
         * <p>The usage of the hosting quota.</p>
         * 
         * <strong>example:</strong>
         * <p>{TotalCount=177, ValidCount=6, RemainCount=129, UsedCount=48}</p>
         */
        public Builder trusteeCountDetail(String trusteeCountDetail) {
            this.trusteeCountDetail = trusteeCountDetail;
            return this;
        }

        public GetCertificatePackageCountResponseBody build() {
            return new GetCertificatePackageCountResponseBody(this);
        } 

    } 

}
