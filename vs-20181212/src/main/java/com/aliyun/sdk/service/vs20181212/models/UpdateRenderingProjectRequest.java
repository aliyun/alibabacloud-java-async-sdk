// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link UpdateRenderingProjectRequest} extends {@link RequestModel}
 *
 * <p>UpdateRenderingProjectRequest</p>
 */
public class UpdateRenderingProjectRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 255)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionAttribs")
    private SessionAttribs sessionAttribs;

    private UpdateRenderingProjectRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.projectId = builder.projectId;
        this.projectName = builder.projectName;
        this.sessionAttribs = builder.sessionAttribs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRenderingProjectRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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

    /**
     * @return sessionAttribs
     */
    public SessionAttribs getSessionAttribs() {
        return this.sessionAttribs;
    }

    public static final class Builder extends Request.Builder<UpdateRenderingProjectRequest, Builder> {
        private String description; 
        private String projectId; 
        private String projectName; 
        private SessionAttribs sessionAttribs; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRenderingProjectRequest request) {
            super(request);
            this.description = request.description;
            this.projectId = request.projectId;
            this.projectName = request.projectName;
            this.sessionAttribs = request.sessionAttribs;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>project-422bc38dfgh5eb44149f135ef76304f63b</p>
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * SessionAttribs.
         */
        public Builder sessionAttribs(SessionAttribs sessionAttribs) {
            String sessionAttribsShrink = shrink(sessionAttribs, "SessionAttribs", "json");
            this.putQueryParameter("SessionAttribs", sessionAttribsShrink);
            this.sessionAttribs = sessionAttribs;
            return this;
        }

        @Override
        public UpdateRenderingProjectRequest build() {
            return new UpdateRenderingProjectRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateRenderingProjectRequest} extends {@link TeaModel}
     *
     * <p>UpdateRenderingProjectRequest</p>
     */
    public static class SessionAttribs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StartMode")
        private String startMode;

        private SessionAttribs(Builder builder) {
            this.startMode = builder.startMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SessionAttribs create() {
            return builder().build();
        }

        /**
         * @return startMode
         */
        public String getStartMode() {
            return this.startMode;
        }

        public static final class Builder {
            private String startMode; 

            private Builder() {
            } 

            private Builder(SessionAttribs model) {
                this.startMode = model.startMode;
            } 

            /**
             * StartMode.
             */
            public Builder startMode(String startMode) {
                this.startMode = startMode;
                return this;
            }

            public SessionAttribs build() {
                return new SessionAttribs(this);
            } 

        } 

    }
}
