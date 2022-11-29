// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Release} extends {@link TeaModel}
 *
 * <p>Release</p>
 */
public class Release extends TeaModel {
    @NameInMap("appConfig")
    private java.util.Map < String, ? > appConfig;

    @NameInMap("codeVersion")
    private CodeVersion codeVersion;

    @NameInMap("createdTime")
    private String createdTime;

    @NameInMap("description")
    private String description;

    @NameInMap("output")
    private java.util.Map < String, ? > output;

    @NameInMap("status")
    private String status;

    @NameInMap("versionId")
    private Long versionId;

    private Release(Builder builder) {
        this.appConfig = builder.appConfig;
        this.codeVersion = builder.codeVersion;
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.output = builder.output;
        this.status = builder.status;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Release create() {
        return builder().build();
    }

    /**
     * @return appConfig
     */
    public java.util.Map < String, ? > getAppConfig() {
        return this.appConfig;
    }

    /**
     * @return codeVersion
     */
    public CodeVersion getCodeVersion() {
        return this.codeVersion;
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
     * @return output
     */
    public java.util.Map < String, ? > getOutput() {
        return this.output;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return versionId
     */
    public Long getVersionId() {
        return this.versionId;
    }

    public static final class Builder {
        private java.util.Map < String, ? > appConfig; 
        private CodeVersion codeVersion; 
        private String createdTime; 
        private String description; 
        private java.util.Map < String, ? > output; 
        private String status; 
        private Long versionId; 

        /**
         * 本次发布的应用快照，只读
         */
        public Builder appConfig(java.util.Map < String, ? > appConfig) {
            this.appConfig = appConfig;
            return this;
        }

        /**
         * 代码版本，不指定则使用最新的commit
         */
        public Builder codeVersion(CodeVersion codeVersion) {
            this.codeVersion = codeVersion;
            return this;
        }

        /**
         * 创建时间，只读
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * 本地发布描述
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * 本次发布的输出，只读
         */
        public Builder output(java.util.Map < String, ? > output) {
            this.output = output;
            return this;
        }

        /**
         * 本地发布状态：published: 发布完成 publishing：发布中 failed：发布失败 canceled：已撤销
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * 本次发布版本号，由系统生成，只读
         */
        public Builder versionId(Long versionId) {
            this.versionId = versionId;
            return this;
        }

        public Release build() {
            return new Release(this);
        } 

    } 

    public static class CodeVersion extends TeaModel {
        @NameInMap("branch")
        private String branch;

        @NameInMap("commit")
        private String commit;

        private CodeVersion(Builder builder) {
            this.branch = builder.branch;
            this.commit = builder.commit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CodeVersion create() {
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

        public static final class Builder {
            private String branch; 
            private String commit; 

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

            public CodeVersion build() {
                return new CodeVersion(this);
            } 

        } 

    }
}
