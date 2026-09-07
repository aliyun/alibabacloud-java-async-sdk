// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20210602.models;

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
 * {@link CreateTenantSkillRequest} extends {@link RequestModel}
 *
 * <p>CreateTenantSkillRequest</p>
 */
public class CreateTenantSkillRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiKey")
    private String apiKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvVars")
    private java.util.Map<String, String> envVars;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IconETag")
    private String iconETag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillChannel")
    private String skillChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillIcon")
    private String skillIcon;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillVersion")
    private String skillVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Slug")
    private String slug;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskKey")
    private String taskKey;

    private CreateTenantSkillRequest(Builder builder) {
        super(builder);
        this.apiKey = builder.apiKey;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.envVars = builder.envVars;
        this.iconETag = builder.iconETag;
        this.skillChannel = builder.skillChannel;
        this.skillIcon = builder.skillIcon;
        this.skillVersion = builder.skillVersion;
        this.slug = builder.slug;
        this.taskKey = builder.taskKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTenantSkillRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return envVars
     */
    public java.util.Map<String, String> getEnvVars() {
        return this.envVars;
    }

    /**
     * @return iconETag
     */
    public String getIconETag() {
        return this.iconETag;
    }

    /**
     * @return skillChannel
     */
    public String getSkillChannel() {
        return this.skillChannel;
    }

    /**
     * @return skillIcon
     */
    public String getSkillIcon() {
        return this.skillIcon;
    }

    /**
     * @return skillVersion
     */
    public String getSkillVersion() {
        return this.skillVersion;
    }

    /**
     * @return slug
     */
    public String getSlug() {
        return this.slug;
    }

    /**
     * @return taskKey
     */
    public String getTaskKey() {
        return this.taskKey;
    }

    public static final class Builder extends Request.Builder<CreateTenantSkillRequest, Builder> {
        private String apiKey; 
        private String description; 
        private String displayName; 
        private java.util.Map<String, String> envVars; 
        private String iconETag; 
        private String skillChannel; 
        private String skillIcon; 
        private String skillVersion; 
        private String slug; 
        private String taskKey; 

        private Builder() {
            super();
        } 

        private Builder(CreateTenantSkillRequest request) {
            super(request);
            this.apiKey = request.apiKey;
            this.description = request.description;
            this.displayName = request.displayName;
            this.envVars = request.envVars;
            this.iconETag = request.iconETag;
            this.skillChannel = request.skillChannel;
            this.skillIcon = request.skillIcon;
            this.skillVersion = request.skillVersion;
            this.slug = request.slug;
            this.taskKey = request.taskKey;
        } 

        /**
         * <p>The API key of the skill.</p>
         * 
         * <strong>example:</strong>
         * <p>akm-98f66829***</p>
         */
        public Builder apiKey(String apiKey) {
            this.putQueryParameter("ApiKey", apiKey);
            this.apiKey = apiKey;
            return this;
        }

        /**
         * <p>The description of the skill. Maximum length: 500 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>This skill is used for****</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>name****</p>
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The environment variables.</p>
         */
        public Builder envVars(java.util.Map<String, String> envVars) {
            String envVarsShrink = shrink(envVars, "EnvVars", "json");
            this.putQueryParameter("EnvVars", envVarsShrink);
            this.envVars = envVars;
            return this;
        }

        /**
         * <p>The icon parsing tag. This parameter is required when SkillIcon is specified.</p>
         * 
         * <strong>example:</strong>
         * <p>21E9A5B273CB8EC0675*********</p>
         */
        public Builder iconETag(String iconETag) {
            this.putQueryParameter("IconETag", iconETag);
            this.iconETag = iconETag;
            return this;
        }

        /**
         * <p>The skill channel. Valid values:</p>
         * <ul>
         * <li>ENTERPRISE: Enterprise Edition.</li>
         * <li>BUSINESS: Business Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BUSINESS</p>
         */
        public Builder skillChannel(String skillChannel) {
            this.putQueryParameter("SkillChannel", skillChannel);
            this.skillChannel = skillChannel;
            return this;
        }

        /**
         * <p>The skill icon.</p>
         */
        public Builder skillIcon(String skillIcon) {
            this.putQueryParameter("SkillIcon", skillIcon);
            this.skillIcon = skillIcon;
            return this;
        }

        /**
         * <p>The skill version.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.1</p>
         */
        public Builder skillVersion(String skillVersion) {
            this.putQueryParameter("SkillVersion", skillVersion);
            this.skillVersion = skillVersion;
            return this;
        }

        /**
         * <p>The slug identifier of the skill. This parameter is user-defined and must be unique within the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>find-skills****</p>
         */
        public Builder slug(String slug) {
            this.putQueryParameter("Slug", slug);
            this.slug = slug;
            return this;
        }

        /**
         * <p>The file parsing task key.</p>
         * 
         * <strong>example:</strong>
         * <p>E1CF3D69-529D-****</p>
         */
        public Builder taskKey(String taskKey) {
            this.putQueryParameter("TaskKey", taskKey);
            this.taskKey = taskKey;
            return this;
        }

        @Override
        public CreateTenantSkillRequest build() {
            return new CreateTenantSkillRequest(this);
        } 

    } 

}
