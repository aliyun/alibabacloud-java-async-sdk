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
         * <p>The default value is true.</p>
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
         * <p>The reason for the creation.</p>
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
         * <p>The runtime configuration.</p>
         */
        public Builder defaultRunProperties(DefaultRunProperties defaultRunProperties) {
            String defaultRunPropertiesShrink = shrink(defaultRunProperties, "DefaultRunProperties", "json");
            this.putBodyParameter("DefaultRunProperties", defaultRunPropertiesShrink);
            this.defaultRunProperties = defaultRunProperties;
            return this;
        }

        /**
         * <p>The environment of the workspace. Valid values:</p>
         * <ul>
         * <li>Prod: production environment</li>
         * <li>Dev: development environment</li>
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
         * <p>Make up the data cycle settings.</p>
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
         * <p>The task-specific parameters. The value is in the JSON format. The key specifies the task ID. You can call the GetTask operation to obtain the format of the value by querying the script parameters.</p>
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
         * <li>SupplementData The values of the RootTaskIds and IncludeTaskIds parameters vary based on the value of the Mode parameter. For more information, see the Mode parameter in this API operation.</li>
         * <li>ManualWorkflow You must set the WorkflowId parameter to the ID of the manually triggered workflow. The RootTaskIds parameter is optional. If you do not specify the RootTaskIds parameter, the IDs of the default root nodes of the manually triggered workflow are used.</li>
         * <li>Manual You need to specify only the RootTaskIds parameter. The RootTaskIds parameter specifies the IDs of the manually triggered tasks that need to be run.</li>
         * <li>SmokeTest You need to specify only the RootTaskIds parameter. The RootTaskIds parameter specifies the IDs of the test tasks that need to be run.</li>
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
         * <p>The ID of the workflow to which the instance belongs. This parameter is set to 1 for auto triggered tasks.</p>
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
         * <p>The workflow parameters. The priority of workflow parameters is higher than that of task parameters. You can call the GetTask operation to obtain the format of the workflow parameters by querying the Parameters parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>{ 
         *   &quot;key1&quot;: &quot;value1&quot;, 
         *   &quot;key2&quot;: &quot;value2&quot; 
         * }</p>
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
             * <p>The alert notification method. Valid values:</p>
             * <ul>
             * <li>Sms</li>
             * <li>Mail</li>
             * <li>SmsMail</li>
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
             * <p>The alerting policy. Valid values:</p>
             * <ul>
             * <li>SUCCESS: An alert is reported when data backfill succeeds.</li>
             * <li>FAILURE: An alert is reported when data backfill fails.</li>
             * <li>SuccessFailure: An alert is reported regardless of whether data backfill succeeds or fails.</li>
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
             * <p>Specifies whether to block the running of the instance if the analysis fails.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder blocked(Boolean blocked) {
                this.blocked = blocked;
                return this;
            }

            /**
             * <p>Specifies whether to enable the analysis feature.</p>
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
             * <p>The time when the instance finishes running. This parameter is required if you specify the RunPolicy parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>23:59:59</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Specifies whether the instance can be run immediately during the time period in the future. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder immediately(Boolean immediately) {
                this.immediately = immediately;
                return this;
            }

            /**
             * <p>The time when the instance starts to run. This parameter is required if you specify the RunPolicy parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The type of the time period during which the data is backfilled. This parameter is required if you specify the RunPolicy parameter. Valid values:</p>
             * <ul>
             * <li>Daily</li>
             * <li>Weekend</li>
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
                this.rootTaskIds = model.rootTaskIds;
                this.runPolicy = model.runPolicy;
                this.runtimeResource = model.runtimeResource;
            } 

            /**
             * <p>The alert settings.</p>
             */
            public Builder alert(Alert alert) {
                this.alert = alert;
                return this;
            }

            /**
             * <p>The analysis of the configurations.</p>
             */
            public Builder analysis(Analysis analysis) {
                this.analysis = analysis;
                return this;
            }

            /**
             * <p>The IDs of the projects that do not need to be run.</p>
             */
            public Builder excludeProjectIds(java.util.List<Long> excludeProjectIds) {
                this.excludeProjectIds = excludeProjectIds;
                return this;
            }

            /**
             * <p>The IDs of the tasks that do not need to be run.</p>
             */
            public Builder excludeTaskIds(java.util.List<Long> excludeTaskIds) {
                this.excludeTaskIds = excludeTaskIds;
                return this;
            }

            /**
             * <p>The IDs of the projects that need to be run.</p>
             */
            public Builder includeProjectIds(java.util.List<Long> includeProjectIds) {
                this.includeProjectIds = includeProjectIds;
                return this;
            }

            /**
             * <p>The IDs of the tasks that need to be run.</p>
             */
            public Builder includeTaskIds(java.util.List<Long> includeTaskIds) {
                this.includeTaskIds = includeTaskIds;
                return this;
            }

            /**
             * <p>The data backfill mode. Default value: ManualSelection. Valid values:</p>
             * <ul>
             * <li>General: You can specify only one root task ID. The <code>IncludeTaskIds</code> parameter is optional. If you do not specify the IncludeTaskIds parameter, the tasks that are specified by the <code>RootTaskIds</code> parameter are included by default.``</li>
             * <li>ManualSelection: You can specify multiple root tasks IDs. The <code>IncludeTaskIds</code> parameter is optional. If you do not specify the IncludeTaskIds parameter, the tasks that are specified by the <code>RootTaskIds</code> parameter are included by default.``</li>
             * <li>Chain: The value of the <code>RootTaskIds</code> parameter is left empty. You must set the <code>IncludeTaskIds</code> parameter to the start task ID and the end task ID.</li>
             * <li>AllDownstream: You can specify only one root task ID.``</li>
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
             * <p>The running order. Default value: Asc. Valid values:</p>
             * <ul>
             * <li>Asc: The tasks are sorted by data timestamp in ascending order.</li>
             * <li>Desc: The tasks are sorted by data timestamp in descending order.</li>
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
             * <p>The number of tasks that can be run in parallel. If you specify the value to 2 to 10, the value indicates the number of tasks that can be run in parallel. If you specify the value to 1, the tasks are run one by one.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder parallelism(Integer parallelism) {
                this.parallelism = parallelism;
                return this;
            }

            /**
             * <p>The root task IDs.</p>
             */
            public Builder rootTaskIds(java.util.List<Long> rootTaskIds) {
                this.rootTaskIds = rootTaskIds;
                return this;
            }

            /**
             * <p>The data backfill policy. If you leave this parameter empty, the runtime configuration is used.</p>
             */
            public Builder runPolicy(RunPolicy runPolicy) {
                this.runPolicy = runPolicy;
                return this;
            }

            /**
             * <p>The identifier of the custom resource group for scheduling. If you leave this parameter empty, the runtime configuration is used.</p>
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
             * <p>The end date of the business.</p>
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
             * <p>The start business date.</p>
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
             * <p>The list of business dates. You can specify a multi-segment business date (up to 7 segments).</p>
             * <p>This parameter is required.</p>
             */
            public Builder bizDates(java.util.List<BizDates> bizDates) {
                this.bizDates = bizDates;
                return this;
            }

            /**
             * <p>Specifies the end cycle time. Default value: 23:59:59.</p>
             * <p>If you enter this field, StartTime and EndTime must be filled in at the same time.</p>
             * 
             * <strong>example:</strong>
             * <p>23:59:59</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Specifies the start cycle time. Default value: 00:00:00.</p>
             * <p>If you enter this field, StartTime and EndTime must be filled in at the same time.</p>
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
}
