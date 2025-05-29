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
 * {@link CreateRenderingProjectRequest} extends {@link RequestModel}
 *
 * <p>CreateRenderingProjectRequest</p>
 */
public class CreateRenderingProjectRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 255)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionAttribs")
    private SessionAttribs sessionAttribs;

    private CreateRenderingProjectRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.projectName = builder.projectName;
        this.sessionAttribs = builder.sessionAttribs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRenderingProjectRequest create() {
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

    public static final class Builder extends Request.Builder<CreateRenderingProjectRequest, Builder> {
        private String description; 
        private String projectName; 
        private SessionAttribs sessionAttribs; 

        private Builder() {
            super();
        } 

        private Builder(CreateRenderingProjectRequest request) {
            super(request);
            this.description = request.description;
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
         * <p>du_merchant_d</p>
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
        public CreateRenderingProjectRequest build() {
            return new CreateRenderingProjectRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateRenderingProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateRenderingProjectRequest</p>
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
