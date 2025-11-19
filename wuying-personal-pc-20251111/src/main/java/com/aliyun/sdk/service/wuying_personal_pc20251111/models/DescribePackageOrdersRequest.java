// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wuying_personal_pc20251111.models;

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
 * {@link DescribePackageOrdersRequest} extends {@link RequestModel}
 *
 * <p>DescribePackageOrdersRequest</p>
 */
public class DescribePackageOrdersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopIdList")
    private java.util.List<String> desktopIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderIdList")
    private java.util.List<String> orderIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderStatusList")
    private java.util.List<String> orderStatusList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 10)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductTypeList")
    private java.util.List<String> productTypeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceIdList")
    private java.util.List<String> resourceIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    private DescribePackageOrdersRequest(Builder builder) {
        super(builder);
        this.apiKey = builder.apiKey;
        this.currentPage = builder.currentPage;
        this.desktopIdList = builder.desktopIdList;
        this.orderIdList = builder.orderIdList;
        this.orderStatusList = builder.orderStatusList;
        this.pageSize = builder.pageSize;
        this.productTypeList = builder.productTypeList;
        this.resourceIdList = builder.resourceIdList;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePackageOrdersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return desktopIdList
     */
    public java.util.List<String> getDesktopIdList() {
        return this.desktopIdList;
    }

    /**
     * @return orderIdList
     */
    public java.util.List<String> getOrderIdList() {
        return this.orderIdList;
    }

    /**
     * @return orderStatusList
     */
    public java.util.List<String> getOrderStatusList() {
        return this.orderStatusList;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productTypeList
     */
    public java.util.List<String> getProductTypeList() {
        return this.productTypeList;
    }

    /**
     * @return resourceIdList
     */
    public java.util.List<String> getResourceIdList() {
        return this.resourceIdList;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<DescribePackageOrdersRequest, Builder> {
        private String apiKey; 
        private Long currentPage; 
        private java.util.List<String> desktopIdList; 
        private java.util.List<String> orderIdList; 
        private java.util.List<String> orderStatusList; 
        private Long pageSize; 
        private java.util.List<String> productTypeList; 
        private java.util.List<String> resourceIdList; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePackageOrdersRequest request) {
            super(request);
            this.apiKey = request.apiKey;
            this.currentPage = request.currentPage;
            this.desktopIdList = request.desktopIdList;
            this.orderIdList = request.orderIdList;
            this.orderStatusList = request.orderStatusList;
            this.pageSize = request.pageSize;
            this.productTypeList = request.productTypeList;
            this.resourceIdList = request.resourceIdList;
            this.sessionId = request.sessionId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder apiKey(String apiKey) {
            this.putQueryParameter("ApiKey", apiKey);
            this.apiKey = apiKey;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * DesktopIdList.
         */
        public Builder desktopIdList(java.util.List<String> desktopIdList) {
            String desktopIdListShrink = shrink(desktopIdList, "DesktopIdList", "json");
            this.putQueryParameter("DesktopIdList", desktopIdListShrink);
            this.desktopIdList = desktopIdList;
            return this;
        }

        /**
         * OrderIdList.
         */
        public Builder orderIdList(java.util.List<String> orderIdList) {
            String orderIdListShrink = shrink(orderIdList, "OrderIdList", "json");
            this.putQueryParameter("OrderIdList", orderIdListShrink);
            this.orderIdList = orderIdList;
            return this;
        }

        /**
         * OrderStatusList.
         */
        public Builder orderStatusList(java.util.List<String> orderStatusList) {
            String orderStatusListShrink = shrink(orderStatusList, "OrderStatusList", "json");
            this.putQueryParameter("OrderStatusList", orderStatusListShrink);
            this.orderStatusList = orderStatusList;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProductTypeList.
         */
        public Builder productTypeList(java.util.List<String> productTypeList) {
            String productTypeListShrink = shrink(productTypeList, "ProductTypeList", "json");
            this.putQueryParameter("ProductTypeList", productTypeListShrink);
            this.productTypeList = productTypeList;
            return this;
        }

        /**
         * ResourceIdList.
         */
        public Builder resourceIdList(java.util.List<String> resourceIdList) {
            String resourceIdListShrink = shrink(resourceIdList, "ResourceIdList", "json");
            this.putQueryParameter("ResourceIdList", resourceIdListShrink);
            this.resourceIdList = resourceIdList;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public DescribePackageOrdersRequest build() {
            return new DescribePackageOrdersRequest(this);
        } 

    } 

}
