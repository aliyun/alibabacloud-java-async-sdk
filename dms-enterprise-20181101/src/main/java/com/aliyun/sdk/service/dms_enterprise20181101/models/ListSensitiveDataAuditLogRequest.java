// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ListSensitiveDataAuditLogRequest} extends {@link RequestModel}
 *
 * <p>ListSensitiveDataAuditLogRequest</p>
 */
public class ListSensitiveDataAuditLogRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ColumnName")
    private String columnName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModuleName")
    private String moduleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserName")
    private String opUserName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private ListSensitiveDataAuditLogRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.columnName = builder.columnName;
        this.dbName = builder.dbName;
        this.endTime = builder.endTime;
        this.moduleName = builder.moduleName;
        this.opUserName = builder.opUserName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.tableName = builder.tableName;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSensitiveDataAuditLogRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return columnName
     */
    public String getColumnName() {
        return this.columnName;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return moduleName
     */
    public String getModuleName() {
        return this.moduleName;
    }

    /**
     * @return opUserName
     */
    public String getOpUserName() {
        return this.opUserName;
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

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<ListSensitiveDataAuditLogRequest, Builder> {
        private String regionId; 
        private String columnName; 
        private String dbName; 
        private String endTime; 
        private String moduleName; 
        private String opUserName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String startTime; 
        private String tableName; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ListSensitiveDataAuditLogRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.columnName = request.columnName;
            this.dbName = request.dbName;
            this.endTime = request.endTime;
            this.moduleName = request.moduleName;
            this.opUserName = request.opUserName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
            this.tableName = request.tableName;
            this.tid = request.tid;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the column that contains sensitive data.</p>
         * 
         * <strong>example:</strong>
         * <p>ExampleColumnName</p>
         */
        public Builder columnName(String columnName) {
            this.putQueryParameter("ColumnName", columnName);
            this.columnName = columnName;
            return this;
        }

        /**
         * <p>The name of the database that stores the sensitive data.</p>
         * 
         * <strong>example:</strong>
         * <p>ExampleDbName</p>
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * <p>The end of the time range for which you want to query the audit logs for sensitive information. Specify the time in the yyyy-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-18 11:00:00</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The function module whose audit logs you want to query for sensitive data. If you do not specify this parameter, all audit logs are queried. Valid values:</p>
         * <ul>
         * <li><strong>SQL_CONSOLE</strong>: data query</li>
         * <li><strong>SQL_CONSOLE_EXPORT</strong>: query result export</li>
         * <li><strong>DATA_CHANGE</strong>: data change</li>
         * <li><strong>DATA_EXPORT</strong>: data export</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SQL_CONSOLE</p>
         */
        public Builder moduleName(String moduleName) {
            this.putQueryParameter("ModuleName", moduleName);
            this.moduleName = moduleName;
            return this;
        }

        /**
         * <p>The username of the requester.</p>
         * 
         * <strong>example:</strong>
         * <p>ExampleOpUserName</p>
         */
        public Builder opUserName(String opUserName) {
            this.putQueryParameter("OpUserName", opUserName);
            this.opUserName = opUserName;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
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
         * <p>The number of entries to return on each page. Example: 100</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The beginning of the time range for which you want to query the audit logs for sensitive information. Specify the time in the yyyy-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-18 10:00:00</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The name of the table that stores the sensitive data.</p>
         * 
         * <strong>example:</strong>
         * <p>ExampleTableName</p>
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * <p>The ID of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public ListSensitiveDataAuditLogRequest build() {
            return new ListSensitiveDataAuditLogRequest(this);
        } 

    } 

}
