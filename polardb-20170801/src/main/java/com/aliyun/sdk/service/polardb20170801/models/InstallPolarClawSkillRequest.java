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
 * {@link InstallPolarClawSkillRequest} extends {@link RequestModel}
 *
 * <p>InstallPolarClawSkillRequest</p>
 */
public class InstallPolarClawSkillRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Force")
    private Boolean force;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillVersion")
    private String skillVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Slug")
    private String slug;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    private InstallPolarClawSkillRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.force = builder.force;
        this.skillVersion = builder.skillVersion;
        this.slug = builder.slug;
        this.source = builder.source;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallPolarClawSkillRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
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
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<InstallPolarClawSkillRequest, Builder> {
        private String applicationId; 
        private Boolean force; 
        private String skillVersion; 
        private String slug; 
        private String source; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(InstallPolarClawSkillRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.force = request.force;
            this.skillVersion = request.skillVersion;
            this.slug = request.slug;
            this.source = request.source;
            this.url = request.url;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-xxx</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Force.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * SkillVersion.
         */
        public Builder skillVersion(String skillVersion) {
            this.putQueryParameter("SkillVersion", skillVersion);
            this.skillVersion = skillVersion;
            return this;
        }

        /**
         * Slug.
         */
        public Builder slug(String slug) {
            this.putQueryParameter("Slug", slug);
            this.slug = slug;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/skill.tar.gz">https://example.com/skill.tar.gz</a></p>
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public InstallPolarClawSkillRequest build() {
            return new InstallPolarClawSkillRequest(this);
        } 

    } 

}
