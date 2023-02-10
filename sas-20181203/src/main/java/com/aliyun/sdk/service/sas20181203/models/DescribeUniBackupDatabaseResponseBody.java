// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUniBackupDatabaseResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUniBackupDatabaseResponseBody</p>
 */
public class DescribeUniBackupDatabaseResponseBody extends TeaModel {
    @NameInMap("DatabaseList")
    private java.util.List < DatabaseList> databaseList;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
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
    public java.util.List < DatabaseList> getDatabaseList() {
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
        private java.util.List < DatabaseList> databaseList; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * An array that consists of the information about the databases.
         */
        public Builder databaseList(java.util.List < DatabaseList> databaseList) {
            this.databaseList = databaseList;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUniBackupDatabaseResponseBody build() {
            return new DescribeUniBackupDatabaseResponseBody(this);
        } 

    } 

    public static class DatabaseList extends TeaModel {
        @NameInMap("AgentStatus")
        private String agentStatus;

        @NameInMap("CreatedByProduct")
        private String createdByProduct;

        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("DatabaseType")
        private String databaseType;

        @NameInMap("DatabaseVersion")
        private String databaseVersion;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InstanceUuid")
        private String instanceUuid;

        @NameInMap("PolicyId")
        private Long policyId;

        @NameInMap("Status")
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
             * The status of the anti-ransomware agent. Valid values:
             * <p>
             * 
             * *   **UNKNOWN**: unknown
             * *   **INSTALLED**: installed
             * *   **INSTALL_FAILED**: installation failed
             * *   **UNINSTALL_FAILED**: uninstallation failed
             */
            public Builder agentStatus(String agentStatus) {
                this.agentStatus = agentStatus;
                return this;
            }

            /**
             * The service from which the database is created. Valid values:
             * <p>
             * 
             * *   **HBR**: HBR
             * *   **AEGIS**: Security Center
             */
            public Builder createdByProduct(String createdByProduct) {
                this.createdByProduct = createdByProduct;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The type of the database. Valid values:
             * <p>
             * 
             * *   **MYSQL**
             * *   **MSSQL**
             * *   **Oracle**
             */
            public Builder databaseType(String databaseType) {
                this.databaseType = databaseType;
                return this;
            }

            /**
             * The version of the database engine.
             */
            public Builder databaseVersion(String databaseVersion) {
                this.databaseVersion = databaseVersion;
                return this;
            }

            /**
             * The ID of the server.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the instance to which the database belongs.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The UUID of the Hybrid Backup Recovery (HBR) agent that is used to back up the data of the database.
             */
            public Builder instanceUuid(String instanceUuid) {
                this.instanceUuid = instanceUuid;
                return this;
            }

            /**
             * The ID of the anti-ransomware policy.
             */
            public Builder policyId(Long policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * The status of the ECS instance. Valid values:
             * <p>
             * 
             * *   **Stopped**
             * *   **Running**
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
    public static class PageInfo extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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
             * The number of entries returned on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
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
