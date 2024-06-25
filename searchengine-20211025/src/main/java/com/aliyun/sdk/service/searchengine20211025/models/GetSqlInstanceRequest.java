// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSqlInstanceRequest} extends {@link RequestModel}
 *
 * <p>GetSqlInstanceRequest</p>
 */
public class GetSqlInstanceRequest extends Request {
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("version")
    private Long version;

    private GetSqlInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.database = builder.database;
        this.sqlInstanceId = builder.sqlInstanceId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSqlInstanceRequest create() {
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

    /**
     * @return version
     */
    public Long getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<GetSqlInstanceRequest, Builder> {
        private String instanceId; 
        private String database; 
        private Long sqlInstanceId; 
        private Long version; 

        private Builder() {
            super();
        } 

        private Builder(GetSqlInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.database = request.database;
            this.sqlInstanceId = request.sqlInstanceId;
            this.version = request.version;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * database.
         */
        public Builder database(String database) {
            this.putPathParameter("database", database);
            this.database = database;
            return this;
        }

        /**
         * sqlInstanceId.
         */
        public Builder sqlInstanceId(Long sqlInstanceId) {
            this.putPathParameter("sqlInstanceId", sqlInstanceId);
            this.sqlInstanceId = sqlInstanceId;
            return this;
        }

        /**
         * version.
         */
        public Builder version(Long version) {
            this.putQueryParameter("version", version);
            this.version = version;
            return this;
        }

        @Override
        public GetSqlInstanceRequest build() {
            return new GetSqlInstanceRequest(this);
        } 

    } 

}
