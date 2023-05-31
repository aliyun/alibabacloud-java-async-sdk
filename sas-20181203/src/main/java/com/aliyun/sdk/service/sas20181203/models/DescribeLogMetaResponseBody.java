// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogMetaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogMetaResponseBody</p>
 */
public class DescribeLogMetaResponseBody extends TeaModel {
    @NameInMap("LogMetaList")
    private java.util.List < LogMetaList> logMetaList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeLogMetaResponseBody(Builder builder) {
        this.logMetaList = builder.logMetaList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogMetaResponseBody create() {
        return builder().build();
    }

    /**
     * @return logMetaList
     */
    public java.util.List < LogMetaList> getLogMetaList() {
        return this.logMetaList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < LogMetaList> logMetaList; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * An array that consists of the configurations of the log analysis feature.
         */
        public Builder logMetaList(java.util.List < LogMetaList> logMetaList) {
            this.logMetaList = logMetaList;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeLogMetaResponseBody build() {
            return new DescribeLogMetaResponseBody(this);
        } 

    } 

    public static class LogMetaList extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("HotTtl")
        private Integer hotTtl;

        @NameInMap("LogDesc")
        private String logDesc;

        @NameInMap("LogStore")
        private String logStore;

        @NameInMap("Project")
        private String project;

        @NameInMap("Status")
        private String status;

        @NameInMap("Topic")
        private String topic;

        @NameInMap("Ttl")
        private Integer ttl;

        @NameInMap("UserLogStore")
        private String userLogStore;

        @NameInMap("UserProject")
        private String userProject;

        @NameInMap("UserRegion")
        private String userRegion;

        private LogMetaList(Builder builder) {
            this.category = builder.category;
            this.hotTtl = builder.hotTtl;
            this.logDesc = builder.logDesc;
            this.logStore = builder.logStore;
            this.project = builder.project;
            this.status = builder.status;
            this.topic = builder.topic;
            this.ttl = builder.ttl;
            this.userLogStore = builder.userLogStore;
            this.userProject = builder.userProject;
            this.userRegion = builder.userRegion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogMetaList create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return hotTtl
         */
        public Integer getHotTtl() {
            return this.hotTtl;
        }

        /**
         * @return logDesc
         */
        public String getLogDesc() {
            return this.logDesc;
        }

        /**
         * @return logStore
         */
        public String getLogStore() {
            return this.logStore;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        /**
         * @return ttl
         */
        public Integer getTtl() {
            return this.ttl;
        }

        /**
         * @return userLogStore
         */
        public String getUserLogStore() {
            return this.userLogStore;
        }

        /**
         * @return userProject
         */
        public String getUserProject() {
            return this.userProject;
        }

        /**
         * @return userRegion
         */
        public String getUserRegion() {
            return this.userRegion;
        }

        public static final class Builder {
            private String category; 
            private Integer hotTtl; 
            private String logDesc; 
            private String logStore; 
            private String project; 
            private String status; 
            private String topic; 
            private Integer ttl; 
            private String userLogStore; 
            private String userProject; 
            private String userRegion; 

            /**
             * The category of logs. Valid values:
             * <p>
             * 
             * *   **host**: host logs
             * *   **network**: network logs
             * *   **security**: security logs
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The time period after which logs in hot storage are moved to cold storage. Unit: days.
             * <p>
             * 
             * >  If the value is **-1**, logs that are stored in hot storage are not moved to cold storage.
             */
            public Builder hotTtl(Integer hotTtl) {
                this.hotTtl = hotTtl;
                return this;
            }

            /**
             * The name of the log type.
             */
            public Builder logDesc(String logDesc) {
                this.logDesc = logDesc;
                return this;
            }

            /**
             * The name of the dedicated Logstore in which logs are stored.
             */
            public Builder logStore(String logStore) {
                this.logStore = logStore;
                return this;
            }

            /**
             * The name of the project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * The status of the log analysis feature. Valid values:
             * <p>
             * 
             * *   **disabled**
             * *   **enabled**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The topic of logs that are delivered.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * The number of days during which logs can be retained.
             */
            public Builder ttl(Integer ttl) {
                this.ttl = ttl;
                return this;
            }

            /**
             * The name of the dedicated Logstore in which user logs are stored.
             */
            public Builder userLogStore(String userLogStore) {
                this.userLogStore = userLogStore;
                return this;
            }

            /**
             * The name of the dedicated project in which logs are stored.
             */
            public Builder userProject(String userProject) {
                this.userProject = userProject;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder userRegion(String userRegion) {
                this.userRegion = userRegion;
                return this;
            }

            public LogMetaList build() {
                return new LogMetaList(this);
            } 

        } 

    }
}
