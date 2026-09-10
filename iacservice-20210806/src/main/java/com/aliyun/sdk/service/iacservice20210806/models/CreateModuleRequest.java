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
 * {@link CreateModuleRequest} extends {@link RequestModel}
 *
 * <p>CreateModuleRequest</p>
 */
public class CreateModuleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("groupInfo")
    private GroupInfo groupInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("source")
    @com.aliyun.core.annotation.Validation(required = true)
    private String source;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourcePath")
    private String sourcePath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("statePath")
    private String statePath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("versionStrategy")
    private String versionStrategy;

    private CreateModuleRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.groupInfo = builder.groupInfo;
        this.name = builder.name;
        this.source = builder.source;
        this.sourcePath = builder.sourcePath;
        this.statePath = builder.statePath;
        this.tags = builder.tags;
        this.versionStrategy = builder.versionStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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

    public static final class Builder extends Request.Builder<CreateModuleRequest, Builder> {
        private String clientToken; 
        private String description; 
        private GroupInfo groupInfo; 
        private String name; 
        private String source; 
        private String sourcePath; 
        private String statePath; 
        private java.util.List<Tags> tags; 
        private String versionStrategy; 

        private Builder() {
            super();
        } 

        private Builder(CreateModuleRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.groupInfo = request.groupInfo;
            this.name = request.name;
            this.source = request.source;
            this.sourcePath = request.sourcePath;
            this.statePath = request.statePath;
            this.tags = request.tags;
            this.versionStrategy = request.versionStrategy;
        } 

        /**
         * <p>The idempotency parameter. We recommend that you use a UUID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a65451293e64979ba7a4b573950217fe</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the template. The description can be up to 256 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS instance module</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The project group information to which the template belongs.</p>
         */
        public Builder groupInfo(GroupInfo groupInfo) {
            this.putBodyParameter("groupInfo", groupInfo);
            this.groupInfo = groupInfo;
            return this;
        }

        /**
         * <p>The name of the template. The name must meet the following requirements:</p>
         * <ul>
         * <li>The name must be 2 to 128 characters in length.</li>
         * <li>The name can contain letters, digits, Chinese characters, hyphens (-), underscores (_), and periods (.). The name cannot start or end with a hyphen, underscore, or period.</li>
         * <li>The name must be unique among all templates under the current account.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-ecs-module</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The source from which the template is created. Valid values:</p>
         * <ul>
         * <li>OSS: imports from a ZIP file stored in OSS.</li>
         * <li>Registry: creates from a module in the template registry.</li>
         * <li>ExportTask: references a template exported by a resource export task.</li>
         * <li>Editor: creates a blank template that supports online editing.</li>
         * <li>Upload: uploads a local template file to generate the template.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        public Builder source(String source) {
            this.putBodyParameter("source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The path of the template source. This parameter takes effect when source is set to Registry, OSS, or ExportTask.</p>
         * <ul>
         * <li>If source is set to Registry, the value is in the format of \<workspace name>/\<module name>:\<module version>. Example: terraform-alicloud-modules/rds:1.0.0.</li>
         * <li>If source is set to OSS, the value is in the format of oss::<file URL>. The file must be a ZIP file. Example: oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip</a>.</li>
         * <li>If source is set to ExportTask, the value is in the format of \<export task ID>:\<exported version>. Example: ex-3b6cb9fa4751afff298da723c24ac:v1.</li>
         * <li>If source is set to Editor or Upload, leave this parameter empty.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip</a></p>
         */
        public Builder sourcePath(String sourcePath) {
            this.putBodyParameter("sourcePath", sourcePath);
            this.sourcePath = sourcePath;
            return this;
        }

        /**
         * <p>The path of the State file that corresponds to the template. This parameter is valid only when source is set to OSS.
         * The value is in the format of oss::\<OSS file path>/terraform.tfstate.</p>
         * 
         * <strong>example:</strong>
         * <p>oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/terraform.tfstate">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/terraform.tfstate</a></p>
         */
        public Builder statePath(String statePath) {
            this.putBodyParameter("statePath", statePath);
            this.statePath = statePath;
            return this;
        }

        /**
         * <p>The list of tags for the template.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The version generation strategy. Valid values:</p>
         * <ul>
         * <li>Manual: manually generates a version. This is the default value.</li>
         * <li>SourcePathUpdated: generates a new version when sourcePath is modified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        public Builder versionStrategy(String versionStrategy) {
            this.putBodyParameter("versionStrategy", versionStrategy);
            this.versionStrategy = versionStrategy;
            return this;
        }

        @Override
        public CreateModuleRequest build() {
            return new CreateModuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateModuleRequest} extends {@link TeaModel}
     *
     * <p>CreateModuleRequest</p>
     */
    public static class GroupInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("groupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("projectId")
        private String projectId;

        private GroupInfo(Builder builder) {
            this.groupId = builder.groupId;
            this.projectId = builder.projectId;
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
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        public static final class Builder {
            private String groupId; 
            private String projectId; 

            private Builder() {
            } 

            private Builder(GroupInfo model) {
                this.groupId = model.groupId;
                this.projectId = model.projectId;
            } 

            /**
             * <p>The group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>g-5fd38c9b92d541a7083a86432e2</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>p-433aead75605713865c386cb9d</p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            public GroupInfo build() {
                return new GroupInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateModuleRequest} extends {@link TeaModel}
     *
     * <p>CreateModuleRequest</p>
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
}
