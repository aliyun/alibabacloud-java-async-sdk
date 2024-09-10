// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSubmissionRequest} extends {@link RequestModel}
 *
 * <p>CreateSubmissionRequest</p>
 */
public class CreateSubmissionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultRuntime")
    private String defaultRuntime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityNames")
    private java.util.List < String > entityNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String entityType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecuteDirectory")
    private String executeDirectory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecuteOptions")
    private String executeOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Inputs")
    private String inputs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputFolder")
    private String outputFolder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Outputs")
    private String outputs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Revision")
    @com.aliyun.core.annotation.Validation()
    private String revision;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RevisionTag")
    private String revisionTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private CreateSubmissionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appName = builder.appName;
        this.clientToken = builder.clientToken;
        this.defaultRuntime = builder.defaultRuntime;
        this.entityNames = builder.entityNames;
        this.entityType = builder.entityType;
        this.executeDirectory = builder.executeDirectory;
        this.executeOptions = builder.executeOptions;
        this.inputs = builder.inputs;
        this.outputFolder = builder.outputFolder;
        this.outputs = builder.outputs;
        this.revision = builder.revision;
        this.revisionTag = builder.revisionTag;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSubmissionRequest create() {
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
     * @return entityNames
     */
    public java.util.List < String > getEntityNames() {
        return this.entityNames;
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
    public String getExecuteOptions() {
        return this.executeOptions;
    }

    /**
     * @return inputs
     */
    public String getInputs() {
        return this.inputs;
    }

    /**
     * @return outputFolder
     */
    public String getOutputFolder() {
        return this.outputFolder;
    }

    /**
     * @return outputs
     */
    public String getOutputs() {
        return this.outputs;
    }

    /**
     * @return revision
     */
    public String getRevision() {
        return this.revision;
    }

    /**
     * @return revisionTag
     */
    public String getRevisionTag() {
        return this.revisionTag;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<CreateSubmissionRequest, Builder> {
        private String regionId; 
        private String appName; 
        private String clientToken; 
        private String defaultRuntime; 
        private java.util.List < String > entityNames; 
        private String entityType; 
        private String executeDirectory; 
        private String executeOptions; 
        private String inputs; 
        private String outputFolder; 
        private String outputs; 
        private String revision; 
        private String revisionTag; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(CreateSubmissionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appName = request.appName;
            this.clientToken = request.clientToken;
            this.defaultRuntime = request.defaultRuntime;
            this.entityNames = request.entityNames;
            this.entityType = request.entityType;
            this.executeDirectory = request.executeDirectory;
            this.executeOptions = request.executeOptions;
            this.inputs = request.inputs;
            this.outputFolder = request.outputFolder;
            this.outputs = request.outputs;
            this.revision = request.revision;
            this.revisionTag = request.revisionTag;
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
         * EntityNames.
         */
        public Builder entityNames(java.util.List < String > entityNames) {
            String entityNamesShrink = shrink(entityNames, "EntityNames", "json");
            this.putQueryParameter("EntityNames", entityNamesShrink);
            this.entityNames = entityNames;
            return this;
        }

        /**
         * EntityType.
         */
        public Builder entityType(String entityType) {
            this.putQueryParameter("EntityType", entityType);
            this.entityType = entityType;
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
        public Builder executeOptions(String executeOptions) {
            this.putQueryParameter("ExecuteOptions", executeOptions);
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
         * OutputFolder.
         */
        public Builder outputFolder(String outputFolder) {
            this.putQueryParameter("OutputFolder", outputFolder);
            this.outputFolder = outputFolder;
            return this;
        }

        /**
         * Outputs.
         */
        public Builder outputs(String outputs) {
            this.putQueryParameter("Outputs", outputs);
            this.outputs = outputs;
            return this;
        }

        /**
         * Revision.
         */
        public Builder revision(String revision) {
            this.putQueryParameter("Revision", revision);
            this.revision = revision;
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
         * Workspace.
         */
        public Builder workspace(String workspace) {
            this.putQueryParameter("Workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public CreateSubmissionRequest build() {
            return new CreateSubmissionRequest(this);
        } 

    } 

}
