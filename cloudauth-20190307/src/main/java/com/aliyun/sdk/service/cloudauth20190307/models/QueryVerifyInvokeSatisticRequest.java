// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link QueryVerifyInvokeSatisticRequest} extends {@link RequestModel}
 *
 * <p>QueryVerifyInvokeSatisticRequest</p>
 */
public class QueryVerifyInvokeSatisticRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private Long endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductProgramList")
    private String productProgramList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneIdList")
    private String sceneIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private Long startDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatisticsType")
    private String statisticsType;

    private QueryVerifyInvokeSatisticRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.endDate = builder.endDate;
        this.pageSize = builder.pageSize;
        this.productProgramList = builder.productProgramList;
        this.productType = builder.productType;
        this.sceneIdList = builder.sceneIdList;
        this.startDate = builder.startDate;
        this.statisticsType = builder.statisticsType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryVerifyInvokeSatisticRequest create() {
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
     * @return endDate
     */
    public Long getEndDate() {
        return this.endDate;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productProgramList
     */
    public String getProductProgramList() {
        return this.productProgramList;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return sceneIdList
     */
    public String getSceneIdList() {
        return this.sceneIdList;
    }

    /**
     * @return startDate
     */
    public Long getStartDate() {
        return this.startDate;
    }

    /**
     * @return statisticsType
     */
    public String getStatisticsType() {
        return this.statisticsType;
    }

    public static final class Builder extends Request.Builder<QueryVerifyInvokeSatisticRequest, Builder> {
        private Long currentPage; 
        private Long endDate; 
        private Long pageSize; 
        private String productProgramList; 
        private String productType; 
        private String sceneIdList; 
        private Long startDate; 
        private String statisticsType; 

        private Builder() {
            super();
        } 

        private Builder(QueryVerifyInvokeSatisticRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.endDate = request.endDate;
            this.pageSize = request.pageSize;
            this.productProgramList = request.productProgramList;
            this.productType = request.productType;
            this.sceneIdList = request.sceneIdList;
            this.startDate = request.startDate;
            this.statisticsType = request.statisticsType;
        } 

        /**
         * <p>Current page number.</p>
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
         * <p>End date of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>1761926399999</p>
         */
        public Builder endDate(Long endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>Number of items per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>List of product codes to query. Please refer to the productCode under the corresponding ProductType.</p>
         * 
         * <strong>example:</strong>
         * <p>ID_PRO</p>
         */
        public Builder productProgramList(String productProgramList) {
            this.putQueryParameter("ProductProgramList", productProgramList);
            this.productProgramList = productProgramList;
            return this;
        }

        /**
         * <p>Product type:</p>
         * <ul>
         * <li><strong>FINANCE_VERIFY</strong>: Financial-grade real-person verification</li>
         * <li><strong>SMART_VERIFY</strong>: Enhanced real-person verification (discontinued)</li>
         * <li><strong>FACE_VERIFY</strong>: Real-person verification (discontinued)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FINANCE_VERIFY</p>
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>List of application scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder sceneIdList(String sceneIdList) {
            this.putQueryParameter("SceneIdList", sceneIdList);
            this.sceneIdList = sceneIdList;
            return this;
        }

        /**
         * <p>Start date of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>1743436800000</p>
         */
        public Builder startDate(Long startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * <p>Statistics dimension:</p>
         * <ul>
         * <li><strong>day</strong>: daily</li>
         * <li><strong>month</strong>: monthly</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        public Builder statisticsType(String statisticsType) {
            this.putQueryParameter("StatisticsType", statisticsType);
            this.statisticsType = statisticsType;
            return this;
        }

        @Override
        public QueryVerifyInvokeSatisticRequest build() {
            return new QueryVerifyInvokeSatisticRequest(this);
        } 

    } 

}
