// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQueryOptimizeExecErrorSampleRequest} extends {@link RequestModel}
 *
 * <p>GetQueryOptimizeExecErrorSampleRequest</p>
 */
public class GetQueryOptimizeExecErrorSampleRequest extends Request {
    @Query
    @NameInMap("Engine")
    @Validation(required = true)
    private String engine;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("SqlId")
    @Validation(required = true)
    private String sqlId;

    @Query
    @NameInMap("Time")
    @Validation(required = true)
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

        private Builder(GetQueryOptimizeExecErrorSampleRequest response) {
            super(response);
            this.engine = response.engine;
            this.instanceId = response.instanceId;
            this.sqlId = response.sqlId;
            this.time = response.time;
        } 

        /**
         * Engine.
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * SqlId.
         */
        public Builder sqlId(String sqlId) {
            this.putQueryParameter("SqlId", sqlId);
            this.sqlId = sqlId;
            return this;
        }

        /**
         * Time.
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
