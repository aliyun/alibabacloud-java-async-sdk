// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.brain_industrial20200920.models;

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
 * {@link OpenApiInvokeRequest} extends {@link RequestModel}
 *
 * <p>OpenApiInvokeRequest</p>
 */
public class OpenApiInvokeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Param")
    private String param;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    private OpenApiInvokeRequest(Builder builder) {
        super(builder);
        this.nodeId = builder.nodeId;
        this.param = builder.param;
        this.serviceId = builder.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenApiInvokeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return param
     */
    public String getParam() {
        return this.param;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    public static final class Builder extends Request.Builder<OpenApiInvokeRequest, Builder> {
        private String nodeId; 
        private String param; 
        private String serviceId; 

        private Builder() {
            super();
        } 

        private Builder(OpenApiInvokeRequest request) {
            super(request);
            this.nodeId = request.nodeId;
            this.param = request.param;
            this.serviceId = request.serviceId;
        } 

        /**
         * NodeId.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * Param.
         */
        public Builder param(String param) {
            this.putBodyParameter("Param", param);
            this.param = param;
            return this;
        }

        /**
         * ServiceId.
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        @Override
        public OpenApiInvokeRequest build() {
            return new OpenApiInvokeRequest(this);
        } 

    } 

}
