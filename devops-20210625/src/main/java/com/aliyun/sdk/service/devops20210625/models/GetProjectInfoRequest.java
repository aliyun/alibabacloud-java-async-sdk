// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProjectInfoRequest} extends {@link RequestModel}
 *
 * <p>GetProjectInfoRequest</p>
 */
public class GetProjectInfoRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Path
    @NameInMap("projectId")
    @Validation(required = true)
    private String projectId;

    private GetProjectInfoRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<GetProjectInfoRequest, Builder> {
        private String organizationId; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(GetProjectInfoRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.projectId = request.projectId;
        } 

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * 项目id
         */
        public Builder projectId(String projectId) {
            this.putPathParameter("projectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public GetProjectInfoRequest build() {
            return new GetProjectInfoRequest(this);
        } 

    } 

}
