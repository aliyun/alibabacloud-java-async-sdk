// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListServicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListServicesResponseBody</p>
 */
public class ListServicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("services")
    private java.util.List<Services> services;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListServicesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.services = builder.services;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServicesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return services
     */
    public java.util.List<Services> getServices() {
        return this.services;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<Services> services; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListServicesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.services = model.services;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Maximum number of results to return, with a maximum value of 200</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Pagination token</p>
         * 
         * <strong>example:</strong>
         * <p>2-ba4d-4b9f-aa24-dcb067a30f1c</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>0CEC5375-C554-562B-A65F-9A629907C1F0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>List of service information.</p>
         */
        public Builder services(java.util.List<Services> services) {
            this.services = services;
            return this;
        }

        /**
         * <p>Total count</p>
         * 
         * <strong>example:</strong>
         * <p>66</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListServicesResponseBody build() {
            return new ListServicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListServicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListServicesResponseBody</p>
     */
    public static class Services extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("attributes")
        private String attributes;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("pid")
        private String pid;

        @com.aliyun.core.annotation.NameInMap("resourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("serviceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("serviceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("serviceStatus")
        private String serviceStatus;

        @com.aliyun.core.annotation.NameInMap("serviceType")
        private String serviceType;

        @com.aliyun.core.annotation.NameInMap("workspace")
        private String workspace;

        private Services(Builder builder) {
            this.attributes = builder.attributes;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.pid = builder.pid;
            this.resourceGroupId = builder.resourceGroupId;
            this.serviceId = builder.serviceId;
            this.serviceName = builder.serviceName;
            this.serviceStatus = builder.serviceStatus;
            this.serviceType = builder.serviceType;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Services create() {
            return builder().build();
        }

        /**
         * @return attributes
         */
        public String getAttributes() {
            return this.attributes;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return pid
         */
        public String getPid() {
            return this.pid;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return serviceStatus
         */
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        /**
         * @return serviceType
         */
        public String getServiceType() {
            return this.serviceType;
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private String attributes; 
            private String createTime; 
            private String description; 
            private String displayName; 
            private String pid; 
            private String resourceGroupId; 
            private String serviceId; 
            private String serviceName; 
            private String serviceStatus; 
            private String serviceType; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(Services model) {
                this.attributes = model.attributes;
                this.createTime = model.createTime;
                this.description = model.description;
                this.displayName = model.displayName;
                this.pid = model.pid;
                this.resourceGroupId = model.resourceGroupId;
                this.serviceId = model.serviceId;
                this.serviceName = model.serviceName;
                this.serviceStatus = model.serviceStatus;
                this.serviceType = model.serviceType;
                this.workspace = model.workspace;
            } 

            /**
             * <p>Extended information.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;language&quot;:&quot;java&quot;}</p>
             */
            public Builder attributes(String attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * <p>Creation time</p>
             * 
             * <strong>example:</strong>
             * <p>2025-07-01T02:23:59Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Service description, valid only when serviceType=RUM.</p>
             * 
             * <strong>example:</strong>
             * <p>workspace api monitor test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Display name, valid only when serviceType=RUM.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>Historical compatible ARMS application ID</p>
             * 
             * <strong>example:</strong>
             * <p>kgcsf@192197e828d51aa</p>
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * resourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>Service ID</p>
             * 
             * <strong>example:</strong>
             * <p>jm2pl0yoqf@d4905cb11a4f218dfb0a8</p>
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>Service name</p>
             * 
             * <strong>example:</strong>
             * <p>demo-app</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>Service status, valid only when serviceType=RUM.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder serviceStatus(String serviceStatus) {
                this.serviceStatus = serviceStatus;
                return this;
            }

            /**
             * <p>Service type</p>
             * 
             * <strong>example:</strong>
             * <p>TRACE</p>
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * <p>Workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>default-cms-1192928460540589-cn-hangzhou</p>
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public Services build() {
                return new Services(this);
            } 

        } 

    }
}
