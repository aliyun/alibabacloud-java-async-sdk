// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIndexResponse} extends {@link TeaModel}
 *
 * <p>GetIndexResponse</p>
 */
public class GetIndexResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetIndexResponseBody body;

    private GetIndexResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetIndexResponse create() {
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
    public GetIndexResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetIndexResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetIndexResponseBody body);

        @Override
        GetIndexResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetIndexResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetIndexResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetIndexResponse response) {
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
        public Builder body(GetIndexResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetIndexResponse build() {
            return new GetIndexResponse(this);
        } 

    } 

}
