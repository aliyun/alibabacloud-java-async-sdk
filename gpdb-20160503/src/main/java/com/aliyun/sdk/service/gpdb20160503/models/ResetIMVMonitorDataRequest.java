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
 * {@link ResetIMVMonitorDataRequest} extends {@link RequestModel}
 *
 * <p>ResetIMVMonitorDataRequest</p>
 */
public class ResetIMVMonitorDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Database")
    @com.aliyun.core.annotation.Validation(required = true)
    private String database;

    private ResetIMVMonitorDataRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.database = builder.database;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetIMVMonitorDataRequest create() {
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
     * @return database
     */
    public String getDatabase() {
        return this.database;
    }

    public static final class Builder extends Request.Builder<ResetIMVMonitorDataRequest, Builder> {
        private String DBInstanceId; 
        private String database; 

        private Builder() {
            super();
        } 

        private Builder(ResetIMVMonitorDataRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.database = request.database;
        } 

        /**
         * <p>The instance ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp152460513z****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The name of the database.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testdb</p>
         */
        public Builder database(String database) {
            this.putQueryParameter("Database", database);
            this.database = database;
            return this;
        }

        @Override
        public ResetIMVMonitorDataRequest build() {
            return new ResetIMVMonitorDataRequest(this);
        } 

    } 

}
