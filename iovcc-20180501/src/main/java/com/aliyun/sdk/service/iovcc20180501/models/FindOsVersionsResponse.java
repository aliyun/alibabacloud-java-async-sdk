// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindOsVersionsResponse} extends {@link TeaModel}
 *
 * <p>FindOsVersionsResponse</p>
 */
public class FindOsVersionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FindOsVersionsResponseBody body;

    private FindOsVersionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FindOsVersionsResponse create() {
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
    public FindOsVersionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FindOsVersionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FindOsVersionsResponseBody body);

        @Override
        FindOsVersionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FindOsVersionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FindOsVersionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FindOsVersionsResponse response) {
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
        public Builder body(FindOsVersionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FindOsVersionsResponse build() {
            return new FindOsVersionsResponse(this);
        } 

    } 

}
