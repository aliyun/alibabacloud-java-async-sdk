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
 * {@link AicsOpenApiInvokeRequest} extends {@link RequestModel}
 *
 * <p>AicsOpenApiInvokeRequest</p>
 */
public class AicsOpenApiInvokeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Param")
    private java.util.Map<String, ?> param;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private AicsOpenApiInvokeRequest(Builder builder) {
        super(builder);
        this.nodeId = builder.nodeId;
        this.param = builder.param;
        this.serviceId = builder.serviceId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AicsOpenApiInvokeRequest create() {
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
    public java.util.Map<String, ?> getParam() {
        return this.param;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<AicsOpenApiInvokeRequest, Builder> {
        private String nodeId; 
        private java.util.Map<String, ?> param; 
        private String serviceId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(AicsOpenApiInvokeRequest request) {
            super(request);
            this.nodeId = request.nodeId;
            this.param = request.param;
            this.serviceId = request.serviceId;
            this.type = request.type;
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
        public Builder param(java.util.Map<String, ?> param) {
            String paramShrink = shrink(param, "Param", "json");
            this.putBodyParameter("Param", paramShrink);
            this.param = param;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ae5f9884c9914ed7af72b07e6c1616f9</p>
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public AicsOpenApiInvokeRequest build() {
            return new AicsOpenApiInvokeRequest(this);
        } 

    } 

}
