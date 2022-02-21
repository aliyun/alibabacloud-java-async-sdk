// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUpstreamAppServerResponse} extends {@link TeaModel}
 *
 * <p>UpdateUpstreamAppServerResponse</p>
 */
public class UpdateUpstreamAppServerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateUpstreamAppServerResponseBody body;

    private UpdateUpstreamAppServerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateUpstreamAppServerResponse create() {
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
    public UpdateUpstreamAppServerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateUpstreamAppServerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateUpstreamAppServerResponseBody body);

        @Override
        UpdateUpstreamAppServerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateUpstreamAppServerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateUpstreamAppServerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateUpstreamAppServerResponse response) {
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
        public Builder body(UpdateUpstreamAppServerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateUpstreamAppServerResponse build() {
            return new UpdateUpstreamAppServerResponse(this);
        } 

    } 

}
