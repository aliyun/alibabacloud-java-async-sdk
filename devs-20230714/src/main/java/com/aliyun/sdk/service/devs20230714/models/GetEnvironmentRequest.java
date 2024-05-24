// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEnvironmentRequest} extends {@link RequestModel}
 *
 * <p>GetEnvironmentRequest</p>
 */
public class GetEnvironmentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("project")
    @com.aliyun.core.annotation.Validation(required = true)
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private GetEnvironmentRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEnvironmentRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<GetEnvironmentRequest, Builder> {
        private String project; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(GetEnvironmentRequest request) {
            super(request);
            this.project = request.project;
            this.name = request.name;
        } 

        /**
         * project.
         */
        public Builder project(String project) {
            this.putPathParameter("project", project);
            this.project = project;
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

        @Override
        public GetEnvironmentRequest build() {
            return new GetEnvironmentRequest(this);
        } 

    } 

}
