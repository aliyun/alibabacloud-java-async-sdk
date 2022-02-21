// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceMeshResponseBody} extends {@link TeaModel}
 *
 * <p>CreateServiceMeshResponseBody</p>
 */
public class CreateServiceMeshResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceMeshId")
    private String serviceMeshId;

    private CreateServiceMeshResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceMeshResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder {
        private String requestId; 
        private String serviceMeshId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServiceMeshId.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        public CreateServiceMeshResponseBody build() {
            return new CreateServiceMeshResponseBody(this);
        } 

    } 

}
