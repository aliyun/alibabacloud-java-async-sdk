// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSQLExecAuditLogRequest} extends {@link RequestModel}
 *
 * <p>ListSQLExecAuditLogRequest</p>
 */
public class ListSQLExecAuditLogRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecState")
    private String execState;

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
    @com.aliyun.core.annotation.NameInMap("SearchName")
    private String searchName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SqlType")
    private String sqlType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private ListSQLExecAuditLogRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.endTime = builder.endTime;
        this.execState = builder.execState;
        this.opUserName = builder.opUserName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.searchName = builder.searchName;
        this.sqlType = builder.sqlType;
        this.startTime = builder.startTime;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSQLExecAuditLogRequest create() {
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
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return execState
     */
    public String getExecState() {
        return this.execState;
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
     * @return searchName
     */
    public String getSearchName() {
        return this.searchName;
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
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<ListSQLExecAuditLogRequest, Builder> {
        private String regionId; 
        private String endTime; 
        private String execState; 
        private String opUserName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String searchName; 
        private String sqlType; 
        private String startTime; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ListSQLExecAuditLogRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.endTime = request.endTime;
            this.execState = request.execState;
            this.opUserName = request.opUserName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.searchName = request.searchName;
            this.sqlType = request.sqlType;
            this.startTime = request.startTime;
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
         * The end of the time range to query.
         * <p>
         * 
         * >  The end time supports fuzzy match. Specify the time in the YYYY-MM-DD hh:mm:ss format. We recommend that you use the StartTime and EndTime parameters to specify a time range that does not exceed one day. The returned entries can be displayed by page to improve query efficiency.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The execution status of the SQL statement. Valid values:
         * <p>
         * 
         * *   **FAIL**: The SQL statement fails to be executed.
         * *   **NOEXE**: The SQL statement has not been executed.
         * *   **RUNNING**: The SQL statement is being executed.
         * *   **CANCEL**: The execution of the SQL statement is canceled.
         * *   **SUCCESS**: The SQL statement is executed.
         */
        public Builder execState(String execState) {
            this.putQueryParameter("ExecState", execState);
            this.execState = execState;
            return this;
        }

        /**
         * The nickname of the user who wrote the SQL statement.
         */
        public Builder opUserName(String opUserName) {
            this.putQueryParameter("OpUserName", opUserName);
            this.opUserName = opUserName;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. The value cannot exceed 100.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The name of the database or instance based on which you want to query SQL statements.
         * <p>
         * 
         * >  If the SQL statements to be queried are at the instance level, you can set this parameter to an instance name. If the SQL statements to be queried are at the database level, you can set this parameter to a database name.
         */
        public Builder searchName(String searchName) {
            this.putQueryParameter("SearchName", searchName);
            this.searchName = searchName;
            return this;
        }

        /**
         * The type of the SQL statement. Valid values:
         * <p>
         * 
         * *   **SELECT**: the SQL statement that is used to query data.
         * *   **INSERT**: the SQL statement that is used to insert data.
         * *   **DELETE**: the SQL statement that is used to delete data.
         * *   **CREATE_TABLE**: the SQL statement that is used to create tables.
         * 
         * >  To view more types of SQL statements, log on to the DMS console and click Security and Specifications. In the left-side navigation pane, click **Operation Audit**. Then, you can view all supported types of SQL statements from the **SQL type** drop-down list.
         */
        public Builder sqlType(String sqlType) {
            this.putQueryParameter("SqlType", sqlType);
            this.sqlType = sqlType;
            return this;
        }

        /**
         * The beginning of the time range to query.
         * <p>
         * 
         * >  The start time supports fuzzy match. Specify the time in the YYYY-MM-DD hh:mm:ss format.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to obtain the tenant ID.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public ListSQLExecAuditLogRequest build() {
            return new ListSQLExecAuditLogRequest(this);
        } 

    } 

}
