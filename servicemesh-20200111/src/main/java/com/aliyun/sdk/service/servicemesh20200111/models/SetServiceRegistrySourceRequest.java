// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetServiceRegistrySourceRequest} extends {@link RequestModel}
 *
 * <p>SetServiceRegistrySourceRequest</p>
 */
public class SetServiceRegistrySourceRequest extends Request {
    @Body
    @NameInMap("Config")
    @Validation(required = true)
    private java.util.Map < String, ? > config;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private SetServiceRegistrySourceRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetServiceRegistrySourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public java.util.Map < String, ? > getConfig() {
        return this.config;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<SetServiceRegistrySourceRequest, Builder> {
        private java.util.Map < String, ? > config; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(SetServiceRegistrySourceRequest response) {
            super(response);
            this.config = response.config;
            this.serviceMeshId = response.serviceMeshId;
        } 

        /**
         * Config.
         */
        public Builder config(java.util.Map < String, ? > config) {
            this.putBodyParameter("Config", config);
            this.config = config;
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
        public SetServiceRegistrySourceRequest build() {
            return new SetServiceRegistrySourceRequest(this);
        } 

    } 

}
