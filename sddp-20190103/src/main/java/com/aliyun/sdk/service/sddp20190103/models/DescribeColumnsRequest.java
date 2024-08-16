// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeColumnsRequest} extends {@link RequestModel}
 *
 * <p>DescribeColumnsRequest</p>
 */
public class DescribeColumnsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineType")
    private String engineType;

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
    @com.aliyun.core.annotation.NameInMap("ModelTagId")
    private String modelTagId;

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
    @com.aliyun.core.annotation.NameInMap("ProductId")
    private String productId;

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
    private Long tableId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateRuleId")
    private String templateRuleId;

    private DescribeColumnsRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.engineType = builder.engineType;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.lang = builder.lang;
        this.modelTagId = builder.modelTagId;
        this.name = builder.name;
        this.pageSize = builder.pageSize;
        this.productCode = builder.productCode;
        this.productId = builder.productId;
        this.riskLevelId = builder.riskLevelId;
        this.ruleId = builder.ruleId;
        this.ruleName = builder.ruleName;
        this.sensLevelName = builder.sensLevelName;
        this.tableId = builder.tableId;
        this.tableName = builder.tableName;
        this.templateId = builder.templateId;
        this.templateRuleId = builder.templateRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeColumnsRequest create() {
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
     * @return engineType
     */
    public String getEngineType() {
        return this.engineType;
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
     * @return modelTagId
     */
    public String getModelTagId() {
        return this.modelTagId;
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
     * @return productId
     */
    public String getProductId() {
        return this.productId;
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
    public Long getTableId() {
        return this.tableId;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateRuleId
     */
    public String getTemplateRuleId() {
        return this.templateRuleId;
    }

    public static final class Builder extends Request.Builder<DescribeColumnsRequest, Builder> {
        private Integer currentPage; 
        private String engineType; 
        private Long instanceId; 
        private String instanceName; 
        private String lang; 
        private String modelTagId; 
        private String name; 
        private Integer pageSize; 
        private String productCode; 
        private String productId; 
        private Long riskLevelId; 
        private Long ruleId; 
        private String ruleName; 
        private String sensLevelName; 
        private Long tableId; 
        private String tableName; 
        private String templateId; 
        private String templateRuleId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeColumnsRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.engineType = request.engineType;
            this.instanceId = request.instanceId;
            this.instanceName = request.instanceName;
            this.lang = request.lang;
            this.modelTagId = request.modelTagId;
            this.name = request.name;
            this.pageSize = request.pageSize;
            this.productCode = request.productCode;
            this.productId = request.productId;
            this.riskLevelId = request.riskLevelId;
            this.ruleId = request.ruleId;
            this.ruleName = request.ruleName;
            this.sensLevelName = request.sensLevelName;
            this.tableId = request.tableId;
            this.tableName = request.tableName;
            this.templateId = request.templateId;
            this.templateRuleId = request.templateRuleId;
        } 

        /**
         * The page number of the page to return.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * EngineType.
         */
        public Builder engineType(String engineType) {
            this.putQueryParameter("EngineType", engineType);
            this.engineType = engineType;
            return this;
        }

        /**
         * The ID of the instance to which data in the column of the table belongs.
         * <p>
         * 
         * > You can call the [DescribeInstances](~~DescribeRules~~) operation to query the IDs of instances.
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
         * *   **zh_cn**: Chinese
         * *   **en_us**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * ModelTagId.
         */
        public Builder modelTagId(String modelTagId) {
            this.putQueryParameter("ModelTagId", modelTagId);
            this.modelTagId = modelTagId;
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
         * The number of entries to return on each page.
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
         * ProductId.
         */
        public Builder productId(String productId) {
            this.putQueryParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * The sensitivity level of the sensitive data that hits the sensitive data detection rule. Valid values:
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
         * > You can call the [DescribeRules](~~DescribeRules~~) operation to query the IDs of sensitive data detection rules.
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
         * The name of the sensitivity level of the data that hits the sensitive data detection rule. Valid values:
         * <p>
         * 
         * *   **N/A**: No sensitive data is detected.
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
         * > You can call the [DescribeTables](~~DescribeTables~~) operation to query the IDs of tables.
         */
        public Builder tableId(Long tableId) {
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

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * TemplateRuleId.
         */
        public Builder templateRuleId(String templateRuleId) {
            this.putQueryParameter("TemplateRuleId", templateRuleId);
            this.templateRuleId = templateRuleId;
            return this;
        }

        @Override
        public DescribeColumnsRequest build() {
            return new DescribeColumnsRequest(this);
        } 

    } 

}
