// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindAxgResponse} extends {@link TeaModel}
 *
 * <p>BindAxgResponse</p>
 */
public class BindAxgResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BindAxgResponseBody body;

    private BindAxgResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BindAxgResponse create() {
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
    public BindAxgResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BindAxgResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BindAxgResponseBody body);

        @Override
        BindAxgResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BindAxgResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BindAxgResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BindAxgResponse response) {
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
        public Builder body(BindAxgResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BindAxgResponse build() {
            return new BindAxgResponse(this);
        } 

    } 

}
