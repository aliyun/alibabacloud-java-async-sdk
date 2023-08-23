// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCartoonResponse} extends {@link TeaModel}
 *
 * <p>GetCartoonResponse</p>
 */
public class GetCartoonResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCartoonResponseBody body;

    private GetCartoonResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCartoonResponse create() {
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
    public GetCartoonResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCartoonResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCartoonResponseBody body);

        @Override
        GetCartoonResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCartoonResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCartoonResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCartoonResponse response) {
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
        public Builder body(GetCartoonResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCartoonResponse build() {
            return new GetCartoonResponse(this);
        } 

    } 

}
