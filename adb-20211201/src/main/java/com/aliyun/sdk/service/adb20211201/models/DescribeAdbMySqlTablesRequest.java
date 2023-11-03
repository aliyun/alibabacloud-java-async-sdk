// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAdbMySqlTablesRequest} extends {@link RequestModel}
 *
 * <p>DescribeAdbMySqlTablesRequest</p>
 */
public class DescribeAdbMySqlTablesRequest extends Request {
    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Schema")
    private String schema;

    private DescribeAdbMySqlTablesRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.regionId = builder.regionId;
        this.schema = builder.schema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAdbMySqlTablesRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return schema
     */
    public String getSchema() {
        return this.schema;
    }

    public static final class Builder extends Request.Builder<DescribeAdbMySqlTablesRequest, Builder> {
        private String DBClusterId; 
        private String regionId; 
        private String schema; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAdbMySqlTablesRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.regionId = request.regionId;
            this.schema = request.schema;
        } 

        /**
         * The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The region ID of the cluster.
         * <p>
         * 
         * >  You can call the [DescribeRegions](~~454314~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The name of the database.
         */
        public Builder schema(String schema) {
            this.putQueryParameter("Schema", schema);
            this.schema = schema;
            return this;
        }

        @Override
        public DescribeAdbMySqlTablesRequest build() {
            return new DescribeAdbMySqlTablesRequest(this);
        } 

    } 

}
