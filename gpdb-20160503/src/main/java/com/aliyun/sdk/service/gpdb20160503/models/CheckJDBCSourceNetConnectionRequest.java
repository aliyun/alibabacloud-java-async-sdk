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
 * {@link CheckJDBCSourceNetConnectionRequest} extends {@link RequestModel}
 *
 * <p>CheckJDBCSourceNetConnectionRequest</p>
 */
public class CheckJDBCSourceNetConnectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceId")
    private String dataSourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JdbcConnectionString")
    private String jdbcConnectionString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private CheckJDBCSourceNetConnectionRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.dataSourceId = builder.dataSourceId;
        this.jdbcConnectionString = builder.jdbcConnectionString;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckJDBCSourceNetConnectionRequest create() {
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
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return jdbcConnectionString
     */
    public String getJdbcConnectionString() {
        return this.jdbcConnectionString;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CheckJDBCSourceNetConnectionRequest, Builder> {
        private String DBInstanceId; 
        private String dataSourceId; 
        private String jdbcConnectionString; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CheckJDBCSourceNetConnectionRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.dataSourceId = request.dataSourceId;
            this.jdbcConnectionString = request.jdbcConnectionString;
            this.regionId = request.regionId;
        } 

        /**
         * <p>Instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>Either DataSourceId or JdbcConnectionString must be specified as input, otherwise an error will occur. If both parameters are specified, JdbcConnectionString will be used preferentially.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putQueryParameter("DataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * <p>JDBC connection string.</p>
         * 
         * <strong>example:</strong>
         * <p>jdbc:mysql://rm-xxx.mysql.rds.aliyuncs.com:3306/testadmin</p>
         */
        public Builder jdbcConnectionString(String jdbcConnectionString) {
            this.putQueryParameter("JdbcConnectionString", jdbcConnectionString);
            this.jdbcConnectionString = jdbcConnectionString;
            return this;
        }

        /**
         * <p>The ID of the region where the instance is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CheckJDBCSourceNetConnectionRequest build() {
            return new CheckJDBCSourceNetConnectionRequest(this);
        } 

    } 

}
