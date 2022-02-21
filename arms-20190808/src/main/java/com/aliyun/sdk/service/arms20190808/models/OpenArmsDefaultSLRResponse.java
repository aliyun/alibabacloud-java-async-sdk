// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenArmsDefaultSLRResponse} extends {@link TeaModel}
 *
 * <p>OpenArmsDefaultSLRResponse</p>
 */
public class OpenArmsDefaultSLRResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenArmsDefaultSLRResponseBody body;

    private OpenArmsDefaultSLRResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenArmsDefaultSLRResponse create() {
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
    public OpenArmsDefaultSLRResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenArmsDefaultSLRResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenArmsDefaultSLRResponseBody body);

        @Override
        OpenArmsDefaultSLRResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenArmsDefaultSLRResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenArmsDefaultSLRResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenArmsDefaultSLRResponse response) {
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
        public Builder body(OpenArmsDefaultSLRResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenArmsDefaultSLRResponse build() {
            return new OpenArmsDefaultSLRResponse(this);
        } 

    } 

}
