// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PreviewModelResponse} extends {@link TeaModel}
 *
 * <p>PreviewModelResponse</p>
 */
public class PreviewModelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PreviewModelResponseBody body;

    private PreviewModelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PreviewModelResponse create() {
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
    public PreviewModelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PreviewModelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PreviewModelResponseBody body);

        @Override
        PreviewModelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PreviewModelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PreviewModelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PreviewModelResponse response) {
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
        public Builder body(PreviewModelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PreviewModelResponse build() {
            return new PreviewModelResponse(this);
        } 

    } 

}
