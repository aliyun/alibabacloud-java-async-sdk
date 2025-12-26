// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pailangstudio20240710.models;

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
 * {@link FlowRun} extends {@link TeaModel}
 *
 * <p>FlowRun</p>
 */
public class FlowRun extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.NameInMap("ChildRuns")
    private java.util.List<ChildRuns> childRuns;

    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("CredentialConfig")
    private CredentialConfig credentialConfig;

    @com.aliyun.core.annotation.NameInMap("DataColumnMapping")
    private java.util.Map<String, String> dataColumnMapping;

    @com.aliyun.core.annotation.NameInMap("DataSources")
    private java.util.List<DataSources> dataSources;

    @com.aliyun.core.annotation.NameInMap("Duration")
    private Integer duration;

    @com.aliyun.core.annotation.NameInMap("EcsSpec")
    private EcsSpec ecsSpec;

    @com.aliyun.core.annotation.NameInMap("Envs")
    private java.util.List<Envs> envs;

    @com.aliyun.core.annotation.NameInMap("EvaluationConfigs")
    private java.util.List<EvaluationConfigs> evaluationConfigs;

    @com.aliyun.core.annotation.NameInMap("EvaluationWorkerCount")
    private Integer evaluationWorkerCount;

    @com.aliyun.core.annotation.NameInMap("Exception")
    private String exception;

    @com.aliyun.core.annotation.NameInMap("FlowId")
    private String flowId;

    @com.aliyun.core.annotation.NameInMap("FlowName")
    private String flowName;

    @com.aliyun.core.annotation.NameInMap("FlowRunId")
    private String flowRunId;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtFinishTime")
    private String gmtFinishTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("GmtStartTime")
    private String gmtStartTime;

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Labels> labels;

    @com.aliyun.core.annotation.NameInMap("NodeName")
    private String nodeName;

    @com.aliyun.core.annotation.NameInMap("NodeRunInfos")
    private java.util.List<NodeRunInfos> nodeRunInfos;

    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.NameInMap("RunMode")
    private String runMode;

    @com.aliyun.core.annotation.NameInMap("RunName")
    private String runName;

    @com.aliyun.core.annotation.NameInMap("RunResult")
    private String runResult;

    @com.aliyun.core.annotation.NameInMap("RunStatus")
    private String runStatus;

    @com.aliyun.core.annotation.NameInMap("RunTimeout")
    private Integer runTimeout;

    @com.aliyun.core.annotation.NameInMap("UserVpc")
    private UserVpc userVpc;

    @com.aliyun.core.annotation.NameInMap("Variant")
    private String variant;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private FlowRun(Builder builder) {
        this.accessibility = builder.accessibility;
        this.childRuns = builder.childRuns;
        this.creator = builder.creator;
        this.credentialConfig = builder.credentialConfig;
        this.dataColumnMapping = builder.dataColumnMapping;
        this.dataSources = builder.dataSources;
        this.duration = builder.duration;
        this.ecsSpec = builder.ecsSpec;
        this.envs = builder.envs;
        this.evaluationConfigs = builder.evaluationConfigs;
        this.evaluationWorkerCount = builder.evaluationWorkerCount;
        this.exception = builder.exception;
        this.flowId = builder.flowId;
        this.flowName = builder.flowName;
        this.flowRunId = builder.flowRunId;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtFinishTime = builder.gmtFinishTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.gmtStartTime = builder.gmtStartTime;
        this.labels = builder.labels;
        this.nodeName = builder.nodeName;
        this.nodeRunInfos = builder.nodeRunInfos;
        this.resourceId = builder.resourceId;
        this.runMode = builder.runMode;
        this.runName = builder.runName;
        this.runResult = builder.runResult;
        this.runStatus = builder.runStatus;
        this.runTimeout = builder.runTimeout;
        this.userVpc = builder.userVpc;
        this.variant = builder.variant;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlowRun create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return childRuns
     */
    public java.util.List<ChildRuns> getChildRuns() {
        return this.childRuns;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return credentialConfig
     */
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    /**
     * @return dataColumnMapping
     */
    public java.util.Map<String, String> getDataColumnMapping() {
        return this.dataColumnMapping;
    }

    /**
     * @return dataSources
     */
    public java.util.List<DataSources> getDataSources() {
        return this.dataSources;
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return ecsSpec
     */
    public EcsSpec getEcsSpec() {
        return this.ecsSpec;
    }

    /**
     * @return envs
     */
    public java.util.List<Envs> getEnvs() {
        return this.envs;
    }

    /**
     * @return evaluationConfigs
     */
    public java.util.List<EvaluationConfigs> getEvaluationConfigs() {
        return this.evaluationConfigs;
    }

    /**
     * @return evaluationWorkerCount
     */
    public Integer getEvaluationWorkerCount() {
        return this.evaluationWorkerCount;
    }

    /**
     * @return exception
     */
    public String getException() {
        return this.exception;
    }

    /**
     * @return flowId
     */
    public String getFlowId() {
        return this.flowId;
    }

    /**
     * @return flowName
     */
    public String getFlowName() {
        return this.flowName;
    }

    /**
     * @return flowRunId
     */
    public String getFlowRunId() {
        return this.flowRunId;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtFinishTime
     */
    public String getGmtFinishTime() {
        return this.gmtFinishTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return gmtStartTime
     */
    public String getGmtStartTime() {
        return this.gmtStartTime;
    }

    /**
     * @return labels
     */
    public java.util.List<Labels> getLabels() {
        return this.labels;
    }

    /**
     * @return nodeName
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * @return nodeRunInfos
     */
    public java.util.List<NodeRunInfos> getNodeRunInfos() {
        return this.nodeRunInfos;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return runMode
     */
    public String getRunMode() {
        return this.runMode;
    }

    /**
     * @return runName
     */
    public String getRunName() {
        return this.runName;
    }

    /**
     * @return runResult
     */
    public String getRunResult() {
        return this.runResult;
    }

    /**
     * @return runStatus
     */
    public String getRunStatus() {
        return this.runStatus;
    }

    /**
     * @return runTimeout
     */
    public Integer getRunTimeout() {
        return this.runTimeout;
    }

    /**
     * @return userVpc
     */
    public UserVpc getUserVpc() {
        return this.userVpc;
    }

    /**
     * @return variant
     */
    public String getVariant() {
        return this.variant;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String accessibility; 
        private java.util.List<ChildRuns> childRuns; 
        private String creator; 
        private CredentialConfig credentialConfig; 
        private java.util.Map<String, String> dataColumnMapping; 
        private java.util.List<DataSources> dataSources; 
        private Integer duration; 
        private EcsSpec ecsSpec; 
        private java.util.List<Envs> envs; 
        private java.util.List<EvaluationConfigs> evaluationConfigs; 
        private Integer evaluationWorkerCount; 
        private String exception; 
        private String flowId; 
        private String flowName; 
        private String flowRunId; 
        private String gmtCreateTime; 
        private String gmtFinishTime; 
        private String gmtModifiedTime; 
        private String gmtStartTime; 
        private java.util.List<Labels> labels; 
        private String nodeName; 
        private java.util.List<NodeRunInfos> nodeRunInfos; 
        private String resourceId; 
        private String runMode; 
        private String runName; 
        private String runResult; 
        private String runStatus; 
        private Integer runTimeout; 
        private UserVpc userVpc; 
        private String variant; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(FlowRun model) {
            this.accessibility = model.accessibility;
            this.childRuns = model.childRuns;
            this.creator = model.creator;
            this.credentialConfig = model.credentialConfig;
            this.dataColumnMapping = model.dataColumnMapping;
            this.dataSources = model.dataSources;
            this.duration = model.duration;
            this.ecsSpec = model.ecsSpec;
            this.envs = model.envs;
            this.evaluationConfigs = model.evaluationConfigs;
            this.evaluationWorkerCount = model.evaluationWorkerCount;
            this.exception = model.exception;
            this.flowId = model.flowId;
            this.flowName = model.flowName;
            this.flowRunId = model.flowRunId;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtFinishTime = model.gmtFinishTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.gmtStartTime = model.gmtStartTime;
            this.labels = model.labels;
            this.nodeName = model.nodeName;
            this.nodeRunInfos = model.nodeRunInfos;
            this.resourceId = model.resourceId;
            this.runMode = model.runMode;
            this.runName = model.runName;
            this.runResult = model.runResult;
            this.runStatus = model.runStatus;
            this.runTimeout = model.runTimeout;
            this.userVpc = model.userVpc;
            this.variant = model.variant;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * Accessibility.
         */
        public Builder accessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }

        /**
         * ChildRuns.
         */
        public Builder childRuns(java.util.List<ChildRuns> childRuns) {
            this.childRuns = childRuns;
            return this;
        }

        /**
         * Creator.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * CredentialConfig.
         */
        public Builder credentialConfig(CredentialConfig credentialConfig) {
            this.credentialConfig = credentialConfig;
            return this;
        }

        /**
         * DataColumnMapping.
         */
        public Builder dataColumnMapping(java.util.Map<String, String> dataColumnMapping) {
            this.dataColumnMapping = dataColumnMapping;
            return this;
        }

        /**
         * DataSources.
         */
        public Builder dataSources(java.util.List<DataSources> dataSources) {
            this.dataSources = dataSources;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(Integer duration) {
            this.duration = duration;
            return this;
        }

        /**
         * EcsSpec.
         */
        public Builder ecsSpec(EcsSpec ecsSpec) {
            this.ecsSpec = ecsSpec;
            return this;
        }

        /**
         * Envs.
         */
        public Builder envs(java.util.List<Envs> envs) {
            this.envs = envs;
            return this;
        }

        /**
         * EvaluationConfigs.
         */
        public Builder evaluationConfigs(java.util.List<EvaluationConfigs> evaluationConfigs) {
            this.evaluationConfigs = evaluationConfigs;
            return this;
        }

        /**
         * EvaluationWorkerCount.
         */
        public Builder evaluationWorkerCount(Integer evaluationWorkerCount) {
            this.evaluationWorkerCount = evaluationWorkerCount;
            return this;
        }

        /**
         * Exception.
         */
        public Builder exception(String exception) {
            this.exception = exception;
            return this;
        }

        /**
         * FlowId.
         */
        public Builder flowId(String flowId) {
            this.flowId = flowId;
            return this;
        }

        /**
         * FlowName.
         */
        public Builder flowName(String flowName) {
            this.flowName = flowName;
            return this;
        }

        /**
         * FlowRunId.
         */
        public Builder flowRunId(String flowRunId) {
            this.flowRunId = flowRunId;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtFinishTime.
         */
        public Builder gmtFinishTime(String gmtFinishTime) {
            this.gmtFinishTime = gmtFinishTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * GmtStartTime.
         */
        public Builder gmtStartTime(String gmtStartTime) {
            this.gmtStartTime = gmtStartTime;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.List<Labels> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * NodeName.
         */
        public Builder nodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }

        /**
         * NodeRunInfos.
         */
        public Builder nodeRunInfos(java.util.List<NodeRunInfos> nodeRunInfos) {
            this.nodeRunInfos = nodeRunInfos;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * RunMode.
         */
        public Builder runMode(String runMode) {
            this.runMode = runMode;
            return this;
        }

        /**
         * RunName.
         */
        public Builder runName(String runName) {
            this.runName = runName;
            return this;
        }

        /**
         * RunResult.
         */
        public Builder runResult(String runResult) {
            this.runResult = runResult;
            return this;
        }

        /**
         * RunStatus.
         */
        public Builder runStatus(String runStatus) {
            this.runStatus = runStatus;
            return this;
        }

        /**
         * RunTimeout.
         */
        public Builder runTimeout(Integer runTimeout) {
            this.runTimeout = runTimeout;
            return this;
        }

        /**
         * UserVpc.
         */
        public Builder userVpc(UserVpc userVpc) {
            this.userVpc = userVpc;
            return this;
        }

        /**
         * Variant.
         */
        public Builder variant(String variant) {
            this.variant = variant;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public FlowRun build() {
            return new FlowRun(this);
        } 

    } 

    /**
     * 
     * {@link FlowRun} extends {@link TeaModel}
     *
     * <p>FlowRun</p>
     */
    public static class FlowSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private FlowSource(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowSource create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(FlowSource model) {
                this.id = model.id;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>ID</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>名称</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>类型</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public FlowSource build() {
                return new FlowSource(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlowRun} extends {@link TeaModel}
     *
     * <p>FlowRun</p>
     */
    public static class JobInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        private JobInfo(Builder builder) {
            this.jobId = builder.jobId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobInfo create() {
            return builder().build();
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        public static final class Builder {
            private String jobId; 

            private Builder() {
            } 

            private Builder(JobInfo model) {
                this.jobId = model.jobId;
            } 

            /**
             * <p>任务ID</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            public JobInfo build() {
                return new JobInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlowRun} extends {@link TeaModel}
     *
     * <p>FlowRun</p>
     */
    public static class ChildRuns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("FlowRunId")
        private String flowRunId;

        @com.aliyun.core.annotation.NameInMap("FlowSource")
        private FlowSource flowSource;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtFinishTime")
        private String gmtFinishTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("GmtStartTime")
        private String gmtStartTime;

        @com.aliyun.core.annotation.NameInMap("JobInfo")
        private JobInfo jobInfo;

        @com.aliyun.core.annotation.NameInMap("RunMode")
        private String runMode;

        @com.aliyun.core.annotation.NameInMap("RunName")
        private String runName;

        @com.aliyun.core.annotation.NameInMap("RunResult")
        private String runResult;

        @com.aliyun.core.annotation.NameInMap("RunStatus")
        private String runStatus;

        private ChildRuns(Builder builder) {
            this.duration = builder.duration;
            this.flowRunId = builder.flowRunId;
            this.flowSource = builder.flowSource;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtFinishTime = builder.gmtFinishTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.gmtStartTime = builder.gmtStartTime;
            this.jobInfo = builder.jobInfo;
            this.runMode = builder.runMode;
            this.runName = builder.runName;
            this.runResult = builder.runResult;
            this.runStatus = builder.runStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChildRuns create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return flowRunId
         */
        public String getFlowRunId() {
            return this.flowRunId;
        }

        /**
         * @return flowSource
         */
        public FlowSource getFlowSource() {
            return this.flowSource;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtFinishTime
         */
        public String getGmtFinishTime() {
            return this.gmtFinishTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return gmtStartTime
         */
        public String getGmtStartTime() {
            return this.gmtStartTime;
        }

        /**
         * @return jobInfo
         */
        public JobInfo getJobInfo() {
            return this.jobInfo;
        }

        /**
         * @return runMode
         */
        public String getRunMode() {
            return this.runMode;
        }

        /**
         * @return runName
         */
        public String getRunName() {
            return this.runName;
        }

        /**
         * @return runResult
         */
        public String getRunResult() {
            return this.runResult;
        }

        /**
         * @return runStatus
         */
        public String getRunStatus() {
            return this.runStatus;
        }

        public static final class Builder {
            private Integer duration; 
            private String flowRunId; 
            private FlowSource flowSource; 
            private String gmtCreateTime; 
            private String gmtFinishTime; 
            private String gmtModifiedTime; 
            private String gmtStartTime; 
            private JobInfo jobInfo; 
            private String runMode; 
            private String runName; 
            private String runResult; 
            private String runStatus; 

            private Builder() {
            } 

            private Builder(ChildRuns model) {
                this.duration = model.duration;
                this.flowRunId = model.flowRunId;
                this.flowSource = model.flowSource;
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtFinishTime = model.gmtFinishTime;
                this.gmtModifiedTime = model.gmtModifiedTime;
                this.gmtStartTime = model.gmtStartTime;
                this.jobInfo = model.jobInfo;
                this.runMode = model.runMode;
                this.runName = model.runName;
                this.runResult = model.runResult;
                this.runStatus = model.runStatus;
            } 

            /**
             * <p>运行时长</p>
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>应用流运行ID</p>
             */
            public Builder flowRunId(String flowRunId) {
                this.flowRunId = flowRunId;
                return this;
            }

            /**
             * <p>应用流来源</p>
             */
            public Builder flowSource(FlowSource flowSource) {
                this.flowSource = flowSource;
                return this;
            }

            /**
             * <p>创建时间</p>
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * <p>结束时间</p>
             */
            public Builder gmtFinishTime(String gmtFinishTime) {
                this.gmtFinishTime = gmtFinishTime;
                return this;
            }

            /**
             * <p>修改时间</p>
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * <p>开始时间</p>
             */
            public Builder gmtStartTime(String gmtStartTime) {
                this.gmtStartTime = gmtStartTime;
                return this;
            }

            /**
             * <p>任务信息</p>
             */
            public Builder jobInfo(JobInfo jobInfo) {
                this.jobInfo = jobInfo;
                return this;
            }

            /**
             * <p>运行模式</p>
             */
            public Builder runMode(String runMode) {
                this.runMode = runMode;
                return this;
            }

            /**
             * <p>运行名称</p>
             */
            public Builder runName(String runName) {
                this.runName = runName;
                return this;
            }

            /**
             * <p>运行结果</p>
             */
            public Builder runResult(String runResult) {
                this.runResult = runResult;
                return this;
            }

            /**
             * <p>运行状态</p>
             */
            public Builder runStatus(String runStatus) {
                this.runStatus = runStatus;
                return this;
            }

            public ChildRuns build() {
                return new ChildRuns(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlowRun} extends {@link TeaModel}
     *
     * <p>FlowRun</p>
     */
    public static class Roles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssumeRoleFor")
        private String assumeRoleFor;

        @com.aliyun.core.annotation.NameInMap("RoleArn")
        private String roleArn;

        @com.aliyun.core.annotation.NameInMap("RoleType")
        private String roleType;

        private Roles(Builder builder) {
            this.assumeRoleFor = builder.assumeRoleFor;
            this.roleArn = builder.roleArn;
            this.roleType = builder.roleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Roles create() {
            return builder().build();
        }

        /**
         * @return assumeRoleFor
         */
        public String getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        /**
         * @return roleType
         */
        public String getRoleType() {
            return this.roleType;
        }

        public static final class Builder {
            private String assumeRoleFor; 
            private String roleArn; 
            private String roleType; 

            private Builder() {
            } 

            private Builder(Roles model) {
                this.assumeRoleFor = model.assumeRoleFor;
                this.roleArn = model.roleArn;
                this.roleType = model.roleType;
            } 

            /**
             * <p>AssumeRoleFor</p>
             */
            public Builder assumeRoleFor(String assumeRoleFor) {
                this.assumeRoleFor = assumeRoleFor;
                return this;
            }

            /**
             * <p>角色名称</p>
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * <p>角色类型</p>
             */
            public Builder roleType(String roleType) {
                this.roleType = roleType;
                return this;
            }

            public Roles build() {
                return new Roles(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlowRun} extends {@link TeaModel}
     *
     * <p>FlowRun</p>
     */
    public static class CredentialConfigItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Roles")
        private java.util.List<Roles> roles;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private CredentialConfigItems(Builder builder) {
            this.key = builder.key;
            this.roles = builder.roles;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CredentialConfigItems create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return roles
         */
        public java.util.List<Roles> getRoles() {
            return this.roles;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String key; 
            private java.util.List<Roles> roles; 
            private String type; 

            private Builder() {
            } 

            private Builder(CredentialConfigItems model) {
                this.key = model.key;
                this.roles = model.roles;
                this.type = model.type;
            } 

            /**
             * <p>Key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>角色列表</p>
             */
            public Builder roles(java.util.List<Roles> roles) {
                this.roles = roles;
                return this;
            }

            /**
             * <p>Type</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public CredentialConfigItems build() {
                return new CredentialConfigItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlowRun} extends {@link TeaModel}
     *
     * <p>FlowRun</p>
     */
    public static class CredentialConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunEnvRoleKey")
        private String aliyunEnvRoleKey;

        @com.aliyun.core.annotation.NameInMap("CredentialConfigItems")
        private java.util.List<CredentialConfigItems> credentialConfigItems;

        @com.aliyun.core.annotation.NameInMap("EnableCredentialInject")
        private Boolean enableCredentialInject;

        private CredentialConfig(Builder builder) {
            this.aliyunEnvRoleKey = builder.aliyunEnvRoleKey;
            this.credentialConfigItems = builder.credentialConfigItems;
            this.enableCredentialInject = builder.enableCredentialInject;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CredentialConfig create() {
            return builder().build();
        }

        /**
         * @return aliyunEnvRoleKey
         */
        public String getAliyunEnvRoleKey() {
            return this.aliyunEnvRoleKey;
        }

        /**
         * @return credentialConfigItems
         */
        public java.util.List<CredentialConfigItems> getCredentialConfigItems() {
            return this.credentialConfigItems;
        }

        /**
         * @return enableCredentialInject
         */
        public Boolean getEnableCredentialInject() {
            return this.enableCredentialInject;
        }

        public static final class Builder {
            private String aliyunEnvRoleKey; 
            private java.util.List<CredentialConfigItems> credentialConfigItems; 
            private Boolean enableCredentialInject; 

            private Builder() {
            } 

            private Builder(CredentialConfig model) {
                this.aliyunEnvRoleKey = model.aliyunEnvRoleKey;
                this.credentialConfigItems = model.credentialConfigItems;
                this.enableCredentialInject = model.enableCredentialInject;
            } 

            /**
             * <p>AliyunEnvRoleKey</p>
             */
            public Builder aliyunEnvRoleKey(String aliyunEnvRoleKey) {
                this.aliyunEnvRoleKey = aliyunEnvRoleKey;
                return this;
            }

            /**
             * <p>Credential配置项列表</p>
             */
            public Builder credentialConfigItems(java.util.List<CredentialConfigItems> credentialConfigItems) {
                this.credentialConfigItems = credentialConfigItems;
                return this;
            }

            /**
             * <p>是否启用Credential注入</p>
             */
            public Builder enableCredentialInject(Boolean enableCredentialInject) {
                this.enableCredentialInject = enableCredentialInject;
                return this;
            }

            public CredentialConfig build() {
                return new CredentialConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlowRun} extends {@link TeaModel}
     *
     * <p>FlowRun</p>
     */
    public static class DataSources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatasetId")
        private String datasetId;

        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("Uri")
        private String uri;

        private DataSources(Builder builder) {
            this.datasetId = builder.datasetId;
            this.mountPath = builder.mountPath;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSources create() {
            return builder().build();
        }

        /**
         * @return datasetId
         */
        public String getDatasetId() {
            return this.datasetId;
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private String datasetId; 
            private String mountPath; 
            private String uri; 

            private Builder() {
            } 

            private Builder(DataSources model) {
                this.datasetId = model.datasetId;
                this.mountPath = model.mountPath;
                this.uri = model.uri;
            } 

            /**
             * <p>数据集ID</p>
             */
            public Builder datasetId(String datasetId) {
                this.datasetId = datasetId;
                return this;
            }

            /**
             * <p>挂载路径</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>统一资源识别码</p>
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public DataSources build() {
                return new DataSources(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlowRun} extends {@link TeaModel}
     *
     * <p>FlowRun</p>
     */
    public static class EcsSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CPU")
        private Integer CPU;

        @com.aliyun.core.annotation.NameInMap("ExtraEphemeralStorage")
        private Integer extraEphemeralStorage;

        @com.aliyun.core.annotation.NameInMap("GPU")
        private Integer GPU;

        @com.aliyun.core.annotation.NameInMap("GPUCorePercentage")
        private Integer GPUCorePercentage;

        @com.aliyun.core.annotation.NameInMap("GPUMemory")
        private Integer GPUMemory;

        @com.aliyun.core.annotation.NameInMap("GPUType")
        private String GPUType;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Integer memory;

        @com.aliyun.core.annotation.NameInMap("PodCount")
        private Integer podCount;

        @com.aliyun.core.annotation.NameInMap("QuotaId")
        private String quotaId;

        @com.aliyun.core.annotation.NameInMap("QuotaType")
        private String quotaType;

        @com.aliyun.core.annotation.NameInMap("SharedMemory")
        private Integer sharedMemory;

        private EcsSpec(Builder builder) {
            this.CPU = builder.CPU;
            this.extraEphemeralStorage = builder.extraEphemeralStorage;
            this.GPU = builder.GPU;
            this.GPUCorePercentage = builder.GPUCorePercentage;
            this.GPUMemory = builder.GPUMemory;
            this.GPUType = builder.GPUType;
            this.instanceType = builder.instanceType;
            this.memory = builder.memory;
            this.podCount = builder.podCount;
            this.quotaId = builder.quotaId;
            this.quotaType = builder.quotaType;
            this.sharedMemory = builder.sharedMemory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcsSpec create() {
            return builder().build();
        }

        /**
         * @return CPU
         */
        public Integer getCPU() {
            return this.CPU;
        }

        /**
         * @return extraEphemeralStorage
         */
        public Integer getExtraEphemeralStorage() {
            return this.extraEphemeralStorage;
        }

        /**
         * @return GPU
         */
        public Integer getGPU() {
            return this.GPU;
        }

        /**
         * @return GPUCorePercentage
         */
        public Integer getGPUCorePercentage() {
            return this.GPUCorePercentage;
        }

        /**
         * @return GPUMemory
         */
        public Integer getGPUMemory() {
            return this.GPUMemory;
        }

        /**
         * @return GPUType
         */
        public String getGPUType() {
            return this.GPUType;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        /**
         * @return podCount
         */
        public Integer getPodCount() {
            return this.podCount;
        }

        /**
         * @return quotaId
         */
        public String getQuotaId() {
            return this.quotaId;
        }

        /**
         * @return quotaType
         */
        public String getQuotaType() {
            return this.quotaType;
        }

        /**
         * @return sharedMemory
         */
        public Integer getSharedMemory() {
            return this.sharedMemory;
        }

        public static final class Builder {
            private Integer CPU; 
            private Integer extraEphemeralStorage; 
            private Integer GPU; 
            private Integer GPUCorePercentage; 
            private Integer GPUMemory; 
            private String GPUType; 
            private String instanceType; 
            private Integer memory; 
            private Integer podCount; 
            private String quotaId; 
            private String quotaType; 
            private Integer sharedMemory; 

            private Builder() {
            } 

            private Builder(EcsSpec model) {
                this.CPU = model.CPU;
                this.extraEphemeralStorage = model.extraEphemeralStorage;
                this.GPU = model.GPU;
                this.GPUCorePercentage = model.GPUCorePercentage;
                this.GPUMemory = model.GPUMemory;
                this.GPUType = model.GPUType;
                this.instanceType = model.instanceType;
                this.memory = model.memory;
                this.podCount = model.podCount;
                this.quotaId = model.quotaId;
                this.quotaType = model.quotaType;
                this.sharedMemory = model.sharedMemory;
            } 

            /**
             * <p>CPU信息</p>
             */
            public Builder CPU(Integer CPU) {
                this.CPU = CPU;
                return this;
            }

            /**
             * <p>额外系统盘</p>
             */
            public Builder extraEphemeralStorage(Integer extraEphemeralStorage) {
                this.extraEphemeralStorage = extraEphemeralStorage;
                return this;
            }

            /**
             * <p>GPU信息</p>
             */
            public Builder GPU(Integer GPU) {
                this.GPU = GPU;
                return this;
            }

            /**
             * <p>GPU算力占比</p>
             */
            public Builder GPUCorePercentage(Integer GPUCorePercentage) {
                this.GPUCorePercentage = GPUCorePercentage;
                return this;
            }

            /**
             * <p>GPU显存</p>
             */
            public Builder GPUMemory(Integer GPUMemory) {
                this.GPUMemory = GPUMemory;
                return this;
            }

            /**
             * <p>GPU类型</p>
             */
            public Builder GPUType(String GPUType) {
                this.GPUType = GPUType;
                return this;
            }

            /**
             * <p>实例类型</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>内存信息</p>
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>Pod数量</p>
             */
            public Builder podCount(Integer podCount) {
                this.podCount = podCount;
                return this;
            }

            /**
             * <p>资源配额ID</p>
             */
            public Builder quotaId(String quotaId) {
                this.quotaId = quotaId;
                return this;
            }

            /**
             * <p>资源配额类型</p>
             */
            public Builder quotaType(String quotaType) {
                this.quotaType = quotaType;
                return this;
            }

            /**
             * <p>共享内存</p>
             */
            public Builder sharedMemory(Integer sharedMemory) {
                this.sharedMemory = sharedMemory;
                return this;
            }

            public EcsSpec build() {
                return new EcsSpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlowRun} extends {@link TeaModel}
     *
     * <p>FlowRun</p>
     */
    public static class Envs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Envs(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Envs create() {
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

            private Builder(Envs model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>环境键</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>环境值</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Envs build() {
                return new Envs(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlowRun} extends {@link TeaModel}
     *
     * <p>FlowRun</p>
     */
    public static class EvaluationConfigsFlowSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private EvaluationConfigsFlowSource(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EvaluationConfigsFlowSource create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(EvaluationConfigsFlowSource model) {
                this.id = model.id;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>ID</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>名称</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>类型</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public EvaluationConfigsFlowSource build() {
                return new EvaluationConfigsFlowSource(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlowRun} extends {@link TeaModel}
     *
     * <p>FlowRun</p>
     */
    public static class EvaluationConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataColumnMapping")
        private java.util.Map<String, String> dataColumnMapping;

        @com.aliyun.core.annotation.NameInMap("FlowSource")
        private EvaluationConfigsFlowSource flowSource;

        @com.aliyun.core.annotation.NameInMap("InputsOverrideConfig")
        private String inputsOverrideConfig;

        private EvaluationConfigs(Builder builder) {
            this.dataColumnMapping = builder.dataColumnMapping;
            this.flowSource = builder.flowSource;
            this.inputsOverrideConfig = builder.inputsOverrideConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EvaluationConfigs create() {
            return builder().build();
        }

        /**
         * @return dataColumnMapping
         */
        public java.util.Map<String, String> getDataColumnMapping() {
            return this.dataColumnMapping;
        }

        /**
         * @return flowSource
         */
        public EvaluationConfigsFlowSource getFlowSource() {
            return this.flowSource;
        }

        /**
         * @return inputsOverrideConfig
         */
        public String getInputsOverrideConfig() {
            return this.inputsOverrideConfig;
        }

        public static final class Builder {
            private java.util.Map<String, String> dataColumnMapping; 
            private EvaluationConfigsFlowSource flowSource; 
            private String inputsOverrideConfig; 

            private Builder() {
            } 

            private Builder(EvaluationConfigs model) {
                this.dataColumnMapping = model.dataColumnMapping;
                this.flowSource = model.flowSource;
                this.inputsOverrideConfig = model.inputsOverrideConfig;
            } 

            /**
             * <p>映射配置</p>
             */
            public Builder dataColumnMapping(java.util.Map<String, String> dataColumnMapping) {
                this.dataColumnMapping = dataColumnMapping;
                return this;
            }

            /**
             * <p>应用流来源</p>
             */
            public Builder flowSource(EvaluationConfigsFlowSource flowSource) {
                this.flowSource = flowSource;
                return this;
            }

            /**
             * <p>输入配置</p>
             */
            public Builder inputsOverrideConfig(String inputsOverrideConfig) {
                this.inputsOverrideConfig = inputsOverrideConfig;
                return this;
            }

            public EvaluationConfigs build() {
                return new EvaluationConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlowRun} extends {@link TeaModel}
     *
     * <p>FlowRun</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Labels(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
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

            private Builder(Labels model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>标签键</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>标签值</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlowRun} extends {@link TeaModel}
     *
     * <p>FlowRun</p>
     */
    public static class NodeRunInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Inputs")
        private String inputs;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("Output")
        private String output;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Stdout")
        private String stdout;

        private NodeRunInfos(Builder builder) {
            this.duration = builder.duration;
            this.errorMessage = builder.errorMessage;
            this.inputs = builder.inputs;
            this.nodeName = builder.nodeName;
            this.output = builder.output;
            this.status = builder.status;
            this.stdout = builder.stdout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeRunInfos create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return inputs
         */
        public String getInputs() {
            return this.inputs;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return stdout
         */
        public String getStdout() {
            return this.stdout;
        }

        public static final class Builder {
            private String duration; 
            private String errorMessage; 
            private String inputs; 
            private String nodeName; 
            private String output; 
            private String status; 
            private String stdout; 

            private Builder() {
            } 

            private Builder(NodeRunInfos model) {
                this.duration = model.duration;
                this.errorMessage = model.errorMessage;
                this.inputs = model.inputs;
                this.nodeName = model.nodeName;
                this.output = model.output;
                this.status = model.status;
                this.stdout = model.stdout;
            } 

            /**
             * <p>耗时</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>错误信息</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>输入</p>
             */
            public Builder inputs(String inputs) {
                this.inputs = inputs;
                return this;
            }

            /**
             * <p>节点名称</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>输出</p>
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * <p>节点状态</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>日志信息</p>
             */
            public Builder stdout(String stdout) {
                this.stdout = stdout;
                return this;
            }

            public NodeRunInfos build() {
                return new NodeRunInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlowRun} extends {@link TeaModel}
     *
     * <p>FlowRun</p>
     */
    public static class UserVpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private UserVpc(Builder builder) {
            this.securityGroupId = builder.securityGroupId;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserVpc create() {
            return builder().build();
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String securityGroupId; 
            private String vSwitchId; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(UserVpc model) {
                this.securityGroupId = model.securityGroupId;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>安全组ID</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>交换机ID</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>VPC ID</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public UserVpc build() {
                return new UserVpc(this);
            } 

        } 

    }
}
