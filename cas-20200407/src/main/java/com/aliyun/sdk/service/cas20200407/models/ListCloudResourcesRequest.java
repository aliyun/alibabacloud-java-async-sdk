// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCloudResourcesRequest} extends {@link RequestModel}
 *
 * <p>ListCloudResourcesRequest</p>
 */
public class ListCloudResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertIds")
    private java.util.List < Long > certIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudName")
    private String cloudName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudProduct")
    private String cloudProduct;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretId")
    private String secretId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Integer showSize;

    private ListCloudResourcesRequest(Builder builder) {
        super(builder);
        this.certIds = builder.certIds;
        this.cloudName = builder.cloudName;
        this.cloudProduct = builder.cloudProduct;
        this.currentPage = builder.currentPage;
        this.keyword = builder.keyword;
        this.secretId = builder.secretId;
        this.showSize = builder.showSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloudResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certIds
     */
    public java.util.List < Long > getCertIds() {
        return this.certIds;
    }

    /**
     * @return cloudName
     */
    public String getCloudName() {
        return this.cloudName;
    }

    /**
     * @return cloudProduct
     */
    public String getCloudProduct() {
        return this.cloudProduct;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return secretId
     */
    public String getSecretId() {
        return this.secretId;
    }

    /**
     * @return showSize
     */
    public Integer getShowSize() {
        return this.showSize;
    }

    public static final class Builder extends Request.Builder<ListCloudResourcesRequest, Builder> {
        private java.util.List < Long > certIds; 
        private String cloudName; 
        private String cloudProduct; 
        private Integer currentPage; 
        private String keyword; 
        private String secretId; 
        private Integer showSize; 

        private Builder() {
            super();
        } 

        private Builder(ListCloudResourcesRequest request) {
            super(request);
            this.certIds = request.certIds;
            this.cloudName = request.cloudName;
            this.cloudProduct = request.cloudProduct;
            this.currentPage = request.currentPage;
            this.keyword = request.keyword;
            this.secretId = request.secretId;
            this.showSize = request.showSize;
        } 

        /**
         * CertIds.
         */
        public Builder certIds(java.util.List < Long > certIds) {
            String certIdsShrink = shrink(certIds, "CertIds", "json");
            this.putQueryParameter("CertIds", certIdsShrink);
            this.certIds = certIds;
            return this;
        }

        /**
         * The cloud service provider.
         * <p>
         * 
         * Valid values:
         * 
         * *   Tencent: Tencent Cloud
         * *   aliyun: Alibaba Cloud
         */
        public Builder cloudName(String cloudName) {
            this.putQueryParameter("CloudName", cloudName);
            this.cloudName = cloudName;
            return this;
        }

        /**
         * The cloud service. Only Content Delivery Network (CDN) is supported for Tencent Cloud.
         */
        public Builder cloudProduct(String cloudProduct) {
            this.putQueryParameter("CloudProduct", cloudProduct);
            this.cloudProduct = cloudProduct;
            return this;
        }

        /**
         * The page number. Default value: **1**.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The domain name bound to the cloud resource.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * The AccessKey ID used to access cloud resources.
         */
        public Builder secretId(String secretId) {
            this.putQueryParameter("SecretId", secretId);
            this.secretId = secretId;
            return this;
        }

        /**
         * The number of revoked certificates per page. Default value: **20**.
         */
        public Builder showSize(Integer showSize) {
            this.putQueryParameter("ShowSize", showSize);
            this.showSize = showSize;
            return this;
        }

        @Override
        public ListCloudResourcesRequest build() {
            return new ListCloudResourcesRequest(this);
        } 

    } 

}
