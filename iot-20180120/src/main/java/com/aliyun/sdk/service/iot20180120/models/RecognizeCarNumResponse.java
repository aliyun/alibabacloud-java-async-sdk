// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeCarNumResponse} extends {@link TeaModel}
 *
 * <p>RecognizeCarNumResponse</p>
 */
public class RecognizeCarNumResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeCarNumResponseBody body;

    private RecognizeCarNumResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeCarNumResponse create() {
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
    public RecognizeCarNumResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeCarNumResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeCarNumResponseBody body);

        @Override
        RecognizeCarNumResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeCarNumResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeCarNumResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeCarNumResponse response) {
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
        public Builder body(RecognizeCarNumResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeCarNumResponse build() {
            return new RecognizeCarNumResponse(this);
        } 

    } 

}
