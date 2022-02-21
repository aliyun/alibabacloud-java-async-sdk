// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloseHttpsResponse} extends {@link TeaModel}
 *
 * <p>CloseHttpsResponse</p>
 */
public class CloseHttpsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CloseHttpsResponseBody body;

    private CloseHttpsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CloseHttpsResponse create() {
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
    public CloseHttpsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CloseHttpsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CloseHttpsResponseBody body);

        @Override
        CloseHttpsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CloseHttpsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CloseHttpsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CloseHttpsResponse response) {
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
        public Builder body(CloseHttpsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CloseHttpsResponse build() {
            return new CloseHttpsResponse(this);
        } 

    } 

}
