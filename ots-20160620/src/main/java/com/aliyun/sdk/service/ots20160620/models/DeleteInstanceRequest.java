// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ots20160620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeleteInstanceRequest</p>
 */
public class DeleteInstanceRequest extends Request {
    @Query
    @NameInMap("InstanceName")
    @Validation(required = true)
    private String instanceName;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private DeleteInstanceRequest(Builder builder) {
        super(builder);
        this.instanceName = builder.instanceName;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<DeleteInstanceRequest, Builder> {
        private String instanceName; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteInstanceRequest request) {
            super(request);
            this.instanceName = request.instanceName;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public DeleteInstanceRequest build() {
            return new DeleteInstanceRequest(this);
        } 

    } 

}
