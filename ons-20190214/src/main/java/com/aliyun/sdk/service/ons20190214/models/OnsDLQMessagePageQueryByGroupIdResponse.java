// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsDLQMessagePageQueryByGroupIdResponse} extends {@link TeaModel}
 *
 * <p>OnsDLQMessagePageQueryByGroupIdResponse</p>
 */
public class OnsDLQMessagePageQueryByGroupIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OnsDLQMessagePageQueryByGroupIdResponseBody body;

    private OnsDLQMessagePageQueryByGroupIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OnsDLQMessagePageQueryByGroupIdResponse create() {
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
    public OnsDLQMessagePageQueryByGroupIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OnsDLQMessagePageQueryByGroupIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OnsDLQMessagePageQueryByGroupIdResponseBody body);

        @Override
        OnsDLQMessagePageQueryByGroupIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OnsDLQMessagePageQueryByGroupIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OnsDLQMessagePageQueryByGroupIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OnsDLQMessagePageQueryByGroupIdResponse response) {
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
        public Builder body(OnsDLQMessagePageQueryByGroupIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OnsDLQMessagePageQueryByGroupIdResponse build() {
            return new OnsDLQMessagePageQueryByGroupIdResponse(this);
        } 

    } 

}
