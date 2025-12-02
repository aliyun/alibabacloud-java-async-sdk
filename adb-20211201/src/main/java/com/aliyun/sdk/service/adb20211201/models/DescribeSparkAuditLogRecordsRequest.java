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
 * {@link DescribeSparkAuditLogRecordsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSparkAuditLogRecordsRequest</p>
 */
public class DescribeSparkAuditLogRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientIp")
    private String clientIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

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
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
    private String resourceGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SQLText")
    private String SQLText;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatementId")
    private String statementId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatementSource")
    private String statementSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TotalTime")
    private String totalTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("User")
    private String user;

    private DescribeSparkAuditLogRecordsRequest(Builder builder) {
        super(builder);
        this.clientIp = builder.clientIp;
        this.DBClusterId = builder.DBClusterId;
        this.endTime = builder.endTime;
        this.order = builder.order;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.processId = builder.processId;
        this.proxyUser = builder.proxyUser;
        this.regionId = builder.regionId;
        this.resourceGroupName = builder.resourceGroupName;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.SQLText = builder.SQLText;
        this.startTime = builder.startTime;
        this.statementId = builder.statementId;
        this.statementSource = builder.statementSource;
        this.status = builder.status;
        this.totalTime = builder.totalTime;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSparkAuditLogRecordsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientIp
     */
    public String getClientIp() {
        return this.clientIp;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupName
     */
    public String getResourceGroupName() {
        return this.resourceGroupName;
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
     * @return SQLText
     */
    public String getSQLText() {
        return this.SQLText;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return statementId
     */
    public String getStatementId() {
        return this.statementId;
    }

    /**
     * @return statementSource
     */
    public String getStatementSource() {
        return this.statementSource;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return totalTime
     */
    public String getTotalTime() {
        return this.totalTime;
    }

    /**
     * @return user
     */
    public String getUser() {
        return this.user;
    }

    public static final class Builder extends Request.Builder<DescribeSparkAuditLogRecordsRequest, Builder> {
        private String clientIp; 
        private String DBClusterId; 
        private String endTime; 
        private String order; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String processId; 
        private String proxyUser; 
        private String regionId; 
        private String resourceGroupName; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String SQLText; 
        private String startTime; 
        private String statementId; 
        private String statementSource; 
        private String status; 
        private String totalTime; 
        private String user; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSparkAuditLogRecordsRequest request) {
            super(request);
            this.clientIp = request.clientIp;
            this.DBClusterId = request.DBClusterId;
            this.endTime = request.endTime;
            this.order = request.order;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.processId = request.processId;
            this.proxyUser = request.proxyUser;
            this.regionId = request.regionId;
            this.resourceGroupName = request.resourceGroupName;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.SQLText = request.SQLText;
            this.startTime = request.startTime;
            this.statementId = request.statementId;
            this.statementSource = request.statementSource;
            this.status = request.status;
            this.totalTime = request.totalTime;
            this.user = request.user;
        } 

        /**
         * <p>The source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder clientIp(String clientIp) {
            this.putQueryParameter("ClientIp", clientIp);
            this.clientIp = clientIp;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>You can call the <a href="https://help.aliyun.com/document_detail/454250.html">DescribeDBClusters</a> operation to query cluster IDs.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp1j7******78j8i</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>Query end time. The end time must be later than the start time, and the interval between them must be less than 1 day. Format: yyyy-MM-ddTHH:mmZ (UTC time).</p>
         * 
         * <strong>example:</strong>
         * <p>2025-09-25T01:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Sort the SQL statements based on specified fields. The format is a JSON array that preserves order, and composite sorting is performed according to the sequence of objects in the array. Each object contains two fields: <code>Field</code> and <code>Type</code>. For example:<code>[{&quot;Field&quot;:&quot;CreateTime&quot;, &quot;Type&quot;: &quot;desc&quot; }]</code>. Where:</p>
         * <ul>
         * <li><p><code>Field</code> specifies the field that is used to sort the SQL statements. Valid values:</p>
         * <ul>
         * <li><code>ResourceGroupName</code>: The name of the resource group.</li>
         * <li><code>Status</code> :SQL execution status.</li>
         * <li><code>User</code>: The username that is used to execute the SQL statement.</li>
         * <li><code>ExecuteTime</code>: The start time of SQL execution.</li>
         * <li><code>TotalTime</code>: The amount of time consumed to execute the SQL statement.</li>
         * <li><code>ProcessId</code>: Query ID.</li>
         * <li><code>ClientIp</code>: The source IP address.</li>
         * <li><code>StatementSource</code>: The source from which the query was initiated.</li>
         * </ul>
         * </li>
         * <li><p><code>Type</code> specifies the sorting order. Valid values (case-insensitive):</p>
         * <ul>
         * <li><code>Desc</code>: Descending order.</li>
         * <li><code>Asc</code>: Ascending order.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Field&quot;:&quot;ExecuteTime&quot;,&quot;Type&quot;:&quot;Desc&quot;}]</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
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
         * <p>The page number.</p>
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
         * <p>The number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The query ID.</p>
         * 
         * <strong>example:</strong>
         * <p>999f2439-6b10-xxxx-a5d3-daf3b35c****</p>
         */
        public Builder processId(String processId) {
            this.putQueryParameter("ProcessId", processId);
            this.processId = processId;
            return this;
        }

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        public Builder proxyUser(String proxyUser) {
            this.putQueryParameter("ProxyUser", proxyUser);
            this.proxyUser = proxyUser;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/612293.html">DescribeRegions</a> operation to query the available regions and zones, including region ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource group name.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/612410.html">DescribeDBResourceGroup</a> operation to query the resource group ID within a cluster.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test_job</p>
         */
        public Builder resourceGroupName(String resourceGroupName) {
            this.putQueryParameter("ResourceGroupName", resourceGroupName);
            this.resourceGroupName = resourceGroupName;
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
         * <p>The keyword in the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>test_table_name</p>
         */
        public Builder SQLText(String SQLText) {
            this.putQueryParameter("SQLText", SQLText);
            this.SQLText = SQLText;
            return this;
        }

        /**
         * <p>Query start time. Format: <em>yyyy-MM-ddTHH:mmZ</em> (UTC time).</p>
         * <blockquote>
         * <p> We recommend that you set the query start time to any point in time within 30 days.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2025-09-25T00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The ID of the statement.</p>
         * 
         * <strong>example:</strong>
         * <p>fbd22066-1c03-xxxx-aa16-6ae28288****</p>
         */
        public Builder statementId(String statementId) {
            this.putQueryParameter("StatementId", statementId);
            this.statementId = statementId;
            return this;
        }

        /**
         * <p>The source from which the query was initiated.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>SQL_EDITOR: SQL_EDITOR.</li>
         * <li>JDBC: JDBC.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SQL_EDITOR</p>
         */
        public Builder statementSource(String statementSource) {
            this.putQueryParameter("StatementSource", statementSource);
            this.statementSource = statementSource;
            return this;
        }

        /**
         * <p>The execution status of the SQL statement.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>cancel: The task is canceled .</li>
         * <li>finished: The execution succeeds .</li>
         * <li>error:The execution fails .</li>
         * <li>timeout: The execution timed out .</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>finish</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The duration of the SQL statement. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        public Builder totalTime(String totalTime) {
            this.putQueryParameter("TotalTime", totalTime);
            this.totalTime = totalTime;
            return this;
        }

        /**
         * <p>The username that is used to execute SQL statements.</p>
         * 
         * <strong>example:</strong>
         * <p>test_user</p>
         */
        public Builder user(String user) {
            this.putQueryParameter("User", user);
            this.user = user;
            return this;
        }

        @Override
        public DescribeSparkAuditLogRecordsRequest build() {
            return new DescribeSparkAuditLogRecordsRequest(this);
        } 

    } 

}
