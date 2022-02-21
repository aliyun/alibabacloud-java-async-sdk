// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.httpdns20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResolveCountSummaryResponse} extends {@link TeaModel}
 *
 * <p>GetResolveCountSummaryResponse</p>
 */
public class GetResolveCountSummaryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetResolveCountSummaryResponseBody body;

    private GetResolveCountSummaryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetResolveCountSummaryResponse create() {
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
    public GetResolveCountSummaryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetResolveCountSummaryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetResolveCountSummaryResponseBody body);

        @Override
        GetResolveCountSummaryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetResolveCountSummaryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetResolveCountSummaryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetResolveCountSummaryResponse response) {
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
        public Builder body(GetResolveCountSummaryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetResolveCountSummaryResponse build() {
            return new GetResolveCountSummaryResponse(this);
        } 

    } 

}
