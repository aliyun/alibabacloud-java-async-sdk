// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link GetEdgeInstanceMessageRoutingRequest} extends {@link RequestModel}
 *
 * <p>GetEdgeInstanceMessageRoutingRequest</p>
 */
public class GetEdgeInstanceMessageRoutingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long routeId;

    private GetEdgeInstanceMessageRoutingRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.iotInstanceId = builder.iotInstanceId;
        this.routeId = builder.routeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEdgeInstanceMessageRoutingRequest create() {
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
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return routeId
     */
    public Long getRouteId() {
        return this.routeId;
    }

    public static final class Builder extends Request.Builder<GetEdgeInstanceMessageRoutingRequest, Builder> {
        private String instanceId; 
        private String iotInstanceId; 
        private Long routeId; 

        private Builder() {
            super();
        } 

        private Builder(GetEdgeInstanceMessageRoutingRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.iotInstanceId = request.iotInstanceId;
            this.routeId = request.routeId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8jKxIuMVT9rX********</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder routeId(Long routeId) {
            this.putQueryParameter("RouteId", routeId);
            this.routeId = routeId;
            return this;
        }

        @Override
        public GetEdgeInstanceMessageRoutingRequest build() {
            return new GetEdgeInstanceMessageRoutingRequest(this);
        } 

    } 

}
