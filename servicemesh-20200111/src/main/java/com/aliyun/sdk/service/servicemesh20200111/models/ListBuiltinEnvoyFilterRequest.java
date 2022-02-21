// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBuiltinEnvoyFilterRequest} extends {@link RequestModel}
 *
 * <p>ListBuiltinEnvoyFilterRequest</p>
 */
public class ListBuiltinEnvoyFilterRequest extends Request {
    @Body
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private ListBuiltinEnvoyFilterRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBuiltinEnvoyFilterRequest create() {
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
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<ListBuiltinEnvoyFilterRequest, Builder> {
        private String id; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(ListBuiltinEnvoyFilterRequest response) {
            super(response);
            this.id = response.id;
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
         * ServiceMeshId.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public ListBuiltinEnvoyFilterRequest build() {
            return new ListBuiltinEnvoyFilterRequest(this);
        } 

    } 

}
