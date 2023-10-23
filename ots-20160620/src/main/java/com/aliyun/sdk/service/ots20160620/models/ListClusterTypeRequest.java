// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ots20160620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterTypeRequest} extends {@link RequestModel}
 *
 * <p>ListClusterTypeRequest</p>
 */
public class ListClusterTypeRequest extends Request {
    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ListClusterTypeRequest(Builder builder) {
        super(builder);
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<ListClusterTypeRequest, Builder> {
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ListClusterTypeRequest request) {
            super(request);
            this.resourceOwnerId = request.resourceOwnerId;
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
        public ListClusterTypeRequest build() {
            return new ListClusterTypeRequest(this);
        } 

    } 

}
