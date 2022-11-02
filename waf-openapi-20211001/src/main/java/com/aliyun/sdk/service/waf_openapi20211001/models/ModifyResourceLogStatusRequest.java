// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyResourceLogStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyResourceLogStatusRequest</p>
 */
public class ModifyResourceLogStatusRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Resource")
    @Validation(required = true)
    private String resource;

    @Query
    @NameInMap("Status")
    @Validation(required = true)
    private Boolean status;

    private ModifyResourceLogStatusRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.resource = builder.resource;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyResourceLogStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return resource
     */
    public String getResource() {
        return this.resource;
    }

    /**
     * @return status
     */
    public Boolean getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ModifyResourceLogStatusRequest, Builder> {
        private String instanceId; 
        private String resource; 
        private Boolean status; 

        private Builder() {
            super();
        } 

        private Builder(ModifyResourceLogStatusRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.resource = request.resource;
            this.status = request.status;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Resource.
         */
        public Builder resource(String resource) {
            this.putQueryParameter("Resource", resource);
            this.resource = resource;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Boolean status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ModifyResourceLogStatusRequest build() {
            return new ModifyResourceLogStatusRequest(this);
        } 

    } 

}
