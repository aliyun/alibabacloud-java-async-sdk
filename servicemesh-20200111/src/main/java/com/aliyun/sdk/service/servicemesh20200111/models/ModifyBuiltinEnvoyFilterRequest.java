// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBuiltinEnvoyFilterRequest} extends {@link RequestModel}
 *
 * <p>ModifyBuiltinEnvoyFilterRequest</p>
 */
public class ModifyBuiltinEnvoyFilterRequest extends Request {
    @Body
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Body
    @NameInMap("IstioVersion")
    @Validation(required = true)
    private String istioVersion;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("Parameters")
    @Validation(required = true)
    private String parameters;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private ModifyBuiltinEnvoyFilterRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.istioVersion = builder.istioVersion;
        this.name = builder.name;
        this.parameters = builder.parameters;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBuiltinEnvoyFilterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return istioVersion
     */
    public String getIstioVersion() {
        return this.istioVersion;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parameters
     */
    public String getParameters() {
        return this.parameters;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<ModifyBuiltinEnvoyFilterRequest, Builder> {
        private String id; 
        private String istioVersion; 
        private String name; 
        private String parameters; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBuiltinEnvoyFilterRequest response) {
            super(response);
            this.id = response.id;
            this.istioVersion = response.istioVersion;
            this.name = response.name;
            this.parameters = response.parameters;
            this.serviceMeshId = response.serviceMeshId;
        } 

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * IstioVersion.
         */
        public Builder istioVersion(String istioVersion) {
            this.putBodyParameter("IstioVersion", istioVersion);
            this.istioVersion = istioVersion;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(String parameters) {
            this.putBodyParameter("Parameters", parameters);
            this.parameters = parameters;
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
        public ModifyBuiltinEnvoyFilterRequest build() {
            return new ModifyBuiltinEnvoyFilterRequest(this);
        } 

    } 

}
