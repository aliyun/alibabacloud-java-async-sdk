// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMediaInfoResponse} extends {@link TeaModel}
 *
 * <p>DeleteMediaInfoResponse</p>
 */
public class DeleteMediaInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMediaInfoResponseBody body;

    private DeleteMediaInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMediaInfoResponse create() {
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
    public DeleteMediaInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMediaInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMediaInfoResponseBody body);

        @Override
        DeleteMediaInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMediaInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMediaInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMediaInfoResponse response) {
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
        public Builder body(DeleteMediaInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMediaInfoResponse build() {
            return new DeleteMediaInfoResponse(this);
        } 

    } 

}
