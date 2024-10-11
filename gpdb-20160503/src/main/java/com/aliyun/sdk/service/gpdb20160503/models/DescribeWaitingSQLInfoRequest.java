// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeWaitingSQLInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeWaitingSQLInfoRequest</p>
 */
public class DescribeWaitingSQLInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Database")
    @com.aliyun.core.annotation.Validation(required = true)
    private String database;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PID")
    @com.aliyun.core.annotation.Validation(required = true)
    private String PID;

    private DescribeWaitingSQLInfoRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.database = builder.database;
        this.PID = builder.PID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWaitingSQLInfoRequest create() {
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

    /**
     * @return PID
     */
    public String getPID() {
        return this.PID;
    }

    public static final class Builder extends Request.Builder<DescribeWaitingSQLInfoRequest, Builder> {
        private String DBInstanceId; 
        private String database; 
        private String PID; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWaitingSQLInfoRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.database = request.database;
            this.PID = request.PID;
        } 

        /**
         * <p>The ID of the instance.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the instance IDs of all AnalyticDB for PostgreSQL instances in a specific region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp12ga6v69h86****</p>
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
         * <p>test</p>
         */
        public Builder database(String database) {
            this.putQueryParameter("Database", database);
            this.database = database;
            return this;
        }

        /**
         * <p>The ID of the process that uniquely identifies the query.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/461735.html">DescribeWaitingSQLRecords</a> operation to obtain the process IDs of lock-waiting queries.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder PID(String PID) {
            this.putQueryParameter("PID", PID);
            this.PID = PID;
            return this;
        }

        @Override
        public DescribeWaitingSQLInfoRequest build() {
            return new DescribeWaitingSQLInfoRequest(this);
        } 

    } 

}
