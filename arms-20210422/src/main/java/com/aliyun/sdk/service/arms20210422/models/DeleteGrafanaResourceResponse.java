// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGrafanaResourceResponse} extends {@link TeaModel}
 *
 * <p>DeleteGrafanaResourceResponse</p>
 */
public class DeleteGrafanaResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteGrafanaResourceResponseBody body;

    private DeleteGrafanaResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteGrafanaResourceResponse create() {
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
    public DeleteGrafanaResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteGrafanaResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteGrafanaResourceResponseBody body);

        @Override
        DeleteGrafanaResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteGrafanaResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteGrafanaResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteGrafanaResourceResponse response) {
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
        public Builder body(DeleteGrafanaResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteGrafanaResourceResponse build() {
            return new DeleteGrafanaResourceResponse(this);
        } 

    } 

}
