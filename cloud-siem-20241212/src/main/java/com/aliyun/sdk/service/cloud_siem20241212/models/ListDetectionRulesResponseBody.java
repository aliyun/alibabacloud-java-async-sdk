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
         * <p>The list of detection rules.</p>
         */
        public Builder detectionRules(java.util.List<DetectionRules> detectionRules) {
            this.detectionRules = detectionRules;
            return this;
        }

        /**
         * <p>The maximum number of entries to return in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number of the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>508DCFFD-4508-54BF-A8A0-E97A0FA6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
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
             * <p>The mapping field.</p>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
             */
            public Builder mappingFieldName(String mappingFieldName) {
                this.mappingFieldName = mappingFieldName;
                return this;
            }

            /**
             * <p>The normalized entity field.</p>
             * 
             * <strong>example:</strong>
             * <p>src_ip</p>
             */
            public Builder normalizationFieldName(String normalizationFieldName) {
                this.normalizationFieldName = normalizationFieldName;
                return this;
            }

            /**
             * <p>The data type of the normalized entity field.</p>
             * 
             * <strong>example:</strong>
             * <p>vachar</p>
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
             * <p>The entity mapping configuration.</p>
             */
            public Builder normalizationFieldMappings(java.util.List<NormalizationFieldMappings> normalizationFieldMappings) {
                this.normalizationFieldMappings = normalizationFieldMappings;
                return this;
            }

            /**
             * <p>The entity type ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
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
             * <p>The input parameter configuration for invoking the playbook.</p>
             * 
             * <strong>example:</strong>
             * <p>[
             *     {
             *         &quot;name&quot;: &quot;expireDay&quot;,
             *         &quot;dataType&quot;: &quot;Integer&quot;,
             *         &quot;required&quot;: true,
             *         &quot;isArray&quot;: false,
             *         &quot;example&quot;: &quot;7&quot;,
             *         &quot;description&quot;: &quot;desc&quot;,
             *         &quot;typeName&quot;: &quot;Integer&quot;,
             *         &quot;dataClass&quot;: &quot;normal&quot;,
             *         &quot;stanchDefaultValue&quot;: &quot;7&quot;
             *     }
             * ]</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The flow configuration of the playbook.</p>
             * 
             * <strong>example:</strong>
             * <p>[
             *     {
             *         &quot;id&quot;: &quot;EndEvent_1fqpq4h&quot;,
             *         &quot;zIndex&quot;: 1,
             *         &quot;data&quot;: {
             *             &quot;nodeType&quot;: &quot;endEvent&quot;,
             *             &quot;appType&quot;: &quot;basic&quot;,
             *             &quot;valueData&quot;: {</p>
             * <pre><code>        },
             *         &quot;icon&quot;: &quot;icon-radio-off-full&quot;
             *     },
             *     &quot;position&quot;: {
             *         &quot;x&quot;: 1369,
             *         &quot;y&quot;: 174
             *     }
             * }
             * </code></pre>
             * <p>]</p>
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

        @com.aliyun.core.annotation.NameInMap("AlertAttCkMapping")
        private String alertAttCkMapping;

        @com.aliyun.core.annotation.NameInMap("AlertDescription")
        private String alertDescription;

        @com.aliyun.core.annotation.NameInMap("AlertLevel")
        private String alertLevel;

        @com.aliyun.core.annotation.NameInMap("AlertLevelMapping")
        private String alertLevelMapping;

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

        @com.aliyun.core.annotation.NameInMap("AlertTypeMapping")
        private String alertTypeMapping;

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
                this.alertAttCkMapping = model.alertAttCkMapping;
                this.alertDescription = model.alertDescription;
                this.alertLevel = model.alertLevel;
                this.alertLevelMapping = model.alertLevelMapping;
                this.alertName = model.alertName;
                this.alertSchemaId = model.alertSchemaId;
                this.alertTacticId = model.alertTacticId;
                this.alertThresholdCount = model.alertThresholdCount;
                this.alertThresholdGroup = model.alertThresholdGroup;
                this.alertThresholdPeriod = model.alertThresholdPeriod;
                this.alertType = model.alertType;
                this.alertTypeMapping = model.alertTypeMapping;
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
             * <p>The alert ATT&amp;CK technique.</p>
             * 
             * <strong>example:</strong>
             * <p>Discovery</p>
             */
            public Builder alertAttCk(String alertAttCk) {
                this.alertAttCk = alertAttCk;
                return this;
            }

            /**
             * <p>The ATT&amp;CK technique mapping.</p>
             */
            public Builder alertAttCkMapping(String alertAttCkMapping) {
                this.alertAttCkMapping = alertAttCkMapping;
                return this;
            }

            /**
             * <p>The alert description. You can use $$ to reference query output fields.</p>
             * 
             * <strong>example:</strong>
             * <p>Alert from: $product_code$, detected network attack from $src_ip$, affected assets include: $dst_ip$</p>
             */
            public Builder alertDescription(String alertDescription) {
                this.alertDescription = alertDescription;
                return this;
            }

            /**
             * <p>The threat level of the alert. Valid values:</p>
             * <ul>
             * <li>5: Critical.</li>
             * <li>4: High.</li>
             * <li>3: Medium.</li>
             * <li>2: Low.</li>
             * <li>1: Informational.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder alertLevel(String alertLevel) {
                this.alertLevel = alertLevel;
                return this;
            }

            /**
             * <p>The alert level mapping.</p>
             */
            public Builder alertLevelMapping(String alertLevelMapping) {
                this.alertLevelMapping = alertLevelMapping;
                return this;
            }

            /**
             * <p>The alert name. You can use $$ to reference query output fields.</p>
             * 
             * <strong>example:</strong>
             * <p>Detected high-frequency multi-type network attacks from $src_ip$</p>
             */
            public Builder alertName(String alertName) {
                this.alertName = alertName;
                return this;
            }

            /**
             * <p>The alert template ID of the detection rule. Valid values:</p>
             * <ul>
             * <li>ALERT_ACTIVITY: other alerts.</li>
             * <li>EDR_ALERT_ACTIVITY: endpoint detection and response alerts.</li>
             * <li>FIREWALL_ALERT_ACTIVITY: firewall alerts.</li>
             * <li>WAF_ALERT_ACTIVITY: web application firewall alerts.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALERT_ACTIVITY</p>
             */
            public Builder alertSchemaId(String alertSchemaId) {
                this.alertSchemaId = alertSchemaId;
                return this;
            }

            /**
             * <p>The alert tactic phase.</p>
             * 
             * <strong>example:</strong>
             * <p>TA0042</p>
             */
            public Builder alertTacticId(String alertTacticId) {
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
                this.alertThresholdGroup = alertThresholdGroup;
                return this;
            }

            /**
             * <p>The alert threshold period length.</p>
             * 
             * <strong>example:</strong>
             * <p>5m</p>
             */
            public Builder alertThresholdPeriod(String alertThresholdPeriod) {
                this.alertThresholdPeriod = alertThresholdPeriod;
                return this;
            }

            /**
             * <p>The alerting type.</p>
             * 
             * <strong>example:</strong>
             * <p>WebShell</p>
             */
            public Builder alertType(String alertType) {
                this.alertType = alertType;
                return this;
            }

            /**
             * <p>The alerting type mapping.</p>
             */
            public Builder alertTypeMapping(String alertTypeMapping) {
                this.alertTypeMapping = alertTypeMapping;
                return this;
            }

            /**
             * <p>The creation time. Format: YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-21 13:47:01</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
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
                this.detectionExpressionContent = detectionExpressionContent;
                return this;
            }

            /**
             * <p>The expression content of the detection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>playbook</p>
             */
            public Builder detectionExpressionType(String detectionExpressionType) {
                this.detectionExpressionType = detectionExpressionType;
                return this;
            }

            /**
             * <p>The description of the detection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Check the enumeration behavior of local system groups. An attacker may attempt to find the Local Systems group and its permission settings.</p>
             */
            public Builder detectionRuleDescription(String detectionRuleDescription) {
                this.detectionRuleDescription = detectionRuleDescription;
                return this;
            }

            /**
             * <p>The ID of the detection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>jndi-attack-success_http_netstat</p>
             */
            public Builder detectionRuleId(String detectionRuleId) {
                this.detectionRuleId = detectionRuleId;
                return this;
            }

            /**
             * <p>The name of the detection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Detect Discovery Behavior for Local Systems Groups</p>
             */
            public Builder detectionRuleName(String detectionRuleName) {
                this.detectionRuleName = detectionRuleName;
                return this;
            }

            /**
             * <p>The status of the detection rule. Valid values:</p>
             * <ul>
             * <li>enabled: Enabled.</li>
             * <li>disabled: Disabled.</li>
             * <li>testing: Testing.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder detectionRuleStatus(String detectionRuleStatus) {
                this.detectionRuleStatus = detectionRuleStatus;
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
                this.detectionRuleType = detectionRuleType;
                return this;
            }

            /**
             * <p>The entity mapping configuration.</p>
             */
            public Builder entityMappings(java.util.List<EntityMappings> entityMappings) {
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
                this.incidentAggregationExpression = incidentAggregationExpression;
                return this;
            }

            /**
             * <p>The event aggregation type. Valid values:</p>
             * <ul>
             * <li>none: No event is generated.</li>
             * <li>graph_compute: Graph computing (supported by predefined rules).</li>
             * <li>expert: Expert rule.</li>
             * <li>passthrough: Alerting pass-through (one-to-one).</li>
             * <li>window: Same-type aggregation (window).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>passthrough</p>
             */
            public Builder incidentAggregationType(String incidentAggregationType) {
                this.incidentAggregationType = incidentAggregationType;
                return this;
            }

            /**
             * <p>The ID of the log normalization category.</p>
             * 
             * <strong>example:</strong>
             * <p>NETWORK_CATEGORY</p>
             */
            public Builder logCategoryId(String logCategoryId) {
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
                this.logSchemaId = logSchemaId;
                return this;
            }

            /**
             * <p>The XML configuration of the playbook.</p>
             */
            public Builder playbook(Playbook playbook) {
                this.playbook = playbook;
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
                this.playbookParameters = playbookParameters;
                return this;
            }

            /**
             * <p>The playbook UUID.</p>
             * 
             * <strong>example:</strong>
             * <p>dde983ed-eb56-45ea-ac2e-3b12b2a9****</p>
             */
            public Builder playbookUuid(String playbookUuid) {
                this.playbookUuid = playbookUuid;
                return this;
            }

            /**
             * <p>The scheduling start time (13-digit timestamp).</p>
             * 
             * <strong>example:</strong>
             * <p>1733269771123</p>
             */
            public Builder scheduleBeginTime(Long scheduleBeginTime) {
                this.scheduleBeginTime = scheduleBeginTime;
                return this;
            }

            /**
             * <p>The scheduling cron expression. This parameter is required when ScheduleType is set to cron.</p>
             * 
             * <strong>example:</strong>
             * <p>5m</p>
             */
            public Builder scheduleExpression(String scheduleExpression) {
                this.scheduleExpression = scheduleExpression;
                return this;
            }

            /**
             * <p>The maximum number of retries upon timeout. Valid values: 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder scheduleMaxRetries(Integer scheduleMaxRetries) {
                this.scheduleMaxRetries = scheduleMaxRetries;
                return this;
            }

            /**
             * <p>The maximum timeout period, in seconds. Valid values: 60 to 1800.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder scheduleMaxTimeout(Integer scheduleMaxTimeout) {
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
                this.scheduleType = scheduleType;
                return this;
            }

            /**
             * <p>The scheduling window length.</p>
             * 
             * <strong>example:</strong>
             * <p>5m</p>
             */
            public Builder scheduleWindow(String scheduleWindow) {
                this.scheduleWindow = scheduleWindow;
                return this;
            }

            /**
             * <p>The update time. Format: YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-16 10:51:00</p>
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
