// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDBInstanceNetInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBInstanceNetInfoRequest</p>
 */
public class DescribeDBInstanceNetInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionString")
    private String connectionString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    private DescribeDBInstanceNetInfoRequest(Builder builder) {
        super(builder);
        this.connectionString = builder.connectionString;
        this.DBInstanceId = builder.DBInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceNetInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectionString
     */
    public String getConnectionString() {
        return this.connectionString;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public static final class Builder extends Request.Builder<DescribeDBInstanceNetInfoRequest, Builder> {
        private String connectionString; 
        private String DBInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBInstanceNetInfoRequest request) {
            super(request);
            this.connectionString = request.connectionString;
            this.DBInstanceId = request.DBInstanceId;
        } 

        /**
         * <p>The endpoint that is used to connect to the instance.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the information about all endpoints of the instance is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>gp-0xin9q82c33xc****-master.gpdb.rds.aliyuncs.com</p>
         */
        public Builder connectionString(String connectionString) {
            this.putQueryParameter("ConnectionString", connectionString);
            this.connectionString = connectionString;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        @Override
        public DescribeDBInstanceNetInfoRequest build() {
            return new DescribeDBInstanceNetInfoRequest(this);
        } 

    } 

}
