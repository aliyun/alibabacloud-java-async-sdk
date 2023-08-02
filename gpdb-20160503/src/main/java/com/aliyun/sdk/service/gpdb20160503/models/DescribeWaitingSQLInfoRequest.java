// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWaitingSQLInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeWaitingSQLInfoRequest</p>
 */
public class DescribeWaitingSQLInfoRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("Database")
    @Validation(required = true)
    private String database;

    @Query
    @NameInMap("PID")
    @Validation(required = true)
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
         * The ID of the instance.
         * <p>
         * 
         * >  You can call the [DescribeDBInstances](~~86911~~) operation to query the instance IDs of all AnalyticDB for PostgreSQL instances in a specific region.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The name of the database.
         */
        public Builder database(String database) {
            this.putQueryParameter("Database", database);
            this.database = database;
            return this;
        }

        /**
         * The ID of the process that uniquely identifies the query.
         * <p>
         * 
         * >  You can call the [DescribeWaitingSQLRecords](~~461735~~) operation to obtain the process IDs of lock-waiting queries.
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
