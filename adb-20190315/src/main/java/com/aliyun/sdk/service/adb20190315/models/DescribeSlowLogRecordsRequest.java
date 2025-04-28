// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
 * {@link DescribeSlowLogRecordsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSlowLogRecordsRequest</p>
 */
public class DescribeSlowLogRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBName")
    private String DBName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 30)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessID")
    private String processID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Range")
    private String range;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    private DescribeSlowLogRecordsRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.DBName = builder.DBName;
        this.endTime = builder.endTime;
        this.order = builder.order;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.processID = builder.processID;
        this.range = builder.range;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.startTime = builder.startTime;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlowLogRecordsRequest create() {
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
     * @return processID
     */
    public String getProcessID() {
        return this.processID;
    }

    /**
     * @return range
     */
    public String getRange() {
        return this.range;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder extends Request.Builder<DescribeSlowLogRecordsRequest, Builder> {
        private String DBClusterId; 
        private String DBName; 
        private String endTime; 
        private String order; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String processID; 
        private String range; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String startTime; 
        private String state; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSlowLogRecordsRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.DBName = request.DBName;
            this.endTime = request.endTime;
            this.order = request.order;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.processID = request.processID;
            this.range = request.range;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.startTime = request.startTime;
            this.state = request.state;
        } 

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the cluster IDs of all AnalyticDB for MySQL Data Warehouse Edition (V3.0) clusters within a specific region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp1rqvm70uh2****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The name of the database.</p>
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
         * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time must be in UTC.</p>
         * <blockquote>
         * <p> The end time must be later than the start time. The specified time range must be less than seven days.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-27T16:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The order in which to sort the retrieved entries by field. Specify this parameter in the JSON format. The value is an ordered array that uses the order of the input array and contains <code>Field</code> and <code>Type</code>. Example: <code>[{&quot;Field&quot;:&quot;ExecutionStartTime&quot;,&quot;Type&quot;:&quot;Desc&quot;},{&quot;Field&quot;:&quot;ScanRows&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</code>.</p>
         * <ul>
         * <li><p><code>Field</code>: the field that is used to sort the retrieved entries. Valid values:</p>
         * <ul>
         * <li><strong>HostAddress</strong>: the IP address of the client that is used to connect to the database.</li>
         * <li><strong>UserName</strong>: the username.</li>
         * <li><strong>ExecutionStartTime</strong>: the start time of the query execution.</li>
         * <li><strong>QueryTime</strong>: the amount of time consumed to execute the SQL statement.</li>
         * <li><strong>PeakMemoryUsage</strong>: the maximum memory usage when the SQL statement is executed.</li>
         * <li><strong>ScanRows</strong>: the number of rows to be scanned from a data source in the task.</li>
         * <li><strong>ScanSize</strong>: the amount of data to be scanned.</li>
         * <li><strong>ScanTime</strong>: the total amount of time consumed to scan data.</li>
         * <li><strong>PlanningTime</strong>: the amount of time consumed to generate execution plans.</li>
         * <li><strong>WallTime</strong>: the accumulated CPU Time values of all operators in the query on each node.</li>
         * <li><strong>ProcessID</strong>: the ID of the process.</li>
         * </ul>
         * </li>
         * <li><p><code>Type</code>: the sorting type of the retrieved entries. Valid values:</p>
         * <ul>
         * <li><strong>Desc</strong>: descending order</li>
         * <li><strong>Asc</strong>: ascending order</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Field&quot;:&quot;ExecutionStartTime&quot;,&quot;Type&quot;:&quot;Desc&quot;},{&quot;Field&quot;:&quot;ScanRows&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</p>
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
         * <p>The number of the page to return. The value must be an integer that is greater than 0. Default value: <strong>1</strong>.</p>
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
         * <p>The number of entries to return on each page. Valid values: <strong>30</strong>, <strong>50</strong>, and <strong>100</strong>. Default value: 30.</p>
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
         * <p>The ID of the process.</p>
         * 
         * <strong>example:</strong>
         * <p>2021052716044317201616624903453******</p>
         */
        public Builder processID(String processID) {
            this.putQueryParameter("ProcessID", processID);
            this.processID = processID;
            return this;
        }

        /**
         * <p>The range conditions used to filter specified fields, including <code>Max</code> and <code>Min</code>. Specify this parameter in the JSON format. Example: <code>[{&quot;Field&quot;:&quot;ScanSize&quot;,&quot;Min&quot;:&quot;1000000&quot;,&quot;Max&quot;:&quot;10000000&quot;},{&quot;Field&quot;:&quot;QueryTime&quot;,&quot;Min&quot;:&quot;1000&quot;,&quot;Max&quot;:&quot;10000&quot;}]</code>.</p>
         * <p><code>Field</code>: the field to be filtered. Valid values:</p>
         * <ul>
         * <li><strong>ScanSize</strong>: the amount of data to be scanned. Unit: KB.</li>
         * <li><strong>QueryTime</strong>: the amount of time consumed to execute the statement. Unit: milliseconds.</li>
         * <li><strong>PeakMemoryUsage</strong>: the maximum memory usage when the SQL statement is executed. Unit: KB.</li>
         * </ul>
         * <blockquote>
         * <p> <code>Min</code> indicates the minimum value of the query range (left operand). <code>Max</code> indicates the maximum value of the query range (right operand). Max and Min are both of the String type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Field&quot;:&quot;ScanSize&quot;,&quot;Min&quot;:&quot;1000000&quot;,&quot;Max&quot;:&quot;10000000&quot;},{&quot;Field&quot;:&quot;QueryTime&quot;,&quot;Min&quot;:&quot;1000&quot;,&quot;Max&quot;:&quot;10000&quot;}]</p>
         */
        public Builder range(String range) {
            this.putQueryParameter("Range", range);
            this.range = range;
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
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-20T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The state of the query. Valid values:</p>
         * <ul>
         * <li><strong>Successed</strong>: successful</li>
         * <li><strong>Failed</strong>: failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Successed</p>
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        @Override
        public DescribeSlowLogRecordsRequest build() {
            return new DescribeSlowLogRecordsRequest(this);
        } 

    } 

}
