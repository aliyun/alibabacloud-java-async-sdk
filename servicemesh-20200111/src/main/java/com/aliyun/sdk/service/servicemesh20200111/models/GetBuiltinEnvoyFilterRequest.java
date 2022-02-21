// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBuiltinEnvoyFilterRequest} extends {@link RequestModel}
 *
 * <p>GetBuiltinEnvoyFilterRequest</p>
 */
public class GetBuiltinEnvoyFilterRequest extends Request {
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
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private GetBuiltinEnvoyFilterRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.istioVersion = builder.istioVersion;
        this.name = builder.name;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBuiltinEnvoyFilterRequest create() {
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
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<GetBuiltinEnvoyFilterRequest, Builder> {
        private String id; 
        private String istioVersion; 
        private String name; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(GetBuiltinEnvoyFilterRequest response) {
            super(response);
            this.id = response.id;
            this.istioVersion = response.istioVersion;
            this.name = response.name;
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
         * ServiceMeshId.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public GetBuiltinEnvoyFilterRequest build() {
            return new GetBuiltinEnvoyFilterRequest(this);
        } 

    } 

}
