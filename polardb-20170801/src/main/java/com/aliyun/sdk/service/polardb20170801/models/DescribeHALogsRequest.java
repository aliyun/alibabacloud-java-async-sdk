// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeHALogsRequest} extends {@link RequestModel}
 *
 * <p>DescribeHALogsRequest</p>
 */
public class DescribeHALogsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNodeId")
    private String DBNodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeHALogsRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.DBNodeId = builder.DBNodeId;
        this.endTime = builder.endTime;
        this.logType = builder.logType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHALogsRequest create() {
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
     * @return DBNodeId
     */
    public String getDBNodeId() {
        return this.DBNodeId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return logType
     */
    public String getLogType() {
        return this.logType;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeHALogsRequest, Builder> {
        private String DBClusterId; 
        private String DBNodeId; 
        private String endTime; 
        private String logType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHALogsRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.DBNodeId = request.DBNodeId;
            this.endTime = request.endTime;
            this.logType = request.logType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-****************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The node ID.</p>
         * <blockquote>
         * <p>这是一个optional 字段，需要增加一个条件If specified,If specified, queries the high availability (HA) switchover records of <code>DBNodeId</code>. You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to view the detailed information about all clusters under your account, including node IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pi-****************</p>
         */
        public Builder DBNodeId(String DBNodeId) {
            this.putQueryParameter("DBNodeId", DBNodeId);
            this.DBNodeId = DBNodeId;
            return this;
        }

        /**
         * <p>The end of the time range to query. The end time must be later than the start time. The time follows the <code>YYYY-MM-DDThh:mm:ssZ</code> format (UTC time).</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05-23T01:01:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The log type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HaSwitchLogList</p>
         */
        public Builder logType(String logType) {
            this.putQueryParameter("LogType", logType);
            this.logType = logType;
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
         * <p>The number of entries to return on each page. Valid values: 5 to 50. Default value: 10.</p>
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
         * <p>The beginning of the time range to query. The time follows the <code>YYYY-MM-DDThh:mm:ssZ</code> format (UTC time).</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05-01T00:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeHALogsRequest build() {
            return new DescribeHALogsRequest(this);
        } 

    } 

}
