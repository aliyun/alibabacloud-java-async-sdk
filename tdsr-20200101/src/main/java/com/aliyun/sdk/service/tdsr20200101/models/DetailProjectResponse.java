// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetailProjectResponse} extends {@link TeaModel}
 *
 * <p>DetailProjectResponse</p>
 */
public class DetailProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetailProjectResponseBody body;

    private DetailProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetailProjectResponse create() {
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
    public DetailProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetailProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetailProjectResponseBody body);

        @Override
        DetailProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetailProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetailProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetailProjectResponse response) {
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
        public Builder body(DetailProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetailProjectResponse build() {
            return new DetailProjectResponse(this);
        } 

    } 

}
