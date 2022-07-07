// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetLoggingRequest} extends {@link RequestModel}
 *
 * <p>GetLoggingRequest</p>
 */
public class GetLoggingRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    private GetLoggingRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLoggingRequest create() {
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

    public static final class Builder extends Request.Builder<GetLoggingRequest, Builder> {
        private String project; 

        private Builder() {
            super();
        } 

        private Builder(GetLoggingRequest request) {
            super(request);
            this.project = request.project;
        } 

        /**
         * Project 名称。
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        @Override
        public GetLoggingRequest build() {
            return new GetLoggingRequest(this);
        } 

    } 

}
