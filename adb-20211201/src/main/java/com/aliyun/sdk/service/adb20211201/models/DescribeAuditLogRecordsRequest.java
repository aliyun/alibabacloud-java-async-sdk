// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAuditLogRecordsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAuditLogRecordsRequest</p>
 */
public class DescribeAuditLogRecordsRequest extends Request {
    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("DBName")
    private String DBName;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("HostAddress")
    private String hostAddress;

    @Query
    @NameInMap("Order")
    private String order;

    @Query
    @NameInMap("OrderType")
    private String orderType;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 2147483647, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 10)
    private Integer pageSize;

    @Query
    @NameInMap("ProxyUser")
    private String proxyUser;

    @Query
    @NameInMap("QueryKeyword")
    private String queryKeyword;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SqlType")
    private String sqlType;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("Succeed")
    private String succeed;

    @Query
    @NameInMap("User")
    private String user;

    private DescribeAuditLogRecordsRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.DBName = builder.DBName;
        this.endTime = builder.endTime;
        this.hostAddress = builder.hostAddress;
        this.order = builder.order;
        this.orderType = builder.orderType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.proxyUser = builder.proxyUser;
        this.queryKeyword = builder.queryKeyword;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sqlType = builder.sqlType;
        this.startTime = builder.startTime;
        this.succeed = builder.succeed;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAuditLogRecordsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return DBName
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return hostAddress
     */
    public String getHostAddress() {
        return this.hostAddress;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return proxyUser
     */
    public String getProxyUser() {
        return this.proxyUser;
    }

    /**
     * @return queryKeyword
     */
    public String getQueryKeyword() {
        return this.queryKeyword;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return sqlType
     */
    public String getSqlType() {
        return this.sqlType;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return succeed
     */
    public String getSucceed() {
        return this.succeed;
    }

    /**
     * @return user
     */
    public String getUser() {
        return this.user;
    }

    public static final class Builder extends Request.Builder<DescribeAuditLogRecordsRequest, Builder> {
        private String DBClusterId; 
        private String DBName; 
        private String endTime; 
        private String hostAddress; 
        private String order; 
        private String orderType; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String proxyUser; 
        private String queryKeyword; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String sqlType; 
        private String startTime; 
        private String succeed; 
        private String user; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAuditLogRecordsRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.DBName = request.DBName;
            this.endTime = request.endTime;
            this.hostAddress = request.hostAddress;
            this.order = request.order;
            this.orderType = request.orderType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.proxyUser = request.proxyUser;
            this.queryKeyword = request.queryKeyword;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sqlType = request.sqlType;
            this.startTime = request.startTime;
            this.succeed = request.succeed;
            this.user = request.user;
        } 

        /**
         * The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.
         * <p>
         * 
         * > You can call the [DescribeDBClusters](~~454250~~) operation to query the IDs of all AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters within a region.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The name of the database on which the SQL statement was executed.
         */
        public Builder DBName(String DBName) {
            this.putQueryParameter("DBName", DBName);
            this.DBName = DBName;
            return this;
        }

        /**
         * The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC.
         * <p>
         * 
         * > 
         * 
         * *   The end time must be later than the start time.
         * 
         * *   The maximum time range that can be specified is 24 hours.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The IP address and port number of the client that is used to execute the SQL statement.
         */
        public Builder hostAddress(String hostAddress) {
            this.putQueryParameter("HostAddress", hostAddress);
            this.hostAddress = hostAddress;
            return this;
        }

        /**
         * The order in which to sort the retrieved entries by field. Specify this parameter in the JSON format. The value is an ordered array that uses the order of the input array and contains `Field` and `Type`. Example: `[{"Field":"ExecutionStartTime","Type":"Desc"},{"Field":"ScanRows","Type":"Asc"}]`. Fields:
         * <p>
         * 
         * *   `Field`: the field that is used to sort the retrieved entries. Valid values:
         * 
         *     *   **HostAddress**: the IP address of the client that is used to connect to the database.
         *     *   **UserName**: the username.
         *     *   **ExecutionStartTime**: the start time of the query execution.
         *     *   **QueryTime**: the amount of time consumed to execute the SQL statement.
         *     *   **PeakMemoryUsage**: the maximum memory usage when the SQL statement is executed.
         *     *   **ScanRows**: the number of rows to be scanned from a data source in the task.
         *     *   **ScanSize**: the amount of data to be scanned.
         *     *   **ScanTime**: the total amount of time consumed to scan data.
         *     *   **PlanningTime**: the amount of time consumed to generate execution plans.
         *     *   **WallTime**: the accumulated CPU Time values of all operators in the query on each node.
         *     *   **ProcessID**: the process ID.
         * 
         * *   `Type`: the sorting type of the retrieved entries. Valid values:
         * 
         *     *   **Desc**: descending order.
         *     *   **Asc**: ascending order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * The sorting order of the retrieved entries. Valid values:
         * <p>
         * 
         * *   **asc**: sorts the retrieved entries by time in ascending order.
         * *   **desc**: sorts the retrieved entries by time in descending order.
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The page number. Pages start from page 1. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Valid values:
         * <p>
         * 
         * *   **10** (default)
         * *   **30**
         * *   **50**
         * *   **100**
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * A reserved parameter.
         */
        public Builder proxyUser(String proxyUser) {
            this.putQueryParameter("ProxyUser", proxyUser);
            this.proxyUser = proxyUser;
            return this;
        }

        /**
         * The keyword based on which audit logs are queried. You can set this parameter to a value of the STRING type.
         */
        public Builder queryKeyword(String queryKeyword) {
            this.putQueryParameter("QueryKeyword", queryKeyword);
            this.queryKeyword = queryKeyword;
            return this;
        }

        /**
         * The region ID of the cluster.
         * <p>
         * 
         * > You can call the [DescribeRegions](~~454314~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The type of the SQL statement. Valid values:
         * <p>
         * 
         * *   **DELETE**
         * *   **SELECT**
         * *   **UPDATE**
         * *   **INSERT INTO SELECT**
         * *   **ALTER**
         * *   **DROP**
         * *   **CREATE**
         * 
         * >  You can query only a single type of SQL statements at a time. If you leave this parameter empty, the **SELECT** statements are queried.
         */
        public Builder sqlType(String sqlType) {
            this.putQueryParameter("SqlType", sqlType);
            this.sqlType = sqlType;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC.
         * <p>
         * 
         * > SQL audit logs can be queried only when SQL audit is enabled. Only SQL audit logs within the last 30 days can be queried. If SQL audit was disabled and re-enabled, only SQL audit logs from the time when SQL audit was re-enabled can be queried.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Specifies whether the execution of the SQL statement succeeds. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder succeed(String succeed) {
            this.putQueryParameter("Succeed", succeed);
            this.succeed = succeed;
            return this;
        }

        /**
         * The username that is used to execute the SQL statement.
         */
        public Builder user(String user) {
            this.putQueryParameter("User", user);
            this.user = user;
            return this;
        }

        @Override
        public DescribeAuditLogRecordsRequest build() {
            return new DescribeAuditLogRecordsRequest(this);
        } 

    } 

}
