// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

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
         * <p>The page number of the page to return.</p>
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
         * EngineType.
         */
        public Builder engineType(String engineType) {
            this.putQueryParameter("EngineType", engineType);
            this.engineType = engineType;
            return this;
        }

        /**
         * <p>The ID of the instance to which data in the column of the table belongs.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeRules~~">DescribeInstances</a> operation to query the IDs of instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder instanceId(Long instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the instance to which data in the column of the table belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp17t1htja573l5i8****</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh_cn</strong>: Chinese</li>
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
         * ModelTagId.
         */
        public Builder modelTagId(String modelTagId) {
            this.putQueryParameter("ModelTagId", modelTagId);
            this.modelTagId = modelTagId;
            return this;
        }

        /**
         * <p>The search keyword. Fuzzy match is supported.</p>
         * <p>For example, if you enter <strong>test</strong>, all columns whose names contain <strong>test</strong> are retrieved.</p>
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
         * <p>The number of entries to return on each page.</p>
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
         * <p>The name of the service to which data in the column of the table belongs. Valid values include <strong>MaxCompute, OSS, ADS, OTS, and RDS</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
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
         * <p>The sensitivity level of the sensitive data that hits the sensitive data detection rule. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: N/A</li>
         * <li><strong>2</strong>: S1</li>
         * <li><strong>3</strong>: S2</li>
         * <li><strong>4</strong>: S3</li>
         * <li><strong>5</strong>: S4</li>
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
         * <p>The ID of the sensitive data detection rule that data in the column of the table hits.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeRules~~">DescribeRules</a> operation to query the IDs of sensitive data detection rules.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>11111</p>
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The name of the sensitive data detection rule that data in the column of the table hits.</p>
         * 
         * <strong>example:</strong>
         * <p>ID card number (the Chinese mainland)</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The name of the sensitivity level of the data that hits the sensitive data detection rule. Valid values:</p>
         * <ul>
         * <li><strong>N/A</strong>: No sensitive data is detected.</li>
         * <li><strong>S1</strong>: indicates the low sensitivity level.</li>
         * <li><strong>S2</strong>: indicates the medium sensitivity level.</li>
         * <li><strong>S3</strong>: indicates the high sensitivity level.</li>
         * <li><strong>S4</strong>: indicates the highest sensitivity level.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>S2</p>
         */
        public Builder sensLevelName(String sensLevelName) {
            this.putQueryParameter("SensLevelName", sensLevelName);
            this.sensLevelName = sensLevelName;
            return this;
        }

        /**
         * <p>The ID of the table to which the column belongs.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeTables~~">DescribeTables</a> operation to query the IDs of tables.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>11132334</p>
         */
        public Builder tableId(Long tableId) {
            this.putQueryParameter("TableId", tableId);
            this.tableId = tableId;
            return this;
        }

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>it_table</p>
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
