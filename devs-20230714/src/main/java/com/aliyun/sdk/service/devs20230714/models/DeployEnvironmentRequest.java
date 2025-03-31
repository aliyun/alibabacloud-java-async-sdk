// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link DeployEnvironmentRequest} extends {@link RequestModel}
 *
 * <p>DeployEnvironmentRequest</p>
 */
public class DeployEnvironmentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectName")
    private String projectName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private DeployEnvironmentOptions body;

    private DeployEnvironmentRequest(Builder builder) {
        super(builder);
        this.projectName = builder.projectName;
        this.name = builder.name;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeployEnvironmentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return body
     */
    public DeployEnvironmentOptions getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<DeployEnvironmentRequest, Builder> {
        private String projectName; 
        private String name; 
        private DeployEnvironmentOptions body; 

        private Builder() {
            super();
        } 

        private Builder(DeployEnvironmentRequest request) {
            super(request);
            this.projectName = request.projectName;
            this.name = request.name;
            this.body = request.body;
        } 

        /**
         * projectName.
         */
        public Builder projectName(String projectName) {
            this.putPathParameter("projectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * body.
         */
        public Builder body(DeployEnvironmentOptions body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public DeployEnvironmentRequest build() {
            return new DeployEnvironmentRequest(this);
        } 

    } 

}
