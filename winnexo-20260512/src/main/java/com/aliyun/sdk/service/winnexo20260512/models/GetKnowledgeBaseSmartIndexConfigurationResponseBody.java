// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link GetKnowledgeBaseSmartIndexConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>GetKnowledgeBaseSmartIndexConfigurationResponseBody</p>
 */
public class GetKnowledgeBaseSmartIndexConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("artifacts")
    private Artifacts artifacts;

    @com.aliyun.core.annotation.NameInMap("billingId")
    private String billingId;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("directoryId")
    private String directoryId;

    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("lastError")
    private String lastError;

    @com.aliyun.core.annotation.NameInMap("lastSuccessTaskId")
    private String lastSuccessTaskId;

    @com.aliyun.core.annotation.NameInMap("lifecycle")
    private String lifecycle;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("revision")
    private Long revision;

    @com.aliyun.core.annotation.NameInMap("schedule")
    private Schedule schedule;

    @com.aliyun.core.annotation.NameInMap("targetDirId")
    private String targetDirId;

    @com.aliyun.core.annotation.NameInMap("task")
    private Task task;

    private GetKnowledgeBaseSmartIndexConfigurationResponseBody(Builder builder) {
        this.artifacts = builder.artifacts;
        this.billingId = builder.billingId;
        this.code = builder.code;
        this.directoryId = builder.directoryId;
        this.enabled = builder.enabled;
        this.lastError = builder.lastError;
        this.lastSuccessTaskId = builder.lastSuccessTaskId;
        this.lifecycle = builder.lifecycle;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.revision = builder.revision;
        this.schedule = builder.schedule;
        this.targetDirId = builder.targetDirId;
        this.task = builder.task;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKnowledgeBaseSmartIndexConfigurationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return artifacts
     */
    public Artifacts getArtifacts() {
        return this.artifacts;
    }

    /**
     * @return billingId
     */
    public String getBillingId() {
        return this.billingId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return lastError
     */
    public String getLastError() {
        return this.lastError;
    }

    /**
     * @return lastSuccessTaskId
     */
    public String getLastSuccessTaskId() {
        return this.lastSuccessTaskId;
    }

    /**
     * @return lifecycle
     */
    public String getLifecycle() {
        return this.lifecycle;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return revision
     */
    public Long getRevision() {
        return this.revision;
    }

    /**
     * @return schedule
     */
    public Schedule getSchedule() {
        return this.schedule;
    }

    /**
     * @return targetDirId
     */
    public String getTargetDirId() {
        return this.targetDirId;
    }

    /**
     * @return task
     */
    public Task getTask() {
        return this.task;
    }

    public static final class Builder {
        private Artifacts artifacts; 
        private String billingId; 
        private String code; 
        private String directoryId; 
        private Boolean enabled; 
        private String lastError; 
        private String lastSuccessTaskId; 
        private String lifecycle; 
        private String message; 
        private String requestId; 
        private Long revision; 
        private Schedule schedule; 
        private String targetDirId; 
        private Task task; 

        private Builder() {
        } 

        private Builder(GetKnowledgeBaseSmartIndexConfigurationResponseBody model) {
            this.artifacts = model.artifacts;
            this.billingId = model.billingId;
            this.code = model.code;
            this.directoryId = model.directoryId;
            this.enabled = model.enabled;
            this.lastError = model.lastError;
            this.lastSuccessTaskId = model.lastSuccessTaskId;
            this.lifecycle = model.lifecycle;
            this.message = model.message;
            this.requestId = model.requestId;
            this.revision = model.revision;
            this.schedule = model.schedule;
            this.targetDirId = model.targetDirId;
            this.task = model.task;
        } 

        /**
         * <p>已发布产物引用</p>
         */
        public Builder artifacts(Artifacts artifacts) {
            this.artifacts = artifacts;
            return this;
        }

        /**
         * <p>当前或最近任务账单标识</p>
         * 
         * <strong>example:</strong>
         * <p>billing-example</p>
         */
        public Builder billingId(String billingId) {
            this.billingId = billingId;
            return this;
        }

        /**
         * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>企业知识库根目录业务 ID</p>
         * 
         * <strong>example:</strong>
         * <p>kb-example</p>
         */
        public Builder directoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>是否开启 LLM Wiki 智能索引</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>最近一次配置或扫描错误</p>
         * 
         * <strong>example:</strong>
         * <p>自动扫描失败</p>
         */
        public Builder lastError(String lastError) {
            this.lastError = lastError;
            return this;
        }

        /**
         * <p>最近成功任务标识</p>
         * 
         * <strong>example:</strong>
         * <p>0123456789abcdef0123456789abcdef</p>
         */
        public Builder lastSuccessTaskId(String lastSuccessTaskId) {
            this.lastSuccessTaskId = lastSuccessTaskId;
            return this;
        }

        /**
         * <p>配置生命周期：DISABLED、ENABLED 或 DISABLING</p>
         * 
         * <strong>example:</strong>
         * <p>ENABLED</p>
         */
        public Builder lifecycle(String lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * <p>错误描述，成功时为 success</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>请求追踪 ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>配置版本；更新时作为 expectedRevision 提交</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder revision(Long revision) {
            this.revision = revision;
            return this;
        }

        /**
         * <p>自动执行计划</p>
         */
        public Builder schedule(Schedule schedule) {
            this.schedule = schedule;
            return this;
        }

        /**
         * <p>智能索引产物目录业务 ID</p>
         * 
         * <strong>example:</strong>
         * <p>kb-artifacts-example</p>
         */
        public Builder targetDirId(String targetDirId) {
            this.targetDirId = targetDirId;
            return this;
        }

        /**
         * <p>当前或最近任务状态</p>
         */
        public Builder task(Task task) {
            this.task = task;
            return this;
        }

        public GetKnowledgeBaseSmartIndexConfigurationResponseBody build() {
            return new GetKnowledgeBaseSmartIndexConfigurationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetKnowledgeBaseSmartIndexConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgeBaseSmartIndexConfigurationResponseBody</p>
     */
    public static class KnowledgeInsights extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("sourceId")
        private String sourceId;

        private KnowledgeInsights(Builder builder) {
            this.sourceId = builder.sourceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KnowledgeInsights create() {
            return builder().build();
        }

        /**
         * @return sourceId
         */
        public String getSourceId() {
            return this.sourceId;
        }

        public static final class Builder {
            private String sourceId; 

            private Builder() {
            } 

            private Builder(KnowledgeInsights model) {
                this.sourceId = model.sourceId;
            } 

            /**
             * <p>产物资源业务 ID</p>
             * 
             * <strong>example:</strong>
             * <p>2001187</p>
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            public KnowledgeInsights build() {
                return new KnowledgeInsights(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetKnowledgeBaseSmartIndexConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgeBaseSmartIndexConfigurationResponseBody</p>
     */
    public static class TopicCards extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("directoryId")
        private String directoryId;

        private TopicCards(Builder builder) {
            this.directoryId = builder.directoryId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopicCards create() {
            return builder().build();
        }

        /**
         * @return directoryId
         */
        public String getDirectoryId() {
            return this.directoryId;
        }

        public static final class Builder {
            private String directoryId; 

            private Builder() {
            } 

            private Builder(TopicCards model) {
                this.directoryId = model.directoryId;
            } 

            /**
             * <p>产物目录业务 ID</p>
             * 
             * <strong>example:</strong>
             * <p>kb-topic-cards-example</p>
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            public TopicCards build() {
                return new TopicCards(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetKnowledgeBaseSmartIndexConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgeBaseSmartIndexConfigurationResponseBody</p>
     */
    public static class TopicGraph extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("sourceId")
        private String sourceId;

        private TopicGraph(Builder builder) {
            this.sourceId = builder.sourceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopicGraph create() {
            return builder().build();
        }

        /**
         * @return sourceId
         */
        public String getSourceId() {
            return this.sourceId;
        }

        public static final class Builder {
            private String sourceId; 

            private Builder() {
            } 

            private Builder(TopicGraph model) {
                this.sourceId = model.sourceId;
            } 

            /**
             * <p>产物资源业务 ID</p>
             * 
             * <strong>example:</strong>
             * <p>2001085</p>
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            public TopicGraph build() {
                return new TopicGraph(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetKnowledgeBaseSmartIndexConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgeBaseSmartIndexConfigurationResponseBody</p>
     */
    public static class TopicOverview extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("sourceId")
        private String sourceId;

        private TopicOverview(Builder builder) {
            this.sourceId = builder.sourceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopicOverview create() {
            return builder().build();
        }

        /**
         * @return sourceId
         */
        public String getSourceId() {
            return this.sourceId;
        }

        public static final class Builder {
            private String sourceId; 

            private Builder() {
            } 

            private Builder(TopicOverview model) {
                this.sourceId = model.sourceId;
            } 

            /**
             * <p>产物资源业务 ID</p>
             * 
             * <strong>example:</strong>
             * <p>2001186</p>
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            public TopicOverview build() {
                return new TopicOverview(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetKnowledgeBaseSmartIndexConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgeBaseSmartIndexConfigurationResponseBody</p>
     */
    public static class Artifacts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("knowledgeInsights")
        private KnowledgeInsights knowledgeInsights;

        @com.aliyun.core.annotation.NameInMap("topicCards")
        private TopicCards topicCards;

        @com.aliyun.core.annotation.NameInMap("topicGraph")
        private TopicGraph topicGraph;

        @com.aliyun.core.annotation.NameInMap("topicOverview")
        private TopicOverview topicOverview;

        private Artifacts(Builder builder) {
            this.knowledgeInsights = builder.knowledgeInsights;
            this.topicCards = builder.topicCards;
            this.topicGraph = builder.topicGraph;
            this.topicOverview = builder.topicOverview;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Artifacts create() {
            return builder().build();
        }

        /**
         * @return knowledgeInsights
         */
        public KnowledgeInsights getKnowledgeInsights() {
            return this.knowledgeInsights;
        }

        /**
         * @return topicCards
         */
        public TopicCards getTopicCards() {
            return this.topicCards;
        }

        /**
         * @return topicGraph
         */
        public TopicGraph getTopicGraph() {
            return this.topicGraph;
        }

        /**
         * @return topicOverview
         */
        public TopicOverview getTopicOverview() {
            return this.topicOverview;
        }

        public static final class Builder {
            private KnowledgeInsights knowledgeInsights; 
            private TopicCards topicCards; 
            private TopicGraph topicGraph; 
            private TopicOverview topicOverview; 

            private Builder() {
            } 

            private Builder(Artifacts model) {
                this.knowledgeInsights = model.knowledgeInsights;
                this.topicCards = model.topicCards;
                this.topicGraph = model.topicGraph;
                this.topicOverview = model.topicOverview;
            } 

            /**
             * <p>知识洞察</p>
             */
            public Builder knowledgeInsights(KnowledgeInsights knowledgeInsights) {
                this.knowledgeInsights = knowledgeInsights;
                return this;
            }

            /**
             * <p>主题卡片目录</p>
             */
            public Builder topicCards(TopicCards topicCards) {
                this.topicCards = topicCards;
                return this;
            }

            /**
             * <p>主题关系图</p>
             */
            public Builder topicGraph(TopicGraph topicGraph) {
                this.topicGraph = topicGraph;
                return this;
            }

            /**
             * <p>主题概览</p>
             */
            public Builder topicOverview(TopicOverview topicOverview) {
                this.topicOverview = topicOverview;
                return this;
            }

            public Artifacts build() {
                return new Artifacts(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetKnowledgeBaseSmartIndexConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgeBaseSmartIndexConfigurationResponseBody</p>
     */
    public static class Schedule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("nextRunAt")
        private String nextRunAt;

        @com.aliyun.core.annotation.NameInMap("timezone")
        private String timezone;

        private Schedule(Builder builder) {
            this.cronExpression = builder.cronExpression;
            this.nextRunAt = builder.nextRunAt;
            this.timezone = builder.timezone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Schedule create() {
            return builder().build();
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
        }

        /**
         * @return nextRunAt
         */
        public String getNextRunAt() {
            return this.nextRunAt;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
        }

        public static final class Builder {
            private String cronExpression; 
            private String nextRunAt; 
            private String timezone; 

            private Builder() {
            } 

            private Builder(Schedule model) {
                this.cronExpression = model.cronExpression;
                this.nextRunAt = model.nextRunAt;
                this.timezone = model.timezone;
            } 

            /**
             * <p>Cron 表达式；空表示手动执行</p>
             * 
             * <strong>example:</strong>
             * <p>0 2 * * *</p>
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * <p>下次计划执行时间，ISO 8601 格式</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-19T02:00:00+08:00</p>
             */
            public Builder nextRunAt(String nextRunAt) {
                this.nextRunAt = nextRunAt;
                return this;
            }

            /**
             * <p>计划使用的 IANA 时区</p>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            public Schedule build() {
                return new Schedule(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetKnowledgeBaseSmartIndexConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgeBaseSmartIndexConfigurationResponseBody</p>
     */
    public static class Task extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("billingId")
        private String billingId;

        @com.aliyun.core.annotation.NameInMap("billingStatus")
        private String billingStatus;

        @com.aliyun.core.annotation.NameInMap("executionStatus")
        private String executionStatus;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("lastError")
        private String lastError;

        @com.aliyun.core.annotation.NameInMap("operation")
        private String operation;

        @com.aliyun.core.annotation.NameInMap("progress")
        private Long progress;

        @com.aliyun.core.annotation.NameInMap("reportStatus")
        private String reportStatus;

        @com.aliyun.core.annotation.NameInMap("reused")
        private Boolean reused;

        @com.aliyun.core.annotation.NameInMap("taskKey")
        private String taskKey;

        @com.aliyun.core.annotation.NameInMap("triggerType")
        private String triggerType;

        @com.aliyun.core.annotation.NameInMap("usageComplete")
        private Boolean usageComplete;

        private Task(Builder builder) {
            this.billingId = builder.billingId;
            this.billingStatus = builder.billingStatus;
            this.executionStatus = builder.executionStatus;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.lastError = builder.lastError;
            this.operation = builder.operation;
            this.progress = builder.progress;
            this.reportStatus = builder.reportStatus;
            this.reused = builder.reused;
            this.taskKey = builder.taskKey;
            this.triggerType = builder.triggerType;
            this.usageComplete = builder.usageComplete;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Task create() {
            return builder().build();
        }

        /**
         * @return billingId
         */
        public String getBillingId() {
            return this.billingId;
        }

        /**
         * @return billingStatus
         */
        public String getBillingStatus() {
            return this.billingStatus;
        }

        /**
         * @return executionStatus
         */
        public String getExecutionStatus() {
            return this.executionStatus;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return lastError
         */
        public String getLastError() {
            return this.lastError;
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        /**
         * @return progress
         */
        public Long getProgress() {
            return this.progress;
        }

        /**
         * @return reportStatus
         */
        public String getReportStatus() {
            return this.reportStatus;
        }

        /**
         * @return reused
         */
        public Boolean getReused() {
            return this.reused;
        }

        /**
         * @return taskKey
         */
        public String getTaskKey() {
            return this.taskKey;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        /**
         * @return usageComplete
         */
        public Boolean getUsageComplete() {
            return this.usageComplete;
        }

        public static final class Builder {
            private String billingId; 
            private String billingStatus; 
            private String executionStatus; 
            private String gmtCreate; 
            private String gmtModified; 
            private String lastError; 
            private String operation; 
            private Long progress; 
            private String reportStatus; 
            private Boolean reused; 
            private String taskKey; 
            private String triggerType; 
            private Boolean usageComplete; 

            private Builder() {
            } 

            private Builder(Task model) {
                this.billingId = model.billingId;
                this.billingStatus = model.billingStatus;
                this.executionStatus = model.executionStatus;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.lastError = model.lastError;
                this.operation = model.operation;
                this.progress = model.progress;
                this.reportStatus = model.reportStatus;
                this.reused = model.reused;
                this.taskKey = model.taskKey;
                this.triggerType = model.triggerType;
                this.usageComplete = model.usageComplete;
            } 

            /**
             * <p>任务账单标识</p>
             * 
             * <strong>example:</strong>
             * <p>billing-example</p>
             */
            public Builder billingId(String billingId) {
                this.billingId = billingId;
                return this;
            }

            /**
             * <p>任务计费状态</p>
             * 
             * <strong>example:</strong>
             * <p>PENDING</p>
             */
            public Builder billingStatus(String billingStatus) {
                this.billingStatus = billingStatus;
                return this;
            }

            /**
             * <p>任务执行状态</p>
             * 
             * <strong>example:</strong>
             * <p>QUEUED</p>
             */
            public Builder executionStatus(String executionStatus) {
                this.executionStatus = executionStatus;
                return this;
            }

            /**
             * <p>任务创建时间，ISO 8601 格式</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-18T09:00:00+00:00</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>任务更新时间，ISO 8601 格式</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-18T09:01:00+00:00</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>最近一次任务错误</p>
             * 
             * <strong>example:</strong>
             * <p>任务执行失败</p>
             */
            public Builder lastError(String lastError) {
                this.lastError = lastError;
                return this;
            }

            /**
             * <p>任务操作类型</p>
             * 
             * <strong>example:</strong>
             * <p>full</p>
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * <p>任务执行进度</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder progress(Long progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>任务结果上报状态</p>
             * 
             * <strong>example:</strong>
             * <p>pending</p>
             */
            public Builder reportStatus(String reportStatus) {
                this.reportStatus = reportStatus;
                return this;
            }

            /**
             * <p>是否复用已有任务</p>
             */
            public Builder reused(Boolean reused) {
                this.reused = reused;
                return this;
            }

            /**
             * <p>任务业务标识</p>
             * 
             * <strong>example:</strong>
             * <p>0123456789abcdef0123456789abcdef</p>
             */
            public Builder taskKey(String taskKey) {
                this.taskKey = taskKey;
                return this;
            }

            /**
             * <p>任务触发类型</p>
             * 
             * <strong>example:</strong>
             * <p>manual</p>
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            /**
             * <p>用量统计是否完成</p>
             */
            public Builder usageComplete(Boolean usageComplete) {
                this.usageComplete = usageComplete;
                return this;
            }

            public Task build() {
                return new Task(this);
            } 

        } 

    }
}
