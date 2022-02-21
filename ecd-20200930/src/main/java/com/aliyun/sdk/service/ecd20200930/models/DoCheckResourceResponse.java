// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DoCheckResourceResponse} extends {@link TeaModel}
 *
 * <p>DoCheckResourceResponse</p>
 */
public class DoCheckResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DoCheckResourceResponseBody body;

    private DoCheckResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DoCheckResourceResponse create() {
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
    public DoCheckResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DoCheckResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DoCheckResourceResponseBody body);

        @Override
        DoCheckResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DoCheckResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DoCheckResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DoCheckResourceResponse response) {
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
        public Builder body(DoCheckResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DoCheckResourceResponse build() {
            return new DoCheckResourceResponse(this);
        } 

    } 

}
