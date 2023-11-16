// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryIncidentSubNodesCountRequest} extends {@link RequestModel}
 *
 * <p>QueryIncidentSubNodesCountRequest</p>
 */
public class QueryIncidentSubNodesCountRequest extends Request {
    @Body
    @NameInMap("body")
    private String body;

    private QueryIncidentSubNodesCountRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryIncidentSubNodesCountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<QueryIncidentSubNodesCountRequest, Builder> {
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(QueryIncidentSubNodesCountRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * The request parameters.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public QueryIncidentSubNodesCountRequest build() {
            return new QueryIncidentSubNodesCountRequest(this);
        } 

    } 

}
