// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVodSpecificConfigResponse} extends {@link TeaModel}
 *
 * <p>DeleteVodSpecificConfigResponse</p>
 */
public class DeleteVodSpecificConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteVodSpecificConfigResponseBody body;

    private DeleteVodSpecificConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteVodSpecificConfigResponse create() {
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
    public DeleteVodSpecificConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteVodSpecificConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteVodSpecificConfigResponseBody body);

        @Override
        DeleteVodSpecificConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteVodSpecificConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteVodSpecificConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteVodSpecificConfigResponse response) {
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
        public Builder body(DeleteVodSpecificConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteVodSpecificConfigResponse build() {
            return new DeleteVodSpecificConfigResponse(this);
        } 

    } 

}
