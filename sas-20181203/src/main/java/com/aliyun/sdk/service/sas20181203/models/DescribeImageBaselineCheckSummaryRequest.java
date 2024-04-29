// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageBaselineCheckSummaryRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageBaselineCheckSummaryRequest</p>
 */
public class DescribeImageBaselineCheckSummaryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Criteria")
    private String criteria;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CriteriaType")
    private String criteriaType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskLevel")
    private String riskLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanRange")
    private java.util.List < String > scanRange;

    private DescribeImageBaselineCheckSummaryRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.criteria = builder.criteria;
        this.criteriaType = builder.criteriaType;
        this.currentPage = builder.currentPage;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.riskLevel = builder.riskLevel;
        this.scanRange = builder.scanRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageBaselineCheckSummaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return criteria
     */
    public String getCriteria() {
        return this.criteria;
    }

    /**
     * @return criteriaType
     */
    public String getCriteriaType() {
        return this.criteriaType;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return riskLevel
     */
    public String getRiskLevel() {
        return this.riskLevel;
    }

    /**
     * @return scanRange
     */
    public java.util.List < String > getScanRange() {
        return this.scanRange;
    }

    public static final class Builder extends Request.Builder<DescribeImageBaselineCheckSummaryRequest, Builder> {
        private String clusterId; 
        private String criteria; 
        private String criteriaType; 
        private Integer currentPage; 
        private String lang; 
        private Integer pageSize; 
        private String riskLevel; 
        private java.util.List < String > scanRange; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageBaselineCheckSummaryRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.criteria = request.criteria;
            this.criteriaType = request.criteriaType;
            this.currentPage = request.currentPage;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.riskLevel = request.riskLevel;
            this.scanRange = request.scanRange;
        } 

        /**
         * The ID of the specified container cluster.
         * <p>
         * 
         * > You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the ID of the container cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The search condition for the image baseline.
         */
        public Builder criteria(String criteria) {
            this.putQueryParameter("Criteria", criteria);
            this.criteria = criteria;
            return this;
        }

        /**
         * The type of the search condition. Valid values:
         * <p>
         * 
         * *   **BaselineNameAlias**: baseline name
         * *   **BaselineClassAlias**: baseline category
         */
        public Builder criteriaType(String criteriaType) {
            this.putQueryParameter("CriteriaType", criteriaType);
            this.criteriaType = criteriaType;
            return this;
        }

        /**
         * The number of the page to return. Pages start from page **1**. Default value: **1**.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **20**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The severity of the image baseline that you want to query. Separate multiple severities with commas (,). Valid values:
         * <p>
         * 
         * *   **high**
         * *   **medium**
         * *   **low**
         */
        public Builder riskLevel(String riskLevel) {
            this.putQueryParameter("RiskLevel", riskLevel);
            this.riskLevel = riskLevel;
            return this;
        }

        /**
         * The types of the assets that you want to scan.
         */
        public Builder scanRange(java.util.List < String > scanRange) {
            this.putQueryParameter("ScanRange", scanRange);
            this.scanRange = scanRange;
            return this;
        }

        @Override
        public DescribeImageBaselineCheckSummaryRequest build() {
            return new DescribeImageBaselineCheckSummaryRequest(this);
        } 

    } 

}
