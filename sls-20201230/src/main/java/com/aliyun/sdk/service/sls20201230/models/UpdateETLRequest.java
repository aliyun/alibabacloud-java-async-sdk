// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link UpdateETLRequest} extends {@link RequestModel}
 *
 * <p>UpdateETLRequest</p>
 */
public class UpdateETLRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("etlName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String etlName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("configuration")
    @com.aliyun.core.annotation.Validation(required = true)
    private ETLConfiguration configuration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("displayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String displayName;

    private UpdateETLRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.etlName = builder.etlName;
        this.configuration = builder.configuration;
        this.description = builder.description;
        this.displayName = builder.displayName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateETLRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return etlName
     */
    public String getEtlName() {
        return this.etlName;
    }

    /**
     * @return configuration
     */
    public ETLConfiguration getConfiguration() {
        return this.configuration;
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

    public static final class Builder extends Request.Builder<UpdateETLRequest, Builder> {
        private String project; 
        private String etlName; 
        private ETLConfiguration configuration; 
        private String description; 
        private String displayName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateETLRequest request) {
            super(request);
            this.project = request.project;
            this.etlName = request.etlName;
            this.configuration = request.configuration;
            this.description = request.description;
            this.displayName = request.displayName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-project</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>etl-123456</p>
         */
        public Builder etlName(String etlName) {
            this.putPathParameter("etlName", etlName);
            this.etlName = etlName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder configuration(ETLConfiguration configuration) {
            this.putBodyParameter("configuration", configuration);
            this.configuration = configuration;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>this is update</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        @Override
        public UpdateETLRequest build() {
            return new UpdateETLRequest(this);
        } 

    } 

}
