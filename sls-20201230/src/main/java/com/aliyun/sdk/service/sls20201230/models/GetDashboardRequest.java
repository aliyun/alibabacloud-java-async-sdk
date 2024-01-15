// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetDashboardRequest} extends {@link RequestModel}
 *
 * <p>GetDashboardRequest</p>
 */
public class GetDashboardRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Path
    @NameInMap("dashboardName")
    @Validation(required = true)
    private String dashboardName;

    private GetDashboardRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.dashboardName = builder.dashboardName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDashboardRequest create() {
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
     * @return dashboardName
     */
    public String getDashboardName() {
        return this.dashboardName;
    }

    public static final class Builder extends Request.Builder<GetDashboardRequest, Builder> {
        private String project; 
        private String dashboardName; 

        private Builder() {
            super();
        } 

        private Builder(GetDashboardRequest request) {
            super(request);
            this.project = request.project;
            this.dashboardName = request.dashboardName;
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
         * The name of the dashboard.
         */
        public Builder dashboardName(String dashboardName) {
            this.putPathParameter("dashboardName", dashboardName);
            this.dashboardName = dashboardName;
            return this;
        }

        @Override
        public GetDashboardRequest build() {
            return new GetDashboardRequest(this);
        } 

    } 

}
