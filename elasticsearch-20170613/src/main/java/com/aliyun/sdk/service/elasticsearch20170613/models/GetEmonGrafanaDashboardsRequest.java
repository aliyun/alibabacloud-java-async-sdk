// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEmonGrafanaDashboardsRequest} extends {@link RequestModel}
 *
 * <p>GetEmonGrafanaDashboardsRequest</p>
 */
public class GetEmonGrafanaDashboardsRequest extends Request {
    @Path
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    private GetEmonGrafanaDashboardsRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEmonGrafanaDashboardsRequest create() {
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

    public static final class Builder extends Request.Builder<GetEmonGrafanaDashboardsRequest, Builder> {
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(GetEmonGrafanaDashboardsRequest response) {
            super(response);
            this.projectId = response.projectId;
        } 

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putPathParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public GetEmonGrafanaDashboardsRequest build() {
            return new GetEmonGrafanaDashboardsRequest(this);
        } 

    } 

}
