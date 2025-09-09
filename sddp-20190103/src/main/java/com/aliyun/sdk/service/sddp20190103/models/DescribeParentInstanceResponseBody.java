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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeParentInstanceResponseBody model) {
            this.currentPage = model.currentPage;
            this.items = model.items;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>When performing a paginated query, set the current page number. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The assets.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>When performing a paginated query, set the maximum number of data asset instances displayed per page. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Request ID of the result.</p>
         * 
         * <strong>example:</strong>
         * <p>ACEF9334-BB50-525D-8CF3-6CF504E4D1B3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of data items in the result.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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

            private Builder() {
            } 

            private Builder(Items model) {
                this.auditStatus = model.auditStatus;
                this.authStatus = model.authStatus;
                this.authTime = model.authTime;
                this.clusterStatus = model.clusterStatus;
                this.connectNode = model.connectNode;
                this.dbNum = model.dbNum;
                this.engineType = model.engineType;
                this.instanceDescription = model.instanceDescription;
                this.instanceId = model.instanceId;
                this.instanceSize = model.instanceSize;
                this.localName = model.localName;
                this.memberAccount = model.memberAccount;
                this.parentId = model.parentId;
                this.regionId = model.regionId;
                this.resourceType = model.resourceType;
                this.supportConnectNodes = model.supportConnectNodes;
                this.tenantId = model.tenantId;
                this.tenantName = model.tenantName;
                this.unConnectDbCount = model.unConnectDbCount;
                this.unSupportOneClickAuthReason = model.unSupportOneClickAuthReason;
            } 

            /**
             * <p>Audit authorization status. The values are as follows:</p>
             * <ul>
             * <li><strong>1</strong>: Authorized</li>
             * <li><strong>0</strong>: Unauthorized</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder auditStatus(Integer auditStatus) {
                this.auditStatus = auditStatus;
                return this;
            }

            /**
             * <p>Authorization status of the data asset instance.</p>
             * <ul>
             * <li><strong>0</strong>: Unauthorized</li>
             * <li><strong>1</strong>: Authorized</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder authStatus(Integer authStatus) {
                this.authStatus = authStatus;
                return this;
            }

            /**
             * <p>Instance authorization time, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1719882941000</p>
             */
            public Builder authTime(Long authTime) {
                this.authTime = authTime;
                return this;
            }

            /**
             * <p>Instance status.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder clusterStatus(String clusterStatus) {
                this.clusterStatus = clusterStatus;
                return this;
            }

            /**
             * <p>Connection node type, valid only for MongoDB assets.</p>
             * 
             * <strong>example:</strong>
             * <p>Primary</p>
             */
            public Builder connectNode(String connectNode) {
                this.connectNode = connectNode;
                return this;
            }

            /**
             * <p>Number of databases under the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder dbNum(String dbNum) {
                this.dbNum = dbNum;
                return this;
            }

            /**
             * <p>The engine type. Valid values:</p>
             * <ul>
             * <li><strong>MySQL</strong></li>
             * <li><strong>MariaDB</strong></li>
             * <li><strong>Oracle</strong></li>
             * <li><strong>PostgreSQL</strong></li>
             * <li><strong>SQLServer</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engineType(String engineType) {
                this.engineType = engineType;
                return this;
            }

            /**
             * <p>Description of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>instance description</p>
             */
            public Builder instanceDescription(String instanceDescription) {
                this.instanceDescription = instanceDescription;
                return this;
            }

            /**
             * <p>Instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-*******t2vz</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Instance space size, valid only for OSS assets. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>409600</p>
             */
            public Builder instanceSize(Long instanceSize) {
                this.instanceSize = instanceSize;
                return this;
            }

            /**
             * <p>Region name. The values are as follows:</p>
             * <ul>
             * <li><strong>China (Hangzhou)</strong></li>
             * <li><strong>China (Shanghai)</strong></li>
             * <li><strong>China (Beijing)</strong></li>
             * <li><strong>China (Zhangjiakou)</strong></li>
             * <li><strong>China (Shenzhen)</strong></li>
             * <li><strong>China (Guangzhou)</strong></li>
             * <li><strong>China (Hong Kong)</strong></li>
             * <li><strong>Singapore</strong></li>
             * <li><strong>US (Silicon Valley)</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>China (Hangzhou)</p>
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * <p>Member account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>**********8103</p>
             */
            public Builder memberAccount(Long memberAccount) {
                this.memberAccount = memberAccount;
                return this;
            }

            /**
             * <p>Identifier for the authorized asset. For structured data, it is identified by <code>instanceID.databaseName</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-******xxx.**st</p>
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * <p>The region in which the asset resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Asset type name. The values are as follows:</p>
             * <ul>
             * <li><strong>MaxCompute</strong></li>
             * <li><strong>OSS</strong></li>
             * <li><strong>ADB-MYSQL</strong></li>
             * <li><strong>TableStore</strong></li>
             * <li><strong>RDS</strong></li>
             * <li><strong>SelfDB</strong></li>
             * <li><strong>PolarDB-X</strong></li>
             * <li><strong>PolarDB</strong></li>
             * <li><strong>ADB-PG</strong></li>
             * <li><strong>OceanBase</strong></li>
             * <li><strong>MongoDB</strong></li>
             * <li><strong>Redis</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>Supported connection nodes, separated by commas.</p>
             * 
             * <strong>example:</strong>
             * <p>Primary,Secondary</p>
             */
            public Builder supportConnectNodes(String supportConnectNodes) {
                this.supportConnectNodes = supportConnectNodes;
                return this;
            }

            /**
             * <p>Tenant ID, valid only for OceanBase assets.</p>
             * 
             * <strong>example:</strong>
             * <p>HB***-zh_CN</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>Tenant name, valid only for OceanBase assets.</p>
             * 
             * <strong>example:</strong>
             * <p>user1</p>
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * <p>Number of unconnected databases under the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder unConnectDbCount(String unConnectDbCount) {
                this.unConnectDbCount = unConnectDbCount;
                return this;
            }

            /**
             * <p>Reason for not supporting one-click authorization.</p>
             * 
             * <strong>example:</strong>
             * <p>engine type not support</p>
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
