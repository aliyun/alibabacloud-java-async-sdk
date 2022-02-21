// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckResourceResponse} extends {@link TeaModel}
 *
 * <p>CheckResourceResponse</p>
 */
public class CheckResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckResourceResponseBody body;

    private CheckResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckResourceResponse create() {
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
    public CheckResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckResourceResponseBody body);

        @Override
        CheckResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckResourceResponse response) {
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
        public Builder body(CheckResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckResourceResponse build() {
            return new CheckResourceResponse(this);
        } 

    } 

}
