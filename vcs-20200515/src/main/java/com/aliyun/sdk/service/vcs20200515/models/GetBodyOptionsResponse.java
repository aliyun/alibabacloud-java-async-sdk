// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBodyOptionsResponse} extends {@link TeaModel}
 *
 * <p>GetBodyOptionsResponse</p>
 */
public class GetBodyOptionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBodyOptionsResponseBody body;

    private GetBodyOptionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBodyOptionsResponse create() {
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
    public GetBodyOptionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBodyOptionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBodyOptionsResponseBody body);

        @Override
        GetBodyOptionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBodyOptionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBodyOptionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBodyOptionsResponse response) {
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
        public Builder body(GetBodyOptionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBodyOptionsResponse build() {
            return new GetBodyOptionsResponse(this);
        } 

    } 

}
