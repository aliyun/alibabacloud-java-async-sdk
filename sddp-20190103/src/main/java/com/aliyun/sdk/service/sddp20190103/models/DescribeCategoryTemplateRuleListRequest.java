// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
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
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder featureType(Integer featureType) {
            this.putQueryParameter("FeatureType", featureType);
            this.featureType = featureType;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh_cn</strong>: Simplified Chinese</li>
         * <li><strong>en_us</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh_cn</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The sensitivity level of the data that is not compliant with the rule. Valid values: <strong>1</strong> to <strong>11</strong>. Default value: <strong>null</strong>.</p>
         * <ul>
         * <li><strong>1</strong>: No sensitive data is detected.</li>
         * <li><strong>2</strong>: specifies the S1 sensitivity level.</li>
         * <li><strong>3</strong>: specifies the S2 sensitivity level.</li>
         * <li><strong>4</strong>: specifies the S3 sensitivity level.</li>
         * <li><strong>5</strong>: specifies the S4 sensitivity level.</li>
         * <li><strong>6</strong>: specifies the S5 sensitivity level.</li>
         * <li><strong>7</strong>: specifies the S6 sensitivity level.</li>
         * <li><strong>8</strong>: specifies the S7 sensitivity level.</li>
         * <li><strong>9</strong>: specifies the S8 sensitivity level.</li>
         * <li><strong>10</strong>: specifies the S9 sensitivity level.</li>
         * <li><strong>11</strong>: specifies the S10 sensitivity level.</li>
         * <li><strong>null</strong>: specifies all preceding sensitivity levels.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder riskLevelId(Long riskLevelId) {
            this.putQueryParameter("RiskLevelId", riskLevelId);
            this.riskLevelId = riskLevelId;
            return this;
        }

        /**
         * <p>The status of the rule. Default value: <strong>null</strong>. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled</li>
         * <li><strong>1</strong>: enabled</li>
         * <li><strong>null</strong>: all states</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
