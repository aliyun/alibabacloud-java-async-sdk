// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetViewObjectsResponse} extends {@link TeaModel}
 *
 * <p>GetViewObjectsResponse</p>
 */
public class GetViewObjectsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetViewObjectsResponseBody body;

    private GetViewObjectsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetViewObjectsResponse create() {
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
    public GetViewObjectsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetViewObjectsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetViewObjectsResponseBody body);

        @Override
        GetViewObjectsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetViewObjectsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetViewObjectsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetViewObjectsResponse response) {
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
        public Builder body(GetViewObjectsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetViewObjectsResponse build() {
            return new GetViewObjectsResponse(this);
        } 

    } 

}
