// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAdvanceConfigResponse} extends {@link TeaModel}
 *
 * <p>GetAdvanceConfigResponse</p>
 */
public class GetAdvanceConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAdvanceConfigResponseBody body;

    private GetAdvanceConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAdvanceConfigResponse create() {
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
    public GetAdvanceConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAdvanceConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAdvanceConfigResponseBody body);

        @Override
        GetAdvanceConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAdvanceConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAdvanceConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAdvanceConfigResponse response) {
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
        public Builder body(GetAdvanceConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAdvanceConfigResponse build() {
            return new GetAdvanceConfigResponse(this);
        } 

    } 

}
