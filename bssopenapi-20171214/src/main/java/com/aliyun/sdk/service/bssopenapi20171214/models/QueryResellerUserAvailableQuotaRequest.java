// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryResellerUserAvailableQuotaRequest} extends {@link RequestModel}
 *
 * <p>QueryResellerUserAvailableQuotaRequest</p>
 */
public class QueryResellerUserAvailableQuotaRequest extends Request {
    @Query
    @NameInMap("ItemCodes")
    private String itemCodes;

    @Query
    @NameInMap("OwnerId")
    @Validation(required = true)
    private Long ownerId;

    private QueryResellerUserAvailableQuotaRequest(Builder builder) {
        super(builder);
        this.itemCodes = builder.itemCodes;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryResellerUserAvailableQuotaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return itemCodes
     */
    public String getItemCodes() {
        return this.itemCodes;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<QueryResellerUserAvailableQuotaRequest, Builder> {
        private String itemCodes; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(QueryResellerUserAvailableQuotaRequest response) {
            super(response);
            this.itemCodes = response.itemCodes;
            this.ownerId = response.ownerId;
        } 

        /**
         * ItemCodes.
         */
        public Builder itemCodes(String itemCodes) {
            this.putQueryParameter("ItemCodes", itemCodes);
            this.itemCodes = itemCodes;
            return this;
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
        public QueryResellerUserAvailableQuotaRequest build() {
            return new QueryResellerUserAvailableQuotaRequest(this);
        } 

    } 

}
