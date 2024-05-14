// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQueryOptimizeExecErrorSampleRequest} extends {@link RequestModel}
 *
 * <p>GetQueryOptimizeExecErrorSampleRequest</p>
 */
public class GetQueryOptimizeExecErrorSampleRequest extends Request {
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Time")
    @com.aliyun.core.annotation.Validation(required = true)
    private String time;

    private GetQueryOptimizeExecErrorSampleRequest(Builder builder) {
        super(builder);
        this.engine = builder.engine;
        this.instanceId = builder.instanceId;
        this.sqlId = builder.sqlId;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQueryOptimizeExecErrorSampleRequest create() {
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

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    public static final class Builder extends Request.Builder<GetQueryOptimizeExecErrorSampleRequest, Builder> {
        private String engine; 
        private String instanceId; 
        private String sqlId; 
        private String time; 

        private Builder() {
            super();
        } 

        private Builder(GetQueryOptimizeExecErrorSampleRequest request) {
            super(request);
            this.engine = request.engine;
            this.instanceId = request.instanceId;
            this.sqlId = request.sqlId;
            this.time = request.time;
        } 

        /**
         * The database engine. Valid values:
         * <p>
         * 
         * *   **MySQL**
         * *   **PolarDBMySQL**
         * *   **PostgreSQL**
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
         * The SQL template ID. You can call the [GetQueryOptimizeExecErrorStats](~~405235~~) operation to obtain the SQL template ID.
         */
        public Builder sqlId(String sqlId) {
            this.putQueryParameter("SqlId", sqlId);
            this.sqlId = sqlId;
            return this;
        }

        /**
         * The date to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder time(String time) {
            this.putQueryParameter("Time", time);
            this.time = time;
            return this;
        }

        @Override
        public GetQueryOptimizeExecErrorSampleRequest build() {
            return new GetQueryOptimizeExecErrorSampleRequest(this);
        } 

    } 

}
