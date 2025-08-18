// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link DeleteAdvancedQueryHistoryRequest} extends {@link RequestModel}
 *
 * <p>DeleteAdvancedQueryHistoryRequest</p>
 */
public class DeleteAdvancedQueryHistoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queryId;

    private DeleteAdvancedQueryHistoryRequest(Builder builder) {
        super(builder);
        this.queryId = builder.queryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAdvancedQueryHistoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return queryId
     */
    public String getQueryId() {
        return this.queryId;
    }

    public static final class Builder extends Request.Builder<DeleteAdvancedQueryHistoryRequest, Builder> {
        private String queryId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAdvancedQueryHistoryRequest request) {
            super(request);
            this.queryId = request.queryId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>query-uIkIvLiVSuCKqg0yoa****</p>
         */
        public Builder queryId(String queryId) {
            this.putQueryParameter("QueryId", queryId);
            this.queryId = queryId;
            return this;
        }

        @Override
        public DeleteAdvancedQueryHistoryRequest build() {
            return new DeleteAdvancedQueryHistoryRequest(this);
        } 

    } 

}
