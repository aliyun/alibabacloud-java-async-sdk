// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
    private java.util.List<ServiceInstancesLogs> serviceInstancesLogs;

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
    public java.util.List<ServiceInstancesLogs> getServiceInstancesLogs() {
        return this.serviceInstancesLogs;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<ServiceInstancesLogs> serviceInstancesLogs; 

        /**
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAfu+XtuBE55iRLHEYYuojI4=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>51945B04-6AA6-410D-93BA-236E0248B104</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The logs of the service instance.</p>
         */
        public Builder serviceInstancesLogs(java.util.List<ServiceInstancesLogs> serviceInstancesLogs) {
            this.serviceInstancesLogs = serviceInstancesLogs;
            return this;
        }

        public ListServiceInstanceLogsResponseBody build() {
            return new ListServiceInstanceLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListServiceInstanceLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceInstanceLogsResponseBody</p>
     */
    public static class ServiceInstancesLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompliancePackType")
        private String compliancePackType;

        @com.aliyun.core.annotation.NameInMap("ComplianceRuleName")
        private String complianceRuleName;

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
            this.compliancePackType = builder.compliancePackType;
            this.complianceRuleName = builder.complianceRuleName;
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
         * @return compliancePackType
         */
        public String getCompliancePackType() {
            return this.compliancePackType;
        }

        /**
         * @return complianceRuleName
         */
        public String getComplianceRuleName() {
            return this.complianceRuleName;
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
            private String compliancePackType; 
            private String complianceRuleName; 
            private String content; 
            private String logType; 
            private String resourceId; 
            private String resourceType; 
            private String source; 
            private String status; 
            private String timestamp; 

            /**
             * <p>Compliance package risk types. For example, data security checks within a VPC, such as VpcDataRisk</p>
             * 
             * <strong>example:</strong>
             * <p>VpcDataRisk</p>
             */
            public Builder compliancePackType(String compliancePackType) {
                this.compliancePackType = compliancePackType;
                return this;
            }

            /**
             * <p>Specific risk rule names for the compliance package. For example, ECS instance migration out of VPC - ecs-move-out-vpc.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs-move-out-vpc</p>
             */
            public Builder complianceRuleName(String complianceRuleName) {
                this.complianceRuleName = complianceRuleName;
                return this;
            }

            /**
             * <p>The log content.</p>
             * 
             * <strong>example:</strong>
             * <p>Start creating service instance</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The log type. Valid values:</p>
             * <ul>
             * <li>serviceInstance: log generated by the service instance.</li>
             * <li>resource: log generated by ROS resources.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>serviceInstance</p>
             */
            public Builder logType(String logType) {
                this.logType = logType;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>si-5c6525c0589545c3****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>ROS.Stack</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The source of the service instance log. Valid values:</p>
             * <p>computeNest: logs of the deployment and upgrade of the service instance.</p>
             * <p>application: logs generated by the application.</p>
             * <p>actionTrail: logs generated by ActionTrail.</p>
             * 
             * <strong>example:</strong>
             * <p>computeNest</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The state of the service instance. Valid values:</p>
             * <ul>
             * <li>Creating: The service instance is being created.</li>
             * <li>Created: The service instance is created.</li>
             * <li>Deploying: The service instance is being deployed.</li>
             * <li>Deployed: The service instance is deployed.</li>
             * <li>DeployedFailed: The service instance failed to be deployed.</li>
             * <li>Expired: The service instance expired.</li>
             * <li>ExtendSuccess: The service instance is renewed.</li>
             * <li>Upgrading: The service instance is being updated.</li>
             * <li>UpgradeSuccess: The service instance is updated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Creating</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The timestamp of the service instance log.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-21T00:00:00Z</p>
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
