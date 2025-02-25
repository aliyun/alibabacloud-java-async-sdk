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
 * {@link ListDashboardResponseBody} extends {@link TeaModel}
 *
 * <p>ListDashboardResponseBody</p>
 */
public class ListDashboardResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("dashboardItems")
    private java.util.List<DashboardItems> dashboardItems;

    @com.aliyun.core.annotation.NameInMap("dashboards")
    private java.util.List<String> dashboards;

    private ListDashboardResponseBody(Builder builder) {
        this.dashboardItems = builder.dashboardItems;
        this.dashboards = builder.dashboards;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDashboardResponseBody create() {
        return builder().build();
    }

    /**
     * @return dashboardItems
     */
    public java.util.List<DashboardItems> getDashboardItems() {
        return this.dashboardItems;
    }

    /**
     * @return dashboards
     */
    public java.util.List<String> getDashboards() {
        return this.dashboards;
    }

    public static final class Builder {
        private java.util.List<DashboardItems> dashboardItems; 
        private java.util.List<String> dashboards; 

        /**
         * <p>The details of the dashboard.</p>
         */
        public Builder dashboardItems(java.util.List<DashboardItems> dashboardItems) {
            this.dashboardItems = dashboardItems;
            return this;
        }

        /**
         * <p>The queried dashboards. Each dashboard in the array is specified by dashboardName.</p>
         */
        public Builder dashboards(java.util.List<String> dashboards) {
            this.dashboards = dashboards;
            return this;
        }

        public ListDashboardResponseBody build() {
            return new ListDashboardResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDashboardResponseBody} extends {@link TeaModel}
     *
     * <p>ListDashboardResponseBody</p>
     */
    public static class DashboardItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dashboardName")
        private String dashboardName;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        private DashboardItems(Builder builder) {
            this.dashboardName = builder.dashboardName;
            this.displayName = builder.displayName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DashboardItems create() {
            return builder().build();
        }

        /**
         * @return dashboardName
         */
        public String getDashboardName() {
            return this.dashboardName;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        public static final class Builder {
            private String dashboardName; 
            private String displayName; 

            /**
             * <p>The dashboard ID. The ID must be unique in a project. Fuzzy search is supported. For example, if you enter da, all dashboards whose IDs start with da are queried.</p>
             * 
             * <strong>example:</strong>
             * <p>dashboard-1609294922657-434834</p>
             */
            public Builder dashboardName(String dashboardName) {
                this.dashboardName = dashboardName;
                return this;
            }

            /**
             * <p>The display name of the dashboard.</p>
             * 
             * <strong>example:</strong>
             * <p>data-ingest</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            public DashboardItems build() {
                return new DashboardItems(this);
            } 

        } 

    }
}
