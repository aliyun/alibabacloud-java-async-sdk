// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceInstanceLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceInstanceLogsResponseBody</p>
 */
public class ListServiceInstanceLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceInstancesLogs")
    private java.util.List < ServiceInstancesLogs> serviceInstancesLogs;

    private ListServiceInstanceLogsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.serviceInstancesLogs = builder.serviceInstancesLogs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceInstanceLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceInstancesLogs
     */
    public java.util.List < ServiceInstancesLogs> getServiceInstancesLogs() {
        return this.serviceInstancesLogs;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < ServiceInstancesLogs> serviceInstancesLogs; 

        /**
         * The number of entries per page. Valid values: 1 to 100. Default value: 20.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The logs of the service instance.
         */
        public Builder serviceInstancesLogs(java.util.List < ServiceInstancesLogs> serviceInstancesLogs) {
            this.serviceInstancesLogs = serviceInstancesLogs;
            return this;
        }

        public ListServiceInstanceLogsResponseBody build() {
            return new ListServiceInstanceLogsResponseBody(this);
        } 

    } 

    public static class ServiceInstancesLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("LogType")
        private String logType;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        private ServiceInstancesLogs(Builder builder) {
            this.content = builder.content;
            this.logType = builder.logType;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.source = builder.source;
            this.status = builder.status;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceInstancesLogs create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return logType
         */
        public String getLogType() {
            return this.logType;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String content; 
            private String logType; 
            private String resourceId; 
            private String resourceType; 
            private String source; 
            private String status; 
            private String timestamp; 

            /**
             * The log content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The log type. Valid values:
             * <p>
             * 
             * *   serviceInstance: log generated by the service instance.
             * *   resource: log generated by ROS resources.
             */
            public Builder logType(String logType) {
                this.logType = logType;
                return this;
            }

            /**
             * The resource ID.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The resource type.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The source of the service instance log. Valid values:
             * <p>
             * 
             * *   ros: The log is generated by Resource Orchestration Service (ROS).
             * *   computeNest: The log is generated by Compute Nest.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * The state of the service instance. Valid values:
             * <p>
             * 
             * *   Creating: The service instance is being created.
             * *   Created: The service instance is created.
             * *   Deploying: The service instance is being deployed.
             * *   Deployed: The service instance is deployed.
             * *   DeployedFailed: The service instance failed to be deployed.
             * *   Expired: The service instance expired.
             * *   ExtendSuccess: The service instance is renewed.
             * *   Upgrading: The service instance is being updated.
             * *   UpgradeSuccess: The service instance is updated.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The timestamp of the service instance log.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public ServiceInstancesLogs build() {
                return new ServiceInstancesLogs(this);
            } 

        } 

    }
}
