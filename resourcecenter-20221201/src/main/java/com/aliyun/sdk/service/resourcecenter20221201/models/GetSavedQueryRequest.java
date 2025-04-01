// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

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
 * {@link GetSavedQueryRequest} extends {@link RequestModel}
 *
 * <p>GetSavedQueryRequest</p>
 */
public class GetSavedQueryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queryId;

    private GetSavedQueryRequest(Builder builder) {
        super(builder);
        this.queryId = builder.queryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSavedQueryRequest create() {
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

    public static final class Builder extends Request.Builder<GetSavedQueryRequest, Builder> {
        private String queryId; 

        private Builder() {
            super();
        } 

        private Builder(GetSavedQueryRequest request) {
            super(request);
            this.queryId = request.queryId;
        } 

        /**
         * <p>The template ID.</p>
         * <blockquote>
         * <p> You can call the <a href="~~ListSavedQueries~~">ListSavedQueries</a> operation to query the ID.</p>
         * </blockquote>
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
        public GetSavedQueryRequest build() {
            return new GetSavedQueryRequest(this);
        } 

    } 

}
