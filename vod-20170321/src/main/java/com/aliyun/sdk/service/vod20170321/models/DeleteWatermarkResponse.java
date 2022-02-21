// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWatermarkResponse} extends {@link TeaModel}
 *
 * <p>DeleteWatermarkResponse</p>
 */
public class DeleteWatermarkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteWatermarkResponseBody body;

    private DeleteWatermarkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteWatermarkResponse create() {
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
    public DeleteWatermarkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteWatermarkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteWatermarkResponseBody body);

        @Override
        DeleteWatermarkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteWatermarkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteWatermarkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteWatermarkResponse response) {
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
        public Builder body(DeleteWatermarkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteWatermarkResponse build() {
            return new DeleteWatermarkResponse(this);
        } 

    } 

}
