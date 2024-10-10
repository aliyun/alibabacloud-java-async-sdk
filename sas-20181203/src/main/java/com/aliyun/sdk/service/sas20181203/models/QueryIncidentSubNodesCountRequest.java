// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryIncidentSubNodesCountRequest} extends {@link RequestModel}
 *
 * <p>QueryIncidentSubNodesCountRequest</p>
 */
public class QueryIncidentSubNodesCountRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
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
         * <p>The request parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;body&quot;: {&quot;VertexIdAndTypeList&quot;: [[&quot;b17f3a9a1a6abd6a6786208492e71912&quot;, &quot;process&quot;], [&quot;58fa3749cd7ce20f7e75424070012ed9&quot;, &quot;file&quot;]]}}</p>
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
