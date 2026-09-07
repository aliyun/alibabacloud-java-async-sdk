// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeAuditLogRecordsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAuditLogRecordsRequest</p>
 */
public class DescribeAuditLogRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBName")
    private String DBName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineType")
    private String engineType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostAddress")
    private String hostAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 10)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessId")
    private String processId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyUser")
    private String proxyUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryKeyword")
    private String queryKeyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SqlType")
    private String sqlType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Succeed")
    private String succeed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("User")
    private String user;

    private DescribeAuditLogRecordsRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.DBName = builder.DBName;
        this.endTime = builder.endTime;
        this.engineType = builder.engineType;
        this.hostAddress = builder.hostAddress;
        this.order = builder.order;
        this.orderType = builder.orderType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.processId = builder.processId;
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
     * @return engineType
     */
    public String getEngineType() {
        return this.engineType;
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
     * @return processId
     */
    public String getProcessId() {
        return this.processId;
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
        private String engineType; 
        private String hostAddress; 
        private String order; 
        private String orderType; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String processId; 
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
            this.engineType = request.engineType;
            this.hostAddress = request.hostAddress;
            this.order = request.order;
            this.orderType = request.orderType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.processId = request.processId;
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
         * <p>&lt;props=&quot;china&quot;&gt;The cluster ID of the Enterprise Edition, Basic Edition, or Data Lakehouse Edition cluster.
         * &lt;props=&quot;intl&quot;&gt;The cluster ID of the Data Lakehouse Edition cluster.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/454250.html">DescribeDBClusters</a> operation to query the cluster IDs of all clusters in a specified region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-t4nj8619bz2w3****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The name of the database on which the SQL statement is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>adb_demo</p>
         */
        public Builder DBName(String DBName) {
            this.putQueryParameter("DBName", DBName);
            this.DBName = DBName;
            return this;
        }

        /**
         * <p>The end of the time range to query. Specify the time in UTC in the yyyy-MM-ddTHH:mmZ format.</p>
         * <blockquote>
         * <ul>
         * <li>The end time must be later than the start time.</li>
         * <li>The interval between the start time and the end time cannot exceed 24 hours.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-08-12T17:08Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The engine type. Valid values:</p>
         * <ul>
         * <li>XIHE: audit logs of the default compute engine.</li>
         * <li>AGENT_SERVERLESS: audit logs of the Serverless analytics feature.</li>
         * </ul>
         * <p>If this parameter is not specified, the default value is XIHE.</p>
         * 
         * <strong>example:</strong>
         * <p>XIHE</p>
         */
        public Builder engineType(String engineType) {
            this.putQueryParameter("EngineType", engineType);
            this.engineType = engineType;
            return this;
        }

        /**
         * <p>The IP address and port number of the client that executes the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>100.104.XX.XX:43908</p>
         */
        public Builder hostAddress(String hostAddress) {
            this.putQueryParameter("HostAddress", hostAddress);
            this.hostAddress = hostAddress;
            return this;
        }

        /**
         * <p>The sorting order based on specified fields. The value is in JSON format and is an ordered JSON array. Compound sorting is performed in the order of the input array. The array contains the <code>Field</code> and <code>Type</code> fields. Example: <code>[{&quot;Field&quot;:&quot;ExecutionStartTime&quot;,&quot;Type&quot;:&quot;Desc&quot;},{&quot;Field&quot;:&quot;ScanRows&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</code>.</p>
         * <ul>
         * <li><p><code>Field</code> specifies the field name for sorting. Valid values:</p>
         * <ul>
         * <li><strong>HostAddress</strong>: the address of the client that connects to the database.</li>
         * <li><strong>UserName</strong>: the username.</li>
         * <li><strong>ExecutionStartTime</strong>: the execution start time of the SQL statement.</li>
         * <li><strong>QueryTime</strong>: the execution duration of the SQL statement.</li>
         * <li><strong>PeakMemoryUsage</strong>: the peak memory usage during the execution of the SQL statement.</li>
         * <li><strong>ScanRows</strong>: the number of rows scanned by tasks with data sources.</li>
         * <li><strong>ScanSize</strong>: the amount of scanned data.</li>
         * <li><strong>ScanTime</strong>: the total time consumed for scanning data.</li>
         * <li><strong>PlanningTime</strong>: the time consumed for generating the execution plan.</li>
         * <li><strong>WallTime</strong>: the cumulative CPU time of all operators across all nodes in the query.</li>
         * <li><strong>ProcessID</strong>: the process ID.</li>
         * </ul>
         * </li>
         * <li><p><code>Type</code> specifies the sorting type. Valid values:</p>
         * <ul>
         * <li><strong>Desc</strong>: descending order.</li>
         * <li><strong>Asc</strong>: ascending order.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Field&quot;:&quot;ExecuteTime&quot;,&quot;Type&quot;:&quot;Desc&quot;},{&quot;Field&quot;:&quot;HostAddress&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The order in which the results are sorted by SQL execution time. Valid values:</p>
         * <ul>
         * <li><strong>asc</strong>: ascending order.</li>
         * <li><strong>desc</strong>: descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>asc</p>
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
         * <p>The page number. The value must be a positive integer that does not exceed the maximum value of the Integer data type. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values:</p>
         * <ul>
         * <li><strong>10</strong> (default)</li>
         * <li><strong>30</strong></li>
         * <li><strong>50</strong></li>
         * <li><strong>100</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProcessId.
         */
        public Builder processId(String processId) {
            this.putQueryParameter("ProcessId", processId);
            this.processId = processId;
            return this;
        }

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder proxyUser(String proxyUser) {
            this.putQueryParameter("ProxyUser", proxyUser);
            this.proxyUser = proxyUser;
            return this;
        }

        /**
         * <p>The keyword used to search the returned results.</p>
         * 
         * <strong>example:</strong>
         * <p>adb</p>
         */
        public Builder queryKeyword(String queryKeyword) {
            this.putQueryParameter("QueryKeyword", queryKeyword);
            this.queryKeyword = queryKeyword;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/454314.html">DescribeRegions</a> operation to query the region ID of the cluster.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
         * <p>The type of the SQL statement. Valid values:</p>
         * <ul>
         * <li><strong>DELETE</strong></li>
         * <li><strong>SELECT</strong></li>
         * <li><strong>UPDATE</strong></li>
         * <li><strong>INSERT INTO SELECT</strong></li>
         * <li><strong>ALTER</strong></li>
         * <li><strong>DROP</strong></li>
         * <li><strong>CREATE</strong></li>
         * </ul>
         * <blockquote>
         * <p>Only one type can be specified per request. If this parameter is not specified, all types are queried by default.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SELECT</p>
         */
        public Builder sqlType(String sqlType) {
            this.putQueryParameter("SqlType", sqlType);
            this.sqlType = sqlType;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in UTC in the yyyy-MM-ddTHH:mmZ format.</p>
         * <blockquote>
         * <p>SQL audit logs can be queried only when SQL audit is enabled, and only logs from the last 30 days are supported. If SQL audit is disabled and then re-enabled, only logs generated after re-enabling can be queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-08-12T04:17Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>Specifies whether the SQL statement is executed successfully. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Executed successfully.</li>
         * <li><strong>false</strong>: Execution failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder succeed(String succeed) {
            this.putQueryParameter("Succeed", succeed);
            this.succeed = succeed;
            return this;
        }

        /**
         * <p>The username that executes the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
