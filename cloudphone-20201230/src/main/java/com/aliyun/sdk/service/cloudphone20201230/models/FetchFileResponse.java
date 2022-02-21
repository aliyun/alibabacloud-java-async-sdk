// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudphone20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FetchFileResponse} extends {@link TeaModel}
 *
 * <p>FetchFileResponse</p>
 */
public class FetchFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FetchFileResponseBody body;

    private FetchFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FetchFileResponse create() {
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
    public FetchFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FetchFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FetchFileResponseBody body);

        @Override
        FetchFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FetchFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FetchFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FetchFileResponse response) {
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
        public Builder body(FetchFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FetchFileResponse build() {
            return new FetchFileResponse(this);
        } 

    } 

}
