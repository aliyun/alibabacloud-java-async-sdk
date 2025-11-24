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
 * {@link UpdateIstioInjectionConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateIstioInjectionConfigRequest</p>
 */
public class UpdateIstioInjectionConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataPlaneMode")
    private String dataPlaneMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableIstioInjection")
    private Boolean enableIstioInjection;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableSidecarSetInjection")
    private Boolean enableSidecarSetInjection;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IstioRev")
    private String istioRev;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceMeshId;

    private UpdateIstioInjectionConfigRequest(Builder builder) {
        super(builder);
        this.dataPlaneMode = builder.dataPlaneMode;
        this.enableIstioInjection = builder.enableIstioInjection;
        this.enableSidecarSetInjection = builder.enableSidecarSetInjection;
        this.istioRev = builder.istioRev;
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
     * @return dataPlaneMode
     */
    public String getDataPlaneMode() {
        return this.dataPlaneMode;
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
     * @return istioRev
     */
    public String getIstioRev() {
        return this.istioRev;
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
        private String dataPlaneMode; 
        private Boolean enableIstioInjection; 
        private Boolean enableSidecarSetInjection; 
        private String istioRev; 
        private String namespace; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIstioInjectionConfigRequest request) {
            super(request);
            this.dataPlaneMode = request.dataPlaneMode;
            this.enableIstioInjection = request.enableIstioInjection;
            this.enableSidecarSetInjection = request.enableSidecarSetInjection;
            this.istioRev = request.istioRev;
            this.namespace = request.namespace;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * <p>The data plane mode of the namespace. This parameter is valid only when the Ambient Mesh mode is enabled for the current Service Mesh (ASM) instance. Valid values:</p>
         * <ul>
         * <li>ambient: sets the data plane mode of the namespace to the Ambient Mesh mode.</li>
         * <li>sidecar: sets the data plane mode of the namespace to the Sidecar mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ambient</p>
         */
        public Builder dataPlaneMode(String dataPlaneMode) {
            this.putBodyParameter("DataPlaneMode", dataPlaneMode);
            this.dataPlaneMode = dataPlaneMode;
            return this;
        }

        /**
         * <p>Specifies whether to enable Istio automatic sidecar injection.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableIstioInjection(Boolean enableIstioInjection) {
            this.putBodyParameter("EnableIstioInjection", enableIstioInjection);
            this.enableIstioInjection = enableIstioInjection;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic sidecar injection by using SidecarSet.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableSidecarSetInjection(Boolean enableSidecarSetInjection) {
            this.putBodyParameter("EnableSidecarSetInjection", enableSidecarSetInjection);
            this.enableSidecarSetInjection = enableSidecarSetInjection;
            return this;
        }

        /**
         * <p>Specifies the version to be injected into the namespace. This parameter is valid only when the ASM instance performs a canary release. When IstioRev is not empty, you must not specify EnableIstioInjection and EnableSidecarSetInjection.</p>
         * 
         * <strong>example:</strong>
         * <p>canary</p>
         */
        public Builder istioRev(String istioRev) {
            this.putBodyParameter("IstioRev", istioRev);
            this.istioRev = istioRev;
            return this;
        }

        /**
         * <p>The namespace for which you want to modify the sidecar injection setting.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The ID of the ASM instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ce2cdbb9d013f447180cf5ca8bb******</p>
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
