// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIstioInjectionConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateIstioInjectionConfigRequest</p>
 */
public class UpdateIstioInjectionConfigRequest extends Request {
    @Body
    @NameInMap("EnableIstioInjection")
    private Boolean enableIstioInjection;

    @Body
    @NameInMap("EnableSidecarSetInjection")
    private Boolean enableSidecarSetInjection;

    @Body
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private UpdateIstioInjectionConfigRequest(Builder builder) {
        super(builder);
        this.enableIstioInjection = builder.enableIstioInjection;
        this.enableSidecarSetInjection = builder.enableSidecarSetInjection;
        this.namespace = builder.namespace;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIstioInjectionConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enableIstioInjection
     */
    public Boolean getEnableIstioInjection() {
        return this.enableIstioInjection;
    }

    /**
     * @return enableSidecarSetInjection
     */
    public Boolean getEnableSidecarSetInjection() {
        return this.enableSidecarSetInjection;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<UpdateIstioInjectionConfigRequest, Builder> {
        private Boolean enableIstioInjection; 
        private Boolean enableSidecarSetInjection; 
        private String namespace; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIstioInjectionConfigRequest response) {
            super(response);
            this.enableIstioInjection = response.enableIstioInjection;
            this.enableSidecarSetInjection = response.enableSidecarSetInjection;
            this.namespace = response.namespace;
            this.serviceMeshId = response.serviceMeshId;
        } 

        /**
         * EnableIstioInjection.
         */
        public Builder enableIstioInjection(Boolean enableIstioInjection) {
            this.putBodyParameter("EnableIstioInjection", enableIstioInjection);
            this.enableIstioInjection = enableIstioInjection;
            return this;
        }

        /**
         * EnableSidecarSetInjection.
         */
        public Builder enableSidecarSetInjection(Boolean enableSidecarSetInjection) {
            this.putBodyParameter("EnableSidecarSetInjection", enableSidecarSetInjection);
            this.enableSidecarSetInjection = enableSidecarSetInjection;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
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
        public UpdateIstioInjectionConfigRequest build() {
            return new UpdateIstioInjectionConfigRequest(this);
        } 

    } 

}
