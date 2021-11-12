// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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
         * <p>PageInfo.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>UniBackupPolicies.</p>
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
             * <p>Count.</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>CurrentPage.</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>PageSize.</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>TotalCount.</p>
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

        @NameInMap("UniBackUpCount")
        private Integer uniBackUpCount;

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
            this.uniBackUpCount = builder.uniBackUpCount;
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
         * @return uniBackUpCount
         */
        public Integer getUniBackUpCount() {
            return this.uniBackUpCount;
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
            private Integer uniBackUpCount; 
            private String uniRegionId; 

            /**
             * <p>AgentErrorMessage.</p>
             */
            public Builder agentErrorMessage(String agentErrorMessage) {
                this.agentErrorMessage = agentErrorMessage;
                return this;
            }

            /**
             * <p>AgentStatus.</p>
             */
            public Builder agentStatus(String agentStatus) {
                this.agentStatus = agentStatus;
                return this;
            }

            /**
             * <p>DatabaseName.</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>DatabaseType.</p>
             */
            public Builder databaseType(String databaseType) {
                this.databaseType = databaseType;
                return this;
            }

            /**
             * <p>ErrorCode.</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>ErrorMessage.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>InstanceId.</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>InstanceName.</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>InstanceStatus.</p>
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * <p>InstanceUuid.</p>
             */
            public Builder instanceUuid(String instanceUuid) {
                this.instanceUuid = instanceUuid;
                return this;
            }

            /**
             * <p>LatestBackResult.</p>
             */
            public Builder latestBackResult(String latestBackResult) {
                this.latestBackResult = latestBackResult;
                return this;
            }

            /**
             * <p>LatestBackupTime.</p>
             */
            public Builder latestBackupTime(String latestBackupTime) {
                this.latestBackupTime = latestBackupTime;
                return this;
            }

            /**
             * <p>PlanStatus.</p>
             */
            public Builder planStatus(String planStatus) {
                this.planStatus = planStatus;
                return this;
            }

            /**
             * <p>PolicyId.</p>
             */
            public Builder policyId(Long policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>PolicyName.</p>
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * <p>PolicyStatus.</p>
             */
            public Builder policyStatus(String policyStatus) {
                this.policyStatus = policyStatus;
                return this;
            }

            /**
             * <p>UniBackUpCount.</p>
             */
            public Builder uniBackUpCount(Integer uniBackUpCount) {
                this.uniBackUpCount = uniBackUpCount;
                return this;
            }

            /**
             * <p>UniRegionId.</p>
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
