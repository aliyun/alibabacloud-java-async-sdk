// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetIMVMonitorDataRequest} extends {@link RequestModel}
 *
 * <p>ResetIMVMonitorDataRequest</p>
 */
public class ResetIMVMonitorDataRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("Database")
    @Validation(required = true)
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
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * Database.
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
