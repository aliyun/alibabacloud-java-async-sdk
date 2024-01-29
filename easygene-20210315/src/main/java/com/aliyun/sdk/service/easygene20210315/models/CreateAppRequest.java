// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppRequest} extends {@link RequestModel}
 *
 * <p>CreateAppRequest</p>
 */
public class CreateAppRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("AppType")
    private String appType;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("Configs")
    private java.util.List < Configs> configs;

    @Body
    @NameInMap("Definition")
    @Validation(required = true)
    private String definition;

    @Body
    @NameInMap("Dependencies")
    private java.util.List < Dependencies> dependencies;

    @Query
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("Documentation")
    private String documentation;

    @Query
    @NameInMap("Labels")
    private String labels;

    @Query
    @NameInMap("Language")
    private String language;

    @Query
    @NameInMap("LanguageVersion")
    private String languageVersion;

    @Query
    @NameInMap("Path")
    @Validation(required = true)
    private String path;

    @Query
    @NameInMap("RevisionComment")
    private String revisionComment;

    @Query
    @NameInMap("RevisionTag")
    private String revisionTag;

    @Query
    @NameInMap("Workspace")
    @Validation(required = true)
    private String workspace;

    private CreateAppRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appName = builder.appName;
        this.appType = builder.appType;
        this.clientToken = builder.clientToken;
        this.configs = builder.configs;
        this.definition = builder.definition;
        this.dependencies = builder.dependencies;
        this.description = builder.description;
        this.documentation = builder.documentation;
        this.labels = builder.labels;
        this.language = builder.language;
        this.languageVersion = builder.languageVersion;
        this.path = builder.path;
        this.revisionComment = builder.revisionComment;
        this.revisionTag = builder.revisionTag;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppRequest create() {
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
     * @return appType
     */
    public String getAppType() {
        return this.appType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return configs
     */
    public java.util.List < Configs> getConfigs() {
        return this.configs;
    }

    /**
     * @return definition
     */
    public String getDefinition() {
        return this.definition;
    }

    /**
     * @return dependencies
     */
    public java.util.List < Dependencies> getDependencies() {
        return this.dependencies;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return documentation
     */
    public String getDocumentation() {
        return this.documentation;
    }

    /**
     * @return labels
     */
    public String getLabels() {
        return this.labels;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return languageVersion
     */
    public String getLanguageVersion() {
        return this.languageVersion;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return revisionComment
     */
    public String getRevisionComment() {
        return this.revisionComment;
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

    public static final class Builder extends Request.Builder<CreateAppRequest, Builder> {
        private String regionId; 
        private String appName; 
        private String appType; 
        private String clientToken; 
        private java.util.List < Configs> configs; 
        private String definition; 
        private java.util.List < Dependencies> dependencies; 
        private String description; 
        private String documentation; 
        private String labels; 
        private String language; 
        private String languageVersion; 
        private String path; 
        private String revisionComment; 
        private String revisionTag; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appName = request.appName;
            this.appType = request.appType;
            this.clientToken = request.clientToken;
            this.configs = request.configs;
            this.definition = request.definition;
            this.dependencies = request.dependencies;
            this.description = request.description;
            this.documentation = request.documentation;
            this.labels = request.labels;
            this.language = request.language;
            this.languageVersion = request.languageVersion;
            this.path = request.path;
            this.revisionComment = request.revisionComment;
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
         * AppType.
         */
        public Builder appType(String appType) {
            this.putQueryParameter("AppType", appType);
            this.appType = appType;
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
         * Configs.
         */
        public Builder configs(java.util.List < Configs> configs) {
            String configsShrink = shrink(configs, "Configs", "json");
            this.putBodyParameter("Configs", configsShrink);
            this.configs = configs;
            return this;
        }

        /**
         * Definition.
         */
        public Builder definition(String definition) {
            this.putBodyParameter("Definition", definition);
            this.definition = definition;
            return this;
        }

        /**
         * Dependencies.
         */
        public Builder dependencies(java.util.List < Dependencies> dependencies) {
            String dependenciesShrink = shrink(dependencies, "Dependencies", "json");
            this.putBodyParameter("Dependencies", dependenciesShrink);
            this.dependencies = dependencies;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Documentation.
         */
        public Builder documentation(String documentation) {
            this.putBodyParameter("Documentation", documentation);
            this.documentation = documentation;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(String labels) {
            this.putQueryParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * LanguageVersion.
         */
        public Builder languageVersion(String languageVersion) {
            this.putQueryParameter("LanguageVersion", languageVersion);
            this.languageVersion = languageVersion;
            return this;
        }

        /**
         * Path.
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * RevisionComment.
         */
        public Builder revisionComment(String revisionComment) {
            this.putQueryParameter("RevisionComment", revisionComment);
            this.revisionComment = revisionComment;
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
        public CreateAppRequest build() {
            return new CreateAppRequest(this);
        } 

    } 

    public static class Configs extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("Path")
        private String path;

        private Configs(Builder builder) {
            this.content = builder.content;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configs create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private String content; 
            private String path; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
    public static class Dependencies extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("Path")
        private String path;

        private Dependencies(Builder builder) {
            this.content = builder.content;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dependencies create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private String content; 
            private String path; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public Dependencies build() {
                return new Dependencies(this);
            } 

        } 

    }
}
