// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableInstanceDasConfigRequest} extends {@link RequestModel}
 *
 * <p>DisableInstanceDasConfigRequest</p>
 */
public class DisableInstanceDasConfigRequest extends Request {
    @Query
    @NameInMap("Engine")
    @Validation(required = true)
    private String engine;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ScaleType")
    @Validation(required = true)
    private String scaleType;

    private DisableInstanceDasConfigRequest(Builder builder) {
        super(builder);
        this.engine = builder.engine;
        this.instanceId = builder.instanceId;
        this.scaleType = builder.scaleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableInstanceDasConfigRequest create() {
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
     * @return scaleType
     */
    public String getScaleType() {
        return this.scaleType;
    }

    public static final class Builder extends Request.Builder<DisableInstanceDasConfigRequest, Builder> {
        private String engine; 
        private String instanceId; 
        private String scaleType; 

        private Builder() {
            super();
        } 

        private Builder(DisableInstanceDasConfigRequest request) {
            super(request);
            this.engine = request.engine;
            this.instanceId = request.instanceId;
            this.scaleType = request.scaleType;
        } 

        /**
         * The database engine. Set the value to Redis.
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * The database instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The type of auto scaling. Valid values:
         * <p>
         * 
         * *   **specScale**: The specifications of a database instance are automatically scaled up or down.
         * *   **shardScale**: The number of shards for a database instance is automatically increased or decreased.
         * *   **bandwidthScale**: The bandwidth of a database instance is automatically increased or decreased.
         */
        public Builder scaleType(String scaleType) {
            this.putQueryParameter("ScaleType", scaleType);
            this.scaleType = scaleType;
            return this;
        }

        @Override
        public DisableInstanceDasConfigRequest build() {
            return new DisableInstanceDasConfigRequest(this);
        } 

    } 

}
