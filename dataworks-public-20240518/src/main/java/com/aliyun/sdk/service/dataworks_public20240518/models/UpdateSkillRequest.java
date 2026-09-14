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
 * {@link UpdateSkillRequest} extends {@link RequestModel}
 *
 * <p>UpdateSkillRequest</p>
 */
public class UpdateSkillRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ExpectedVersion")
    private Integer expectedVersion;

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
    @com.aliyun.core.annotation.NameInMap("VisibilityScope")
    private VisibilityScope visibilityScope;

    private UpdateSkillRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bundleUrl = builder.bundleUrl;
        this.description = builder.description;
        this.expectedVersion = builder.expectedVersion;
        this.extra = builder.extra;
        this.name = builder.name;
        this.skillMdOverride = builder.skillMdOverride;
        this.versionNote = builder.versionNote;
        this.visibilityScope = builder.visibilityScope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSkillRequest create() {
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
     * @return expectedVersion
     */
    public Integer getExpectedVersion() {
        return this.expectedVersion;
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
     * @return visibilityScope
     */
    public VisibilityScope getVisibilityScope() {
        return this.visibilityScope;
    }

    public static final class Builder extends Request.Builder<UpdateSkillRequest, Builder> {
        private String regionId; 
        private String bundleUrl; 
        private String description; 
        private Integer expectedVersion; 
        private java.util.Map<String, ?> extra; 
        private String name; 
        private String skillMdOverride; 
        private String versionNote; 
        private VisibilityScope visibilityScope; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSkillRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bundleUrl = request.bundleUrl;
            this.description = request.description;
            this.expectedVersion = request.expectedVersion;
            this.extra = request.extra;
            this.name = request.name;
            this.skillMdOverride = request.skillMdOverride;
            this.versionNote = request.versionNote;
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
         * <p>The downloadable URL (HTTP/HTTPS) of the bundle.zip file. Mutually exclusive with SkillMdOverride. If provided, the bundle is replaced.</p>
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
         * <p>The Skill description.</p>
         * 
         * <strong>example:</strong>
         * <p>Data analytics skill</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The expected version number for optimistic locking. If not specified, the update is based on the current highest version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder expectedVersion(Integer expectedVersion) {
            this.putBodyParameter("ExpectedVersion", expectedVersion);
            this.expectedVersion = expectedVersion;
            return this;
        }

        /**
         * <p>The extended metadata (key-value pairs).</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;appId\&quot;:\&quot;APP_Q2SDWKIGFWNZTR68K1GQ\&quot;}</p>
         */
        public Builder extra(java.util.Map<String, ?> extra) {
            String extraShrink = shrink(extra, "Extra", "json");
            this.putBodyParameter("Extra", extraShrink);
            this.extra = extra;
            return this;
        }

        /**
         * <p>The name of the Skill to update.</p>
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
         * <p>The SKILL.md body content. Mutually exclusive with BundleUrl.</p>
         * 
         * <strong>example:</strong>
         * <p>Putting an elephant in a refrigerator takes three steps: open the refrigerator door, put the elephant in, and close the refrigerator door</p>
         */
        public Builder skillMdOverride(String skillMdOverride) {
            this.putBodyParameter("SkillMdOverride", skillMdOverride);
            this.skillMdOverride = skillMdOverride;
            return this;
        }

        /**
         * <p>The version note.</p>
         * 
         * <strong>example:</strong>
         * <p>Revision note</p>
         */
        public Builder versionNote(String versionNote) {
            this.putBodyParameter("VersionNote", versionNote);
            this.versionNote = versionNote;
            return this;
        }

        /**
         * <p>The visibility scope. The corresponding field is used based on the visibility level.</p>
         */
        public Builder visibilityScope(VisibilityScope visibilityScope) {
            String visibilityScopeShrink = shrink(visibilityScope, "VisibilityScope", "json");
            this.putBodyParameter("VisibilityScope", visibilityScopeShrink);
            this.visibilityScope = visibilityScope;
            return this;
        }

        @Override
        public UpdateSkillRequest build() {
            return new UpdateSkillRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateSkillRequest} extends {@link TeaModel}
     *
     * <p>UpdateSkillRequest</p>
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
             * <p>The list of visible project IDs.</p>
             */
            public Builder projectIds(java.util.List<String> projectIds) {
                this.projectIds = projectIds;
                return this;
            }

            /**
             * <p>The list of visible user IDs.</p>
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
