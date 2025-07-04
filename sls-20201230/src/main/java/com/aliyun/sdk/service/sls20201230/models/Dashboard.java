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
 * {@link Dashboard} extends {@link TeaModel}
 *
 * <p>Dashboard</p>
 */
public class Dashboard extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("attribute")
    private java.util.Map<String, String> attribute;

    @com.aliyun.core.annotation.NameInMap("charts")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Chart> charts;

    @com.aliyun.core.annotation.NameInMap("dashboardName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dashboardName;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("displayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String displayName;

    private Dashboard(Builder builder) {
        this.attribute = builder.attribute;
        this.charts = builder.charts;
        this.dashboardName = builder.dashboardName;
        this.description = builder.description;
        this.displayName = builder.displayName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Dashboard create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return dashboardName
     */
    public String getDashboardName() {
        return this.dashboardName;
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

    public static final class Builder {
        private java.util.Map<String, String> attribute; 
        private java.util.List<Chart> charts; 
        private String dashboardName; 
        private String description; 
        private String displayName; 

        private Builder() {
        } 

        private Builder(Dashboard model) {
            this.attribute = model.attribute;
            this.charts = model.charts;
            this.dashboardName = model.dashboardName;
            this.description = model.description;
            this.displayName = model.displayName;
        } 

        /**
         * attribute.
         */
        public Builder attribute(java.util.Map<String, String> attribute) {
            this.attribute = attribute;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder charts(java.util.List<Chart> charts) {
            this.charts = charts;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dashboard-1609294922657-434834</p>
         */
        public Builder dashboardName(String dashboardName) {
            this.dashboardName = dashboardName;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-alert</p>
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Dashboard build() {
            return new Dashboard(this);
        } 

    } 

}
