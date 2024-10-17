// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryPurchasedDomainsRequest} extends {@link RequestModel}
 *
 * <p>QueryPurchasedDomainsRequest</p>
 */
public class QueryPurchasedDomainsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndOperationTime")
    private String endOperationTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OpTimeOrder")
    private Boolean opTimeOrder;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OperationStatus")
    private Integer operationStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private Integer productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartOperationTime")
    private String startOperationTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpdateTimeOrder")
    private Boolean updateTimeOrder;

    private QueryPurchasedDomainsRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.domainName = builder.domainName;
        this.endOperationTime = builder.endOperationTime;
        this.opTimeOrder = builder.opTimeOrder;
        this.operationStatus = builder.operationStatus;
        this.pageSize = builder.pageSize;
        this.productType = builder.productType;
        this.startOperationTime = builder.startOperationTime;
        this.updateTimeOrder = builder.updateTimeOrder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPurchasedDomainsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return endOperationTime
     */
    public String getEndOperationTime() {
        return this.endOperationTime;
    }

    /**
     * @return opTimeOrder
     */
    public Boolean getOpTimeOrder() {
        return this.opTimeOrder;
    }

    /**
     * @return operationStatus
     */
    public Integer getOperationStatus() {
        return this.operationStatus;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productType
     */
    public Integer getProductType() {
        return this.productType;
    }

    /**
     * @return startOperationTime
     */
    public String getStartOperationTime() {
        return this.startOperationTime;
    }

    /**
     * @return updateTimeOrder
     */
    public Boolean getUpdateTimeOrder() {
        return this.updateTimeOrder;
    }

    public static final class Builder extends Request.Builder<QueryPurchasedDomainsRequest, Builder> {
        private Integer currentPage; 
        private String domainName; 
        private String endOperationTime; 
        private Boolean opTimeOrder; 
        private Integer operationStatus; 
        private Integer pageSize; 
        private Integer productType; 
        private String startOperationTime; 
        private Boolean updateTimeOrder; 

        private Builder() {
            super();
        } 

        private Builder(QueryPurchasedDomainsRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.domainName = request.domainName;
            this.endOperationTime = request.endOperationTime;
            this.opTimeOrder = request.opTimeOrder;
            this.operationStatus = request.operationStatus;
            this.pageSize = request.pageSize;
            this.productType = request.productType;
            this.startOperationTime = request.startOperationTime;
            this.updateTimeOrder = request.updateTimeOrder;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putBodyParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * EndOperationTime.
         */
        public Builder endOperationTime(String endOperationTime) {
            this.putBodyParameter("EndOperationTime", endOperationTime);
            this.endOperationTime = endOperationTime;
            return this;
        }

        /**
         * OpTimeOrder.
         */
        public Builder opTimeOrder(Boolean opTimeOrder) {
            this.putBodyParameter("OpTimeOrder", opTimeOrder);
            this.opTimeOrder = opTimeOrder;
            return this;
        }

        /**
         * OperationStatus.
         */
        public Builder operationStatus(Integer operationStatus) {
            this.putBodyParameter("OperationStatus", operationStatus);
            this.operationStatus = operationStatus;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProductType.
         */
        public Builder productType(Integer productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * StartOperationTime.
         */
        public Builder startOperationTime(String startOperationTime) {
            this.putBodyParameter("StartOperationTime", startOperationTime);
            this.startOperationTime = startOperationTime;
            return this;
        }

        /**
         * UpdateTimeOrder.
         */
        public Builder updateTimeOrder(Boolean updateTimeOrder) {
            this.putBodyParameter("UpdateTimeOrder", updateTimeOrder);
            this.updateTimeOrder = updateTimeOrder;
            return this;
        }

        @Override
        public QueryPurchasedDomainsRequest build() {
            return new QueryPurchasedDomainsRequest(this);
        } 

    } 

}
