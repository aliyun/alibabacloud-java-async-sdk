// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

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
 * {@link DescribeDataLimitsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataLimitsResponseBody</p>
 */
public class DescribeDataLimitsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

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
    public java.util.List<Items> getItems() {
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
        private java.util.List<Items> items; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

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
         * <p>The data assets.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>769FB3C1-F4C9-42DF-9B72-7077A8989***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDataLimitsResponseBody build() {
            return new DescribeDataLimitsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDataLimitsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataLimitsResponseBody</p>
     */
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

        @com.aliyun.core.annotation.NameInMap("LastStartTime")
        private Long lastStartTime;

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
        private java.util.List<String> securityGroupIdList;

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
        private java.util.List<String> vSwitchIdList;

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
            this.lastStartTime = builder.lastStartTime;
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
         * @return lastStartTime
         */
        public Long getLastStartTime() {
            return this.lastStartTime;
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
        public java.util.List<String> getSecurityGroupIdList() {
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
        public java.util.List<String> getVSwitchIdList() {
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
            private Long lastStartTime; 
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
            private java.util.List<String> securityGroupIdList; 
            private Boolean supportAudit; 
            private Boolean supportDatamask; 
            private Boolean supportEvent; 
            private Boolean supportOcr; 
            private Boolean supportScan; 
            private String tenantName; 
            private Integer totalCount; 
            private String userName; 
            private java.util.List<String> vSwitchIdList; 
            private String vpcId; 

            /**
             * <p>Indicates whether the security audit feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: yes</li>
             * <li><strong>0</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder auditStatus(Integer auditStatus) {
                this.auditStatus = auditStatus;
                return this;
            }

            /**
             * <p>Indicates whether the data asset can be automatically scanned. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: no</li>
             * <li><strong>1</strong>: yes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder autoScan(Integer autoScan) {
                this.autoScan = autoScan;
                return this;
            }

            /**
             * <p>The data detection status. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The data detection is ready.</li>
             * <li><strong>1</strong>: The data detection is running.</li>
             * <li><strong>2</strong>: The connectivity test is in progress.</li>
             * <li><strong>3</strong>: The connectivity test is passed.</li>
             * <li><strong>4</strong>: The connectivity test failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder checkStatus(Integer checkStatus) {
                this.checkStatus = checkStatus;
                return this;
            }

            /**
             * <p>The name of the data detection status.</p>
             * 
             * <strong>example:</strong>
             * <p>Connectivity test status</p>
             */
            public Builder checkStatusName(String checkStatusName) {
                this.checkStatusName = checkStatusName;
                return this;
            }

            /**
             * <p>Indicates whether DSC has the data de-identification permissions on the data asset. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: yes</li>
             * <li><strong>0</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder datamaskStatus(Integer datamaskStatus) {
                this.datamaskStatus = datamaskStatus;
                return this;
            }

            /**
             * <p>The database engine version.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0</p>
             */
            public Builder dbVersion(String dbVersion) {
                this.dbVersion = dbVersion;
                return this;
            }

            /**
             * <p>Indicates whether DSC has the data identification permissions on the data asset. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: yes</li>
             * <li><strong>0</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder enable(Integer enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The type of the database engine. Valid values include <strong>MySQL</strong>, <strong>SQLServer</strong>, <strong>Oracle</strong>, <strong>PostgreSQL</strong>, and <strong>MongoDB</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engineType(String engineType) {
                this.engineType = engineType;
                return this;
            }

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>connect_network_error</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The reason for the failure.</p>
             * 
             * <strong>example:</strong>
             * <p>The password is invalid.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Indicates whether the data leak prevention feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: no</li>
             * <li><strong>1</strong>: yes (default)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder eventStatus(Integer eventStatus) {
                this.eventStatus = eventStatus;
                return this;
            }

            /**
             * <p>The time when the data asset was created. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>145600000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The unique ID of the data asset.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The description of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder instanceDescription(String instanceDescription) {
                this.instanceDescription = instanceDescription;
                return this;
            }

            /**
             * <p>The ID of the data asset to which the table belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>12332</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The time when the last scan is performed.</p>
             * <ul>
             * <li>The value is a UNIX timestamp.</li>
             * <li>Unit: milliseconds.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>145600000</p>
             */
            public Builder lastFinishedTime(Long lastFinishedTime) {
                this.lastFinishedTime = lastFinishedTime;
                return this;
            }

            /**
             * <p>The last scan start time of data assets, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>145600000</p>
             */
            public Builder lastStartTime(Long lastStartTime) {
                this.lastStartTime = lastStartTime;
                return this;
            }

            /**
             * <p>The region in which the data asset resides.</p>
             * 
             * <strong>example:</strong>
             * <p>China (Hangzhou)</p>
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * <p>The retention period of raw logs. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder logStoreDay(Integer logStoreDay) {
                this.logStoreDay = logStoreDay;
                return this;
            }

            /**
             * <p>The ID of the member.</p>
             * 
             * <strong>example:</strong>
             * <p>**********8103</p>
             */
            public Builder memberAccount(Long memberAccount) {
                this.memberAccount = memberAccount;
                return this;
            }

            /**
             * <p>The next time when the data asset is scanned. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1676620236000</p>
             */
            public Builder nextStartTime(Long nextStartTime) {
                this.nextStartTime = nextStartTime;
                return this;
            }

            /**
             * <p>Indicates whether the optical character recognition (OCR) feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: no</li>
             * <li><strong>1</strong>: yes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ocrStatus(Integer ocrStatus) {
                this.ocrStatus = ocrStatus;
                return this;
            }

            /**
             * <p>The parent ID of the data asset that you want to query. Valid values include <strong>bucket, db, and project</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>project</p>
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * <p>The port number of the self-managed database.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The status of the data asset scan. Valid values:</p>
             * <ul>
             * <li><strong>-1</strong>: invalid</li>
             * <li><strong>0</strong>: waiting</li>
             * <li><strong>1</strong>: being scanned</li>
             * <li><strong>2</strong>: suspended</li>
             * <li><strong>3</strong>: completed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder processStatus(Integer processStatus) {
                this.processStatus = processStatus;
                return this;
            }

            /**
             * <p>The total number of data tables or files.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder processTotalCount(Integer processTotalCount) {
                this.processTotalCount = processTotalCount;
                return this;
            }

            /**
             * <p>The region in which the asset resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The type of the service to which the data asset belongs. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: MaxCompute</li>
             * <li><strong>2</strong>: OSS</li>
             * <li><strong>3</strong>: AnalyticDB for MySQL</li>
             * <li><strong>4</strong>: Tablestore</li>
             * <li><strong>5</strong>: ApsaraDB RDS</li>
             * <li><strong>6</strong>: self-managed database</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder resourceType(Long resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The code of the service to which the data asset belongs. Valid values: <strong>MaxCompute, OSS, ADS, OTS, and RDS</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder resourceTypeCode(String resourceTypeCode) {
                this.resourceTypeCode = resourceTypeCode;
                return this;
            }

            /**
             * <p>The number of sensitive data samples. Valid values: <strong>0</strong>, <strong>5</strong>, and <strong>10</strong>. Unit: data entries.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder samplingSize(Integer samplingSize) {
                this.samplingSize = samplingSize;
                return this;
            }

            /**
             * <p>A list of the IDs of the security groups that are used by PrivateLink when you install the DSC agent.</p>
             */
            public Builder securityGroupIdList(java.util.List<String> securityGroupIdList) {
                this.securityGroupIdList = securityGroupIdList;
                return this;
            }

            /**
             * <p>Indicates whether the security audit feature is supported. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder supportAudit(Boolean supportAudit) {
                this.supportAudit = supportAudit;
                return this;
            }

            /**
             * <p>Indicates whether the data de-identification feature is supported. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder supportDatamask(Boolean supportDatamask) {
                this.supportDatamask = supportDatamask;
                return this;
            }

            /**
             * <p>Indicates whether anomalous event detection is supported. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder supportEvent(Boolean supportEvent) {
                this.supportEvent = supportEvent;
                return this;
            }

            /**
             * <p>Indicates whether OCR is supported. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder supportOcr(Boolean supportOcr) {
                this.supportOcr = supportOcr;
                return this;
            }

            /**
             * <p>Indicates whether the data asset scan feature is supported. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder supportScan(Boolean supportScan) {
                this.supportScan = supportScan;
                return this;
            }

            /**
             * <p>The alias of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>insta_gram</p>
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * <p>The total number of fields in the table.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>The username that is used to access the data asset.</p>
             * 
             * <strong>example:</strong>
             * <p>tsts</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * <p>A list of the IDs of the vSwitches that are used by PrivateLink when you install the DSC agent.</p>
             */
            public Builder vSwitchIdList(java.util.List<String> vSwitchIdList) {
                this.vSwitchIdList = vSwitchIdList;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC) to which the data asset belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2zevcqke6hh09c41****</p>
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
