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
 * {@link ListTraceAppsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTraceAppsResponseBody</p>
 */
public class ListTraceAppsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TraceApps")
    private java.util.List<TraceApps> traceApps;

    private ListTraceAppsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceApps = builder.traceApps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTraceAppsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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

    /**
     * @return traceApps
     */
    public java.util.List<TraceApps> getTraceApps() {
        return this.traceApps;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private java.util.List<TraceApps> traceApps; 

        /**
         * <p>The HTTP status code returned for the request. Valid values:</p>
         * <ul>
         * <li><code>2XX</code>: The request is successful.</li>
         * <li><code>3XX</code>: A redirection message is returned.</li>
         * <li><code>4XX</code>: The request is invalid.</li>
         * <li><code>5XX</code>: A server error occurs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message returned if the request parameters are invalid.</p>
         * 
         * <strong>example:</strong>
         * <p>Internal error. Please try again. Contact the DingTalk service account if the issue persists after multiple retries.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40B10E04-81E8-4643-970D-F1B38F2E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The call was successful.</li>
         * <li><code>false</code>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The list of Application Monitoring tasks.</p>
         */
        public Builder traceApps(java.util.List<TraceApps> traceApps) {
            this.traceApps = traceApps;
            return this;
        }

        public ListTraceAppsResponseBody build() {
            return new ListTraceAppsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTraceAppsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTraceAppsResponseBody</p>
     */
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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
    /**
     * 
     * {@link ListTraceAppsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTraceAppsResponseBody</p>
     */
    public static class TraceApps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private Long appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List<String> labels;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

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
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("WorkloadKind")
        private String workloadKind;

        @com.aliyun.core.annotation.NameInMap("WorkloadName")
        private String workloadName;

        private TraceApps(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.clusterId = builder.clusterId;
            this.createTime = builder.createTime;
            this.labels = builder.labels;
            this.language = builder.language;
            this.namespace = builder.namespace;
            this.pid = builder.pid;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.show = builder.show;
            this.source = builder.source;
            this.tags = builder.tags;
            this.type = builder.type;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
            this.workloadKind = builder.workloadKind;
            this.workloadName = builder.workloadName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TraceApps create() {
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
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
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
        public java.util.List<Tags> getTags() {
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

        /**
         * @return workloadKind
         */
        public String getWorkloadKind() {
            return this.workloadKind;
        }

        /**
         * @return workloadName
         */
        public String getWorkloadName() {
            return this.workloadName;
        }

        public static final class Builder {
            private Long appId; 
            private String appName; 
            private String clusterId; 
            private Long createTime; 
            private java.util.List<String> labels; 
            private String language; 
            private String namespace; 
            private String pid; 
            private String regionId; 
            private String resourceGroupId; 
            private Boolean show; 
            private String source; 
            private java.util.List<Tags> tags; 
            private String type; 
            private Long updateTime; 
            private String userId; 
            private String workloadKind; 
            private String workloadName; 

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder appId(Long appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>test-app</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cc7a37ee31aea4ed1a059eff8034b****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The time when the monitoring task was created. The value is a timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1529667762000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The labels of the application.</p>
             */
            public Builder labels(java.util.List<String> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The language.</p>
             * 
             * <strong>example:</strong>
             * <p>PHP</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The process identifier (PID) of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>a5f9bdeb-2627-4dbe-9247-****</p>
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>Resource group</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>Indicates whether the application is displayed in the Application Real-Time Monitoring Service (ARMS) console. Valid values:</p>
             * <ul>
             * <li><code>true</code>: yes</li>
             * <li><code>false</code>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder show(Boolean show) {
                this.show = show;
                return this;
            }

            /**
             * <p>The application source.</p>
             * 
             * <strong>example:</strong>
             * <p>ACK</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The type of the monitoring task. Valid values:</p>
             * <ul>
             * <li><code>TRACE</code>: Application Monitoring</li>
             * <li><code>RETCODE</code>: Browser Monitoring</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TRACE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The time when the monitoring task was updated. The value is a timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1529667762000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>113197164949****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The type of the workload.</p>
             * 
             * <strong>example:</strong>
             * <p>Deployment</p>
             */
            public Builder workloadKind(String workloadKind) {
                this.workloadKind = workloadKind;
                return this;
            }

            /**
             * <p>The name of the workload.</p>
             * 
             * <strong>example:</strong>
             * <p>nginx-deployment</p>
             */
            public Builder workloadName(String workloadName) {
                this.workloadName = workloadName;
                return this;
            }

            public TraceApps build() {
                return new TraceApps(this);
            } 

        } 

    }
}
