// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The domain name that is bound or the ID of the resource. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>cert-instanceId</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The type of the order. Default value: <strong>CPACK</strong>. Valid values:</p>
         * <ul>
         * <li><strong>CPACK</strong>: virtual resource order. If you set OrderType to CPACK, only the information about orders that are generated to consume the certificate quota is returned.</li>
         * <li><strong>BUY</strong>: purchase order. If you set OrderType to BUY, only the information about purchase orders is returned. In most cases, this type of order can be ignored.</li>
         * <li><strong>UPLOAD</strong>: uploaded certificate. If you set OrderType to UPLOAD, only uploaded certificates are returned.</li>
         * <li><strong>CERT</strong>: certificate. If you set OrderType to CERT, both issued certificates and uploaded certificates are returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CPACK</p>
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * <p>The ID of the resource group. You can call the <a href="https://help.aliyun.com/document_detail/2716559.html">ListResources</a> operation to obtain the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-ae******4wia</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder showSize(Long showSize) {
            this.putQueryParameter("ShowSize", showSize);
            this.showSize = showSize;
            return this;
        }

        /**
         * <p>The certificate status of the order. Valid values:</p>
         * <ul>
         * <li><strong>PAYED</strong>: pending application. You can set Status to PAYED only if you set OrderType to CPACK or BUY.</li>
         * <li><strong>CHECKING</strong>: validating. You can set Status to CHECKING only if you set OrderType to CPACK or BUY.</li>
         * <li><strong>CHECKED_FAIL</strong>: validation failed. You can set Status to CHECKED_FAIL only if you set OrderType to CPACK or BUY.</li>
         * <li><strong>ISSUED</strong>: issued.</li>
         * <li><strong>WILLEXPIRED</strong>: about to expire.</li>
         * <li><strong>EXPIRED</strong>: expired.</li>
         * <li><strong>NOTACTIVATED</strong>: not activated. You can set Status to NOTACTIVATED only if you set OrderType to CPACK or BUY.</li>
         * <li><strong>REVOKED</strong>: revoked. You can set Status to REVOKED only if you set OrderType to CPACK or BUY.</li>
         * </ul>
         * <p>If you set OrderType to CERT or UPLOAD and Status is left empty, valid certificates are returned by default, including issued certificates and certificates that are about to expire. If you set OrderType to CPACK or BUY and Status is left empty, all orders are returned by default.</p>
         * 
         * <strong>example:</strong>
         * <p>ISSUED</p>
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
