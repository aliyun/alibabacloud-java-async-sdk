// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.address_purification20191118.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExtractNameResponse} extends {@link TeaModel}
 *
 * <p>ExtractNameResponse</p>
 */
public class ExtractNameResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExtractNameResponseBody body;

    private ExtractNameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExtractNameResponse create() {
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
    public ExtractNameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExtractNameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExtractNameResponseBody body);

        @Override
        ExtractNameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExtractNameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExtractNameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExtractNameResponse response) {
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
        public Builder body(ExtractNameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExtractNameResponse build() {
            return new ExtractNameResponse(this);
        } 

    } 

}
