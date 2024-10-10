// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeLogMetaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogMetaResponseBody</p>
 */
public class DescribeLogMetaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LogMetaList")
    private java.util.List < LogMetaList> logMetaList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>An array that consists of the configurations of the log analysis feature.</p>
         */
        public Builder logMetaList(java.util.List < LogMetaList> logMetaList) {
            this.logMetaList = logMetaList;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>D0D6E6E4-CB8C-4897-B852-46AEFDA04B21</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeLogMetaResponseBody build() {
            return new DescribeLogMetaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLogMetaResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLogMetaResponseBody</p>
     */
    public static class LogMetaList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("HotTtl")
        private Integer hotTtl;

        @com.aliyun.core.annotation.NameInMap("LogDesc")
        private String logDesc;

        @com.aliyun.core.annotation.NameInMap("LogStore")
        private String logStore;

        @com.aliyun.core.annotation.NameInMap("Project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        @com.aliyun.core.annotation.NameInMap("Ttl")
        private Integer ttl;

        @com.aliyun.core.annotation.NameInMap("UserLogStore")
        private String userLogStore;

        @com.aliyun.core.annotation.NameInMap("UserProject")
        private String userProject;

        @com.aliyun.core.annotation.NameInMap("UserRegion")
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
             * <p>The category of logs. Valid values:</p>
             * <ul>
             * <li><strong>host</strong></li>
             * <li><strong>network</strong></li>
             * <li><strong>security</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>host</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The time period after which logs in hot storage are moved to cold storage. Unit: days.</p>
             * <blockquote>
             * <p> If the value is -1, logs that are stored in hot storage are not moved to cold storage.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder hotTtl(Integer hotTtl) {
                this.hotTtl = hotTtl;
                return this;
            }

            /**
             * <p>The name of the log type.</p>
             * 
             * <strong>example:</strong>
             * <p>Login</p>
             */
            public Builder logDesc(String logDesc) {
                this.logDesc = logDesc;
                return this;
            }

            /**
             * <p>The name of the dedicated Logstore in which logs are stored.</p>
             * 
             * <strong>example:</strong>
             * <p>aegis-log-login</p>
             */
            public Builder logStore(String logStore) {
                this.logStore = logStore;
                return this;
            }

            /**
             * <p>The name of the project.</p>
             * 
             * <strong>example:</strong>
             * <p>aegis-log</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * <p>The status of the log analysis feature. Valid values:</p>
             * <ul>
             * <li><strong>disabled</strong></li>
             * <li><strong>enabled</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The topic of logs that are delivered.</p>
             * 
             * <strong>example:</strong>
             * <p>aegis-log-login</p>
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * <p>The number of days during which logs can be retained.</p>
             * 
             * <strong>example:</strong>
             * <p>180</p>
             */
            public Builder ttl(Integer ttl) {
                this.ttl = ttl;
                return this;
            }

            /**
             * <p>The name of the dedicated Logstore in which user logs are stored.</p>
             * 
             * <strong>example:</strong>
             * <p>aegis-log-network</p>
             */
            public Builder userLogStore(String userLogStore) {
                this.userLogStore = userLogStore;
                return this;
            }

            /**
             * <p>The name of the dedicated project in which logs are stored.</p>
             * 
             * <strong>example:</strong>
             * <p>sasnew-log-XXXX-cn-hangzhou</p>
             */
            public Builder userProject(String userProject) {
                this.userProject = userProject;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
