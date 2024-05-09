// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEnvironmentDashboardsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEnvironmentDashboardsResponseBody</p>
 */
public class ListEnvironmentDashboardsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListEnvironmentDashboardsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnvironmentDashboardsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code. The status code 200 indicates that the request was successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The result of the operation.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListEnvironmentDashboardsResponseBody build() {
            return new ListEnvironmentDashboardsResponseBody(this);
        } 

    } 

    public static class Dashboards extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FolderUid")
        private String folderUid;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < String > tags;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Uid")
        private String uid;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Dashboards(Builder builder) {
            this.folderUid = builder.folderUid;
            this.region = builder.region;
            this.tags = builder.tags;
            this.title = builder.title;
            this.uid = builder.uid;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dashboards create() {
            return builder().build();
        }

        /**
         * @return folderUid
         */
        public String getFolderUid() {
            return this.folderUid;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return tags
         */
        public java.util.List < String > getTags() {
            return this.tags;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
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

        public static final class Builder {
            private String folderUid; 
            private String region; 
            private java.util.List < String > tags; 
            private String title; 
            private String uid; 
            private String url; 

            /**
             * The UID of the folder.
             */
            public Builder folderUid(String folderUid) {
                this.folderUid = folderUid;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The keyword.
             */
            public Builder tags(java.util.List < String > tags) {
                this.tags = tags;
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
             * The unique identifier of the dashboard.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * The complete URL of the dashboard.
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
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dashboards")
        private java.util.List < Dashboards> dashboards;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.dashboards = builder.dashboards;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dashboards
         */
        public java.util.List < Dashboards> getDashboards() {
            return this.dashboards;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < Dashboards> dashboards; 
            private Long total; 

            /**
             * The dashboards.
             */
            public Builder dashboards(java.util.List < Dashboards> dashboards) {
                this.dashboards = dashboards;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
