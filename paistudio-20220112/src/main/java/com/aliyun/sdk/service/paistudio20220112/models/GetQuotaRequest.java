// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQuotaRequest} extends {@link RequestModel}
 *
 * <p>GetQuotaRequest</p>
 */
public class GetQuotaRequest extends Request {
    @Path
    @NameInMap("QuotaId")
    private String quotaId;

    private GetQuotaRequest(Builder builder) {
        super(builder);
        this.quotaId = builder.quotaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQuotaRequest create() {
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

    public static final class Builder extends Request.Builder<GetQuotaRequest, Builder> {
        private String quotaId; 

        private Builder() {
            super();
        } 

        private Builder(GetQuotaRequest request) {
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
        public GetQuotaRequest build() {
            return new GetQuotaRequest(this);
        } 

    } 

}
