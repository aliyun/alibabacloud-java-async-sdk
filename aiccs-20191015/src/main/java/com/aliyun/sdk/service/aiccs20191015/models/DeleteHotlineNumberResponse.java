// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHotlineNumberResponse} extends {@link TeaModel}
 *
 * <p>DeleteHotlineNumberResponse</p>
 */
public class DeleteHotlineNumberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteHotlineNumberResponseBody body;

    private DeleteHotlineNumberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteHotlineNumberResponse create() {
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
    public DeleteHotlineNumberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteHotlineNumberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteHotlineNumberResponseBody body);

        @Override
        DeleteHotlineNumberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteHotlineNumberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteHotlineNumberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteHotlineNumberResponse response) {
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
        public Builder body(DeleteHotlineNumberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteHotlineNumberResponse build() {
            return new DeleteHotlineNumberResponse(this);
        } 

    } 

}
