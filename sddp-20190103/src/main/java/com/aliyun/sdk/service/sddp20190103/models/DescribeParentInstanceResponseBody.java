// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeParentInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeParentInstanceResponseBody</p>
 */
public class DescribeParentInstanceResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeParentInstanceResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeParentInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
        private Integer currentPage; 
        private java.util.List < Items> items; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeParentInstanceResponseBody build() {
            return new DescribeParentInstanceResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("AuditStatus")
        private Integer auditStatus;

        @NameInMap("AuthStatus")
        private Integer authStatus;

        @NameInMap("ClusterStatus")
        private String clusterStatus;

        @NameInMap("ConnectNode")
        private String connectNode;

        @NameInMap("DbNum")
        private String dbNum;

        @NameInMap("EngineType")
        private String engineType;

        @NameInMap("InstanceDescription")
        private String instanceDescription;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceSize")
        private Long instanceSize;

        @NameInMap("LocalName")
        private String localName;

        @NameInMap("ParentId")
        private String parentId;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("SupportConnectNodes")
        private String supportConnectNodes;

        @NameInMap("TenantId")
        private String tenantId;

        @NameInMap("TenantName")
        private String tenantName;

        @NameInMap("UnConnectDbCount")
        private String unConnectDbCount;

        @NameInMap("UnSupportOneClickAuthReason")
        private String unSupportOneClickAuthReason;

        private Items(Builder builder) {
            this.auditStatus = builder.auditStatus;
            this.authStatus = builder.authStatus;
            this.clusterStatus = builder.clusterStatus;
            this.connectNode = builder.connectNode;
            this.dbNum = builder.dbNum;
            this.engineType = builder.engineType;
            this.instanceDescription = builder.instanceDescription;
            this.instanceId = builder.instanceId;
            this.instanceSize = builder.instanceSize;
            this.localName = builder.localName;
            this.parentId = builder.parentId;
            this.resourceType = builder.resourceType;
            this.supportConnectNodes = builder.supportConnectNodes;
            this.tenantId = builder.tenantId;
            this.tenantName = builder.tenantName;
            this.unConnectDbCount = builder.unConnectDbCount;
            this.unSupportOneClickAuthReason = builder.unSupportOneClickAuthReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return auditStatus
         */
        public Integer getAuditStatus() {
            return this.auditStatus;
        }

        /**
         * @return authStatus
         */
        public Integer getAuthStatus() {
            return this.authStatus;
        }

        /**
         * @return clusterStatus
         */
        public String getClusterStatus() {
            return this.clusterStatus;
        }

        /**
         * @return connectNode
         */
        public String getConnectNode() {
            return this.connectNode;
        }

        /**
         * @return dbNum
         */
        public String getDbNum() {
            return this.dbNum;
        }

        /**
         * @return engineType
         */
        public String getEngineType() {
            return this.engineType;
        }

        /**
         * @return instanceDescription
         */
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceSize
         */
        public Long getInstanceSize() {
            return this.instanceSize;
        }

        /**
         * @return localName
         */
        public String getLocalName() {
            return this.localName;
        }

        /**
         * @return parentId
         */
        public String getParentId() {
            return this.parentId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return supportConnectNodes
         */
        public String getSupportConnectNodes() {
            return this.supportConnectNodes;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return tenantName
         */
        public String getTenantName() {
            return this.tenantName;
        }

        /**
         * @return unConnectDbCount
         */
        public String getUnConnectDbCount() {
            return this.unConnectDbCount;
        }

        /**
         * @return unSupportOneClickAuthReason
         */
        public String getUnSupportOneClickAuthReason() {
            return this.unSupportOneClickAuthReason;
        }

        public static final class Builder {
            private Integer auditStatus; 
            private Integer authStatus; 
            private String clusterStatus; 
            private String connectNode; 
            private String dbNum; 
            private String engineType; 
            private String instanceDescription; 
            private String instanceId; 
            private Long instanceSize; 
            private String localName; 
            private String parentId; 
            private String resourceType; 
            private String supportConnectNodes; 
            private String tenantId; 
            private String tenantName; 
            private String unConnectDbCount; 
            private String unSupportOneClickAuthReason; 

            /**
             * AuditStatus.
             */
            public Builder auditStatus(Integer auditStatus) {
                this.auditStatus = auditStatus;
                return this;
            }

            /**
             * AuthStatus.
             */
            public Builder authStatus(Integer authStatus) {
                this.authStatus = authStatus;
                return this;
            }

            /**
             * ClusterStatus.
             */
            public Builder clusterStatus(String clusterStatus) {
                this.clusterStatus = clusterStatus;
                return this;
            }

            /**
             * ConnectNode.
             */
            public Builder connectNode(String connectNode) {
                this.connectNode = connectNode;
                return this;
            }

            /**
             * DbNum.
             */
            public Builder dbNum(String dbNum) {
                this.dbNum = dbNum;
                return this;
            }

            /**
             * EngineType.
             */
            public Builder engineType(String engineType) {
                this.engineType = engineType;
                return this;
            }

            /**
             * InstanceDescription.
             */
            public Builder instanceDescription(String instanceDescription) {
                this.instanceDescription = instanceDescription;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceSize.
             */
            public Builder instanceSize(Long instanceSize) {
                this.instanceSize = instanceSize;
                return this;
            }

            /**
             * LocalName.
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * ParentId.
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
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
             * SupportConnectNodes.
             */
            public Builder supportConnectNodes(String supportConnectNodes) {
                this.supportConnectNodes = supportConnectNodes;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * TenantName.
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * UnConnectDbCount.
             */
            public Builder unConnectDbCount(String unConnectDbCount) {
                this.unConnectDbCount = unConnectDbCount;
                return this;
            }

            /**
             * UnSupportOneClickAuthReason.
             */
            public Builder unSupportOneClickAuthReason(String unSupportOneClickAuthReason) {
                this.unSupportOneClickAuthReason = unSupportOneClickAuthReason;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
