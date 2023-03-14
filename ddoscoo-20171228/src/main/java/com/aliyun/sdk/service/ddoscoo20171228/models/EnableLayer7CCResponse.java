// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableLayer7CCResponse} extends {@link TeaModel}
 *
 * <p>EnableLayer7CCResponse</p>
 */
public class EnableLayer7CCResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableLayer7CCResponseBody body;

    private EnableLayer7CCResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableLayer7CCResponse create() {
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
    public EnableLayer7CCResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableLayer7CCResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableLayer7CCResponseBody body);

        @Override
        EnableLayer7CCResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableLayer7CCResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableLayer7CCResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableLayer7CCResponse response) {
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
        public Builder body(EnableLayer7CCResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableLayer7CCResponse build() {
            return new EnableLayer7CCResponse(this);
        } 

    } 

}
