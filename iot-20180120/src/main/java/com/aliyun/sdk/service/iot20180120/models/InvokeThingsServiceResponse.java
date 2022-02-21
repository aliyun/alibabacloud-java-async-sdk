// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InvokeThingsServiceResponse} extends {@link TeaModel}
 *
 * <p>InvokeThingsServiceResponse</p>
 */
public class InvokeThingsServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InvokeThingsServiceResponseBody body;

    private InvokeThingsServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InvokeThingsServiceResponse create() {
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
    public InvokeThingsServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InvokeThingsServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InvokeThingsServiceResponseBody body);

        @Override
        InvokeThingsServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InvokeThingsServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InvokeThingsServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InvokeThingsServiceResponse response) {
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
        public Builder body(InvokeThingsServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InvokeThingsServiceResponse build() {
            return new InvokeThingsServiceResponse(this);
        } 

    } 

}
