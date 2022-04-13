// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageBaselineCheckSummaryRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageBaselineCheckSummaryRequest</p>
 */
public class DescribeImageBaselineCheckSummaryRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("Criteria")
    private String criteria;

    @Query
    @NameInMap("CriteriaType")
    private String criteriaType;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RiskLevel")
    private String riskLevel;

    private DescribeImageBaselineCheckSummaryRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.criteria = builder.criteria;
        this.criteriaType = builder.criteriaType;
        this.currentPage = builder.currentPage;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.riskLevel = builder.riskLevel;
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

    public static final class Builder extends Request.Builder<DescribeImageBaselineCheckSummaryRequest, Builder> {
        private String clusterId; 
        private String criteria; 
        private String criteriaType; 
        private Integer currentPage; 
        private String lang; 
        private Integer pageSize; 
        private String riskLevel; 

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
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Criteria.
         */
        public Builder criteria(String criteria) {
            this.putQueryParameter("Criteria", criteria);
            this.criteria = criteria;
            return this;
        }

        /**
         * CriteriaType.
         */
        public Builder criteriaType(String criteriaType) {
            this.putQueryParameter("CriteriaType", criteriaType);
            this.criteriaType = criteriaType;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RiskLevel.
         */
        public Builder riskLevel(String riskLevel) {
            this.putQueryParameter("RiskLevel", riskLevel);
            this.riskLevel = riskLevel;
            return this;
        }

        @Override
        public DescribeImageBaselineCheckSummaryRequest build() {
            return new DescribeImageBaselineCheckSummaryRequest(this);
        } 

    } 

}
