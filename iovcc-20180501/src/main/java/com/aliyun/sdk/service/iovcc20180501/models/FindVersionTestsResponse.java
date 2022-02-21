// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindVersionTestsResponse} extends {@link TeaModel}
 *
 * <p>FindVersionTestsResponse</p>
 */
public class FindVersionTestsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FindVersionTestsResponseBody body;

    private FindVersionTestsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FindVersionTestsResponse create() {
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
    public FindVersionTestsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FindVersionTestsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FindVersionTestsResponseBody body);

        @Override
        FindVersionTestsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FindVersionTestsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FindVersionTestsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FindVersionTestsResponse response) {
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
        public Builder body(FindVersionTestsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FindVersionTestsResponse build() {
            return new FindVersionTestsResponse(this);
        } 

    } 

}
