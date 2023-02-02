// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsDLQMessageGetByIdResponse} extends {@link TeaModel}
 *
 * <p>OnsDLQMessageGetByIdResponse</p>
 */
public class OnsDLQMessageGetByIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OnsDLQMessageGetByIdResponseBody body;

    private OnsDLQMessageGetByIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OnsDLQMessageGetByIdResponse create() {
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
    public OnsDLQMessageGetByIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OnsDLQMessageGetByIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OnsDLQMessageGetByIdResponseBody body);

        @Override
        OnsDLQMessageGetByIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OnsDLQMessageGetByIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OnsDLQMessageGetByIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OnsDLQMessageGetByIdResponse response) {
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
        public Builder body(OnsDLQMessageGetByIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OnsDLQMessageGetByIdResponse build() {
            return new OnsDLQMessageGetByIdResponse(this);
        } 

    } 

}
