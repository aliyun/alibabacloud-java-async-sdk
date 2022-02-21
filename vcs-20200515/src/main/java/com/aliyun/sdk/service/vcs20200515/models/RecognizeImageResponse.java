// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeImageResponse} extends {@link TeaModel}
 *
 * <p>RecognizeImageResponse</p>
 */
public class RecognizeImageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeImageResponseBody body;

    private RecognizeImageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeImageResponse create() {
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
    public RecognizeImageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeImageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeImageResponseBody body);

        @Override
        RecognizeImageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeImageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeImageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeImageResponse response) {
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
        public Builder body(RecognizeImageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeImageResponse build() {
            return new RecognizeImageResponse(this);
        } 

    } 

}
