// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link CreateWorkflowInstancesRequest} extends {@link RequestModel}
 *
 * <p>CreateWorkflowInstancesRequest</p>
 */
public class CreateWorkflowInstancesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoStartEnabled")
    private Boolean autoStartEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DefaultRunProperties")
    private DefaultRunProperties defaultRunProperties;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnvType")
    private String envType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Periods")
    private Periods periods;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagCreationPolicy")
    private String tagCreationPolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskParameters")
    private String taskParameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkflowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long workflowId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkflowParameters")
    private String workflowParameters;

    private CreateWorkflowInstancesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.autoStartEnabled = builder.autoStartEnabled;
        this.comment = builder.comment;
        this.defaultRunProperties = builder.defaultRunProperties;
        this.envType = builder.envType;
        this.name = builder.name;
        this.periods = builder.periods;
        this.projectId = builder.projectId;
        this.tagCreationPolicy = builder.tagCreationPolicy;
        this.tags = builder.tags;
        this.taskParameters = builder.taskParameters;
        this.type = builder.type;
        this.workflowId = builder.workflowId;
        this.workflowParameters = builder.workflowParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWorkflowInstancesRequest create() {
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
     * @return autoStartEnabled
     */
    public Boolean getAutoStartEnabled() {
        return this.autoStartEnabled;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return defaultRunProperties
     */
    public DefaultRunProperties getDefaultRunProperties() {
        return this.defaultRunProperties;
    }

    /**
     * @return envType
     */
    public String getEnvType() {
        return this.envType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return periods
     */
    public Periods getPeriods() {
        return this.periods;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return tagCreationPolicy
     */
    public String getTagCreationPolicy() {
        return this.tagCreationPolicy;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return taskParameters
     */
    public String getTaskParameters() {
        return this.taskParameters;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return workflowId
     */
    public Long getWorkflowId() {
        return this.workflowId;
    }

    /**
     * @return workflowParameters
     */
    public String getWorkflowParameters() {
        return this.workflowParameters;
    }

    public static final class Builder extends Request.Builder<CreateWorkflowInstancesRequest, Builder> {
        private String regionId; 
        private Boolean autoStartEnabled; 
        private String comment; 
        private DefaultRunProperties defaultRunProperties; 
        private String envType; 
        private String name; 
        private Periods periods; 
        private Long projectId; 
        private String tagCreationPolicy; 
        private java.util.List<Tags> tags; 
        private String taskParameters; 
        private String type; 
        private Long workflowId; 
        private String workflowParameters; 

        private Builder() {
            super();
        } 

        private Builder(CreateWorkflowInstancesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.autoStartEnabled = request.autoStartEnabled;
            this.comment = request.comment;
            this.defaultRunProperties = request.defaultRunProperties;
            this.envType = request.envType;
            this.name = request.name;
            this.periods = request.periods;
            this.projectId = request.projectId;
            this.tagCreationPolicy = request.tagCreationPolicy;
            this.tags = request.tags;
            this.taskParameters = request.taskParameters;
            this.type = request.type;
            this.workflowId = request.workflowId;
            this.workflowParameters = request.workflowParameters;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to run the workflow instance immediately after creation. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoStartEnabled(Boolean autoStartEnabled) {
            this.putBodyParameter("AutoStartEnabled", autoStartEnabled);
            this.autoStartEnabled = autoStartEnabled;
            return this;
        }

        /**
         * <p>The reason for creating the workflow instance.</p>
         * 
         * <strong>example:</strong>
         * <p>create for test</p>
         */
        public Builder comment(String comment) {
            this.putBodyParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>The runtime configurations.</p>
         */
        public Builder defaultRunProperties(DefaultRunProperties defaultRunProperties) {
            String defaultRunPropertiesShrink = shrink(defaultRunProperties, "DefaultRunProperties", "json");
            this.putBodyParameter("DefaultRunProperties", defaultRunPropertiesShrink);
            this.defaultRunProperties = defaultRunProperties;
            return this;
        }

        /**
         * <p>The project environment. Valid values:</p>
         * <ul>
         * <li>Prod: production</li>
         * <li>Dev: development</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        public Builder envType(String envType) {
            this.putBodyParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * <p>The name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WorkflowInstance1</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The data backfill period settings.</p>
         */
        public Builder periods(Periods periods) {
            String periodsShrink = shrink(periods, "Periods", "json");
            this.putBodyParameter("Periods", periodsShrink);
            this.periods = periods;
            return this;
        }

        /**
         * <p>The project ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The tag creation policy. Valid values:</p>
         * <ul>
         * <li>Append: append mode. New tags are appended to the existing tags inherited from the manual workflow.</li>
         * <li>Overwrite: overwrite mode. Existing tags of the manual workflow are not inherited. Tags are created directly.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Append</p>
         */
        public Builder tagCreationPolicy(String tagCreationPolicy) {
            this.putBodyParameter("TagCreationPolicy", tagCreationPolicy);
            this.tagCreationPolicy = tagCreationPolicy;
            return this;
        }

        /**
         * <p>The list of node labels.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putBodyParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The node parameters used to set parameters for specific nodes. The value is in JSON format. The key is the node ID, and the value format refers to the node script parameter (the Task.Script.Parameter field in the GetTask response).</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;1001&quot;: &quot;key1=val2 key2=val2&quot;, 
         *   &quot;1002&quot;: &quot;key1=val2 key2=val2&quot;
         * }</p>
         */
        public Builder taskParameters(String taskParameters) {
            this.putBodyParameter("TaskParameters", taskParameters);
            this.taskParameters = taskParameters;
            return this;
        }

        /**
         * <p>The type of the workflow instance. Valid values:</p>
         * <ul>
         * <li>SupplementData: data backfill. The method for specifying RootTaskIds and IncludeTaskIds varies based on the data backfill pattern. For more information, see the DefaultRunProperties.Mode parameter description.</li>
         * <li>ManualWorkflow: manual workflow. Set WorkflowId to the ID of the manual workflow. RootTaskIds is optional. If you do not specify RootTaskIds, the default root node list of the manual workflow is used.</li>
         * <li>Manual: manual node. Only RootTaskIds is required, which specifies the list of manual nodes to run.</li>
         * <li>SmokeTest: smoke test. Only RootTaskIds is required, which specifies the list of test nodes to run.</li>
         * <li>TriggerWorkflow: trigger-based workflow. Set WorkflowId to the ID of the trigger-based workflow. IncludeTaskIds is optional. If you do not specify IncludeTaskIds, the entire workflow is run.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SupplementData</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The ID of the workflow to which the instance belongs. The WorkflowId for periodic nodes is 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder workflowId(Long workflowId) {
            this.putBodyParameter("WorkflowId", workflowId);
            this.workflowId = workflowId;
            return this;
        }

        /**
         * <p>The workflow parameters. This parameter takes effect when a unique workflow is specified (<code>WorkflowId != 1</code>). For periodic workflows and trigger-based workflows, the format is key=value, and the priority is lower than node parameters. For manual workflows, the format is JSON, and the priority is higher than node parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;key=value&quot; format:
         * key1=value1 key2=value2
         * JSON format:
         * {&quot;key1&quot;:&quot;value1&quot;, &quot;key2&quot;: &quot;value2&quot;}</p>
         */
        public Builder workflowParameters(String workflowParameters) {
            this.putBodyParameter("WorkflowParameters", workflowParameters);
            this.workflowParameters = workflowParameters;
            return this;
        }

        @Override
        public CreateWorkflowInstancesRequest build() {
            return new CreateWorkflowInstancesRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateWorkflowInstancesRequest} extends {@link TeaModel}
     *
     * <p>CreateWorkflowInstancesRequest</p>
     */
    public static class Alert extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NoticeType")
        private String noticeType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Alert(Builder builder) {
            this.noticeType = builder.noticeType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Alert create() {
            return builder().build();
        }

        /**
         * @return noticeType
         */
        public String getNoticeType() {
            return this.noticeType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String noticeType; 
            private String type; 

            private Builder() {
            } 

            private Builder(Alert model) {
                this.noticeType = model.noticeType;
                this.type = model.type;
            } 

            /**
             * <p>The notification method. Valid values:</p>
             * <ul>
             * <li>Sms: SMS only</li>
             * <li>Mail: email only</li>
             * <li>SmsMail: SMS and email</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Sms</p>
             */
            public Builder noticeType(String noticeType) {
                this.noticeType = noticeType;
                return this;
            }

            /**
             * <p>The alert policy. Valid values:</p>
             * <ul>
             * <li>Success: alert on success</li>
             * <li>Failure: alert on failure</li>
             * <li>SuccessFailure: alert on both success and failure</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Succes</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Alert build() {
                return new Alert(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWorkflowInstancesRequest} extends {@link TeaModel}
     *
     * <p>CreateWorkflowInstancesRequest</p>
     */
    public static class Analysis extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Blocked")
        private Boolean blocked;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        private Analysis(Builder builder) {
            this.blocked = builder.blocked;
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Analysis create() {
            return builder().build();
        }

        /**
         * @return blocked
         */
        public Boolean getBlocked() {
            return this.blocked;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private Boolean blocked; 
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(Analysis model) {
                this.blocked = model.blocked;
                this.enabled = model.enabled;
            } 

            /**
             * <p>Specifies whether to block running when the analysis does not pass. This parameter is required when Type is set to SupplementData.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder blocked(Boolean blocked) {
                this.blocked = blocked;
                return this;
            }

            /**
             * <p>Specifies whether to enable analysis. This parameter is required when Type is set to SupplementData.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public Analysis build() {
                return new Analysis(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWorkflowInstancesRequest} extends {@link TeaModel}
     *
     * <p>CreateWorkflowInstancesRequest</p>
     */
    public static class RunPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Immediately")
        private Boolean immediately;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private RunPolicy(Builder builder) {
            this.endTime = builder.endTime;
            this.immediately = builder.immediately;
            this.startTime = builder.startTime;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RunPolicy create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return immediately
         */
        public Boolean getImmediately() {
            return this.immediately;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String endTime; 
            private Boolean immediately; 
            private String startTime; 
            private String type; 

            private Builder() {
            } 

            private Builder(RunPolicy model) {
                this.endTime = model.endTime;
                this.immediately = model.immediately;
                this.startTime = model.startTime;
                this.type = model.type;
            } 

            /**
             * <p>The end run time. Format: <code>hh:mm:ss</code> in 24-hour format. This field is required if you set the run policy.</p>
             * 
             * <strong>example:</strong>
             * <p>23:59:59</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Specifies whether the instance can start running immediately if the run time is in the future. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder immediately(Boolean immediately) {
                this.immediately = immediately;
                return this;
            }

            /**
             * <p>The start run time. Format: <code>hh:mm:ss</code> in 24-hour format. This field is required if you set the run policy.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The time period type. This field is required if you set the run policy. Valid values:</p>
             * <ul>
             * <li>Daily: every day</li>
             * <li>Weekend: weekends only</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Daily</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RunPolicy build() {
                return new RunPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWorkflowInstancesRequest} extends {@link TeaModel}
     *
     * <p>CreateWorkflowInstancesRequest</p>
     */
    public static class DefaultRunProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alert")
        private Alert alert;

        @com.aliyun.core.annotation.NameInMap("Analysis")
        private Analysis analysis;

        @com.aliyun.core.annotation.NameInMap("ExcludeProjectIds")
        private java.util.List<Long> excludeProjectIds;

        @com.aliyun.core.annotation.NameInMap("ExcludeTaskIds")
        private java.util.List<Long> excludeTaskIds;

        @com.aliyun.core.annotation.NameInMap("IncludeProjectIds")
        private java.util.List<Long> includeProjectIds;

        @com.aliyun.core.annotation.NameInMap("IncludeTaskIds")
        private java.util.List<Long> includeTaskIds;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Order")
        private String order;

        @com.aliyun.core.annotation.NameInMap("Parallelism")
        private Integer parallelism;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("PriorityWeightStrategy")
        private String priorityWeightStrategy;

        @com.aliyun.core.annotation.NameInMap("RootTaskIds")
        private java.util.List<Long> rootTaskIds;

        @com.aliyun.core.annotation.NameInMap("RunPolicy")
        private RunPolicy runPolicy;

        @com.aliyun.core.annotation.NameInMap("RuntimeResource")
        private String runtimeResource;

        private DefaultRunProperties(Builder builder) {
            this.alert = builder.alert;
            this.analysis = builder.analysis;
            this.excludeProjectIds = builder.excludeProjectIds;
            this.excludeTaskIds = builder.excludeTaskIds;
            this.includeProjectIds = builder.includeProjectIds;
            this.includeTaskIds = builder.includeTaskIds;
            this.mode = builder.mode;
            this.order = builder.order;
            this.parallelism = builder.parallelism;
            this.priority = builder.priority;
            this.priorityWeightStrategy = builder.priorityWeightStrategy;
            this.rootTaskIds = builder.rootTaskIds;
            this.runPolicy = builder.runPolicy;
            this.runtimeResource = builder.runtimeResource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultRunProperties create() {
            return builder().build();
        }

        /**
         * @return alert
         */
        public Alert getAlert() {
            return this.alert;
        }

        /**
         * @return analysis
         */
        public Analysis getAnalysis() {
            return this.analysis;
        }

        /**
         * @return excludeProjectIds
         */
        public java.util.List<Long> getExcludeProjectIds() {
            return this.excludeProjectIds;
        }

        /**
         * @return excludeTaskIds
         */
        public java.util.List<Long> getExcludeTaskIds() {
            return this.excludeTaskIds;
        }

        /**
         * @return includeProjectIds
         */
        public java.util.List<Long> getIncludeProjectIds() {
            return this.includeProjectIds;
        }

        /**
         * @return includeTaskIds
         */
        public java.util.List<Long> getIncludeTaskIds() {
            return this.includeTaskIds;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return order
         */
        public String getOrder() {
            return this.order;
        }

        /**
         * @return parallelism
         */
        public Integer getParallelism() {
            return this.parallelism;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return priorityWeightStrategy
         */
        public String getPriorityWeightStrategy() {
            return this.priorityWeightStrategy;
        }

        /**
         * @return rootTaskIds
         */
        public java.util.List<Long> getRootTaskIds() {
            return this.rootTaskIds;
        }

        /**
         * @return runPolicy
         */
        public RunPolicy getRunPolicy() {
            return this.runPolicy;
        }

        /**
         * @return runtimeResource
         */
        public String getRuntimeResource() {
            return this.runtimeResource;
        }

        public static final class Builder {
            private Alert alert; 
            private Analysis analysis; 
            private java.util.List<Long> excludeProjectIds; 
            private java.util.List<Long> excludeTaskIds; 
            private java.util.List<Long> includeProjectIds; 
            private java.util.List<Long> includeTaskIds; 
            private String mode; 
            private String order; 
            private Integer parallelism; 
            private Integer priority; 
            private String priorityWeightStrategy; 
            private java.util.List<Long> rootTaskIds; 
            private RunPolicy runPolicy; 
            private String runtimeResource; 

            private Builder() {
            } 

            private Builder(DefaultRunProperties model) {
                this.alert = model.alert;
                this.analysis = model.analysis;
                this.excludeProjectIds = model.excludeProjectIds;
                this.excludeTaskIds = model.excludeTaskIds;
                this.includeProjectIds = model.includeProjectIds;
                this.includeTaskIds = model.includeTaskIds;
                this.mode = model.mode;
                this.order = model.order;
                this.parallelism = model.parallelism;
                this.priority = model.priority;
                this.priorityWeightStrategy = model.priorityWeightStrategy;
                this.rootTaskIds = model.rootTaskIds;
                this.runPolicy = model.runPolicy;
                this.runtimeResource = model.runtimeResource;
            } 

            /**
             * <p>The alert configuration.</p>
             */
            public Builder alert(Alert alert) {
                this.alert = alert;
                return this;
            }

            /**
             * <p>The analysis configuration. This parameter is required when Type is set to SupplementData.</p>
             */
            public Builder analysis(Analysis analysis) {
                this.analysis = analysis;
                return this;
            }

            /**
             * <p>The list of project IDs to exclude.</p>
             */
            public Builder excludeProjectIds(java.util.List<Long> excludeProjectIds) {
                this.excludeProjectIds = excludeProjectIds;
                return this;
            }

            /**
             * <p>The list of node IDs to exclude from running.</p>
             */
            public Builder excludeTaskIds(java.util.List<Long> excludeTaskIds) {
                this.excludeTaskIds = excludeTaskIds;
                return this;
            }

            /**
             * <p>The list of project IDs to include.</p>
             */
            public Builder includeProjectIds(java.util.List<Long> includeProjectIds) {
                this.includeProjectIds = includeProjectIds;
                return this;
            }

            /**
             * <p>The list of node IDs to run.</p>
             */
            public Builder includeTaskIds(java.util.List<Long> includeTaskIds) {
                this.includeTaskIds = includeTaskIds;
                return this;
            }

            /**
             * <p>The data backfill mode. Default value: ManualSelection. This parameter is required when Type is set to SupplementData. Valid values:</p>
             * <ul>
             * <li>General: general mode. Only one value can be specified for <code>RootTaskIds</code>. <code>IncludeTaskIds</code> is optional. If you do not specify IncludeTaskIds, the content in <code>RootTaskIds</code> is included by default.</li>
             * <li>ManualSelection: manual selection. Multiple values can be specified for <code>RootTaskIds</code>. <code>IncludeTaskIds</code> is optional. If you do not specify IncludeTaskIds, the content in <code>RootTaskIds</code> is included by default.</li>
             * <li>Chain: chain mode. <code>RootTaskIds</code> is empty. Specify two IDs in <code>IncludeTaskIds</code>, which are the start and end nodes.</li>
             * <li>AllDownstream: all downstream. Only one value can be specified for <code>RootTaskIds</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ManualSelection</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The run order. Default value: Asc. Valid values:</p>
             * <ul>
             * <li>Asc: ascending order by business date.</li>
             * <li>Desc: descending order by business date.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Asc</p>
             */
            public Builder order(String order) {
                this.order = order;
                return this;
            }

            /**
             * <p>The number of parallel nodes. A value from 2 to 10 specifies the parallelism. A value of 1 specifies serial execution. This parameter is required when Type is set to SupplementData.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder parallelism(Integer parallelism) {
                this.parallelism = parallelism;
                return this;
            }

            /**
             * <p>The run priority. Valid values: 1 to 11. A larger value indicates a higher priority. This parameter settings only supports manual workflows and trigger-based workflows.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The priority weight policy. This parameter settings only supports manual workflows and trigger-based workflows. Valid values:</p>
             * <ul>
             * <li><code>Disable</code>: disabled (default)</li>
             * <li><code>Upstream</code>: calculates the total weight of upstream nodes for the current node. The deeper the level, the higher the weight.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Upstream</p>
             */
            public Builder priorityWeightStrategy(String priorityWeightStrategy) {
                this.priorityWeightStrategy = priorityWeightStrategy;
                return this;
            }

            /**
             * <p>The list of root node IDs.</p>
             * <ul>
             * <li>When Type is set to SupplementData, RootTaskIds is required except when Mode is set to Chain.</li>
             * <li>When Type is set to ManualWorkflow, RootTaskIds is optional. If you do not specify RootTaskIds, the default root node list of the manual workflow is used.</li>
             * <li>When Type is set to Manual, RootTaskIds is required, which specifies the list of manual nodes to run.</li>
             * <li>When Type is set to SmokeTest, RootTaskIds is required, which specifies the list of test nodes to run.</li>
             * </ul>
             */
            public Builder rootTaskIds(java.util.List<Long> rootTaskIds) {
                this.rootTaskIds = rootTaskIds;
                return this;
            }

            /**
             * <p>The run policy. If this field is empty, the node configuration is used.</p>
             */
            public Builder runPolicy(RunPolicy runPolicy) {
                this.runPolicy = runPolicy;
                return this;
            }

            /**
             * <p>The identifier of the custom schedule resource group. If this field is empty, the node configuration is used.</p>
             * 
             * <strong>example:</strong>
             * <p>S_res_group_524258031846018_1684XXXXXXXXX</p>
             */
            public Builder runtimeResource(String runtimeResource) {
                this.runtimeResource = runtimeResource;
                return this;
            }

            public DefaultRunProperties build() {
                return new DefaultRunProperties(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWorkflowInstancesRequest} extends {@link TeaModel}
     *
     * <p>CreateWorkflowInstancesRequest</p>
     */
    public static class BizDates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndBizDate")
        @com.aliyun.core.annotation.Validation(required = true)
        private String endBizDate;

        @com.aliyun.core.annotation.NameInMap("StartBizDate")
        @com.aliyun.core.annotation.Validation(required = true)
        private String startBizDate;

        private BizDates(Builder builder) {
            this.endBizDate = builder.endBizDate;
            this.startBizDate = builder.startBizDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizDates create() {
            return builder().build();
        }

        /**
         * @return endBizDate
         */
        public String getEndBizDate() {
            return this.endBizDate;
        }

        /**
         * @return startBizDate
         */
        public String getStartBizDate() {
            return this.startBizDate;
        }

        public static final class Builder {
            private String endBizDate; 
            private String startBizDate; 

            private Builder() {
            } 

            private Builder(BizDates model) {
                this.endBizDate = model.endBizDate;
                this.startBizDate = model.startBizDate;
            } 

            /**
             * <p>The end business date. Format: <code>yyyy-mm-dd</code>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-24</p>
             */
            public Builder endBizDate(String endBizDate) {
                this.endBizDate = endBizDate;
                return this;
            }

            /**
             * <p>The start business date. Format: <code>yyyy-mm-dd</code>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-20</p>
             */
            public Builder startBizDate(String startBizDate) {
                this.startBizDate = startBizDate;
                return this;
            }

            public BizDates build() {
                return new BizDates(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWorkflowInstancesRequest} extends {@link TeaModel}
     *
     * <p>CreateWorkflowInstancesRequest</p>
     */
    public static class Periods extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizDates")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<BizDates> bizDates;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private Periods(Builder builder) {
            this.bizDates = builder.bizDates;
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Periods create() {
            return builder().build();
        }

        /**
         * @return bizDates
         */
        public java.util.List<BizDates> getBizDates() {
            return this.bizDates;
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

        public static final class Builder {
            private java.util.List<BizDates> bizDates; 
            private String endTime; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(Periods model) {
                this.bizDates = model.bizDates;
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The list of business dates. You can specify up to 7 business date ranges.</p>
             * <p>This parameter is required.</p>
             */
            public Builder bizDates(java.util.List<BizDates> bizDates) {
                this.bizDates = bizDates;
                return this;
            }

            /**
             * <p>The end period time. Format: <code>hh:mm:ss</code> in 24-hour format. Default value: 23:59:59.</p>
             * <p>If you specify this field, you must also specify StartTime.</p>
             * 
             * <strong>example:</strong>
             * <p>23:59:59</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The start period time. Format: <code>hh:mm:ss</code> in 24-hour format. Default value: 00:00:00.</p>
             * <p>If you specify this field, you must also specify EndTime.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public Periods build() {
                return new Periods(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWorkflowInstancesRequest} extends {@link TeaModel}
     *
     * <p>CreateWorkflowInstancesRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The label key.</p>
             * 
             * <strong>example:</strong>
             * <p>tagKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The label value.</p>
             * 
             * <strong>example:</strong>
             * <p>tagValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
