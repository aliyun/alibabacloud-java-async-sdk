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
 * {@link GetModuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetModuleResponseBody</p>
 */
public class GetModuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetModuleResponseBody(Builder builder) {
        this.module = builder.module;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Module module; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetModuleResponseBody model) {
            this.module = model.module;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The template information.</p>
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1E7BA3EB-B0EF-53F5-9999-07CAD6D9F8A3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetModuleResponseBody build() {
            return new GetModuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetModuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetModuleResponseBody</p>
     */
    public static class GroupInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("groupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("groupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("projectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("projectName")
        private String projectName;

        private GroupInfo(Builder builder) {
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupInfo create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        public static final class Builder {
            private String groupId; 
            private String groupName; 
            private String projectId; 
            private String projectName; 

            private Builder() {
            } 

            private Builder(GroupInfo model) {
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.projectId = model.projectId;
                this.projectName = model.projectName;
            } 

            /**
             * <p>The group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>g-fu1a1ol8cob1oni01ekcloi</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The group name.</p>
             * 
             * <strong>example:</strong>
             * <p>groupName</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>p-al1d11jlvlsbvr11lf3pqo</p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The project name.</p>
             * 
             * <strong>example:</strong>
             * <p>projectName</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            public GroupInfo build() {
                return new GroupInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetModuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetModuleResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("tagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The tag key of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetModuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetModuleResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("groupInfo")
        private GroupInfo groupInfo;

        @com.aliyun.core.annotation.NameInMap("latestVersion")
        private String latestVersion;

        @com.aliyun.core.annotation.NameInMap("moduleId")
        private String moduleId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("outputPath")
        private String outputPath;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("sourcePath")
        private String sourcePath;

        @com.aliyun.core.annotation.NameInMap("statePath")
        private String statePath;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("versionStrategy")
        private String versionStrategy;

        private Module(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.groupInfo = builder.groupInfo;
            this.latestVersion = builder.latestVersion;
            this.moduleId = builder.moduleId;
            this.name = builder.name;
            this.outputPath = builder.outputPath;
            this.source = builder.source;
            this.sourcePath = builder.sourcePath;
            this.statePath = builder.statePath;
            this.status = builder.status;
            this.tags = builder.tags;
            this.versionStrategy = builder.versionStrategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
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
         * @return groupInfo
         */
        public GroupInfo getGroupInfo() {
            return this.groupInfo;
        }

        /**
         * @return latestVersion
         */
        public String getLatestVersion() {
            return this.latestVersion;
        }

        /**
         * @return moduleId
         */
        public String getModuleId() {
            return this.moduleId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outputPath
         */
        public String getOutputPath() {
            return this.outputPath;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
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
            private GroupInfo groupInfo; 
            private String latestVersion; 
            private String moduleId; 
            private String name; 
            private String outputPath; 
            private String source; 
            private String sourcePath; 
            private String statePath; 
            private String status; 
            private java.util.List<Tags> tags; 
            private String versionStrategy; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.groupInfo = model.groupInfo;
                this.latestVersion = model.latestVersion;
                this.moduleId = model.moduleId;
                this.name = model.name;
                this.outputPath = model.outputPath;
                this.source = model.source;
                this.sourcePath = model.sourcePath;
                this.statePath = model.statePath;
                this.status = model.status;
                this.tags = model.tags;
                this.versionStrategy = model.versionStrategy;
            } 

            /**
             * <p>The time when the template was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-06T06:11:27Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The template description.</p>
             * 
             * <strong>example:</strong>
             * <p>this is description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The group information.</p>
             */
            public Builder groupInfo(GroupInfo groupInfo) {
                this.groupInfo = groupInfo;
                return this;
            }

            /**
             * <p>The latest version number.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder latestVersion(String latestVersion) {
                this.latestVersion = latestVersion;
                return this;
            }

            /**
             * <p>The template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>mod-4267dcfbf1b6d14625614ddbe15</p>
             */
            public Builder moduleId(String moduleId) {
                this.moduleId = moduleId;
                return this;
            }

            /**
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>ModuleName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The storage path of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder outputPath(String outputPath) {
                this.outputPath = outputPath;
                return this;
            }

            /**
             * <p>The template source. Valid values:</p>
             * <ul>
             * <li>OSS: Imported from OSS.</li>
             * <li>Registry: Created from a template in the template center.</li>
             * <li>ExportTask: Exported from a resource export task.</li>
             * <li>Upload: Uploaded as a file.</li>
             * <li>Shared: Cloned from a shared template.</li>
             * <li>Editor: Created by using the online editor.</li>
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
             * <p>The source path of the template.</p>
             * <ul>
             * <li>If the source is Registry, the value is in the format of <workspace name>/<module name>:<module version>, such as terraform-alicloud-modules/rds:1.0.0.</li>
             * <li>If the source is OSS, the value is in the format of oss::<file link>, such as oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip</a>.</li>
             * <li>If the source is ExportTask, the value is in the format of <export task ID>:<exported version>, such as ex-3b6cb9fa4751afff298da723c24ac:v1.</li>
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
             * <p>The path of the state file that corresponds to the template. Currently, only OSS paths are supported. The value is in the format of oss::<file OSS path>/terraform.tfstate.</p>
             * 
             * <strong>example:</strong>
             * <p>oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/terraform.tfstate">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/terraform.tfstate</a></p>
             */
            public Builder statePath(String statePath) {
                this.statePath = statePath;
                return this;
            }

            /**
             * <p>The template status. Valid values:</p>
             * <ul>
             * <li>Creating: The template is being created.</li>
             * <li>Created: The template is created.</li>
             * </ul>
             * <p>After the template is created, you can publish a version.</p>
             * 
             * <strong>example:</strong>
             * <p>Created</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags of the template.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The version generation strategy. Valid values:</p>
             * <ul>
             * <li>Manual: Versions are generated manually. This is the default value.</li>
             * <li>SourcePathUpdated: A new version is generated when the sourcePath is modified.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Manual</p>
             */
            public Builder versionStrategy(String versionStrategy) {
                this.versionStrategy = versionStrategy;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
