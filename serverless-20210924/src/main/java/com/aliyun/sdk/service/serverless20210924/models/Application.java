// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Application} extends {@link TeaModel}
 *
 * <p>Application</p>
 */
public class Application extends TeaModel {
    @NameInMap("autoDeploy")
    private String autoDeploy;

    @NameInMap("createdTime")
    private String createdTime;

    @NameInMap("description")
    private String description;

    @NameInMap("envVars")
    private java.util.Map < String, ? > envVars;

    @NameInMap("lastRelease")
    private java.util.Map < String, ? > lastRelease;

    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @NameInMap("output")
    private java.util.Map < String, ? > output;

    @NameInMap("parameters")
    private java.util.Map < String, ? > parameters;

    @NameInMap("repoSource")
    private RepoSource repoSource;

    @NameInMap("roleArn")
    private String roleArn;

    @NameInMap("template")
    private String template;

    @NameInMap("trigger")
    private Trigger trigger;

    @NameInMap("updatedTime")
    private String updatedTime;

    @NameInMap("workDir")
    private String workDir;

    private Application(Builder builder) {
        this.autoDeploy = builder.autoDeploy;
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.envVars = builder.envVars;
        this.lastRelease = builder.lastRelease;
        this.name = builder.name;
        this.output = builder.output;
        this.parameters = builder.parameters;
        this.repoSource = builder.repoSource;
        this.roleArn = builder.roleArn;
        this.template = builder.template;
        this.trigger = builder.trigger;
        this.updatedTime = builder.updatedTime;
        this.workDir = builder.workDir;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Application create() {
        return builder().build();
    }

    /**
     * @return autoDeploy
     */
    public String getAutoDeploy() {
        return this.autoDeploy;
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return envVars
     */
    public java.util.Map < String, ? > getEnvVars() {
        return this.envVars;
    }

    /**
     * @return lastRelease
     */
    public java.util.Map < String, ? > getLastRelease() {
        return this.lastRelease;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return output
     */
    public java.util.Map < String, ? > getOutput() {
        return this.output;
    }

    /**
     * @return parameters
     */
    public java.util.Map < String, ? > getParameters() {
        return this.parameters;
    }

    /**
     * @return repoSource
     */
    public RepoSource getRepoSource() {
        return this.repoSource;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return template
     */
    public String getTemplate() {
        return this.template;
    }

    /**
     * @return trigger
     */
    public Trigger getTrigger() {
        return this.trigger;
    }

    /**
     * @return updatedTime
     */
    public String getUpdatedTime() {
        return this.updatedTime;
    }

    /**
     * @return workDir
     */
    public String getWorkDir() {
        return this.workDir;
    }

    public static final class Builder {
        private String autoDeploy; 
        private String createdTime; 
        private String description; 
        private java.util.Map < String, ? > envVars; 
        private java.util.Map < String, ? > lastRelease; 
        private String name; 
        private java.util.Map < String, ? > output; 
        private java.util.Map < String, ? > parameters; 
        private RepoSource repoSource; 
        private String roleArn; 
        private String template; 
        private Trigger trigger; 
        private String updatedTime; 
        private String workDir; 

        /**
         * 是否立即进行部署
         */
        public Builder autoDeploy(String autoDeploy) {
            this.autoDeploy = autoDeploy;
            return this;
        }

        /**
         * 应用创建时间
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * 应用描述
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * 环境变量
         */
        public Builder envVars(java.util.Map < String, ? > envVars) {
            this.envVars = envVars;
            return this;
        }

        /**
         * 应用最新部署详情
         */
        public Builder lastRelease(java.util.Map < String, ? > lastRelease) {
            this.lastRelease = lastRelease;
            return this;
        }

        /**
         * 应用名称，同账号下唯一，创建后不允许变更
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * 应用资源详情
         */
        public Builder output(java.util.Map < String, ? > output) {
            this.output = output;
            return this;
        }

        /**
         * 应用初始化参数，schema由应用模板所定义
         */
        public Builder parameters(java.util.Map < String, ? > parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * 指定代码仓库为代码源
         */
        public Builder repoSource(RepoSource repoSource) {
            this.repoSource = repoSource;
            return this;
        }

        /**
         * 指定role进行角色扮演
         */
        public Builder roleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * 关联的模板，用于Web应用、模板应用的创建
         */
        public Builder template(String template) {
            this.template = template;
            return this;
        }

        /**
         * 触发配置，不指定表示手动触发
         */
        public Builder trigger(Trigger trigger) {
            this.trigger = trigger;
            return this;
        }

        /**
         * 应用更新时间
         */
        public Builder updatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }

        /**
         * s.yaml所在目录，不指定则默认使用当前目录
         */
        public Builder workDir(String workDir) {
            this.workDir = workDir;
            return this;
        }

        public Application build() {
            return new Application(this);
        } 

    } 

    public static class RepoSource extends TeaModel {
        @NameInMap("owner")
        @Validation(required = true)
        private String owner;

        @NameInMap("provider")
        @Validation(required = true)
        private String provider;

        @NameInMap("repo")
        @Validation(required = true)
        private String repo;

        private RepoSource(Builder builder) {
            this.owner = builder.owner;
            this.provider = builder.provider;
            this.repo = builder.repo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RepoSource create() {
            return builder().build();
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return provider
         */
        public String getProvider() {
            return this.provider;
        }

        /**
         * @return repo
         */
        public String getRepo() {
            return this.repo;
        }

        public static final class Builder {
            private String owner; 
            private String provider; 
            private String repo; 

            /**
             * 代码库owner
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * 代码源VCS
             */
            public Builder provider(String provider) {
                this.provider = provider;
                return this;
            }

            /**
             * 代码库名称
             */
            public Builder repo(String repo) {
                this.repo = repo;
                return this;
            }

            public RepoSource build() {
                return new RepoSource(this);
            } 

        } 

    }
    public static class Trigger extends TeaModel {
        @NameInMap("branch")
        private String branch;

        @NameInMap("commit")
        private String commit;

        @NameInMap("on")
        @Validation(required = true)
        private String on;

        private Trigger(Builder builder) {
            this.branch = builder.branch;
            this.commit = builder.commit;
            this.on = builder.on;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Trigger create() {
            return builder().build();
        }

        /**
         * @return branch
         */
        public String getBranch() {
            return this.branch;
        }

        /**
         * @return commit
         */
        public String getCommit() {
            return this.commit;
        }

        /**
         * @return on
         */
        public String getOn() {
            return this.on;
        }

        public static final class Builder {
            private String branch; 
            private String commit; 
            private String on; 

            /**
             * 代码分支，不指定则使用default分支
             */
            public Builder branch(String branch) {
                this.branch = branch;
                return this;
            }

            /**
             * commit id
             */
            public Builder commit(String commit) {
                this.commit = commit;
                return this;
            }

            /**
             * 触发条件
             */
            public Builder on(String on) {
                this.on = on;
                return this;
            }

            public Trigger build() {
                return new Trigger(this);
            } 

        } 

    }
}
