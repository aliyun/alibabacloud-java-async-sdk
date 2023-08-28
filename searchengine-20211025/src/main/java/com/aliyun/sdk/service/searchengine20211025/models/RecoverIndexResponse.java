// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecoverIndexResponse} extends {@link TeaModel}
 *
 * <p>RecoverIndexResponse</p>
 */
public class RecoverIndexResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecoverIndexResponseBody body;

    private RecoverIndexResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecoverIndexResponse create() {
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
    public RecoverIndexResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecoverIndexResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecoverIndexResponseBody body);

        @Override
        RecoverIndexResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecoverIndexResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecoverIndexResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecoverIndexResponse response) {
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
        public Builder body(RecoverIndexResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecoverIndexResponse build() {
            return new RecoverIndexResponse(this);
        } 

    } 

}
