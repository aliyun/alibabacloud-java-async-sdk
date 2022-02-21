// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDiscoveredResourceSummaryResponse} extends {@link TeaModel}
 *
 * <p>GetDiscoveredResourceSummaryResponse</p>
 */
public class GetDiscoveredResourceSummaryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDiscoveredResourceSummaryResponseBody body;

    private GetDiscoveredResourceSummaryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDiscoveredResourceSummaryResponse create() {
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
    public GetDiscoveredResourceSummaryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDiscoveredResourceSummaryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDiscoveredResourceSummaryResponseBody body);

        @Override
        GetDiscoveredResourceSummaryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDiscoveredResourceSummaryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDiscoveredResourceSummaryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDiscoveredResourceSummaryResponse response) {
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
        public Builder body(GetDiscoveredResourceSummaryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDiscoveredResourceSummaryResponse build() {
            return new GetDiscoveredResourceSummaryResponse(this);
        } 

    } 

}
