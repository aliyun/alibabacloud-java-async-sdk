// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryHBaseHaDBRequest} extends {@link RequestModel}
 *
 * <p>QueryHBaseHaDBRequest</p>
 */
public class QueryHBaseHaDBRequest extends Request {
    @Query
    @NameInMap("BdsId")
    @Validation(required = true)
    private String bdsId;

    private QueryHBaseHaDBRequest(Builder builder) {
        super(builder);
        this.bdsId = builder.bdsId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryHBaseHaDBRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bdsId
     */
    public String getBdsId() {
        return this.bdsId;
    }

    public static final class Builder extends Request.Builder<QueryHBaseHaDBRequest, Builder> {
        private String bdsId; 

        private Builder() {
            super();
        } 

        private Builder(QueryHBaseHaDBRequest request) {
            super(request);
            this.bdsId = request.bdsId;
        } 

        /**
         * BdsId.
         */
        public Builder bdsId(String bdsId) {
            this.putQueryParameter("BdsId", bdsId);
            this.bdsId = bdsId;
            return this;
        }

        @Override
        public QueryHBaseHaDBRequest build() {
            return new QueryHBaseHaDBRequest(this);
        } 

    } 

}
