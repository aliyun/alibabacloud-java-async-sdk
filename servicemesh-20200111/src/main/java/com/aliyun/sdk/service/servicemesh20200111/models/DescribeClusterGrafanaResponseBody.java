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
 * {@link DescribeClusterGrafanaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterGrafanaResponseBody</p>
 */
public class DescribeClusterGrafanaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Dashboards")
    private java.util.List<Dashboards> dashboards;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeClusterGrafanaResponseBody(Builder builder) {
        this.dashboards = builder.dashboards;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterGrafanaResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Dashboards> dashboards; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeClusterGrafanaResponseBody model) {
            this.dashboards = model.dashboards;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about Grafana dashboards.</p>
         */
        public Builder dashboards(java.util.List<Dashboards> dashboards) {
            this.dashboards = dashboards;
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

        public DescribeClusterGrafanaResponseBody build() {
            return new DescribeClusterGrafanaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClusterGrafanaResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterGrafanaResponseBody</p>
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
             * <p>The title of the Grafana dashboard.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The endpoint of the Grafana dashboard.</p>
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
