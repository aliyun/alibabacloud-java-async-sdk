// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsDLQMessageResendByIdResponse} extends {@link TeaModel}
 *
 * <p>OnsDLQMessageResendByIdResponse</p>
 */
public class OnsDLQMessageResendByIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OnsDLQMessageResendByIdResponseBody body;

    private OnsDLQMessageResendByIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OnsDLQMessageResendByIdResponse create() {
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
    public OnsDLQMessageResendByIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OnsDLQMessageResendByIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OnsDLQMessageResendByIdResponseBody body);

        @Override
        OnsDLQMessageResendByIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OnsDLQMessageResendByIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OnsDLQMessageResendByIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OnsDLQMessageResendByIdResponse response) {
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
        public Builder body(OnsDLQMessageResendByIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OnsDLQMessageResendByIdResponse build() {
            return new OnsDLQMessageResendByIdResponse(this);
        } 

    } 

}
