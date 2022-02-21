// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSearchStrategyResponse} extends {@link TeaModel}
 *
 * <p>GetSearchStrategyResponse</p>
 */
public class GetSearchStrategyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSearchStrategyResponseBody body;

    private GetSearchStrategyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSearchStrategyResponse create() {
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
    public GetSearchStrategyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSearchStrategyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSearchStrategyResponseBody body);

        @Override
        GetSearchStrategyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSearchStrategyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSearchStrategyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSearchStrategyResponse response) {
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
        public Builder body(GetSearchStrategyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSearchStrategyResponse build() {
            return new GetSearchStrategyResponse(this);
        } 

    } 

}
