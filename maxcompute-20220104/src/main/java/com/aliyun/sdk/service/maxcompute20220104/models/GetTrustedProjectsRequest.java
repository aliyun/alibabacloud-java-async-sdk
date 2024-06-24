// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrustedProjectsRequest} extends {@link RequestModel}
 *
 * <p>GetTrustedProjectsRequest</p>
 */
public class GetTrustedProjectsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    private GetTrustedProjectsRequest(Builder builder) {
        super(builder);
        this.projectName = builder.projectName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrustedProjectsRequest create() {
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

    public static final class Builder extends Request.Builder<GetTrustedProjectsRequest, Builder> {
        private String projectName; 

        private Builder() {
            super();
        } 

        private Builder(GetTrustedProjectsRequest request) {
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
        public GetTrustedProjectsRequest build() {
            return new GetTrustedProjectsRequest(this);
        } 

    } 

}
