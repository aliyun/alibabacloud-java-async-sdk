// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryResellerAvailableQuotaRequest} extends {@link RequestModel}
 *
 * <p>QueryResellerAvailableQuotaRequest</p>
 */
public class QueryResellerAvailableQuotaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ItemCodes")
    private String itemCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ownerId;

    private QueryResellerAvailableQuotaRequest(Builder builder) {
        super(builder);
        this.itemCodes = builder.itemCodes;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryResellerAvailableQuotaRequest create() {
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

    public static final class Builder extends Request.Builder<QueryResellerAvailableQuotaRequest, Builder> {
        private String itemCodes; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(QueryResellerAvailableQuotaRequest request) {
            super(request);
            this.itemCodes = request.itemCodes;
            this.ownerId = request.ownerId;
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
        public QueryResellerAvailableQuotaRequest build() {
            return new QueryResellerAvailableQuotaRequest(this);
        } 

    } 

}
