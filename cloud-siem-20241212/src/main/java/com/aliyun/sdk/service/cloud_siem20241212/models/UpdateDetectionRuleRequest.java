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
 * {@link UpdateDetectionRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateDetectionRuleRequest</p>
 */
public class UpdateDetectionRuleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertAttCk")
    private String alertAttCk;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertDescription")
    private String alertDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertLevel")
    private String alertLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertName")
    private String alertName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertSchemaId")
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
    @com.aliyun.core.annotation.NameInMap("DetectionRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String detectionRuleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DetectionRuleName")
    @com.aliyun.core.annotation.Validation(maxLength = 100)
    private String detectionRuleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DetectionRuleStatus")
    private String detectionRuleStatus;

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

    private UpdateDetectionRuleRequest(Builder builder) {
        super(builder);
        this.alertAttCk = builder.alertAttCk;
        this.alertDescription = builder.alertDescription;
        this.alertLevel = builder.alertLevel;
        this.alertName = builder.alertName;
        this.alertSchemaId = builder.alertSchemaId;
        this.alertTacticId = builder.alertTacticId;
        this.alertThresholdCount = builder.alertThresholdCount;
        this.alertThresholdGroup = builder.alertThresholdGroup;
        this.alertThresholdPeriod = builder.alertThresholdPeriod;
        this.alertType = builder.alertType;
        this.detectionExpressionContent = builder.detectionExpressionContent;
        this.detectionExpressionType = builder.detectionExpressionType;
        this.detectionRuleDescription = builder.detectionRuleDescription;
        this.detectionRuleId = builder.detectionRuleId;
        this.detectionRuleName = builder.detectionRuleName;
        this.detectionRuleStatus = builder.detectionRuleStatus;
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

    public static UpdateDetectionRuleRequest create() {
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
     * @return alertDescription
     */
    public String getAlertDescription() {
        return this.alertDescription;
    }

    /**
     * @return alertLevel
     */
    public String getAlertLevel() {
        return this.alertLevel;
    }

    /**
     * @return alertName
     */
    public String getAlertName() {
        return this.alertName;
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
     * @return detectionRuleId
     */
    public String getDetectionRuleId() {
        return this.detectionRuleId;
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

    public static final class Builder extends Request.Builder<UpdateDetectionRuleRequest, Builder> {
        private String alertAttCk; 
        private String alertDescription; 
        private String alertLevel; 
        private String alertName; 
        private String alertSchemaId; 
        private String alertTacticId; 
        private Integer alertThresholdCount; 
        private String alertThresholdGroup; 
        private String alertThresholdPeriod; 
        private String alertType; 
        private String detectionExpressionContent; 
        private String detectionExpressionType; 
        private String detectionRuleDescription; 
        private String detectionRuleId; 
        private String detectionRuleName; 
        private String detectionRuleStatus; 
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
        private Long scheduleBeginTime; 
        private String scheduleExpression; 
        private Integer scheduleMaxRetries; 
        private Integer scheduleMaxTimeout; 
        private String scheduleType; 
        private String scheduleWindow; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDetectionRuleRequest request) {
            super(request);
            this.alertAttCk = request.alertAttCk;
            this.alertDescription = request.alertDescription;
            this.alertLevel = request.alertLevel;
            this.alertName = request.alertName;
            this.alertSchemaId = request.alertSchemaId;
            this.alertTacticId = request.alertTacticId;
            this.alertThresholdCount = request.alertThresholdCount;
            this.alertThresholdGroup = request.alertThresholdGroup;
            this.alertThresholdPeriod = request.alertThresholdPeriod;
            this.alertType = request.alertType;
            this.detectionExpressionContent = request.detectionExpressionContent;
            this.detectionExpressionType = request.detectionExpressionType;
            this.detectionRuleDescription = request.detectionRuleDescription;
            this.detectionRuleId = request.detectionRuleId;
            this.detectionRuleName = request.detectionRuleName;
            this.detectionRuleStatus = request.detectionRuleStatus;
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
         * AlertDescription.
         */
        public Builder alertDescription(String alertDescription) {
            this.putBodyParameter("AlertDescription", alertDescription);
            this.alertDescription = alertDescription;
            return this;
        }

        /**
         * AlertLevel.
         */
        public Builder alertLevel(String alertLevel) {
            this.putBodyParameter("AlertLevel", alertLevel);
            this.alertLevel = alertLevel;
            return this;
        }

        /**
         * AlertName.
         */
        public Builder alertName(String alertName) {
            this.putBodyParameter("AlertName", alertName);
            this.alertName = alertName;
            return this;
        }

        /**
         * AlertSchemaId.
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
         * AlertType.
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
         * <p>jndi-attack-success_http_dns</p>
         */
        public Builder detectionRuleId(String detectionRuleId) {
            this.putBodyParameter("DetectionRuleId", detectionRuleId);
            this.detectionRuleId = detectionRuleId;
            return this;
        }

        /**
         * DetectionRuleName.
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
         * LogSchemaId.
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
        public UpdateDetectionRuleRequest build() {
            return new UpdateDetectionRuleRequest(this);
        } 

    } 

}
