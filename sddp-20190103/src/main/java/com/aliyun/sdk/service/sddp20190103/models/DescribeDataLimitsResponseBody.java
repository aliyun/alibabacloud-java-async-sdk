// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataLimitsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataLimitsResponseBody</p>
 */
public class DescribeDataLimitsResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
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
        @NameInMap("AuditStatus")
        private Integer auditStatus;

        @NameInMap("AutoScan")
        private Integer autoScan;

        @NameInMap("CheckStatus")
        private Integer checkStatus;

        @NameInMap("CheckStatusName")
        private String checkStatusName;

        @NameInMap("DatamaskStatus")
        private Integer datamaskStatus;

        @NameInMap("DbVersion")
        private String dbVersion;

        @NameInMap("Enable")
        private Integer enable;

        @NameInMap("EngineType")
        private String engineType;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("EventStatus")
        private Integer eventStatus;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("Id")
        private Long id;

        @NameInMap("InstanceDescription")
        private String instanceDescription;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("LastFinishedTime")
        private Long lastFinishedTime;

        @NameInMap("LocalName")
        private String localName;

        @NameInMap("LogStoreDay")
        private Integer logStoreDay;

        @NameInMap("NextStartTime")
        private Long nextStartTime;

        @NameInMap("OcrStatus")
        private Integer ocrStatus;

        @NameInMap("ParentId")
        private String parentId;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("ProcessStatus")
        private Integer processStatus;

        @NameInMap("ProcessTotalCount")
        private Integer processTotalCount;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceType")
        private Long resourceType;

        @NameInMap("ResourceTypeCode")
        private String resourceTypeCode;

        @NameInMap("SamplingSize")
        private Integer samplingSize;

        @NameInMap("SupportAudit")
        private Boolean supportAudit;

        @NameInMap("SupportDatamask")
        private Boolean supportDatamask;

        @NameInMap("SupportEvent")
        private Boolean supportEvent;

        @NameInMap("SupportOcr")
        private Boolean supportOcr;

        @NameInMap("SupportScan")
        private Boolean supportScan;

        @NameInMap("TenantName")
        private String tenantName;

        @NameInMap("TotalCount")
        private Integer totalCount;

        @NameInMap("UserName")
        private String userName;

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
            this.supportAudit = builder.supportAudit;
            this.supportDatamask = builder.supportDatamask;
            this.supportEvent = builder.supportEvent;
            this.supportOcr = builder.supportOcr;
            this.supportScan = builder.supportScan;
            this.tenantName = builder.tenantName;
            this.totalCount = builder.totalCount;
            this.userName = builder.userName;
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
            private Boolean supportAudit; 
            private Boolean supportDatamask; 
            private Boolean supportEvent; 
            private Boolean supportOcr; 
            private Boolean supportScan; 
            private String tenantName; 
            private Integer totalCount; 
            private String userName; 

            /**
             * AuditStatus.
             */
            public Builder auditStatus(Integer auditStatus) {
                this.auditStatus = auditStatus;
                return this;
            }

            /**
             * AutoScan.
             */
            public Builder autoScan(Integer autoScan) {
                this.autoScan = autoScan;
                return this;
            }

            /**
             * CheckStatus.
             */
            public Builder checkStatus(Integer checkStatus) {
                this.checkStatus = checkStatus;
                return this;
            }

            /**
             * CheckStatusName.
             */
            public Builder checkStatusName(String checkStatusName) {
                this.checkStatusName = checkStatusName;
                return this;
            }

            /**
             * DatamaskStatus.
             */
            public Builder datamaskStatus(Integer datamaskStatus) {
                this.datamaskStatus = datamaskStatus;
                return this;
            }

            /**
             * DbVersion.
             */
            public Builder dbVersion(String dbVersion) {
                this.dbVersion = dbVersion;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Integer enable) {
                this.enable = enable;
                return this;
            }

            /**
             * EngineType.
             */
            public Builder engineType(String engineType) {
                this.engineType = engineType;
                return this;
            }

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * EventStatus.
             */
            public Builder eventStatus(Integer eventStatus) {
                this.eventStatus = eventStatus;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * InstanceDescription.
             */
            public Builder instanceDescription(String instanceDescription) {
                this.instanceDescription = instanceDescription;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * LastFinishedTime.
             */
            public Builder lastFinishedTime(Long lastFinishedTime) {
                this.lastFinishedTime = lastFinishedTime;
                return this;
            }

            /**
             * LocalName.
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * LogStoreDay.
             */
            public Builder logStoreDay(Integer logStoreDay) {
                this.logStoreDay = logStoreDay;
                return this;
            }

            /**
             * NextStartTime.
             */
            public Builder nextStartTime(Long nextStartTime) {
                this.nextStartTime = nextStartTime;
                return this;
            }

            /**
             * OcrStatus.
             */
            public Builder ocrStatus(Integer ocrStatus) {
                this.ocrStatus = ocrStatus;
                return this;
            }

            /**
             * ParentId.
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * ProcessStatus.
             */
            public Builder processStatus(Integer processStatus) {
                this.processStatus = processStatus;
                return this;
            }

            /**
             * ProcessTotalCount.
             */
            public Builder processTotalCount(Integer processTotalCount) {
                this.processTotalCount = processTotalCount;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(Long resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * ResourceTypeCode.
             */
            public Builder resourceTypeCode(String resourceTypeCode) {
                this.resourceTypeCode = resourceTypeCode;
                return this;
            }

            /**
             * SamplingSize.
             */
            public Builder samplingSize(Integer samplingSize) {
                this.samplingSize = samplingSize;
                return this;
            }

            /**
             * SupportAudit.
             */
            public Builder supportAudit(Boolean supportAudit) {
                this.supportAudit = supportAudit;
                return this;
            }

            /**
             * SupportDatamask.
             */
            public Builder supportDatamask(Boolean supportDatamask) {
                this.supportDatamask = supportDatamask;
                return this;
            }

            /**
             * SupportEvent.
             */
            public Builder supportEvent(Boolean supportEvent) {
                this.supportEvent = supportEvent;
                return this;
            }

            /**
             * SupportOcr.
             */
            public Builder supportOcr(Boolean supportOcr) {
                this.supportOcr = supportOcr;
                return this;
            }

            /**
             * SupportScan.
             */
            public Builder supportScan(Boolean supportScan) {
                this.supportScan = supportScan;
                return this;
            }

            /**
             * TenantName.
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
