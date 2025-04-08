// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
    private java.util.List<Queues> queues;

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
     * @return queues
     */
    public java.util.List<Queues> getQueues() {
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
        private java.util.List<Queues> queues; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListWorkspaceQueuesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.queues = model.queues;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The maximum number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The list of queues.</p>
         */
        public Builder queues(java.util.List<Queues> queues) {
            this.queues = queues;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListWorkspaceQueuesResponseBody build() {
            return new ListWorkspaceQueuesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWorkspaceQueuesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkspaceQueuesResponseBody</p>
     */
    public static class AllowActions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actionArn")
        private String actionArn;

        @com.aliyun.core.annotation.NameInMap("actionName")
        private String actionName;

        @com.aliyun.core.annotation.NameInMap("dependencies")
        private java.util.List<String> dependencies;

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
        public java.util.List<String> getDependencies() {
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
            private java.util.List<String> dependencies; 
            private String description; 
            private String displayName; 

            private Builder() {
            } 

            private Builder(AllowActions model) {
                this.actionArn = model.actionArn;
                this.actionName = model.actionName;
                this.dependencies = model.dependencies;
                this.description = model.description;
                this.displayName = model.displayName;
            } 

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of a behavior.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:emr::workspaceId:action/create_queue</p>
             */
            public Builder actionArn(String actionArn) {
                this.actionArn = actionArn;
                return this;
            }

            /**
             * <p>The name of the permission.</p>
             * 
             * <strong>example:</strong>
             * <p>view</p>
             */
            public Builder actionName(String actionName) {
                this.actionName = actionName;
                return this;
            }

            /**
             * <p>The dependencies of the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;view&quot;]</p>
             */
            public Builder dependencies(java.util.List<String> dependencies) {
                this.dependencies = dependencies;
                return this;
            }

            /**
             * <p>The description of the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>文件目录遍历、文件浏览</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The display name of the permission.</p>
             * 
             * <strong>example:</strong>
             * <p>文件目录遍历、文件浏览</p>
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
    /**
     * 
     * {@link ListWorkspaceQueuesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkspaceQueuesResponseBody</p>
     */
    public static class Queues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("allowActions")
        private java.util.List<AllowActions> allowActions;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("environments")
        private java.util.List<String> environments;

        @com.aliyun.core.annotation.NameInMap("maxResource")
        private String maxResource;

        @com.aliyun.core.annotation.NameInMap("minResource")
        private String minResource;

        @com.aliyun.core.annotation.NameInMap("paymentType")
        private String paymentType;

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
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.environments = builder.environments;
            this.maxResource = builder.maxResource;
            this.minResource = builder.minResource;
            this.paymentType = builder.paymentType;
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
        public java.util.List<AllowActions> getAllowActions() {
            return this.allowActions;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
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
        public java.util.List<String> getEnvironments() {
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
         * @return paymentType
         */
        public String getPaymentType() {
            return this.paymentType;
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
            private java.util.List<AllowActions> allowActions; 
            private Long createTime; 
            private String creator; 
            private java.util.List<String> environments; 
            private String maxResource; 
            private String minResource; 
            private String paymentType; 
            private String properties; 
            private String queueName; 
            private String queueScope; 
            private String queueStatus; 
            private String queueType; 
            private String regionId; 
            private String usedResource; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Queues model) {
                this.allowActions = model.allowActions;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.environments = model.environments;
                this.maxResource = model.maxResource;
                this.minResource = model.minResource;
                this.paymentType = model.paymentType;
                this.properties = model.properties;
                this.queueName = model.queueName;
                this.queueScope = model.queueScope;
                this.queueStatus = model.queueStatus;
                this.queueType = model.queueType;
                this.regionId = model.regionId;
                this.usedResource = model.usedResource;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The operations allowed for the queue.</p>
             */
            public Builder allowActions(java.util.List<AllowActions> allowActions) {
                this.allowActions = allowActions;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the user who created the queue.</p>
             * 
             * <strong>example:</strong>
             * <p>237109</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The environment types of the queue.</p>
             */
            public Builder environments(java.util.List<String> environments) {
                this.environments = environments;
                return this;
            }

            /**
             * <p>The maximum capacity of resources that can be used in the queue.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;cpu&quot;: &quot;2&quot;,&quot;memory&quot;: &quot;2Gi&quot;}</p>
             */
            public Builder maxResource(String maxResource) {
                this.maxResource = maxResource;
                return this;
            }

            /**
             * <p>The minimum capacity of resources that can be used in the queue.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;cpu&quot;: &quot;2&quot;,&quot;memory&quot;: &quot;2Gi&quot;}</p>
             */
            public Builder minResource(String minResource) {
                this.minResource = minResource;
                return this;
            }

            /**
             * paymentType.
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * <p>The queue label.</p>
             * 
             * <strong>example:</strong>
             * <p>dev_queue</p>
             */
            public Builder properties(String properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>The name of the queue.</p>
             * 
             * <strong>example:</strong>
             * <p>dev_queue</p>
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * <p>The queue architecture.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;arch&quot;: &quot;x86&quot;}</p>
             */
            public Builder queueScope(String queueScope) {
                this.queueScope = queueScope;
                return this;
            }

            /**
             * <p>The status of the queue.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder queueStatus(String queueStatus) {
                this.queueStatus = queueStatus;
                return this;
            }

            /**
             * <p>The queue type.</p>
             * 
             * <strong>example:</strong>
             * <p>instance, instanceChildren</p>
             */
            public Builder queueType(String queueType) {
                this.queueType = queueType;
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
             * <p>The capacity of resources that are used in the queue.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;cpu&quot;: &quot;2&quot;,&quot;memory&quot;: &quot;2Gi&quot;}</p>
             */
            public Builder usedResource(String usedResource) {
                this.usedResource = usedResource;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>w-1234abcd</p>
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
