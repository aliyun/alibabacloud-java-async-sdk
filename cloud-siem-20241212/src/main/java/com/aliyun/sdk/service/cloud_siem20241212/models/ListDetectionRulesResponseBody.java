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
 * {@link ListDetectionRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDetectionRulesResponseBody</p>
 */
public class ListDetectionRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DetectionRules")
    private java.util.List<DetectionRules> detectionRules;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListDetectionRulesResponseBody(Builder builder) {
        this.detectionRules = builder.detectionRules;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDetectionRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return detectionRules
     */
    public java.util.List<DetectionRules> getDetectionRules() {
        return this.detectionRules;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<DetectionRules> detectionRules; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListDetectionRulesResponseBody model) {
            this.detectionRules = model.detectionRules;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * DetectionRules.
         */
        public Builder detectionRules(java.util.List<DetectionRules> detectionRules) {
            this.detectionRules = detectionRules;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDetectionRulesResponseBody build() {
            return new ListDetectionRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDetectionRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDetectionRulesResponseBody</p>
     */
    public static class NormalizationFieldMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MappingFieldName")
        private String mappingFieldName;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldName")
        private String normalizationFieldName;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldType")
        private String normalizationFieldType;

        private NormalizationFieldMappings(Builder builder) {
            this.mappingFieldName = builder.mappingFieldName;
            this.normalizationFieldName = builder.normalizationFieldName;
            this.normalizationFieldType = builder.normalizationFieldType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NormalizationFieldMappings create() {
            return builder().build();
        }

        /**
         * @return mappingFieldName
         */
        public String getMappingFieldName() {
            return this.mappingFieldName;
        }

        /**
         * @return normalizationFieldName
         */
        public String getNormalizationFieldName() {
            return this.normalizationFieldName;
        }

        /**
         * @return normalizationFieldType
         */
        public String getNormalizationFieldType() {
            return this.normalizationFieldType;
        }

        public static final class Builder {
            private String mappingFieldName; 
            private String normalizationFieldName; 
            private String normalizationFieldType; 

            private Builder() {
            } 

            private Builder(NormalizationFieldMappings model) {
                this.mappingFieldName = model.mappingFieldName;
                this.normalizationFieldName = model.normalizationFieldName;
                this.normalizationFieldType = model.normalizationFieldType;
            } 

            /**
             * MappingFieldName.
             */
            public Builder mappingFieldName(String mappingFieldName) {
                this.mappingFieldName = mappingFieldName;
                return this;
            }

            /**
             * NormalizationFieldName.
             */
            public Builder normalizationFieldName(String normalizationFieldName) {
                this.normalizationFieldName = normalizationFieldName;
                return this;
            }

            /**
             * NormalizationFieldType.
             */
            public Builder normalizationFieldType(String normalizationFieldType) {
                this.normalizationFieldType = normalizationFieldType;
                return this;
            }

            public NormalizationFieldMappings build() {
                return new NormalizationFieldMappings(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDetectionRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDetectionRulesResponseBody</p>
     */
    public static class EntityMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NormalizationFieldMappings")
        private java.util.List<NormalizationFieldMappings> normalizationFieldMappings;

        @com.aliyun.core.annotation.NameInMap("NormalizationSchemaId")
        private String normalizationSchemaId;

        private EntityMappings(Builder builder) {
            this.normalizationFieldMappings = builder.normalizationFieldMappings;
            this.normalizationSchemaId = builder.normalizationSchemaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EntityMappings create() {
            return builder().build();
        }

        /**
         * @return normalizationFieldMappings
         */
        public java.util.List<NormalizationFieldMappings> getNormalizationFieldMappings() {
            return this.normalizationFieldMappings;
        }

        /**
         * @return normalizationSchemaId
         */
        public String getNormalizationSchemaId() {
            return this.normalizationSchemaId;
        }

        public static final class Builder {
            private java.util.List<NormalizationFieldMappings> normalizationFieldMappings; 
            private String normalizationSchemaId; 

            private Builder() {
            } 

            private Builder(EntityMappings model) {
                this.normalizationFieldMappings = model.normalizationFieldMappings;
                this.normalizationSchemaId = model.normalizationSchemaId;
            } 

            /**
             * NormalizationFieldMappings.
             */
            public Builder normalizationFieldMappings(java.util.List<NormalizationFieldMappings> normalizationFieldMappings) {
                this.normalizationFieldMappings = normalizationFieldMappings;
                return this;
            }

            /**
             * NormalizationSchemaId.
             */
            public Builder normalizationSchemaId(String normalizationSchemaId) {
                this.normalizationSchemaId = normalizationSchemaId;
                return this;
            }

            public EntityMappings build() {
                return new EntityMappings(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDetectionRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDetectionRulesResponseBody</p>
     */
    public static class Playbook extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("Flow")
        private String flow;

        private Playbook(Builder builder) {
            this.config = builder.config;
            this.flow = builder.flow;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Playbook create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return flow
         */
        public String getFlow() {
            return this.flow;
        }

        public static final class Builder {
            private String config; 
            private String flow; 

            private Builder() {
            } 

            private Builder(Playbook model) {
                this.config = model.config;
                this.flow = model.flow;
            } 

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * Flow.
             */
            public Builder flow(String flow) {
                this.flow = flow;
                return this;
            }

            public Playbook build() {
                return new Playbook(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDetectionRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDetectionRulesResponseBody</p>
     */
    public static class DetectionRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertAttCk")
        private String alertAttCk;

        @com.aliyun.core.annotation.NameInMap("AlertDescription")
        private String alertDescription;

        @com.aliyun.core.annotation.NameInMap("AlertLevel")
        private String alertLevel;

        @com.aliyun.core.annotation.NameInMap("AlertName")
        private String alertName;

        @com.aliyun.core.annotation.NameInMap("AlertSchemaId")
        private String alertSchemaId;

        @com.aliyun.core.annotation.NameInMap("AlertTacticId")
        private String alertTacticId;

        @com.aliyun.core.annotation.NameInMap("AlertThresholdCount")
        private Integer alertThresholdCount;

        @com.aliyun.core.annotation.NameInMap("AlertThresholdGroup")
        private String alertThresholdGroup;

        @com.aliyun.core.annotation.NameInMap("AlertThresholdPeriod")
        private String alertThresholdPeriod;

        @com.aliyun.core.annotation.NameInMap("AlertType")
        private String alertType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DetectionExpressionContent")
        private String detectionExpressionContent;

        @com.aliyun.core.annotation.NameInMap("DetectionExpressionType")
        private String detectionExpressionType;

        @com.aliyun.core.annotation.NameInMap("DetectionRuleDescription")
        private String detectionRuleDescription;

        @com.aliyun.core.annotation.NameInMap("DetectionRuleId")
        private String detectionRuleId;

        @com.aliyun.core.annotation.NameInMap("DetectionRuleName")
        private String detectionRuleName;

        @com.aliyun.core.annotation.NameInMap("DetectionRuleStatus")
        private String detectionRuleStatus;

        @com.aliyun.core.annotation.NameInMap("DetectionRuleType")
        private String detectionRuleType;

        @com.aliyun.core.annotation.NameInMap("EntityMappings")
        private java.util.List<EntityMappings> entityMappings;

        @com.aliyun.core.annotation.NameInMap("IncidentAggregationExpression")
        private String incidentAggregationExpression;

        @com.aliyun.core.annotation.NameInMap("IncidentAggregationType")
        private String incidentAggregationType;

        @com.aliyun.core.annotation.NameInMap("LogCategoryId")
        private String logCategoryId;

        @com.aliyun.core.annotation.NameInMap("LogSchemaId")
        private String logSchemaId;

        @com.aliyun.core.annotation.NameInMap("Playbook")
        private Playbook playbook;

        @com.aliyun.core.annotation.NameInMap("PlaybookParameters")
        private String playbookParameters;

        @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
        private String playbookUuid;

        @com.aliyun.core.annotation.NameInMap("ScheduleBeginTime")
        private Long scheduleBeginTime;

        @com.aliyun.core.annotation.NameInMap("ScheduleExpression")
        private String scheduleExpression;

        @com.aliyun.core.annotation.NameInMap("ScheduleMaxRetries")
        private Integer scheduleMaxRetries;

        @com.aliyun.core.annotation.NameInMap("ScheduleMaxTimeout")
        private Integer scheduleMaxTimeout;

        @com.aliyun.core.annotation.NameInMap("ScheduleType")
        private String scheduleType;

        @com.aliyun.core.annotation.NameInMap("ScheduleWindow")
        private String scheduleWindow;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private DetectionRules(Builder builder) {
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
            this.createTime = builder.createTime;
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
            this.logCategoryId = builder.logCategoryId;
            this.logSchemaId = builder.logSchemaId;
            this.playbook = builder.playbook;
            this.playbookParameters = builder.playbookParameters;
            this.playbookUuid = builder.playbookUuid;
            this.scheduleBeginTime = builder.scheduleBeginTime;
            this.scheduleExpression = builder.scheduleExpression;
            this.scheduleMaxRetries = builder.scheduleMaxRetries;
            this.scheduleMaxTimeout = builder.scheduleMaxTimeout;
            this.scheduleType = builder.scheduleType;
            this.scheduleWindow = builder.scheduleWindow;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetectionRules create() {
            return builder().build();
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
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
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
        public java.util.List<EntityMappings> getEntityMappings() {
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
         * @return playbook
         */
        public Playbook getPlaybook() {
            return this.playbook;
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

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
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
            private Long createTime; 
            private String detectionExpressionContent; 
            private String detectionExpressionType; 
            private String detectionRuleDescription; 
            private String detectionRuleId; 
            private String detectionRuleName; 
            private String detectionRuleStatus; 
            private String detectionRuleType; 
            private java.util.List<EntityMappings> entityMappings; 
            private String incidentAggregationExpression; 
            private String incidentAggregationType; 
            private String logCategoryId; 
            private String logSchemaId; 
            private Playbook playbook; 
            private String playbookParameters; 
            private String playbookUuid; 
            private Long scheduleBeginTime; 
            private String scheduleExpression; 
            private Integer scheduleMaxRetries; 
            private Integer scheduleMaxTimeout; 
            private String scheduleType; 
            private String scheduleWindow; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(DetectionRules model) {
                this.alertAttCk = model.alertAttCk;
                this.alertDescription = model.alertDescription;
                this.alertLevel = model.alertLevel;
                this.alertName = model.alertName;
                this.alertSchemaId = model.alertSchemaId;
                this.alertTacticId = model.alertTacticId;
                this.alertThresholdCount = model.alertThresholdCount;
                this.alertThresholdGroup = model.alertThresholdGroup;
                this.alertThresholdPeriod = model.alertThresholdPeriod;
                this.alertType = model.alertType;
                this.createTime = model.createTime;
                this.detectionExpressionContent = model.detectionExpressionContent;
                this.detectionExpressionType = model.detectionExpressionType;
                this.detectionRuleDescription = model.detectionRuleDescription;
                this.detectionRuleId = model.detectionRuleId;
                this.detectionRuleName = model.detectionRuleName;
                this.detectionRuleStatus = model.detectionRuleStatus;
                this.detectionRuleType = model.detectionRuleType;
                this.entityMappings = model.entityMappings;
                this.incidentAggregationExpression = model.incidentAggregationExpression;
                this.incidentAggregationType = model.incidentAggregationType;
                this.logCategoryId = model.logCategoryId;
                this.logSchemaId = model.logSchemaId;
                this.playbook = model.playbook;
                this.playbookParameters = model.playbookParameters;
                this.playbookUuid = model.playbookUuid;
                this.scheduleBeginTime = model.scheduleBeginTime;
                this.scheduleExpression = model.scheduleExpression;
                this.scheduleMaxRetries = model.scheduleMaxRetries;
                this.scheduleMaxTimeout = model.scheduleMaxTimeout;
                this.scheduleType = model.scheduleType;
                this.scheduleWindow = model.scheduleWindow;
                this.updateTime = model.updateTime;
            } 

            /**
             * AlertAttCk.
             */
            public Builder alertAttCk(String alertAttCk) {
                this.alertAttCk = alertAttCk;
                return this;
            }

            /**
             * AlertDescription.
             */
            public Builder alertDescription(String alertDescription) {
                this.alertDescription = alertDescription;
                return this;
            }

            /**
             * AlertLevel.
             */
            public Builder alertLevel(String alertLevel) {
                this.alertLevel = alertLevel;
                return this;
            }

            /**
             * AlertName.
             */
            public Builder alertName(String alertName) {
                this.alertName = alertName;
                return this;
            }

            /**
             * AlertSchemaId.
             */
            public Builder alertSchemaId(String alertSchemaId) {
                this.alertSchemaId = alertSchemaId;
                return this;
            }

            /**
             * AlertTacticId.
             */
            public Builder alertTacticId(String alertTacticId) {
                this.alertTacticId = alertTacticId;
                return this;
            }

            /**
             * AlertThresholdCount.
             */
            public Builder alertThresholdCount(Integer alertThresholdCount) {
                this.alertThresholdCount = alertThresholdCount;
                return this;
            }

            /**
             * AlertThresholdGroup.
             */
            public Builder alertThresholdGroup(String alertThresholdGroup) {
                this.alertThresholdGroup = alertThresholdGroup;
                return this;
            }

            /**
             * AlertThresholdPeriod.
             */
            public Builder alertThresholdPeriod(String alertThresholdPeriod) {
                this.alertThresholdPeriod = alertThresholdPeriod;
                return this;
            }

            /**
             * AlertType.
             */
            public Builder alertType(String alertType) {
                this.alertType = alertType;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DetectionExpressionContent.
             */
            public Builder detectionExpressionContent(String detectionExpressionContent) {
                this.detectionExpressionContent = detectionExpressionContent;
                return this;
            }

            /**
             * DetectionExpressionType.
             */
            public Builder detectionExpressionType(String detectionExpressionType) {
                this.detectionExpressionType = detectionExpressionType;
                return this;
            }

            /**
             * DetectionRuleDescription.
             */
            public Builder detectionRuleDescription(String detectionRuleDescription) {
                this.detectionRuleDescription = detectionRuleDescription;
                return this;
            }

            /**
             * DetectionRuleId.
             */
            public Builder detectionRuleId(String detectionRuleId) {
                this.detectionRuleId = detectionRuleId;
                return this;
            }

            /**
             * DetectionRuleName.
             */
            public Builder detectionRuleName(String detectionRuleName) {
                this.detectionRuleName = detectionRuleName;
                return this;
            }

            /**
             * DetectionRuleStatus.
             */
            public Builder detectionRuleStatus(String detectionRuleStatus) {
                this.detectionRuleStatus = detectionRuleStatus;
                return this;
            }

            /**
             * DetectionRuleType.
             */
            public Builder detectionRuleType(String detectionRuleType) {
                this.detectionRuleType = detectionRuleType;
                return this;
            }

            /**
             * EntityMappings.
             */
            public Builder entityMappings(java.util.List<EntityMappings> entityMappings) {
                this.entityMappings = entityMappings;
                return this;
            }

            /**
             * IncidentAggregationExpression.
             */
            public Builder incidentAggregationExpression(String incidentAggregationExpression) {
                this.incidentAggregationExpression = incidentAggregationExpression;
                return this;
            }

            /**
             * IncidentAggregationType.
             */
            public Builder incidentAggregationType(String incidentAggregationType) {
                this.incidentAggregationType = incidentAggregationType;
                return this;
            }

            /**
             * LogCategoryId.
             */
            public Builder logCategoryId(String logCategoryId) {
                this.logCategoryId = logCategoryId;
                return this;
            }

            /**
             * LogSchemaId.
             */
            public Builder logSchemaId(String logSchemaId) {
                this.logSchemaId = logSchemaId;
                return this;
            }

            /**
             * Playbook.
             */
            public Builder playbook(Playbook playbook) {
                this.playbook = playbook;
                return this;
            }

            /**
             * PlaybookParameters.
             */
            public Builder playbookParameters(String playbookParameters) {
                this.playbookParameters = playbookParameters;
                return this;
            }

            /**
             * PlaybookUuid.
             */
            public Builder playbookUuid(String playbookUuid) {
                this.playbookUuid = playbookUuid;
                return this;
            }

            /**
             * ScheduleBeginTime.
             */
            public Builder scheduleBeginTime(Long scheduleBeginTime) {
                this.scheduleBeginTime = scheduleBeginTime;
                return this;
            }

            /**
             * ScheduleExpression.
             */
            public Builder scheduleExpression(String scheduleExpression) {
                this.scheduleExpression = scheduleExpression;
                return this;
            }

            /**
             * ScheduleMaxRetries.
             */
            public Builder scheduleMaxRetries(Integer scheduleMaxRetries) {
                this.scheduleMaxRetries = scheduleMaxRetries;
                return this;
            }

            /**
             * ScheduleMaxTimeout.
             */
            public Builder scheduleMaxTimeout(Integer scheduleMaxTimeout) {
                this.scheduleMaxTimeout = scheduleMaxTimeout;
                return this;
            }

            /**
             * ScheduleType.
             */
            public Builder scheduleType(String scheduleType) {
                this.scheduleType = scheduleType;
                return this;
            }

            /**
             * ScheduleWindow.
             */
            public Builder scheduleWindow(String scheduleWindow) {
                this.scheduleWindow = scheduleWindow;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public DetectionRules build() {
                return new DetectionRules(this);
            } 

        } 

    }
}
