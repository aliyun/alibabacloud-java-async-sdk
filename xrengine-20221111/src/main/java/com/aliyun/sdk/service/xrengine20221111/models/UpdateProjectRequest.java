// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20221111.models;

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
 * {@link UpdateProjectRequest} extends {@link RequestModel}
 *
 * <p>UpdateProjectRequest</p>
 */
public class UpdateProjectRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoBuild")
    private Boolean autoBuild;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ext")
    private java.util.Map<String, ?> ext;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Intro")
    private String intro;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JwtToken")
    private String jwtToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    private UpdateProjectRequest(Builder builder) {
        super(builder);
        this.autoBuild = builder.autoBuild;
        this.ext = builder.ext;
        this.intro = builder.intro;
        this.jwtToken = builder.jwtToken;
        this.projectId = builder.projectId;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProjectRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoBuild
     */
    public Boolean getAutoBuild() {
        return this.autoBuild;
    }

    /**
     * @return ext
     */
    public java.util.Map<String, ?> getExt() {
        return this.ext;
    }

    /**
     * @return intro
     */
    public String getIntro() {
        return this.intro;
    }

    /**
     * @return jwtToken
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<UpdateProjectRequest, Builder> {
        private Boolean autoBuild; 
        private java.util.Map<String, ?> ext; 
        private String intro; 
        private String jwtToken; 
        private String projectId; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProjectRequest request) {
            super(request);
            this.autoBuild = request.autoBuild;
            this.ext = request.ext;
            this.intro = request.intro;
            this.jwtToken = request.jwtToken;
            this.projectId = request.projectId;
            this.title = request.title;
        } 

        /**
         * AutoBuild.
         */
        public Builder autoBuild(Boolean autoBuild) {
            this.putQueryParameter("AutoBuild", autoBuild);
            this.autoBuild = autoBuild;
            return this;
        }

        /**
         * Ext.
         */
        public Builder ext(java.util.Map<String, ?> ext) {
            String extShrink = shrink(ext, "Ext", "json");
            this.putQueryParameter("Ext", extShrink);
            this.ext = ext;
            return this;
        }

        /**
         * Intro.
         */
        public Builder intro(String intro) {
            this.putQueryParameter("Intro", intro);
            this.intro = intro;
            return this;
        }

        /**
         * JwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putQueryParameter("JwtToken", jwtToken);
            this.jwtToken = jwtToken;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public UpdateProjectRequest build() {
            return new UpdateProjectRequest(this);
        } 

    } 

}
