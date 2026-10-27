// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link QueryColumnarLogSSERequest} extends {@link RequestModel}
 *
 * <p>QueryColumnarLogSSERequest</p>
 */
public class QueryColumnarLogSSERequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResultRows")
    @com.aliyun.core.annotation.Validation(maximum = 10000, minimum = 1)
    private Long maxResultRows;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SQL")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 65536)
    private String SQL;

    private QueryColumnarLogSSERequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.maxResultRows = builder.maxResultRows;
        this.regionId = builder.regionId;
        this.SQL = builder.SQL;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryColumnarLogSSERequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return maxResultRows
     */
    public Long getMaxResultRows() {
        return this.maxResultRows;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return SQL
     */
    public String getSQL() {
        return this.SQL;
    }

    public static final class Builder extends Request.Builder<QueryColumnarLogSSERequest, Builder> {
        private String DBInstanceName; 
        private Long maxResultRows; 
        private String regionId; 
        private String SQL; 

        private Builder() {
            super();
        } 

        private Builder(QueryColumnarLogSSERequest request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.maxResultRows = request.maxResultRows;
            this.regionId = request.regionId;
            this.SQL = request.SQL;
        } 

        /**
         * <p>The ID of the PolarDB-X instance whose column store audit logs you want to query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-********</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>The maximum number of result rows to return for this request. Valid values: 1 to 10000. If this parameter is not specified, no additional row limit is applied to the SQL statement submitted by the caller. The result is still subject to the server-side SSE upper limit of 10000 rows and the top-level LIMIT clause in the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder maxResultRows(Long maxResultRows) {
            this.putQueryParameter("MaxResultRows", maxResultRows);
            this.maxResultRows = maxResultRows;
            return this;
        }

        /**
         * <p>The region ID of the request. The value must match the region where the SQLQuery service is deployed.</p>
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
         * <p>The read-only query statement to execute. Only a single MySQL SELECT statement is supported. The query table must use the fully qualified form polardbx_sls.<table_name>, and only the following tables are allowed: polardbx_sls.polardbx_log (kernel logs), polardbx_sls.slow_detail_log (slow query logs), polardbx_sls.slow_trans_log (slow transaction logs), and polardbx_sls.sql_audit_log (audit logs). Multi-statement queries, write operations, locks, user variables, dynamic placeholders, and reserved hints are not supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM polardbx_sls.sql_audit_log LIMIT 100</p>
         */
        public Builder SQL(String SQL) {
            this.putQueryParameter("SQL", SQL);
            this.SQL = SQL;
            return this;
        }

        @Override
        public QueryColumnarLogSSERequest build() {
            return new QueryColumnarLogSSERequest(this);
        } 

    } 

}
