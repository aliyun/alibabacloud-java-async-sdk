// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link UpdateDashboardRequest} extends {@link RequestModel}
 *
 * <p>UpdateDashboardRequest</p>
 */
public class UpdateDashboardRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Path
    @Body
    @NameInMap("dashboardName")
    @Validation(required = true)
    private String dashboardName;

    @Body
    @NameInMap("attribute")
    private java.util.Map < String, String > attribute;

    @Body
    @NameInMap("charts")
    @Validation(required = true)
    private java.util.List < Chart > charts;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("displayName")
    @Validation(required = true)
    private String displayName;

    private UpdateDashboardRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.dashboardName = builder.dashboardName;
        this.attribute = builder.attribute;
        this.charts = builder.charts;
        this.description = builder.description;
        this.displayName = builder.displayName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDashboardRequest create() {
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

    /**
     * @return attribute
     */
    public java.util.Map < String, String > getAttribute() {
        return this.attribute;
    }

    /**
     * @return charts
     */
    public java.util.List < Chart > getCharts() {
        return this.charts;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    public static final class Builder extends Request.Builder<UpdateDashboardRequest, Builder> {
        private String project; 
        private String dashboardName; 
        private java.util.Map < String, String > attribute; 
        private java.util.List < Chart > charts; 
        private String description; 
        private String displayName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDashboardRequest request) {
            super(request);
            this.project = request.project;
            this.dashboardName = request.dashboardName;
            this.attribute = request.attribute;
            this.charts = request.charts;
            this.description = request.description;
            this.displayName = request.displayName;
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
            this.putBodyParameter("dashboardName", dashboardName);
            this.dashboardName = dashboardName;
            return this;
        }

        /**
         * The attributes of the dashboard.
         */
        public Builder attribute(java.util.Map < String, String > attribute) {
            this.putBodyParameter("attribute", attribute);
            this.attribute = attribute;
            return this;
        }

        /**
         * The charts on the dashboard.
         */
        public Builder charts(java.util.List < Chart > charts) {
            this.putBodyParameter("charts", charts);
            this.charts = charts;
            return this;
        }

        /**
         * The description of the dashboard.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * The display name of the dashboard.
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        @Override
        public UpdateDashboardRequest build() {
            return new UpdateDashboardRequest(this);
        } 

    } 

}
