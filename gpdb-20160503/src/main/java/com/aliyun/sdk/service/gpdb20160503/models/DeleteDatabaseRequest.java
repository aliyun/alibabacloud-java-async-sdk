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
 * {@link DeleteDatabaseRequest} extends {@link RequestModel}
 *
 * <p>DeleteDatabaseRequest</p>
 */
public class DeleteDatabaseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String databaseName;

    private DeleteDatabaseRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.databaseName = builder.databaseName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDatabaseRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteDatabaseRequest, Builder> {
        private String DBInstanceId; 
        private String databaseName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDatabaseRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.databaseName = request.databaseName;
        } 

        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the IDs of all AnalyticDB for PostgreSQL instances in the specified region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The name of the queried database.</p>
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
        public DeleteDatabaseRequest build() {
            return new DeleteDatabaseRequest(this);
        } 

    } 

}
