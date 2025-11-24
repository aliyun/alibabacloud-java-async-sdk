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
 * {@link GetGrafanaDashboardUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetGrafanaDashboardUrlResponseBody</p>
 */
public class GetGrafanaDashboardUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Dashboards")
    private java.util.List<Dashboards> dashboards;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

        private Builder(GetGrafanaDashboardUrlResponseBody model) {
            this.dashboards = model.dashboards;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the dashboard.</p>
         */
        public Builder dashboards(java.util.List<Dashboards> dashboards) {
            this.dashboards = dashboards;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>76DBB8A0-5AA6-5A56-9A8A-****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetGrafanaDashboardUrlResponseBody build() {
            return new GetGrafanaDashboardUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGrafanaDashboardUrlResponseBody} extends {@link TeaModel}
     *
     * <p>GetGrafanaDashboardUrlResponseBody</p>
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
             * <p>The name of the dashboard.</p>
             * 
             * <strong>example:</strong>
             * <p>Cloud ASM Istio Http Gateway</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The URL of the dashboard.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://g.console.aliyun.com/d/181863583797****-14651340-200-2/alibaba-cloud-mesh-service?orgId=32****&refresh=60s">https://g.console.aliyun.com/d/181863583797****-14651340-200-2/alibaba-cloud-mesh-service?orgId=32****&amp;refresh=60s</a></p>
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
