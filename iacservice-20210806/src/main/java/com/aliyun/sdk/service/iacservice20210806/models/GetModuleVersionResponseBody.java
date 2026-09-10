// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link GetModuleVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetModuleVersionResponseBody</p>
 */
public class GetModuleVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("version")
    private Version version;

    private GetModuleVersionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModuleVersionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return version
     */
    public Version getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String requestId; 
        private Version version; 

        private Builder() {
        } 

        private Builder(GetModuleVersionResponseBody model) {
            this.requestId = model.requestId;
            this.version = model.version;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0D298375-F92F-5B65-82E4-EA68F02521F1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The version details.</p>
         */
        public Builder version(Version version) {
            this.version = version;
            return this;
        }

        public GetModuleVersionResponseBody build() {
            return new GetModuleVersionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetModuleVersionResponseBody} extends {@link TeaModel}
     *
     * <p>GetModuleVersionResponseBody</p>
     */
    public static class Version extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("moduleId")
        private String moduleId;

        @com.aliyun.core.annotation.NameInMap("moduleVersion")
        private String moduleVersion;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("sourcePath")
        private String sourcePath;

        @com.aliyun.core.annotation.NameInMap("statePath")
        private String statePath;

        @com.aliyun.core.annotation.NameInMap("terraformContext")
        private java.util.Map<String, ?> terraformContext;

        @com.aliyun.core.annotation.NameInMap("versionStrategy")
        private String versionStrategy;

        private Version(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.moduleId = builder.moduleId;
            this.moduleVersion = builder.moduleVersion;
            this.name = builder.name;
            this.source = builder.source;
            this.sourcePath = builder.sourcePath;
            this.statePath = builder.statePath;
            this.terraformContext = builder.terraformContext;
            this.versionStrategy = builder.versionStrategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Version create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return moduleId
         */
        public String getModuleId() {
            return this.moduleId;
        }

        /**
         * @return moduleVersion
         */
        public String getModuleVersion() {
            return this.moduleVersion;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourcePath
         */
        public String getSourcePath() {
            return this.sourcePath;
        }

        /**
         * @return statePath
         */
        public String getStatePath() {
            return this.statePath;
        }

        /**
         * @return terraformContext
         */
        public java.util.Map<String, ?> getTerraformContext() {
            return this.terraformContext;
        }

        /**
         * @return versionStrategy
         */
        public String getVersionStrategy() {
            return this.versionStrategy;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String moduleId; 
            private String moduleVersion; 
            private String name; 
            private String source; 
            private String sourcePath; 
            private String statePath; 
            private java.util.Map<String, ?> terraformContext; 
            private String versionStrategy; 

            private Builder() {
            } 

            private Builder(Version model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.moduleId = model.moduleId;
                this.moduleVersion = model.moduleVersion;
                this.name = model.name;
                this.source = model.source;
                this.sourcePath = model.sourcePath;
                this.statePath = model.statePath;
                this.terraformContext = model.terraformContext;
                this.versionStrategy = model.versionStrategy;
            } 

            /**
             * <p>The time when the version was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-08T18:07:40Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The version description.</p>
             * 
             * <strong>example:</strong>
             * <p>this is description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>mod-4267dcfbf1b6dfffbc27e218d1b66</p>
             */
            public Builder moduleId(String moduleId) {
                this.moduleId = moduleId;
                return this;
            }

            /**
             * <p>The template version number.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder moduleVersion(String moduleVersion) {
                this.moduleVersion = moduleVersion;
                return this;
            }

            /**
             * <p>The version name.</p>
             * 
             * <strong>example:</strong>
             * <p>versionName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The version source. Valid values:</p>
             * <ul>
             * <li>OSS: imported from OSS.</li>
             * <li>Registry: created by using a template from the template center.</li>
             * <li>ExportTask: exported from a resource export task.</li>
             * <li>Upload: uploaded as a file.</li>
             * <li>Shared: cloned from a shared source.</li>
             * <li>Editor: edited online.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The path of the version source.</p>
             * <ul>
             * <li>If the source is Registry, the value is in the format of <workspace name>/<module name>:<module version>. Example: terraform-alicloud-modules/rds:1.0.0.</li>
             * <li>If the source is OSS, the value is in the format of oss::<file link>. Example: oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip</a>.</li>
             * <li>If the source is ExportTask, the value is in the format of <export task ID>:<exported version>. Example: ex-3b6cb9fa4751afff298da723c24ac:v1.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip</a></p>
             */
            public Builder sourcePath(String sourcePath) {
                this.sourcePath = sourcePath;
                return this;
            }

            /**
             * <p>The path of the State file that corresponds to the template. Currently, only OSS paths are supported. The value is in the format of oss::<OSS file path>/terraform.tfstate.</p>
             * 
             * <strong>example:</strong>
             * <p>oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/terraform.tfstate">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/terraform.tfstate</a></p>
             */
            public Builder statePath(String statePath) {
                this.statePath = statePath;
                return this;
            }

            /**
             * <p>The Terraform content.</p>
             */
            public Builder terraformContext(java.util.Map<String, ?> terraformContext) {
                this.terraformContext = terraformContext;
                return this;
            }

            /**
             * <p>The version generation strategy. Valid values:</p>
             * <ul>
             * <li>Manual: manually generate a version. This is the default value.</li>
             * <li>SourcePathUpdated: a new version is generated when the sourcePath is modified.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Manual</p>
             */
            public Builder versionStrategy(String versionStrategy) {
                this.versionStrategy = versionStrategy;
                return this;
            }

            public Version build() {
                return new Version(this);
            } 

        } 

    }
}
