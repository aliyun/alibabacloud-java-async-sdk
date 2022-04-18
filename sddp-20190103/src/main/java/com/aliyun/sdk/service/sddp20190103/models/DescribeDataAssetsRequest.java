// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataAssetsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataAssetsRequest</p>
 */
public class DescribeDataAssetsRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RangeId")
    private Integer rangeId;

    @Query
    @NameInMap("RiskLevels")
    private String riskLevels;

    @Query
    @NameInMap("RuleId")
    private Long ruleId;

    private DescribeDataAssetsRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.lang = builder.lang;
        this.name = builder.name;
        this.pageSize = builder.pageSize;
        this.rangeId = builder.rangeId;
        this.riskLevels = builder.riskLevels;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataAssetsRequest create() {
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return rangeId
     */
    public Integer getRangeId() {
        return this.rangeId;
    }

    /**
     * @return riskLevels
     */
    public String getRiskLevels() {
        return this.riskLevels;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<DescribeDataAssetsRequest, Builder> {
        private Integer currentPage; 
        private String lang; 
        private String name; 
        private Integer pageSize; 
        private Integer rangeId; 
        private String riskLevels; 
        private Long ruleId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDataAssetsRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.lang = request.lang;
            this.name = request.name;
            this.pageSize = request.pageSize;
            this.rangeId = request.rangeId;
            this.riskLevels = request.riskLevels;
            this.ruleId = request.ruleId;
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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * RangeId.
         */
        public Builder rangeId(Integer rangeId) {
            this.putQueryParameter("RangeId", rangeId);
            this.rangeId = rangeId;
            return this;
        }

        /**
         * RiskLevels.
         */
        public Builder riskLevels(String riskLevels) {
            this.putQueryParameter("RiskLevels", riskLevels);
            this.riskLevels = riskLevels;
            return this;
        }

        /**
         * RuleId.
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public DescribeDataAssetsRequest build() {
            return new DescribeDataAssetsRequest(this);
        } 

    } 

}
