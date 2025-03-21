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
 * {@link DescribeUniBackupPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUniBackupPoliciesResponseBody</p>
 */
public class DescribeUniBackupPoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UniBackupPolicies")
    private java.util.List<UniBackupPolicies> uniBackupPolicies;

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
    public java.util.List<UniBackupPolicies> getUniBackupPolicies() {
        return this.uniBackupPolicies;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private String requestId; 
        private java.util.List<UniBackupPolicies> uniBackupPolicies; 

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
         * <p>ACF97412-FD09-4D1F-994F-34DF12BR****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array that consists of the anti-ransomware policies.</p>
         */
        public Builder uniBackupPolicies(java.util.List<UniBackupPolicies> uniBackupPolicies) {
            this.uniBackupPolicies = uniBackupPolicies;
            return this;
        }

        public DescribeUniBackupPoliciesResponseBody build() {
            return new DescribeUniBackupPoliciesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUniBackupPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUniBackupPoliciesResponseBody</p>
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
             * <p>100</p>
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
    /**
     * 
     * {@link DescribeUniBackupPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUniBackupPoliciesResponseBody</p>
     */
    public static class UniBackupPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentErrorMessage")
        private String agentErrorMessage;

        @com.aliyun.core.annotation.NameInMap("AgentStatus")
        private String agentStatus;

        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("DatabaseType")
        private String databaseType;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceStatus")
        private String instanceStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceUuid")
        private String instanceUuid;

        @com.aliyun.core.annotation.NameInMap("LatestBackResult")
        private String latestBackResult;

        @com.aliyun.core.annotation.NameInMap("LatestBackupTime")
        private String latestBackupTime;

        @com.aliyun.core.annotation.NameInMap("PlanStatus")
        private String planStatus;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private Long policyId;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("PolicyStatus")
        private String policyStatus;

        @com.aliyun.core.annotation.NameInMap("UniRegionId")
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
             * <p>The error message for the anti-ransomware agent.</p>
             * 
             * <strong>example:</strong>
             * <p>INSTALL_TIMEOUT</p>
             */
            public Builder agentErrorMessage(String agentErrorMessage) {
                this.agentErrorMessage = agentErrorMessage;
                return this;
            }

            /**
             * <p>The status of the agent. Valid values:</p>
             * <ul>
             * <li><strong>UNKNOWN</strong></li>
             * <li><strong>INSTALLED</strong></li>
             * <li><strong>INSTALL_FAILED</strong></li>
             * <li><strong>UNINSTALL_FAILED</strong></li>
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
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>abc123</p>
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
             * <p>The error code returned when the backup task fails.</p>
             * 
             * <strong>example:</strong>
             * <p>EXPIRED</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message for the anti-ransomware policy.</p>
             * 
             * <strong>example:</strong>
             * <p>AttachRamRoleError</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The ID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>i-9dp7mubt5wit6g0h****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>sql-test-001</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The status of the Elastic Compute Service (ECS) instance. Valid values:</p>
             * <ul>
             * <li><strong>Stopped</strong></li>
             * <li><strong>Running</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * <p>The UUID of the agent that is used to back up the data of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>cf1bcad4063f11ed800000163e0e****</p>
             */
            public Builder instanceUuid(String instanceUuid) {
                this.instanceUuid = instanceUuid;
                return this;
            }

            /**
             * <p>The execution result of the last backup task.</p>
             * 
             * <strong>example:</strong>
             * <p>completed</p>
             */
            public Builder latestBackResult(String latestBackResult) {
                this.latestBackResult = latestBackResult;
                return this;
            }

            /**
             * <p>The time when the last backup task was executed.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-01 00:00:11</p>
             */
            public Builder latestBackupTime(String latestBackupTime) {
                this.latestBackupTime = latestBackupTime;
                return this;
            }

            /**
             * <p>The status of the backup task. Valid values:</p>
             * <ul>
             * <li><strong>init</strong></li>
             * <li><strong>running</strong></li>
             * <li><strong>completed</strong></li>
             * <li><strong>restoring</strong></li>
             * <li><strong>creating</strong></li>
             * <li><strong>created</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>creating</p>
             */
            public Builder planStatus(String planStatus) {
                this.planStatus = planStatus;
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
             * <p>The name of the anti-ransomware policy.</p>
             * 
             * <strong>example:</strong>
             * <p>auto_oracle_37f</p>
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * <p>The status of the anti-ransomware policy. Valid values:</p>
             * <ul>
             * <li><strong>initiating</strong></li>
             * <li><strong>opening</strong></li>
             * <li><strong>closing</strong></li>
             * <li><strong>deleting</strong></li>
             * <li><strong>enabled</strong></li>
             * <li><strong>disabled</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>opening</p>
             */
            public Builder policyStatus(String policyStatus) {
                this.policyStatus = policyStatus;
                return this;
            }

            /**
             * <p>The region ID of the server that hosts the database.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
