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
         * <p>The page number of the current page in a paginated query.</p>
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
         * <p>The keyword for fuzzy search. Matches the domain name or the corresponding resource ID.</p>
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
         * <p>The resource type. Default value: <strong>CPACK</strong>. Valid values:</p>
         * <ul>
         * <li><strong>CPACK</strong>: resource virtual order. Only orders generated from quotas are returned.</li>
         * <li><strong>BUY</strong>: purchase order. Only orders generated from purchases are returned. You can ignore this type in most cases.</li>
         * <li><strong>UPLOAD</strong>: uploaded certificate. Only uploaded certificates are returned.</li>
         * <li><strong>CERT</strong>: certificate. Both issued certificates and uploaded certificates are returned.</li>
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
         * <p>The resource group ID. You can obtain this ID by calling the <a href="https://help.aliyun.com/document_detail/2716559.html">ListResources</a> operation.</p>
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
         * <p>The number of entries per page in a paginated query. Default value: 50.</p>
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
         * <p>The order status. Valid values:</p>
         * <ul>
         * <li><strong>PAYED</strong>: Pending application. Valid when OrderType is set to CPACK or BUY.</li>
         * <li><strong>CHECKING</strong>: Under review. Valid when OrderType is set to CPACK or BUY.</li>
         * <li><strong>CHECKED_FAIL</strong>: Review failed. Valid when OrderType is set to CPACK or BUY.</li>
         * <li><strong>ISSUED</strong>: Issued.</li>
         * <li><strong>WILLEXPIRED</strong>: About to expire.</li>
         * <li><strong>EXPIRED</strong>: Expired.</li>
         * <li><strong>NOTACTIVATED</strong>: Not activated. Valid when OrderType is set to CPACK or BUY.</li>
         * <li><strong>REVOKED</strong>: Revoked. Valid when OrderType is set to CPACK or BUY.</li>
         * </ul>
         * <p>If OrderType is set to CERT or UPLOAD and Status is empty, valid certificates are returned by default, including issued and about-to-expire certificates. If OrderType is set to CPACK or BUY and Status is empty, all orders are returned by default.</p>
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
