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
 * {@link CreateServiceMeshResponseBody} extends {@link TeaModel}
 *
 * <p>CreateServiceMeshResponseBody</p>
 */
public class CreateServiceMeshResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateServiceMeshResponseBody model) {
            this.requestId = model.requestId;
            this.serviceMeshId = model.serviceMeshId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BD65C0AD-D3C6-48D3-8D93-38D2015C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the ASM instance.</p>
         * 
         * <strong>example:</strong>
         * <p>c08ba3fd1e6484b0f8cc1ad8fe10d****</p>
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
