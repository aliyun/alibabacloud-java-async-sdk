// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link CreateDetectionRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateDetectionRuleRequest</p>
 */
public class CreateDetectionRuleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertAttCk")
    private String alertAttCk;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertLevel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alertLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertSchemaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alertSchemaId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertTacticId")
    private String alertTacticId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertThresholdCount")
    private Integer alertThresholdCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertThresholdGroup")
    private String alertThresholdGroup;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertThresholdPeriod")
    private String alertThresholdPeriod;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alertType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DetectionExpressionContent")
    private String detectionExpressionContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DetectionExpressionType")
    private String detectionExpressionType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DetectionRuleDescription")
    @com.aliyun.core.annotation.Validation(maxLength = 2000)
    private String detectionRuleDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DetectionRuleName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 100)
    private String detectionRuleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DetectionRuleStatus")
    private String detectionRuleStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DetectionRuleTemplateId")
    private String detectionRuleTemplateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DetectionRuleTemplateVersion")
    private String detectionRuleTemplateVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DetectionRuleType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String detectionRuleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EntityMappings")
    private String entityMappings;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncidentAggregationExpression")
    private String incidentAggregationExpression;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncidentAggregationType")
    private String incidentAggregationType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogCategoryId")
    private String logCategoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogSchemaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logSchemaId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookParameters")
    private String playbookParameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
    private String playbookUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScheduleBeginTime")
    private Long scheduleBeginTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScheduleExpression")
    private String scheduleExpression;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScheduleMaxRetries")
    private Integer scheduleMaxRetries;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScheduleMaxTimeout")
    private Integer scheduleMaxTimeout;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScheduleType")
    private String scheduleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScheduleWindow")
    private String scheduleWindow;

    private CreateDetectionRuleRequest(Builder builder) {
        super(builder);
        this.alertAttCk = builder.alertAttCk;
        this.alertLevel = builder.alertLevel;
        this.alertSchemaId = builder.alertSchemaId;
        this.alertTacticId = builder.alertTacticId;
        this.alertThresholdCount = builder.alertThresholdCount;
        this.alertThresholdGroup = builder.alertThresholdGroup;
        this.alertThresholdPeriod = builder.alertThresholdPeriod;
        this.alertType = builder.alertType;
        this.detectionExpressionContent = builder.detectionExpressionContent;
        this.detectionExpressionType = builder.detectionExpressionType;
        this.detectionRuleDescription = builder.detectionRuleDescription;
        this.detectionRuleName = builder.detectionRuleName;
        this.detectionRuleStatus = builder.detectionRuleStatus;
        this.detectionRuleTemplateId = builder.detectionRuleTemplateId;
        this.detectionRuleTemplateVersion = builder.detectionRuleTemplateVersion;
        this.detectionRuleType = builder.detectionRuleType;
        this.entityMappings = builder.entityMappings;
        this.incidentAggregationExpression = builder.incidentAggregationExpression;
        this.incidentAggregationType = builder.incidentAggregationType;
        this.lang = builder.lang;
        this.logCategoryId = builder.logCategoryId;
        this.logSchemaId = builder.logSchemaId;
        this.playbookParameters = builder.playbookParameters;
        this.playbookUuid = builder.playbookUuid;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.scheduleBeginTime = builder.scheduleBeginTime;
        this.scheduleExpression = builder.scheduleExpression;
        this.scheduleMaxRetries = builder.scheduleMaxRetries;
        this.scheduleMaxTimeout = builder.scheduleMaxTimeout;
        this.scheduleType = builder.scheduleType;
        this.scheduleWindow = builder.scheduleWindow;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDetectionRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertAttCk
     */
    public String getAlertAttCk() {
        return this.alertAttCk;
    }

    /**
     * @return alertLevel
     */
    public String getAlertLevel() {
        return this.alertLevel;
    }

    /**
     * @return alertSchemaId
     */
    public String getAlertSchemaId() {
        return this.alertSchemaId;
    }

    /**
     * @return alertTacticId
     */
    public String getAlertTacticId() {
        return this.alertTacticId;
    }

    /**
     * @return alertThresholdCount
     */
    public Integer getAlertThresholdCount() {
        return this.alertThresholdCount;
    }

    /**
     * @return alertThresholdGroup
     */
    public String getAlertThresholdGroup() {
        return this.alertThresholdGroup;
    }

    /**
     * @return alertThresholdPeriod
     */
    public String getAlertThresholdPeriod() {
        return this.alertThresholdPeriod;
    }

    /**
     * @return alertType
     */
    public String getAlertType() {
        return this.alertType;
    }

    /**
     * @return detectionExpressionContent
     */
    public String getDetectionExpressionContent() {
        return this.detectionExpressionContent;
    }

    /**
     * @return detectionExpressionType
     */
    public String getDetectionExpressionType() {
        return this.detectionExpressionType;
    }

    /**
     * @return detectionRuleDescription
     */
    public String getDetectionRuleDescription() {
        return this.detectionRuleDescription;
    }

    /**
     * @return detectionRuleName
     */
    public String getDetectionRuleName() {
        return this.detectionRuleName;
    }

    /**
     * @return detectionRuleStatus
     */
    public String getDetectionRuleStatus() {
        return this.detectionRuleStatus;
    }

    /**
     * @return detectionRuleTemplateId
     */
    public String getDetectionRuleTemplateId() {
        return this.detectionRuleTemplateId;
    }

    /**
     * @return detectionRuleTemplateVersion
     */
    public String getDetectionRuleTemplateVersion() {
        return this.detectionRuleTemplateVersion;
    }

    /**
     * @return detectionRuleType
     */
    public String getDetectionRuleType() {
        return this.detectionRuleType;
    }

    /**
     * @return entityMappings
     */
    public String getEntityMappings() {
        return this.entityMappings;
    }

    /**
     * @return incidentAggregationExpression
     */
    public String getIncidentAggregationExpression() {
        return this.incidentAggregationExpression;
    }

    /**
     * @return incidentAggregationType
     */
    public String getIncidentAggregationType() {
        return this.incidentAggregationType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return logCategoryId
     */
    public String getLogCategoryId() {
        return this.logCategoryId;
    }

    /**
     * @return logSchemaId
     */
    public String getLogSchemaId() {
        return this.logSchemaId;
    }

    /**
     * @return playbookParameters
     */
    public String getPlaybookParameters() {
        return this.playbookParameters;
    }

    /**
     * @return playbookUuid
     */
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return scheduleBeginTime
     */
    public Long getScheduleBeginTime() {
        return this.scheduleBeginTime;
    }

    /**
     * @return scheduleExpression
     */
    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    /**
     * @return scheduleMaxRetries
     */
    public Integer getScheduleMaxRetries() {
        return this.scheduleMaxRetries;
    }

    /**
     * @return scheduleMaxTimeout
     */
    public Integer getScheduleMaxTimeout() {
        return this.scheduleMaxTimeout;
    }

    /**
     * @return scheduleType
     */
    public String getScheduleType() {
        return this.scheduleType;
    }

    /**
     * @return scheduleWindow
     */
    public String getScheduleWindow() {
        return this.scheduleWindow;
    }

    public static final class Builder extends Request.Builder<CreateDetectionRuleRequest, Builder> {
        private String alertAttCk; 
        private String alertLevel; 
        private String alertSchemaId; 
        private String alertTacticId; 
        private Integer alertThresholdCount; 
        private String alertThresholdGroup; 
        private String alertThresholdPeriod; 
        private String alertType; 
        private String detectionExpressionContent; 
        private String detectionExpressionType; 
        private String detectionRuleDescription; 
        private String detectionRuleName; 
        private String detectionRuleStatus; 
        private String detectionRuleTemplateId; 
        private String detectionRuleTemplateVersion; 
        private String detectionRuleType; 
        private String entityMappings; 
        private String incidentAggregationExpression; 
        private String incidentAggregationType; 
        private String lang; 
        private String logCategoryId; 
        private String logSchemaId; 
        private String playbookParameters; 
        private String playbookUuid; 
        private String regionId; 
        private Long roleFor; 
        private Long scheduleBeginTime; 
        private String scheduleExpression; 
        private Integer scheduleMaxRetries; 
        private Integer scheduleMaxTimeout; 
        private String scheduleType; 
        private String scheduleWindow; 

        private Builder() {
            super();
        } 

        private Builder(CreateDetectionRuleRequest request) {
            super(request);
            this.alertAttCk = request.alertAttCk;
            this.alertLevel = request.alertLevel;
            this.alertSchemaId = request.alertSchemaId;
            this.alertTacticId = request.alertTacticId;
            this.alertThresholdCount = request.alertThresholdCount;
            this.alertThresholdGroup = request.alertThresholdGroup;
            this.alertThresholdPeriod = request.alertThresholdPeriod;
            this.alertType = request.alertType;
            this.detectionExpressionContent = request.detectionExpressionContent;
            this.detectionExpressionType = request.detectionExpressionType;
            this.detectionRuleDescription = request.detectionRuleDescription;
            this.detectionRuleName = request.detectionRuleName;
            this.detectionRuleStatus = request.detectionRuleStatus;
            this.detectionRuleTemplateId = request.detectionRuleTemplateId;
            this.detectionRuleTemplateVersion = request.detectionRuleTemplateVersion;
            this.detectionRuleType = request.detectionRuleType;
            this.entityMappings = request.entityMappings;
            this.incidentAggregationExpression = request.incidentAggregationExpression;
            this.incidentAggregationType = request.incidentAggregationType;
            this.lang = request.lang;
            this.logCategoryId = request.logCategoryId;
            this.logSchemaId = request.logSchemaId;
            this.playbookParameters = request.playbookParameters;
            this.playbookUuid = request.playbookUuid;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.scheduleBeginTime = request.scheduleBeginTime;
            this.scheduleExpression = request.scheduleExpression;
            this.scheduleMaxRetries = request.scheduleMaxRetries;
            this.scheduleMaxTimeout = request.scheduleMaxTimeout;
            this.scheduleType = request.scheduleType;
            this.scheduleWindow = request.scheduleWindow;
        } 

        /**
         * AlertAttCk.
         */
        public Builder alertAttCk(String alertAttCk) {
            this.putBodyParameter("AlertAttCk", alertAttCk);
            this.alertAttCk = alertAttCk;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder alertLevel(String alertLevel) {
            this.putBodyParameter("AlertLevel", alertLevel);
            this.alertLevel = alertLevel;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ALERT_ACTIVITY</p>
         */
        public Builder alertSchemaId(String alertSchemaId) {
            this.putBodyParameter("AlertSchemaId", alertSchemaId);
            this.alertSchemaId = alertSchemaId;
            return this;
        }

        /**
         * AlertTacticId.
         */
        public Builder alertTacticId(String alertTacticId) {
            this.putBodyParameter("AlertTacticId", alertTacticId);
            this.alertTacticId = alertTacticId;
            return this;
        }

        /**
         * AlertThresholdCount.
         */
        public Builder alertThresholdCount(Integer alertThresholdCount) {
            this.putBodyParameter("AlertThresholdCount", alertThresholdCount);
            this.alertThresholdCount = alertThresholdCount;
            return this;
        }

        /**
         * AlertThresholdGroup.
         */
        public Builder alertThresholdGroup(String alertThresholdGroup) {
            this.putBodyParameter("AlertThresholdGroup", alertThresholdGroup);
            this.alertThresholdGroup = alertThresholdGroup;
            return this;
        }

        /**
         * AlertThresholdPeriod.
         */
        public Builder alertThresholdPeriod(String alertThresholdPeriod) {
            this.putBodyParameter("AlertThresholdPeriod", alertThresholdPeriod);
            this.alertThresholdPeriod = alertThresholdPeriod;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WebShell</p>
         */
        public Builder alertType(String alertType) {
            this.putBodyParameter("AlertType", alertType);
            this.alertType = alertType;
            return this;
        }

        /**
         * DetectionExpressionContent.
         */
        public Builder detectionExpressionContent(String detectionExpressionContent) {
            this.putBodyParameter("DetectionExpressionContent", detectionExpressionContent);
            this.detectionExpressionContent = detectionExpressionContent;
            return this;
        }

        /**
         * DetectionExpressionType.
         */
        public Builder detectionExpressionType(String detectionExpressionType) {
            this.putBodyParameter("DetectionExpressionType", detectionExpressionType);
            this.detectionExpressionType = detectionExpressionType;
            return this;
        }

        /**
         * DetectionRuleDescription.
         */
        public Builder detectionRuleDescription(String detectionRuleDescription) {
            this.putBodyParameter("DetectionRuleDescription", detectionRuleDescription);
            this.detectionRuleDescription = detectionRuleDescription;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dr-ha1i09ob3zmqrs85****</p>
         */
        public Builder detectionRuleName(String detectionRuleName) {
            this.putBodyParameter("DetectionRuleName", detectionRuleName);
            this.detectionRuleName = detectionRuleName;
            return this;
        }

        /**
         * DetectionRuleStatus.
         */
        public Builder detectionRuleStatus(String detectionRuleStatus) {
            this.putBodyParameter("DetectionRuleStatus", detectionRuleStatus);
            this.detectionRuleStatus = detectionRuleStatus;
            return this;
        }

        /**
         * DetectionRuleTemplateId.
         */
        public Builder detectionRuleTemplateId(String detectionRuleTemplateId) {
            this.putBodyParameter("DetectionRuleTemplateId", detectionRuleTemplateId);
            this.detectionRuleTemplateId = detectionRuleTemplateId;
            return this;
        }

        /**
         * DetectionRuleTemplateVersion.
         */
        public Builder detectionRuleTemplateVersion(String detectionRuleTemplateVersion) {
            this.putBodyParameter("DetectionRuleTemplateVersion", detectionRuleTemplateVersion);
            this.detectionRuleTemplateVersion = detectionRuleTemplateVersion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        public Builder detectionRuleType(String detectionRuleType) {
            this.putBodyParameter("DetectionRuleType", detectionRuleType);
            this.detectionRuleType = detectionRuleType;
            return this;
        }

        /**
         * EntityMappings.
         */
        public Builder entityMappings(String entityMappings) {
            this.putBodyParameter("EntityMappings", entityMappings);
            this.entityMappings = entityMappings;
            return this;
        }

        /**
         * IncidentAggregationExpression.
         */
        public Builder incidentAggregationExpression(String incidentAggregationExpression) {
            this.putBodyParameter("IncidentAggregationExpression", incidentAggregationExpression);
            this.incidentAggregationExpression = incidentAggregationExpression;
            return this;
        }

        /**
         * IncidentAggregationType.
         */
        public Builder incidentAggregationType(String incidentAggregationType) {
            this.putBodyParameter("IncidentAggregationType", incidentAggregationType);
            this.incidentAggregationType = incidentAggregationType;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * LogCategoryId.
         */
        public Builder logCategoryId(String logCategoryId) {
            this.putBodyParameter("LogCategoryId", logCategoryId);
            this.logCategoryId = logCategoryId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>API_RISK_ACTIVITY</p>
         */
        public Builder logSchemaId(String logSchemaId) {
            this.putBodyParameter("LogSchemaId", logSchemaId);
            this.logSchemaId = logSchemaId;
            return this;
        }

        /**
         * PlaybookParameters.
         */
        public Builder playbookParameters(String playbookParameters) {
            this.putBodyParameter("PlaybookParameters", playbookParameters);
            this.playbookParameters = playbookParameters;
            return this;
        }

        /**
         * PlaybookUuid.
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putBodyParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RoleFor.
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * ScheduleBeginTime.
         */
        public Builder scheduleBeginTime(Long scheduleBeginTime) {
            this.putBodyParameter("ScheduleBeginTime", scheduleBeginTime);
            this.scheduleBeginTime = scheduleBeginTime;
            return this;
        }

        /**
         * ScheduleExpression.
         */
        public Builder scheduleExpression(String scheduleExpression) {
            this.putBodyParameter("ScheduleExpression", scheduleExpression);
            this.scheduleExpression = scheduleExpression;
            return this;
        }

        /**
         * ScheduleMaxRetries.
         */
        public Builder scheduleMaxRetries(Integer scheduleMaxRetries) {
            this.putBodyParameter("ScheduleMaxRetries", scheduleMaxRetries);
            this.scheduleMaxRetries = scheduleMaxRetries;
            return this;
        }

        /**
         * ScheduleMaxTimeout.
         */
        public Builder scheduleMaxTimeout(Integer scheduleMaxTimeout) {
            this.putBodyParameter("ScheduleMaxTimeout", scheduleMaxTimeout);
            this.scheduleMaxTimeout = scheduleMaxTimeout;
            return this;
        }

        /**
         * ScheduleType.
         */
        public Builder scheduleType(String scheduleType) {
            this.putBodyParameter("ScheduleType", scheduleType);
            this.scheduleType = scheduleType;
            return this;
        }

        /**
         * ScheduleWindow.
         */
        public Builder scheduleWindow(String scheduleWindow) {
            this.putBodyParameter("ScheduleWindow", scheduleWindow);
            this.scheduleWindow = scheduleWindow;
            return this;
        }

        @Override
        public CreateDetectionRuleRequest build() {
            return new CreateDetectionRuleRequest(this);
        } 

    } 

}
