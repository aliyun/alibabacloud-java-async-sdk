// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCategoryTemplateRuleListRequest} extends {@link RequestModel}
 *
 * <p>DescribeCategoryTemplateRuleListRequest</p>
 */
public class DescribeCategoryTemplateRuleListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeatureType")
    private Integer featureType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskLevelId")
    private Long riskLevelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    private DescribeCategoryTemplateRuleListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.featureType = builder.featureType;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.riskLevelId = builder.riskLevelId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCategoryTemplateRuleListRequest create() {
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
     * @return featureType
     */
    public Integer getFeatureType() {
        return this.featureType;
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
     * @return riskLevelId
     */
    public Long getRiskLevelId() {
        return this.riskLevelId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeCategoryTemplateRuleListRequest, Builder> {
        private Integer currentPage; 
        private Integer featureType; 
        private String lang; 
        private Integer pageSize; 
        private Long riskLevelId; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCategoryTemplateRuleListRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.featureType = request.featureType;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.riskLevelId = request.riskLevelId;
            this.status = request.status;
        } 

        /**
         * The number of the page to return. Default value: **1**.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * This parameter is deprecated.
         */
        public Builder featureType(Integer featureType) {
            this.putQueryParameter("FeatureType", featureType);
            this.featureType = featureType;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh_cn**. Valid values:
         * <p>
         * 
         * *   **zh_cn**: Simplified Chinese
         * *   **en_us**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **10**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The sensitivity level of the data that is not compliant with the rule. Valid values: **1** to **11**. Default value: **null**.
         * <p>
         * 
         * *   **1**: No sensitive data is detected.
         * *   **2**: specifies the S1 sensitivity level.
         * *   **3**: specifies the S2 sensitivity level.
         * *   **4**: specifies the S3 sensitivity level.
         * *   **5**: specifies the S4 sensitivity level.
         * *   **6**: specifies the S5 sensitivity level.
         * *   **7**: specifies the S6 sensitivity level.
         * *   **8**: specifies the S7 sensitivity level.
         * *   **9**: specifies the S8 sensitivity level.
         * *   **10**: specifies the S9 sensitivity level.
         * *   **11**: specifies the S10 sensitivity level.
         * *   **null**: specifies all preceding sensitivity levels.
         */
        public Builder riskLevelId(Long riskLevelId) {
            this.putQueryParameter("RiskLevelId", riskLevelId);
            this.riskLevelId = riskLevelId;
            return this;
        }

        /**
         * The status of the rule. Default value: **null**. Valid values:
         * <p>
         * 
         * *   **0**: disabled
         * *   **1**: enabled
         * *   **null**: all states
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeCategoryTemplateRuleListRequest build() {
            return new DescribeCategoryTemplateRuleListRequest(this);
        } 

    } 

}
