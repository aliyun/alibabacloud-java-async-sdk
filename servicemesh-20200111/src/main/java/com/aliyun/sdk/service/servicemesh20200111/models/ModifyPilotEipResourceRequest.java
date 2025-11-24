// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link ModifyPilotEipResourceRequest} extends {@link RequestModel}
 *
 * <p>ModifyPilotEipResourceRequest</p>
 */
public class ModifyPilotEipResourceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EipId")
    private String eipId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsCanary")
    private Boolean isCanary;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Operation")
    private String operation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    private String serviceMeshId;

    private ModifyPilotEipResourceRequest(Builder builder) {
        super(builder);
        this.eipId = builder.eipId;
        this.isCanary = builder.isCanary;
        this.operation = builder.operation;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPilotEipResourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eipId
     */
    public String getEipId() {
        return this.eipId;
    }

    /**
     * @return isCanary
     */
    public Boolean getIsCanary() {
        return this.isCanary;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<ModifyPilotEipResourceRequest, Builder> {
        private String eipId; 
        private Boolean isCanary; 
        private String operation; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPilotEipResourceRequest request) {
            super(request);
            this.eipId = request.eipId;
            this.isCanary = request.isCanary;
            this.operation = request.operation;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * EipId.
         */
        public Builder eipId(String eipId) {
            this.putBodyParameter("EipId", eipId);
            this.eipId = eipId;
            return this;
        }

        /**
         * <p>The type of the Istio Pilot with which you want to associate the EIPs. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Bind an EIP to the Istio Pilot during canary release (only valid during the canary release).</li>
         * <li><code>false</code>: Bind an EIP to the Istio Pilot in stable state.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isCanary(Boolean isCanary) {
            this.putBodyParameter("IsCanary", isCanary);
            this.isCanary = isCanary;
            return this;
        }

        /**
         * <p>The type of the operation that you want to perform. Valid values:</p>
         * <ul>
         * <li><code>UnBindEip</code>: unbinds an elastic IP address (EIP) from the Istio Pilot.</li>
         * <li><code>BindEip</code>: binds an EIP to the Istio Pilot.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BindEip</p>
         */
        public Builder operation(String operation) {
            this.putBodyParameter("Operation", operation);
            this.operation = operation;
            return this;
        }

        /**
         * ServiceMeshId.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public ModifyPilotEipResourceRequest build() {
            return new ModifyPilotEipResourceRequest(this);
        } 

    } 

}
