// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRunRequest} extends {@link RequestModel}
 *
 * <p>CreateRunRequest</p>
 */
public class CreateRunRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppRevision")
    @com.aliyun.core.annotation.Validation()
    private String appRevision;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultRuntime")
    private String defaultRuntime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecuteDirectory")
    private String executeDirectory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecuteOptions")
    private ExecuteOptions executeOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Inputs")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Labels")
    private String labels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputFolder")
    private String outputFolder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RevisionTag")
    private String revisionTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Role")
    private String role;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RunName")
    private String runName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private CreateRunRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appName = builder.appName;
        this.appRevision = builder.appRevision;
        this.clientToken = builder.clientToken;
        this.defaultRuntime = builder.defaultRuntime;
        this.description = builder.description;
        this.executeDirectory = builder.executeDirectory;
        this.executeOptions = builder.executeOptions;
        this.inputs = builder.inputs;
        this.labels = builder.labels;
        this.outputFolder = builder.outputFolder;
        this.revisionTag = builder.revisionTag;
        this.role = builder.role;
        this.runName = builder.runName;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRunRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return defaultRuntime
     */
    public String getDefaultRuntime() {
        return this.defaultRuntime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
    public String getLabels() {
        return this.labels;
    }

    /**
     * @return outputFolder
     */
    public String getOutputFolder() {
        return this.outputFolder;
    }

    /**
     * @return revisionTag
     */
    public String getRevisionTag() {
        return this.revisionTag;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return runName
     */
    public String getRunName() {
        return this.runName;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<CreateRunRequest, Builder> {
        private String regionId; 
        private String appName; 
        private String appRevision; 
        private String clientToken; 
        private String defaultRuntime; 
        private String description; 
        private String executeDirectory; 
        private ExecuteOptions executeOptions; 
        private String inputs; 
        private String labels; 
        private String outputFolder; 
        private String revisionTag; 
        private String role; 
        private String runName; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(CreateRunRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appName = request.appName;
            this.appRevision = request.appRevision;
            this.clientToken = request.clientToken;
            this.defaultRuntime = request.defaultRuntime;
            this.description = request.description;
            this.executeDirectory = request.executeDirectory;
            this.executeOptions = request.executeOptions;
            this.inputs = request.inputs;
            this.labels = request.labels;
            this.outputFolder = request.outputFolder;
            this.revisionTag = request.revisionTag;
            this.role = request.role;
            this.runName = request.runName;
            this.workspace = request.workspace;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * AppRevision.
         */
        public Builder appRevision(String appRevision) {
            this.putQueryParameter("AppRevision", appRevision);
            this.appRevision = appRevision;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DefaultRuntime.
         */
        public Builder defaultRuntime(String defaultRuntime) {
            this.putQueryParameter("DefaultRuntime", defaultRuntime);
            this.defaultRuntime = defaultRuntime;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * ExecuteDirectory.
         */
        public Builder executeDirectory(String executeDirectory) {
            this.putQueryParameter("ExecuteDirectory", executeDirectory);
            this.executeDirectory = executeDirectory;
            return this;
        }

        /**
         * ExecuteOptions.
         */
        public Builder executeOptions(ExecuteOptions executeOptions) {
            String executeOptionsShrink = shrink(executeOptions, "ExecuteOptions", "json");
            this.putQueryParameter("ExecuteOptions", executeOptionsShrink);
            this.executeOptions = executeOptions;
            return this;
        }

        /**
         * Inputs.
         */
        public Builder inputs(String inputs) {
            this.putQueryParameter("Inputs", inputs);
            this.inputs = inputs;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(String labels) {
            this.putQueryParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * OutputFolder.
         */
        public Builder outputFolder(String outputFolder) {
            this.putQueryParameter("OutputFolder", outputFolder);
            this.outputFolder = outputFolder;
            return this;
        }

        /**
         * RevisionTag.
         */
        public Builder revisionTag(String revisionTag) {
            this.putQueryParameter("RevisionTag", revisionTag);
            this.revisionTag = revisionTag;
            return this;
        }

        /**
         * Role.
         */
        public Builder role(String role) {
            this.putQueryParameter("Role", role);
            this.role = role;
            return this;
        }

        /**
         * RunName.
         */
        public Builder runName(String runName) {
            this.putQueryParameter("RunName", runName);
            this.runName = runName;
            return this;
        }

        /**
         * Workspace.
         */
        public Builder workspace(String workspace) {
            this.putQueryParameter("Workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public CreateRunRequest build() {
            return new CreateRunRequest(this);
        } 

    } 

    public static class ExecuteOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallCaching")
        private Boolean callCaching;

        @com.aliyun.core.annotation.NameInMap("DataLoader")
        private String dataLoader;

        @com.aliyun.core.annotation.NameInMap("DeleteIntermediateResults")
        private Boolean deleteIntermediateResults;

        @com.aliyun.core.annotation.NameInMap("FailureMode")
        private String failureMode;

        @com.aliyun.core.annotation.NameInMap("UseRelativeOutputPaths")
        private Boolean useRelativeOutputPaths;

        private ExecuteOptions(Builder builder) {
            this.callCaching = builder.callCaching;
            this.dataLoader = builder.dataLoader;
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
         * @return dataLoader
         */
        public String getDataLoader() {
            return this.dataLoader;
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
            private String dataLoader; 
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
             * DataLoader.
             */
            public Builder dataLoader(String dataLoader) {
                this.dataLoader = dataLoader;
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
}
