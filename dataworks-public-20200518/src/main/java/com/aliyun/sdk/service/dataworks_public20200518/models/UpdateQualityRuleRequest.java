// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateQualityRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateQualityRuleRequest</p>
 */
public class UpdateQualityRuleRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("BlockType")
    @Validation(maximum = 1)
    private Integer blockType;

    @Body
    @NameInMap("Checker")
    @Validation(required = true)
    private Integer checker;

    @Body
    @NameInMap("Comment")
    @Validation(maxLength = 512)
    private String comment;

    @Body
    @NameInMap("CriticalThreshold")
    private String criticalThreshold;

    @Body
    @NameInMap("EntityId")
    private Long entityId;

    @Body
    @NameInMap("ExpectValue")
    @Validation(maxLength = 128)
    private String expectValue;

    @Body
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    @Body
    @NameInMap("MethodName")
    @Validation(required = true)
    private String methodName;

    @Body
    @NameInMap("OpenSwitch")
    private Boolean openSwitch;

    @Body
    @NameInMap("Operator")
    @Validation(maxLength = 128)
    private String operator;

    @Body
    @NameInMap("PredictType")
    @Validation(maximum = 99)
    private Integer predictType;

    @Body
    @NameInMap("ProjectId")
    private Long projectId;

    @Body
    @NameInMap("ProjectName")
    @Validation(required = true)
    private String projectName;

    @Body
    @NameInMap("Property")
    @Validation(required = true, maxLength = 128, minLength = 1)
    private String property;

    @Body
    @NameInMap("PropertyType")
    @Validation(maxLength = 128)
    private String propertyType;

    @Body
    @NameInMap("RuleName")
    @Validation(maxLength = 255, minLength = 1)
    private String ruleName;

    @Body
    @NameInMap("RuleType")
    @Validation(maximum = 99)
    private Integer ruleType;

    @Body
    @NameInMap("TemplateId")
    private Integer templateId;

    @Body
    @NameInMap("Trend")
    private String trend;

    @Body
    @NameInMap("WarningThreshold")
    private String warningThreshold;

    @Body
    @NameInMap("WhereCondition")
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
         * The strength of the monitoring rule. The strength of a monitoring rule indicates the importance of the rule. Valid values:
         * <p>
         * 
         * *   1: indicates that the monitoring rule is a strong rule.
         * 
         * *   0: indicates that the monitoring rule is a weak rule.
         * 
         *     You can specify whether a monitoring rule is a strong rule based on your business requirements. If a strong rule is used and a critical alert is triggered, nodes are blocked.
         */
        public Builder blockType(Integer blockType) {
            this.putBodyParameter("BlockType", blockType);
            this.blockType = blockType;
            return this;
        }

        /**
         * The ID of the checker. You can call the [ListQualityRules](~~173995~~) operation to obtain the ID of the checker.
         */
        public Builder checker(Integer checker) {
            this.putBodyParameter("Checker", checker);
            this.checker = checker;
            return this;
        }

        /**
         * The description of the monitoring rule.
         */
        public Builder comment(String comment) {
            this.putBodyParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * The threshold for a critical alert. The threshold indicates the deviation of the monitoring result from the expected value. You can customize this threshold based on your business requirements. If a strong rule is used and an error alert is triggered, nodes are blocked.
         */
        public Builder criticalThreshold(String criticalThreshold) {
            this.putBodyParameter("CriticalThreshold", criticalThreshold);
            this.criticalThreshold = criticalThreshold;
            return this;
        }

        /**
         * The ID of the partition filter expression. You can call the [GetQualityEntity](~~173995~~) operation to obtain the ID of the partition filter expression.
         */
        public Builder entityId(Long entityId) {
            this.putBodyParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        /**
         * The expected value of the monitoring result.
         */
        public Builder expectValue(String expectValue) {
            this.putBodyParameter("ExpectValue", expectValue);
            this.expectValue = expectValue;
            return this;
        }

        /**
         * The ID of the monitoring rule. You can call the [ListQualityRules](~~173995~~) operation to obtain the ID of the monitoring rule.
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The method that is used to collect sample data, such as avg, count, sum, min, max, count_distinct, user_defined, table_count, table_size, table_dt_load_count, table_dt_refuseload_count, null_value, null_value/table_count, (table_count-count_distinct)/table_count, or table_count-count_distinct.
         */
        public Builder methodName(String methodName) {
            this.putBodyParameter("MethodName", methodName);
            this.methodName = methodName;
            return this;
        }

        /**
         * Specifies whether to enable the monitoring rule in the production environment.
         * <p>
         * 
         * *   true: The monitoring rule is triggered when the associated auto triggered node that generates the output data starts to run.
         * *   false: The monitoring rule is not triggered when the associated auto triggered node that generates the output data starts to run.
         */
        public Builder openSwitch(Boolean openSwitch) {
            this.putBodyParameter("OpenSwitch", openSwitch);
            this.openSwitch = openSwitch;
            return this;
        }

        /**
         * The comparison operator, such as >, >=, =, ≠, <, or <=.
         */
        public Builder operator(String operator) {
            this.putBodyParameter("Operator", operator);
            this.operator = operator;
            return this;
        }

        /**
         * Specifies whether the threshold is a dynamic threshold. Valid values:
         * <p>
         * 
         * *   0: indicates that the threshold is not a dynamic threshold.
         * *   2: indicates that the threshold is a dynamic threshold.
         */
        public Builder predictType(Integer predictType) {
            this.putBodyParameter("PredictType", predictType);
            this.predictType = predictType;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The name of the compute engine instance or data source. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace Management page to obtain the name.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * The name of the field to be monitored.
         */
        public Builder property(String property) {
            this.putBodyParameter("Property", property);
            this.property = property;
            return this;
        }

        /**
         * The data type of the field.
         */
        public Builder propertyType(String propertyType) {
            this.putBodyParameter("PropertyType", propertyType);
            this.propertyType = propertyType;
            return this;
        }

        /**
         * The name of the monitoring rule.
         */
        public Builder ruleName(String ruleName) {
            this.putBodyParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * The type of the monitoring rule. Valid values:
         * <p>
         * 
         * *   0: The monitoring rule is created by the system.
         * *   1: The monitoring rule is created by a user.
         * *   2: The monitoring rule is a workspace-level rule.
         */
        public Builder ruleType(Integer ruleType) {
            this.putBodyParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * The ID of the monitoring template. You can call the [ListQualityRules](~~173995~~) operation to obtain the ID of the monitoring template that is used to create the monitoring rule.
         */
        public Builder templateId(Integer templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * The trend of the monitoring result. Valid values:
         * <p>
         * 
         * *   up: increasing
         * *   down: decreasing
         * *   abs: absolute value
         */
        public Builder trend(String trend) {
            this.putBodyParameter("Trend", trend);
            this.trend = trend;
            return this;
        }

        /**
         * The threshold for a warning alert. The threshold indicates the deviation of the monitoring result from the expected value. You can customize this threshold based on your business requirements.
         */
        public Builder warningThreshold(String warningThreshold) {
            this.putBodyParameter("WarningThreshold", warningThreshold);
            this.warningThreshold = warningThreshold;
            return this;
        }

        /**
         * The filter condition or custom SQL statement that is used for monitoring.
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
