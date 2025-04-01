// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link DisableInstanceDasConfigRequest} extends {@link RequestModel}
 *
 * <p>DisableInstanceDasConfigRequest</p>
 */
public class DisableInstanceDasConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleType")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The database engine. Set the value to Redis.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Redis</p>
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * <p>The database instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1nti25tc7bq5****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The type of auto scaling. Valid values:</p>
         * <ul>
         * <li><strong>specScale</strong>: The specifications of a database instance are automatically scaled up or down.</li>
         * <li><strong>shardScale</strong>: The number of shards for a database instance is automatically increased or decreased.</li>
         * <li><strong>bandwidthScale</strong>: The bandwidth of a database instance is automatically increased or decreased.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bandwidthScale</p>
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
