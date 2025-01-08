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
 * {@link UpdateDashboardRequest} extends {@link RequestModel}
 *
 * <p>UpdateDashboardRequest</p>
 */
public class UpdateDashboardRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dashboardName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dashboardName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("attribute")
    private java.util.Map<String, String> attribute;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("charts")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Chart> charts;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("displayName")
    @com.aliyun.core.annotation.Validation(required = true)
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
    public java.util.Map<String, String> getAttribute() {
        return this.attribute;
    }

    /**
     * @return charts
     */
    public java.util.List<Chart> getCharts() {
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
        private java.util.Map<String, String> attribute; 
        private java.util.List<Chart> charts; 
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
            this.putBodyParameter("dashboardName", dashboardName);
            this.dashboardName = dashboardName;
            return this;
        }

        /**
         * <p>The attribute values of the dashboard.</p>
         */
        public Builder attribute(java.util.Map<String, String> attribute) {
            this.putBodyParameter("attribute", attribute);
            this.attribute = attribute;
            return this;
        }

        /**
         * <p>The charts on the dashboard.</p>
         * <p>This parameter is required.</p>
         */
        public Builder charts(java.util.List<Chart> charts) {
            this.putBodyParameter("charts", charts);
            this.charts = charts;
            return this;
        }

        /**
         * <p>The description of the dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p>test dashboard.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The display name of the dashboard.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Method pv</p>
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
