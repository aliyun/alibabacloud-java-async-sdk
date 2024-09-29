// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20240430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListResourceGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceGroupsResponseBody</p>
 */
public class ListResourceGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListResourceGroupsResponseBody(Builder builder) {
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListResourceGroupsResponseBody build() {
            return new ListResourceGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListResourceGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceGroupsResponseBody</p>
     */
    public static class AssociatedClusterTemplates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("clusterType")
        private String clusterType;

        @com.aliyun.core.annotation.NameInMap("templateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("templateName")
        private String templateName;

        private AssociatedClusterTemplates(Builder builder) {
            this.clusterType = builder.clusterType;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssociatedClusterTemplates create() {
            return builder().build();
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private String clusterType; 
            private String templateId; 
            private String templateName; 

            /**
             * clusterType.
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * templateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * templateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public AssociatedClusterTemplates build() {
                return new AssociatedClusterTemplates(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListResourceGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceGroupsResponseBody</p>
     */
    public static class AssociatedClusters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("clusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("clusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("clusterType")
        private String clusterType;

        private AssociatedClusters(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.clusterType = builder.clusterType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssociatedClusters create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        public static final class Builder {
            private String clusterId; 
            private String clusterName; 
            private String clusterType; 

            /**
             * clusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * clusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * clusterType.
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            public AssociatedClusters build() {
                return new AssociatedClusters(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListResourceGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceGroupsResponseBody</p>
     */
    public static class AssociatedWorkspaces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        @com.aliyun.core.annotation.NameInMap("workspaceName")
        private String workspaceName;

        private AssociatedWorkspaces(Builder builder) {
            this.workspaceId = builder.workspaceId;
            this.workspaceName = builder.workspaceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssociatedWorkspaces create() {
            return builder().build();
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        /**
         * @return workspaceName
         */
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        public static final class Builder {
            private String workspaceId; 
            private String workspaceName; 

            /**
             * workspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            /**
             * workspaceName.
             */
            public Builder workspaceName(String workspaceName) {
                this.workspaceName = workspaceName;
                return this;
            }

            public AssociatedWorkspaces build() {
                return new AssociatedWorkspaces(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListResourceGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceGroupsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("associatedClusterTemplates")
        private java.util.List < AssociatedClusterTemplates> associatedClusterTemplates;

        @com.aliyun.core.annotation.NameInMap("associatedClusters")
        private java.util.List < AssociatedClusters> associatedClusters;

        @com.aliyun.core.annotation.NameInMap("associatedWorkspaces")
        private java.util.List < AssociatedWorkspaces> associatedWorkspaces;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("nodeMaxCount")
        private Integer nodeMaxCount;

        @com.aliyun.core.annotation.NameInMap("nodeMinCount")
        private Integer nodeMinCount;

        @com.aliyun.core.annotation.NameInMap("nodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("paymentType")
        private String paymentType;

        @com.aliyun.core.annotation.NameInMap("resourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("resourceGroupName")
        private String resourceGroupName;

        @com.aliyun.core.annotation.NameInMap("resourceGroupType")
        private String resourceGroupType;

        private Data(Builder builder) {
            this.associatedClusterTemplates = builder.associatedClusterTemplates;
            this.associatedClusters = builder.associatedClusters;
            this.associatedWorkspaces = builder.associatedWorkspaces;
            this.createTime = builder.createTime;
            this.nodeMaxCount = builder.nodeMaxCount;
            this.nodeMinCount = builder.nodeMinCount;
            this.nodeType = builder.nodeType;
            this.paymentType = builder.paymentType;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceGroupName = builder.resourceGroupName;
            this.resourceGroupType = builder.resourceGroupType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return associatedClusterTemplates
         */
        public java.util.List < AssociatedClusterTemplates> getAssociatedClusterTemplates() {
            return this.associatedClusterTemplates;
        }

        /**
         * @return associatedClusters
         */
        public java.util.List < AssociatedClusters> getAssociatedClusters() {
            return this.associatedClusters;
        }

        /**
         * @return associatedWorkspaces
         */
        public java.util.List < AssociatedWorkspaces> getAssociatedWorkspaces() {
            return this.associatedWorkspaces;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return nodeMaxCount
         */
        public Integer getNodeMaxCount() {
            return this.nodeMaxCount;
        }

        /**
         * @return nodeMinCount
         */
        public Integer getNodeMinCount() {
            return this.nodeMinCount;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return paymentType
         */
        public String getPaymentType() {
            return this.paymentType;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceGroupName
         */
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        /**
         * @return resourceGroupType
         */
        public String getResourceGroupType() {
            return this.resourceGroupType;
        }

        public static final class Builder {
            private java.util.List < AssociatedClusterTemplates> associatedClusterTemplates; 
            private java.util.List < AssociatedClusters> associatedClusters; 
            private java.util.List < AssociatedWorkspaces> associatedWorkspaces; 
            private String createTime; 
            private Integer nodeMaxCount; 
            private Integer nodeMinCount; 
            private String nodeType; 
            private String paymentType; 
            private String resourceGroupId; 
            private String resourceGroupName; 
            private String resourceGroupType; 

            /**
             * associatedClusterTemplates.
             */
            public Builder associatedClusterTemplates(java.util.List < AssociatedClusterTemplates> associatedClusterTemplates) {
                this.associatedClusterTemplates = associatedClusterTemplates;
                return this;
            }

            /**
             * associatedClusters.
             */
            public Builder associatedClusters(java.util.List < AssociatedClusters> associatedClusters) {
                this.associatedClusters = associatedClusters;
                return this;
            }

            /**
             * associatedWorkspaces.
             */
            public Builder associatedWorkspaces(java.util.List < AssociatedWorkspaces> associatedWorkspaces) {
                this.associatedWorkspaces = associatedWorkspaces;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * nodeMaxCount.
             */
            public Builder nodeMaxCount(Integer nodeMaxCount) {
                this.nodeMaxCount = nodeMaxCount;
                return this;
            }

            /**
             * nodeMinCount.
             */
            public Builder nodeMinCount(Integer nodeMinCount) {
                this.nodeMinCount = nodeMinCount;
                return this;
            }

            /**
             * nodeType.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
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
             * resourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * resourceGroupName.
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            /**
             * resourceGroupType.
             */
            public Builder resourceGroupType(String resourceGroupType) {
                this.resourceGroupType = resourceGroupType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
