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
 * {@link QueryColumnarLogRequest} extends {@link RequestModel}
 *
 * <p>QueryColumnarLogRequest</p>
 */
public class QueryColumnarLogRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResultRows")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Long maxResultRows;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SQL")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 65536)
    private String SQL;

    private QueryColumnarLogRequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.maxResultRows = builder.maxResultRows;
        this.regionId = builder.regionId;
        this.SQL = builder.SQL;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryColumnarLogRequest create() {
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

    public static final class Builder extends Request.Builder<QueryColumnarLogRequest, Builder> {
        private String DBInstanceName; 
        private Long maxResultRows; 
        private String regionId; 
        private String SQL; 

        private Builder() {
            super();
        } 

        private Builder(QueryColumnarLogRequest request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.maxResultRows = request.maxResultRows;
            this.regionId = request.regionId;
            this.SQL = request.SQL;
        } 

        /**
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
         * <p>最多返回的结果行数。不传时默认 100，取值范围 1~1000；连续取数请在 SQL 中自行分页。</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>select * from device where name = &quot;105506012111488797&quot;</p>
         */
        public Builder SQL(String SQL) {
            this.putQueryParameter("SQL", SQL);
            this.SQL = SQL;
            return this;
        }

        @Override
        public QueryColumnarLogRequest build() {
            return new QueryColumnarLogRequest(this);
        } 

    } 

}
