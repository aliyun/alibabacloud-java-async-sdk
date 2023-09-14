// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLayerRequest} extends {@link RequestModel}
 *
 * <p>GetLayerRequest</p>
 */
public class GetLayerRequest extends Request {
    @Path
    @NameInMap("LayerId")
    @Validation(required = true)
    private String layerId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private GetLayerRequest(Builder builder) {
        super(builder);
        this.layerId = builder.layerId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLayerRequest create() {
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

    public static final class Builder extends Request.Builder<GetLayerRequest, Builder> {
        private String layerId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetLayerRequest request) {
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
        public GetLayerRequest build() {
            return new GetLayerRequest(this);
        } 

    } 

}
