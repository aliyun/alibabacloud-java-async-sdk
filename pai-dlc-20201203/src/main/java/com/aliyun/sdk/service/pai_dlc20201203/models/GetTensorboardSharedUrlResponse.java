// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTensorboardSharedUrlResponse} extends {@link TeaModel}
 *
 * <p>GetTensorboardSharedUrlResponse</p>
 */
public class GetTensorboardSharedUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTensorboardSharedUrlResponseBody body;

    private GetTensorboardSharedUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTensorboardSharedUrlResponse create() {
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
    public GetTensorboardSharedUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTensorboardSharedUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTensorboardSharedUrlResponseBody body);

        @Override
        GetTensorboardSharedUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTensorboardSharedUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTensorboardSharedUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTensorboardSharedUrlResponse response) {
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
        public Builder body(GetTensorboardSharedUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTensorboardSharedUrlResponse build() {
            return new GetTensorboardSharedUrlResponse(this);
        } 

    } 

}
