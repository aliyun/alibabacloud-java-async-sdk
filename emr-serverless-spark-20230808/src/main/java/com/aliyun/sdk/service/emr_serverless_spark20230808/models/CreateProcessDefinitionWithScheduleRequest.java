// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link CreateProcessDefinitionWithScheduleRequest} extends {@link RequestModel}
 *
 * <p>CreateProcessDefinitionWithScheduleRequest</p>
 */
public class CreateProcessDefinitionWithScheduleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("bizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("alertEmailAddress")
    private String alertEmailAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("executionType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String executionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("globalParams")
    private java.util.List<GlobalParams> globalParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("productNamespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productNamespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("publish")
    private Boolean publish;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceQueue")
    private String resourceQueue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("retryTimes")
    private Integer retryTimes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("runAs")
    private String runAs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("schedule")
    private Schedule schedule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.Map<String, String> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskDefinitionJson")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<TaskDefinitionJson> taskDefinitionJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskParallelism")
    private Integer taskParallelism;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskRelationJson")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<TaskRelationJson> taskRelationJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("timeout")
    private Integer timeout;

    private CreateProcessDefinitionWithScheduleRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.alertEmailAddress = builder.alertEmailAddress;
        this.description = builder.description;
        this.executionType = builder.executionType;
        this.globalParams = builder.globalParams;
        this.name = builder.name;
        this.productNamespace = builder.productNamespace;
        this.publish = builder.publish;
        this.regionId = builder.regionId;
        this.resourceQueue = builder.resourceQueue;
        this.retryTimes = builder.retryTimes;
        this.runAs = builder.runAs;
        this.schedule = builder.schedule;
        this.tags = builder.tags;
        this.taskDefinitionJson = builder.taskDefinitionJson;
        this.taskParallelism = builder.taskParallelism;
        this.taskRelationJson = builder.taskRelationJson;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProcessDefinitionWithScheduleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return alertEmailAddress
     */
    public String getAlertEmailAddress() {
        return this.alertEmailAddress;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return executionType
     */
    public String getExecutionType() {
        return this.executionType;
    }

    /**
     * @return globalParams
     */
    public java.util.List<GlobalParams> getGlobalParams() {
        return this.globalParams;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return productNamespace
     */
    public String getProductNamespace() {
        return this.productNamespace;
    }

    /**
     * @return publish
     */
    public Boolean getPublish() {
        return this.publish;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceQueue
     */
    public String getResourceQueue() {
        return this.resourceQueue;
    }

    /**
     * @return retryTimes
     */
    public Integer getRetryTimes() {
        return this.retryTimes;
    }

    /**
     * @return runAs
     */
    public String getRunAs() {
        return this.runAs;
    }

    /**
     * @return schedule
     */
    public Schedule getSchedule() {
        return this.schedule;
    }

    /**
     * @return tags
     */
    public java.util.Map<String, String> getTags() {
        return this.tags;
    }

    /**
     * @return taskDefinitionJson
     */
    public java.util.List<TaskDefinitionJson> getTaskDefinitionJson() {
        return this.taskDefinitionJson;
    }

    /**
     * @return taskParallelism
     */
    public Integer getTaskParallelism() {
        return this.taskParallelism;
    }

    /**
     * @return taskRelationJson
     */
    public java.util.List<TaskRelationJson> getTaskRelationJson() {
        return this.taskRelationJson;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    public static final class Builder extends Request.Builder<CreateProcessDefinitionWithScheduleRequest, Builder> {
        private String bizId; 
        private String alertEmailAddress; 
        private String description; 
        private String executionType; 
        private java.util.List<GlobalParams> globalParams; 
        private String name; 
        private String productNamespace; 
        private Boolean publish; 
        private String regionId; 
        private String resourceQueue; 
        private Integer retryTimes; 
        private String runAs; 
        private Schedule schedule; 
        private java.util.Map<String, String> tags; 
        private java.util.List<TaskDefinitionJson> taskDefinitionJson; 
        private Integer taskParallelism; 
        private java.util.List<TaskRelationJson> taskRelationJson; 
        private Integer timeout; 

        private Builder() {
            super();
        } 

        private Builder(CreateProcessDefinitionWithScheduleRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.alertEmailAddress = request.alertEmailAddress;
            this.description = request.description;
            this.executionType = request.executionType;
            this.globalParams = request.globalParams;
            this.name = request.name;
            this.productNamespace = request.productNamespace;
            this.publish = request.publish;
            this.regionId = request.regionId;
            this.resourceQueue = request.resourceQueue;
            this.retryTimes = request.retryTimes;
            this.runAs = request.runAs;
            this.schedule = request.schedule;
            this.tags = request.tags;
            this.taskDefinitionJson = request.taskDefinitionJson;
            this.taskParallelism = request.taskParallelism;
            this.taskRelationJson = request.taskRelationJson;
            this.timeout = request.timeout;
        } 

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>w-d8********</p>
         */
        public Builder bizId(String bizId) {
            this.putPathParameter("bizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>The email address to receive alerts.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:foo_bar@spark.alert.invalid.com">foo_bar@spark.alert.invalid.com</a></p>
         */
        public Builder alertEmailAddress(String alertEmailAddress) {
            this.putQueryParameter("alertEmailAddress", alertEmailAddress);
            this.alertEmailAddress = alertEmailAddress;
            return this;
        }

        /**
         * <p>The description of the workflow.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ods batch workflow</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The execution policy</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PARALLEL</p>
         */
        public Builder executionType(String executionType) {
            this.putQueryParameter("executionType", executionType);
            this.executionType = executionType;
            return this;
        }

        /**
         * globalParams.
         */
        public Builder globalParams(java.util.List<GlobalParams> globalParams) {
            String globalParamsShrink = shrink(globalParams, "globalParams", "json");
            this.putQueryParameter("globalParams", globalParamsShrink);
            this.globalParams = globalParams;
            return this;
        }

        /**
         * <p>The name of the workflow.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ods_batch_workflow</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The code of the service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SS</p>
         */
        public Builder productNamespace(String productNamespace) {
            this.putQueryParameter("productNamespace", productNamespace);
            this.productNamespace = productNamespace;
            return this;
        }

        /**
         * <p>Specifies whether to publish the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder publish(Boolean publish) {
            this.putQueryParameter("publish", publish);
            this.publish = publish;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource queue.</p>
         * 
         * <strong>example:</strong>
         * <p>root_queue</p>
         */
        public Builder resourceQueue(String resourceQueue) {
            this.putQueryParameter("resourceQueue", resourceQueue);
            this.resourceQueue = resourceQueue;
            return this;
        }

        /**
         * <p>The number of retries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder retryTimes(Integer retryTimes) {
            this.putQueryParameter("retryTimes", retryTimes);
            this.retryTimes = retryTimes;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account used by the user who creates the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>113***************</p>
         */
        public Builder runAs(String runAs) {
            this.putQueryParameter("runAs", runAs);
            this.runAs = runAs;
            return this;
        }

        /**
         * <p>The scheduling settings.</p>
         */
        public Builder schedule(Schedule schedule) {
            String scheduleShrink = shrink(schedule, "schedule", "json");
            this.putQueryParameter("schedule", scheduleShrink);
            this.schedule = schedule;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tags(java.util.Map<String, String> tags) {
            String tagsShrink = shrink(tags, "tags", "json");
            this.putQueryParameter("tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The descriptions of all nodes in the workflow.</p>
         * <p>This parameter is required.</p>
         */
        public Builder taskDefinitionJson(java.util.List<TaskDefinitionJson> taskDefinitionJson) {
            String taskDefinitionJsonShrink = shrink(taskDefinitionJson, "taskDefinitionJson", "json");
            this.putQueryParameter("taskDefinitionJson", taskDefinitionJsonShrink);
            this.taskDefinitionJson = taskDefinitionJson;
            return this;
        }

        /**
         * <p>The node parallelism.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder taskParallelism(Integer taskParallelism) {
            this.putQueryParameter("taskParallelism", taskParallelism);
            this.taskParallelism = taskParallelism;
            return this;
        }

        /**
         * <p>The dependencies of all nodes in the workflow. preTaskCode specifies the ID of an upstream node, and postTaskCode specifies the ID of a downstream node. The ID of each node is unique. If a node does not have an upstream node, set preTaskCode to 0.</p>
         * <p>This parameter is required.</p>
         */
        public Builder taskRelationJson(java.util.List<TaskRelationJson> taskRelationJson) {
            String taskRelationJsonShrink = shrink(taskRelationJson, "taskRelationJson", "json");
            this.putQueryParameter("taskRelationJson", taskRelationJsonShrink);
            this.taskRelationJson = taskRelationJson;
            return this;
        }

        /**
         * <p>The default timeout period of the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder timeout(Integer timeout) {
            this.putQueryParameter("timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        @Override
        public CreateProcessDefinitionWithScheduleRequest build() {
            return new CreateProcessDefinitionWithScheduleRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateProcessDefinitionWithScheduleRequest} extends {@link TeaModel}
     *
     * <p>CreateProcessDefinitionWithScheduleRequest</p>
     */
    public static class GlobalParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("direct")
        private String direct;

        @com.aliyun.core.annotation.NameInMap("prop")
        private String prop;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private GlobalParams(Builder builder) {
            this.direct = builder.direct;
            this.prop = builder.prop;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GlobalParams create() {
            return builder().build();
        }

        /**
         * @return direct
         */
        public String getDirect() {
            return this.direct;
        }

        /**
         * @return prop
         */
        public String getProp() {
            return this.prop;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String direct; 
            private String prop; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(GlobalParams model) {
                this.direct = model.direct;
                this.prop = model.prop;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * direct.
             */
            public Builder direct(String direct) {
                this.direct = direct;
                return this;
            }

            /**
             * prop.
             */
            public Builder prop(String prop) {
                this.prop = prop;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public GlobalParams build() {
                return new GlobalParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProcessDefinitionWithScheduleRequest} extends {@link TeaModel}
     *
     * <p>CreateProcessDefinitionWithScheduleRequest</p>
     */
    public static class Schedule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("crontab")
        private String crontab;

        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("timezoneId")
        private String timezoneId;

        private Schedule(Builder builder) {
            this.crontab = builder.crontab;
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
            this.timezoneId = builder.timezoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Schedule create() {
            return builder().build();
        }

        /**
         * @return crontab
         */
        public String getCrontab() {
            return this.crontab;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return timezoneId
         */
        public String getTimezoneId() {
            return this.timezoneId;
        }

        public static final class Builder {
            private String crontab; 
            private String endTime; 
            private String startTime; 
            private String timezoneId; 

            private Builder() {
            } 

            private Builder(Schedule model) {
                this.crontab = model.crontab;
                this.endTime = model.endTime;
                this.startTime = model.startTime;
                this.timezoneId = model.timezoneId;
            } 

            /**
             * <p>The CRON expression that is used for scheduling.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 0 * * ?</p>
             */
            public Builder crontab(String crontab) {
                this.crontab = crontab;
                return this;
            }

            /**
             * <p>The end time of the scheduling.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-23 16:13:27</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The start time of the scheduling.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-23 16:13:27</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The ID of the time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
             */
            public Builder timezoneId(String timezoneId) {
                this.timezoneId = timezoneId;
                return this;
            }

            public Schedule build() {
                return new Schedule(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProcessDefinitionWithScheduleRequest} extends {@link TeaModel}
     *
     * <p>CreateProcessDefinitionWithScheduleRequest</p>
     */
    public static class LocalParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("direct")
        private String direct;

        @com.aliyun.core.annotation.NameInMap("prop")
        private String prop;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private LocalParams(Builder builder) {
            this.direct = builder.direct;
            this.prop = builder.prop;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LocalParams create() {
            return builder().build();
        }

        /**
         * @return direct
         */
        public String getDirect() {
            return this.direct;
        }

        /**
         * @return prop
         */
        public String getProp() {
            return this.prop;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String direct; 
            private String prop; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(LocalParams model) {
                this.direct = model.direct;
                this.prop = model.prop;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * direct.
             */
            public Builder direct(String direct) {
                this.direct = direct;
                return this;
            }

            /**
             * prop.
             */
            public Builder prop(String prop) {
                this.prop = prop;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public LocalParams build() {
                return new LocalParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProcessDefinitionWithScheduleRequest} extends {@link TeaModel}
     *
     * <p>CreateProcessDefinitionWithScheduleRequest</p>
     */
    public static class SparkConf extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private SparkConf(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SparkConf create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(SparkConf model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the SparkConf object.</p>
             * 
             * <strong>example:</strong>
             * <p>spark.dynamicAllocation.enabled</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the SparkConf object.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SparkConf build() {
                return new SparkConf(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProcessDefinitionWithScheduleRequest} extends {@link TeaModel}
     *
     * <p>CreateProcessDefinitionWithScheduleRequest</p>
     */
    public static class TaskParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("displaySparkVersion")
        private String displaySparkVersion;

        @com.aliyun.core.annotation.NameInMap("environmentId")
        private String environmentId;

        @com.aliyun.core.annotation.NameInMap("fusion")
        private Boolean fusion;

        @com.aliyun.core.annotation.NameInMap("localParams")
        private java.util.List<LocalParams> localParams;

        @com.aliyun.core.annotation.NameInMap("resourceQueueId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceQueueId;

        @com.aliyun.core.annotation.NameInMap("sparkConf")
        private java.util.List<SparkConf> sparkConf;

        @com.aliyun.core.annotation.NameInMap("sparkDriverCores")
        private Integer sparkDriverCores;

        @com.aliyun.core.annotation.NameInMap("sparkDriverMemory")
        private Long sparkDriverMemory;

        @com.aliyun.core.annotation.NameInMap("sparkExecutorCores")
        private Integer sparkExecutorCores;

        @com.aliyun.core.annotation.NameInMap("sparkExecutorMemory")
        private Long sparkExecutorMemory;

        @com.aliyun.core.annotation.NameInMap("sparkLogLevel")
        private String sparkLogLevel;

        @com.aliyun.core.annotation.NameInMap("sparkLogPath")
        private String sparkLogPath;

        @com.aliyun.core.annotation.NameInMap("sparkVersion")
        private String sparkVersion;

        @com.aliyun.core.annotation.NameInMap("taskBizId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String taskBizId;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("workspaceBizId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String workspaceBizId;

        private TaskParams(Builder builder) {
            this.displaySparkVersion = builder.displaySparkVersion;
            this.environmentId = builder.environmentId;
            this.fusion = builder.fusion;
            this.localParams = builder.localParams;
            this.resourceQueueId = builder.resourceQueueId;
            this.sparkConf = builder.sparkConf;
            this.sparkDriverCores = builder.sparkDriverCores;
            this.sparkDriverMemory = builder.sparkDriverMemory;
            this.sparkExecutorCores = builder.sparkExecutorCores;
            this.sparkExecutorMemory = builder.sparkExecutorMemory;
            this.sparkLogLevel = builder.sparkLogLevel;
            this.sparkLogPath = builder.sparkLogPath;
            this.sparkVersion = builder.sparkVersion;
            this.taskBizId = builder.taskBizId;
            this.type = builder.type;
            this.workspaceBizId = builder.workspaceBizId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskParams create() {
            return builder().build();
        }

        /**
         * @return displaySparkVersion
         */
        public String getDisplaySparkVersion() {
            return this.displaySparkVersion;
        }

        /**
         * @return environmentId
         */
        public String getEnvironmentId() {
            return this.environmentId;
        }

        /**
         * @return fusion
         */
        public Boolean getFusion() {
            return this.fusion;
        }

        /**
         * @return localParams
         */
        public java.util.List<LocalParams> getLocalParams() {
            return this.localParams;
        }

        /**
         * @return resourceQueueId
         */
        public String getResourceQueueId() {
            return this.resourceQueueId;
        }

        /**
         * @return sparkConf
         */
        public java.util.List<SparkConf> getSparkConf() {
            return this.sparkConf;
        }

        /**
         * @return sparkDriverCores
         */
        public Integer getSparkDriverCores() {
            return this.sparkDriverCores;
        }

        /**
         * @return sparkDriverMemory
         */
        public Long getSparkDriverMemory() {
            return this.sparkDriverMemory;
        }

        /**
         * @return sparkExecutorCores
         */
        public Integer getSparkExecutorCores() {
            return this.sparkExecutorCores;
        }

        /**
         * @return sparkExecutorMemory
         */
        public Long getSparkExecutorMemory() {
            return this.sparkExecutorMemory;
        }

        /**
         * @return sparkLogLevel
         */
        public String getSparkLogLevel() {
            return this.sparkLogLevel;
        }

        /**
         * @return sparkLogPath
         */
        public String getSparkLogPath() {
            return this.sparkLogPath;
        }

        /**
         * @return sparkVersion
         */
        public String getSparkVersion() {
            return this.sparkVersion;
        }

        /**
         * @return taskBizId
         */
        public String getTaskBizId() {
            return this.taskBizId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return workspaceBizId
         */
        public String getWorkspaceBizId() {
            return this.workspaceBizId;
        }

        public static final class Builder {
            private String displaySparkVersion; 
            private String environmentId; 
            private Boolean fusion; 
            private java.util.List<LocalParams> localParams; 
            private String resourceQueueId; 
            private java.util.List<SparkConf> sparkConf; 
            private Integer sparkDriverCores; 
            private Long sparkDriverMemory; 
            private Integer sparkExecutorCores; 
            private Long sparkExecutorMemory; 
            private String sparkLogLevel; 
            private String sparkLogPath; 
            private String sparkVersion; 
            private String taskBizId; 
            private String type; 
            private String workspaceBizId; 

            private Builder() {
            } 

            private Builder(TaskParams model) {
                this.displaySparkVersion = model.displaySparkVersion;
                this.environmentId = model.environmentId;
                this.fusion = model.fusion;
                this.localParams = model.localParams;
                this.resourceQueueId = model.resourceQueueId;
                this.sparkConf = model.sparkConf;
                this.sparkDriverCores = model.sparkDriverCores;
                this.sparkDriverMemory = model.sparkDriverMemory;
                this.sparkExecutorCores = model.sparkExecutorCores;
                this.sparkExecutorMemory = model.sparkExecutorMemory;
                this.sparkLogLevel = model.sparkLogLevel;
                this.sparkLogPath = model.sparkLogPath;
                this.sparkVersion = model.sparkVersion;
                this.taskBizId = model.taskBizId;
                this.type = model.type;
                this.workspaceBizId = model.workspaceBizId;
            } 

            /**
             * <p>The displayed version of the Spark engine.</p>
             * 
             * <strong>example:</strong>
             * <p>esr-4.0.0 (Spark 3.5.2, Scala 2.12)</p>
             */
            public Builder displaySparkVersion(String displaySparkVersion) {
                this.displaySparkVersion = displaySparkVersion;
                return this;
            }

            /**
             * <p>The environment ID.</p>
             * 
             * <strong>example:</strong>
             * <p>env-crhq2h5lhtgju93buhkg</p>
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * <p>Specifies whether to enable Fusion engine for acceleration.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder fusion(Boolean fusion) {
                this.fusion = fusion;
                return this;
            }

            /**
             * localParams.
             */
            public Builder localParams(java.util.List<LocalParams> localParams) {
                this.localParams = localParams;
                return this;
            }

            /**
             * <p>The name of the resource queue on which the job runs.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>root_queue</p>
             */
            public Builder resourceQueueId(String resourceQueueId) {
                this.resourceQueueId = resourceQueueId;
                return this;
            }

            /**
             * <p>The configurations of the Spark job.</p>
             */
            public Builder sparkConf(java.util.List<SparkConf> sparkConf) {
                this.sparkConf = sparkConf;
                return this;
            }

            /**
             * <p>The number of driver cores of the Spark job.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sparkDriverCores(Integer sparkDriverCores) {
                this.sparkDriverCores = sparkDriverCores;
                return this;
            }

            /**
             * <p>The size of driver memory of the Spark job.</p>
             * 
             * <strong>example:</strong>
             * <p>4g</p>
             */
            public Builder sparkDriverMemory(Long sparkDriverMemory) {
                this.sparkDriverMemory = sparkDriverMemory;
                return this;
            }

            /**
             * <p>The number of executor cores of the Spark job.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sparkExecutorCores(Integer sparkExecutorCores) {
                this.sparkExecutorCores = sparkExecutorCores;
                return this;
            }

            /**
             * <p>The size of executor memory of the Spark job.</p>
             * 
             * <strong>example:</strong>
             * <p>4g</p>
             */
            public Builder sparkExecutorMemory(Long sparkExecutorMemory) {
                this.sparkExecutorMemory = sparkExecutorMemory;
                return this;
            }

            /**
             * <p>The level of the Spark log.</p>
             * 
             * <strong>example:</strong>
             * <p>INFO</p>
             */
            public Builder sparkLogLevel(String sparkLogLevel) {
                this.sparkLogLevel = sparkLogLevel;
                return this;
            }

            /**
             * <p>The path where the operational logs of the Spark job are stored.</p>
             */
            public Builder sparkLogPath(String sparkLogPath) {
                this.sparkLogPath = sparkLogPath;
                return this;
            }

            /**
             * <p>The version of the Spark engine.</p>
             * 
             * <strong>example:</strong>
             * <p>esr-4.0.0 (Spark 3.5.2, Scala 2.12)</p>
             */
            public Builder sparkVersion(String sparkVersion) {
                this.sparkVersion = sparkVersion;
                return this;
            }

            /**
             * <p>The ID of the data development job.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>TSK-d87******************</p>
             */
            public Builder taskBizId(String taskBizId) {
                this.taskBizId = taskBizId;
                return this;
            }

            /**
             * <p>The type of the Spark job.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>w-d8********</p>
             */
            public Builder workspaceBizId(String workspaceBizId) {
                this.workspaceBizId = workspaceBizId;
                return this;
            }

            public TaskParams build() {
                return new TaskParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProcessDefinitionWithScheduleRequest} extends {@link TeaModel}
     *
     * <p>CreateProcessDefinitionWithScheduleRequest</p>
     */
    public static class TaskDefinitionJson extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alertEmailAddress")
        private String alertEmailAddress;

        @com.aliyun.core.annotation.NameInMap("code")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long code;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("failAlertEnable")
        private Boolean failAlertEnable;

        @com.aliyun.core.annotation.NameInMap("failRetryTimes")
        private Integer failRetryTimes;

        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("startAlertEnable")
        private Boolean startAlertEnable;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.Map<String, String> tags;

        @com.aliyun.core.annotation.NameInMap("taskParams")
        @com.aliyun.core.annotation.Validation(required = true)
        private TaskParams taskParams;

        @com.aliyun.core.annotation.NameInMap("taskType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("timeout")
        private Integer timeout;

        private TaskDefinitionJson(Builder builder) {
            this.alertEmailAddress = builder.alertEmailAddress;
            this.code = builder.code;
            this.description = builder.description;
            this.failAlertEnable = builder.failAlertEnable;
            this.failRetryTimes = builder.failRetryTimes;
            this.name = builder.name;
            this.startAlertEnable = builder.startAlertEnable;
            this.tags = builder.tags;
            this.taskParams = builder.taskParams;
            this.taskType = builder.taskType;
            this.timeout = builder.timeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskDefinitionJson create() {
            return builder().build();
        }

        /**
         * @return alertEmailAddress
         */
        public String getAlertEmailAddress() {
            return this.alertEmailAddress;
        }

        /**
         * @return code
         */
        public Long getCode() {
            return this.code;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return failAlertEnable
         */
        public Boolean getFailAlertEnable() {
            return this.failAlertEnable;
        }

        /**
         * @return failRetryTimes
         */
        public Integer getFailRetryTimes() {
            return this.failRetryTimes;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return startAlertEnable
         */
        public Boolean getStartAlertEnable() {
            return this.startAlertEnable;
        }

        /**
         * @return tags
         */
        public java.util.Map<String, String> getTags() {
            return this.tags;
        }

        /**
         * @return taskParams
         */
        public TaskParams getTaskParams() {
            return this.taskParams;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        public static final class Builder {
            private String alertEmailAddress; 
            private Long code; 
            private String description; 
            private Boolean failAlertEnable; 
            private Integer failRetryTimes; 
            private String name; 
            private Boolean startAlertEnable; 
            private java.util.Map<String, String> tags; 
            private TaskParams taskParams; 
            private String taskType; 
            private Integer timeout; 

            private Builder() {
            } 

            private Builder(TaskDefinitionJson model) {
                this.alertEmailAddress = model.alertEmailAddress;
                this.code = model.code;
                this.description = model.description;
                this.failAlertEnable = model.failAlertEnable;
                this.failRetryTimes = model.failRetryTimes;
                this.name = model.name;
                this.startAlertEnable = model.startAlertEnable;
                this.tags = model.tags;
                this.taskParams = model.taskParams;
                this.taskType = model.taskType;
                this.timeout = model.timeout;
            } 

            /**
             * <p>The email address to receive alerts.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:foo_bar@spark.alert.invalid.com">foo_bar@spark.alert.invalid.com</a></p>
             */
            public Builder alertEmailAddress(String alertEmailAddress) {
                this.alertEmailAddress = alertEmailAddress;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>36************</p>
             */
            public Builder code(Long code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The node description.</p>
             * 
             * <strong>example:</strong>
             * <p>ods transform task</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Specifies whether to send alerts when the node fails.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder failAlertEnable(Boolean failAlertEnable) {
                this.failAlertEnable = failAlertEnable;
                return this;
            }

            /**
             * <p>The number of retries when the node fails.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder failRetryTimes(Integer failRetryTimes) {
                this.failRetryTimes = failRetryTimes;
                return this;
            }

            /**
             * <p>The name of the node.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ods_transform_task</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Specifies whether to send alerts when the node is started.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder startAlertEnable(Boolean startAlertEnable) {
                this.startAlertEnable = startAlertEnable;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder tags(java.util.Map<String, String> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The job parameters.</p>
             * <p>This parameter is required.</p>
             */
            public Builder taskParams(TaskParams taskParams) {
                this.taskParams = taskParams;
                return this;
            }

            /**
             * <p>The type of the node.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>MigrateData</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>The timeout period of the callback. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1200</p>
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            public TaskDefinitionJson build() {
                return new TaskDefinitionJson(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProcessDefinitionWithScheduleRequest} extends {@link TeaModel}
     *
     * <p>CreateProcessDefinitionWithScheduleRequest</p>
     */
    public static class TaskRelationJson extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("postTaskCode")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long postTaskCode;

        @com.aliyun.core.annotation.NameInMap("postTaskVersion")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer postTaskVersion;

        @com.aliyun.core.annotation.NameInMap("preTaskCode")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long preTaskCode;

        @com.aliyun.core.annotation.NameInMap("preTaskVersion")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer preTaskVersion;

        private TaskRelationJson(Builder builder) {
            this.name = builder.name;
            this.postTaskCode = builder.postTaskCode;
            this.postTaskVersion = builder.postTaskVersion;
            this.preTaskCode = builder.preTaskCode;
            this.preTaskVersion = builder.preTaskVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskRelationJson create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return postTaskCode
         */
        public Long getPostTaskCode() {
            return this.postTaskCode;
        }

        /**
         * @return postTaskVersion
         */
        public Integer getPostTaskVersion() {
            return this.postTaskVersion;
        }

        /**
         * @return preTaskCode
         */
        public Long getPreTaskCode() {
            return this.preTaskCode;
        }

        /**
         * @return preTaskVersion
         */
        public Integer getPreTaskVersion() {
            return this.preTaskVersion;
        }

        public static final class Builder {
            private String name; 
            private Long postTaskCode; 
            private Integer postTaskVersion; 
            private Long preTaskCode; 
            private Integer preTaskVersion; 

            private Builder() {
            } 

            private Builder(TaskRelationJson model) {
                this.name = model.name;
                this.postTaskCode = model.postTaskCode;
                this.postTaskVersion = model.postTaskVersion;
                this.preTaskCode = model.preTaskCode;
                this.preTaskVersion = model.preTaskVersion;
            } 

            /**
             * <p>The name of the node topology. You can enter a workflow name.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ods batch workflow</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the downstream node.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>28************</p>
             */
            public Builder postTaskCode(Long postTaskCode) {
                this.postTaskCode = postTaskCode;
                return this;
            }

            /**
             * <p>The version of the downstream node.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder postTaskVersion(Integer postTaskVersion) {
                this.postTaskVersion = postTaskVersion;
                return this;
            }

            /**
             * <p>The ID of the upstream node.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>16************</p>
             */
            public Builder preTaskCode(Long preTaskCode) {
                this.preTaskCode = preTaskCode;
                return this;
            }

            /**
             * <p>The version of the upstream node.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder preTaskVersion(Integer preTaskVersion) {
                this.preTaskVersion = preTaskVersion;
                return this;
            }

            public TaskRelationJson build() {
                return new TaskRelationJson(this);
            } 

        } 

    }
}
