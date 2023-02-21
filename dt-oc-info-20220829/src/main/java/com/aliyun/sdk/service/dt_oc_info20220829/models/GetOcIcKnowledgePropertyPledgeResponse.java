// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcIcKnowledgePropertyPledgeResponse} extends {@link TeaModel}
 *
 * <p>GetOcIcKnowledgePropertyPledgeResponse</p>
 */
public class GetOcIcKnowledgePropertyPledgeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcIcKnowledgePropertyPledgeResponseBody body;

    private GetOcIcKnowledgePropertyPledgeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcIcKnowledgePropertyPledgeResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public GetOcIcKnowledgePropertyPledgeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcIcKnowledgePropertyPledgeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcIcKnowledgePropertyPledgeResponseBody body);

        @Override
        GetOcIcKnowledgePropertyPledgeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcIcKnowledgePropertyPledgeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcIcKnowledgePropertyPledgeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcIcKnowledgePropertyPledgeResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(GetOcIcKnowledgePropertyPledgeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcIcKnowledgePropertyPledgeResponse build() {
            return new GetOcIcKnowledgePropertyPledgeResponse(this);
        } 

    } 

}
