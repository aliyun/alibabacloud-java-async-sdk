// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTraceAppResponseBody} extends {@link TeaModel}
 *
 * <p>GetTraceAppResponseBody</p>
 */
public class GetTraceAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TraceApp")
    private TraceApp traceApp;

    private GetTraceAppResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.traceApp = builder.traceApp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTraceAppResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return traceApp
     */
    public TraceApp getTraceApp() {
        return this.traceApp;
    }

    public static final class Builder {
        private String requestId; 
        private TraceApp traceApp; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the array object.
         */
        public Builder traceApp(TraceApp traceApp) {
            this.traceApp = traceApp;
            return this;
        }

        public GetTraceAppResponseBody build() {
            return new GetTraceAppResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class TraceApp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private Long appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List < String > labels;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("Pid")
        private String pid;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Show")
        private Boolean show;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private TraceApp(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.clusterId = builder.clusterId;
            this.createTime = builder.createTime;
            this.labels = builder.labels;
            this.language = builder.language;
            this.pid = builder.pid;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.show = builder.show;
            this.source = builder.source;
            this.tags = builder.tags;
            this.type = builder.type;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TraceApp create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public Long getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return labels
         */
        public java.util.List < String > getLabels() {
            return this.labels;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return pid
         */
        public String getPid() {
            return this.pid;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return show
         */
        public Boolean getShow() {
            return this.show;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long appId; 
            private String appName; 
            private String clusterId; 
            private Long createTime; 
            private java.util.List < String > labels; 
            private String language; 
            private String pid; 
            private String regionId; 
            private String resourceGroupId; 
            private Boolean show; 
            private String source; 
            private java.util.List < Tags> tags; 
            private String type; 
            private Long updateTime; 
            private String userId; 

            /**
             * The application ID.
             */
            public Builder appId(Long appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The name of the application.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * Cluster ID, used only in K8s scenarios.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The timestamp generated when the task was created.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The aliases of the application.
             */
            public Builder labels(java.util.List < String > labels) {
                this.labels = labels;
                return this;
            }

            /**
             * Coding Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * The process identifier (PID) of the application.
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Indicates whether the application is displayed in the Application Real-Time Monitoring Service (ARMS) console. Valid values:
             * <p>
             * 
             * *   `true`: yes
             * *   `false`: no
             */
            public Builder show(Boolean show) {
                this.show = show;
                return this;
            }

            /**
             * The source of the application.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * A list of key-value pairs.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The type of the monitoring task. Valid values:
             * <p>
             * 
             * *   `TRACE`: Application Monitoring
             * *   `RETCODE`: Browser Monitoring
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The timestamp generated when the task information was updated.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The user ID.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public TraceApp build() {
                return new TraceApp(this);
            } 

        } 

    }
}
