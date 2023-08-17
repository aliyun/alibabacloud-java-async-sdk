// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.docmind_api20220729.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RetryTradeDocumentExtractRequest} extends {@link RequestModel}
 *
 * <p>RetryTradeDocumentExtractRequest</p>
 */
public class RetryTradeDocumentExtractRequest extends Request {
    @Query
    @NameInMap("BizId")
    private String bizId;

    private RetryTradeDocumentExtractRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetryTradeDocumentExtractRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    public static final class Builder extends Request.Builder<RetryTradeDocumentExtractRequest, Builder> {
        private String bizId; 

        private Builder() {
            super();
        } 

        private Builder(RetryTradeDocumentExtractRequest request) {
            super(request);
            this.bizId = request.bizId;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        @Override
        public RetryTradeDocumentExtractRequest build() {
            return new RetryTradeDocumentExtractRequest(this);
        } 

    } 

}
