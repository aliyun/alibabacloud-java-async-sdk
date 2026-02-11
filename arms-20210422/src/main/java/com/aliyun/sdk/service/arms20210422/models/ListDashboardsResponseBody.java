// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

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
 * {@link ListDashboardsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDashboardsResponseBody</p>
 */
public class ListDashboardsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DashboardVos")
    private java.util.List<DashboardVos> dashboardVos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dashboardVos
     */
    public java.util.List<DashboardVos> getDashboardVos() {
        return this.dashboardVos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DashboardVos> dashboardVos; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListDashboardsResponseBody model) {
            this.dashboardVos = model.dashboardVos;
            this.requestId = model.requestId;
        } 

        /**
         * DashboardVos.
         */
        public Builder dashboardVos(java.util.List<DashboardVos> dashboardVos) {
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

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IsArmsExporter")
        private Boolean isArmsExporter;

        @com.aliyun.core.annotation.NameInMap("Kind")
        private String kind;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NeedUpdate")
        private Boolean needUpdate;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<String> tags;

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
        public java.util.List<String> getTags() {
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
            private java.util.List<String> tags; 
            private String time; 
            private String title; 
            private String type; 
            private String uid; 
            private String url; 
            private String version; 

            private Builder() {
            } 

            private Builder(DashboardVos model) {
                this.dashboardType = model.dashboardType;
                this.exporter = model.exporter;
                this.id = model.id;
                this.isArmsExporter = model.isArmsExporter;
                this.kind = model.kind;
                this.name = model.name;
                this.needUpdate = model.needUpdate;
                this.tags = model.tags;
                this.time = model.time;
                this.title = model.title;
                this.type = model.type;
                this.uid = model.uid;
                this.url = model.url;
                this.version = model.version;
            } 

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
            public Builder tags(java.util.List<String> tags) {
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
