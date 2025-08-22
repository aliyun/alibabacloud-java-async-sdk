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
 * {@link UpdateModuleAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateModuleAttributeRequest</p>
 */
public class UpdateModuleAttributeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("moduleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String moduleId;

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
    private String name;

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

    private UpdateModuleAttributeRequest(Builder builder) {
        super(builder);
        this.moduleId = builder.moduleId;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.groupInfo = builder.groupInfo;
        this.name = builder.name;
        this.sourcePath = builder.sourcePath;
        this.statePath = builder.statePath;
        this.tags = builder.tags;
        this.versionStrategy = builder.versionStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateModuleAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return moduleId
     */
    public String getModuleId() {
        return this.moduleId;
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

    public static final class Builder extends Request.Builder<UpdateModuleAttributeRequest, Builder> {
        private String moduleId; 
        private String clientToken; 
        private String description; 
        private GroupInfo groupInfo; 
        private String name; 
        private String sourcePath; 
        private String statePath; 
        private java.util.List<Tags> tags; 
        private String versionStrategy; 

        private Builder() {
            super();
        } 

        private Builder(UpdateModuleAttributeRequest request) {
            super(request);
            this.moduleId = request.moduleId;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.groupInfo = request.groupInfo;
            this.name = request.name;
            this.sourcePath = request.sourcePath;
            this.statePath = request.statePath;
            this.tags = request.tags;
            this.versionStrategy = request.versionStrategy;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mod-62ecaa43022ce189d65f8d4a794</p>
         */
        public Builder moduleId(String moduleId) {
            this.putPathParameter("moduleId", moduleId);
            this.moduleId = moduleId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * groupInfo.
         */
        public Builder groupInfo(GroupInfo groupInfo) {
            this.putBodyParameter("groupInfo", groupInfo);
            this.groupInfo = groupInfo;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * sourcePath.
         */
        public Builder sourcePath(String sourcePath) {
            this.putBodyParameter("sourcePath", sourcePath);
            this.sourcePath = sourcePath;
            return this;
        }

        /**
         * statePath.
         */
        public Builder statePath(String statePath) {
            this.putBodyParameter("statePath", statePath);
            this.statePath = statePath;
            return this;
        }

        /**
         * tags.
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * versionStrategy.
         */
        public Builder versionStrategy(String versionStrategy) {
            this.putBodyParameter("versionStrategy", versionStrategy);
            this.versionStrategy = versionStrategy;
            return this;
        }

        @Override
        public UpdateModuleAttributeRequest build() {
            return new UpdateModuleAttributeRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateModuleAttributeRequest} extends {@link TeaModel}
     *
     * <p>UpdateModuleAttributeRequest</p>
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
             * groupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * projectId.
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
     * {@link UpdateModuleAttributeRequest} extends {@link TeaModel}
     *
     * <p>UpdateModuleAttributeRequest</p>
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
             * tagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * tagValue.
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
