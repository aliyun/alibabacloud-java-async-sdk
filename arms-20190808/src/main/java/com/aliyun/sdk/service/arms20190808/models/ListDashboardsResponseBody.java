// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The information about the Grafana dashboard.</p>
         */
        public Builder dashboardVos(java.util.List < DashboardVos> dashboardVos) {
            this.dashboardVos = dashboardVos;
            return this;
        }

        /**
         * <p>The ID of the environment instance.</p>
         * 
         * <strong>example:</strong>
         * <p>env-ebd54733482581fc8c4237******</p>
         */
        public Builder environmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        /**
         * <p>Indicates whether Managed Service for Grafana is activated.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder grafanaServiceOpened(String grafanaServiceOpened) {
            this.grafanaServiceOpened = grafanaServiceOpened;
            return this;
        }

        /**
         * <p>Whether or not to turn on Prometheus service.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder prometheusServiceOpened(String prometheusServiceOpened) {
            this.prometheusServiceOpened = prometheusServiceOpened;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2A0CEDF1-06FE-44AC-8E21-21A5BE65****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDashboardsResponseBody build() {
            return new ListDashboardsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDashboardsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDashboardsResponseBody</p>
     */
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
             * <p>The type of the Grafana dashboard. This parameter has the same effect as the Exporter parameter whereas provides clearer implication.</p>
             * 
             * <strong>example:</strong>
             * <p>Node</p>
             */
            public Builder dashboardType(String dashboardType) {
                this.dashboardType = dashboardType;
                return this;
            }

            /**
             * <p>The type of the exporter access source. Valid values:</p>
             * <ul>
             * <li>Prometheus</li>
             * <li>Node</li>
             * <li>GPU</li>
             * <li>Redis</li>
             * <li>MySQL</li>
             * <li>Kafka</li>
             * <li>NGINX V2</li>
             * <li>Nginx</li>
             * <li>ZooKeeper</li>
             * <li>MongoDB</li>
             * <li>RabbitMQ</li>
             * <li>PostgreSQL</li>
             * <li>Kubernetes</li>
             * <li>Client Library</li>
             * <li>Elasticsearch</li>
             * <li>RocketMQ</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Nginx</p>
             */
            public Builder exporter(String exporter) {
                this.exporter = exporter;
                return this;
            }

            /**
             * <p>The URL of the Grafana dashboard.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://g.console.aliyun.com/d/1131971649496228-*****-59/ApiServer?orgId=3**&refresh=60s">http://g.console.aliyun.com/d/1131971649496228-*****-59/ApiServer?orgId=3**&amp;refresh=60s</a></p>
             */
            public Builder httpUrl(String httpUrl) {
                this.httpUrl = httpUrl;
                return this;
            }

            /**
             * <p>The URL of the Grafana dashboard.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://g.console.aliyun.com/d/1131971649496228-*****-59/ApiServer?orgId=3**&refresh=60s">http://g.console.aliyun.com/d/1131971649496228-*****-59/ApiServer?orgId=3**&amp;refresh=60s</a></p>
             */
            public Builder httpsUrl(String httpsUrl) {
                this.httpsUrl = httpsUrl;
                return this;
            }

            /**
             * <p>The ID of the Grafana dashboard. The value is unique only when you install the Grafana dashboard.</p>
             * 
             * <strong>example:</strong>
             * <p>1100**</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether the exporter is provided by ARMS.</p>
             * <ul>
             * <li><code>true:</code> The exporter is provided by ARMS.</li>
             * <li><code>false:</code>: The exporter is not provided by ARMS.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isArmsExporter(Boolean isArmsExporter) {
                this.isArmsExporter = isArmsExporter;
                return this;
            }

            /**
             * <p>The category of the Grafana dashboard. Valid values: BASIC, THIRD, LIMIT, and CUSTOM.</p>
             * 
             * <strong>example:</strong>
             * <p>BASIC</p>
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * <p>The language of the Grafana dashboard.</p>
             * 
             * <strong>example:</strong>
             * <p>zh</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The name of the Grafana dashboard. This parameter is different from the <strong>Title</strong> parameter as this parameter cannot be changed.</p>
             * 
             * <strong>example:</strong>
             * <p>k8s-node-overview</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Indicates whether the Grafana dashboard has a new version that is available for upgrade.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder needUpdate(Boolean needUpdate) {
                this.needUpdate = needUpdate;
                return this;
            }

            /**
             * <p>The tags of the Grafana dashboard.</p>
             */
            public Builder tags(java.util.List < String > tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The time when the Grafana dashboard was created. The value is a timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1590136924</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The title of the Grafana dashboard.</p>
             * 
             * <strong>example:</strong>
             * <p>ApiServer</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The type of the Grafana dashboard. Valid values:</p>
             * <ul>
             * <li><code>dash-db</code>: a dashboard</li>
             * <li><code>dash-folder</code>: a folder that can include a dashboard</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>dash-db</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The unique identifier of the Grafana dashboard.</p>
             * 
             * <strong>example:</strong>
             * <p>1131971649496228-*****-59</p>
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * <p>The complete URL of the Grafana dashboard.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://g.console.aliyun.com/d/1131971649496228-*****-59/ApiServer?orgId=3**&refresh=60s">http://g.console.aliyun.com/d/1131971649496228-*****-59/ApiServer?orgId=3**&amp;refresh=60s</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * <p>The version of the Grafana dashboard. The combination of version and name uniquely identifies a dashboard.</p>
             * 
             * <strong>example:</strong>
             * <p>v2</p>
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
    /**
     * 
     * {@link ListDashboardsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDashboardsResponseBody</p>
     */
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
             * <p>The type of the Grafana dashboard. This parameter has the same effect as the Exporter parameter whereas provides clearer implication.</p>
             * 
             * <strong>example:</strong>
             * <p>Node</p>
             */
            public Builder dashboardType(String dashboardType) {
                this.dashboardType = dashboardType;
                return this;
            }

            /**
             * <p>The type of the exporter access source. Valid values:</p>
             * <ul>
             * <li>Prometheus</li>
             * <li>Node</li>
             * <li>GPU</li>
             * <li>Redis</li>
             * <li>MySQL</li>
             * <li>Kafka</li>
             * <li>NGINX V2</li>
             * <li>Nginx</li>
             * <li>ZooKeeper</li>
             * <li>MongoDB</li>
             * <li>RabbitMQ</li>
             * <li>PostgreSQL</li>
             * <li>Kubernetes</li>
             * <li>Client Library</li>
             * <li>Elasticsearch</li>
             * <li>RocketMQ</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Nginx</p>
             */
            public Builder exporter(String exporter) {
                this.exporter = exporter;
                return this;
            }

            /**
             * <p>The URL of the Grafana dashboard.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://g.console.aliyun.com/d/1131971649496228-*****-59/ApiServer?orgId=3**&refresh=60s">http://g.console.aliyun.com/d/1131971649496228-*****-59/ApiServer?orgId=3**&amp;refresh=60s</a></p>
             */
            public Builder httpUrl(String httpUrl) {
                this.httpUrl = httpUrl;
                return this;
            }

            /**
             * <p>The URL of the Grafana dashboard.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://g.console.aliyun.com/d/1131971649496228-*****-59/ApiServer?orgId=3**&refresh=60s">http://g.console.aliyun.com/d/1131971649496228-*****-59/ApiServer?orgId=3**&amp;refresh=60s</a></p>
             */
            public Builder httpsUrl(String httpsUrl) {
                this.httpsUrl = httpsUrl;
                return this;
            }

            /**
             * <p>The information about the Grafana dashboard.</p>
             */
            public Builder i18nChild(I18nChild i18nChild) {
                this.i18nChild = i18nChild;
                return this;
            }

            /**
             * <p>The ID of the Grafana dashboard. The value is unique only when you install the Grafana dashboard.</p>
             * 
             * <strong>example:</strong>
             * <p>1100**</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether the exporter is provided by Application Real-Time Monitoring Service (ARMS).</p>
             * <ul>
             * <li><code>true:</code> The exporter is provided by ARMS.</li>
             * <li><code>false:</code>: The exporter is not provided by ARMS.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isArmsExporter(Boolean isArmsExporter) {
                this.isArmsExporter = isArmsExporter;
                return this;
            }

            /**
             * <p>The category of the Grafana dashboard. Valid values: BASIC, THIRD, LIMIT, and CUSTOM.</p>
             * 
             * <strong>example:</strong>
             * <p>BASIC</p>
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * <p>The language of the Grafana dashboard.</p>
             * 
             * <strong>example:</strong>
             * <p>en</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The name of the Grafana dashboard. This parameter is different from the <strong>Title</strong> parameter as this parameter cannot be changed.</p>
             * 
             * <strong>example:</strong>
             * <p>k8s-node-overview</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Indicates whether the Grafana dashboard has a new version that is available for upgrade.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder needUpdate(Boolean needUpdate) {
                this.needUpdate = needUpdate;
                return this;
            }

            /**
             * <p>The tags of the Grafana dashboard.</p>
             */
            public Builder tags(java.util.List < String > tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The time when the Grafana dashboard was created. The value is a timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1590136924</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The title of the Grafana dashboard.</p>
             * 
             * <strong>example:</strong>
             * <p>ApiServer</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The type of the Grafana dashboard. Valid values:</p>
             * <ul>
             * <li><code>dash-db</code>: a dashboard</li>
             * <li><code>dash-folder</code>: a folder that can include a dashboard</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>dash-db</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The unique identifier of the Grafana dashboard.</p>
             * 
             * <strong>example:</strong>
             * <p>1131971649496228-*****-59</p>
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * <p>The complete URL of the Grafana dashboard.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://g.console.aliyun.com/d/1131971649496228-*****-59/ApiServer?orgId=3**&refresh=60s">http://g.console.aliyun.com/d/1131971649496228-*****-59/ApiServer?orgId=3**&amp;refresh=60s</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * <p>The version of the Grafana dashboard. The combination of version and name uniquely identifies a dashboard.</p>
             * 
             * <strong>example:</strong>
             * <p>v2</p>
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
