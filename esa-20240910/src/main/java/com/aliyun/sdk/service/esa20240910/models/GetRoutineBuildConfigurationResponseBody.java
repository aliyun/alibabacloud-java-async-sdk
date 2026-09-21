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
 * {@link GetRoutineBuildConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>GetRoutineBuildConfigurationResponseBody</p>
 */
public class GetRoutineBuildConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssetsDirectory")
    private String assetsDirectory;

    @com.aliyun.core.annotation.NameInMap("BuildBranches")
    private String buildBranches;

    @com.aliyun.core.annotation.NameInMap("BuildCommand")
    private String buildCommand;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("EnvironmentVariables")
    private java.util.Map<String, String> environmentVariables;

    @com.aliyun.core.annotation.NameInMap("GitAccountId")
    private Long gitAccountId;

    @com.aliyun.core.annotation.NameInMap("GitAccountType")
    private String gitAccountType;

    @com.aliyun.core.annotation.NameInMap("GitPlatform")
    private String gitPlatform;

    @com.aliyun.core.annotation.NameInMap("InstallCommand")
    private String installCommand;

    @com.aliyun.core.annotation.NameInMap("IsPrivate")
    private Boolean isPrivate;

    @com.aliyun.core.annotation.NameInMap("NodeVersion")
    private String nodeVersion;

    @com.aliyun.core.annotation.NameInMap("ProductionBranch")
    private String productionBranch;

    @com.aliyun.core.annotation.NameInMap("Repository")
    private String repository;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RootDirectory")
    private String rootDirectory;

    @com.aliyun.core.annotation.NameInMap("RoutineBuildConfigurationId")
    private Long routineBuildConfigurationId;

    @com.aliyun.core.annotation.NameInMap("RoutineEntry")
    private String routineEntry;

    @com.aliyun.core.annotation.NameInMap("RoutineName")
    private String routineName;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    private GetRoutineBuildConfigurationResponseBody(Builder builder) {
        this.assetsDirectory = builder.assetsDirectory;
        this.buildBranches = builder.buildBranches;
        this.buildCommand = builder.buildCommand;
        this.createTime = builder.createTime;
        this.environmentVariables = builder.environmentVariables;
        this.gitAccountId = builder.gitAccountId;
        this.gitAccountType = builder.gitAccountType;
        this.gitPlatform = builder.gitPlatform;
        this.installCommand = builder.installCommand;
        this.isPrivate = builder.isPrivate;
        this.nodeVersion = builder.nodeVersion;
        this.productionBranch = builder.productionBranch;
        this.repository = builder.repository;
        this.requestId = builder.requestId;
        this.rootDirectory = builder.rootDirectory;
        this.routineBuildConfigurationId = builder.routineBuildConfigurationId;
        this.routineEntry = builder.routineEntry;
        this.routineName = builder.routineName;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRoutineBuildConfigurationResponseBody create() {
        return builder().build();
    }

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
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
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
     * @return gitAccountType
     */
    public String getGitAccountType() {
        return this.gitAccountType;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rootDirectory
     */
    public String getRootDirectory() {
        return this.rootDirectory;
    }

    /**
     * @return routineBuildConfigurationId
     */
    public Long getRoutineBuildConfigurationId() {
        return this.routineBuildConfigurationId;
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
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String assetsDirectory; 
        private String buildBranches; 
        private String buildCommand; 
        private String createTime; 
        private java.util.Map<String, String> environmentVariables; 
        private Long gitAccountId; 
        private String gitAccountType; 
        private String gitPlatform; 
        private String installCommand; 
        private Boolean isPrivate; 
        private String nodeVersion; 
        private String productionBranch; 
        private String repository; 
        private String requestId; 
        private String rootDirectory; 
        private Long routineBuildConfigurationId; 
        private String routineEntry; 
        private String routineName; 
        private String updateTime; 

        private Builder() {
        } 

        private Builder(GetRoutineBuildConfigurationResponseBody model) {
            this.assetsDirectory = model.assetsDirectory;
            this.buildBranches = model.buildBranches;
            this.buildCommand = model.buildCommand;
            this.createTime = model.createTime;
            this.environmentVariables = model.environmentVariables;
            this.gitAccountId = model.gitAccountId;
            this.gitAccountType = model.gitAccountType;
            this.gitPlatform = model.gitPlatform;
            this.installCommand = model.installCommand;
            this.isPrivate = model.isPrivate;
            this.nodeVersion = model.nodeVersion;
            this.productionBranch = model.productionBranch;
            this.repository = model.repository;
            this.requestId = model.requestId;
            this.rootDirectory = model.rootDirectory;
            this.routineBuildConfigurationId = model.routineBuildConfigurationId;
            this.routineEntry = model.routineEntry;
            this.routineName = model.routineName;
            this.updateTime = model.updateTime;
        } 

        /**
         * <p>The static assets directory.</p>
         * 
         * <strong>example:</strong>
         * <p>/root/usr</p>
         */
        public Builder assetsDirectory(String assetsDirectory) {
            this.assetsDirectory = assetsDirectory;
            return this;
        }

        /**
         * <p>The branches that trigger builds. A value of * indicates all branches. Multiple specific branches are separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>int,abc</p>
         */
        public Builder buildBranches(String buildBranches) {
            this.buildBranches = buildBranches;
            return this;
        }

        /**
         * <p>The build command.</p>
         * 
         * <strong>example:</strong>
         * <p>npm run build</p>
         */
        public Builder buildCommand(String buildCommand) {
            this.buildCommand = buildCommand;
            return this;
        }

        /**
         * <p>The creation time, in ISO 8601 format using UTC time. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-11T01:23:21Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The environment variables.</p>
         */
        public Builder environmentVariables(java.util.Map<String, String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * <p>The Git account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4695144764942144</p>
         */
        public Builder gitAccountId(Long gitAccountId) {
            this.gitAccountId = gitAccountId;
            return this;
        }

        /**
         * <p>The Git account type. Valid values:</p>
         * <ul>
         * <li>User: individual account.</li>
         * <li>Organization: organization account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>User</p>
         */
        public Builder gitAccountType(String gitAccountType) {
            this.gitAccountType = gitAccountType;
            return this;
        }

        /**
         * <p>The Git platform.</p>
         * 
         * <strong>example:</strong>
         * <p>github</p>
         */
        public Builder gitPlatform(String gitPlatform) {
            this.gitPlatform = gitPlatform;
            return this;
        }

        /**
         * <p>The install command.</p>
         * 
         * <strong>example:</strong>
         * <p>npm install</p>
         */
        public Builder installCommand(String installCommand) {
            this.installCommand = installCommand;
            return this;
        }

        /**
         * <p>Indicates whether the repository is private. Valid values:</p>
         * <ul>
         * <li>true: The repository is private.</li>
         * <li>false: The repository is not private.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isPrivate(Boolean isPrivate) {
            this.isPrivate = isPrivate;
            return this;
        }

        /**
         * <p>The Node.js version.</p>
         * 
         * <strong>example:</strong>
         * <p>22.x</p>
         */
        public Builder nodeVersion(String nodeVersion) {
            this.nodeVersion = nodeVersion;
            return this;
        }

        /**
         * <p>The production branch name.</p>
         * 
         * <strong>example:</strong>
         * <p>main</p>
         */
        public Builder productionBranch(String productionBranch) {
            this.productionBranch = productionBranch;
            return this;
        }

        /**
         * <p>The repository name.</p>
         * 
         * <strong>example:</strong>
         * <p>example-test</p>
         */
        public Builder repository(String repository) {
            this.repository = repository;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D1D7BBB5-9B5B-5A29-8848-398F3CA18A8A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The root directory.</p>
         * 
         * <strong>example:</strong>
         * <p>/root/admin</p>
         */
        public Builder rootDirectory(String rootDirectory) {
            this.rootDirectory = rootDirectory;
            return this;
        }

        /**
         * <p>The ER build configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3472165674357056</p>
         */
        public Builder routineBuildConfigurationId(Long routineBuildConfigurationId) {
            this.routineBuildConfigurationId = routineBuildConfigurationId;
            return this;
        }

        /**
         * <p>The ER entry file path.</p>
         * 
         * <strong>example:</strong>
         * <p>/home</p>
         */
        public Builder routineEntry(String routineEntry) {
            this.routineEntry = routineEntry;
            return this;
        }

        /**
         * <p>The ER name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-routine</p>
         */
        public Builder routineName(String routineName) {
            this.routineName = routineName;
            return this;
        }

        /**
         * <p>The modification time, in ISO 8601 format using UTC time. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-19T11:15:20Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetRoutineBuildConfigurationResponseBody build() {
            return new GetRoutineBuildConfigurationResponseBody(this);
        } 

    } 

}
