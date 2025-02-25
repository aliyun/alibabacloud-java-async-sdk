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
 * {@link DeleteLogtailPipelineConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteLogtailPipelineConfigRequest</p>
 */
public class DeleteLogtailPipelineConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("configName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configName;

    private DeleteLogtailPipelineConfigRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.configName = builder.configName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLogtailPipelineConfigRequest create() {
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
     * @return configName
     */
    public String getConfigName() {
        return this.configName;
    }

    public static final class Builder extends Request.Builder<DeleteLogtailPipelineConfigRequest, Builder> {
        private String project; 
        private String configName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLogtailPipelineConfigRequest request) {
            super(request);
            this.project = request.project;
            this.configName = request.configName;
        } 

        /**
         * <p>The name of the project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The name of the Logtail pipeline configuration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-config</p>
         */
        public Builder configName(String configName) {
            this.putPathParameter("configName", configName);
            this.configName = configName;
            return this;
        }

        @Override
        public DeleteLogtailPipelineConfigRequest build() {
            return new DeleteLogtailPipelineConfigRequest(this);
        } 

    } 

}
