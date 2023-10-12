// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteResourceInformationRequest} extends {@link RequestModel}
 *
 * <p>DeleteResourceInformationRequest</p>
 */
public class DeleteResourceInformationRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Body
    @NameInMap("ResourceInformationId")
    @Validation(required = true)
    private String resourceInformationId;

    private DeleteResourceInformationRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.resourceInformationId = builder.resourceInformationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteResourceInformationRequest create() {
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
     * @return resourceInformationId
     */
    public String getResourceInformationId() {
        return this.resourceInformationId;
    }

    public static final class Builder extends Request.Builder<DeleteResourceInformationRequest, Builder> {
        private String instanceId; 
        private String resourceInformationId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteResourceInformationRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.resourceInformationId = request.resourceInformationId;
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
         * ResourceInformationId.
         */
        public Builder resourceInformationId(String resourceInformationId) {
            this.putBodyParameter("ResourceInformationId", resourceInformationId);
            this.resourceInformationId = resourceInformationId;
            return this;
        }

        @Override
        public DeleteResourceInformationRequest build() {
            return new DeleteResourceInformationRequest(this);
        } 

    } 

}
