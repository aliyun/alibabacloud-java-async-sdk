// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataLimitsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataLimitsResponseBody</p>
 */
public class DescribeDataLimitsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List < Items> items;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDataLimitsResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataLimitsResponseBody create() {
        return builder().build();
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
    public java.util.List < Items> getItems() {
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
        private java.util.List < Items> items; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The page number of the returned page.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * A list of data assets.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDataLimitsResponseBody build() {
            return new DescribeDataLimitsResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditStatus")
        private Integer auditStatus;

        @com.aliyun.core.annotation.NameInMap("AutoScan")
        private Integer autoScan;

        @com.aliyun.core.annotation.NameInMap("CheckStatus")
        private Integer checkStatus;

        @com.aliyun.core.annotation.NameInMap("CheckStatusName")
        private String checkStatusName;

        @com.aliyun.core.annotation.NameInMap("DatamaskStatus")
        private Integer datamaskStatus;

        @com.aliyun.core.annotation.NameInMap("DbVersion")
        private String dbVersion;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Integer enable;

        @com.aliyun.core.annotation.NameInMap("EngineType")
        private String engineType;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("EventStatus")
        private Integer eventStatus;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstanceDescription")
        private String instanceDescription;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LastFinishedTime")
        private Long lastFinishedTime;

        @com.aliyun.core.annotation.NameInMap("LocalName")
        private String localName;

        @com.aliyun.core.annotation.NameInMap("LogStoreDay")
        private Integer logStoreDay;

        @com.aliyun.core.annotation.NameInMap("MemberAccount")
        private Long memberAccount;

        @com.aliyun.core.annotation.NameInMap("NextStartTime")
        private Long nextStartTime;

        @com.aliyun.core.annotation.NameInMap("OcrStatus")
        private Integer ocrStatus;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private String parentId;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("ProcessStatus")
        private Integer processStatus;

        @com.aliyun.core.annotation.NameInMap("ProcessTotalCount")
        private Integer processTotalCount;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private Long resourceType;

        @com.aliyun.core.annotation.NameInMap("ResourceTypeCode")
        private String resourceTypeCode;

        @com.aliyun.core.annotation.NameInMap("SamplingSize")
        private Integer samplingSize;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupIdList")
        private java.util.List < String > securityGroupIdList;

        @com.aliyun.core.annotation.NameInMap("SupportAudit")
        private Boolean supportAudit;

        @com.aliyun.core.annotation.NameInMap("SupportDatamask")
        private Boolean supportDatamask;

        @com.aliyun.core.annotation.NameInMap("SupportEvent")
        private Boolean supportEvent;

        @com.aliyun.core.annotation.NameInMap("SupportOcr")
        private Boolean supportOcr;

        @com.aliyun.core.annotation.NameInMap("SupportScan")
        private Boolean supportScan;

        @com.aliyun.core.annotation.NameInMap("TenantName")
        private String tenantName;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("VSwitchIdList")
        private java.util.List < String > vSwitchIdList;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private Items(Builder builder) {
            this.auditStatus = builder.auditStatus;
            this.autoScan = builder.autoScan;
            this.checkStatus = builder.checkStatus;
            this.checkStatusName = builder.checkStatusName;
            this.datamaskStatus = builder.datamaskStatus;
            this.dbVersion = builder.dbVersion;
            this.enable = builder.enable;
            this.engineType = builder.engineType;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.eventStatus = builder.eventStatus;
            this.gmtCreate = builder.gmtCreate;
            this.id = builder.id;
            this.instanceDescription = builder.instanceDescription;
            this.instanceId = builder.instanceId;
            this.lastFinishedTime = builder.lastFinishedTime;
            this.localName = builder.localName;
            this.logStoreDay = builder.logStoreDay;
            this.memberAccount = builder.memberAccount;
            this.nextStartTime = builder.nextStartTime;
            this.ocrStatus = builder.ocrStatus;
            this.parentId = builder.parentId;
            this.port = builder.port;
            this.processStatus = builder.processStatus;
            this.processTotalCount = builder.processTotalCount;
            this.regionId = builder.regionId;
            this.resourceType = builder.resourceType;
            this.resourceTypeCode = builder.resourceTypeCode;
            this.samplingSize = builder.samplingSize;
            this.securityGroupIdList = builder.securityGroupIdList;
            this.supportAudit = builder.supportAudit;
            this.supportDatamask = builder.supportDatamask;
            this.supportEvent = builder.supportEvent;
            this.supportOcr = builder.supportOcr;
            this.supportScan = builder.supportScan;
            this.tenantName = builder.tenantName;
            this.totalCount = builder.totalCount;
            this.userName = builder.userName;
            this.vSwitchIdList = builder.vSwitchIdList;
            this.vpcId = builder.vpcId;
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
         * @return autoScan
         */
        public Integer getAutoScan() {
            return this.autoScan;
        }

        /**
         * @return checkStatus
         */
        public Integer getCheckStatus() {
            return this.checkStatus;
        }

        /**
         * @return checkStatusName
         */
        public String getCheckStatusName() {
            return this.checkStatusName;
        }

        /**
         * @return datamaskStatus
         */
        public Integer getDatamaskStatus() {
            return this.datamaskStatus;
        }

        /**
         * @return dbVersion
         */
        public String getDbVersion() {
            return this.dbVersion;
        }

        /**
         * @return enable
         */
        public Integer getEnable() {
            return this.enable;
        }

        /**
         * @return engineType
         */
        public String getEngineType() {
            return this.engineType;
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
         * @return eventStatus
         */
        public Integer getEventStatus() {
            return this.eventStatus;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
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
         * @return lastFinishedTime
         */
        public Long getLastFinishedTime() {
            return this.lastFinishedTime;
        }

        /**
         * @return localName
         */
        public String getLocalName() {
            return this.localName;
        }

        /**
         * @return logStoreDay
         */
        public Integer getLogStoreDay() {
            return this.logStoreDay;
        }

        /**
         * @return memberAccount
         */
        public Long getMemberAccount() {
            return this.memberAccount;
        }

        /**
         * @return nextStartTime
         */
        public Long getNextStartTime() {
            return this.nextStartTime;
        }

        /**
         * @return ocrStatus
         */
        public Integer getOcrStatus() {
            return this.ocrStatus;
        }

        /**
         * @return parentId
         */
        public String getParentId() {
            return this.parentId;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return processStatus
         */
        public Integer getProcessStatus() {
            return this.processStatus;
        }

        /**
         * @return processTotalCount
         */
        public Integer getProcessTotalCount() {
            return this.processTotalCount;
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
        public Long getResourceType() {
            return this.resourceType;
        }

        /**
         * @return resourceTypeCode
         */
        public String getResourceTypeCode() {
            return this.resourceTypeCode;
        }

        /**
         * @return samplingSize
         */
        public Integer getSamplingSize() {
            return this.samplingSize;
        }

        /**
         * @return securityGroupIdList
         */
        public java.util.List < String > getSecurityGroupIdList() {
            return this.securityGroupIdList;
        }

        /**
         * @return supportAudit
         */
        public Boolean getSupportAudit() {
            return this.supportAudit;
        }

        /**
         * @return supportDatamask
         */
        public Boolean getSupportDatamask() {
            return this.supportDatamask;
        }

        /**
         * @return supportEvent
         */
        public Boolean getSupportEvent() {
            return this.supportEvent;
        }

        /**
         * @return supportOcr
         */
        public Boolean getSupportOcr() {
            return this.supportOcr;
        }

        /**
         * @return supportScan
         */
        public Boolean getSupportScan() {
            return this.supportScan;
        }

        /**
         * @return tenantName
         */
        public String getTenantName() {
            return this.tenantName;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return vSwitchIdList
         */
        public java.util.List < String > getVSwitchIdList() {
            return this.vSwitchIdList;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private Integer auditStatus; 
            private Integer autoScan; 
            private Integer checkStatus; 
            private String checkStatusName; 
            private Integer datamaskStatus; 
            private String dbVersion; 
            private Integer enable; 
            private String engineType; 
            private String errorCode; 
            private String errorMessage; 
            private Integer eventStatus; 
            private Long gmtCreate; 
            private Long id; 
            private String instanceDescription; 
            private String instanceId; 
            private Long lastFinishedTime; 
            private String localName; 
            private Integer logStoreDay; 
            private Long memberAccount; 
            private Long nextStartTime; 
            private Integer ocrStatus; 
            private String parentId; 
            private Integer port; 
            private Integer processStatus; 
            private Integer processTotalCount; 
            private String regionId; 
            private Long resourceType; 
            private String resourceTypeCode; 
            private Integer samplingSize; 
            private java.util.List < String > securityGroupIdList; 
            private Boolean supportAudit; 
            private Boolean supportDatamask; 
            private Boolean supportEvent; 
            private Boolean supportOcr; 
            private Boolean supportScan; 
            private String tenantName; 
            private Integer totalCount; 
            private String userName; 
            private java.util.List < String > vSwitchIdList; 
            private String vpcId; 

            /**
             * Indicates whether the security audit feature is enabled. Valid values:
             * <p>
             * 
             * *   **1**: yes
             * *   **0**: no
             */
            public Builder auditStatus(Integer auditStatus) {
                this.auditStatus = auditStatus;
                return this;
            }

            /**
             * Indicates whether the data asset can be automatically scanned. Valid values:
             * <p>
             * 
             * *   **0**: no
             * *   **1**: yes
             */
            public Builder autoScan(Integer autoScan) {
                this.autoScan = autoScan;
                return this;
            }

            /**
             * The data detection status. Valid values:
             * <p>
             * 
             * *   **0**: The data detection is ready.
             * *   **1**: The data detection is running.
             * *   **2**: The connectivity test is in progress.
             * *   **3**: The connectivity test is passed.
             * *   **4**: The connectivity test failed.
             */
            public Builder checkStatus(Integer checkStatus) {
                this.checkStatus = checkStatus;
                return this;
            }

            /**
             * The name of the data detection status.
             */
            public Builder checkStatusName(String checkStatusName) {
                this.checkStatusName = checkStatusName;
                return this;
            }

            /**
             * Indicates whether DSC has the data de-identification permissions on the data asset. Valid values:
             * <p>
             * 
             * *   **1**: yes
             * *   **0**: no
             */
            public Builder datamaskStatus(Integer datamaskStatus) {
                this.datamaskStatus = datamaskStatus;
                return this;
            }

            /**
             * The database engine version.
             */
            public Builder dbVersion(String dbVersion) {
                this.dbVersion = dbVersion;
                return this;
            }

            /**
             * Indicates whether DSC has the data identification permissions on the data asset. Valid values:
             * <p>
             * 
             * *   **1**: yes
             * *   **0**: no
             */
            public Builder enable(Integer enable) {
                this.enable = enable;
                return this;
            }

            /**
             * The type of the database engine. Valid values include **MySQL**, **SQLServer**, **Oracle**, **PostgreSQL**, and **MongoDB**.
             */
            public Builder engineType(String engineType) {
                this.engineType = engineType;
                return this;
            }

            /**
             * The error code.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The reason for the failure.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * Indicates whether the data leak prevention feature is enabled. Valid values:
             * <p>
             * 
             * *   **0**: no
             * *   **1**: yes (default)
             */
            public Builder eventStatus(Integer eventStatus) {
                this.eventStatus = eventStatus;
                return this;
            }

            /**
             * The time when the data asset was created. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The unique ID of the data asset.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The description of the instance.
             */
            public Builder instanceDescription(String instanceDescription) {
                this.instanceDescription = instanceDescription;
                return this;
            }

            /**
             * The ID of the data asset to which the table belongs.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The time when the last scan is performed.
             * <p>
             * 
             * *   The value is a UNIX timestamp.
             * *   Unit: milliseconds.
             */
            public Builder lastFinishedTime(Long lastFinishedTime) {
                this.lastFinishedTime = lastFinishedTime;
                return this;
            }

            /**
             * The region in which the data asset resides.
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * The retention period of raw logs. Unit: days.
             */
            public Builder logStoreDay(Integer logStoreDay) {
                this.logStoreDay = logStoreDay;
                return this;
            }

            /**
             * The ID of the member.
             */
            public Builder memberAccount(Long memberAccount) {
                this.memberAccount = memberAccount;
                return this;
            }

            /**
             * The next time when the data asset is scanned. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder nextStartTime(Long nextStartTime) {
                this.nextStartTime = nextStartTime;
                return this;
            }

            /**
             * Indicates whether the optical character recognition (OCR) feature is enabled. Valid values:
             * <p>
             * 
             * *   **0**: no
             * *   **1**: yes
             */
            public Builder ocrStatus(Integer ocrStatus) {
                this.ocrStatus = ocrStatus;
                return this;
            }

            /**
             * The parent ID of the data asset that you want to query. Valid values include **bucket, db, and project**.
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * The port number of the self-managed database.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The status of the data asset scan. Valid values:
             * <p>
             * 
             * *   **-1**: invalid
             * *   **0**: waiting
             * *   **1**: being scanned
             * *   **2**: suspended
             * *   **3**: completed
             */
            public Builder processStatus(Integer processStatus) {
                this.processStatus = processStatus;
                return this;
            }

            /**
             * The total number of data tables or files.
             */
            public Builder processTotalCount(Integer processTotalCount) {
                this.processTotalCount = processTotalCount;
                return this;
            }

            /**
             * The region in which the asset resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The type of the service to which the data asset belongs. Valid values:
             * <p>
             * 
             * *   **1**: MaxCompute
             * *   **2**: OSS
             * *   **3**: AnalyticDB for MySQL
             * *   **4**: Tablestore
             * *   **5**: ApsaraDB RDS
             * *   **6**: self-managed database
             */
            public Builder resourceType(Long resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The code of the service to which the data asset belongs. Valid values: **MaxCompute, OSS, ADS, OTS, and RDS**.
             */
            public Builder resourceTypeCode(String resourceTypeCode) {
                this.resourceTypeCode = resourceTypeCode;
                return this;
            }

            /**
             * The number of sensitive data samples. Valid values: **0**, **5**, and **10**. Unit: data entries.
             */
            public Builder samplingSize(Integer samplingSize) {
                this.samplingSize = samplingSize;
                return this;
            }

            /**
             * A list of the IDs of the security groups that are used by PrivateLink when you install the DSC agent.
             */
            public Builder securityGroupIdList(java.util.List < String > securityGroupIdList) {
                this.securityGroupIdList = securityGroupIdList;
                return this;
            }

            /**
             * Indicates whether the security audit feature is supported. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder supportAudit(Boolean supportAudit) {
                this.supportAudit = supportAudit;
                return this;
            }

            /**
             * Indicates whether the data de-identification feature is supported. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder supportDatamask(Boolean supportDatamask) {
                this.supportDatamask = supportDatamask;
                return this;
            }

            /**
             * Indicates whether anomalous event detection is supported. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder supportEvent(Boolean supportEvent) {
                this.supportEvent = supportEvent;
                return this;
            }

            /**
             * Indicates whether OCR is supported. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder supportOcr(Boolean supportOcr) {
                this.supportOcr = supportOcr;
                return this;
            }

            /**
             * Indicates whether the data asset scan feature is supported. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder supportScan(Boolean supportScan) {
                this.supportScan = supportScan;
                return this;
            }

            /**
             * The alias of the tenant.
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * The total number of fields in the table.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * The username that is used to access the data asset.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * A list of the IDs of the vSwitches that are used by PrivateLink when you install the DSC agent.
             */
            public Builder vSwitchIdList(java.util.List < String > vSwitchIdList) {
                this.vSwitchIdList = vSwitchIdList;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC) to which the data asset belongs.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
