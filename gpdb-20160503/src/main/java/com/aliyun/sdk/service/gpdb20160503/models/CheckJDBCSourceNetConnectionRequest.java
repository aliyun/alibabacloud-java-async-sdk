// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    @com.aliyun.core.annotation.NameInMap("JdbcConnectionString")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jdbcConnectionString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private CheckJDBCSourceNetConnectionRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
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
        private String jdbcConnectionString; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CheckJDBCSourceNetConnectionRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.jdbcConnectionString = request.jdbcConnectionString;
            this.regionId = request.regionId;
        } 

        /**
         * The instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The JDBC connection string.
         */
        public Builder jdbcConnectionString(String jdbcConnectionString) {
            this.putQueryParameter("JdbcConnectionString", jdbcConnectionString);
            this.jdbcConnectionString = jdbcConnectionString;
            return this;
        }

        /**
         * RegionId.
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
