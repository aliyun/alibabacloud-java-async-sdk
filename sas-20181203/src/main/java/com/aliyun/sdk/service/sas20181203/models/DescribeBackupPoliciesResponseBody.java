// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupPoliciesResponseBody</p>
 */
public class DescribeBackupPoliciesResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("Policies")
    private java.util.List < Policies> policies;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeBackupPoliciesResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.policies = builder.policies;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupPoliciesResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return policies
     */
    public java.util.List < Policies> getPolicies() {
        return this.policies;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private java.util.List < Policies> policies; 
        private String requestId; 

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * An array that consists of the anti-ransomware policies returned.
         */
        public Builder policies(java.util.List < Policies> policies) {
            this.policies = policies;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackupPoliciesResponseBody build() {
            return new DescribeBackupPoliciesResponseBody(this);
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
             * The number of entries returned per page. Default value: 10.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of anti-ransomware policies returned.
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
    public static class Policies extends TeaModel {
        @NameInMap("ClientErrorCount")
        private Integer clientErrorCount;

        @NameInMap("ClientErrorUuidList")
        private java.util.List < String > clientErrorUuidList;

        @NameInMap("ClientStatus")
        private String clientStatus;

        @NameInMap("HealthClientCount")
        private Integer healthClientCount;

        @NameInMap("HealthClientUuidList")
        private java.util.List < String > healthClientUuidList;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("PolicyRegionId")
        private String policyRegionId;

        @NameInMap("PolicyVersion")
        private String policyVersion;

        @NameInMap("RemarkedUuidList")
        private java.util.List < String > remarkedUuidList;

        @NameInMap("ServerType")
        private String serverType;

        @NameInMap("ServiceErrorCount")
        private Integer serviceErrorCount;

        @NameInMap("ServiceErrorUuidList")
        private java.util.List < String > serviceErrorUuidList;

        @NameInMap("Status")
        private String status;

        @NameInMap("UpgradeStatus")
        private String upgradeStatus;

        @NameInMap("UuidList")
        private java.util.List < String > uuidList;

        private Policies(Builder builder) {
            this.clientErrorCount = builder.clientErrorCount;
            this.clientErrorUuidList = builder.clientErrorUuidList;
            this.clientStatus = builder.clientStatus;
            this.healthClientCount = builder.healthClientCount;
            this.healthClientUuidList = builder.healthClientUuidList;
            this.id = builder.id;
            this.name = builder.name;
            this.policy = builder.policy;
            this.policyRegionId = builder.policyRegionId;
            this.policyVersion = builder.policyVersion;
            this.remarkedUuidList = builder.remarkedUuidList;
            this.serverType = builder.serverType;
            this.serviceErrorCount = builder.serviceErrorCount;
            this.serviceErrorUuidList = builder.serviceErrorUuidList;
            this.status = builder.status;
            this.upgradeStatus = builder.upgradeStatus;
            this.uuidList = builder.uuidList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policies create() {
            return builder().build();
        }

        /**
         * @return clientErrorCount
         */
        public Integer getClientErrorCount() {
            return this.clientErrorCount;
        }

        /**
         * @return clientErrorUuidList
         */
        public java.util.List < String > getClientErrorUuidList() {
            return this.clientErrorUuidList;
        }

        /**
         * @return clientStatus
         */
        public String getClientStatus() {
            return this.clientStatus;
        }

        /**
         * @return healthClientCount
         */
        public Integer getHealthClientCount() {
            return this.healthClientCount;
        }

        /**
         * @return healthClientUuidList
         */
        public java.util.List < String > getHealthClientUuidList() {
            return this.healthClientUuidList;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return policyRegionId
         */
        public String getPolicyRegionId() {
            return this.policyRegionId;
        }

        /**
         * @return policyVersion
         */
        public String getPolicyVersion() {
            return this.policyVersion;
        }

        /**
         * @return remarkedUuidList
         */
        public java.util.List < String > getRemarkedUuidList() {
            return this.remarkedUuidList;
        }

        /**
         * @return serverType
         */
        public String getServerType() {
            return this.serverType;
        }

        /**
         * @return serviceErrorCount
         */
        public Integer getServiceErrorCount() {
            return this.serviceErrorCount;
        }

        /**
         * @return serviceErrorUuidList
         */
        public java.util.List < String > getServiceErrorUuidList() {
            return this.serviceErrorUuidList;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return upgradeStatus
         */
        public String getUpgradeStatus() {
            return this.upgradeStatus;
        }

        /**
         * @return uuidList
         */
        public java.util.List < String > getUuidList() {
            return this.uuidList;
        }

        public static final class Builder {
            private Integer clientErrorCount; 
            private java.util.List < String > clientErrorUuidList; 
            private String clientStatus; 
            private Integer healthClientCount; 
            private java.util.List < String > healthClientUuidList; 
            private Long id; 
            private String name; 
            private String policy; 
            private String policyRegionId; 
            private String policyVersion; 
            private java.util.List < String > remarkedUuidList; 
            private String serverType; 
            private Integer serviceErrorCount; 
            private java.util.List < String > serviceErrorUuidList; 
            private String status; 
            private String upgradeStatus; 
            private java.util.List < String > uuidList; 

            /**
             * The number of the servers on which the anti-ransomware agent is in an abnormal state.
             */
            public Builder clientErrorCount(Integer clientErrorCount) {
                this.clientErrorCount = clientErrorCount;
                return this;
            }

            /**
             * The UUIDs of the servers on which the anti-ransomware agent is in an **abnormal** state.
             */
            public Builder clientErrorUuidList(java.util.List < String > clientErrorUuidList) {
                this.clientErrorUuidList = clientErrorUuidList;
                return this;
            }

            /**
             * The status of the anti-ransomware agent. Valid values:
             * <p>
             * 
             * *   **running**: normal
             * *   **exception**: abnormal
             */
            public Builder clientStatus(String clientStatus) {
                this.clientStatus = clientStatus;
                return this;
            }

            /**
             * The number of the servers on which the anti-ransomware agent is in a normal state.
             */
            public Builder healthClientCount(Integer healthClientCount) {
                this.healthClientCount = healthClientCount;
                return this;
            }

            /**
             * The UUIDs of the servers on which the anti-ransomware agent is in a **normal** state.
             */
            public Builder healthClientUuidList(java.util.List < String > healthClientUuidList) {
                this.healthClientUuidList = healthClientUuidList;
                return this;
            }

            /**
             * The ID of the anti-ransomware policy.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the anti-ransomware policy.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The configurations of the anti-ransomware policy. The value of this parameter is in the JSON format and contains the following fields:
             * <p>
             * 
             * *   **IsDefault**: the type of the anti-ransomware policy. Valid values:
             * 
             *     *   **1**: recommended policy
             *     *   **0**: custom policy
             * 
             * *   **Include**: the format of the files that are protected. If the value of this field is \[], all formats of files are protected.
             * 
             * *   **Source**: the directory that is protected. If the value of this field is \[], all directories are protected.
             * 
             * *   **ExcludeSystemPath**: indicates whether a specified directory is excluded from the anti-ransomware policy. If the value of this field is **true**, the directory is excluded. If this field is left empty, no directories are excluded.
             * 
             * *   **Exclude**: the directory that is excluded from the anti-ransomware policy. If no directory is specified, the value of this field is \[].
             * 
             * *   **Schedule**: the start time and interval of a data backup task. A start time that begins during off-peak hours but does not start on the hour is recommended. Examples:
             * 
             *     *   If the value of this field is I|1583216092|P21D, the data backup task starts from 2020-03-03 14:14:52, and the task is run at an interval of three weeks.
             *     *   If the value of this field is I|1583216092|PT24H, the data backup task starts from 2020-03-03 14:14:52, and the task is run at an interval of 24 hours.
             * 
             * *   **Retention**: the period during which backup data is retained. Unit: days. If the value of this field is 7, backup data is retained for a week. If the value of this field is 365, backup data is retained for a year. If the value of this field is -1, backup data is permanently retained.
             * 
             * *   **SpeedLimiter**: the limit on the network bandwidth for data backup tasks. If the value of this field is 0:24:30720, the maximum bandwidth for a data backup task is 30 MB/s from 00:00 to 24:00.
             * 
             * *   **UseVss**: indicates whether the VSS feature is enabled. The feature is available only for Windows servers. Valid values:
             * 
             *     *   **true**: yes
             *     *   **false**: no
             * 
             * >  The VSS feature is available only if you create the anti-ransomware policy for Windows servers. After you enable the feature, the number of backup failures due to running processes is significantly reduced. We recommend that you enable the VSS feature. After you enable the feature, the data of disks that are in the exFAT and FAT32 formats cannot be backed up.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * The ID of the region that you specified for data backup when you installed the anti-ransomware agent for the server not deployed on Alibaba Cloud.
             */
            public Builder policyRegionId(String policyRegionId) {
                this.policyRegionId = policyRegionId;
                return this;
            }

            /**
             * The version of the anti-ransomware policy. Valid values:
             * <p>
             * 
             * *   1.0.0
             * *   2.0.0
             */
            public Builder policyVersion(String policyVersion) {
                this.policyVersion = policyVersion;
                return this;
            }

            /**
             * The UUIDs that are returned based on the value of the MachineRemark request parameter.
             */
            public Builder remarkedUuidList(java.util.List < String > remarkedUuidList) {
                this.remarkedUuidList = remarkedUuidList;
                return this;
            }

            /**
             * The type of the server. Valid values:
             * <p>
             * 
             * *   **OUT_CLOUD**: server not deployed on Alibaba Cloud
             * *   **ALIYUN**: Elastic Compute Service (ECS) instance
             * *   **TRIPARTITE**: simple application server
             */
            public Builder serverType(String serverType) {
                this.serverType = serverType;
                return this;
            }

            /**
             * The number of servers on which data backup is exceptional.
             */
            public Builder serviceErrorCount(Integer serviceErrorCount) {
                this.serviceErrorCount = serviceErrorCount;
                return this;
            }

            /**
             * The UUIDs of the servers on which data backup is exceptional.
             */
            public Builder serviceErrorUuidList(java.util.List < String > serviceErrorUuidList) {
                this.serviceErrorUuidList = serviceErrorUuidList;
                return this;
            }

            /**
             * The status of the anti-ransomware policy. Valid values:
             * <p>
             * 
             * *   **enabled**: The anti-ransomware policy is manually enabled.
             * *   **disabled**: The anti-ransomware policy is manually disabled. After an anti-ransomware policy is disabled, the data backup task that is running based on the policy stops.
             * *   **closed**: The anti-ransomware policy automatically stops because the anti-ransomware capacity is insufficient.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The upgrade status of the anti-ransomware policy. Valid values:
             * <p>
             * 
             * *   **NotUpgraded**
             * *   **Upgrading**
             * *   **UpgradeFailed**
             * *   **UpgradeSuccess**
             */
            public Builder upgradeStatus(String upgradeStatus) {
                this.upgradeStatus = upgradeStatus;
                return this;
            }

            /**
             * The UUIDs of the servers to which the anti-ransomware policy is applied.
             */
            public Builder uuidList(java.util.List < String > uuidList) {
                this.uuidList = uuidList;
                return this;
            }

            public Policies build() {
                return new Policies(this);
            } 

        } 

    }
}
