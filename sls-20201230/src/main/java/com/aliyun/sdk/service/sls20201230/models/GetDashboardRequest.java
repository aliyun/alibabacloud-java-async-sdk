// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link GetDashboardRequest} extends {@link RequestModel}
 *
 * <p>GetDashboardRequest</p>
 */
public class GetDashboardRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("dashboardName")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The name of the project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-project</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The name of the dashboard.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dashboard-1609294922657-434834</p>
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
