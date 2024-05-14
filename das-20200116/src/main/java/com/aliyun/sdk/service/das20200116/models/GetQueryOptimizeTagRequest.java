// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQueryOptimizeTagRequest} extends {@link RequestModel}
 *
 * <p>GetQueryOptimizeTagRequest</p>
 */
public class GetQueryOptimizeTagRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SqlId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sqlId;

    private GetQueryOptimizeTagRequest(Builder builder) {
        super(builder);
        this.engine = builder.engine;
        this.instanceId = builder.instanceId;
        this.sqlId = builder.sqlId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQueryOptimizeTagRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return sqlId
     */
    public String getSqlId() {
        return this.sqlId;
    }

    public static final class Builder extends Request.Builder<GetQueryOptimizeTagRequest, Builder> {
        private String engine; 
        private String instanceId; 
        private String sqlId; 

        private Builder() {
            super();
        } 

        private Builder(GetQueryOptimizeTagRequest request) {
            super(request);
            this.engine = request.engine;
            this.instanceId = request.instanceId;
            this.sqlId = request.sqlId;
        } 

        /**
         * The database engine. Valid values:
         * <p>
         * 
         * *   **MySQL**: ApsaraDB RDS for MySQL
         * *   **PolarDBMySQL**: PolarDB for MySQL
         * *   **PostgreSQL**: ApsaraDB RDS for PostgreSQL
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The SQL template ID. You can call the [GetQueryOptimizeDataStats](~~405261~~) operation to query the SQL template ID.
         */
        public Builder sqlId(String sqlId) {
            this.putQueryParameter("SqlId", sqlId);
            this.sqlId = sqlId;
            return this;
        }

        @Override
        public GetQueryOptimizeTagRequest build() {
            return new GetQueryOptimizeTagRequest(this);
        } 

    } 

}
