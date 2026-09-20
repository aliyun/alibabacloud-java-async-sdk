// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link UpdateQualityRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateQualityRuleRequest</p>
 */
public class UpdateQualityRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BlockType")
    @com.aliyun.core.annotation.Validation(maximum = 1)
    private Integer blockType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Checker")
    private Integer checker;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Comment")
    @com.aliyun.core.annotation.Validation(maxLength = 512)
    private String comment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CriticalThreshold")
    private String criticalThreshold;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EntityId")
    private Long entityId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExpectValue")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String expectValue;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MethodName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String methodName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OpenSwitch")
    private Boolean openSwitch;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Operator")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String operator;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PredictType")
    @com.aliyun.core.annotation.Validation(maximum = 99)
    private Integer predictType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Property")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String property;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PropertyType")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String propertyType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(maxLength = 255, minLength = 1)
    private String ruleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuleType")
    @com.aliyun.core.annotation.Validation(maximum = 99)
    private Integer ruleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskSetting")
    private String taskSetting;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private Integer templateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Trend")
    private String trend;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WarningThreshold")
    private String warningThreshold;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WhereCondition")
    private String whereCondition;

    private UpdateQualityRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.blockType = builder.blockType;
        this.checker = builder.checker;
        this.comment = builder.comment;
        this.criticalThreshold = builder.criticalThreshold;
        this.entityId = builder.entityId;
        this.expectValue = builder.expectValue;
        this.id = builder.id;
        this.methodName = builder.methodName;
        this.openSwitch = builder.openSwitch;
        this.operator = builder.operator;
        this.predictType = builder.predictType;
        this.projectId = builder.projectId;
        this.projectName = builder.projectName;
        this.property = builder.property;
        this.propertyType = builder.propertyType;
        this.ruleName = builder.ruleName;
        this.ruleType = builder.ruleType;
        this.taskSetting = builder.taskSetting;
        this.templateId = builder.templateId;
        this.trend = builder.trend;
        this.warningThreshold = builder.warningThreshold;
        this.whereCondition = builder.whereCondition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateQualityRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return blockType
     */
    public Integer getBlockType() {
        return this.blockType;
    }

    /**
     * @return checker
     */
    public Integer getChecker() {
        return this.checker;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return criticalThreshold
     */
    public String getCriticalThreshold() {
        return this.criticalThreshold;
    }

    /**
     * @return entityId
     */
    public Long getEntityId() {
        return this.entityId;
    }

    /**
     * @return expectValue
     */
    public String getExpectValue() {
        return this.expectValue;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return methodName
     */
    public String getMethodName() {
        return this.methodName;
    }

    /**
     * @return openSwitch
     */
    public Boolean getOpenSwitch() {
        return this.openSwitch;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return predictType
     */
    public Integer getPredictType() {
        return this.predictType;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return property
     */
    public String getProperty() {
        return this.property;
    }

    /**
     * @return propertyType
     */
    public String getPropertyType() {
        return this.propertyType;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return ruleType
     */
    public Integer getRuleType() {
        return this.ruleType;
    }

    /**
     * @return taskSetting
     */
    public String getTaskSetting() {
        return this.taskSetting;
    }

    /**
     * @return templateId
     */
    public Integer getTemplateId() {
        return this.templateId;
    }

    /**
     * @return trend
     */
    public String getTrend() {
        return this.trend;
    }

    /**
     * @return warningThreshold
     */
    public String getWarningThreshold() {
        return this.warningThreshold;
    }

    /**
     * @return whereCondition
     */
    public String getWhereCondition() {
        return this.whereCondition;
    }

    public static final class Builder extends Request.Builder<UpdateQualityRuleRequest, Builder> {
        private String regionId; 
        private Integer blockType; 
        private Integer checker; 
        private String comment; 
        private String criticalThreshold; 
        private Long entityId; 
        private String expectValue; 
        private Long id; 
        private String methodName; 
        private Boolean openSwitch; 
        private String operator; 
        private Integer predictType; 
        private Long projectId; 
        private String projectName; 
        private String property; 
        private String propertyType; 
        private String ruleName; 
        private Integer ruleType; 
        private String taskSetting; 
        private Integer templateId; 
        private String trend; 
        private String warningThreshold; 
        private String whereCondition; 

        private Builder() {
            super();
        } 

        private Builder(UpdateQualityRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.blockType = request.blockType;
            this.checker = request.checker;
            this.comment = request.comment;
            this.criticalThreshold = request.criticalThreshold;
            this.entityId = request.entityId;
            this.expectValue = request.expectValue;
            this.id = request.id;
            this.methodName = request.methodName;
            this.openSwitch = request.openSwitch;
            this.operator = request.operator;
            this.predictType = request.predictType;
            this.projectId = request.projectId;
            this.projectName = request.projectName;
            this.property = request.property;
            this.propertyType = request.propertyType;
            this.ruleName = request.ruleName;
            this.ruleType = request.ruleType;
            this.taskSetting = request.taskSetting;
            this.templateId = request.templateId;
            this.trend = request.trend;
            this.warningThreshold = request.warningThreshold;
            this.whereCondition = request.whereCondition;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The strength of the quality check rule. The strength indicates the importance of the rule. Valid values:</p>
         * <ul>
         * <li>1: strong rule.</li>
         * <li>0: weak rule.
         * You can set important rules as strong rules based on your business requirements. If a strong rule is used and a red alert is triggered, the scheduling task is blocked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder blockType(Integer blockType) {
            this.putBodyParameter("BlockType", blockType);
            this.blockType = blockType;
            return this;
        }

        /**
         * <p>The checker ID.
         * 2: 7-day average fluctuation.
         * 3: 30-day average fluctuation.
         * 4: 1-day cycle comparison.
         * 5: 7-day cycle comparison.
         * 6: 30-day cycle comparison.
         * 7: 7-day variance fluctuation.
         * 8: 30-day variance fluctuation.
         * 9: comparison with a fixed value.
         * 10: 1-, 7-, and 30-day fluctuation detection.
         * 11: previous cycle comparison.
         * You can call the <a href="https://help.aliyun.com/document_detail/173995.html">ListQualityRules</a> operation to obtain the checker ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        public Builder checker(Integer checker) {
            this.putBodyParameter("Checker", checker);
            this.checker = checker;
            return this;
        }

        /**
         * <p>The description of the quality check rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Verify the number of table rows</p>
         */
        public Builder comment(String comment) {
            this.putBodyParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>The red alert threshold. This value indicates the degree of deviation from the expected sample value. You can customize this threshold based on your business requirements. If a strong rule is used and the red threshold is triggered, the scheduling task is blocked.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder criticalThreshold(String criticalThreshold) {
            this.putBodyParameter("CriticalThreshold", criticalThreshold);
            this.criticalThreshold = criticalThreshold;
            return this;
        }

        /**
         * <p>The ID of the partition expression. You can call the <a href="https://help.aliyun.com/document_detail/173995.html">ListQualityRules</a> operation to obtain the partition expression ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder entityId(Long entityId) {
            this.putBodyParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        /**
         * <p>The expected value of the check result.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder expectValue(String expectValue) {
            this.putBodyParameter("ExpectValue", expectValue);
            this.expectValue = expectValue;
            return this;
        }

        /**
         * <p>The ID of the quality check rule. You can call the <a href="https://help.aliyun.com/document_detail/173995.html">ListQualityRules</a> operation to obtain the rule ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The name of the method used to collect sample data. Valid values: avg, count, sum, min, max, count_distinct, user_defined, table_count, table_size, table_dt_load_count, table_dt_refuseload_count, null_value, null_value/table_count, (table_count-count_distinct)/table_count, and table_count-count_distinct.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>table_count</p>
         */
        public Builder methodName(String methodName) {
            this.putBodyParameter("MethodName", methodName);
            this.methodName = methodName;
            return this;
        }

        /**
         * <p>The enabled or disabled status of the rule, which controls whether the quality rule runs in the production environment.</p>
         * <ul>
         * <li><p>true: When the scheduling task associated with the output table data of the data quality rule is executed, the quality rule check is triggered.</p>
         * </li>
         * <li><p>false: When the scheduling task associated with the output table data of the data quality rule is executed, the quality rule check is not triggered.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder openSwitch(Boolean openSwitch) {
            this.putBodyParameter("OpenSwitch", openSwitch);
            this.openSwitch = openSwitch;
            return this;
        }

        /**
         * <p>The comparison operator. Valid values: &gt;, &gt;=, =, ≠, &lt;, and &lt;=.</p>
         * <blockquote>
         * <p>When Checker is set to 9, Operator is a required parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <blockquote>
         * </blockquote>
         */
        public Builder operator(String operator) {
            this.putBodyParameter("Operator", operator);
            this.operator = operator;
            return this;
        }

        /**
         * <p>Specifies whether the threshold is dynamic. Valid values:</p>
         * <ul>
         * <li>0: non-dynamic threshold.</li>
         * <li>2: dynamic threshold.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder predictType(Integer predictType) {
            this.putBodyParameter("PredictType", predictType);
            this.predictType = predictType;
            return this;
        }

        /**
         * <p>The ID of the DataWorks workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>26</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The name of the engine or data source. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the workspace management page to obtain the name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>autotest</p>
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The name of the field.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        public Builder property(String property) {
            this.putBodyParameter("Property", property);
            this.property = property;
            return this;
        }

        /**
         * <p>The type of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>bigint</p>
         */
        public Builder propertyType(String propertyType) {
            this.putBodyParameter("PropertyType", propertyType);
            this.propertyType = propertyType;
            return this;
        }

        /**
         * <p>The name of the quality check rule.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder ruleName(String ruleName) {
            this.putBodyParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The type of the rule. Valid values:</p>
         * <ul>
         * <li>0: system template rule.</li>
         * <li>1: custom SQL rule.</li>
         * <li>4: custom template rule.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder ruleType(Integer ruleType) {
            this.putBodyParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * <p>The variable settings inserted before the custom rule, in the format of x=a,y=b.</p>
         * 
         * <strong>example:</strong>
         * <p>x=a,y=b</p>
         */
        public Builder taskSetting(String taskSetting) {
            this.putBodyParameter("TaskSetting", taskSetting);
            this.taskSetting = taskSetting;
            return this;
        }

        /**
         * <p>The ID of the check template. You can call the <a href="https://help.aliyun.com/document_detail/173995.html">ListQualityRules</a> operation to obtain the check template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder templateId(Integer templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The trend of the check result. Valid values:</p>
         * <ul>
         * <li>up: upward trend.</li>
         * <li>down: downward trend.</li>
         * <li>abs: absolute value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>up</p>
         */
        public Builder trend(String trend) {
            this.putBodyParameter("Trend", trend);
            this.trend = trend;
            return this;
        }

        /**
         * <p>The orange alert threshold. This value indicates the degree of deviation from the expected sample value. You can customize this threshold based on your business requirements.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder warningThreshold(String warningThreshold) {
            this.putBodyParameter("WarningThreshold", warningThreshold);
            this.warningThreshold = warningThreshold;
            return this;
        }

        /**
         * <p>The filter condition or custom SQL statement used by the check task.</p>
         * 
         * <strong>example:</strong>
         * <p>dt=$[yyyymmdd]</p>
         */
        public Builder whereCondition(String whereCondition) {
            this.putBodyParameter("WhereCondition", whereCondition);
            this.whereCondition = whereCondition;
            return this;
        }

        @Override
        public UpdateQualityRuleRequest build() {
            return new UpdateQualityRuleRequest(this);
        } 

    } 

}
