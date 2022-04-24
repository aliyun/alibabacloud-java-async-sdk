// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCustomerAddressListRequest} extends {@link RequestModel}
 *
 * <p>QueryCustomerAddressListRequest</p>
 */
public class QueryCustomerAddressListRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private QueryCustomerAddressListRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCustomerAddressListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<QueryCustomerAddressListRequest, Builder> {
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(QueryCustomerAddressListRequest request) {
            super(request);
            this.ownerId = request.ownerId;
        } 

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public QueryCustomerAddressListRequest build() {
            return new QueryCustomerAddressListRequest(this);
        } 

    } 

}
