// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTransactionRequest} extends {@link RequestModel}
 *
 * <p>QueryTransactionRequest</p>
 */
public class QueryTransactionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Bizid")
    private String bizid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Hash")
    private String hash;

    private QueryTransactionRequest(Builder builder) {
        super(builder);
        this.bizid = builder.bizid;
        this.hash = builder.hash;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTransactionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizid
     */
    public String getBizid() {
        return this.bizid;
    }

    /**
     * @return hash
     */
    public String getHash() {
        return this.hash;
    }

    public static final class Builder extends Request.Builder<QueryTransactionRequest, Builder> {
        private String bizid; 
        private String hash; 

        private Builder() {
            super();
        } 

        private Builder(QueryTransactionRequest request) {
            super(request);
            this.bizid = request.bizid;
            this.hash = request.hash;
        } 

        /**
         * Bizid.
         */
        public Builder bizid(String bizid) {
            this.putBodyParameter("Bizid", bizid);
            this.bizid = bizid;
            return this;
        }

        /**
         * Hash.
         */
        public Builder hash(String hash) {
            this.putBodyParameter("Hash", hash);
            this.hash = hash;
            return this;
        }

        @Override
        public QueryTransactionRequest build() {
            return new QueryTransactionRequest(this);
        } 

    } 

}
