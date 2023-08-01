// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link Dashboard} extends {@link TeaModel}
 *
 * <p>Dashboard</p>
 */
public class Dashboard extends TeaModel {
    @NameInMap("attribute")
    private java.util.Map < String, String > attribute;

    @NameInMap("charts")
    @Validation(required = true)
    private java.util.List < Chart > charts;

    @NameInMap("dashboardName")
    @Validation(required = true)
    private String dashboardName;

    @NameInMap("description")
    private String description;

    @NameInMap("displayName")
    @Validation(required = true)
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
        private java.util.Map < String, String > attribute; 
        private java.util.List < Chart > charts; 
        private String dashboardName; 
        private String description; 
        private String displayName; 

        /**
         * attribute.
         */
        public Builder attribute(java.util.Map < String, String > attribute) {
            this.attribute = attribute;
            return this;
        }

        /**
         * charts.
         */
        public Builder charts(java.util.List < Chart > charts) {
            this.charts = charts;
            return this;
        }

        /**
         * dashboardName.
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
         * displayName.
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
