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
 * {@link DescribeBackupPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupPoliciesResponseBody</p>
 */
public class DescribeBackupPoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("Policies")
    private java.util.List<Policies> policies;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Policies> getPolicies() {
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
        private java.util.List<Policies> policies; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeBackupPoliciesResponseBody model) {
            this.pageInfo = model.pageInfo;
            this.policies = model.policies;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The details of the mitigation policies.</p>
         */
        public Builder policies(java.util.List<Policies> policies) {
            this.policies = policies;
            return this;
        }

        /**
         * <p>The ID of the request. The ID is a unique identifier that Alibaba Cloud generates for the request and can be used to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>BE120DAB-F4E7-4C53-ADC3-A97578ABF384</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackupPoliciesResponseBody build() {
            return new DescribeBackupPoliciesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBackupPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupPoliciesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.count = model.count;
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The number of entries on the current page in a paged query.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the current page in the returned data.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of backup policies per page in a paged query. Default value: 10, which indicates that each page contains 10 backup policies.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of backup policies in the returned data.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
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
     * {@link DescribeBackupPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupPoliciesResponseBody</p>
     */
    public static class Policies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientErrorCount")
        private Integer clientErrorCount;

        @com.aliyun.core.annotation.NameInMap("ClientErrorUuidList")
        private java.util.List<String> clientErrorUuidList;

        @com.aliyun.core.annotation.NameInMap("ClientStatus")
        private String clientStatus;

        @com.aliyun.core.annotation.NameInMap("HealthClientCount")
        private Integer healthClientCount;

        @com.aliyun.core.annotation.NameInMap("HealthClientUuidList")
        private java.util.List<String> healthClientUuidList;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LastStatusSyncTime")
        private Long lastStatusSyncTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("PolicyRegionId")
        private String policyRegionId;

        @com.aliyun.core.annotation.NameInMap("PolicyVersion")
        private String policyVersion;

        @com.aliyun.core.annotation.NameInMap("PreStatus")
        private String preStatus;

        @com.aliyun.core.annotation.NameInMap("RemarkedUuidList")
        private java.util.List<String> remarkedUuidList;

        @com.aliyun.core.annotation.NameInMap("SelectType")
        private String selectType;

        @com.aliyun.core.annotation.NameInMap("ServerType")
        private String serverType;

        @com.aliyun.core.annotation.NameInMap("ServiceErrorCount")
        private Integer serviceErrorCount;

        @com.aliyun.core.annotation.NameInMap("ServiceErrorUuidList")
        private java.util.List<String> serviceErrorUuidList;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpgradeStatus")
        private String upgradeStatus;

        @com.aliyun.core.annotation.NameInMap("UuidList")
        private java.util.List<String> uuidList;

        private Policies(Builder builder) {
            this.clientErrorCount = builder.clientErrorCount;
            this.clientErrorUuidList = builder.clientErrorUuidList;
            this.clientStatus = builder.clientStatus;
            this.healthClientCount = builder.healthClientCount;
            this.healthClientUuidList = builder.healthClientUuidList;
            this.id = builder.id;
            this.lastStatusSyncTime = builder.lastStatusSyncTime;
            this.name = builder.name;
            this.policy = builder.policy;
            this.policyRegionId = builder.policyRegionId;
            this.policyVersion = builder.policyVersion;
            this.preStatus = builder.preStatus;
            this.remarkedUuidList = builder.remarkedUuidList;
            this.selectType = builder.selectType;
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
        public java.util.List<String> getClientErrorUuidList() {
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
        public java.util.List<String> getHealthClientUuidList() {
            return this.healthClientUuidList;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return lastStatusSyncTime
         */
        public Long getLastStatusSyncTime() {
            return this.lastStatusSyncTime;
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
         * @return preStatus
         */
        public String getPreStatus() {
            return this.preStatus;
        }

        /**
         * @return remarkedUuidList
         */
        public java.util.List<String> getRemarkedUuidList() {
            return this.remarkedUuidList;
        }

        /**
         * @return selectType
         */
        public String getSelectType() {
            return this.selectType;
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
        public java.util.List<String> getServiceErrorUuidList() {
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
        public java.util.List<String> getUuidList() {
            return this.uuidList;
        }

        public static final class Builder {
            private Integer clientErrorCount; 
            private java.util.List<String> clientErrorUuidList; 
            private String clientStatus; 
            private Integer healthClientCount; 
            private java.util.List<String> healthClientUuidList; 
            private Long id; 
            private Long lastStatusSyncTime; 
            private String name; 
            private String policy; 
            private String policyRegionId; 
            private String policyVersion; 
            private String preStatus; 
            private java.util.List<String> remarkedUuidList; 
            private String selectType; 
            private String serverType; 
            private Integer serviceErrorCount; 
            private java.util.List<String> serviceErrorUuidList; 
            private String status; 
            private String upgradeStatus; 
            private java.util.List<String> uuidList; 

            private Builder() {
            } 

            private Builder(Policies model) {
                this.clientErrorCount = model.clientErrorCount;
                this.clientErrorUuidList = model.clientErrorUuidList;
                this.clientStatus = model.clientStatus;
                this.healthClientCount = model.healthClientCount;
                this.healthClientUuidList = model.healthClientUuidList;
                this.id = model.id;
                this.lastStatusSyncTime = model.lastStatusSyncTime;
                this.name = model.name;
                this.policy = model.policy;
                this.policyRegionId = model.policyRegionId;
                this.policyVersion = model.policyVersion;
                this.preStatus = model.preStatus;
                this.remarkedUuidList = model.remarkedUuidList;
                this.selectType = model.selectType;
                this.serverType = model.serverType;
                this.serviceErrorCount = model.serviceErrorCount;
                this.serviceErrorUuidList = model.serviceErrorUuidList;
                this.status = model.status;
                this.upgradeStatus = model.upgradeStatus;
                this.uuidList = model.uuidList;
            } 

            /**
             * <p>The number of errors reported by the anti-ransomware client.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder clientErrorCount(Integer clientErrorCount) {
                this.clientErrorCount = clientErrorCount;
                return this;
            }

            /**
             * <p>The list of UUIDs of clients in the <strong>abnormal</strong> state.</p>
             */
            public Builder clientErrorUuidList(java.util.List<String> clientErrorUuidList) {
                this.clientErrorUuidList = clientErrorUuidList;
                return this;
            }

            /**
             * <p>The status of the anti-ransomware client. Valid values:</p>
             * <ul>
             * <li><p><strong>running</strong>: Normal.</p>
             * </li>
             * <li><p><strong>exception</strong>: Abnormal.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder clientStatus(String clientStatus) {
                this.clientStatus = clientStatus;
                return this;
            }

            /**
             * <p>The number of clients in the Normal state.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder healthClientCount(Integer healthClientCount) {
                this.healthClientCount = healthClientCount;
                return this;
            }

            /**
             * <p>The list of UUIDs of clients in the <strong>healthy</strong> state.</p>
             */
            public Builder healthClientUuidList(java.util.List<String> healthClientUuidList) {
                this.healthClientUuidList = healthClientUuidList;
                return this;
            }

            /**
             * <p>The ID of the anti-ransomware mitigation policy.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The most recent time when the anti-ransomware mitigation policy status was updated, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1719488535027</p>
             */
            public Builder lastStatusSyncTime(Long lastStatusSyncTime) {
                this.lastStatusSyncTime = lastStatusSyncTime;
                return this;
            }

            /**
             * <p>The name of the anti-ransomware mitigation policy.</p>
             * 
             * <strong>example:</strong>
             * <p>SecurityStrategy-20200303</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The content of the anti-ransomware mitigation policy. This parameter is in JSON format. The following fields are included:</p>
             * <ul>
             * <li><strong>IsDefault</strong>: The type of the mitigation policy. Valid values:<ul>
             * <li><strong>1</strong>: recommended policy</li>
             * <li><strong>0</strong>: custom policy</li>
             * </ul>
             * </li>
             * <li><strong>Include</strong>: The file types to protect. If all file types are protected, this parameter is set to [].</li>
             * <li><strong>Source</strong>: The server folders to protect. If all folders need to be protected, this parameter is set to [].</li>
             * <li><strong>ExcludeSystemPath</strong>: Specifies whether to exclude specified folders. To exclude folders, set this parameter to <strong>true</strong>. If you do not want to exclude folders, you do not need to set this parameter.</li>
             * <li><strong>Exclude</strong>: The specified protection folder addresses. If no specific protection folder address is set, this parameter is set to [].</li>
             * <li><strong>Schedule</strong>: The execution time and interval of the data backup node. Specify a non-peak hour that is not on the hour. Examples:<ul>
             * <li>Example 1: I|1583216092|P21D indicates that data backup starts at 2020-03-03 14:14:52, and the backup policy executes at an interval of 3 weeks.</li>
             * <li>Example 2: I|1583216092|PT24H indicates that data backup starts at 2020-03-03 14:14:52, and the backup policy executes at an interval of 24 hours.</li>
             * </ul>
             * </li>
             * <li><strong>Retention</strong>: The retention period of backup data, in days. 7 indicates 1 week, 365 indicates 1 year, and -1 indicates permanent retention.</li>
             * <li><strong>SpeedLimiter</strong>: The backup network bandwidth throttling. For example, 0:24:30720 indicates that the backup network bandwidth throttling is 30 MB/s from 00:00 to 24:00.</li>
             * <li><strong>UseVss</strong>: Specifies whether to enable the VSS (Windows) feature. Valid values:<ul>
             * <li><strong>true</strong>: enabled</li>
             * <li><strong>false</strong>: not enabled</li>
             * </ul>
             * </li>
             * </ul>
             * <blockquote>
             * <p>The VSS (Windows) feature is available only for Windows systems. After this feature is enabled, it effectively reduces the issue of individual file backup failures caused by process occupation. Enable this feature. After this feature is enabled, file backup for exFAT and FAT32 disk formats is not supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Exclude&quot;:[&quot;/bin/&quot;,&quot;/usr/bin/&quot;,&quot;/sbin/&quot;,&quot;/boot/&quot;,&quot;/proc/&quot;,&quot;/sys/&quot;,&quot;/srv/&quot;,&quot;/lib/&quot;,&quot;/selinux/&quot;,&quot;/usr/sbin/&quot;,&quot;/run/&quot;,&quot;/lib32/&quot;,&quot;/lib64/&quot;,&quot;/lost+found/&quot;,&quot;/var/lib/kubelet/&quot;,&quot;/var/lib/ntp/proc&quot;,&quot;/var/lib/container&quot;,&quot;Windows\\&quot;,&quot;Python27\\&quot;,&quot;Program Files (x86)\\&quot;,&quot;Program Files\\&quot;,&quot;Boot\\&quot;,&quot;$RECYCLE.BIN&quot;,&quot;System Volume Information\\&quot;,&quot;Users\\Administrator\\NTUSER.DAT*&quot;,&quot;ProgramData\\&quot;,&quot;pagefile.sys&quot;,&quot;Users\\Default\\NTUSER.DAT*&quot;,&quot;Users\\Administrator\\ntuser.*&quot;],&quot;ExcludeSystemPath&quot;:true,&quot;Include&quot;:[],&quot;IsDefault&quot;:1,&quot;Retention&quot;:7,&quot;Schedule&quot;:&quot;I|1630689360|PT24H&quot;,&quot;Source&quot;:[],&quot;SpeedLimiter&quot;:&quot;&quot;,&quot;UseVss&quot;:true}</p>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>The region ID of the backup service selected when the anti-ransomware client is installed on a non-Alibaba Cloud server.</p>
             * 
             * <strong>example:</strong>
             * <p>ch-hangzhou</p>
             */
            public Builder policyRegionId(String policyRegionId) {
                this.policyRegionId = policyRegionId;
                return this;
            }

            /**
             * <p>The version of the mitigation policy. Valid values:</p>
             * <ul>
             * <li>1.0.0.</li>
             * <li>2.0.0.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2.0.0</p>
             */
            public Builder policyVersion(String policyVersion) {
                this.policyVersion = policyVersion;
                return this;
            }

            /**
             * <p>The previous status of the anti-ransomware mitigation policy.</p>
             * <ul>
             * <li><p><strong>enabled</strong>: The policy was manually enabled.</p>
             * </li>
             * <li><p><strong>disabled</strong>: The policy was manually disabled. After the policy is disabled, running backup nodes are stopped.</p>
             * </li>
             * <li><p><strong>closed</strong>: The anti-ransomware capacity was exceeded, and the system disabled the policy.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder preStatus(String preStatus) {
                this.preStatus = preStatus;
                return this;
            }

            /**
             * <p>The list of UUIDs of servers returned after the search by the MachineRemark request parameter.</p>
             */
            public Builder remarkedUuidList(java.util.List<String> remarkedUuidList) {
                this.remarkedUuidList = remarkedUuidList;
                return this;
            }

            /**
             * <p>The method used to select covered assets. Valid values:</p>
             * <ul>
             * <li><strong>ALL_MACHINE</strong>: All assets.</li>
             * </ul>
             * <blockquote>
             * <p>If the policy covers <strong>all assets</strong>, this property value is <strong>ALL_MACHINE</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ALL_MACHINE</p>
             */
            public Builder selectType(String selectType) {
                this.selectType = selectType;
                return this;
            }

            /**
             * <p>The server type. Valid values:</p>
             * <ul>
             * <li><strong>OUT_CLOUD</strong>: Non-Alibaba Cloud server.</li>
             * <li><strong>ALIYUN</strong>: Alibaba Cloud server.</li>
             * <li><strong>TRIPARTITE</strong>: Lightweight application server.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OUT_CLOUD</p>
             */
            public Builder serverType(String serverType) {
                this.serverType = serverType;
                return this;
            }

            /**
             * <p>The number of servers with data backup exceptions.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder serviceErrorCount(Integer serviceErrorCount) {
                this.serviceErrorCount = serviceErrorCount;
                return this;
            }

            /**
             * <p>The list of UUIDs of servers with data backup exceptions.</p>
             */
            public Builder serviceErrorUuidList(java.util.List<String> serviceErrorUuidList) {
                this.serviceErrorUuidList = serviceErrorUuidList;
                return this;
            }

            /**
             * <p>The status of the anti-ransomware mitigation policy.</p>
             * <ul>
             * <li><p><strong>enabled</strong>: The policy is manually enabled.</p>
             * </li>
             * <li><p><strong>disabled</strong>: The policy is manually disabled. After the policy is disabled, running backup nodes are stopped.</p>
             * </li>
             * <li><p><strong>closed</strong>: The anti-ransomware capacity is exceeded, and the system disables the policy.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The upgrade status of the policy. Valid values:</p>
             * <ul>
             * <li><strong>NotUpgraded</strong>: Not upgraded.</li>
             * <li><strong>Upgrading</strong>: Upgrading.</li>
             * <li><strong>UpgradeFailed</strong>: Upgrade failed.</li>
             * <li><strong>UpgradeSuccess</strong>: Upgrade succeeded.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Upgrading</p>
             */
            public Builder upgradeStatus(String upgradeStatus) {
                this.upgradeStatus = upgradeStatus;
                return this;
            }

            /**
             * <p>The list of UUIDs of servers protected by the anti-ransomware mitigation policy.</p>
             */
            public Builder uuidList(java.util.List<String> uuidList) {
                this.uuidList = uuidList;
                return this;
            }

            public Policies build() {
                return new Policies(this);
            } 

        } 

    }
}
