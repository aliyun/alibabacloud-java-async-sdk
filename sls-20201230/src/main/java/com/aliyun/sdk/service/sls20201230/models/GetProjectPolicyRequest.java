// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetProjectPolicyRequest} extends {@link RequestModel}
 *
 * <p>GetProjectPolicyRequest</p>
 */
public class GetProjectPolicyRequest extends Request {
    @Host
    @NameInMap("project")
    private String project;

    private GetProjectPolicyRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectPolicyRequest create() {
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

    public static final class Builder extends Request.Builder<GetProjectPolicyRequest, Builder> {
        private String project; 

        private Builder() {
            super();
        } 

        private Builder(GetProjectPolicyRequest request) {
            super(request);
            this.project = request.project;
        } 

        /**
         * A short description of struct
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        @Override
        public GetProjectPolicyRequest build() {
            return new GetProjectPolicyRequest(this);
        } 

    } 

}
