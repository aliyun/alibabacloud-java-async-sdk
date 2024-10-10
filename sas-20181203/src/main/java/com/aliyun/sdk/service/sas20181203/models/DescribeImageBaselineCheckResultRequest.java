// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeImageBaselineCheckResultRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageBaselineCheckResultRequest</p>
 */
public class DescribeImageBaselineCheckResultRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ImageUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageUuid;

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

    private DescribeImageBaselineCheckResultRequest(Builder builder) {
        super(builder);
        this.criteria = builder.criteria;
        this.criteriaType = builder.criteriaType;
        this.currentPage = builder.currentPage;
        this.imageUuid = builder.imageUuid;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.riskLevel = builder.riskLevel;
        this.scanRange = builder.scanRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageBaselineCheckResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return imageUuid
     */
    public String getImageUuid() {
        return this.imageUuid;
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

    public static final class Builder extends Request.Builder<DescribeImageBaselineCheckResultRequest, Builder> {
        private String criteria; 
        private String criteriaType; 
        private Integer currentPage; 
        private String imageUuid; 
        private String lang; 
        private Integer pageSize; 
        private String riskLevel; 
        private java.util.List < String > scanRange; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageBaselineCheckResultRequest request) {
            super(request);
            this.criteria = request.criteria;
            this.criteriaType = request.criteriaType;
            this.currentPage = request.currentPage;
            this.imageUuid = request.imageUuid;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.riskLevel = request.riskLevel;
            this.scanRange = request.scanRange;
        } 

        /**
         * <p>The search condition for the image baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>ak_leak</p>
         */
        public Builder criteria(String criteria) {
            this.putQueryParameter("Criteria", criteria);
            this.criteria = criteria;
            return this;
        }

        /**
         * <p>The type of the search condition. Valid values:</p>
         * <ul>
         * <li><strong>BaselineNameAlias</strong>: baseline name</li>
         * <li><strong>BaselineClassAlias</strong>: baseline category</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BaselineNameAlias</p>
         */
        public Builder criteriaType(String criteriaType) {
            this.putQueryParameter("CriteriaType", criteriaType);
            this.criteriaType = criteriaType;
            return this;
        }

        /**
         * <p>The number of the page to return. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The UUID of the image.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a910053dd4710173ecc9e9d8931f****</p>
         */
        public Builder imageUuid(String imageUuid) {
            this.putQueryParameter("ImageUuid", imageUuid);
            this.imageUuid = imageUuid;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The severity of the image baseline that you want to query. Separate multiple severities with commas (,). By default, all valid values are used. Valid values:</p>
         * <ul>
         * <li><strong>high</strong></li>
         * <li><strong>medium</strong></li>
         * <li><strong>low</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high,medium,low</p>
         */
        public Builder riskLevel(String riskLevel) {
            this.putQueryParameter("RiskLevel", riskLevel);
            this.riskLevel = riskLevel;
            return this;
        }

        /**
         * <p>The types of the assets that you want to scan.</p>
         */
        public Builder scanRange(java.util.List < String > scanRange) {
            this.putQueryParameter("ScanRange", scanRange);
            this.scanRange = scanRange;
            return this;
        }

        @Override
        public DescribeImageBaselineCheckResultRequest build() {
            return new DescribeImageBaselineCheckResultRequest(this);
        } 

    } 

}
