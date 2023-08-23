// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProjectRequest} extends {@link RequestModel}
 *
 * <p>GetProjectRequest</p>
 */
public class GetProjectRequest extends Request {
    @Path
    @NameInMap("projectName")
    @Validation(required = true)
    private String projectName;

    private GetProjectRequest(Builder builder) {
        super(builder);
        this.projectName = builder.projectName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectRequest create() {
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

    public static final class Builder extends Request.Builder<GetProjectRequest, Builder> {
        private String projectName; 

        private Builder() {
            super();
        } 

        private Builder(GetProjectRequest request) {
            super(request);
            this.projectName = request.projectName;
        } 

        /**
         * The name of the MaxCompute project.
         */
        public Builder projectName(String projectName) {
            this.putPathParameter("projectName", projectName);
            this.projectName = projectName;
            return this;
        }

        @Override
        public GetProjectRequest build() {
            return new GetProjectRequest(this);
        } 

    } 

}
