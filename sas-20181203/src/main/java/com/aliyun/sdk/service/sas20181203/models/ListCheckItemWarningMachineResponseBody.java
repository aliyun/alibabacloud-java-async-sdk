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
 * {@link ListCheckItemWarningMachineResponseBody} extends {@link TeaModel}
 *
 * <p>ListCheckItemWarningMachineResponseBody</p>
 */
public class ListCheckItemWarningMachineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List<List> list;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListCheckItemWarningMachineResponseBody(Builder builder) {
        this.list = builder.list;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCheckItemWarningMachineResponseBody create() {
        return builder().build();
    }

    /**
     * @return list
     */
    public java.util.List<List> getList() {
        return this.list;
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
        private java.util.List<List> list; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * <p>The servers on which the alerts are generated.</p>
         */
        public Builder list(java.util.List<List> list) {
            this.list = list;
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
         * <p>22B5615F-700E-575A-A6D5-DC8D7741****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCheckItemWarningMachineResponseBody build() {
            return new ListCheckItemWarningMachineResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCheckItemWarningMachineResponseBody} extends {@link TeaModel}
     *
     * <p>ListCheckItemWarningMachineResponseBody</p>
     */
    public static class FixList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RiskId")
        private Long riskId;

        @com.aliyun.core.annotation.NameInMap("RiskName")
        private String riskName;

        private FixList(Builder builder) {
            this.riskId = builder.riskId;
            this.riskName = builder.riskName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FixList create() {
            return builder().build();
        }

        /**
         * @return riskId
         */
        public Long getRiskId() {
            return this.riskId;
        }

        /**
         * @return riskName
         */
        public String getRiskName() {
            return this.riskName;
        }

        public static final class Builder {
            private Long riskId; 
            private String riskName; 

            /**
             * <p>The ID of the baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>72</p>
             */
            public Builder riskId(Long riskId) {
                this.riskId = riskId;
                return this;
            }

            /**
             * <p>The name of the baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba Cloud Linux/Aliyun Linux 2 Baseline for China classified protection of cybersecurity-Level II</p>
             */
            public Builder riskName(String riskName) {
                this.riskName = riskName;
                return this;
            }

            public FixList build() {
                return new FixList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCheckItemWarningMachineResponseBody} extends {@link TeaModel}
     *
     * <p>ListCheckItemWarningMachineResponseBody</p>
     */
    public static class WarningRiskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RiskId")
        private Long riskId;

        @com.aliyun.core.annotation.NameInMap("RiskName")
        private String riskName;

        private WarningRiskList(Builder builder) {
            this.riskId = builder.riskId;
            this.riskName = builder.riskName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarningRiskList create() {
            return builder().build();
        }

        /**
         * @return riskId
         */
        public Long getRiskId() {
            return this.riskId;
        }

        /**
         * @return riskName
         */
        public String getRiskName() {
            return this.riskName;
        }

        public static final class Builder {
            private Long riskId; 
            private String riskName; 

            /**
             * <p>The ID of the baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>72</p>
             */
            public Builder riskId(Long riskId) {
                this.riskId = riskId;
                return this;
            }

            /**
             * <p>The name of the baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba Cloud Linux/Aliyun Linux 2 Baseline for China classified protection of cybersecurity-Level II</p>
             */
            public Builder riskName(String riskName) {
                this.riskName = riskName;
                return this;
            }

            public WarningRiskList build() {
                return new WarningRiskList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCheckItemWarningMachineResponseBody} extends {@link TeaModel}
     *
     * <p>ListCheckItemWarningMachineResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthVersion")
        private Integer authVersion;

        @com.aliyun.core.annotation.NameInMap("Bind")
        private Boolean bind;

        @com.aliyun.core.annotation.NameInMap("ContainerId")
        private String containerId;

        @com.aliyun.core.annotation.NameInMap("ContainerName")
        private String containerName;

        @com.aliyun.core.annotation.NameInMap("FixList")
        private java.util.List<FixList> fixList;

        @com.aliyun.core.annotation.NameInMap("FixStatus")
        private Integer fixStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("LastHandleTime")
        private Long lastHandleTime;

        @com.aliyun.core.annotation.NameInMap("LastScanTime")
        private Long lastScanTime;

        @com.aliyun.core.annotation.NameInMap("PortOpen")
        private Boolean portOpen;

        @com.aliyun.core.annotation.NameInMap("Prompt")
        private String prompt;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TargetId")
        private String targetId;

        @com.aliyun.core.annotation.NameInMap("TargetName")
        private String targetName;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        @com.aliyun.core.annotation.NameInMap("WarningRiskList")
        private java.util.List<WarningRiskList> warningRiskList;

        private List(Builder builder) {
            this.authVersion = builder.authVersion;
            this.bind = builder.bind;
            this.containerId = builder.containerId;
            this.containerName = builder.containerName;
            this.fixList = builder.fixList;
            this.fixStatus = builder.fixStatus;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.lastHandleTime = builder.lastHandleTime;
            this.lastScanTime = builder.lastScanTime;
            this.portOpen = builder.portOpen;
            this.prompt = builder.prompt;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.targetId = builder.targetId;
            this.targetName = builder.targetName;
            this.targetType = builder.targetType;
            this.uuid = builder.uuid;
            this.warningRiskList = builder.warningRiskList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return authVersion
         */
        public Integer getAuthVersion() {
            return this.authVersion;
        }

        /**
         * @return bind
         */
        public Boolean getBind() {
            return this.bind;
        }

        /**
         * @return containerId
         */
        public String getContainerId() {
            return this.containerId;
        }

        /**
         * @return containerName
         */
        public String getContainerName() {
            return this.containerName;
        }

        /**
         * @return fixList
         */
        public java.util.List<FixList> getFixList() {
            return this.fixList;
        }

        /**
         * @return fixStatus
         */
        public Integer getFixStatus() {
            return this.fixStatus;
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
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return lastHandleTime
         */
        public Long getLastHandleTime() {
            return this.lastHandleTime;
        }

        /**
         * @return lastScanTime
         */
        public Long getLastScanTime() {
            return this.lastScanTime;
        }

        /**
         * @return portOpen
         */
        public Boolean getPortOpen() {
            return this.portOpen;
        }

        /**
         * @return prompt
         */
        public String getPrompt() {
            return this.prompt;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return targetId
         */
        public String getTargetId() {
            return this.targetId;
        }

        /**
         * @return targetName
         */
        public String getTargetName() {
            return this.targetName;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        /**
         * @return warningRiskList
         */
        public java.util.List<WarningRiskList> getWarningRiskList() {
            return this.warningRiskList;
        }

        public static final class Builder {
            private Integer authVersion; 
            private Boolean bind; 
            private String containerId; 
            private String containerName; 
            private java.util.List<FixList> fixList; 
            private Integer fixStatus; 
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private Long lastHandleTime; 
            private Long lastScanTime; 
            private Boolean portOpen; 
            private String prompt; 
            private String regionId; 
            private Integer status; 
            private String targetId; 
            private String targetName; 
            private String targetType; 
            private String uuid; 
            private java.util.List<WarningRiskList> warningRiskList; 

            /**
             * <p>The edition of Security Center that is authorized to protect the asset. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Basic edition</li>
             * <li><strong>6</strong>: Anti-virus edition</li>
             * <li><strong>5</strong>: Advanced edition</li>
             * <li><strong>3</strong>: Enterprise edition</li>
             * <li><strong>7</strong>: Ultimate edition</li>
             * <li><strong>10</strong>: Value-added Plan edition</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder authVersion(Integer authVersion) {
                this.authVersion = authVersion;
                return this;
            }

            /**
             * <p>Indicates whether Security Center is authorized to protect the asset. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder bind(Boolean bind) {
                this.bind = bind;
                return this;
            }

            /**
             * <p>The ID of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>48a6d9a92435a13ad573372c3f3c63b7e04d106458141df9f9215570********</p>
             */
            public Builder containerId(String containerId) {
                this.containerId = containerId;
                return this;
            }

            /**
             * <p>The name of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>step-build-ui-build</p>
             */
            public Builder containerName(String containerName) {
                this.containerName = containerName;
                return this;
            }

            /**
             * <p>The details of the baselines for which the risk item can be fixed.</p>
             */
            public Builder fixList(java.util.List<FixList> fixList) {
                this.fixList = fixList;
                return this;
            }

            /**
             * <p>Whether the repair is supported. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Supported</li>
             * <li><strong>1</strong>: Not Supported</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder fixStatus(Integer fixStatus) {
                this.fixStatus = fixStatus;
                return this;
            }

            /**
             * <p>The instance ID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1a69mvjujbakxu****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>sql-test-0****</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address of the affected asset.</p>
             * 
             * <strong>example:</strong>
             * <p>8.210.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address of the affected asset.</p>
             * 
             * <strong>example:</strong>
             * <p>172.25.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The timestamp of the latest processing of the check item risk of the machine. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1694692471000</p>
             */
            public Builder lastHandleTime(Long lastHandleTime) {
                this.lastHandleTime = lastHandleTime;
                return this;
            }

            /**
             * <p>The timestamp generated when the last scan was performed. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1694692471000</p>
             */
            public Builder lastScanTime(Long lastScanTime) {
                this.lastScanTime = lastScanTime;
                return this;
            }

            /**
             * <p>Indicates whether a port on the server is accessible over the Internet. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder portOpen(Boolean portOpen) {
                this.portOpen = portOpen;
                return this;
            }

            /**
             * <p>The prompt for the risk item.</p>
             * 
             * <strong>example:</strong>
             * <p>There is a weak password (username/password): root/he*****34</p>
             */
            public Builder prompt(String prompt) {
                this.prompt = prompt;
                return this;
            }

            /**
             * <p>The region ID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The status of the check item. Valid values:</p>
             * <ul>
             * <li>1: failed</li>
             * <li>2: verifying</li>
             * <li>3: passed</li>
             * <li>6: ignored</li>
             * <li>7: fixing</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the asset that is scanned.</p>
             * 
             * <strong>example:</strong>
             * <p>30****</p>
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * <p>The name of the asset on which the malicious image sample is detected.</p>
             * 
             * <strong>example:</strong>
             * <p>jenkins****</p>
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * <p>The type of the asset. Valid values:</p>
             * <ul>
             * <li><strong>ECS_SNAPSHOT</strong></li>
             * <li><strong>ECS_IMAGE</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ECS_IMAGE</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * <p>The UUID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>49e25e0f-bb51-4a5a-a1b3-13a4ddaa****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * <p>The information about the baselines on which the risk item is detected.</p>
             */
            public Builder warningRiskList(java.util.List<WarningRiskList> warningRiskList) {
                this.warningRiskList = warningRiskList;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCheckItemWarningMachineResponseBody} extends {@link TeaModel}
     *
     * <p>ListCheckItemWarningMachineResponseBody</p>
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
             * <p>The number of affected assets returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
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
             * <p>The total number of affected assets.</p>
             * 
             * <strong>example:</strong>
             * <p>107</p>
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
