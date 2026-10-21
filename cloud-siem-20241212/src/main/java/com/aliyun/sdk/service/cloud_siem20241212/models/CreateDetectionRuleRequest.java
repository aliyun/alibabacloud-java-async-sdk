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
    @com.aliyun.core.annotation.NameInMap("AlertAttCkMapping")
    private String alertAttCkMapping;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertDescription")
    private String alertDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertLevel")
    private String alertLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertLevelMapping")
    private String alertLevelMapping;

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
    @com.aliyun.core.annotation.NameInMap("AlertTypeMapping")
    private String alertTypeMapping;

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
    @com.aliyun.core.annotation.Validation(maxLength = 128)
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
    private String detectionRuleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DetectionRules")
    private String detectionRules;

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
        this.alertAttCkMapping = builder.alertAttCkMapping;
        this.alertDescription = builder.alertDescription;
        this.alertLevel = builder.alertLevel;
        this.alertLevelMapping = builder.alertLevelMapping;
        this.alertName = builder.alertName;
        this.alertSchemaId = builder.alertSchemaId;
        this.alertTacticId = builder.alertTacticId;
        this.alertThresholdCount = builder.alertThresholdCount;
        this.alertThresholdGroup = builder.alertThresholdGroup;
        this.alertThresholdPeriod = builder.alertThresholdPeriod;
        this.alertType = builder.alertType;
        this.alertTypeMapping = builder.alertTypeMapping;
        this.detectionExpressionContent = builder.detectionExpressionContent;
        this.detectionExpressionType = builder.detectionExpressionType;
        this.detectionRuleDescription = builder.detectionRuleDescription;
        this.detectionRuleName = builder.detectionRuleName;
        this.detectionRuleStatus = builder.detectionRuleStatus;
        this.detectionRuleTemplateId = builder.detectionRuleTemplateId;
        this.detectionRuleTemplateVersion = builder.detectionRuleTemplateVersion;
        this.detectionRuleType = builder.detectionRuleType;
        this.detectionRules = builder.detectionRules;
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
     * @return alertAttCkMapping
     */
    public String getAlertAttCkMapping() {
        return this.alertAttCkMapping;
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
     * @return alertLevelMapping
     */
    public String getAlertLevelMapping() {
        return this.alertLevelMapping;
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
     * @return alertTypeMapping
     */
    public String getAlertTypeMapping() {
        return this.alertTypeMapping;
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
     * @return detectionRules
     */
    public String getDetectionRules() {
        return this.detectionRules;
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
        private String alertAttCkMapping; 
        private String alertDescription; 
        private String alertLevel; 
        private String alertLevelMapping; 
        private String alertName; 
        private String alertSchemaId; 
        private String alertTacticId; 
        private Integer alertThresholdCount; 
        private String alertThresholdGroup; 
        private String alertThresholdPeriod; 
        private String alertType; 
        private String alertTypeMapping; 
        private String detectionExpressionContent; 
        private String detectionExpressionType; 
        private String detectionRuleDescription; 
        private String detectionRuleName; 
        private String detectionRuleStatus; 
        private String detectionRuleTemplateId; 
        private String detectionRuleTemplateVersion; 
        private String detectionRuleType; 
        private String detectionRules; 
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
            this.alertAttCkMapping = request.alertAttCkMapping;
            this.alertDescription = request.alertDescription;
            this.alertLevel = request.alertLevel;
            this.alertLevelMapping = request.alertLevelMapping;
            this.alertName = request.alertName;
            this.alertSchemaId = request.alertSchemaId;
            this.alertTacticId = request.alertTacticId;
            this.alertThresholdCount = request.alertThresholdCount;
            this.alertThresholdGroup = request.alertThresholdGroup;
            this.alertThresholdPeriod = request.alertThresholdPeriod;
            this.alertType = request.alertType;
            this.alertTypeMapping = request.alertTypeMapping;
            this.detectionExpressionContent = request.detectionExpressionContent;
            this.detectionExpressionType = request.detectionExpressionType;
            this.detectionRuleDescription = request.detectionRuleDescription;
            this.detectionRuleName = request.detectionRuleName;
            this.detectionRuleStatus = request.detectionRuleStatus;
            this.detectionRuleTemplateId = request.detectionRuleTemplateId;
            this.detectionRuleTemplateVersion = request.detectionRuleTemplateVersion;
            this.detectionRuleType = request.detectionRuleType;
            this.detectionRules = request.detectionRules;
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
         * <p>The ATT&amp;CK information of the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>Discovery</p>
         */
        public Builder alertAttCk(String alertAttCk) {
            this.putBodyParameter("AlertAttCk", alertAttCk);
            this.alertAttCk = alertAttCk;
            return this;
        }

        /**
         * <p>The MITRE ATT&amp;CK technique mapping.</p>
         */
        public Builder alertAttCkMapping(String alertAttCkMapping) {
            this.putBodyParameter("AlertAttCkMapping", alertAttCkMapping);
            this.alertAttCkMapping = alertAttCkMapping;
            return this;
        }

        /**
         * <p>The alert description. Supports referencing query output fields using $$.</p>
         * 
         * <strong>example:</strong>
         * <p>Alert from: $product_code$, detected network attack from $src_ip$, affected assets include: $dst_ip$</p>
         */
        public Builder alertDescription(String alertDescription) {
            this.putBodyParameter("AlertDescription", alertDescription);
            this.alertDescription = alertDescription;
            return this;
        }

        /**
         * <p>The threat level of the alert. Valid values:</p>
         * <ul>
         * <li>5: critical.</li>
         * <li>4: high.</li>
         * <li>3: medium.</li>
         * <li>2: low.</li>
         * <li>1: informational.</li>
         * </ul>
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
         * <p>The alert level mapping.</p>
         */
        public Builder alertLevelMapping(String alertLevelMapping) {
            this.putBodyParameter("AlertLevelMapping", alertLevelMapping);
            this.alertLevelMapping = alertLevelMapping;
            return this;
        }

        /**
         * <p>The alert name. Supports referencing query output fields using $$.</p>
         * 
         * <strong>example:</strong>
         * <p>Detected high-frequency multi-type network attacks from $src_ip$</p>
         */
        public Builder alertName(String alertName) {
            this.putBodyParameter("AlertName", alertName);
            this.alertName = alertName;
            return this;
        }

        /**
         * <p>The ID of the alert template for the detection rule. Valid values:</p>
         * <ul>
         * <li>ALERT_ACTIVITY: other alerts.</li>
         * <li>EDR_ALERT_ACTIVITY: endpoint detection and response alerts.</li>
         * <li>FIREWALL_ALERT_ACTIVITY: firewall alerts.</li>
         * <li>WAF_ALERT_ACTIVITY: Web Application Firewall alerts.</li>
         * </ul>
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
         * <p>The tactic phase of the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>TA0042</p>
         */
        public Builder alertTacticId(String alertTacticId) {
            this.putBodyParameter("AlertTacticId", alertTacticId);
            this.alertTacticId = alertTacticId;
            return this;
        }

        /**
         * <p>The alert threshold count.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder alertThresholdCount(Integer alertThresholdCount) {
            this.putBodyParameter("AlertThresholdCount", alertThresholdCount);
            this.alertThresholdCount = alertThresholdCount;
            return this;
        }

        /**
         * <p>The list of alert threshold fields, separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>alert_type,ip</p>
         */
        public Builder alertThresholdGroup(String alertThresholdGroup) {
            this.putBodyParameter("AlertThresholdGroup", alertThresholdGroup);
            this.alertThresholdGroup = alertThresholdGroup;
            return this;
        }

        /**
         * <p>The length of the alert threshold period.</p>
         * 
         * <strong>example:</strong>
         * <p>5m</p>
         */
        public Builder alertThresholdPeriod(String alertThresholdPeriod) {
            this.putBodyParameter("AlertThresholdPeriod", alertThresholdPeriod);
            this.alertThresholdPeriod = alertThresholdPeriod;
            return this;
        }

        /**
         * <p>The alert type.</p>
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
         * <p>The alert type mapping.</p>
         */
        public Builder alertTypeMapping(String alertTypeMapping) {
            this.putBodyParameter("AlertTypeMapping", alertTypeMapping);
            this.alertTypeMapping = alertTypeMapping;
            return this;
        }

        /**
         * <p>The expression content of the detection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>*|set session mode=scan;SELECT * FROM log
         * WHERE schema = \&quot;PROCESS_START_ACTIVITY\&quot;
         * AND (
         *     proc_path LIKE \&quot;%/groups\&quot;
         *     OR (
         *         (
         *             proc_path LIKE \&quot;%/cat\&quot;
         *             OR proc_path LIKE \&quot;%/head\&quot;
         *             OR proc_path LIKE \&quot;%/tail\&quot;
         *             OR proc_path LIKE \&quot;%/more\&quot;
         *         )
         *         AND cmdline LIKE \&quot;%/etc/group%\&quot;
         *     )
         * )</p>
         */
        public Builder detectionExpressionContent(String detectionExpressionContent) {
            this.putBodyParameter("DetectionExpressionContent", detectionExpressionContent);
            this.detectionExpressionContent = detectionExpressionContent;
            return this;
        }

        /**
         * <p>The expression type of the detection rule. Valid values:</p>
         * <ul>
         * <li>sql: SQL.</li>
         * <li>playbook: playbook.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sql</p>
         */
        public Builder detectionExpressionType(String detectionExpressionType) {
            this.putBodyParameter("DetectionExpressionType", detectionExpressionType);
            this.detectionExpressionType = detectionExpressionType;
            return this;
        }

        /**
         * <p>The description of the detection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>dr-123</p>
         */
        public Builder detectionRuleDescription(String detectionRuleDescription) {
            this.putBodyParameter("DetectionRuleDescription", detectionRuleDescription);
            this.detectionRuleDescription = detectionRuleDescription;
            return this;
        }

        /**
         * <p>The name of the detection rule.</p>
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
         * <p>The status of the detection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder detectionRuleStatus(String detectionRuleStatus) {
            this.putBodyParameter("DetectionRuleStatus", detectionRuleStatus);
            this.detectionRuleStatus = detectionRuleStatus;
            return this;
        }

        /**
         * <p>The ID of the detection rule template.</p>
         * 
         * <strong>example:</strong>
         * <p>cfw-out-ip_aegis-netstat</p>
         */
        public Builder detectionRuleTemplateId(String detectionRuleTemplateId) {
            this.putBodyParameter("DetectionRuleTemplateId", detectionRuleTemplateId);
            this.detectionRuleTemplateId = detectionRuleTemplateId;
            return this;
        }

        /**
         * <p>The version of the detection rule template.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.0.0</p>
         */
        public Builder detectionRuleTemplateVersion(String detectionRuleTemplateVersion) {
            this.putBodyParameter("DetectionRuleTemplateVersion", detectionRuleTemplateVersion);
            this.detectionRuleTemplateVersion = detectionRuleTemplateVersion;
            return this;
        }

        /**
         * <p>The type of the detection rule. Valid values:</p>
         * <ul>
         * <li>preset: preset detection rule.</li>
         * <li>custom: custom detection rule.</li>
         * <li>custom_template: rule template.</li>
         * </ul>
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
         * <p>The list of detection rule conditions.</p>
         */
        public Builder detectionRules(String detectionRules) {
            this.putBodyParameter("DetectionRules", detectionRules);
            this.detectionRules = detectionRules;
            return this;
        }

        /**
         * <p>The entity mapping configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;NormalizationSchemaId\&quot;:\&quot;host\&quot;,\&quot;NormalizationFieldMappings\&quot;:[{\&quot;NormalizationFieldName\&quot;:\&quot;uuid\&quot;,\&quot;MappingFieldName\&quot;:\&quot;host\&quot;,\&quot;NormalizationFieldType\&quot;:\&quot;varchar\&quot;}]}]</p>
         */
        public Builder entityMappings(String entityMappings) {
            this.putBodyParameter("EntityMappings", entityMappings);
            this.entityMappings = entityMappings;
            return this;
        }

        /**
         * <p>The event aggregation period configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>5m</p>
         */
        public Builder incidentAggregationExpression(String incidentAggregationExpression) {
            this.putBodyParameter("IncidentAggregationExpression", incidentAggregationExpression);
            this.incidentAggregationExpression = incidentAggregationExpression;
            return this;
        }

        /**
         * <p>The event aggregation type. Valid values:</p>
         * <ul>
         * <li>none: no event is generated.</li>
         * <li>graph_compute: graph computing (supported by predefined rules).</li>
         * <li>expert: expert rule.</li>
         * <li>passthrough: alert passthrough (one-to-one).</li>
         * <li>window: same-type aggregation (window).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>window</p>
         */
        public Builder incidentAggregationType(String incidentAggregationType) {
            this.putBodyParameter("IncidentAggregationType", incidentAggregationType);
            this.incidentAggregationType = incidentAggregationType;
            return this;
        }

        /**
         * <p>The language of the response messages. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * <p>Note: This parameter is required in actual API calls. If it is not provided, the service returns a 400 error: &quot;The specified Lang can not be empty.&quot; Pass the language code explicitly.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The ID of the log normalization category.</p>
         * 
         * <strong>example:</strong>
         * <p>NETWORK_CATEGORY</p>
         */
        public Builder logCategoryId(String logCategoryId) {
            this.putBodyParameter("LogCategoryId", logCategoryId);
            this.logCategoryId = logCategoryId;
            return this;
        }

        /**
         * <p>The ID of the log normalization schema.</p>
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
         * <p>The user-defined parameters of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;ip&quot;: {
         *         &quot;ip&quot;: &quot;124.23.<em>.</em>&quot;
         *     }
         * }</p>
         */
        public Builder playbookParameters(String playbookParameters) {
            this.putBodyParameter("PlaybookParameters", playbookParameters);
            this.playbookParameters = playbookParameters;
            return this;
        }

        /**
         * <p>The UUID of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>system_aliyun_clb_process_book</p>
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putBodyParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        /**
         * <p>The region where the data management center of Cloud Threat Detection and Response (CTDR) is located. Select the management center region based on the region where your assets reside. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: Assets are located in the Chinese mainland.</li>
         * <li>ap-southeast-1: Assets are located outside China.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The user ID that the administrator switches to in order to view another member\&quot;s perspective.</p>
         * 
         * <strong>example:</strong>
         * <p>113091674488****</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * <p>The scheduling start time, expressed as a 13-digit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1733269771123</p>
         */
        public Builder scheduleBeginTime(Long scheduleBeginTime) {
            this.putBodyParameter("ScheduleBeginTime", scheduleBeginTime);
            this.scheduleBeginTime = scheduleBeginTime;
            return this;
        }

        /**
         * <p>The scheduling cron expression. Required when ScheduleType is set to cron.</p>
         * 
         * <strong>example:</strong>
         * <p>0/5 * * * *</p>
         */
        public Builder scheduleExpression(String scheduleExpression) {
            this.putBodyParameter("ScheduleExpression", scheduleExpression);
            this.scheduleExpression = scheduleExpression;
            return this;
        }

        /**
         * <p>The maximum number of retries on timeout. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scheduleMaxRetries(Integer scheduleMaxRetries) {
            this.putBodyParameter("ScheduleMaxRetries", scheduleMaxRetries);
            this.scheduleMaxRetries = scheduleMaxRetries;
            return this;
        }

        /**
         * <p>The maximum timeout duration, in seconds. Valid values: 60 to 1800.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder scheduleMaxTimeout(Integer scheduleMaxTimeout) {
            this.putBodyParameter("ScheduleMaxTimeout", scheduleMaxTimeout);
            this.scheduleMaxTimeout = scheduleMaxTimeout;
            return this;
        }

        /**
         * <p>The scheduling type. Valid values:</p>
         * <ul>
         * <li>fixed_rate: fixed interval.</li>
         * <li>cron: cron expression.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>fixed_rate</p>
         */
        public Builder scheduleType(String scheduleType) {
            this.putBodyParameter("ScheduleType", scheduleType);
            this.scheduleType = scheduleType;
            return this;
        }

        /**
         * <p>The length of the scheduling window.</p>
         * 
         * <strong>example:</strong>
         * <p>5m</p>
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
