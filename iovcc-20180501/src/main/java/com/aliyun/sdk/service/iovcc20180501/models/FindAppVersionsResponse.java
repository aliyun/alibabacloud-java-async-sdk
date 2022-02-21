// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindAppVersionsResponse} extends {@link TeaModel}
 *
 * <p>FindAppVersionsResponse</p>
 */
public class FindAppVersionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FindAppVersionsResponseBody body;

    private FindAppVersionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FindAppVersionsResponse create() {
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
    public FindAppVersionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FindAppVersionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FindAppVersionsResponseBody body);

        @Override
        FindAppVersionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FindAppVersionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FindAppVersionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FindAppVersionsResponse response) {
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
        public Builder body(FindAppVersionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FindAppVersionsResponse build() {
            return new FindAppVersionsResponse(this);
        } 

    } 

}
