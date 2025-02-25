// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
         * <p>The HTTP status code. The status code 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The result of the operation.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>message</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>A5EC8221-08F2-4C95-9AF1-49FD998C647A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListEnvironmentDashboardsResponseBody build() {
            return new ListEnvironmentDashboardsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEnvironmentDashboardsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEnvironmentDashboardsResponseBody</p>
     */
    public static class Dashboards extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FolderUid")
        private String folderUid;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<String> tags;

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
        public java.util.List<String> getTags() {
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
            private java.util.List<String> tags; 
            private String title; 
            private String uid; 
            private String url; 

            /**
             * <p>The UID of the folder.</p>
             * 
             * <strong>example:</strong>
             * <p>1374923841627893</p>
             */
            public Builder folderUid(String folderUid) {
                this.folderUid = folderUid;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The keyword.</p>
             */
            public Builder tags(java.util.List<String> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The title of the Grafana dashboard.</p>
             * 
             * <strong>example:</strong>
             * <p>kafka-instance</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The unique identifier of the dashboard.</p>
             * 
             * <strong>example:</strong>
             * <p>1537863211936042</p>
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * <p>The complete URL of the dashboard.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxx">http://xxx</a></p>
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
    /**
     * 
     * {@link ListEnvironmentDashboardsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEnvironmentDashboardsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dashboards")
        private java.util.List<Dashboards> dashboards;

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
        public java.util.List<Dashboards> getDashboards() {
            return this.dashboards;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<Dashboards> dashboards; 
            private Long total; 

            /**
             * <p>The dashboards.</p>
             */
            public Builder dashboards(java.util.List<Dashboards> dashboards) {
                this.dashboards = dashboards;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
