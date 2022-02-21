// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEdgeInstanceChannelResponse} extends {@link TeaModel}
 *
 * <p>UpdateEdgeInstanceChannelResponse</p>
 */
public class UpdateEdgeInstanceChannelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateEdgeInstanceChannelResponseBody body;

    private UpdateEdgeInstanceChannelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateEdgeInstanceChannelResponse create() {
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
    public UpdateEdgeInstanceChannelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateEdgeInstanceChannelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateEdgeInstanceChannelResponseBody body);

        @Override
        UpdateEdgeInstanceChannelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateEdgeInstanceChannelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateEdgeInstanceChannelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateEdgeInstanceChannelResponse response) {
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
        public Builder body(UpdateEdgeInstanceChannelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateEdgeInstanceChannelResponse build() {
            return new UpdateEdgeInstanceChannelResponse(this);
        } 

    } 

}
