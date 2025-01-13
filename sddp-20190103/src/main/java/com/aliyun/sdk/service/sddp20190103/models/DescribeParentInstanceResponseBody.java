// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

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
 * {@link DescribeParentInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeParentInstanceResponseBody</p>
 */
public class DescribeParentInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
    public java.util.List<Items> getItems() {
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
        private java.util.List<Items> items; 
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
        public Builder items(java.util.List<Items> items) {
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

    /**
     * 
     * {@link DescribeParentInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeParentInstanceResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditStatus")
        private Integer auditStatus;

        @com.aliyun.core.annotation.NameInMap("AuthStatus")
        private Integer authStatus;

        @com.aliyun.core.annotation.NameInMap("AuthTime")
        private Long authTime;

        @com.aliyun.core.annotation.NameInMap("ClusterStatus")
        private String clusterStatus;

        @com.aliyun.core.annotation.NameInMap("ConnectNode")
        private String connectNode;

        @com.aliyun.core.annotation.NameInMap("DbNum")
        private String dbNum;

        @com.aliyun.core.annotation.NameInMap("EngineType")
        private String engineType;

        @com.aliyun.core.annotation.NameInMap("InstanceDescription")
        private String instanceDescription;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceSize")
        private Long instanceSize;

        @com.aliyun.core.annotation.NameInMap("LocalName")
        private String localName;

        @com.aliyun.core.annotation.NameInMap("MemberAccount")
        private Long memberAccount;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private String parentId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("SupportConnectNodes")
        private String supportConnectNodes;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("TenantName")
        private String tenantName;

        @com.aliyun.core.annotation.NameInMap("UnConnectDbCount")
        private String unConnectDbCount;

        @com.aliyun.core.annotation.NameInMap("UnSupportOneClickAuthReason")
        private String unSupportOneClickAuthReason;

        private Items(Builder builder) {
            this.auditStatus = builder.auditStatus;
            this.authStatus = builder.authStatus;
            this.authTime = builder.authTime;
            this.clusterStatus = builder.clusterStatus;
            this.connectNode = builder.connectNode;
            this.dbNum = builder.dbNum;
            this.engineType = builder.engineType;
            this.instanceDescription = builder.instanceDescription;
            this.instanceId = builder.instanceId;
            this.instanceSize = builder.instanceSize;
            this.localName = builder.localName;
            this.memberAccount = builder.memberAccount;
            this.parentId = builder.parentId;
            this.regionId = builder.regionId;
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
         * @return authTime
         */
        public Long getAuthTime() {
            return this.authTime;
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
         * @return memberAccount
         */
        public Long getMemberAccount() {
            return this.memberAccount;
        }

        /**
         * @return parentId
         */
        public String getParentId() {
            return this.parentId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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
            private Long authTime; 
            private String clusterStatus; 
            private String connectNode; 
            private String dbNum; 
            private String engineType; 
            private String instanceDescription; 
            private String instanceId; 
            private Long instanceSize; 
            private String localName; 
            private Long memberAccount; 
            private String parentId; 
            private String regionId; 
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
             * AuthTime.
             */
            public Builder authTime(Long authTime) {
                this.authTime = authTime;
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
             * MemberAccount.
             */
            public Builder memberAccount(Long memberAccount) {
                this.memberAccount = memberAccount;
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
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
