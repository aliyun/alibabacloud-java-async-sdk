// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDashboardsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDashboardsResponseBody</p>
 */
public class ListDashboardsResponseBody extends TeaModel {
    @NameInMap("DashboardVos")
    private java.util.List < DashboardVos> dashboardVos;

    @NameInMap("RequestId")
    private String requestId;

    private ListDashboardsResponseBody(Builder builder) {
        this.dashboardVos = builder.dashboardVos;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DashboardVos> dashboardVos; 
        private String requestId; 

        /**
         * DashboardVos.
         */
        public Builder dashboardVos(java.util.List < DashboardVos> dashboardVos) {
            this.dashboardVos = dashboardVos;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDashboardsResponseBody build() {
            return new ListDashboardsResponseBody(this);
        } 

    } 

    public static class DashboardVos extends TeaModel {
        @NameInMap("DashboardType")
        private String dashboardType;

        @NameInMap("Exporter")
        private String exporter;

        @NameInMap("Id")
        private String id;

        @NameInMap("IsArmsExporter")
        private Boolean isArmsExporter;

        @NameInMap("Kind")
        private String kind;

        @NameInMap("Name")
        private String name;

        @NameInMap("NeedUpdate")
        private Boolean needUpdate;

        @NameInMap("Tags")
        private java.util.List < String > tags;

        @NameInMap("Time")
        private String time;

        @NameInMap("Title")
        private String title;

        @NameInMap("Type")
        private String type;

        @NameInMap("Uid")
        private String uid;

        @NameInMap("Url")
        private String url;

        @NameInMap("Version")
        private String version;

        private DashboardVos(Builder builder) {
            this.dashboardType = builder.dashboardType;
            this.exporter = builder.exporter;
            this.id = builder.id;
            this.isArmsExporter = builder.isArmsExporter;
            this.kind = builder.kind;
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
            private String id; 
            private Boolean isArmsExporter; 
            private String kind; 
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
             * DashboardType.
             */
            public Builder dashboardType(String dashboardType) {
                this.dashboardType = dashboardType;
                return this;
            }

            /**
             * Exporter.
             */
            public Builder exporter(String exporter) {
                this.exporter = exporter;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * IsArmsExporter.
             */
            public Builder isArmsExporter(Boolean isArmsExporter) {
                this.isArmsExporter = isArmsExporter;
                return this;
            }

            /**
             * Kind.
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NeedUpdate.
             */
            public Builder needUpdate(Boolean needUpdate) {
                this.needUpdate = needUpdate;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < String > tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * Version.
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
