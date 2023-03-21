// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUniBackupPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUniBackupPoliciesResponseBody</p>
 */
public class DescribeUniBackupPoliciesResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UniBackupPolicies")
    private java.util.List < UniBackupPolicies> uniBackupPolicies;

    private DescribeUniBackupPoliciesResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.uniBackupPolicies = builder.uniBackupPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUniBackupPoliciesResponseBody create() {
        return builder().build();
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

    /**
     * @return uniBackupPolicies
     */
    public java.util.List < UniBackupPolicies> getUniBackupPolicies() {
        return this.uniBackupPolicies;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private String requestId; 
        private java.util.List < UniBackupPolicies> uniBackupPolicies; 

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

        /**
         * An array that consists of the anti-ransomware policies.
         */
        public Builder uniBackupPolicies(java.util.List < UniBackupPolicies> uniBackupPolicies) {
            this.uniBackupPolicies = uniBackupPolicies;
            return this;
        }

        public DescribeUniBackupPoliciesResponseBody build() {
            return new DescribeUniBackupPoliciesResponseBody(this);
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
    public static class UniBackupPolicies extends TeaModel {
        @NameInMap("AgentErrorMessage")
        private String agentErrorMessage;

        @NameInMap("AgentStatus")
        private String agentStatus;

        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("DatabaseType")
        private String databaseType;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InstanceStatus")
        private String instanceStatus;

        @NameInMap("InstanceUuid")
        private String instanceUuid;

        @NameInMap("LatestBackResult")
        private String latestBackResult;

        @NameInMap("LatestBackupTime")
        private String latestBackupTime;

        @NameInMap("PlanStatus")
        private String planStatus;

        @NameInMap("PolicyId")
        private Long policyId;

        @NameInMap("PolicyName")
        private String policyName;

        @NameInMap("PolicyStatus")
        private String policyStatus;

        @NameInMap("UniRegionId")
        private String uniRegionId;

        private UniBackupPolicies(Builder builder) {
            this.agentErrorMessage = builder.agentErrorMessage;
            this.agentStatus = builder.agentStatus;
            this.databaseName = builder.databaseName;
            this.databaseType = builder.databaseType;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceStatus = builder.instanceStatus;
            this.instanceUuid = builder.instanceUuid;
            this.latestBackResult = builder.latestBackResult;
            this.latestBackupTime = builder.latestBackupTime;
            this.planStatus = builder.planStatus;
            this.policyId = builder.policyId;
            this.policyName = builder.policyName;
            this.policyStatus = builder.policyStatus;
            this.uniRegionId = builder.uniRegionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UniBackupPolicies create() {
            return builder().build();
        }

        /**
         * @return agentErrorMessage
         */
        public String getAgentErrorMessage() {
            return this.agentErrorMessage;
        }

        /**
         * @return agentStatus
         */
        public String getAgentStatus() {
            return this.agentStatus;
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
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
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
         * @return instanceStatus
         */
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        /**
         * @return instanceUuid
         */
        public String getInstanceUuid() {
            return this.instanceUuid;
        }

        /**
         * @return latestBackResult
         */
        public String getLatestBackResult() {
            return this.latestBackResult;
        }

        /**
         * @return latestBackupTime
         */
        public String getLatestBackupTime() {
            return this.latestBackupTime;
        }

        /**
         * @return planStatus
         */
        public String getPlanStatus() {
            return this.planStatus;
        }

        /**
         * @return policyId
         */
        public Long getPolicyId() {
            return this.policyId;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        /**
         * @return policyStatus
         */
        public String getPolicyStatus() {
            return this.policyStatus;
        }

        /**
         * @return uniRegionId
         */
        public String getUniRegionId() {
            return this.uniRegionId;
        }

        public static final class Builder {
            private String agentErrorMessage; 
            private String agentStatus; 
            private String databaseName; 
            private String databaseType; 
            private String errorCode; 
            private String errorMessage; 
            private String instanceId; 
            private String instanceName; 
            private String instanceStatus; 
            private String instanceUuid; 
            private String latestBackResult; 
            private String latestBackupTime; 
            private String planStatus; 
            private Long policyId; 
            private String policyName; 
            private String policyStatus; 
            private String uniRegionId; 

            /**
             * The error message for the anti-ransomware agent.
             */
            public Builder agentErrorMessage(String agentErrorMessage) {
                this.agentErrorMessage = agentErrorMessage;
                return this;
            }

            /**
             * The status of the agent. Valid values:
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
             * The error code returned when the backup task fails.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The error message for the anti-ransomware policy.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
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
             * The name of the server.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The status of the Elastic Compute Service (ECS) instance. Valid values:
             * <p>
             * 
             * *   **Stopped**
             * *   **Running**
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * The UUID of the agent that is used to back up the data of the database.
             */
            public Builder instanceUuid(String instanceUuid) {
                this.instanceUuid = instanceUuid;
                return this;
            }

            /**
             * The execution result of the last backup task.
             */
            public Builder latestBackResult(String latestBackResult) {
                this.latestBackResult = latestBackResult;
                return this;
            }

            /**
             * The time when the last backup task was executed.
             */
            public Builder latestBackupTime(String latestBackupTime) {
                this.latestBackupTime = latestBackupTime;
                return this;
            }

            /**
             * The status of the backup task. Valid values:
             * <p>
             * 
             * *   **init**: initializing
             * *   **running**: running
             * *   **completed**: complete
             * *   **restoring**: restoring
             * *   **creating**: creating
             * *   **created**: created
             */
            public Builder planStatus(String planStatus) {
                this.planStatus = planStatus;
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
             * The name of the anti-ransomware policy.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * The status of the anti-ransomware policy. Valid values:
             * <p>
             * 
             * *   **initiating**: initializing
             * *   **opening**: enabled
             * *   **closing**: disabled
             * *   **deleting**: deleting
             */
            public Builder policyStatus(String policyStatus) {
                this.policyStatus = policyStatus;
                return this;
            }

            /**
             * The region ID of the server that hosts the database.
             */
            public Builder uniRegionId(String uniRegionId) {
                this.uniRegionId = uniRegionId;
                return this;
            }

            public UniBackupPolicies build() {
                return new UniBackupPolicies(this);
            } 

        } 

    }
}
