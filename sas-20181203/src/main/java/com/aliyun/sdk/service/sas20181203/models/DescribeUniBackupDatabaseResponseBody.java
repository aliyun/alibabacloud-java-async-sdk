// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeUniBackupDatabaseResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUniBackupDatabaseResponseBody</p>
 */
public class DescribeUniBackupDatabaseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatabaseList")
    private java.util.List<DatabaseList> databaseList;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeUniBackupDatabaseResponseBody(Builder builder) {
        this.databaseList = builder.databaseList;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUniBackupDatabaseResponseBody create() {
        return builder().build();
    }

    /**
     * @return databaseList
     */
    public java.util.List<DatabaseList> getDatabaseList() {
        return this.databaseList;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DatabaseList> databaseList; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * <p>An array that consists of the information about the databases.</p>
         */
        public Builder databaseList(java.util.List<DatabaseList> databaseList) {
            this.databaseList = databaseList;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>09969D2C-4FAD-429E-BFBF-9A60DEF8****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUniBackupDatabaseResponseBody build() {
            return new DescribeUniBackupDatabaseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUniBackupDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUniBackupDatabaseResponseBody</p>
     */
    public static class DatabaseList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentStatus")
        private String agentStatus;

        @com.aliyun.core.annotation.NameInMap("CreatedByProduct")
        private String createdByProduct;

        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("DatabaseType")
        private String databaseType;

        @com.aliyun.core.annotation.NameInMap("DatabaseVersion")
        private String databaseVersion;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceUuid")
        private String instanceUuid;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private Long policyId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DatabaseList(Builder builder) {
            this.agentStatus = builder.agentStatus;
            this.createdByProduct = builder.createdByProduct;
            this.databaseName = builder.databaseName;
            this.databaseType = builder.databaseType;
            this.databaseVersion = builder.databaseVersion;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceUuid = builder.instanceUuid;
            this.policyId = builder.policyId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabaseList create() {
            return builder().build();
        }

        /**
         * @return agentStatus
         */
        public String getAgentStatus() {
            return this.agentStatus;
        }

        /**
         * @return createdByProduct
         */
        public String getCreatedByProduct() {
            return this.createdByProduct;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return databaseType
         */
        public String getDatabaseType() {
            return this.databaseType;
        }

        /**
         * @return databaseVersion
         */
        public String getDatabaseVersion() {
            return this.databaseVersion;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return instanceUuid
         */
        public String getInstanceUuid() {
            return this.instanceUuid;
        }

        /**
         * @return policyId
         */
        public Long getPolicyId() {
            return this.policyId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String agentStatus; 
            private String createdByProduct; 
            private String databaseName; 
            private String databaseType; 
            private String databaseVersion; 
            private String instanceId; 
            private String instanceName; 
            private String instanceUuid; 
            private Long policyId; 
            private String status; 

            /**
             * <p>The status of the anti-ransomware agent. Valid values:</p>
             * <ul>
             * <li><strong>UNKNOWN</strong>: unknown</li>
             * <li><strong>INSTALLED</strong>: installed</li>
             * <li><strong>INSTALL_FAILED</strong>: installation failed</li>
             * <li><strong>UNINSTALL_FAILED</strong>: uninstallation failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>INSTALLED</p>
             */
            public Builder agentStatus(String agentStatus) {
                this.agentStatus = agentStatus;
                return this;
            }

            /**
             * <p>The service from which the database is created. Valid values:</p>
             * <ul>
             * <li><strong>HBR</strong>: HBR</li>
             * <li><strong>AEGIS</strong>: Security Center</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AEGIS</p>
             */
            public Builder createdByProduct(String createdByProduct) {
                this.createdByProduct = createdByProduct;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>apns_tt180</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The type of the database. Valid values:</p>
             * <ul>
             * <li><strong>MYSQL</strong></li>
             * <li><strong>MSSQL</strong></li>
             * <li><strong>Oracle</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MYSQL</p>
             */
            public Builder databaseType(String databaseType) {
                this.databaseType = databaseType;
                return this;
            }

            /**
             * <p>The version of the database engine.</p>
             * 
             * <strong>example:</strong>
             * <p>12.0.4100.1</p>
             */
            public Builder databaseVersion(String databaseVersion) {
                this.databaseVersion = databaseVersion;
                return this;
            }

            /**
             * <p>The ID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp15aho9hhftvmhw****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the instance to which the database belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>sql-test-001</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The UUID of the Hybrid Backup Recovery (HBR) agent that is used to back up the data of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>85878b284df911ec800000163e19****</p>
             */
            public Builder instanceUuid(String instanceUuid) {
                this.instanceUuid = instanceUuid;
                return this;
            }

            /**
             * <p>The ID of the anti-ransomware policy.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder policyId(Long policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The status of the ECS instance. Valid values:</p>
             * <ul>
             * <li><strong>Stopped</strong></li>
             * <li><strong>Running</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DatabaseList build() {
                return new DatabaseList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUniBackupDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUniBackupDatabaseResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
