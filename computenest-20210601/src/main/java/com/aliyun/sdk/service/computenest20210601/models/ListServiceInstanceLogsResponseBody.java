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
    private String maxResults;

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
    public String getMaxResults() {
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
        private String maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < ServiceInstancesLogs> serviceInstancesLogs; 

        /**
         * MaxResults.
         */
        public Builder maxResults(String maxResults) {
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

        @NameInMap("ServiceInstanceId")
        private String serviceInstanceId;

        @NameInMap("Source")
        private String source;

        @NameInMap("Timestamp")
        private String timestamp;

        private ServiceInstancesLogs(Builder builder) {
            this.content = builder.content;
            this.serviceInstanceId = builder.serviceInstanceId;
            this.source = builder.source;
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
         * @return serviceInstanceId
         */
        public String getServiceInstanceId() {
            return this.serviceInstanceId;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String content; 
            private String serviceInstanceId; 
            private String source; 
            private String timestamp; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * ServiceInstanceId.
             */
            public Builder serviceInstanceId(String serviceInstanceId) {
                this.serviceInstanceId = serviceInstanceId;
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
