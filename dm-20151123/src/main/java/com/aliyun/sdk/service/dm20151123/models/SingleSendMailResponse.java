// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SingleSendMailResponse} extends {@link TeaModel}
 *
 * <p>SingleSendMailResponse</p>
 */
public class SingleSendMailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SingleSendMailResponseBody body;

    private SingleSendMailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SingleSendMailResponse create() {
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
    public SingleSendMailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SingleSendMailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SingleSendMailResponseBody body);

        @Override
        SingleSendMailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SingleSendMailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SingleSendMailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SingleSendMailResponse response) {
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
        public Builder body(SingleSendMailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SingleSendMailResponse build() {
            return new SingleSendMailResponse(this);
        } 

    } 

}
