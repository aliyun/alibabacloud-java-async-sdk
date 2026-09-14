// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link CreateSkillRequest} extends {@link RequestModel}
 *
 * <p>CreateSkillRequest</p>
 */
public class CreateSkillRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BundleUrl")
    private String bundleUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Extra")
    private java.util.Map<String, ?> extra;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SkillMdOverride")
    private String skillMdOverride;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VersionNote")
    private String versionNote;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Visibility")
    private String visibility;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VisibilityScope")
    private VisibilityScope visibilityScope;

    private CreateSkillRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bundleUrl = builder.bundleUrl;
        this.description = builder.description;
        this.extra = builder.extra;
        this.name = builder.name;
        this.skillMdOverride = builder.skillMdOverride;
        this.versionNote = builder.versionNote;
        this.visibility = builder.visibility;
        this.visibilityScope = builder.visibilityScope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSkillRequest create() {
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
     * @return bundleUrl
     */
    public String getBundleUrl() {
        return this.bundleUrl;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return extra
     */
    public java.util.Map<String, ?> getExtra() {
        return this.extra;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return skillMdOverride
     */
    public String getSkillMdOverride() {
        return this.skillMdOverride;
    }

    /**
     * @return versionNote
     */
    public String getVersionNote() {
        return this.versionNote;
    }

    /**
     * @return visibility
     */
    public String getVisibility() {
        return this.visibility;
    }

    /**
     * @return visibilityScope
     */
    public VisibilityScope getVisibilityScope() {
        return this.visibilityScope;
    }

    public static final class Builder extends Request.Builder<CreateSkillRequest, Builder> {
        private String regionId; 
        private String bundleUrl; 
        private String description; 
        private java.util.Map<String, ?> extra; 
        private String name; 
        private String skillMdOverride; 
        private String versionNote; 
        private String visibility; 
        private VisibilityScope visibilityScope; 

        private Builder() {
            super();
        } 

        private Builder(CreateSkillRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bundleUrl = request.bundleUrl;
            this.description = request.description;
            this.extra = request.extra;
            this.name = request.name;
            this.skillMdOverride = request.skillMdOverride;
            this.versionNote = request.versionNote;
            this.visibility = request.visibility;
            this.visibilityScope = request.visibilityScope;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The <strong>downloadable URL (HTTP/HTTPS) of the bundle.zip file</strong>. This parameter is mutually exclusive with SkillMdOverride.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/skill.zip">https://example.com/skill.zip</a></p>
         */
        public Builder bundleUrl(String bundleUrl) {
            this.putBodyParameter("BundleUrl", bundleUrl);
            this.bundleUrl = bundleUrl;
            return this;
        }

        /**
         * <p>The <strong>Skill description</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>数据分析技能</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The extension metadata in key-value pairs.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;appId&quot;:&quot;APP_CWJMV36CT9SAFW1QEHX7&quot;}</p>
         */
        public Builder extra(java.util.Map<String, ?> extra) {
            String extraShrink = shrink(extra, "Extra", "json");
            this.putBodyParameter("Extra", extraShrink);
            this.extra = extra;
            return this;
        }

        /**
         * <p>The <strong>Skill name</strong>, which must be unique within the current account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-skill</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The SKILL.md body content. This parameter is mutually exclusive with BundleUrl. If no bundle is provided, use this field to create a lightweight Skill that contains only a SKILL.md file.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder skillMdOverride(String skillMdOverride) {
            this.putBodyParameter("SkillMdOverride", skillMdOverride);
            this.skillMdOverride = skillMdOverride;
            return this;
        }

        /**
         * <p>The <strong>version note</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>初版</p>
         */
        public Builder versionNote(String versionNote) {
            this.putBodyParameter("VersionNote", versionNote);
            this.versionNote = versionNote;
            return this;
        }

        /**
         * <p>The <strong>visibility level</strong>. Valid values:</p>
         * <ul>
         * <li>TENANT: Visible within the account.</li>
         * <li>PROJECT: Visible to specified projects.</li>
         * <li>USER: Visible to specified users.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TENANT</p>
         */
        public Builder visibility(String visibility) {
            this.putBodyParameter("Visibility", visibility);
            this.visibility = visibility;
            return this;
        }

        /**
         * <p>The visibility scope. The corresponding field is determined by the Visibility parameter.</p>
         */
        public Builder visibilityScope(VisibilityScope visibilityScope) {
            String visibilityScopeShrink = shrink(visibilityScope, "VisibilityScope", "json");
            this.putBodyParameter("VisibilityScope", visibilityScopeShrink);
            this.visibilityScope = visibilityScope;
            return this;
        }

        @Override
        public CreateSkillRequest build() {
            return new CreateSkillRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateSkillRequest} extends {@link TeaModel}
     *
     * <p>CreateSkillRequest</p>
     */
    public static class VisibilityScope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProjectIds")
        private java.util.List<String> projectIds;

        @com.aliyun.core.annotation.NameInMap("UserIds")
        private java.util.List<String> userIds;

        private VisibilityScope(Builder builder) {
            this.projectIds = builder.projectIds;
            this.userIds = builder.userIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VisibilityScope create() {
            return builder().build();
        }

        /**
         * @return projectIds
         */
        public java.util.List<String> getProjectIds() {
            return this.projectIds;
        }

        /**
         * @return userIds
         */
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

        public static final class Builder {
            private java.util.List<String> projectIds; 
            private java.util.List<String> userIds; 

            private Builder() {
            } 

            private Builder(VisibilityScope model) {
                this.projectIds = model.projectIds;
                this.userIds = model.userIds;
            } 

            /**
             * <p>The list of visible project IDs. This parameter takes effect only when Visibility is set to <code>PROJECT</code>.</p>
             */
            public Builder projectIds(java.util.List<String> projectIds) {
                this.projectIds = projectIds;
                return this;
            }

            /**
             * <p>The list of visible user IDs. This parameter takes effect only when Visibility is set to <code>USER</code>.</p>
             */
            public Builder userIds(java.util.List<String> userIds) {
                this.userIds = userIds;
                return this;
            }

            public VisibilityScope build() {
                return new VisibilityScope(this);
            } 

        } 

    }
}
