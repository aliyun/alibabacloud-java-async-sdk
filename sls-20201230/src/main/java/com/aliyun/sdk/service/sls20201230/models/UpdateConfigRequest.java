// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link UpdateConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateConfigRequest</p>
 */
public class UpdateConfigRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Path
    @NameInMap("configName")
    @Validation(required = true)
    private String configName;

    @Body
    @NameInMap("body")
    private LogtailConfig body;

    private UpdateConfigRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.configName = builder.configName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConfigRequest create() {
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

    /**
     * @return body
     */
    public LogtailConfig getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateConfigRequest, Builder> {
        private String project; 
        private String configName; 
        private LogtailConfig body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateConfigRequest request) {
            super(request);
            this.project = request.project;
            this.configName = request.configName;
            this.body = request.body;
        } 

        /**
         * The name of the project.
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * The name of the Logtail configuration.
         */
        public Builder configName(String configName) {
            this.putPathParameter("configName", configName);
            this.configName = configName;
            return this;
        }

        /**
         * The body of the request.
         */
        public Builder body(LogtailConfig body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateConfigRequest build() {
            return new UpdateConfigRequest(this);
        } 

    } 

}
