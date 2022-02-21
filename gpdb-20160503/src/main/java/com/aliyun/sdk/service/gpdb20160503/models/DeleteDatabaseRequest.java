// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDatabaseRequest} extends {@link RequestModel}
 *
 * <p>DeleteDatabaseRequest</p>
 */
public class DeleteDatabaseRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("DBName")
    private String DBName;

    private DeleteDatabaseRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.DBName = builder.DBName;
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
     * @return DBName
     */
    public String getDBName() {
        return this.DBName;
    }

    public static final class Builder extends Request.Builder<DeleteDatabaseRequest, Builder> {
        private String DBInstanceId; 
        private String DBName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDatabaseRequest response) {
            super(response);
            this.DBInstanceId = response.DBInstanceId;
            this.DBName = response.DBName;
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
         * DBName.
         */
        public Builder DBName(String DBName) {
            this.putQueryParameter("DBName", DBName);
            this.DBName = DBName;
            return this;
        }

        @Override
        public DeleteDatabaseRequest build() {
            return new DeleteDatabaseRequest(this);
        } 

    } 

}
