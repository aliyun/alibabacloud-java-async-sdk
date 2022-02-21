// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAppInfosResponse} extends {@link TeaModel}
 *
 * <p>GetAppInfosResponse</p>
 */
public class GetAppInfosResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAppInfosResponseBody body;

    private GetAppInfosResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAppInfosResponse create() {
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
    public GetAppInfosResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAppInfosResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAppInfosResponseBody body);

        @Override
        GetAppInfosResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAppInfosResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAppInfosResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAppInfosResponse response) {
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
        public Builder body(GetAppInfosResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAppInfosResponse build() {
            return new GetAppInfosResponse(this);
        } 

    } 

}
