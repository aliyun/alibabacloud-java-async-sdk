// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link ListSlowSQLRecordsRequest} extends {@link RequestModel}
 *
 * <p>ListSlowSQLRecordsRequest</p>
 */
public class ListSlowSQLRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBName")
    private String DBName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxDuration")
    private String maxDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinDuration")
    private String minDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private ListSlowSQLRecordsRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.DBName = builder.DBName;
        this.endTime = builder.endTime;
        this.keyword = builder.keyword;
        this.maxDuration = builder.maxDuration;
        this.minDuration = builder.minDuration;
        this.orderBy = builder.orderBy;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSlowSQLRecordsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
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
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return maxDuration
     */
    public String getMaxDuration() {
        return this.maxDuration;
    }

    /**
     * @return minDuration
     */
    public String getMinDuration() {
        return this.minDuration;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<ListSlowSQLRecordsRequest, Builder> {
        private String DBInstanceId; 
        private String DBName; 
        private String endTime; 
        private String keyword; 
        private String maxDuration; 
        private String minDuration; 
        private String orderBy; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String startTime; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(ListSlowSQLRecordsRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.DBName = request.DBName;
            this.endTime = request.endTime;
            this.keyword = request.keyword;
            this.maxDuration = request.maxDuration;
            this.minDuration = request.minDuration;
            this.orderBy = request.orderBy;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
            this.userName = request.userName;
        } 

        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>testdb01</p>
         */
        public Builder DBName(String DBName) {
            this.putQueryParameter("DBName", DBName);
            this.DBName = DBName;
            return this;
        }

        /**
         * <p>The end of the time range to query. The time must be in UTC and formatted as <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z. The time must be in UTC. The end time must be later than the start time.</p>
         * <p>Defaults to the current time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-04T17:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The search keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The longest execution duration. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        public Builder maxDuration(String maxDuration) {
            this.putQueryParameter("MaxDuration", maxDuration);
            this.maxDuration = maxDuration;
            return this;
        }

        /**
         * <p>The minimum execution duration. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder minDuration(String minDuration) {
            this.putQueryParameter("MinDuration", minDuration);
            this.minDuration = minDuration;
            return this;
        }

        /**
         * <p>Sort criteria (JSON string). {&quot;Field&quot;:&quot;QueryStartTime&quot;,&quot;Type&quot;:&quot;Desc&quot;}</p>
         * <p>Field: Specifies the field to sort by.</p>
         * <ul>
         * <li>QueryID: Query ID.</li>
         * <li>UserName: The username.</li>
         * <li>DBName: The name of the database.</li>
         * <li>QueryStartTime: The start time.</li>
         * <li>QueryEndTime: The end time.</li>
         * <li>DurationTime: The execution duration of the query.</li>
         * <li>Optimizer.</li>
         * <li>LockWaitTime: The lock waiting time.</li>
         * <li>QueueWaitTime: Time in Queue.</li>
         * <li>CpuTimeMs: CPU time.</li>
         * <li>MemBytes: The memory usage.</li>
         * <li>SpillBytes: Spill File Size.</li>
         * </ul>
         * <p>Type: Sort order.</p>
         * <ul>
         * <li>Desc: descending.</li>
         * <li>Asc: ascending.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Field&quot;:&quot;QueryStartTime&quot;,&quot;Type&quot;:&quot;Desc&quot;}</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The number of the page to return. The value must be a positive integer in the range [1, 100]. Default value: 1.</p>
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
         * <li><strong>30</strong></li>
         * <li><strong>50</strong></li>
         * <li><strong>100</strong></li>
         * </ul>
         * <p>Default value: <strong>30</strong>.</p>
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
         * <p>The region ID of the instance.</p>
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
         * <p>The beginning of the time range to query. The time must be in UTC and formatted as yyyy-MM-ddTHH:mmZ.</p>
         * <p>Defaults to the current time minus 5 minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-04T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The account name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_user</p>
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public ListSlowSQLRecordsRequest build() {
            return new ListSlowSQLRecordsRequest(this);
        } 

    } 

}
