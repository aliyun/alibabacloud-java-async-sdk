// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBatchRegistAnonymousTbAccountResultRequest} extends {@link RequestModel}
 *
 * <p>QueryBatchRegistAnonymousTbAccountResultRequest</p>
 */
public class QueryBatchRegistAnonymousTbAccountResultRequest extends Request {
    @Query
    @NameInMap("BatchId")
    @Validation(required = true)
    private String batchId;

    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    private QueryBatchRegistAnonymousTbAccountResultRequest(Builder builder) {
        super(builder);
        this.batchId = builder.batchId;
        this.bizId = builder.bizId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBatchRegistAnonymousTbAccountResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchId
     */
    public String getBatchId() {
        return this.batchId;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    public static final class Builder extends Request.Builder<QueryBatchRegistAnonymousTbAccountResultRequest, Builder> {
        private String batchId; 
        private String bizId; 

        private Builder() {
            super();
        } 

        private Builder(QueryBatchRegistAnonymousTbAccountResultRequest request) {
            super(request);
            this.batchId = request.batchId;
            this.bizId = request.bizId;
        } 

        /**
         * BatchId.
         */
        public Builder batchId(String batchId) {
            this.putQueryParameter("BatchId", batchId);
            this.batchId = batchId;
            return this;
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
        public QueryBatchRegistAnonymousTbAccountResultRequest build() {
            return new QueryBatchRegistAnonymousTbAccountResultRequest(this);
        } 

    } 

}
