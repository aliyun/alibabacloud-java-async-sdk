// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteSavedQueryRequest} extends {@link RequestModel}
 *
 * <p>DeleteSavedQueryRequest</p>
 */
public class DeleteSavedQueryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queryId;

    private DeleteSavedQueryRequest(Builder builder) {
        super(builder);
        this.queryId = builder.queryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSavedQueryRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteSavedQueryRequest, Builder> {
        private String queryId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSavedQueryRequest request) {
            super(request);
            this.queryId = request.queryId;
        } 

        /**
         * <p>The ID of the template.</p>
         * <p>You can call the <a href="~~ListSavedQueries~~">ListSavedQueries</a> operation to obtain the template ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sq-GeAck****</p>
         */
        public Builder queryId(String queryId) {
            this.putQueryParameter("QueryId", queryId);
            this.queryId = queryId;
            return this;
        }

        @Override
        public DeleteSavedQueryRequest build() {
            return new DeleteSavedQueryRequest(this);
        } 

    } 

}
