// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryAvatarResourceRequest} extends {@link RequestModel}
 *
 * <p>QueryAvatarResourceRequest</p>
 */
public class QueryAvatarResourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("idempotentId")
    private String idempotentId;

    private QueryAvatarResourceRequest(Builder builder) {
        super(builder);
        this.idempotentId = builder.idempotentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAvatarResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return idempotentId
     */
    public String getIdempotentId() {
        return this.idempotentId;
    }

    public static final class Builder extends Request.Builder<QueryAvatarResourceRequest, Builder> {
        private String idempotentId; 

        private Builder() {
            super();
        } 

        private Builder(QueryAvatarResourceRequest request) {
            super(request);
            this.idempotentId = request.idempotentId;
        } 

        /**
         * idempotentId.
         */
        public Builder idempotentId(String idempotentId) {
            this.putQueryParameter("idempotentId", idempotentId);
            this.idempotentId = idempotentId;
            return this;
        }

        @Override
        public QueryAvatarResourceRequest build() {
            return new QueryAvatarResourceRequest(this);
        } 

    } 

}
