// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDashboardsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDashboardsResponseBody</p>
 */
public class ListDashboardsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DashboardVos")
    private java.util.List < DashboardVos> dashboardVos;

    @com.aliyun.core.annotation.NameInMap("EnvironmentId")
    private String environmentId;

    @com.aliyun.core.annotation.NameInMap("GrafanaServiceOpened")
    private String grafanaServiceOpened;

    @com.aliyun.core.annotation.NameInMap("PrometheusServiceOpened")
    private String prometheusServiceOpened;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDashboardsResponseBody(Builder builder) {
        this.dashboardVos = builder.dashboardVos;
        this.environmentId = builder.environmentId;
        this.grafanaServiceOpened = builder.grafanaServiceOpened;
        this.prometheusServiceOpened = builder.prometheusServiceOpened;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDashboardsResponseBody create() {
        return builder().build();
    }

    /**
     * @return dashboardVos
     */
    public java.util.List < DashboardVos> getDashboardVos() {
        return this.dashboardVos;
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * @return grafanaServiceOpened
     */
    public String getGrafanaServiceOpened() {
        return this.grafanaServiceOpened;
    }

    /**
     * @return prometheusServiceOpened
     */
    public String getPrometheusServiceOpened() {
        return this.prometheusServiceOpened;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DashboardVos> dashboardVos; 
        private String environmentId; 
        private String grafanaServiceOpened; 
        private String prometheusServiceOpened; 
        private String requestId; 

        /**
         * The information about the Grafana dashboard.
         */
        public Builder dashboardVos(java.util.List < DashboardVos> dashboardVos) {
            this.dashboardVos = dashboardVos;
            return this;
        }

        /**
         * The environment ID.
         */
        public Builder environmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        /**
         * Whether to enable Grafana service.
         */
        public Builder grafanaServiceOpened(String grafanaServiceOpened) {
            this.grafanaServiceOpened = grafanaServiceOpened;
            return this;
        }

        /**
         * Whether or not to turn on Prometheus service.
         */
        public Builder prometheusServiceOpened(String prometheusServiceOpened) {
            this.prometheusServiceOpened = prometheusServiceOpened;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDashboardsResponseBody build() {
            return new ListDashboardsResponseBody(this);
        } 

    } 

    public static class I18nChild extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DashboardType")
        private String dashboardType;

        @com.aliyun.core.annotation.NameInMap("Exporter")
        private String exporter;

        @com.aliyun.core.annotation.NameInMap("HttpUrl")
        private String httpUrl;

        @com.aliyun.core.annotation.NameInMap("HttpsUrl")
        private String httpsUrl;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IsArmsExporter")
        private Boolean isArmsExporter;

        @com.aliyun.core.annotation.NameInMap("Kind")
        private String kind;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NeedUpdate")
        private Boolean needUpdate;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < String > tags;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Uid")
        private String uid;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private I18nChild(Builder builder) {
            this.dashboardType = builder.dashboardType;
            this.exporter = builder.exporter;
            this.httpUrl = builder.httpUrl;
            this.httpsUrl = builder.httpsUrl;
            this.id = builder.id;
            this.isArmsExporter = builder.isArmsExporter;
            this.kind = builder.kind;
            this.language = builder.language;
            this.name = builder.name;
            this.needUpdate = builder.needUpdate;
            this.tags = builder.tags;
            this.time = builder.time;
            this.title = builder.title;
            this.type = builder.type;
            this.uid = builder.uid;
            this.url = builder.url;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static I18nChild create() {
            return builder().build();
        }

        /**
         * @return dashboardType
         */
        public String getDashboardType() {
            return this.dashboardType;
        }

        /**
         * @return exporter
         */
        public String getExporter() {
            return this.exporter;
        }

        /**
         * @return httpUrl
         */
        public String getHttpUrl() {
            return this.httpUrl;
        }

        /**
         * @return httpsUrl
         */
        public String getHttpsUrl() {
            return this.httpsUrl;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return isArmsExporter
         */
        public Boolean getIsArmsExporter() {
            return this.isArmsExporter;
        }

        /**
         * @return kind
         */
        public String getKind() {
            return this.kind;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return needUpdate
         */
        public Boolean getNeedUpdate() {
            return this.needUpdate;
        }

        /**
         * @return tags
         */
        public java.util.List < String > getTags() {
            return this.tags;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String dashboardType; 
            private String exporter; 
            private String httpUrl; 
            private String httpsUrl; 
            private String id; 
            private Boolean isArmsExporter; 
            private String kind; 
            private String language; 
            private String name; 
            private Boolean needUpdate; 
            private java.util.List < String > tags; 
            private String time; 
            private String title; 
            private String type; 
            private String uid; 
            private String url; 
            private String version; 

            /**
             * The type of the Grafana dashboard. This parameter has the same effect as the Exporter parameter whereas provides clearer implication.
             */
            public Builder dashboardType(String dashboardType) {
                this.dashboardType = dashboardType;
                return this;
            }

            /**
             * The type of the exporter access source. Valid values:
             * <p>
             * 
             * *   Prometheus
             * *   Node
             * *   GPU
             * *   Redis
             * *   MySQL
             * *   Kafka
             * *   NGINX V2
             * *   Nginx
             * *   ZooKeeper
             * *   MongoDB
             * *   RabbitMQ
             * *   PostgreSQL
             * *   Kubernetes
             * *   Client Library
             * *   Elasticsearch
             * *   RocketMQ
             */
            public Builder exporter(String exporter) {
                this.exporter = exporter;
                return this;
            }

            /**
             * The URL of the Grafana dashboard.
             */
            public Builder httpUrl(String httpUrl) {
                this.httpUrl = httpUrl;
                return this;
            }

            /**
             * The URL of the Grafana dashboard.
             */
            public Builder httpsUrl(String httpsUrl) {
                this.httpsUrl = httpsUrl;
                return this;
            }

            /**
             * The ID of the Grafana dashboard. The value is unique only when you install the Grafana dashboard.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Indicates whether the exporter was provided by ARMS. Valid values:
             * <p>
             * 
             * *   `true`: The exporter is provided by ARMS.
             * *   `false`: The exporter is not provided by ARMS.
             */
            public Builder isArmsExporter(Boolean isArmsExporter) {
                this.isArmsExporter = isArmsExporter;
                return this;
            }

            /**
             * The category of the Grafana dashboard. Valid values: BASIC, THIRD, LIMIT, and CUSTOM.
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * The language of the Grafana dashboard.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * The name of the Grafana dashboard. This parameter is different from the **Title** parameter as this parameter cannot be changed.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Indicates whether the Grafana dashboard has a new version that was available for upgrade.
             */
            public Builder needUpdate(Boolean needUpdate) {
                this.needUpdate = needUpdate;
                return this;
            }

            /**
             * The tags of the Grafana dashboard.
             */
            public Builder tags(java.util.List < String > tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The timestamp when the Grafana dashboard was created.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * The title of the Grafana dashboard.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * The type of the Grafana dashboard. Valid values:
             * <p>
             * 
             * *   `dash-db`: a dashboard
             * *   `dash-folder`: a folder that can include a dashboard
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The unique identifier of a dashboard when multiple Grafana dashboards were installed. It is a unique business ID displayed on the page.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * The complete URL of the Grafana dashboard.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * The version of the Grafana dashboard. The combination of version and name uniquely identifies a dashboard.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public I18nChild build() {
                return new I18nChild(this);
            } 

        } 

    }
    public static class DashboardVos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DashboardType")
        private String dashboardType;

        @com.aliyun.core.annotation.NameInMap("Exporter")
        private String exporter;

        @com.aliyun.core.annotation.NameInMap("HttpUrl")
        private String httpUrl;

        @com.aliyun.core.annotation.NameInMap("HttpsUrl")
        private String httpsUrl;

        @com.aliyun.core.annotation.NameInMap("I18nChild")
        private I18nChild i18nChild;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IsArmsExporter")
        private Boolean isArmsExporter;

        @com.aliyun.core.annotation.NameInMap("Kind")
        private String kind;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NeedUpdate")
        private Boolean needUpdate;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < String > tags;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Uid")
        private String uid;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private DashboardVos(Builder builder) {
            this.dashboardType = builder.dashboardType;
            this.exporter = builder.exporter;
            this.httpUrl = builder.httpUrl;
            this.httpsUrl = builder.httpsUrl;
            this.i18nChild = builder.i18nChild;
            this.id = builder.id;
            this.isArmsExporter = builder.isArmsExporter;
            this.kind = builder.kind;
            this.language = builder.language;
            this.name = builder.name;
            this.needUpdate = builder.needUpdate;
            this.tags = builder.tags;
            this.time = builder.time;
            this.title = builder.title;
            this.type = builder.type;
            this.uid = builder.uid;
            this.url = builder.url;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DashboardVos create() {
            return builder().build();
        }

        /**
         * @return dashboardType
         */
        public String getDashboardType() {
            return this.dashboardType;
        }

        /**
         * @return exporter
         */
        public String getExporter() {
            return this.exporter;
        }

        /**
         * @return httpUrl
         */
        public String getHttpUrl() {
            return this.httpUrl;
        }

        /**
         * @return httpsUrl
         */
        public String getHttpsUrl() {
            return this.httpsUrl;
        }

        /**
         * @return i18nChild
         */
        public I18nChild getI18nChild() {
            return this.i18nChild;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return isArmsExporter
         */
        public Boolean getIsArmsExporter() {
            return this.isArmsExporter;
        }

        /**
         * @return kind
         */
        public String getKind() {
            return this.kind;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return needUpdate
         */
        public Boolean getNeedUpdate() {
            return this.needUpdate;
        }

        /**
         * @return tags
         */
        public java.util.List < String > getTags() {
            return this.tags;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String dashboardType; 
            private String exporter; 
            private String httpUrl; 
            private String httpsUrl; 
            private I18nChild i18nChild; 
            private String id; 
            private Boolean isArmsExporter; 
            private String kind; 
            private String language; 
            private String name; 
            private Boolean needUpdate; 
            private java.util.List < String > tags; 
            private String time; 
            private String title; 
            private String type; 
            private String uid; 
            private String url; 
            private String version; 

            /**
             * The type of the Grafana dashboard. This parameter has the same effect as the Exporter parameter whereas provides clearer implication.
             */
            public Builder dashboardType(String dashboardType) {
                this.dashboardType = dashboardType;
                return this;
            }

            /**
             * The type of the exporter access source. Valid values:
             * <p>
             * 
             * *   Prometheus
             * *   Node
             * *   GPU
             * *   Redis
             * *   MySQL
             * *   Kafka
             * *   NGINX V2
             * *   Nginx
             * *   ZooKeeper
             * *   MongoDB
             * *   RabbitMQ
             * *   PostgreSQL
             * *   Kubernetes
             * *   Client Library
             * *   Elasticsearch
             * *   RocketMQ
             */
            public Builder exporter(String exporter) {
                this.exporter = exporter;
                return this;
            }

            /**
             * The URL of the Grafana dashboard.
             */
            public Builder httpUrl(String httpUrl) {
                this.httpUrl = httpUrl;
                return this;
            }

            /**
             * The URL of the Grafana dashboard.
             */
            public Builder httpsUrl(String httpsUrl) {
                this.httpsUrl = httpsUrl;
                return this;
            }

            /**
             * The information about the Grafana dashboards.
             */
            public Builder i18nChild(I18nChild i18nChild) {
                this.i18nChild = i18nChild;
                return this;
            }

            /**
             * The ID of the Grafana dashboard. The value is unique only when you install the Grafana dashboard.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Indicates whether the exporter was provided by ARMS. Valid values:
             * <p>
             * 
             * *   `true`: The exporter is provided by ARMS.
             * *   `false`: The exporter is not provided by ARMS.
             */
            public Builder isArmsExporter(Boolean isArmsExporter) {
                this.isArmsExporter = isArmsExporter;
                return this;
            }

            /**
             * The type of the dashboard. Valid values: BASIC, THIRD, LIMIT, and CUSTOM. BASIC indicates a basic dashboard. THIRD indicates a third-party dashboard. LIMIT indicates a time-limited free dashboard. CUSTOM indicates a custom dashboard.
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * The language of the Grafana dashboard.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * The name of the Grafana dashboard. This parameter is different from the **Title** parameter as this parameter cannot be changed.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Indicates whether the Grafana dashboard has a new version that was available for upgrade.
             */
            public Builder needUpdate(Boolean needUpdate) {
                this.needUpdate = needUpdate;
                return this;
            }

            /**
             * The tags of the Grafana dashboard.
             */
            public Builder tags(java.util.List < String > tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The timestamp generated when the Grafana dashboard was created. Unit: seconds
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * The title of the Grafana dashboard.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * The type of the Grafana dashboard. Valid values:
             * <p>
             * 
             * *   `dash-db`: a dashboard
             * *   `dash-folder`: a folder that can include a dashboard
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The unique identifier of a dashboard when multiple Grafana dashboards were installed. It is a unique business ID displayed on the page.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * The complete URL of the Grafana dashboard.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * The version of the Grafana dashboard. The combination of version and name uniquely identifies a dashboard.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public DashboardVos build() {
                return new DashboardVos(this);
            } 

        } 

    }
}
