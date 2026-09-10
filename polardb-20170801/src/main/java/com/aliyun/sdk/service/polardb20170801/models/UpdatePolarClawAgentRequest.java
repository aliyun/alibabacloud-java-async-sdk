// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link UpdatePolarClawAgentRequest} extends {@link RequestModel}
 *
 * <p>UpdatePolarClawAgentRequest</p>
 */
public class UpdatePolarClawAgentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Avatar")
    private String avatar;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Files")
    private java.util.List<Files> files;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsDefault")
    private Boolean isDefault;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeepWorkspaceFiles")
    private Boolean keepWorkspaceFiles;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Restart")
    private Boolean restart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Workspace")
    private String workspace;

    private UpdatePolarClawAgentRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.applicationId = builder.applicationId;
        this.avatar = builder.avatar;
        this.files = builder.files;
        this.isDefault = builder.isDefault;
        this.keepWorkspaceFiles = builder.keepWorkspaceFiles;
        this.model = builder.model;
        this.name = builder.name;
        this.restart = builder.restart;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePolarClawAgentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return avatar
     */
    public String getAvatar() {
        return this.avatar;
    }

    /**
     * @return files
     */
    public java.util.List<Files> getFiles() {
        return this.files;
    }

    /**
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * @return keepWorkspaceFiles
     */
    public Boolean getKeepWorkspaceFiles() {
        return this.keepWorkspaceFiles;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return restart
     */
    public Boolean getRestart() {
        return this.restart;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<UpdatePolarClawAgentRequest, Builder> {
        private String agentId; 
        private String applicationId; 
        private String avatar; 
        private java.util.List<Files> files; 
        private Boolean isDefault; 
        private Boolean keepWorkspaceFiles; 
        private String model; 
        private String name; 
        private Boolean restart; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePolarClawAgentRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.applicationId = request.applicationId;
            this.avatar = request.avatar;
            this.files = request.files;
            this.isDefault = request.isDefault;
            this.keepWorkspaceFiles = request.keepWorkspaceFiles;
            this.model = request.model;
            this.name = request.name;
            this.restart = request.restart;
            this.workspace = request.workspace;
        } 

        /**
         * <p>The ID of the agent to update.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>work</p>
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The new avatar.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder avatar(String avatar) {
            this.putQueryParameter("Avatar", avatar);
            this.avatar = avatar;
            return this;
        }

        /**
         * <p>The list of files to update.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;FileName&quot;:&quot;SOUL.md&quot;,&quot;FileContent&quot;:&quot;You are a helpful assistant.&quot;}]</p>
         */
        public Builder files(java.util.List<Files> files) {
            String filesShrink = shrink(files, "Files", "json");
            this.putQueryParameter("Files", filesShrink);
            this.files = files;
            return this;
        }

        /**
         * <p>Specifies whether to set the agent as the default agent.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isDefault(Boolean isDefault) {
            this.putQueryParameter("IsDefault", isDefault);
            this.isDefault = isDefault;
            return this;
        }

        /**
         * <p>Specifies whether to keep files when switching the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder keepWorkspaceFiles(Boolean keepWorkspaceFiles) {
            this.putQueryParameter("KeepWorkspaceFiles", keepWorkspaceFiles);
            this.keepWorkspaceFiles = keepWorkspaceFiles;
            return this;
        }

        /**
         * <p>The model override.</p>
         * 
         * <strong>example:</strong>
         * <p>claude-sonnet-4-5</p>
         */
        public Builder model(String model) {
            this.putQueryParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>The new display name of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>Work Bot</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>Specifies whether to restart the gateway after creation. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder restart(Boolean restart) {
            this.putQueryParameter("Restart", restart);
            this.restart = restart;
            return this;
        }

        /**
         * <p>The new working directory path.</p>
         * 
         * <strong>example:</strong>
         * <p>/home/node/.openclaw/workspace-work-v2</p>
         */
        public Builder workspace(String workspace) {
            this.putQueryParameter("Workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public UpdatePolarClawAgentRequest build() {
            return new UpdatePolarClawAgentRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdatePolarClawAgentRequest} extends {@link TeaModel}
     *
     * <p>UpdatePolarClawAgentRequest</p>
     */
    public static class Files extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileContent")
        private String fileContent;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        private Files(Builder builder) {
            this.fileContent = builder.fileContent;
            this.fileName = builder.fileName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Files create() {
            return builder().build();
        }

        /**
         * @return fileContent
         */
        public String getFileContent() {
            return this.fileContent;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        public static final class Builder {
            private String fileContent; 
            private String fileName; 

            private Builder() {
            } 

            private Builder(Files model) {
                this.fileContent = model.fileContent;
                this.fileName = model.fileName;
            } 

            /**
             * <p>The file content.</p>
             * 
             * <strong>example:</strong>
             * <p>You are a helpful assistant.</p>
             */
            public Builder fileContent(String fileContent) {
                this.fileContent = fileContent;
                return this;
            }

            /**
             * <p>The file name. The value must be one of the following allowed file names: AGENTS.md, SOUL.md, TOOLS.md, IDENTITY.md, USER.md, HEARTBEAT.md, BOOTSTRAP.md, MEMORY.md, or MEMORY.alt.md.</p>
             * 
             * <strong>example:</strong>
             * <p>SOUL.md</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            public Files build() {
                return new Files(this);
            } 

        } 

    }
}
