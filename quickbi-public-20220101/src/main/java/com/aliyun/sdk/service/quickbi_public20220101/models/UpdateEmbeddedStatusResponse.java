// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEmbeddedStatusResponse} extends {@link TeaModel}
 *
 * <p>UpdateEmbeddedStatusResponse</p>
 */
public class UpdateEmbeddedStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateEmbeddedStatusResponseBody body;

    private UpdateEmbeddedStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateEmbeddedStatusResponse create() {
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
    public UpdateEmbeddedStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateEmbeddedStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateEmbeddedStatusResponseBody body);

        @Override
        UpdateEmbeddedStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateEmbeddedStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateEmbeddedStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateEmbeddedStatusResponse response) {
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
        public Builder body(UpdateEmbeddedStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateEmbeddedStatusResponse build() {
            return new UpdateEmbeddedStatusResponse(this);
        } 

    } 

}
