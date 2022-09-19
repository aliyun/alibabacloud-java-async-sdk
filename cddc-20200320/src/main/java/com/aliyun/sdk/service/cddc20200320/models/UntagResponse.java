// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UntagResponse} extends {@link TeaModel}
 *
 * <p>UntagResponse</p>
 */
public class UntagResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UntagResponseBody body;

    private UntagResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UntagResponse create() {
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
    public UntagResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UntagResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UntagResponseBody body);

        @Override
        UntagResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UntagResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UntagResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UntagResponse response) {
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
        public Builder body(UntagResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UntagResponse build() {
            return new UntagResponse(this);
        } 

    } 

}
