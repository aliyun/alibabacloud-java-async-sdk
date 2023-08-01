// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListDashboardResponseBody} extends {@link TeaModel}
 *
 * <p>ListDashboardResponseBody</p>
 */
public class ListDashboardResponseBody extends TeaModel {
    @NameInMap("dashboardItems")
    private java.util.List < DashboardItems> dashboardItems;

    @NameInMap("dashboards")
    private java.util.List < String > dashboards;

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
    public java.util.List < DashboardItems> getDashboardItems() {
        return this.dashboardItems;
    }

    /**
     * @return dashboards
     */
    public java.util.List < String > getDashboards() {
        return this.dashboards;
    }

    public static final class Builder {
        private java.util.List < DashboardItems> dashboardItems; 
        private java.util.List < String > dashboards; 

        /**
         * dashboardItems.
         */
        public Builder dashboardItems(java.util.List < DashboardItems> dashboardItems) {
            this.dashboardItems = dashboardItems;
            return this;
        }

        /**
         * dashboards.
         */
        public Builder dashboards(java.util.List < String > dashboards) {
            this.dashboards = dashboards;
            return this;
        }

        public ListDashboardResponseBody build() {
            return new ListDashboardResponseBody(this);
        } 

    } 

    public static class DashboardItems extends TeaModel {
        @NameInMap("dashboardName")
        private String dashboardName;

        @NameInMap("displayName")
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
             * dashboardName.
             */
            public Builder dashboardName(String dashboardName) {
                this.dashboardName = dashboardName;
                return this;
            }

            /**
             * displayName.
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
