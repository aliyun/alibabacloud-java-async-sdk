// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefundWebSiteInstanceRequest} extends {@link RequestModel}
 *
 * <p>RefundWebSiteInstanceRequest</p>
 */
public class RefundWebSiteInstanceRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ResourceOwnerId")
    private String resourceOwnerId;

    private RefundWebSiteInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefundWebSiteInstanceRequest create() {
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

    public static final class Builder extends Request.Builder<RefundWebSiteInstanceRequest, Builder> {
        private String instanceId; 
        private String resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(RefundWebSiteInstanceRequest request) {
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
        public RefundWebSiteInstanceRequest build() {
            return new RefundWebSiteInstanceRequest(this);
        } 

    } 

}
