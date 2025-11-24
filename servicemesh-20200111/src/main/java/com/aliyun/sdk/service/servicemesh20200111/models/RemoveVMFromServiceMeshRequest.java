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
 * {@link RemoveVMFromServiceMeshRequest} extends {@link RequestModel}
 *
 * <p>RemoveVMFromServiceMeshRequest</p>
 */
public class RemoveVMFromServiceMeshRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EcsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ecsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceMeshId;

    private RemoveVMFromServiceMeshRequest(Builder builder) {
        super(builder);
        this.ecsId = builder.ecsId;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveVMFromServiceMeshRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ecsId
     */
    public String getEcsId() {
        return this.ecsId;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<RemoveVMFromServiceMeshRequest, Builder> {
        private String ecsId; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveVMFromServiceMeshRequest request) {
            super(request);
            this.ecsId = request.ecsId;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * <p>The ID of the ECS instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2ze90ts4edj3650****</p>
         */
        public Builder ecsId(String ecsId) {
            this.putQueryParameter("EcsId", ecsId);
            this.ecsId = ecsId;
            return this;
        }

        /**
         * <p>The ASM instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccb37ff104caf419fbf48fb38e6f3****</p>
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putQueryParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public RemoveVMFromServiceMeshRequest build() {
            return new RemoveVMFromServiceMeshRequest(this);
        } 

    } 

}
