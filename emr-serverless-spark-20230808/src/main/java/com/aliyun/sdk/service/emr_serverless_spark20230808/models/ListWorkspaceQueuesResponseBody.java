// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkspaceQueuesResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkspaceQueuesResponseBody</p>
 */
public class ListWorkspaceQueuesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("queues")
    private java.util.List < Queues> queues;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListWorkspaceQueuesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.queues = builder.queues;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkspaceQueuesResponseBody create() {
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
     * @return queues
     */
    public java.util.List < Queues> getQueues() {
        return this.queues;
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
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List < Queues> queues; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The maximum number of entries returned.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The list of queues.
         */
        public Builder queues(java.util.List < Queues> queues) {
            this.queues = queues;
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
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListWorkspaceQueuesResponseBody build() {
            return new ListWorkspaceQueuesResponseBody(this);
        } 

    } 

    public static class AllowActions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actionArn")
        private String actionArn;

        @com.aliyun.core.annotation.NameInMap("actionName")
        private String actionName;

        @com.aliyun.core.annotation.NameInMap("dependencies")
        private java.util.List < String > dependencies;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        private AllowActions(Builder builder) {
            this.actionArn = builder.actionArn;
            this.actionName = builder.actionName;
            this.dependencies = builder.dependencies;
            this.description = builder.description;
            this.displayName = builder.displayName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AllowActions create() {
            return builder().build();
        }

        /**
         * @return actionArn
         */
        public String getActionArn() {
            return this.actionArn;
        }

        /**
         * @return actionName
         */
        public String getActionName() {
            return this.actionName;
        }

        /**
         * @return dependencies
         */
        public java.util.List < String > getDependencies() {
            return this.dependencies;
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

        public static final class Builder {
            private String actionArn; 
            private String actionName; 
            private java.util.List < String > dependencies; 
            private String description; 
            private String displayName; 

            /**
             * The Alibaba Cloud Resource Name (ARN) of a behavior.
             */
            public Builder actionArn(String actionArn) {
                this.actionArn = actionArn;
                return this;
            }

            /**
             * The name of the permission.
             */
            public Builder actionName(String actionName) {
                this.actionName = actionName;
                return this;
            }

            /**
             * The dependencies of the operation.
             */
            public Builder dependencies(java.util.List < String > dependencies) {
                this.dependencies = dependencies;
                return this;
            }

            /**
             * The description of the operation.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The display name of the permission.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            public AllowActions build() {
                return new AllowActions(this);
            } 

        } 

    }
    public static class Queues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("allowActions")
        private java.util.List < AllowActions> allowActions;

        @com.aliyun.core.annotation.NameInMap("creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("environments")
        private java.util.List < String > environments;

        @com.aliyun.core.annotation.NameInMap("maxResource")
        private String maxResource;

        @com.aliyun.core.annotation.NameInMap("minResource")
        private String minResource;

        @com.aliyun.core.annotation.NameInMap("properties")
        private String properties;

        @com.aliyun.core.annotation.NameInMap("queueName")
        private String queueName;

        @com.aliyun.core.annotation.NameInMap("queueScope")
        private String queueScope;

        @com.aliyun.core.annotation.NameInMap("queueStatus")
        private String queueStatus;

        @com.aliyun.core.annotation.NameInMap("queueType")
        private String queueType;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("usedResource")
        private String usedResource;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Queues(Builder builder) {
            this.allowActions = builder.allowActions;
            this.creator = builder.creator;
            this.environments = builder.environments;
            this.maxResource = builder.maxResource;
            this.minResource = builder.minResource;
            this.properties = builder.properties;
            this.queueName = builder.queueName;
            this.queueScope = builder.queueScope;
            this.queueStatus = builder.queueStatus;
            this.queueType = builder.queueType;
            this.regionId = builder.regionId;
            this.usedResource = builder.usedResource;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Queues create() {
            return builder().build();
        }

        /**
         * @return allowActions
         */
        public java.util.List < AllowActions> getAllowActions() {
            return this.allowActions;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return environments
         */
        public java.util.List < String > getEnvironments() {
            return this.environments;
        }

        /**
         * @return maxResource
         */
        public String getMaxResource() {
            return this.maxResource;
        }

        /**
         * @return minResource
         */
        public String getMinResource() {
            return this.minResource;
        }

        /**
         * @return properties
         */
        public String getProperties() {
            return this.properties;
        }

        /**
         * @return queueName
         */
        public String getQueueName() {
            return this.queueName;
        }

        /**
         * @return queueScope
         */
        public String getQueueScope() {
            return this.queueScope;
        }

        /**
         * @return queueStatus
         */
        public String getQueueStatus() {
            return this.queueStatus;
        }

        /**
         * @return queueType
         */
        public String getQueueType() {
            return this.queueType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return usedResource
         */
        public String getUsedResource() {
            return this.usedResource;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private java.util.List < AllowActions> allowActions; 
            private String creator; 
            private java.util.List < String > environments; 
            private String maxResource; 
            private String minResource; 
            private String properties; 
            private String queueName; 
            private String queueScope; 
            private String queueStatus; 
            private String queueType; 
            private String regionId; 
            private String usedResource; 
            private String workspaceId; 

            /**
             * The operations allowed for the queue.
             */
            public Builder allowActions(java.util.List < AllowActions> allowActions) {
                this.allowActions = allowActions;
                return this;
            }

            /**
             * The ID of the user who created the queue.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * The environment types of the queue.
             */
            public Builder environments(java.util.List < String > environments) {
                this.environments = environments;
                return this;
            }

            /**
             * The maximum capacity of resources that can be used in the queue.
             */
            public Builder maxResource(String maxResource) {
                this.maxResource = maxResource;
                return this;
            }

            /**
             * The minimum capacity of resources that can be used in the queue.
             */
            public Builder minResource(String minResource) {
                this.minResource = minResource;
                return this;
            }

            /**
             * The queue label.
             */
            public Builder properties(String properties) {
                this.properties = properties;
                return this;
            }

            /**
             * The name of the queue.
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * The queue architecture.
             */
            public Builder queueScope(String queueScope) {
                this.queueScope = queueScope;
                return this;
            }

            /**
             * The status of the queue.
             */
            public Builder queueStatus(String queueStatus) {
                this.queueStatus = queueStatus;
                return this;
            }

            /**
             * The queue type.
             */
            public Builder queueType(String queueType) {
                this.queueType = queueType;
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
             * The capacity of resources that are used in the queue.
             */
            public Builder usedResource(String usedResource) {
                this.usedResource = usedResource;
                return this;
            }

            /**
             * The workspace ID.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Queues build() {
                return new Queues(this);
            } 

        } 

    }
}
