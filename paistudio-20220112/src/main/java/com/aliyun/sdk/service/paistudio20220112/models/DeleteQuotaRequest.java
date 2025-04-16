// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link DeleteQuotaRequest} extends {@link RequestModel}
 *
 * <p>DeleteQuotaRequest</p>
 */
public class DeleteQuotaRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("QuotaId")
    private String quotaId;

    private DeleteQuotaRequest(Builder builder) {
        super(builder);
        this.quotaId = builder.quotaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteQuotaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return quotaId
     */
    public String getQuotaId() {
        return this.quotaId;
    }

    public static final class Builder extends Request.Builder<DeleteQuotaRequest, Builder> {
        private String quotaId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteQuotaRequest request) {
            super(request);
            this.quotaId = request.quotaId;
        } 

        /**
         * QuotaId.
         */
        public Builder quotaId(String quotaId) {
            this.putPathParameter("QuotaId", quotaId);
            this.quotaId = quotaId;
            return this;
        }

        @Override
        public DeleteQuotaRequest build() {
            return new DeleteQuotaRequest(this);
        } 

    } 

}
