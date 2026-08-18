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
         * NoticeCountDetail.
         */
        public Builder noticeCountDetail(String noticeCountDetail) {
            this.noticeCountDetail = noticeCountDetail;
            return this;
        }

        /**
         * ProductCountList.
         */
        public Builder productCountList(String productCountList) {
            this.productCountList = productCountList;
            return this;
        }

        /**
         * ProxyCountDetail.
         */
        public Builder proxyCountDetail(String proxyCountDetail) {
            this.proxyCountDetail = proxyCountDetail;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCountDetail.
         */
        public Builder totalCountDetail(String totalCountDetail) {
            this.totalCountDetail = totalCountDetail;
            return this;
        }

        /**
         * TrusteeCountDetail.
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
