// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link CreateDeployRevisionRequest} extends {@link RequestModel}
 *
 * <p>CreateDeployRevisionRequest</p>
 */
public class CreateDeployRevisionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeployResourceType")
    private String deployResourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Hooks")
    private String hooks;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Location")
    private String location;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RevisionType")
    private String revisionType;

    private CreateDeployRevisionRequest(Builder builder) {
        super(builder);
        this.applicationName = builder.applicationName;
        this.deployResourceType = builder.deployResourceType;
        this.description = builder.description;
        this.hooks = builder.hooks;
        this.location = builder.location;
        this.revisionType = builder.revisionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDeployRevisionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationName
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * @return deployResourceType
     */
    public String getDeployResourceType() {
        return this.deployResourceType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return hooks
     */
    public String getHooks() {
        return this.hooks;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return revisionType
     */
    public String getRevisionType() {
        return this.revisionType;
    }

    public static final class Builder extends Request.Builder<CreateDeployRevisionRequest, Builder> {
        private String applicationName; 
        private String deployResourceType; 
        private String description; 
        private String hooks; 
        private String location; 
        private String revisionType; 

        private Builder() {
            super();
        } 

        private Builder(CreateDeployRevisionRequest request) {
            super(request);
            this.applicationName = request.applicationName;
            this.deployResourceType = request.deployResourceType;
            this.description = request.description;
            this.hooks = request.hooks;
            this.location = request.location;
            this.revisionType = request.revisionType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AgentColin3</p>
         */
        public Builder applicationName(String applicationName) {
            this.putQueryParameter("ApplicationName", applicationName);
            this.applicationName = applicationName;
            return this;
        }

        /**
         * DeployResourceType.
         */
        public Builder deployResourceType(String deployResourceType) {
            this.putQueryParameter("DeployResourceType", deployResourceType);
            this.deployResourceType = deployResourceType;
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
         * Hooks.
         */
        public Builder hooks(String hooks) {
            this.putQueryParameter("Hooks", hooks);
            this.hooks = hooks;
            return this;
        }

        /**
         * Location.
         */
        public Builder location(String location) {
            this.putQueryParameter("Location", location);
            this.location = location;
            return this;
        }

        /**
         * RevisionType.
         */
        public Builder revisionType(String revisionType) {
            this.putQueryParameter("RevisionType", revisionType);
            this.revisionType = revisionType;
            return this;
        }

        @Override
        public CreateDeployRevisionRequest build() {
            return new CreateDeployRevisionRequest(this);
        } 

    } 

}
