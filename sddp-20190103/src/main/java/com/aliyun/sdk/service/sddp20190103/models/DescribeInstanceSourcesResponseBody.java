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
 * {@link DescribeInstanceSourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceSourcesResponseBody</p>
 */
public class DescribeInstanceSourcesResponseBody extends TeaModel {
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
         * <p>An array that consists of the queried data assets.</p>
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
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>5A7E8FB9-5011-5A90-97D9-AE587047****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstanceSourcesResponseBody build() {
            return new DescribeInstanceSourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceSourcesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditStatus")
        private Integer auditStatus;

        @com.aliyun.core.annotation.NameInMap("AutoScan")
        private Integer autoScan;

        @com.aliyun.core.annotation.NameInMap("CanModifyUserName")
        private Boolean canModifyUserName;

        @com.aliyun.core.annotation.NameInMap("CheckStatus")
        private Integer checkStatus;

        @com.aliyun.core.annotation.NameInMap("DatamaskStatus")
        private Integer datamaskStatus;

        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Integer enable;

        @com.aliyun.core.annotation.NameInMap("EngineType")
        private String engineType;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstanceDescription")
        private String instanceDescription;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceSize")
        private Long instanceSize;

        @com.aliyun.core.annotation.NameInMap("LastModifyTime")
        private Long lastModifyTime;

        @com.aliyun.core.annotation.NameInMap("LastModifyUserId")
        private String lastModifyUserId;

        @com.aliyun.core.annotation.NameInMap("LogStoreDay")
        private Integer logStoreDay;

        @com.aliyun.core.annotation.NameInMap("PasswordStatus")
        private Integer passwordStatus;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private Long productId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RegionName")
        private String regionName;

        @com.aliyun.core.annotation.NameInMap("SamplingSize")
        private Integer samplingSize;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("TenantName")
        private String tenantName;

        @com.aliyun.core.annotation.NameInMap("UserName")
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
             * <p>Indicates whether the automatic scan feature is enabled to detect sensitive data. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: no</li>
             * <li><strong>1</strong>: yes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder autoScan(Integer autoScan) {
                this.autoScan = autoScan;
                return this;
            }

            /**
             * <p>Indicates whether the username and password can be changed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canModifyUserName(Boolean canModifyUserName) {
                this.canModifyUserName = canModifyUserName;
                return this;
            }

            /**
             * <p>The data detection status. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The data detection is ready.</li>
             * <li><strong>1</strong>: The data detection is running.</li>
             * <li><strong>2</strong>: The connectivity test is in progress.</li>
             * <li><strong>3</strong>: The connectivity test passed.</li>
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
             * <p>The name of the database to which the data asset belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * <p>Indicates whether sensitive data detection is enabled for the data asset. Valid values:</p>
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
             * <p>The type of the database engine. Valid values: <strong>MySQL, MariaDB, Oracle, PostgreSQL, and SQLServer</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engineType(String engineType) {
                this.engineType = engineType;
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
             * <p>The time when the data asset was created. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1625587423000</p>
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
             * <p>Test</p>
             */
            public Builder instanceDescription(String instanceDescription) {
                this.instanceDescription = instanceDescription;
                return this;
            }

            /**
             * <p>The ID of the instance</p>
             * 
             * <strong>example:</strong>
             * <p>rm-****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The storage space size of the instance. This parameter is valid only if the value of the ProductId parameter is 2. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>409600</p>
             */
            public Builder instanceSize(Long instanceSize) {
                this.instanceSize = instanceSize;
                return this;
            }

            /**
             * <p>The time when the data asset was last modified. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1625587423000</p>
             */
            public Builder lastModifyTime(Long lastModifyTime) {
                this.lastModifyTime = lastModifyTime;
                return this;
            }

            /**
             * <p>The ID of the account that is last used to modify the data asset.</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
             */
            public Builder lastModifyUserId(String lastModifyUserId) {
                this.lastModifyUserId = lastModifyUserId;
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
             * <p>Indicates whether the password is used. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: yes</li>
             * <li><strong>0</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder passwordStatus(Integer passwordStatus) {
                this.passwordStatus = passwordStatus;
                return this;
            }

            /**
             * <p>The ID of the service to which the data asset belongs. Valid values include <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>, and <strong>5</strong>. The value 1 indicates MaxCompute. The value 2 indicates OSS. The value 3 indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder productId(Long productId) {
                this.productId = productId;
                return this;
            }

            /**
             * <p>The ID of the region where the instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The name of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>China (Hangzhou)</p>
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * <p>The number of sensitive data samples. Valid values: <strong>0</strong>, <strong>5</strong>, and <strong>10</strong>. Unit: data entries.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder samplingSize(Integer samplingSize) {
                this.samplingSize = samplingSize;
                return this;
            }

            /**
             * <p>The ID of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The name of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>user1</p>
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * <p>The username of the account.</p>
             * 
             * <strong>example:</strong>
             * <p>User01</p>
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
