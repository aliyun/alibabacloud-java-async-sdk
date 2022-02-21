// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateExtensionProviderRequest} extends {@link RequestModel}
 *
 * <p>UpdateExtensionProviderRequest</p>
 */
public class UpdateExtensionProviderRequest extends Request {
    @Body
    @NameInMap("Config")
    private String config;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    @Body
    @NameInMap("Type")
    private String type;

    private UpdateExtensionProviderRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.name = builder.name;
        this.serviceMeshId = builder.serviceMeshId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateExtensionProviderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<UpdateExtensionProviderRequest, Builder> {
        private String config; 
        private String name; 
        private String serviceMeshId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UpdateExtensionProviderRequest response) {
            super(response);
            this.config = response.config;
            this.name = response.name;
            this.serviceMeshId = response.serviceMeshId;
            this.type = response.type;
        } 

        /**
         * Config.
         */
        public Builder config(String config) {
            this.putBodyParameter("Config", config);
            this.config = config;
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
         * ServiceMeshId.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public UpdateExtensionProviderRequest build() {
            return new UpdateExtensionProviderRequest(this);
        } 

    } 

}
