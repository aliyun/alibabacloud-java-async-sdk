// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SingleSendSmsResponse} extends {@link TeaModel}
 *
 * <p>SingleSendSmsResponse</p>
 */
public class SingleSendSmsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SingleSendSmsResponseBody body;

    private SingleSendSmsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SingleSendSmsResponse create() {
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
    public SingleSendSmsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SingleSendSmsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SingleSendSmsResponseBody body);

        @Override
        SingleSendSmsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SingleSendSmsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SingleSendSmsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SingleSendSmsResponse response) {
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
        public Builder body(SingleSendSmsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SingleSendSmsResponse build() {
            return new SingleSendSmsResponse(this);
        } 

    } 

}
