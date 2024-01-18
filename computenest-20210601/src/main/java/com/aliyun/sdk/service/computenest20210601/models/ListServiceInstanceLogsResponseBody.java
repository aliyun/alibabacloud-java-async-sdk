// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceInstanceLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceInstanceLogsResponseBody</p>
 */
public class ListServiceInstanceLogsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceInstancesLogs")
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
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServiceInstancesLogs.
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
        @NameInMap("Content")
        private String content;

        @NameInMap("LogType")
        private String logType;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("Source")
        private String source;

        @NameInMap("Status")
        private String status;

        @NameInMap("Timestamp")
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
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * LogType.
             */
            public Builder logType(String logType) {
                this.logType = logType;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Timestamp.
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
