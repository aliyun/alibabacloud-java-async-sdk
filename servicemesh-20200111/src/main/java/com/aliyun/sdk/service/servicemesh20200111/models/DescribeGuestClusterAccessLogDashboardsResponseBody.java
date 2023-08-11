// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGuestClusterAccessLogDashboardsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGuestClusterAccessLogDashboardsResponseBody</p>
 */
public class DescribeGuestClusterAccessLogDashboardsResponseBody extends TeaModel {
    @NameInMap("Dashboards")
    private java.util.List < Dashboards> dashboards;

    @NameInMap("K8sClusterId")
    private String k8sClusterId;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeGuestClusterAccessLogDashboardsResponseBody(Builder builder) {
        this.dashboards = builder.dashboards;
        this.k8sClusterId = builder.k8sClusterId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGuestClusterAccessLogDashboardsResponseBody create() {
        return builder().build();
    }

    /**
     * @return dashboards
     */
    public java.util.List < Dashboards> getDashboards() {
        return this.dashboards;
    }

    /**
     * @return k8sClusterId
     */
    public String getK8sClusterId() {
        return this.k8sClusterId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Dashboards> dashboards; 
        private String k8sClusterId; 
        private String requestId; 

        /**
         * The access log reports of a cluster on the data plane.
         */
        public Builder dashboards(java.util.List < Dashboards> dashboards) {
            this.dashboards = dashboards;
            return this;
        }

        /**
         * The ID of the cluster on the data plane.
         */
        public Builder k8sClusterId(String k8sClusterId) {
            this.k8sClusterId = k8sClusterId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeGuestClusterAccessLogDashboardsResponseBody build() {
            return new DescribeGuestClusterAccessLogDashboardsResponseBody(this);
        } 

    } 

    public static class Dashboards extends TeaModel {
        @NameInMap("Title")
        private String title;

        @NameInMap("Url")
        private String url;

        private Dashboards(Builder builder) {
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dashboards create() {
            return builder().build();
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String title; 
            private String url; 

            /**
             * The title of the report.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * The URL of the report.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Dashboards build() {
                return new Dashboards(this);
            } 

        } 

    }
}
