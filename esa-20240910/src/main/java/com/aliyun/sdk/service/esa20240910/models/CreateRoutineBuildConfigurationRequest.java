// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link CreateRoutineBuildConfigurationRequest} extends {@link RequestModel}
 *
 * <p>CreateRoutineBuildConfigurationRequest</p>
 */
public class CreateRoutineBuildConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetsDirectory")
    @com.aliyun.core.annotation.Validation(maxLength = 255)
    private String assetsDirectory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BuildBranches")
    @com.aliyun.core.annotation.Validation(maxLength = 2048)
    private String buildBranches;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BuildCommand")
    @com.aliyun.core.annotation.Validation(maxLength = 512)
    private String buildCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvironmentVariables")
    private java.util.Map<String, String> environmentVariables;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GitAccountId")
    private Long gitAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GitPlatform")
    private String gitPlatform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstallCommand")
    private String installCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsPrivate")
    private Boolean isPrivate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeVersion")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 32)
    private String nodeVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductionBranch")
    @com.aliyun.core.annotation.Validation(maxLength = 255)
    private String productionBranch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Repository")
    @com.aliyun.core.annotation.Validation(maxLength = 100)
    private String repository;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RootDirectory")
    @com.aliyun.core.annotation.Validation(maxLength = 255)
    private String rootDirectory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoutineEntry")
    @com.aliyun.core.annotation.Validation(maxLength = 255)
    private String routineEntry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoutineName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String routineName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    private CreateRoutineBuildConfigurationRequest(Builder builder) {
        super(builder);
        this.assetsDirectory = builder.assetsDirectory;
        this.buildBranches = builder.buildBranches;
        this.buildCommand = builder.buildCommand;
        this.environmentVariables = builder.environmentVariables;
        this.gitAccountId = builder.gitAccountId;
        this.gitPlatform = builder.gitPlatform;
        this.installCommand = builder.installCommand;
        this.isPrivate = builder.isPrivate;
        this.nodeVersion = builder.nodeVersion;
        this.productionBranch = builder.productionBranch;
        this.repository = builder.repository;
        this.rootDirectory = builder.rootDirectory;
        this.routineEntry = builder.routineEntry;
        this.routineName = builder.routineName;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRoutineBuildConfigurationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetsDirectory
     */
    public String getAssetsDirectory() {
        return this.assetsDirectory;
    }

    /**
     * @return buildBranches
     */
    public String getBuildBranches() {
        return this.buildBranches;
    }

    /**
     * @return buildCommand
     */
    public String getBuildCommand() {
        return this.buildCommand;
    }

    /**
     * @return environmentVariables
     */
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    /**
     * @return gitAccountId
     */
    public Long getGitAccountId() {
        return this.gitAccountId;
    }

    /**
     * @return gitPlatform
     */
    public String getGitPlatform() {
        return this.gitPlatform;
    }

    /**
     * @return installCommand
     */
    public String getInstallCommand() {
        return this.installCommand;
    }

    /**
     * @return isPrivate
     */
    public Boolean getIsPrivate() {
        return this.isPrivate;
    }

    /**
     * @return nodeVersion
     */
    public String getNodeVersion() {
        return this.nodeVersion;
    }

    /**
     * @return productionBranch
     */
    public String getProductionBranch() {
        return this.productionBranch;
    }

    /**
     * @return repository
     */
    public String getRepository() {
        return this.repository;
    }

    /**
     * @return rootDirectory
     */
    public String getRootDirectory() {
        return this.rootDirectory;
    }

    /**
     * @return routineEntry
     */
    public String getRoutineEntry() {
        return this.routineEntry;
    }

    /**
     * @return routineName
     */
    public String getRoutineName() {
        return this.routineName;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    public static final class Builder extends Request.Builder<CreateRoutineBuildConfigurationRequest, Builder> {
        private String assetsDirectory; 
        private String buildBranches; 
        private String buildCommand; 
        private java.util.Map<String, String> environmentVariables; 
        private Long gitAccountId; 
        private String gitPlatform; 
        private String installCommand; 
        private Boolean isPrivate; 
        private String nodeVersion; 
        private String productionBranch; 
        private String repository; 
        private String rootDirectory; 
        private String routineEntry; 
        private String routineName; 
        private String templateName; 

        private Builder() {
            super();
        } 

        private Builder(CreateRoutineBuildConfigurationRequest request) {
            super(request);
            this.assetsDirectory = request.assetsDirectory;
            this.buildBranches = request.buildBranches;
            this.buildCommand = request.buildCommand;
            this.environmentVariables = request.environmentVariables;
            this.gitAccountId = request.gitAccountId;
            this.gitPlatform = request.gitPlatform;
            this.installCommand = request.installCommand;
            this.isPrivate = request.isPrivate;
            this.nodeVersion = request.nodeVersion;
            this.productionBranch = request.productionBranch;
            this.repository = request.repository;
            this.rootDirectory = request.rootDirectory;
            this.routineEntry = request.routineEntry;
            this.routineName = request.routineName;
            this.templateName = request.templateName;
        } 

        /**
         * AssetsDirectory.
         */
        public Builder assetsDirectory(String assetsDirectory) {
            this.putQueryParameter("AssetsDirectory", assetsDirectory);
            this.assetsDirectory = assetsDirectory;
            return this;
        }

        /**
         * BuildBranches.
         */
        public Builder buildBranches(String buildBranches) {
            this.putQueryParameter("BuildBranches", buildBranches);
            this.buildBranches = buildBranches;
            return this;
        }

        /**
         * BuildCommand.
         */
        public Builder buildCommand(String buildCommand) {
            this.putQueryParameter("BuildCommand", buildCommand);
            this.buildCommand = buildCommand;
            return this;
        }

        /**
         * EnvironmentVariables.
         */
        public Builder environmentVariables(java.util.Map<String, String> environmentVariables) {
            String environmentVariablesShrink = shrink(environmentVariables, "EnvironmentVariables", "json");
            this.putQueryParameter("EnvironmentVariables", environmentVariablesShrink);
            this.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * GitAccountId.
         */
        public Builder gitAccountId(Long gitAccountId) {
            this.putQueryParameter("GitAccountId", gitAccountId);
            this.gitAccountId = gitAccountId;
            return this;
        }

        /**
         * GitPlatform.
         */
        public Builder gitPlatform(String gitPlatform) {
            this.putQueryParameter("GitPlatform", gitPlatform);
            this.gitPlatform = gitPlatform;
            return this;
        }

        /**
         * InstallCommand.
         */
        public Builder installCommand(String installCommand) {
            this.putQueryParameter("InstallCommand", installCommand);
            this.installCommand = installCommand;
            return this;
        }

        /**
         * IsPrivate.
         */
        public Builder isPrivate(Boolean isPrivate) {
            this.putQueryParameter("IsPrivate", isPrivate);
            this.isPrivate = isPrivate;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>22.x</p>
         */
        public Builder nodeVersion(String nodeVersion) {
            this.putQueryParameter("NodeVersion", nodeVersion);
            this.nodeVersion = nodeVersion;
            return this;
        }

        /**
         * ProductionBranch.
         */
        public Builder productionBranch(String productionBranch) {
            this.putQueryParameter("ProductionBranch", productionBranch);
            this.productionBranch = productionBranch;
            return this;
        }

        /**
         * Repository.
         */
        public Builder repository(String repository) {
            this.putQueryParameter("Repository", repository);
            this.repository = repository;
            return this;
        }

        /**
         * RootDirectory.
         */
        public Builder rootDirectory(String rootDirectory) {
            this.putQueryParameter("RootDirectory", rootDirectory);
            this.rootDirectory = rootDirectory;
            return this;
        }

        /**
         * RoutineEntry.
         */
        public Builder routineEntry(String routineEntry) {
            this.putQueryParameter("RoutineEntry", routineEntry);
            this.routineEntry = routineEntry;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rwa-test</p>
         */
        public Builder routineName(String routineName) {
            this.putQueryParameter("RoutineName", routineName);
            this.routineName = routineName;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        @Override
        public CreateRoutineBuildConfigurationRequest build() {
            return new CreateRoutineBuildConfigurationRequest(this);
        } 

    } 

}
