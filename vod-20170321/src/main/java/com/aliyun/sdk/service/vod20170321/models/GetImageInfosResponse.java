// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetImageInfosResponse} extends {@link TeaModel}
 *
 * <p>GetImageInfosResponse</p>
 */
public class GetImageInfosResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetImageInfosResponseBody body;

    private GetImageInfosResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetImageInfosResponse create() {
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
    public GetImageInfosResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetImageInfosResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetImageInfosResponseBody body);

        @Override
        GetImageInfosResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetImageInfosResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetImageInfosResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetImageInfosResponse response) {
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
        public Builder body(GetImageInfosResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetImageInfosResponse build() {
            return new GetImageInfosResponse(this);
        } 

    } 

}
