// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateASMGatewayRequest} extends {@link RequestModel}
 *
 * <p>CreateASMGatewayRequest</p>
 */
public class CreateASMGatewayRequest extends Request {
    @Body
    @NameInMap("Body")
    private String body;

    @Body
    @NameInMap("IstioGatewayName")
    private String istioGatewayName;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private CreateASMGatewayRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
        this.istioGatewayName = builder.istioGatewayName;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateASMGatewayRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return istioGatewayName
     */
    public String getIstioGatewayName() {
        return this.istioGatewayName;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<CreateASMGatewayRequest, Builder> {
        private String body; 
        private String istioGatewayName; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(CreateASMGatewayRequest request) {
            super(request);
            this.body = request.body;
            this.istioGatewayName = request.istioGatewayName;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * Body.
         */
        public Builder body(String body) {
            this.putBodyParameter("Body", body);
            this.body = body;
            return this;
        }

        /**
         * IstioGatewayName.
         */
        public Builder istioGatewayName(String istioGatewayName) {
            this.putBodyParameter("IstioGatewayName", istioGatewayName);
            this.istioGatewayName = istioGatewayName;
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
        public CreateASMGatewayRequest build() {
            return new CreateASMGatewayRequest(this);
        } 

    } 

}
