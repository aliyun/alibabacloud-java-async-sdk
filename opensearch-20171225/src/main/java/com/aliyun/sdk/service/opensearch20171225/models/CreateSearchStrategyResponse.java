// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSearchStrategyResponse} extends {@link TeaModel}
 *
 * <p>CreateSearchStrategyResponse</p>
 */
public class CreateSearchStrategyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSearchStrategyResponseBody body;

    private CreateSearchStrategyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSearchStrategyResponse create() {
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
    public CreateSearchStrategyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSearchStrategyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSearchStrategyResponseBody body);

        @Override
        CreateSearchStrategyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSearchStrategyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSearchStrategyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSearchStrategyResponse response) {
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
        public Builder body(CreateSearchStrategyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSearchStrategyResponse build() {
            return new CreateSearchStrategyResponse(this);
        } 

    } 

}
