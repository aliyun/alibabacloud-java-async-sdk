// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeGuestClusterAccessLogDashboardsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGuestClusterAccessLogDashboardsResponseBody</p>
 */
public class DescribeGuestClusterAccessLogDashboardsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Dashboards")
    private java.util.List<Dashboards> dashboards;

    @com.aliyun.core.annotation.NameInMap("K8sClusterId")
    private String k8sClusterId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dashboards
     */
    public java.util.List<Dashboards> getDashboards() {
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
        private java.util.List<Dashboards> dashboards; 
        private String k8sClusterId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeGuestClusterAccessLogDashboardsResponseBody model) {
            this.dashboards = model.dashboards;
            this.k8sClusterId = model.k8sClusterId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The access log dashboards of the cluster on the data plane.</p>
         */
        public Builder dashboards(java.util.List<Dashboards> dashboards) {
            this.dashboards = dashboards;
            return this;
        }

        /**
         * <p>The ID of the cluster on the data plane.</p>
         * 
         * <strong>example:</strong>
         * <p>ce3c25e247da24f3aab9b7edfae83****</p>
         */
        public Builder k8sClusterId(String k8sClusterId) {
            this.k8sClusterId = k8sClusterId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BD65C0AD-D3C6-48D3-8D93-38D2015C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeGuestClusterAccessLogDashboardsResponseBody build() {
            return new DescribeGuestClusterAccessLogDashboardsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGuestClusterAccessLogDashboardsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGuestClusterAccessLogDashboardsResponseBody</p>
     */
    public static class Dashboards extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
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

            private Builder() {
            } 

            private Builder(Dashboards model) {
                this.title = model.title;
                this.url = model.url;
            } 

            /**
             * <p>The title of the dashboard.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The URL of a dashboard.</p>
             * 
             * <strong>example:</strong>
             * <p>test.com</p>
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
