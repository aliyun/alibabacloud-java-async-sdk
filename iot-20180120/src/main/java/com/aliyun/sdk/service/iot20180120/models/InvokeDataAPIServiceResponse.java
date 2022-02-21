// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InvokeDataAPIServiceResponse} extends {@link TeaModel}
 *
 * <p>InvokeDataAPIServiceResponse</p>
 */
public class InvokeDataAPIServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InvokeDataAPIServiceResponseBody body;

    private InvokeDataAPIServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InvokeDataAPIServiceResponse create() {
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
    public InvokeDataAPIServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InvokeDataAPIServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InvokeDataAPIServiceResponseBody body);

        @Override
        InvokeDataAPIServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InvokeDataAPIServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InvokeDataAPIServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InvokeDataAPIServiceResponse response) {
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
        public Builder body(InvokeDataAPIServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InvokeDataAPIServiceResponse build() {
            return new InvokeDataAPIServiceResponse(this);
        } 

    } 

}
