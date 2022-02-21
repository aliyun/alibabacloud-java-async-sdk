// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CountProjectsResponse} extends {@link TeaModel}
 *
 * <p>CountProjectsResponse</p>
 */
public class CountProjectsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CountProjectsResponseBody body;

    private CountProjectsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CountProjectsResponse create() {
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
    public CountProjectsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CountProjectsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CountProjectsResponseBody body);

        @Override
        CountProjectsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CountProjectsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CountProjectsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CountProjectsResponse response) {
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
        public Builder body(CountProjectsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CountProjectsResponse build() {
            return new CountProjectsResponse(this);
        } 

    } 

}
