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
 * {@link DescribeDatabaseRequest} extends {@link RequestModel}
 *
 * <p>DescribeDatabaseRequest</p>
 */
public class DescribeDatabaseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String databaseName;

    private DescribeDatabaseRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.databaseName = builder.databaseName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDatabaseRequest create() {
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
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    public static final class Builder extends Request.Builder<DescribeDatabaseRequest, Builder> {
        private String DBInstanceId; 
        private String databaseName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDatabaseRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.databaseName = request.databaseName;
        } 

        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The name of the database that you want to query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test01</p>
         */
        public Builder databaseName(String databaseName) {
            this.putQueryParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        @Override
        public DescribeDatabaseRequest build() {
            return new DescribeDatabaseRequest(this);
        } 

    } 

}
