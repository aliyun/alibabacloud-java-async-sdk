// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLiveRecordVodConfigResponse} extends {@link TeaModel}
 *
 * <p>DeleteLiveRecordVodConfigResponse</p>
 */
public class DeleteLiveRecordVodConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteLiveRecordVodConfigResponseBody body;

    private DeleteLiveRecordVodConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteLiveRecordVodConfigResponse create() {
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
    public DeleteLiveRecordVodConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteLiveRecordVodConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteLiveRecordVodConfigResponseBody body);

        @Override
        DeleteLiveRecordVodConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteLiveRecordVodConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteLiveRecordVodConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteLiveRecordVodConfigResponse response) {
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
        public Builder body(DeleteLiveRecordVodConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteLiveRecordVodConfigResponse build() {
            return new DeleteLiveRecordVodConfigResponse(this);
        } 

    } 

}
