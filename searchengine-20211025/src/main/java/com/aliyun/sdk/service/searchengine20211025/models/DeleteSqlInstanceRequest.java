// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

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
 * {@link DeleteSqlInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeleteSqlInstanceRequest</p>
 */
public class DeleteSqlInstanceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("database")
    @com.aliyun.core.annotation.Validation(required = true)
    private String database;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sqlInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sqlInstanceId;

    private DeleteSqlInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.database = builder.database;
        this.sqlInstanceId = builder.sqlInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSqlInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return database
     */
    public String getDatabase() {
        return this.database;
    }

    /**
     * @return sqlInstanceId
     */
    public Long getSqlInstanceId() {
        return this.sqlInstanceId;
    }

    public static final class Builder extends Request.Builder<DeleteSqlInstanceRequest, Builder> {
        private String instanceId; 
        private String database; 
        private Long sqlInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSqlInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.database = request.database;
            this.sqlInstanceId = request.sqlInstanceId;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-pl32rf0****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>database name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>general</p>
         */
        public Builder database(String database) {
            this.putPathParameter("database", database);
            this.database = database;
            return this;
        }

        /**
         * <p>sqlInstanceId</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sqlInstanceId(Long sqlInstanceId) {
            this.putPathParameter("sqlInstanceId", sqlInstanceId);
            this.sqlInstanceId = sqlInstanceId;
            return this;
        }

        @Override
        public DeleteSqlInstanceRequest build() {
            return new DeleteSqlInstanceRequest(this);
        } 

    } 

}
