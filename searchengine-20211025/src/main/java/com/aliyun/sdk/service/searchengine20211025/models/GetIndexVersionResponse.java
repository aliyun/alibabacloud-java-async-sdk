// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIndexVersionResponse} extends {@link TeaModel}
 *
 * <p>GetIndexVersionResponse</p>
 */
public class GetIndexVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetIndexVersionResponseBody body;

    private GetIndexVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetIndexVersionResponse create() {
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
    public GetIndexVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetIndexVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetIndexVersionResponseBody body);

        @Override
        GetIndexVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetIndexVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetIndexVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetIndexVersionResponse response) {
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
        public Builder body(GetIndexVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetIndexVersionResponse build() {
            return new GetIndexVersionResponse(this);
        } 

    } 

}
