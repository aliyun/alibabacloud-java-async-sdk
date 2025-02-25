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
 * {@link GetOpLogRequest} extends {@link RequestModel}
 *
 * <p>GetOpLogRequest</p>
 */
public class GetOpLogRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseName")
    private String databaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Module")
    private String module;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    private Long tid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserNick")
    private String userNick;

    private GetOpLogRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.databaseName = builder.databaseName;
        this.endTime = builder.endTime;
        this.module = builder.module;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.tid = builder.tid;
        this.userNick = builder.userNick;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOpLogRequest create() {
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
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return module
     */
    public String getModule() {
        return this.module;
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
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    /**
     * @return userNick
     */
    public String getUserNick() {
        return this.userNick;
    }

    public static final class Builder extends Request.Builder<GetOpLogRequest, Builder> {
        private String regionId; 
        private String databaseName; 
        private String endTime; 
        private String module; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String startTime; 
        private Long tid; 
        private String userNick; 

        private Builder() {
            super();
        } 

        private Builder(GetOpLogRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.databaseName = request.databaseName;
            this.endTime = request.endTime;
            this.module = request.module;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
            this.tid = request.tid;
            this.userNick = request.userNick;
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
         * <p>DatabaseName.</p>
         * 
         * <strong>example:</strong>
         * <p>dmstest@rm-bp1qb97d4b****.mysql.rds.aliyuncs.com:3306[poc_dev]</p>
         */
        public Builder databaseName(String databaseName) {
            this.putQueryParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * <p>The end of the time range to query. Specify the time in the yyyy-MM-DD HH:mm:ss format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-29 10:00:00</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The functional module for which you want to query operation logs. If you do not specify this parameter, operation logs for all functional modules are returned. Valid values:</p>
         * <ul>
         * <li><strong>PERMISSION</strong>: permissions</li>
         * <li><strong>OWNER</strong>: data owner</li>
         * <li><strong>SQL_CONSOLE</strong>: data query</li>
         * <li><strong>SQL_CONSOLE_EXPORT</strong>: query result export</li>
         * <li><strong>DATA_CHANGE</strong>: data change</li>
         * <li><strong>DATA_EXPORT</strong>: data export</li>
         * <li><strong>SQL_REVIEW</strong>: SQL review</li>
         * <li><strong>DT_SYNC</strong>: database and table synchronization</li>
         * <li><strong>DT_DETAIL</strong>: database and table details</li>
         * <li><strong>DB_TASK</strong>: task management</li>
         * <li><strong>INSTANCE_MANAGE</strong>: instance management</li>
         * <li><strong>USER_MANAGE</strong>: user management</li>
         * <li><strong>SECURITY_RULE</strong>: security rules</li>
         * <li><strong>CONFIG_MANAGE</strong>: configuration management</li>
         * <li><strong>RESOURCE_AUTH</strong>: resource authorization</li>
         * <li><strong>ACCESS_WHITE_IP</strong>: access IP address whitelist</li>
         * <li><strong>NDDL</strong>: schema design</li>
         * <li><strong>DSQL_CONSOLE</strong>: cross-database data query</li>
         * <li><strong>DSQL_CONSOLE_EXPORT</strong>: cross-database query result export</li>
         * <li><strong>DATA_TRACT</strong>: data tracking</li>
         * <li><strong>DATA_QUALITY</strong>: data quality</li>
         * <li><strong>DATALINK_MANAGE</strong> :DBLink management</li>
         * <li><strong>DATASEC_MANAGE</strong>: sensitive data management</li>
         * <li><strong>SELL</strong>: sales</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SECURITY_RULE</p>
         */
        public Builder module(String module) {
            this.putQueryParameter("Module", module);
            this.module = module;
            return this;
        }

        /**
         * <p>The number of the page to return. Pages start from page 1.</p>
         * <p>This parameter is required.</p>
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
         * <p>The number of entries to return on each page. Valid values:</p>
         * <ul>
         * <li>30</li>
         * <li>50</li>
         * <li>100</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The beginning of the time range to query. Specify the time in the yyyy-MM-DD HH:mm:ss format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-23 10:00:00</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to query the tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * <p>UserNick.</p>
         * 
         * <strong>example:</strong>
         * <p>test_name</p>
         */
        public Builder userNick(String userNick) {
            this.putQueryParameter("UserNick", userNick);
            this.userNick = userNick;
            return this;
        }

        @Override
        public GetOpLogRequest build() {
            return new GetOpLogRequest(this);
        } 

    } 

}
