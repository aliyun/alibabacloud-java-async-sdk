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
         * The number of the page to return.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
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
         * The keyword that is used to search for data assets. Fuzzy search is supported.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * The type of the data asset that you want to query. Valid values:
         * <p>
         * 
         * *   **1**: MaxCompute project
         * *   **2**: MaxCompute table
         * *   **3**: MaxCompute package
         * *   **11**: AnalyticDB for MySQL database
         * *   **12**: AnalyticDB for MySQL table
         * *   **21**: Object Storage Service (OSS) bucket
         * *   **22**: OSS object
         * *   **31**: Tablestore instance
         * *   **32**: Tablestore table
         * *   **51**: ApsaraDB RDS database
         * *   **52**: ApsaraDB RDS table
         * *   **61**: self-managed database hosted on an Elastic Compute Service (ECS) instance
         * *   **62**: self-managed table hosted on an ECS instance
         * *   **71**: PolarDB-X database
         * *   **72**: PolarDB-X table
         * *   **81**: PolarDB database
         * *   **82**: PolarDB table
         * *   **91**: AnalyticDB for PostgreSQL database
         * *   **92**: AnalyticDB for PostgreSQL table
         */
        public Builder rangeId(Integer rangeId) {
            this.putQueryParameter("RangeId", rangeId);
            this.rangeId = rangeId;
            return this;
        }

        /**
         * The sensitivity level of the data asset. Separate multiple sensitivity levels with commas (,). Valid values:
         * <p>
         * 
         * *   **2**: S1, indicating the low sensitivity level
         * *   **3**: S2, indicating the medium sensitivity level
         * *   **4**: S3, indicating the high sensitivity level
         * *   **5**: S4, indicating the highest sensitivity level
         */
        public Builder riskLevels(String riskLevels) {
            this.putQueryParameter("RiskLevels", riskLevels);
            this.riskLevels = riskLevels;
            return this;
        }

        /**
         * The unique ID of the sensitive data detection rule that the data assets to be queried hit.
         * <p>
         * 
         * > If you query sensitive data detection results based on the sensitive data detection rule that the data assets hit, you can call the [DescribeRules](~~DescribeRules~~) operation to query the ID of the sensitive data detection rule.
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
