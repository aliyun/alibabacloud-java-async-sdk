// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateQualityRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateQualityRuleRequest</p>
 */
public class CreateQualityRuleRequest extends Request {
    @Body
    @NameInMap("BlockType")
    @Validation(required = true, maximum = 1)
    private Integer blockType;

    @Body
    @NameInMap("Checker")
    private Integer checker;

    @Body
    @NameInMap("Comment")
    @Validation(maxLength = 128, minLength = 1)
    private String comment;

    @Body
    @NameInMap("CriticalThreshold")
    private String criticalThreshold;

    @Body
    @NameInMap("EntityId")
    @Validation(required = true, maximum = 2147483647, minimum = 1)
    private Long entityId;

    @Body
    @NameInMap("ExpectValue")
    private String expectValue;

    @Body
    @NameInMap("MethodName")
    private String methodName;

    @Body
    @NameInMap("Operator")
    private String operator;

    @Body
    @NameInMap("PredictType")
    @Validation(required = true, maximum = 99)
    private Integer predictType;

    @Body
    @NameInMap("ProjectName")
    @Validation(required = true)
    private String projectName;

    @Body
    @NameInMap("Property")
    @Validation(maxLength = 128)
    private String property;

    @Body
    @NameInMap("PropertyType")
    private String propertyType;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("RuleName")
    @Validation(required = true, maxLength = 128)
    private String ruleName;

    @Body
    @NameInMap("RuleType")
    @Validation(required = true, maximum = 99)
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

    private CreateQualityRuleRequest(Builder builder) {
        super(builder);
        this.blockType = builder.blockType;
        this.checker = builder.checker;
        this.comment = builder.comment;
        this.criticalThreshold = builder.criticalThreshold;
        this.entityId = builder.entityId;
        this.expectValue = builder.expectValue;
        this.methodName = builder.methodName;
        this.operator = builder.operator;
        this.predictType = builder.predictType;
        this.projectName = builder.projectName;
        this.property = builder.property;
        this.propertyType = builder.propertyType;
        this.regionId = builder.regionId;
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

    public static CreateQualityRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return methodName
     */
    public String getMethodName() {
        return this.methodName;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<CreateQualityRuleRequest, Builder> {
        private Integer blockType; 
        private Integer checker; 
        private String comment; 
        private String criticalThreshold; 
        private Long entityId; 
        private String expectValue; 
        private String methodName; 
        private String operator; 
        private Integer predictType; 
        private String projectName; 
        private String property; 
        private String propertyType; 
        private String regionId; 
        private String ruleName; 
        private Integer ruleType; 
        private Integer templateId; 
        private String trend; 
        private String warningThreshold; 
        private String whereCondition; 

        private Builder() {
            super();
        } 

        private Builder(CreateQualityRuleRequest request) {
            super(request);
            this.blockType = request.blockType;
            this.checker = request.checker;
            this.comment = request.comment;
            this.criticalThreshold = request.criticalThreshold;
            this.entityId = request.entityId;
            this.expectValue = request.expectValue;
            this.methodName = request.methodName;
            this.operator = request.operator;
            this.predictType = request.predictType;
            this.projectName = request.projectName;
            this.property = request.property;
            this.propertyType = request.propertyType;
            this.regionId = request.regionId;
            this.ruleName = request.ruleName;
            this.ruleType = request.ruleType;
            this.templateId = request.templateId;
            this.trend = request.trend;
            this.warningThreshold = request.warningThreshold;
            this.whereCondition = request.whereCondition;
        } 

        /**
         * BlockType.
         */
        public Builder blockType(Integer blockType) {
            this.putBodyParameter("BlockType", blockType);
            this.blockType = blockType;
            return this;
        }

        /**
         * Checker.
         */
        public Builder checker(Integer checker) {
            this.putBodyParameter("Checker", checker);
            this.checker = checker;
            return this;
        }

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.putBodyParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * CriticalThreshold.
         */
        public Builder criticalThreshold(String criticalThreshold) {
            this.putBodyParameter("CriticalThreshold", criticalThreshold);
            this.criticalThreshold = criticalThreshold;
            return this;
        }

        /**
         * EntityId.
         */
        public Builder entityId(Long entityId) {
            this.putBodyParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        /**
         * ExpectValue.
         */
        public Builder expectValue(String expectValue) {
            this.putBodyParameter("ExpectValue", expectValue);
            this.expectValue = expectValue;
            return this;
        }

        /**
         * MethodName.
         */
        public Builder methodName(String methodName) {
            this.putBodyParameter("MethodName", methodName);
            this.methodName = methodName;
            return this;
        }

        /**
         * Operator.
         */
        public Builder operator(String operator) {
            this.putBodyParameter("Operator", operator);
            this.operator = operator;
            return this;
        }

        /**
         * PredictType.
         */
        public Builder predictType(Integer predictType) {
            this.putBodyParameter("PredictType", predictType);
            this.predictType = predictType;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * Property.
         */
        public Builder property(String property) {
            this.putBodyParameter("Property", property);
            this.property = property;
            return this;
        }

        /**
         * PropertyType.
         */
        public Builder propertyType(String propertyType) {
            this.putBodyParameter("PropertyType", propertyType);
            this.propertyType = propertyType;
            return this;
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
         * RuleName.
         */
        public Builder ruleName(String ruleName) {
            this.putBodyParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * RuleType.
         */
        public Builder ruleType(Integer ruleType) {
            this.putBodyParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(Integer templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * Trend.
         */
        public Builder trend(String trend) {
            this.putBodyParameter("Trend", trend);
            this.trend = trend;
            return this;
        }

        /**
         * WarningThreshold.
         */
        public Builder warningThreshold(String warningThreshold) {
            this.putBodyParameter("WarningThreshold", warningThreshold);
            this.warningThreshold = warningThreshold;
            return this;
        }

        /**
         * WhereCondition.
         */
        public Builder whereCondition(String whereCondition) {
            this.putBodyParameter("WhereCondition", whereCondition);
            this.whereCondition = whereCondition;
            return this;
        }

        @Override
        public CreateQualityRuleRequest build() {
            return new CreateQualityRuleRequest(this);
        } 

    } 

}
