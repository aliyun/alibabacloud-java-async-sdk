// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SelectResourceRequest} extends {@link RequestModel}
 *
 * <p>SelectResourceRequest</p>
 */
public class SelectResourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("idempotentId")
    private String idempotentId;

    private SelectResourceRequest(Builder builder) {
        super(builder);
        this.idempotentId = builder.idempotentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SelectResourceRequest create() {
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

    public static final class Builder extends Request.Builder<SelectResourceRequest, Builder> {
        private String idempotentId; 

        private Builder() {
            super();
        } 

        private Builder(SelectResourceRequest request) {
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
        public SelectResourceRequest build() {
            return new SelectResourceRequest(this);
        } 

    } 

}
