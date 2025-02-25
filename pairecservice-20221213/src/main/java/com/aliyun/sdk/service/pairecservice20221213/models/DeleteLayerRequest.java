// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLayerRequest} extends {@link RequestModel}
 *
 * <p>DeleteLayerRequest</p>
 */
public class DeleteLayerRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("LayerId")
    private String layerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    private DeleteLayerRequest(Builder builder) {
        super(builder);
        this.layerId = builder.layerId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLayerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return layerId
     */
    public String getLayerId() {
        return this.layerId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DeleteLayerRequest, Builder> {
        private String layerId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLayerRequest request) {
            super(request);
            this.layerId = request.layerId;
            this.instanceId = request.instanceId;
        } 

        /**
         * LayerId.
         */
        public Builder layerId(String layerId) {
            this.putPathParameter("LayerId", layerId);
            this.layerId = layerId;
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

        @Override
        public DeleteLayerRequest build() {
            return new DeleteLayerRequest(this);
        } 

    } 

}
