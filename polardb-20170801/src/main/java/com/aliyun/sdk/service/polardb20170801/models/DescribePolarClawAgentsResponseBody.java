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
 * {@link DescribePolarClawAgentsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolarClawAgentsResponseBody</p>
 */
public class DescribePolarClawAgentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Agents")
    private java.util.List<Agents> agents;

    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("DefaultId")
    private String defaultId;

    @com.aliyun.core.annotation.NameInMap("MainKey")
    private String mainKey;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    private DescribePolarClawAgentsResponseBody(Builder builder) {
        this.agents = builder.agents;
        this.applicationId = builder.applicationId;
        this.code = builder.code;
        this.defaultId = builder.defaultId;
        this.mainKey = builder.mainKey;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.scope = builder.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarClawAgentsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agents
     */
    public java.util.List<Agents> getAgents() {
        return this.agents;
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return defaultId
     */
    public String getDefaultId() {
        return this.defaultId;
    }

    /**
     * @return mainKey
     */
    public String getMainKey() {
        return this.mainKey;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    public static final class Builder {
        private java.util.List<Agents> agents; 
        private String applicationId; 
        private Integer code; 
        private String defaultId; 
        private String mainKey; 
        private String message; 
        private String requestId; 
        private String scope; 

        private Builder() {
        } 

        private Builder(DescribePolarClawAgentsResponseBody model) {
            this.agents = model.agents;
            this.applicationId = model.applicationId;
            this.code = model.code;
            this.defaultId = model.defaultId;
            this.mainKey = model.mainKey;
            this.message = model.message;
            this.requestId = model.requestId;
            this.scope = model.scope;
        } 

        /**
         * Agents.
         */
        public Builder agents(java.util.List<Agents> agents) {
            this.agents = agents;
            return this;
        }

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * DefaultId.
         */
        public Builder defaultId(String defaultId) {
            this.defaultId = defaultId;
            return this;
        }

        /**
         * MainKey.
         */
        public Builder mainKey(String mainKey) {
            this.mainKey = mainKey;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>24A1990B-4F6E-482B-B8CB-75C612******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Scope.
         */
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }

        public DescribePolarClawAgentsResponseBody build() {
            return new DescribePolarClawAgentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePolarClawAgentsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarClawAgentsResponseBody</p>
     */
    public static class Files extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Missing")
        private Boolean missing;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("UpdatedAtMs")
        private Long updatedAtMs;

        private Files(Builder builder) {
            this.missing = builder.missing;
            this.name = builder.name;
            this.path = builder.path;
            this.size = builder.size;
            this.updatedAtMs = builder.updatedAtMs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Files create() {
            return builder().build();
        }

        /**
         * @return missing
         */
        public Boolean getMissing() {
            return this.missing;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return updatedAtMs
         */
        public Long getUpdatedAtMs() {
            return this.updatedAtMs;
        }

        public static final class Builder {
            private Boolean missing; 
            private String name; 
            private String path; 
            private Long size; 
            private Long updatedAtMs; 

            private Builder() {
            } 

            private Builder(Files model) {
                this.missing = model.missing;
                this.name = model.name;
                this.path = model.path;
                this.size = model.size;
                this.updatedAtMs = model.updatedAtMs;
            } 

            /**
             * Missing.
             */
            public Builder missing(Boolean missing) {
                this.missing = missing;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * UpdatedAtMs.
             */
            public Builder updatedAtMs(Long updatedAtMs) {
                this.updatedAtMs = updatedAtMs;
                return this;
            }

            public Files build() {
                return new Files(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePolarClawAgentsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarClawAgentsResponseBody</p>
     */
    public static class Identity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Avatar")
        private String avatar;

        @com.aliyun.core.annotation.NameInMap("AvatarUrl")
        private String avatarUrl;

        @com.aliyun.core.annotation.NameInMap("Emoji")
        private String emoji;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Theme")
        private String theme;

        private Identity(Builder builder) {
            this.avatar = builder.avatar;
            this.avatarUrl = builder.avatarUrl;
            this.emoji = builder.emoji;
            this.name = builder.name;
            this.theme = builder.theme;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Identity create() {
            return builder().build();
        }

        /**
         * @return avatar
         */
        public String getAvatar() {
            return this.avatar;
        }

        /**
         * @return avatarUrl
         */
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        /**
         * @return emoji
         */
        public String getEmoji() {
            return this.emoji;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return theme
         */
        public String getTheme() {
            return this.theme;
        }

        public static final class Builder {
            private String avatar; 
            private String avatarUrl; 
            private String emoji; 
            private String name; 
            private String theme; 

            private Builder() {
            } 

            private Builder(Identity model) {
                this.avatar = model.avatar;
                this.avatarUrl = model.avatarUrl;
                this.emoji = model.emoji;
                this.name = model.name;
                this.theme = model.theme;
            } 

            /**
             * Avatar.
             */
            public Builder avatar(String avatar) {
                this.avatar = avatar;
                return this;
            }

            /**
             * AvatarUrl.
             */
            public Builder avatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
                return this;
            }

            /**
             * Emoji.
             */
            public Builder emoji(String emoji) {
                this.emoji = emoji;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Theme.
             */
            public Builder theme(String theme) {
                this.theme = theme;
                return this;
            }

            public Identity build() {
                return new Identity(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePolarClawAgentsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarClawAgentsResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Fallbacks")
        private java.util.List<String> fallbacks;

        @com.aliyun.core.annotation.NameInMap("Primary")
        private String primary;

        private Model(Builder builder) {
            this.fallbacks = builder.fallbacks;
            this.primary = builder.primary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return fallbacks
         */
        public java.util.List<String> getFallbacks() {
            return this.fallbacks;
        }

        /**
         * @return primary
         */
        public String getPrimary() {
            return this.primary;
        }

        public static final class Builder {
            private java.util.List<String> fallbacks; 
            private String primary; 

            private Builder() {
            } 

            private Builder(Model model) {
                this.fallbacks = model.fallbacks;
                this.primary = model.primary;
            } 

            /**
             * Fallbacks.
             */
            public Builder fallbacks(java.util.List<String> fallbacks) {
                this.fallbacks = fallbacks;
                return this;
            }

            /**
             * Primary.
             */
            public Builder primary(String primary) {
                this.primary = primary;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePolarClawAgentsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarClawAgentsResponseBody</p>
     */
    public static class Agents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Default")
        private Boolean _default;

        @com.aliyun.core.annotation.NameInMap("Files")
        private java.util.List<Files> files;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Identity")
        private Identity identity;

        @com.aliyun.core.annotation.NameInMap("Model")
        private Model model;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Skills")
        private java.util.List<String> skills;

        @com.aliyun.core.annotation.NameInMap("Workspace")
        private String workspace;

        private Agents(Builder builder) {
            this._default = builder._default;
            this.files = builder.files;
            this.id = builder.id;
            this.identity = builder.identity;
            this.model = builder.model;
            this.name = builder.name;
            this.skills = builder.skills;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Agents create() {
            return builder().build();
        }

        /**
         * @return _default
         */
        public Boolean get_default() {
            return this._default;
        }

        /**
         * @return files
         */
        public java.util.List<Files> getFiles() {
            return this.files;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return identity
         */
        public Identity getIdentity() {
            return this.identity;
        }

        /**
         * @return model
         */
        public Model getModel() {
            return this.model;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return skills
         */
        public java.util.List<String> getSkills() {
            return this.skills;
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private Boolean _default; 
            private java.util.List<Files> files; 
            private String id; 
            private Identity identity; 
            private Model model; 
            private String name; 
            private java.util.List<String> skills; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(Agents model) {
                this._default = model._default;
                this.files = model.files;
                this.id = model.id;
                this.identity = model.identity;
                this.model = model.model;
                this.name = model.name;
                this.skills = model.skills;
                this.workspace = model.workspace;
            } 

            /**
             * Default.
             */
            public Builder _default(Boolean _default) {
                this._default = _default;
                return this;
            }

            /**
             * Files.
             */
            public Builder files(java.util.List<Files> files) {
                this.files = files;
                return this;
            }

            /**
             * <p>Agent ID</p>
             * 
             * <strong>example:</strong>
             * <p>main</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Identity.
             */
            public Builder identity(Identity identity) {
                this.identity = identity;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(Model model) {
                this.model = model;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Skills.
             */
            public Builder skills(java.util.List<String> skills) {
                this.skills = skills;
                return this;
            }

            /**
             * Workspace.
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public Agents build() {
                return new Agents(this);
            } 

        } 

    }
}
