// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserCertificateOrderRequest} extends {@link RequestModel}
 *
 * <p>ListUserCertificateOrderRequest</p>
 */
public class ListUserCertificateOrderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Long showSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListUserCertificateOrderRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.keyword = builder.keyword;
        this.orderType = builder.orderType;
        this.resourceGroupId = builder.resourceGroupId;
        this.showSize = builder.showSize;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserCertificateOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return showSize
     */
    public Long getShowSize() {
        return this.showSize;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListUserCertificateOrderRequest, Builder> {
        private Long currentPage; 
        private String keyword; 
        private String orderType; 
        private String resourceGroupId; 
        private Long showSize; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListUserCertificateOrderRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.keyword = request.keyword;
            this.orderType = request.orderType;
            this.resourceGroupId = request.resourceGroupId;
            this.showSize = request.showSize;
            this.status = request.status;
        } 

        /**
         * The number of the page to return.
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The domain names that are bound or the ID of the order. Fuzzy match is supported.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * The type of the order. Valid values:
         * <p>
         * 
         * *   **CPACK**: virtual resource order. If you set OrderType to CPACK, only the information about orders that are generated to consume the certificate quota is returned.
         * *   **BUY**: purchase order. If you set OrderType to BUY, only the information about purchase orders is returned. In most cases, this type of order can be ignored.
         * *   **UPLOAD**: uploaded certificate. If you set OrderType to UPLOAD, only uploaded certificates are returned.
         * *   **CERT**: certificate. If you set OrderType to CERT, both issued certificates and uploaded certificates are returned.
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 50.
         */
        public Builder showSize(Long showSize) {
            this.putQueryParameter("ShowSize", showSize);
            this.showSize = showSize;
            return this;
        }

        /**
         * The certificate status of the order. Valid values:
         * <p>
         * 
         * *   **PAYED**: pending application. You can set Status to PAYED only if you set OrderType to CPACK or BUY.
         * *   **CHECKING**: reviewing. You can set Status to CHECKING only if you set OrderType to CPACK or BUY.
         * *   **CHECKED_FAIL**: review failed. You can set Status to CHECKED_FAIL only if you set OrderType to CPACK or BUY.
         * *   **ISSUED**: issued.
         * *   **WILLEXPIRED**: about to expire.
         * *   **EXPIRED**: expired.
         * *   **NOTACTIVATED**: not activated. You can set Status to NOTACTIVATED only if you set OrderType to CPACK or BUY.
         * *   **REVOKED**: revoked. You can set Status to REVOKED only if you set OrderType to CPACK or BUY.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListUserCertificateOrderRequest build() {
            return new ListUserCertificateOrderRequest(this);
        } 

    } 

}
