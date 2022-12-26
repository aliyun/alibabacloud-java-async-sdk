// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSecurityEventMarkMissListRequest} extends {@link RequestModel}
 *
 * <p>DeleteSecurityEventMarkMissListRequest</p>
 */
public class DeleteSecurityEventMarkMissListRequest extends Request {
    @Query
    @NameInMap("Ids")
    private java.util.List < Long > ids;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private DeleteSecurityEventMarkMissListRequest(Builder builder) {
        super(builder);
        this.ids = builder.ids;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSecurityEventMarkMissListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ids
     */
    public java.util.List < Long > getIds() {
        return this.ids;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<DeleteSecurityEventMarkMissListRequest, Builder> {
        private java.util.List < Long > ids; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSecurityEventMarkMissListRequest request) {
            super(request);
            this.ids = request.ids;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * Ids.
         */
        public Builder ids(java.util.List < Long > ids) {
            this.putQueryParameter("Ids", ids);
            this.ids = ids;
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
        public DeleteSecurityEventMarkMissListRequest build() {
            return new DeleteSecurityEventMarkMissListRequest(this);
        } 

    } 

}
