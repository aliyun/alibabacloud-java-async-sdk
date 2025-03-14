// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeImageBuildRiskListRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageBuildRiskListRequest</p>
 */
public class DescribeImageBuildRiskListRequest extends Request {
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

    private DescribeImageBuildRiskListRequest(Builder builder) {
        super(builder);
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

    public static DescribeImageBuildRiskListRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeImageBuildRiskListRequest, Builder> {
        private String criteria; 
        private String criteriaType; 
        private Integer currentPage; 
        private String lang; 
        private Integer pageSize; 
        private String riskLevel; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageBuildRiskListRequest request) {
            super(request);
            this.criteria = request.criteria;
            this.criteriaType = request.criteriaType;
            this.currentPage = request.currentPage;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.riskLevel = request.riskLevel;
        } 

        /**
         * <p>The <strong>rule name</strong> or <strong>type name</strong> of the risk. You can call the <a href="~~~~">DescribeImageBuildRiskList</a> operation to obtain the name. Optional parameters:</p>
         * <ul>
         * <li>If <strong>CriteriaType</strong> is set to <strong>RiskKeyName</strong>, you must specify a <strong>rule name</strong> for this parameter.</li>
         * <li>If <strong>CriteriaType</strong> is set to<strong>RiskClassName</strong>, you must specify a <strong>type name</strong> for this parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>no_user</p>
         */
        public Builder criteria(String criteria) {
            this.putQueryParameter("Criteria", criteria);
            this.criteria = criteria;
            return this;
        }

        /**
         * <p>The query type.of the risk. Valid values:</p>
         * <ul>
         * <li><strong>RiskKeyName</strong>: the rule name of the risk</li>
         * <li><strong>RiskClassName</strong>: the type name of the risk</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RiskKeyName</p>
         */
        public Builder criteriaType(String criteriaType) {
            this.putQueryParameter("CriteriaType", criteriaType);
            this.criteriaType = criteriaType;
            return this;
        }

        /**
         * <p>The page number. Default value: <strong>1</strong>.</p>
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
         * <p>The number of entries per page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
         * <blockquote>
         * <p> We recommend that you do not leave this parameter empty.</p>
         * </blockquote>
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
         * <p>The risk level. Valid values:</p>
         * <ul>
         * <li><strong>high</strong></li>
         * <li><strong>medium</strong></li>
         * <li><strong>low</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        public Builder riskLevel(String riskLevel) {
            this.putQueryParameter("RiskLevel", riskLevel);
            this.riskLevel = riskLevel;
            return this;
        }

        @Override
        public DescribeImageBuildRiskListRequest build() {
            return new DescribeImageBuildRiskListRequest(this);
        } 

    } 

}
