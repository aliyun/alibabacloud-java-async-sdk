// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetGrafanaDashboardUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetGrafanaDashboardUrlResponseBody</p>
 */
public class GetGrafanaDashboardUrlResponseBody extends TeaModel {
    @NameInMap("Dashboards")
    private java.util.List < Dashboards> dashboards;

    @NameInMap("RequestId")
    private String requestId;

    private GetGrafanaDashboardUrlResponseBody(Builder builder) {
        this.dashboards = builder.dashboards;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGrafanaDashboardUrlResponseBody create() {
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
         * The information about the dashboard.
         */
        public Builder dashboards(java.util.List < Dashboards> dashboards) {
            this.dashboards = dashboards;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetGrafanaDashboardUrlResponseBody build() {
            return new GetGrafanaDashboardUrlResponseBody(this);
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
             * The name of the dashboard.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * The URL of the dashboard.
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
