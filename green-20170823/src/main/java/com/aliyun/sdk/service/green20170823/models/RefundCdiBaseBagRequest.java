// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefundCdiBaseBagRequest} extends {@link RequestModel}
 *
 * <p>RefundCdiBaseBagRequest</p>
 */
public class RefundCdiBaseBagRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ResourceOwnerId")
    private String resourceOwnerId;

    private RefundCdiBaseBagRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefundCdiBaseBagRequest create() {
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
     * @return resourceOwnerId
     */
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<RefundCdiBaseBagRequest, Builder> {
        private String instanceId; 
        private String resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(RefundCdiBaseBagRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.resourceOwnerId = request.resourceOwnerId;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(String resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public RefundCdiBaseBagRequest build() {
            return new RefundCdiBaseBagRequest(this);
        } 

    } 

}
