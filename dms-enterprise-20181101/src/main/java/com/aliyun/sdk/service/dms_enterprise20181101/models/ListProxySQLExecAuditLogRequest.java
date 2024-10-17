// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListProxySQLExecAuditLogRequest} extends {@link RequestModel}
 *
 * <p>ListProxySQLExecAuditLogRequest</p>
 */
public class ListProxySQLExecAuditLogRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

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
    @com.aliyun.core.annotation.NameInMap("SQLType")
    private String SQLType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchName")
    private String searchName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private ListProxySQLExecAuditLogRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.endTime = builder.endTime;
        this.execState = builder.execState;
        this.opUserName = builder.opUserName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.SQLType = builder.SQLType;
        this.searchName = builder.searchName;
        this.startTime = builder.startTime;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProxySQLExecAuditLogRequest create() {
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
    public Long getEndTime() {
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
     * @return SQLType
     */
    public String getSQLType() {
        return this.SQLType;
    }

    /**
     * @return searchName
     */
    public String getSearchName() {
        return this.searchName;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<ListProxySQLExecAuditLogRequest, Builder> {
        private String regionId; 
        private Long endTime; 
        private String execState; 
        private String opUserName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String SQLType; 
        private String searchName; 
        private Long startTime; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ListProxySQLExecAuditLogRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.endTime = request.endTime;
            this.execState = request.execState;
            this.opUserName = request.opUserName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.SQLType = request.SQLType;
            this.searchName = request.searchName;
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
         * <p>The end of the time range to query. The value of this parameter must be a timestamp that follows the UNIX time format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1636962846000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The execution status of the SQL statement. Valid values:</p>
         * <ul>
         * <li><strong>FAIL</strong>: The execution of the SQL statement fails.</li>
         * <li><strong>CANCEL</strong>: The execution of the SQL statement is canceled.</li>
         * <li><strong>SUCCESS</strong>: The SQL statement is executed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder execState(String execState) {
            this.putQueryParameter("ExecState", execState);
            this.execState = execState;
            return this;
        }

        /**
         * <p>The alias of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>testNickName</p>
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
         * <p>The number of entries to return on each page. Maximum values: 100.</p>
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
         * <p>The type of SQL statement. Valid values:</p>
         * <ul>
         * <li><strong>SELECT</strong></li>
         * <li><strong>INSERT</strong></li>
         * <li><strong>DELETE</strong></li>
         * <li><strong>CREATE_TABLE</strong></li>
         * </ul>
         * <blockquote>
         * <p> You can choose Operation Audit &gt; Secure Access Proxy in the top navigation bar of the DMS console to view more types of SQL statements.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SELECT</p>
         */
        public Builder SQLType(String SQLType) {
            this.putQueryParameter("SQLType", SQLType);
            this.SQLType = SQLType;
            return this;
        }

        /**
         * <p>The name of the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder searchName(String searchName) {
            this.putQueryParameter("SearchName", searchName);
            this.searchName = searchName;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The value of this parameter must be a timestamp that follows the UNIX time format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1636876446000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> operation to query the tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>14****</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public ListProxySQLExecAuditLogRequest build() {
            return new ListProxySQLExecAuditLogRequest(this);
        } 

    } 

}
