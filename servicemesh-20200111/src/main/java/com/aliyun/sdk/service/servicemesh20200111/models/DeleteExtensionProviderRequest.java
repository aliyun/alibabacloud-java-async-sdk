// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteExtensionProviderRequest} extends {@link RequestModel}
 *
 * <p>DeleteExtensionProviderRequest</p>
 */
public class DeleteExtensionProviderRequest extends Request {
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

    private DeleteExtensionProviderRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.serviceMeshId = builder.serviceMeshId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteExtensionProviderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DeleteExtensionProviderRequest, Builder> {
        private String name; 
        private String serviceMeshId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DeleteExtensionProviderRequest response) {
            super(response);
            this.name = response.name;
            this.serviceMeshId = response.serviceMeshId;
            this.type = response.type;
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
        public DeleteExtensionProviderRequest build() {
            return new DeleteExtensionProviderRequest(this);
        } 

    } 

}
