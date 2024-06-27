// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeColumnsV2Request} extends {@link RequestModel}
 *
 * <p>DescribeColumnsV2Request</p>
 */
public class DescribeColumnsV2Request extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private Long instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

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
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskLevelId")
    private Long riskLevelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    private Long ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SensLevelName")
    private String sensLevelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableId")
    private String tableId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    private DescribeColumnsV2Request(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.lang = builder.lang;
        this.name = builder.name;
        this.pageSize = builder.pageSize;
        this.productCode = builder.productCode;
        this.riskLevelId = builder.riskLevelId;
        this.ruleId = builder.ruleId;
        this.ruleName = builder.ruleName;
        this.sensLevelName = builder.sensLevelName;
        this.tableId = builder.tableId;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeColumnsV2Request create() {
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
     * @return instanceId
     */
    public Long getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
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
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return riskLevelId
     */
    public Long getRiskLevelId() {
        return this.riskLevelId;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return sensLevelName
     */
    public String getSensLevelName() {
        return this.sensLevelName;
    }

    /**
     * @return tableId
     */
    public String getTableId() {
        return this.tableId;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder extends Request.Builder<DescribeColumnsV2Request, Builder> {
        private Integer currentPage; 
        private Long instanceId; 
        private String instanceName; 
        private String lang; 
        private String name; 
        private Integer pageSize; 
        private String productCode; 
        private Long riskLevelId; 
        private Long ruleId; 
        private String ruleName; 
        private String sensLevelName; 
        private String tableId; 
        private String tableName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeColumnsV2Request request) {
            super(request);
            this.currentPage = request.currentPage;
            this.instanceId = request.instanceId;
            this.instanceName = request.instanceName;
            this.lang = request.lang;
            this.name = request.name;
            this.pageSize = request.pageSize;
            this.productCode = request.productCode;
            this.riskLevelId = request.riskLevelId;
            this.ruleId = request.ruleId;
            this.ruleName = request.ruleName;
            this.sensLevelName = request.sensLevelName;
            this.tableId = request.tableId;
            this.tableName = request.tableName;
        } 

        /**
         * The page number. Default value: **1**.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The ID of the instance to which data in the column of the table belongs.
         * <p>
         * 
         * >  You can call the [DescribeInstances](~~141708~~) operation to obtain the ID of the instance to which the data in the column of the table belongs.
         */
        public Builder instanceId(Long instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the instance to which data in the column of the table belongs.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh_cn**. Valid values:
         * <p>
         * 
         * *   **zh_cn**: simplified Chinese
         * *   **en_us**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The search keyword. Fuzzy match is supported.
         * <p>
         * 
         * For example, if you enter **test**, all columns whose names contain **test** are retrieved.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The number of entries per page. Default value: **10**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The name of the service to which data in the column of the table belongs. Valid values include **MaxCompute, OSS, ADS, OTS, and RDS**.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * The ID of the sensitivity level of the data that hits the sensitive data detection rule. Valid values:
         * <p>
         * 
         * *   **1**: N/A
         * *   **2**: S1
         * *   **3**: S2
         * *   **4**: S3
         * *   **5**: S4
         */
        public Builder riskLevelId(Long riskLevelId) {
            this.putQueryParameter("RiskLevelId", riskLevelId);
            this.riskLevelId = riskLevelId;
            return this;
        }

        /**
         * The ID of the sensitive data detection rule that data in the column of the table hits.
         * <p>
         * 
         * >  You can call the [DescribeRules](~~141389~~) operation to obtain the ID of the sensitive data detection rule.
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * The name of the sensitive data detection rule that data in the column of the table hits.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * The name of the sensitivity level. Valid values:
         * <p>
         * 
         * *   **N/A**: indicates that no sensitive data is detected.
         * *   **S1**: indicates the low sensitivity level.
         * *   **S2**: indicates the medium sensitivity level.
         * *   **S3**: indicates the high sensitivity level.
         * *   **S4**: indicates the highest sensitivity level.
         */
        public Builder sensLevelName(String sensLevelName) {
            this.putQueryParameter("SensLevelName", sensLevelName);
            this.sensLevelName = sensLevelName;
            return this;
        }

        /**
         * The ID of the table to which the column belongs.
         * <p>
         * 
         * >  You can call the [DescribeTables](~~141709~~) operation to obtain the ID of the table.
         */
        public Builder tableId(String tableId) {
            this.putQueryParameter("TableId", tableId);
            this.tableId = tableId;
            return this;
        }

        /**
         * The name of the table.
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        @Override
        public DescribeColumnsV2Request build() {
            return new DescribeColumnsV2Request(this);
        } 

    } 

}
