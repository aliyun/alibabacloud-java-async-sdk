// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterGrafanaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterGrafanaResponseBody</p>
 */
public class DescribeClusterGrafanaResponseBody extends TeaModel {
    @NameInMap("Dashboards")
    private java.util.List < Dashboards> dashboards;

    @NameInMap("RequestId")
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

    /**
     * @return dashboards
     */
    public java.util.List < Dashboards> getDashboards() {
        return this.dashboards;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Dashboards> dashboards; 
        private String requestId; 

        /**
         * Dashboards.
         */
        public Builder dashboards(java.util.List < Dashboards> dashboards) {
            this.dashboards = dashboards;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClusterGrafanaResponseBody build() {
            return new DescribeClusterGrafanaResponseBody(this);
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
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Url.
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
