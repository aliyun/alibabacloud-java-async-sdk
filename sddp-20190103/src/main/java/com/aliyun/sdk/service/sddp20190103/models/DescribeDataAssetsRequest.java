// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDataAssetsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataAssetsRequest</p>
 */
public class DescribeDataAssetsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RangeId")
    private Integer rangeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskLevels")
    private String riskLevels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
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
         * <p>The number of the page to return.</p>
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
         * <p>The keyword that is used to search for data assets. Fuzzy search is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * <p>The type of the data asset that you want to query. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: MaxCompute project</li>
         * <li><strong>2</strong>: MaxCompute table</li>
         * <li><strong>3</strong>: MaxCompute package</li>
         * <li><strong>11</strong>: AnalyticDB for MySQL database</li>
         * <li><strong>12</strong>: AnalyticDB for MySQL table</li>
         * <li><strong>21</strong>: Object Storage Service (OSS) bucket</li>
         * <li><strong>22</strong>: OSS object</li>
         * <li><strong>31</strong>: Tablestore instance</li>
         * <li><strong>32</strong>: Tablestore table</li>
         * <li><strong>51</strong>: ApsaraDB RDS database</li>
         * <li><strong>52</strong>: ApsaraDB RDS table</li>
         * <li><strong>61</strong>: self-managed database hosted on an Elastic Compute Service (ECS) instance</li>
         * <li><strong>62</strong>: self-managed table hosted on an ECS instance</li>
         * <li><strong>71</strong>: PolarDB-X database</li>
         * <li><strong>72</strong>: PolarDB-X table</li>
         * <li><strong>81</strong>: PolarDB database</li>
         * <li><strong>82</strong>: PolarDB table</li>
         * <li><strong>91</strong>: AnalyticDB for PostgreSQL database</li>
         * <li><strong>92</strong>: AnalyticDB for PostgreSQL table</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder rangeId(Integer rangeId) {
            this.putQueryParameter("RangeId", rangeId);
            this.rangeId = rangeId;
            return this;
        }

        /**
         * <p>The sensitivity level of the data asset. Separate multiple sensitivity levels with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>2</strong>: S1, indicating the low sensitivity level</li>
         * <li><strong>3</strong>: S2, indicating the medium sensitivity level</li>
         * <li><strong>4</strong>: S3, indicating the high sensitivity level</li>
         * <li><strong>5</strong>: S4, indicating the highest sensitivity level</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder riskLevels(String riskLevels) {
            this.putQueryParameter("RiskLevels", riskLevels);
            this.riskLevels = riskLevels;
            return this;
        }

        /**
         * <p>The unique ID of the sensitive data detection rule that the data assets to be queried hit.</p>
         * <blockquote>
         * <p>If you query sensitive data detection results based on the sensitive data detection rule that the data assets hit, you can call the <a href="~~DescribeRules~~">DescribeRules</a> operation to query the ID of the sensitive data detection rule.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>11122200</p>
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
