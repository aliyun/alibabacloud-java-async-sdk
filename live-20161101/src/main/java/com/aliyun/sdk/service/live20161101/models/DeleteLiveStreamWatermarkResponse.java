// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLiveStreamWatermarkResponse} extends {@link TeaModel}
 *
 * <p>DeleteLiveStreamWatermarkResponse</p>
 */
public class DeleteLiveStreamWatermarkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteLiveStreamWatermarkResponseBody body;

    private DeleteLiveStreamWatermarkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteLiveStreamWatermarkResponse create() {
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
    public DeleteLiveStreamWatermarkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteLiveStreamWatermarkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteLiveStreamWatermarkResponseBody body);

        @Override
        DeleteLiveStreamWatermarkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteLiveStreamWatermarkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteLiveStreamWatermarkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteLiveStreamWatermarkResponse response) {
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
        public Builder body(DeleteLiveStreamWatermarkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteLiveStreamWatermarkResponse build() {
            return new DeleteLiveStreamWatermarkResponse(this);
        } 

    } 

}
