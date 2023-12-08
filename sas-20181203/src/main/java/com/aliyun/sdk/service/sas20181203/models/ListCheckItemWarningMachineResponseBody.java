// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCheckItemWarningMachineResponseBody} extends {@link TeaModel}
 *
 * <p>ListCheckItemWarningMachineResponseBody</p>
 */
public class ListCheckItemWarningMachineResponseBody extends TeaModel {
    @NameInMap("List")
    private java.util.List < List> list;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
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
    public java.util.List < List> getList() {
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
        private java.util.List < List> list; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * The servers on which the alerts are generated.
         */
        public Builder list(java.util.List < List> list) {
            this.list = list;
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

        public ListCheckItemWarningMachineResponseBody build() {
            return new ListCheckItemWarningMachineResponseBody(this);
        } 

    } 

    public static class FixList extends TeaModel {
        @NameInMap("RiskId")
        private Long riskId;

        @NameInMap("RiskName")
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
             * The baseline ID.
             */
            public Builder riskId(Long riskId) {
                this.riskId = riskId;
                return this;
            }

            /**
             * The name of the baseline.
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
    public static class WarningRiskList extends TeaModel {
        @NameInMap("RiskId")
        private Long riskId;

        @NameInMap("RiskName")
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
             * The baseline ID.
             */
            public Builder riskId(Long riskId) {
                this.riskId = riskId;
                return this;
            }

            /**
             * The name of the baseline.
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
    public static class List extends TeaModel {
        @NameInMap("AuthVersion")
        private Integer authVersion;

        @NameInMap("Bind")
        private Boolean bind;

        @NameInMap("ContainerId")
        private String containerId;

        @NameInMap("ContainerName")
        private String containerName;

        @NameInMap("FixList")
        private java.util.List < FixList> fixList;

        @NameInMap("FixStatus")
        private Integer fixStatus;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("IntranetIp")
        private String intranetIp;

        @NameInMap("LastHandleTime")
        private Long lastHandleTime;

        @NameInMap("LastScanTime")
        private Long lastScanTime;

        @NameInMap("PortOpen")
        private Boolean portOpen;

        @NameInMap("Prompt")
        private String prompt;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TargetId")
        private String targetId;

        @NameInMap("TargetName")
        private String targetName;

        @NameInMap("TargetType")
        private String targetType;

        @NameInMap("Uuid")
        private String uuid;

        @NameInMap("WarningRiskList")
        private java.util.List < WarningRiskList> warningRiskList;

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
        public java.util.List < FixList> getFixList() {
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
        public java.util.List < WarningRiskList> getWarningRiskList() {
            return this.warningRiskList;
        }

        public static final class Builder {
            private Integer authVersion; 
            private Boolean bind; 
            private String containerId; 
            private String containerName; 
            private java.util.List < FixList> fixList; 
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
            private java.util.List < WarningRiskList> warningRiskList; 

            /**
             * The edition of Security Center that is authorized to protect the asset. Valid values:
             * <p>
             * 
             * *   **1**: Basic edition
             * *   **6**: Anti-virus edition
             * *   **5**: Advanced edition
             * *   **3**: Enterprise edition
             * *   **7**: Ultimate edition
             * *   **10**: Value-added Plan edition
             */
            public Builder authVersion(Integer authVersion) {
                this.authVersion = authVersion;
                return this;
            }

            /**
             * Indicates whether Security Center is authorized to protect the asset. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder bind(Boolean bind) {
                this.bind = bind;
                return this;
            }

            /**
             * The container ID.
             */
            public Builder containerId(String containerId) {
                this.containerId = containerId;
                return this;
            }

            /**
             * The name of the container.
             */
            public Builder containerName(String containerName) {
                this.containerName = containerName;
                return this;
            }

            /**
             * The details of the baselines for which the risk item can be fixed.
             */
            public Builder fixList(java.util.List < FixList> fixList) {
                this.fixList = fixList;
                return this;
            }

            /**
             * FixStatus.
             */
            public Builder fixStatus(Integer fixStatus) {
                this.fixStatus = fixStatus;
                return this;
            }

            /**
             * The instance ID of the server.
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
             * The public IP address of the affected asset.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * The private IP address of the affected asset.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * LastHandleTime.
             */
            public Builder lastHandleTime(Long lastHandleTime) {
                this.lastHandleTime = lastHandleTime;
                return this;
            }

            /**
             * The timestamp generated when the last scan was performed. Unit: milliseconds.
             */
            public Builder lastScanTime(Long lastScanTime) {
                this.lastScanTime = lastScanTime;
                return this;
            }

            /**
             * Indicates whether a port on the server is accessible over the Internet. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder portOpen(Boolean portOpen) {
                this.portOpen = portOpen;
                return this;
            }

            /**
             * The prompt for the risk item.
             */
            public Builder prompt(String prompt) {
                this.prompt = prompt;
                return this;
            }

            /**
             * The region ID of the asset.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The status of the check item. Valid values:
             * <p>
             * 
             * *   1: failed
             * *   2: verifying
             * *   3: passed
             * *   6: ignored
             * *   7: fixing
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the asset that is scanned.
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * The name of the asset that is scanned.
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * The type of the asset. Valid values:
             * <p>
             * 
             * *   **ECS_SNAPSHOT**
             * *   **ECS_IMAGE**
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * The UUID of the server.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * The information about the baselines on which the risk item is detected.
             */
            public Builder warningRiskList(java.util.List < WarningRiskList> warningRiskList) {
                this.warningRiskList = warningRiskList;
                return this;
            }

            public List build() {
                return new List(this);
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
             * The number of affected assets returned on the current page.
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
             * The total number of affected assets.
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
