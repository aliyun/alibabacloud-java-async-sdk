// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRunsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRunsResponseBody</p>
 */
public class ListRunsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HostId")
    private String hostId;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Runs")
    private java.util.List < Runs> runs;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListRunsResponseBody(Builder builder) {
        this.hostId = builder.hostId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.runs = builder.runs;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRunsResponseBody create() {
        return builder().build();
    }

    /**
     * @return hostId
     */
    public String getHostId() {
        return this.hostId;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return runs
     */
    public java.util.List < Runs> getRuns() {
        return this.runs;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String hostId; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < Runs> runs; 
        private Integer totalCount; 

        /**
         * HostId.
         */
        public Builder hostId(String hostId) {
            this.hostId = hostId;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Runs.
         */
        public Builder runs(java.util.List < Runs> runs) {
            this.runs = runs;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRunsResponseBody build() {
            return new ListRunsResponseBody(this);
        } 

    } 

    public static class ExecuteOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallCaching")
        private Boolean callCaching;

        @com.aliyun.core.annotation.NameInMap("DeleteIntermediateResults")
        private Boolean deleteIntermediateResults;

        @com.aliyun.core.annotation.NameInMap("FailureMode")
        private String failureMode;

        @com.aliyun.core.annotation.NameInMap("UseRelativeOutputPaths")
        private Boolean useRelativeOutputPaths;

        private ExecuteOptions(Builder builder) {
            this.callCaching = builder.callCaching;
            this.deleteIntermediateResults = builder.deleteIntermediateResults;
            this.failureMode = builder.failureMode;
            this.useRelativeOutputPaths = builder.useRelativeOutputPaths;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExecuteOptions create() {
            return builder().build();
        }

        /**
         * @return callCaching
         */
        public Boolean getCallCaching() {
            return this.callCaching;
        }

        /**
         * @return deleteIntermediateResults
         */
        public Boolean getDeleteIntermediateResults() {
            return this.deleteIntermediateResults;
        }

        /**
         * @return failureMode
         */
        public String getFailureMode() {
            return this.failureMode;
        }

        /**
         * @return useRelativeOutputPaths
         */
        public Boolean getUseRelativeOutputPaths() {
            return this.useRelativeOutputPaths;
        }

        public static final class Builder {
            private Boolean callCaching; 
            private Boolean deleteIntermediateResults; 
            private String failureMode; 
            private Boolean useRelativeOutputPaths; 

            /**
             * CallCaching.
             */
            public Builder callCaching(Boolean callCaching) {
                this.callCaching = callCaching;
                return this;
            }

            /**
             * DeleteIntermediateResults.
             */
            public Builder deleteIntermediateResults(Boolean deleteIntermediateResults) {
                this.deleteIntermediateResults = deleteIntermediateResults;
                return this;
            }

            /**
             * FailureMode.
             */
            public Builder failureMode(String failureMode) {
                this.failureMode = failureMode;
                return this;
            }

            /**
             * UseRelativeOutputPaths.
             */
            public Builder useRelativeOutputPaths(Boolean useRelativeOutputPaths) {
                this.useRelativeOutputPaths = useRelativeOutputPaths;
                return this;
            }

            public ExecuteOptions build() {
                return new ExecuteOptions(this);
            } 

        } 

    }
    public static class Runs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppRevision")
        private String appRevision;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DefaultRuntime")
        private String defaultRuntime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("EntityName")
        private String entityName;

        @com.aliyun.core.annotation.NameInMap("EntityType")
        private String entityType;

        @com.aliyun.core.annotation.NameInMap("ExecuteDirectory")
        private String executeDirectory;

        @com.aliyun.core.annotation.NameInMap("ExecuteOptions")
        private ExecuteOptions executeOptions;

        @com.aliyun.core.annotation.NameInMap("Inputs")
        private String inputs;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.Map < String, String > labels;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RunId")
        private String runId;

        @com.aliyun.core.annotation.NameInMap("RunName")
        private String runName;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubmissionId")
        private String submissionId;

        @com.aliyun.core.annotation.NameInMap("Workspace")
        private String workspace;

        private Runs(Builder builder) {
            this.appName = builder.appName;
            this.appRevision = builder.appRevision;
            this.createTime = builder.createTime;
            this.defaultRuntime = builder.defaultRuntime;
            this.endTime = builder.endTime;
            this.entityName = builder.entityName;
            this.entityType = builder.entityType;
            this.executeDirectory = builder.executeDirectory;
            this.executeOptions = builder.executeOptions;
            this.inputs = builder.inputs;
            this.labels = builder.labels;
            this.regionId = builder.regionId;
            this.runId = builder.runId;
            this.runName = builder.runName;
            this.source = builder.source;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.submissionId = builder.submissionId;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Runs create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return appRevision
         */
        public String getAppRevision() {
            return this.appRevision;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return defaultRuntime
         */
        public String getDefaultRuntime() {
            return this.defaultRuntime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return entityName
         */
        public String getEntityName() {
            return this.entityName;
        }

        /**
         * @return entityType
         */
        public String getEntityType() {
            return this.entityType;
        }

        /**
         * @return executeDirectory
         */
        public String getExecuteDirectory() {
            return this.executeDirectory;
        }

        /**
         * @return executeOptions
         */
        public ExecuteOptions getExecuteOptions() {
            return this.executeOptions;
        }

        /**
         * @return inputs
         */
        public String getInputs() {
            return this.inputs;
        }

        /**
         * @return labels
         */
        public java.util.Map < String, String > getLabels() {
            return this.labels;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return runId
         */
        public String getRunId() {
            return this.runId;
        }

        /**
         * @return runName
         */
        public String getRunName() {
            return this.runName;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return submissionId
         */
        public String getSubmissionId() {
            return this.submissionId;
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private String appName; 
            private String appRevision; 
            private String createTime; 
            private String defaultRuntime; 
            private String endTime; 
            private String entityName; 
            private String entityType; 
            private String executeDirectory; 
            private ExecuteOptions executeOptions; 
            private String inputs; 
            private java.util.Map < String, String > labels; 
            private String regionId; 
            private String runId; 
            private String runName; 
            private String source; 
            private String startTime; 
            private String status; 
            private String submissionId; 
            private String workspace; 

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * AppRevision.
             */
            public Builder appRevision(String appRevision) {
                this.appRevision = appRevision;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DefaultRuntime.
             */
            public Builder defaultRuntime(String defaultRuntime) {
                this.defaultRuntime = defaultRuntime;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * EntityName.
             */
            public Builder entityName(String entityName) {
                this.entityName = entityName;
                return this;
            }

            /**
             * EntityType.
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * ExecuteDirectory.
             */
            public Builder executeDirectory(String executeDirectory) {
                this.executeDirectory = executeDirectory;
                return this;
            }

            /**
             * ExecuteOptions.
             */
            public Builder executeOptions(ExecuteOptions executeOptions) {
                this.executeOptions = executeOptions;
                return this;
            }

            /**
             * Inputs.
             */
            public Builder inputs(String inputs) {
                this.inputs = inputs;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(java.util.Map < String, String > labels) {
                this.labels = labels;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RunId.
             */
            public Builder runId(String runId) {
                this.runId = runId;
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
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SubmissionId.
             */
            public Builder submissionId(String submissionId) {
                this.submissionId = submissionId;
                return this;
            }

            /**
             * Workspace.
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public Runs build() {
                return new Runs(this);
            } 

        } 

    }
}
