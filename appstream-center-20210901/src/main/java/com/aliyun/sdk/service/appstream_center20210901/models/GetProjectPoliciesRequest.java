// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProjectPoliciesRequest} extends {@link RequestModel}
 *
 * <p>GetProjectPoliciesRequest</p>
 */
public class GetProjectPoliciesRequest extends Request {
    @Query
    @NameInMap("ProjectId")
    private String projectId;

    private GetProjectPoliciesRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectPoliciesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<GetProjectPoliciesRequest, Builder> {
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(GetProjectPoliciesRequest request) {
            super(request);
            this.projectId = request.projectId;
        } 

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public GetProjectPoliciesRequest build() {
            return new GetProjectPoliciesRequest(this);
        } 

    } 

}
