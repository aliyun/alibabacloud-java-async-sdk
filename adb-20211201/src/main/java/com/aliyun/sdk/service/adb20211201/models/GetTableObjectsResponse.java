// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTableObjectsResponse} extends {@link TeaModel}
 *
 * <p>GetTableObjectsResponse</p>
 */
public class GetTableObjectsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTableObjectsResponseBody body;

    private GetTableObjectsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTableObjectsResponse create() {
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
    public GetTableObjectsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTableObjectsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTableObjectsResponseBody body);

        @Override
        GetTableObjectsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTableObjectsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTableObjectsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTableObjectsResponse response) {
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
        public Builder body(GetTableObjectsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTableObjectsResponse build() {
            return new GetTableObjectsResponse(this);
        } 

    } 

}
