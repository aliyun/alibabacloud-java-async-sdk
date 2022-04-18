// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceSourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceSourcesResponseBody</p>
 */
public class DescribeInstanceSourcesResponseBody extends TeaModel {
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

    private DescribeInstanceSourcesResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceSourcesResponseBody create() {
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

        public DescribeInstanceSourcesResponseBody build() {
            return new DescribeInstanceSourcesResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("AuditStatus")
        private Integer auditStatus;

        @NameInMap("AutoScan")
        private Integer autoScan;

        @NameInMap("CanModifyUserName")
        private Boolean canModifyUserName;

        @NameInMap("CheckStatus")
        private Integer checkStatus;

        @NameInMap("DatamaskStatus")
        private Integer datamaskStatus;

        @NameInMap("DbName")
        private String dbName;

        @NameInMap("Enable")
        private Integer enable;

        @NameInMap("EngineType")
        private String engineType;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("Id")
        private Long id;

        @NameInMap("InstanceDescription")
        private String instanceDescription;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceSize")
        private Long instanceSize;

        @NameInMap("LastModifyTime")
        private Long lastModifyTime;

        @NameInMap("LastModifyUserId")
        private String lastModifyUserId;

        @NameInMap("LogStoreDay")
        private Integer logStoreDay;

        @NameInMap("PasswordStatus")
        private Integer passwordStatus;

        @NameInMap("ProductId")
        private Long productId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RegionName")
        private String regionName;

        @NameInMap("SamplingSize")
        private Integer samplingSize;

        @NameInMap("TenantId")
        private String tenantId;

        @NameInMap("TenantName")
        private String tenantName;

        @NameInMap("UserName")
        private String userName;

        private Items(Builder builder) {
            this.auditStatus = builder.auditStatus;
            this.autoScan = builder.autoScan;
            this.canModifyUserName = builder.canModifyUserName;
            this.checkStatus = builder.checkStatus;
            this.datamaskStatus = builder.datamaskStatus;
            this.dbName = builder.dbName;
            this.enable = builder.enable;
            this.engineType = builder.engineType;
            this.errorMessage = builder.errorMessage;
            this.gmtCreate = builder.gmtCreate;
            this.id = builder.id;
            this.instanceDescription = builder.instanceDescription;
            this.instanceId = builder.instanceId;
            this.instanceSize = builder.instanceSize;
            this.lastModifyTime = builder.lastModifyTime;
            this.lastModifyUserId = builder.lastModifyUserId;
            this.logStoreDay = builder.logStoreDay;
            this.passwordStatus = builder.passwordStatus;
            this.productId = builder.productId;
            this.regionId = builder.regionId;
            this.regionName = builder.regionName;
            this.samplingSize = builder.samplingSize;
            this.tenantId = builder.tenantId;
            this.tenantName = builder.tenantName;
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
         * @return canModifyUserName
         */
        public Boolean getCanModifyUserName() {
            return this.canModifyUserName;
        }

        /**
         * @return checkStatus
         */
        public Integer getCheckStatus() {
            return this.checkStatus;
        }

        /**
         * @return datamaskStatus
         */
        public Integer getDatamaskStatus() {
            return this.datamaskStatus;
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
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
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
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
         * @return instanceSize
         */
        public Long getInstanceSize() {
            return this.instanceSize;
        }

        /**
         * @return lastModifyTime
         */
        public Long getLastModifyTime() {
            return this.lastModifyTime;
        }

        /**
         * @return lastModifyUserId
         */
        public String getLastModifyUserId() {
            return this.lastModifyUserId;
        }

        /**
         * @return logStoreDay
         */
        public Integer getLogStoreDay() {
            return this.logStoreDay;
        }

        /**
         * @return passwordStatus
         */
        public Integer getPasswordStatus() {
            return this.passwordStatus;
        }

        /**
         * @return productId
         */
        public Long getProductId() {
            return this.productId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        /**
         * @return samplingSize
         */
        public Integer getSamplingSize() {
            return this.samplingSize;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return tenantName
         */
        public String getTenantName() {
            return this.tenantName;
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
            private Boolean canModifyUserName; 
            private Integer checkStatus; 
            private Integer datamaskStatus; 
            private String dbName; 
            private Integer enable; 
            private String engineType; 
            private String errorMessage; 
            private Long gmtCreate; 
            private Long id; 
            private String instanceDescription; 
            private String instanceId; 
            private Long instanceSize; 
            private Long lastModifyTime; 
            private String lastModifyUserId; 
            private Integer logStoreDay; 
            private Integer passwordStatus; 
            private Long productId; 
            private String regionId; 
            private String regionName; 
            private Integer samplingSize; 
            private String tenantId; 
            private String tenantName; 
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
             * CanModifyUserName.
             */
            public Builder canModifyUserName(Boolean canModifyUserName) {
                this.canModifyUserName = canModifyUserName;
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
             * DatamaskStatus.
             */
            public Builder datamaskStatus(Integer datamaskStatus) {
                this.datamaskStatus = datamaskStatus;
                return this;
            }

            /**
             * DbName.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
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
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
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
             * InstanceSize.
             */
            public Builder instanceSize(Long instanceSize) {
                this.instanceSize = instanceSize;
                return this;
            }

            /**
             * LastModifyTime.
             */
            public Builder lastModifyTime(Long lastModifyTime) {
                this.lastModifyTime = lastModifyTime;
                return this;
            }

            /**
             * LastModifyUserId.
             */
            public Builder lastModifyUserId(String lastModifyUserId) {
                this.lastModifyUserId = lastModifyUserId;
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
             * PasswordStatus.
             */
            public Builder passwordStatus(Integer passwordStatus) {
                this.passwordStatus = passwordStatus;
                return this;
            }

            /**
             * ProductId.
             */
            public Builder productId(Long productId) {
                this.productId = productId;
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
             * RegionName.
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
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
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
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
