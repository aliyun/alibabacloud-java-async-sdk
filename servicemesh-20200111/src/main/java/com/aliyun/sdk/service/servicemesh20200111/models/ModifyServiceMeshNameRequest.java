// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyServiceMeshNameRequest} extends {@link RequestModel}
 *
 * <p>ModifyServiceMeshNameRequest</p>
 */
public class ModifyServiceMeshNameRequest extends Request {
    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private ModifyServiceMeshNameRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyServiceMeshNameRequest create() {
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

    public static final class Builder extends Request.Builder<ModifyServiceMeshNameRequest, Builder> {
        private String name; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyServiceMeshNameRequest request) {
            super(request);
            this.name = request.name;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * The new name of the ASM instance.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The ASM instance ID.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public ModifyServiceMeshNameRequest build() {
            return new ModifyServiceMeshNameRequest(this);
        } 

    } 

}
